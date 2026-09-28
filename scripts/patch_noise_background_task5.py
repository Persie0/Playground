from pathlib import Path

p = Path('lib/screens/home_screen.dart')
s = p.read_text()


def replace_once(source: str, old: str, new: str, label: str) -> str:
    count = source.count(old)
    if count != 1:
        raise SystemExit(f'{label}: expected one match, got {count}')
    return source.replace(old, new, 1)


base_import = "import '../services/background_processing_task.dart';\n"
if "import '../services/android_media_processing_service.dart';" not in s:
    s = replace_once(
        s,
        base_import,
        base_import
        + "import '../services/android_media_processing_service.dart';\n"
        + "import '../services/background_processing_recovery.dart';\n",
        'service imports',
    )

startup = '''    if (savedJob != null && mounted) {
      var recoveryJob = savedJob;

      void scheduleRecoveryPrompt(Map<String, dynamic> job) {
        WidgetsBinding.instance.addPostFrameCallback((_) {
          if (!mounted) return;
          unawaited(
            _promptSavedJobRecovery(job).catchError((
              Object error,
              StackTrace stackTrace,
            ) async {
              debugPrint('Saved-job recovery prompt failed: $error');
              await Sentry.captureException(error, stackTrace: stackTrace);
            }),
          );
        });
      }

      if (recoveryJob['type'] == 'short') {
        final jobId = recoveryJob['jobId'] as String?;
        var foregroundOwnsJob = false;
        if (Platform.isAndroid &&
            recoveryJob['status'] == 'inProgress' &&
            jobId != null) {
          foregroundOwnsJob = await AndroidMediaProcessingService.instance
              .isRunningForJob(jobId);
          final latest = await _processingLock.loadJobState();
          if (latest != null && latest['jobId'] == jobId) {
            recoveryJob = latest;
          }
        }

        final recoveryAction = resolveShortJobRecovery(
          savedJob: recoveryJob,
          foregroundOwnsJob: foregroundOwnsJob,
        );
        switch (recoveryAction) {
          case ShortJobRecoveryAction.reattach:
            WidgetsBinding.instance.addPostFrameCallback((_) {
              if (!mounted) return;
              unawaited(
                _reattachShortForegroundJob(recoveryJob).catchError((
                  Object error,
                  StackTrace stackTrace,
                ) async {
                  debugPrint('Foreground job reattach failed: $error');
                  await Sentry.captureException(
                    error,
                    stackTrace: stackTrace,
                  );
                }),
              );
            });
            break;
          case ShortJobRecoveryAction.markInterrupted:
            recoveryJob = {...recoveryJob, 'status': 'interrupted'};
            await _processingLock.saveJobState(recoveryJob);
            scheduleRecoveryPrompt(recoveryJob);
            break;
          case ShortJobRecoveryAction.resumeFinalization:
            final finalizationState = {
              ...recoveryJob,
              'status': 'finalizing',
            };
            await _processingLock.saveJobState(finalizationState);
            WidgetsBinding.instance.addPostFrameCallback((_) {
              if (!mounted) return;
              unawaited(
                _resumeShortFinalization(finalizationState).catchError((
                  Object error,
                  StackTrace stackTrace,
                ) async {
                  debugPrint('Foreground finalization recovery failed: $error');
                  await Sentry.captureException(
                    error,
                    stackTrace: stackTrace,
                  );
                }),
              );
            });
            break;
          case ShortJobRecoveryAction.promptExistingRecovery:
            scheduleRecoveryPrompt(recoveryJob);
            break;
        }
      } else {
        if (recoveryJob['status'] == 'inProgress') {
          recoveryJob = {...recoveryJob, 'status': 'interrupted'};
          await _processingLock.saveJobState(recoveryJob);
        }
        scheduleRecoveryPrompt(recoveryJob);
      }
    }
'''
if '_reattachShortForegroundJob(recoveryJob)' not in s:
    start = s.find("    if (savedJob != null && mounted) {")
    end_marker = "\n  }\n\n  Future<void> _promptSavedJobRecovery"
    end = s.find(end_marker, start)
    if start < 0 or end < 0:
        raise SystemExit('startup recovery block not found')
    s = s[:start] + startup + s[end:]

