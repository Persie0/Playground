from pathlib import Path


def replace_once(path: str, old: str, new: str, label: str) -> None:
    p = Path(path)
    s = p.read_text()
    count = s.count(old)
    if count != 1:
        raise SystemExit(f"{label}: expected 1 match, found {count}")
    p.write_text(s.replace(old, new, 1))


# RevenueCat: transient store/network states and pending/already-owned purchases
# are expected external states, not application crashes.
path = "lib/services/subscription_service.dart"
p = Path(path)
s = p.read_text()
old = """        } catch (error, stackTrace) {
          // The store state is unresolved. Keep the still-valid local cache and
          // retry on a later launch/resume instead of incorrectly removing Pro.
          debugPrint('Could not reconcile cached Google Play purchase: $error');
          if (error is! PlatformException || !shouldIgnoreError(error)) {
            Sentry.captureException(error, stackTrace: stackTrace);
          }
          return;
        }
"""
new = """        } catch (error, stackTrace) {
          // The store state is unresolved. Keep the still-valid local cache and
          // retry on a later launch/resume instead of incorrectly removing Pro.
          debugPrint('Could not reconcile cached Google Play purchase: $error');
          if (error is! TimeoutException &&
              (error is! PlatformException || !shouldIgnoreError(error))) {
            Sentry.captureException(error, stackTrace: stackTrace);
          }
          return;
        }
"""
if s.count(old) != 1:
    raise SystemExit("reconcile catch not found")
s = s.replace(old, new, 1)

old = """      await _updateProStatus(customerInfo);
    } on PlatformException catch (e, stackTrace) {
      debugPrint('Error getting customer info: $e');
      if (!shouldIgnoreError(e)) {
        Sentry.captureException(e, stackTrace: stackTrace);
      }
      if (_isTransientNetworkError(e)) rethrow;
    }
"""
new = """      await _updateProStatus(customerInfo);
    } on TimeoutException catch (e) {
      // Startup has a persisted entitlement snapshot. A slow store/network
      // refresh is retryable and should not be reported as an app crash.
      debugPrint('RevenueCat customer-info refresh timed out: $e');
    } on PlatformException catch (e, stackTrace) {
      debugPrint('Error getting customer info: $e');
      if (!shouldIgnoreError(e)) {
        Sentry.captureException(e, stackTrace: stackTrace);
      }
      if (_isTransientNetworkError(e)) rethrow;
    }
"""
if s.count(old) != 1:
    raise SystemExit("customer-info catch not found")
s = s.replace(old, new, 1)

old = """  bool shouldIgnoreError(PlatformException e) {
    // Code 1 is User Cancelled, Code 10 is common for network errors in RevenueCat
    final codeStr = e.code.toString();
    final message = e.message?.toLowerCase() ?? '';

    final isNetworkError = _isTransientNetworkError(e);

    final isUserCancelled =
        codeStr == '1' ||
        message.contains('purchase was cancelled') ||
        message.contains('purchase_cancelled') ||
        message.contains('user cancelled') ||
        (e.details is Map &&
            (e.details['userCancelled'] == true ||
                e.details['readableErrorCode'] == 'PURCHASE_CANCELLED'));

    final isBillingUnavailable = isPurchaseNotAllowedError(e);

    return isNetworkError || isUserCancelled || isBillingUnavailable;
  }
"""
new = """  bool shouldIgnoreError(PlatformException e) {
    // Expected store/user states must not inflate crash reporting.
    final codeStr = e.code.toString();
    final message = e.message?.toLowerCase() ?? '';
    final details = e.details;

    PurchasesErrorCode? revenueCatCode;
    try {
      revenueCatCode = PurchasesErrorHelper.getErrorCode(e);
    } catch (_) {
      // Fall back to the cross-version string/details checks below.
    }

    final isNetworkError = _isTransientNetworkError(e);

    final isUserCancelled =
        codeStr == '1' ||
        message.contains('purchase was cancelled') ||
        message.contains('purchase_cancelled') ||
        message.contains('user cancelled') ||
        (details is Map &&
            (details['userCancelled'] == true ||
                details['readableErrorCode'] == 'PURCHASE_CANCELLED'));

    final isPaymentPending =
        revenueCatCode == PurchasesErrorCode.paymentPendingError ||
        message.contains('payment is pending') ||
        message.contains('payment pending') ||
        (details is Map &&
            (details['readableErrorCode'] == 'PaymentPendingError' ||
                details['readable_error_code'] == 'PaymentPendingError'));

    final isAlreadyPurchased =
        revenueCatCode == PurchasesErrorCode.productAlreadyPurchasedError ||
        message.contains('already purchased') ||
        message.contains('already own') ||
        message.contains('item_already_owned') ||
        (details is Map &&
            (details['readableErrorCode'] == 'ProductAlreadyPurchasedError' ||
                details['readable_error_code'] ==
                    'ProductAlreadyPurchasedError'));

    final isBillingUnavailable = isPurchaseNotAllowedError(e);

    return isNetworkError ||
        isUserCancelled ||
        isPaymentPending ||
        isAlreadyPurchased ||
        isBillingUnavailable;
  }
"""
if s.count(old) != 1:
    raise SystemExit("shouldIgnoreError not found")
