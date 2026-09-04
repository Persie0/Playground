from pathlib import Path


def load(path: str) -> str:
    return Path(path).read_text()


def save(path: str, text: str) -> None:
    Path(path).write_text(text)


def one(text: str, old: str, new: str, label: str) -> str:
    count = text.count(old)
    if count != 1:
        raise SystemExit(f"{label}: expected exactly 1 match, found {count}")
    return text.replace(old, new, 1)


def between(text: str, start: str, end: str, replacement: str, label: str) -> str:
    start_index = text.find(start)
    if start_index < 0:
        raise SystemExit(f"{label}: start not found")
    end_index = text.find(end, start_index)
    if end_index < 0:
        raise SystemExit(f"{label}: end not found")
    return text[:start_index] + replacement + text[end_index:]


# RevenueCat: only this app's named entitlement grants Pro, and verbose SDK
# logging is debug-only.
p = "lib/services/subscription_service.dart"
s = load(p)
s = one(
    s,
    "    await Purchases.setLogLevel(LogLevel.debug);",
    """    if (kDebugMode) {
      await Purchases.setLogLevel(LogLevel.debug);
    }""",
    "RevenueCat debug logging",
)
s = between(
    s,
    "    final isProNow = customerInfo.entitlements.active.isNotEmpty;",
    "    // Only update if status changed",
    """    final entitlement = customerInfo.entitlements.active[_entitlementId];
    final isProNow = entitlement != null;
    // RevenueCat uses a null expiration date for lifetime entitlements.
    // Never infer this app's Pro state from a different entitlement.
    final isLifetimeNow =
        entitlement != null && entitlement.expirationDate == null;

""",
    "exact RevenueCat Pro entitlement",
)
save(p, s)


# Model selection: observe live Pro state instead of a route-construction
# snapshot. Also lock the dropdown while one model download is in flight.
p = "lib/model_selection_page.dart"
s = load(p)
s = one(
    s,
    """  final Map<String, ModelInfo> availableModels;
  final bool isProUser;

  const ModelSelectionPage({
    super.key,
    required this.availableModels,
    required this.isProUser,
  });""",
    """  final Map<String, ModelInfo> availableModels;

  const ModelSelectionPage({
    super.key,
    required this.availableModels,
  });""",
    "remove stale Pro constructor snapshot",
)
s = one(
    s,
    "  bool _isToastShown = false;",
    """  bool _isToastShown = false;

  bool get _isProUserNow =>
      Provider.of<SettingsProvider>(context, listen: false).getBoughtPro();""",
    "current Pro getter",
)
s = one(
    s,
    "    if (model.isPro && !widget.isProUser) {",
    "    if (model.isPro && !_isProUserNow) {",
    "download Pro check",
)
s = one(
    s,
    """    final l10n = AppLocalizations.of(context);
    if (l10n == null) return const SizedBox.shrink();

    final isDark = Theme.of(context).brightness == Brightness.dark;""",
    """    final l10n = AppLocalizations.of(context);
    if (l10n == null) return const SizedBox.shrink();

    final isProUser = Provider.of<SettingsProvider>(context).getBoughtPro();
    final isDark = Theme.of(context).brightness == Brightness.dark;""",
    "watch Pro in model picker build",
)
if s.count("widget.isProUser") != 2:
    raise SystemExit(
        f"model picker stale Pro references: expected 2, found {s.count('widget.isProUser')}"
    )
s = s.replace("widget.isProUser", "isProUser")
old_dropdown = """                        onChanged: (val) {
                          setState(() => _selectedModelKey = val);
                          // Show info dialog for ad-gated models if not pro user
                          if (val != null &&
                              _isAdGatedModel(val) &&
                              !isProUser) {
                            _showAdGatedModelInfo();
                          }
                        },"""
new_dropdown = """                        onChanged: _isDownloading
                            ? null
                            : (val) {
                                setState(() => _selectedModelKey = val);
                                if (val != null &&
                                    _isAdGatedModel(val) &&
                                    !isProUser) {
                                  _showAdGatedModelInfo();
                                }
                              },"""
s = one(s, old_dropdown, new_dropdown, "freeze model selection during download")
save(p, s)