method = '''  Future<void> _reattachShortForegroundJob(
    Map<String, dynamic> savedJob,
  ) async {
    final filePath = savedJob['filePath'] as String?;
    if (filePath == null || filePath.isEmpty) {
      await _processingLock.clearJobState();
      return;
    }
    await _processFile(
      filePath,
      wasResumed: true,
      foregroundReattach: true,
    );
  }

'''
method_marker = '  Future<void> _promptSavedJobRecovery(Map<String, dynamic> savedJob) async {'
if 'Future<void> _reattachShortForegroundJob(' not in s:
    s = replace_once(s, method_marker, method + method_marker, 'reattach method')

process_start = s.find('  Future<void> _processFile(')
if process_start < 0:
    raise SystemExit('short process method not found')
head, tail = s[:process_start], s[process_start:]

if 'bool foregroundReattach = false,' not in tail:
    sig_anchor = '    bool wasResumed = false,\n'
    tail = replace_once(
        tail,
        sig_anchor,
        sig_anchor + '    bool foregroundReattach = false,\n',
        'process signature',
    )

if 'if (!foregroundReattach) {' not in tail:
    anchor_pos = tail.find('recoveryState = payload;')
    worker_pos = tail.find('workerFuture = runProcessingTask(', anchor_pos)
    if anchor_pos < 0 or worker_pos < 0:
        raise SystemExit('foreground lock handoff markers not found')
    line_start = tail.rfind('\n', 0, anchor_pos) + 1
    worker_line_start = tail.rfind('\n', 0, worker_pos) + 1
    indent = tail[line_start:anchor_pos]
    segment = tail[line_start:worker_line_start]
    if '_processingLock.start(jobId: shortJobId, payload: payload)' not in segment:
        raise SystemExit('foreground lock handoff segment changed unexpectedly')
    replacement = (
        f'{indent}recoveryState = payload;\n'
        f'{indent}if (!foregroundReattach) {{\n'
        f'{indent}  await _processingLock.start(jobId: shortJobId, payload: payload);\n'
        f'{indent}  processingLockStarted = true;\n'
        f'{indent}}}\n\n'
    )
    tail = tail[:line_start] + replacement + tail[worker_line_start:]

short_cancel = tail.find('messageNotifier?.value = l10n.cancel;')
if short_cancel < 0:
    raise SystemExit('short cancel message marker not found')
token_cancel = tail.find('unawaited(cancellationToken.cancel());', short_cancel)
if token_cancel < 0:
    raise SystemExit('short cancellation token marker not found')
between = tail[short_cancel:token_cancel]
if 'AndroidMediaProcessingService.instance.cancel()' not in between:
    token_line_start = tail.rfind('\n', 0, token_cancel) + 1
    indent = tail[token_line_start:token_cancel]
    insertion = (
        f'{indent}if (Platform.isAndroid) {{\n'
        f'{indent}  await AndroidMediaProcessingService.instance.cancel();\n'
        f'{indent}}}\n'
    )
    tail = tail[:token_line_start] + insertion + tail[token_line_start:]

# The ProcessingScreen builder shadows State.context. Since the service cancel
# above is awaited, check that builder BuildContext directly before navigation.
cancel_nav = tail.find('Navigator.pop(context);', short_cancel)
if cancel_nav < 0:
    raise SystemExit('short cancel navigation marker not found')
condition_start = tail.rfind('if (', short_cancel, cancel_nav)
condition_end = tail.find('{', condition_start, cancel_nav)
if condition_start < 0 or condition_end < 0:
    raise SystemExit('short cancel navigation condition not found')
condition = tail[condition_start:condition_end]
if 'mounted && processingScreenPushed' in condition and 'context.mounted' not in condition:
    tail = (
        tail[:condition_start]
        + condition.replace('mounted && processingScreenPushed', 'context.mounted && processingScreenPushed')
        + tail[condition_end:]
    )

if 'if (isCancelled && foregroundReattach)' not in tail:
    catch_pos = tail.find("debugPrint('EXCEPTION in _processFile")
    cancelled_pos = tail.find('if (isCancelled || !mounted) {', catch_pos)
    if catch_pos < 0 or cancelled_pos < 0:
        raise SystemExit('short catch cancellation marker not found')
    line_end = tail.find('\n', cancelled_pos)
    indent = tail[tail.rfind('\n', 0, cancelled_pos) + 1:cancelled_pos]
    insertion = (
        f'\n{indent}  if (isCancelled && foregroundReattach) {{\n'
        f'{indent}    await _processingLock.clearJobState();\n'
        f'{indent}  }}'
    )
    tail = tail[:line_end] + insertion + tail[line_end:]

s = head + tail
p.write_text(s)