s = s.replace(old, new, 1)

old = """    } catch (e, stackTrace) {
      debugPrint('Error showing customer center: $e');
      if (e is! PlatformException || !shouldIgnoreError(e)) {
        Sentry.captureException(e, stackTrace: stackTrace);
      }
      rethrow;
    }
"""
new = """    } catch (e, stackTrace) {
      debugPrint('Error showing customer center: $e');
      if (e is! TimeoutException &&
          (e is! PlatformException || !shouldIgnoreError(e))) {
        Sentry.captureException(e, stackTrace: stackTrace);
      }
      rethrow;
    }
"""
if s.count(old) != 1:
    raise SystemExit("customer center catch not found")
s = s.replace(old, new, 1)
p.write_text(s)


# Paywall: pending/timeouts still get user-visible retry guidance but are not
# Sentry exceptions.
path = "lib/screens/paywall_screen.dart"
p = Path(path)
s = p.read_text()
old = """      bool shouldIgnore = false;
      bool isRestricted = false;
      if (e is PlatformException) {
        shouldIgnore = SubscriptionService.instance.shouldIgnoreError(e);
        isRestricted = SubscriptionService.instance.isPurchaseNotAllowedError(
          e,
        );
      }

      if (!shouldIgnore) {
        Sentry.captureException(e, stackTrace: stackTrace);
      }
"""
new = """      bool shouldIgnore = e is TimeoutException;
      bool isRestricted = false;
      if (e is PlatformException) {
        shouldIgnore = SubscriptionService.instance.shouldIgnoreError(e);
        isRestricted = SubscriptionService.instance.isPurchaseNotAllowedError(
          e,
        );
      }

      if (!shouldIgnore) {
        Sentry.captureException(e, stackTrace: stackTrace);
      }
"""
count = s.count(old)
if count < 1:
    raise SystemExit(f"expected at least 1 paywall ignore block, found {count}")
s = s.replace(old, new)
old = """      Sentry.captureException(e, stackTrace: stackTrace);
    } catch (e, stackTrace) {
      debugPrint('Error purchasing: $e');
"""
new = """      // Timeout is already represented to the user as a pending store state.
    } catch (e, stackTrace) {
      debugPrint('Error purchasing: $e');
"""
if s.count(old) != 1:
    raise SystemExit("purchase timeout Sentry capture not found")
s = s.replace(old, new, 1)
p.write_text(s)