# Banner: subscribe to SettingsProvider so a new Pro purchase hides an already
# initialized banner immediately.
p = "lib/adbanner.dart"
s = load(p)
s = one(
    s,
    """  Widget build(BuildContext context) {
    if (!Provider.of<SettingsProvider>(context, listen: false).getBoughtPro() &&
        canShowAd) {""",
    """  Widget build(BuildContext context) {
    final isProUser = Provider.of<SettingsProvider>(context).getBoughtPro();
    if (!isProUser && canShowAd) {""",
    "banner live Pro state",
)
save(p, s)


# Home page: use live Pro model picker, avoid sync filesystem calls on UI path,
# make async navigation/disposal safe, lower save-memory usage, and avoid result
# IO races.
p = "lib/super_resolution_home_page.dart"
s = load(p)
s = one(
    s,
    """    final settings = Provider.of<SettingsProvider>(context, listen: false);
    final result = await Navigator.push(
      context,
      MaterialPageRoute(
        builder: (context) => ModelSelectionPage(
          availableModels: _availableModels,
          isProUser: settings.getBoughtPro(),
        ),
      ),
    );""",
    """    final result = await Navigator.push(
      context,
      MaterialPageRoute(
        builder: (context) => ModelSelectionPage(
          availableModels: _availableModels,
        ),
      ),
    );""",
    "home model picker live Pro state",
)
s = one(
    s,
    "        if (modelFile.existsSync()) {",
    "        if (await modelFile.exists()) {",
    "async model existence check",
)
s = one(
    s,
    "    if (!imageToProcess.existsSync()) {",
    "    if (!await imageToProcess.exists()) {",
    "async input existence check",
)
s = one(
    s,
    """  Future<void> _pickImage({bool batch = false}) async {
    if (_isPickingImage || _isProcessing || _processRequestInFlight) return;""",
    """  Future<void> _pickImage({bool batch = false}) async {
    if (_isPickingImage ||
        _isProcessing ||
        _processRequestInFlight ||
        _isSaving ||
        _isSharing ||
        _isSharePreparing) {
      return;
    }""",
    "block image replacement during result IO",
)
s = one(
    s,
    """        final List<XFile> images = await PermissionHelper.runWithRetry(
          () => _picker.pickMultiImage(),
        );
        if (images.isNotEmpty) {""",
    """        final List<XFile> images = await PermissionHelper.runWithRetry(
          () => _picker.pickMultiImage(),
        );
        if (!mounted) return;
        if (images.isNotEmpty) {""",
    "batch picker mounted guard",
)
s = one(
    s,
    """          for (final file in files) {
            await _validateImageForScale(file, scale);
          }
          setState(() {""",
    """          for (final file in files) {
            await _validateImageForScale(file, scale);
            if (!mounted) return;
          }
          if (!mounted) return;
          setState(() {""",
    "batch validation mounted guard",
)
s = one(
    s,
    """        final XFile? image = await PermissionHelper.runWithRetry(
          () => _picker.pickImage(source: ImageSource.gallery),
        );
        if (image != null) {""",
    """        final XFile? image = await PermissionHelper.runWithRetry(
          () => _picker.pickImage(source: ImageSource.gallery),
        );
        if (!mounted) return;
        if (image != null) {""",
    "single picker mounted guard",
)
s = one(
    s,
    """          setState(() {
            _selectedImage = file;
            _imageSize = size;""",
    """          if (!mounted) return;
          setState(() {
            _selectedImage = file;
            _imageSize = size;""",
    "single validation mounted guard",
)
s = one(
    s,
    """  void _recordUpscaleDiagnostics(Map<String, Object?> diagnostics) {
    final settings = Provider.of<SettingsProvider>(context, listen: false);""",
    """  void _recordUpscaleDiagnostics(Map<String, Object?> diagnostics) {
    if (!mounted) return;
    final settings = Provider.of<SettingsProvider>(context, listen: false);""",
    "diagnostics mounted guard",
)
s = one(
    s,
    """    } catch (_) {
      await upscaler.dispose();
      rethrow;
    }
    _upscaler = upscaler;""",
    """    } catch (_) {
      await upscaler.dispose();
      rethrow;
    }
    if (!mounted) {
      await upscaler.dispose();
      return;
    }
    _upscaler = upscaler;""",
    "dispose session initialized after navigation",
)
s = one(
    s,
    """      final scaleFactor = _getScaleFactorForModel(modelKey);
      await _validateImageForScale(imageToProcess, scaleFactor);
      await _ensureModelSession(modelKey: modelKey, overlap: overlap);

      if (_upscaler == null) {
        throw Exception(l10n.modelInfoMissing);
      }""",
    """      final scaleFactor = _getScaleFactorForModel(modelKey);
      await _validateImageForScale(imageToProcess, scaleFactor);
      if (!mounted) return;
      await _ensureModelSession(modelKey: modelKey, overlap: overlap);
      if (!mounted) return;

      final upscaler = _upscaler;
      if (upscaler == null) {
        throw Exception(l10n.modelInfoMissing);
      }""",
    "stable local session reference",
)
s = one(
    s,
    """      late final ui.Image upscaledImage;
      try {
        upscaledImage = await _upscaler!.upscaleImage(""",
    """      if (!mounted) {
        sourceImage.dispose();
        return;
      }

      late final ui.Image upscaledImage;
      try {
        upscaledImage = await upscaler.upscaleImage(""",
    "no inference after page disposal",
)
s = one(
    s,
    """      } else {
        // For batch mode, the caller will handle the state
        _upscaledImage = upscaledImage;
      }""",
    """      } else if (mounted) {
        // For batch mode, the caller will handle the state.
        _upscaledImage = upscaledImage;
      } else {
        upscaledImage.dispose();
      }""",
    "dispose batch result completed after navigation",
)
s = one(
    s,
    """        if (e is UnsupportedFileException) {
          _showError(l10n.unsupportedFileError);
        } else {
          _showError(l10n.failedToUpscaleImage(e.toString()));
        }""",
    """        if (e is UnsupportedFileException) {
          _showError(l10n.unsupportedFileError);
        } else if (e is ImageTooLargeException) {
          _showError(e.message);
        } else {
          _showError(l10n.failedToUpscaleImage(e.toString()));
        }""",
    "friendly single image size error",
)
s = one(
    s,
    """        await _upscaleImage(
          imageToProcess: images[i],
          modelKey: modelKey,
          overlap: overlap,
          batchItem: true,
        );
        if (_upscaledImage != null) {""",
    """        await _upscaleImage(
          imageToProcess: images[i],
          modelKey: modelKey,
          overlap: overlap,
          batchItem: true,
        );
        if (!mounted) break;
        if (_upscaledImage != null) {""",
    "batch loop mounted guard",
)
s = one(
    s,
    "      if (mounted) _showError(l10n.failedToUpscaleImage(e.toString()));",
    """      if (mounted) {
        _showError(
          e is ImageTooLargeException
              ? e.message
              : l10n.failedToUpscaleImage(e.toString()),
        );
      }""",
    "friendly batch size error",
)
s = one(
    s,
    "        final bytes = await tempFile.readAsBytes();\n",
    "",
    "remove batch result byte copy",
)
s = one(
    s,
    """        final result = await PermissionHelper.runWithRetry<dynamic>(
          () async => await ImageGallerySaverPlus.saveImage(
            bytes,
            quality: 100,
            name: '${stem}_upscaled',
          ),
        );""",
    """        final result = await PermissionHelper.runWithRetry<dynamic>(
          () async => await ImageGallerySaverPlus.saveFile(
            tempFile.path,
            name: '${stem}_upscaled',
          ),
        );""",
    "save batch result by file path",
)
s = one(
    s,
    """      final preparedFile = File(preparedPath);
      final bytes = await preparedFile.readAsBytes();

      final result = await PermissionHelper.runWithRetry<dynamic>(
        () async => await ImageGallerySaverPlus.saveImage(
          bytes,
          quality: 100,
          name: preparedFile.uri.pathSegments.last.replaceAll('.png', ''),
        ),
      );""",
    """      final preparedFile = File(preparedPath);

      final result = await PermissionHelper.runWithRetry<dynamic>(
        () async => await ImageGallerySaverPlus.saveFile(
          preparedFile.path,
          name: preparedFile.uri.pathSegments.last.replaceAll('.png', ''),
        ),
      );""",
    "save single result by file path",
)
s = one(
    s,
    """                                  onPressed:
                                      _isSaving ||
                                          _isProcessing ||
                                          _processRequestInFlight
                                      ? null
                                      : _handleProcessRequest,""",
    """                                  onPressed:
                                      _isSaving ||
                                          _isSharing ||
                                          _isSharePreparing ||
                                          _isProcessing ||
                                          _processRequestInFlight
                                      ? null
                                      : _handleProcessRequest,""",
    "disable reprocess during result IO",
)
save(p, s)