# Appodeal initialization callback can contain per-network diagnostics even when
# the requested ad type initialized successfully. Verify actual SDK state before
# deciding startup failed.
path = "lib/services/ad_service.dart"
p = Path(path)
s = p.read_text()
old = '''    final initializationCompleter = Completer<void>();
    Appodeal.initialize(
      appKey: _appKey,
      adTypes: [AppodealAdType.Interstitial],
      onInitializationFinished: (errors) {
        if (errors == null || errors.isEmpty) {
          _isInitialized = true;
          debugPrint("Appodeal initialized successfully");
          if (!initializationCompleter.isCompleted) {
            initializationCompleter.complete();
          }
          return;
        }

        for (final error in errors) {
          final errorStr = error.toString();
          final errorType = error.runtimeType.toString();

          String? description;
          try {
            description = (error as dynamic).description?.toString();
          } catch (_) {}

          debugPrint(
            "Appodeal Initialization Error:"
            "\\nType: $errorType"
            "\\nDescription: $description"
            "\\nRaw: $errorStr",
          );

          // Suppress Sentry capture for configuration/internal initialization errors
          final descriptionLower = description?.toLowerCase() ?? '';
          final errorStrLower = errorStr.toLowerCase();
          final shouldIgnore =
              errorType == 'cWa' ||
              descriptionLower.contains('sdkconfigurationerror') ||
              descriptionLower.contains('internalerror') ||
              errorStrLower.contains('sdkconfigurationerror');

          if (kReleaseMode && !shouldIgnore) {
            unawaited(
              Sentry.captureMessage(
                "Appodeal Init Error | type=$errorType | description=$description | raw=$errorStr",
                level: SentryLevel.warning,
              ),
            );
          }
        }
        if (!initializationCompleter.isCompleted) {
          initializationCompleter.completeError(
            StateError('Appodeal initialization reported errors'),
          );
        }
      },
    );
    await initializationCompleter.future.timeout(const Duration(seconds: 15));
'''
new = '''    final initializationCompleter = Completer<void>();
    final initializationDiagnostics = <String>[];
    Appodeal.initialize(
      appKey: _appKey,
      adTypes: [AppodealAdType.Interstitial],
      onInitializationFinished: (errors) {
        if (errors != null) {
          for (final error in errors) {
            final errorStr = error.toString();
            final errorType = error.runtimeType.toString();
            String? description;
            try {
              description = (error as dynamic).description?.toString();
            } catch (_) {}
            final diagnostic =
                'type=$errorType description=$description raw=$errorStr';
            initializationDiagnostics.add(diagnostic);
            debugPrint('Appodeal initialization diagnostic: $diagnostic');
          }
        }
        if (!initializationCompleter.isCompleted) {
          initializationCompleter.complete();
        }
      },
    );
    await initializationCompleter.future.timeout(const Duration(seconds: 15));

    final interstitialInitialized = await Appodeal.isInitialized(
      AppodealAdType.Interstitial,
    ).timeout(const Duration(seconds: 5));
    if (!interstitialInitialized) {
      final details = initializationDiagnostics.take(3).join(' | ');
      throw StateError(
        details.isEmpty
            ? 'Appodeal interstitial did not initialize after SDK callback'
            : 'Appodeal interstitial did not initialize: $details',
      );
    }
    _isInitialized = true;
    debugPrint('Appodeal initialized successfully');
'''
if s.count(old) != 1:
    raise SystemExit("Appodeal initialization callback block not found")
s = s.replace(old, new, 1)
old = '''    } catch (error, stackTrace) {
      debugPrint('Optional interstitial failed: $error');
      if (kReleaseMode) {
        unawaited(Sentry.captureException(error, stackTrace: stackTrace));
      }
    }
'''
new = '''    } on TimeoutException catch (error) {
      // Ads are optional; a slow SDK/network must not become an app error.
      debugPrint('Optional interstitial timed out: $error');
    } catch (error) {
      debugPrint('Optional interstitial failed: $error');
      if (kReleaseMode) {
        unawaited(
          Sentry.captureMessage(
            'Optional Appodeal interstitial failed: ${error.runtimeType}: $error',
            level: SentryLevel.warning,
          ),
        );
      }
    }
'''
if s.count(old) != 1:
    raise SystemExit("optional interstitial catch not found")
s = s.replace(old, new, 1)
p.write_text(s)
