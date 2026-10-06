package com.google.android.apps.camera.bottombar;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.dhv;
import p000.dio;
import p000.ikw;
import p000.ila;
import p000.ilk;
import p000.jvd;
import p000.kba;
import p000.mqu;
import p000.mrm;
import p000.mwx;
import p000.mxk;
import p000.nbh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class BottomBarController {
    private static final nbh logger = nbh.m17259h("com/google/android/apps/camera/bottombar/BottomBarController");
    private final BottomBar bottomBar;
    private final CameraSwitchButton cameraSwitchButton;
    private final dhv gcaConfig;
    private boolean isJupiterButtonShowed;
    private boolean isSelfieFlashOn;
    private boolean isSocialShareOpened;
    private final RoundedThumbnailView thumbnailButton;
    private mrm jupiterButton = mqu.f41450a;
    private final BottomBarListener listenerDispatcher = new BottomBarListener() { // from class: com.google.android.apps.camera.bottombar.BottomBarController.1
        @Override // com.google.android.apps.camera.bottombar.BottomBarListener
        public void onCameraSwitchButtonClicked() {
            synchronized (BottomBarController.this.lock) {
                Iterator it = BottomBarController.this.listeners.iterator();
                while (it.hasNext()) {
                    ((BottomBarListener) it.next()).onCameraSwitchButtonClicked();
                }
            }
        }

        @Override // com.google.android.apps.camera.bottombar.BottomBarListener
        public void onCancelButtonPressed() {
            synchronized (BottomBarController.this.lock) {
                Iterator it = BottomBarController.this.listeners.iterator();
                while (it.hasNext()) {
                    ((BottomBarListener) it.next()).onCancelButtonPressed();
                }
            }
        }

        @Override // com.google.android.apps.camera.bottombar.BottomBarListener
        public void onFpsSwitch(int i) {
            synchronized (BottomBarController.this.lock) {
                Iterator it = BottomBarController.this.listeners.iterator();
                while (it.hasNext()) {
                    ((BottomBarListener) it.next()).onFpsSwitch(i);
                }
            }
        }

        @Override // com.google.android.apps.camera.bottombar.BottomBarListener
        public void onJupiterButtonClicked() {
            synchronized (BottomBarController.this.lock) {
                Iterator it = BottomBarController.this.listeners.iterator();
                while (it.hasNext()) {
                    ((BottomBarListener) it.next()).onJupiterButtonClicked();
                }
            }
        }

        @Override // com.google.android.apps.camera.bottombar.BottomBarListener, com.google.android.apps.camera.bottombar.PauseResumeButton.PauseResumeButtonListener
        public void onPauseButtonClicked() {
            synchronized (BottomBarController.this.lock) {
                Iterator it = BottomBarController.this.listeners.iterator();
                while (it.hasNext()) {
                    ((BottomBarListener) it.next()).onPauseButtonClicked();
                }
            }
        }

        @Override // com.google.android.apps.camera.bottombar.BottomBarListener, com.google.android.apps.camera.bottombar.PauseResumeButton.PauseResumeButtonListener
        public void onResumeButtonClicked() {
            synchronized (BottomBarController.this.lock) {
                Iterator it = BottomBarController.this.listeners.iterator();
                while (it.hasNext()) {
                    ((BottomBarListener) it.next()).onResumeButtonClicked();
                }
            }
        }

        @Override // com.google.android.apps.camera.bottombar.BottomBarListener
        public void onRetakeButtonPressed() {
            synchronized (BottomBarController.this.lock) {
                Iterator it = BottomBarController.this.listeners.iterator();
                while (it.hasNext()) {
                    ((BottomBarListener) it.next()).onRetakeButtonPressed();
                }
            }
        }

        @Override // com.google.android.apps.camera.bottombar.BottomBarListener
        public void onReviewPlayButtonPressed() {
            synchronized (BottomBarController.this.lock) {
                Iterator it = BottomBarController.this.listeners.iterator();
                while (it.hasNext()) {
                    ((BottomBarListener) it.next()).onReviewPlayButtonPressed();
                }
            }
        }

        @Override // com.google.android.apps.camera.bottombar.BottomBarListener
        public void onShutterButtonClicked() {
            synchronized (BottomBarController.this.lock) {
                Iterator it = BottomBarController.this.listeners.iterator();
                while (it.hasNext()) {
                    ((BottomBarListener) it.next()).onShutterButtonClicked();
                }
            }
        }

        @Override // com.google.android.apps.camera.bottombar.BottomBarListener
        public void onSnapshotButtonClicked() {
            synchronized (BottomBarController.this.lock) {
                Iterator it = BottomBarController.this.listeners.iterator();
                while (it.hasNext()) {
                    ((BottomBarListener) it.next()).onSnapshotButtonClicked();
                }
            }
        }

        @Override // com.google.android.apps.camera.bottombar.BottomBarListener
        public void onThumbnailButtonClicked() {
            synchronized (BottomBarController.this.lock) {
                Iterator it = BottomBarController.this.listeners.iterator();
                while (it.hasNext()) {
                    ((BottomBarListener) it.next()).onThumbnailButtonClicked();
                }
            }
        }
    };
    private final Object lock = new Object();
    private final List listeners = new ArrayList();
    private ikw mode = ikw.UNINITIALIZED;

    /* JADX INFO: renamed from: com.google.android.apps.camera.bottombar.BottomBarController$2 */
    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes2.dex */
    /* synthetic */ class C00992 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$android$apps$camera$uistate$api$ApplicationMode */
        static final /* synthetic */ int[] f6518x3660f1f8;

        static {
            int[] iArr = new int[ikw.values().length];
            f6518x3660f1f8 = iArr;
            try {
                iArr[ikw.PHOTO.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f6518x3660f1f8[ikw.PORTRAIT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f6518x3660f1f8[ikw.MOTION_BLUR.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f6518x3660f1f8[ikw.LONG_EXPOSURE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f6518x3660f1f8[ikw.TIME_LAPSE.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f6518x3660f1f8[ikw.VIDEO.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f6518x3660f1f8[ikw.PHOTO_SPHERE.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                f6518x3660f1f8[ikw.IMAX.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                f6518x3660f1f8[ikw.AMBER.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
            try {
                f6518x3660f1f8[ikw.SLOW_MOTION.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
            }
            try {
                f6518x3660f1f8[ikw.REWIND.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
            }
            try {
                f6518x3660f1f8[ikw.IMAGE_INTENT.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
            }
            try {
                f6518x3660f1f8[ikw.VIDEO_INTENT.ordinal()] = 13;
            } catch (NoSuchFieldError e13) {
            }
            try {
                f6518x3660f1f8[ikw.MORE_MODES.ordinal()] = 14;
            } catch (NoSuchFieldError e14) {
            }
            try {
                f6518x3660f1f8[ikw.LENS.ordinal()] = 15;
            } catch (NoSuchFieldError e15) {
            }
            try {
                f6518x3660f1f8[ikw.UNINITIALIZED.ordinal()] = 16;
            } catch (NoSuchFieldError e16) {
            }
            try {
                f6518x3660f1f8[ikw.SETTINGS.ordinal()] = 17;
            } catch (NoSuchFieldError e17) {
            }
            try {
                f6518x3660f1f8[ikw.ORNAMENT.ordinal()] = 18;
            } catch (NoSuchFieldError e18) {
            }
            try {
                f6518x3660f1f8[ikw.MEASURE.ordinal()] = 19;
            } catch (NoSuchFieldError e19) {
            }
            try {
                f6518x3660f1f8[ikw.TIARA.ordinal()] = 20;
            } catch (NoSuchFieldError e20) {
            }
        }
    }

    public BottomBarController(BottomBar bottomBar, dhv dhvVar) {
        this.bottomBar = bottomBar;
        this.gcaConfig = dhvVar;
        this.cameraSwitchButton = bottomBar.getCameraSwitchButton();
        this.thumbnailButton = bottomBar.getThumbnailButton();
    }

    private mrm getJupiterButton() {
        return (this.jupiterButton.mo16813g() && this.isJupiterButtonShowed) ? this.jupiterButton : mqu.f41450a;
    }

    public void addListener(BottomBarListener bottomBarListener) {
        synchronized (this.lock) {
            this.listeners.add(bottomBarListener);
        }
    }

    public void announceAccessibilityForThumbnail(String str) {
        RoundedThumbnailView roundedThumbnailView = this.thumbnailButton;
        if (roundedThumbnailView != null) {
            roundedThumbnailView.announceForAccessibility(str);
        }
    }

    public kba disableCameraSwitchAwhile() {
        setCameraSwitchEnabled(false);
        return new kba() { // from class: com.google.android.apps.camera.bottombar.BottomBarController$$ExternalSyntheticLambda0
            @Override // p000.kba, java.lang.AutoCloseable
            public final void close() {
                this.f$0.m4046xa05afb8c();
            }
        };
    }

    public void exitJupiterSession() {
        this.bottomBar.disableSideButtons(BottomBar.SideButtonPosition.CENTER_LEFT, mqu.f41450a);
    }

    public ila getBackgroundColorProperty() {
        return this.bottomBar.getBackgroundColorProperty();
    }

    public int getBottomBarAreaPixels() {
        return this.bottomBar.getHeight() * this.bottomBar.getWidth();
    }

    public void hideJupiterButton() {
        this.isJupiterButtonShowed = false;
        this.bottomBar.replaceSideButton(BottomBar.SideButtonPosition.LEFT, mqu.f41450a, true);
    }

    /* JADX INFO: renamed from: lambda$disableCameraSwitchAwhile$4$com-google-android-apps-camera-bottombar-BottomBarController */
    public /* synthetic */ void m4046xa05afb8c() {
        setCameraSwitchEnabled(true);
    }

    /* JADX INFO: renamed from: lambda$lowerAccessibilityImportanceAwhile$3$com-google-android-apps-camera-bottombar-BottomBarController */
    public /* synthetic */ void m4047x3d1d7b3() {
        setImportantForAccessibility(1);
    }

    /* JADX INFO: renamed from: lambda$makeClickableAwhile$1$com-google-android-apps-camera-bottombar-BottomBarController */
    public /* synthetic */ void m4048x3c98177c() {
        setClickable(false);
    }

    /* JADX INFO: renamed from: lambda$setJupiterButton$0$com-google-android-apps-camera-bottombar-BottomBarController */
    public /* synthetic */ void m4049x345c4b9a(View view) {
        this.listenerDispatcher.onJupiterButtonClicked();
    }

    /* JADX INFO: renamed from: lambda$setSideButtonsClickable$2$com-google-android-apps-camera-bottombar-BottomBarController */
    public /* synthetic */ void m4050xec8d83a5(boolean z) {
        this.bottomBar.setSideButtonsClickable(z);
    }

    /* JADX INFO: renamed from: lambda$wireListeners$10$com-google-android-apps-camera-bottombar-BottomBarController */
    public /* synthetic */ void m4051x6933a54a(View view) {
        this.listenerDispatcher.onCancelButtonPressed();
    }

    /* JADX INFO: renamed from: lambda$wireListeners$11$com-google-android-apps-camera-bottombar-BottomBarController */
    public /* synthetic */ void m4052xfd7214e9(View view) {
        this.listenerDispatcher.onCancelButtonPressed();
    }

    /* JADX INFO: renamed from: lambda$wireListeners$12$com-google-android-apps-camera-bottombar-BottomBarController */
    public /* synthetic */ void m4053x91b08488(View view) {
        this.listenerDispatcher.onReviewPlayButtonPressed();
    }

    /* JADX INFO: renamed from: lambda$wireListeners$5$com-google-android-apps-camera-bottombar-BottomBarController */
    public /* synthetic */ void m4054xa80caee2(View view) {
        this.listenerDispatcher.onCameraSwitchButtonClicked();
    }

    /* JADX INFO: renamed from: lambda$wireListeners$6$com-google-android-apps-camera-bottombar-BottomBarController */
    public /* synthetic */ void m4055x3c4b1e81(View view) {
        this.listenerDispatcher.onThumbnailButtonClicked();
    }

    /* JADX INFO: renamed from: lambda$wireListeners$7$com-google-android-apps-camera-bottombar-BottomBarController */
    public /* synthetic */ void m4056xd0898e20(View view) {
        this.listenerDispatcher.onShutterButtonClicked();
    }

    /* JADX INFO: renamed from: lambda$wireListeners$8$com-google-android-apps-camera-bottombar-BottomBarController */
    public /* synthetic */ void m4057x64c7fdbf(View view) {
        this.listenerDispatcher.onSnapshotButtonClicked();
    }

    /* JADX INFO: renamed from: lambda$wireListeners$9$com-google-android-apps-camera-bottombar-BottomBarController */
    public /* synthetic */ void m4058xf9066d5e(View view) {
        this.listenerDispatcher.onRetakeButtonPressed();
    }

    public kba lowerAccessibilityImportanceAwhile() {
        setImportantForAccessibility(4);
        return new kba() { // from class: com.google.android.apps.camera.bottombar.BottomBarController$$ExternalSyntheticLambda12
            @Override // p000.kba, java.lang.AutoCloseable
            public final void close() {
                this.f$0.m4047x3d1d7b3();
            }
        };
    }

    public kba makeClickableAwhile() {
        setClickable(true);
        return new kba() { // from class: com.google.android.apps.camera.bottombar.BottomBarController$$ExternalSyntheticLambda1
            @Override // p000.kba, java.lang.AutoCloseable
            public final void close() {
                this.f$0.m4048x3c98177c();
            }
        };
    }

    public void pauseRecording() {
        this.bottomBar.getPauseResumeButton().transitionToResumeState();
    }

    public void removeListener(BottomBarListener bottomBarListener) {
        synchronized (this.lock) {
            this.listeners.remove(bottomBarListener);
        }
    }

    public void resetCameraSwitch(boolean z) {
        this.bottomBar.getCameraSwitchButton().setFrontFacing(z);
    }

    public void resumeRecording() {
        this.bottomBar.getPauseResumeButton().transitionToPauseState();
    }

    public void returnToPhotoIntent() {
        this.bottomBar.changeMultipleSideButtons(mwx.m17119n(BottomBar.SideButtonPosition.CENTER_LEFT, mrm.m16829i(this.cameraSwitchButton)), true);
    }

    public void returnToVideoIntent() {
        this.bottomBar.changeMultipleSideButtons(mwx.m17119n(BottomBar.SideButtonPosition.CENTER_LEFT, mrm.m16829i(this.cameraSwitchButton)), true);
    }

    public void setCameraSwitchEnabled(boolean z) {
        this.bottomBar.getCameraSwitchButton().setEnabled(z);
    }

    public void setClickable(boolean z) {
        this.bottomBar.setClickable(z);
        this.bottomBar.setPressed(false);
    }

    public void setImportantForAccessibility(int i) {
        this.bottomBar.setImportantForAccessibility(i);
    }

    public void setJupiterButton(View view) {
        if (this.jupiterButton.mo16813g()) {
            return;
        }
        mrm mrmVarM16829i = mrm.m16829i(view);
        this.jupiterButton = mrmVarM16829i;
        ((View) mrmVarM16829i.mo16809c()).setOnClickListener(new View.OnClickListener() { // from class: com.google.android.apps.camera.bottombar.BottomBarController$$ExternalSyntheticLambda11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f$0.m4049x345c4b9a(view2);
            }
        });
        this.bottomBar.addView(BottomBar.SideButtonPosition.LEFT, (View) this.jupiterButton.mo16809c());
    }

    public void setLayoutListener(BottomBarLayoutListener bottomBarLayoutListener) {
        this.bottomBar.setLayoutListener(bottomBarLayoutListener);
    }

    public void setSelfieFlashState(boolean z) {
        this.isSelfieFlashOn = z;
    }

    public void setSideButtonsClickable(final boolean z) {
        this.bottomBar.post(new Runnable() { // from class: com.google.android.apps.camera.bottombar.BottomBarController$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m4050xec8d83a5(z);
            }
        });
    }

    public void setSnapshotButtonClickEnabled(boolean z) {
        this.bottomBar.getSnapshotButton().setClickEnabled(z);
    }

    public void setSocialShareState(boolean z) {
        this.isSocialShareOpened = z;
    }

    public void showJupiterButton() {
        this.isJupiterButtonShowed = true;
        if (mxk.m17138J(ikw.MORE_MODES, ikw.IMAGE_INTENT, ikw.VIDEO_INTENT).contains(this.mode)) {
            return;
        }
        this.bottomBar.replaceSideButton(BottomBar.SideButtonPosition.LEFT, getJupiterButton(), true);
    }

    public void startAutoTimerCapturing() {
        if (!this.isSelfieFlashOn) {
            this.bottomBar.fadeBackground(false, true);
        }
        this.bottomBar.changeMultipleSideButtons(mwx.m17120o(BottomBar.SideButtonPosition.LEFT, mqu.f41450a, BottomBar.SideButtonPosition.CENTER_RIGHT, mrm.m16829i(this.thumbnailButton)), true);
    }

    public void startCountdown() {
        this.bottomBar.clearSideButtons(true);
        this.bottomBar.fadeBackground(false, true);
    }

    public void startImaxCapture(boolean z) {
        boolean z2 = false;
        this.thumbnailButton.setClickable(false);
        ilk uiOrientation = this.bottomBar.getUiOrientation();
        if (uiOrientation == ilk.REVERSE_LANDSCAPE || uiOrientation == ilk.LANDSCAPE) {
            z2 = true;
        }
        if (z) {
            z2 = !z2;
        }
        this.bottomBar.fadeBackground(z2, true);
        this.bottomBar.changeMultipleSideButtons(mwx.m17119n(BottomBar.SideButtonPosition.CENTER_RIGHT, mrm.m16829i(this.bottomBar.getCancelButton())), true);
    }

    public void startJupiterSession() {
        showJupiterButton();
        this.bottomBar.disableSideButtons(BottomBar.SideButtonPosition.CENTER_LEFT, mrm.m16829i(this.cameraSwitchButton));
    }

    public void startLongShot() {
        this.bottomBar.clearSideButtons(true);
    }

    public void startNoPDPortraitCapture() {
        this.bottomBar.changeMultipleSideButtons(mwx.m17120o(BottomBar.SideButtonPosition.CENTER_LEFT, getJupiterButton(), BottomBar.SideButtonPosition.CENTER_RIGHT, mrm.m16829i(this.thumbnailButton)), true);
    }

    public void startPanoramaCalibration() {
        this.bottomBar.changeMultipleSideButtons(mwx.m17120o(BottomBar.SideButtonPosition.CENTER_LEFT, mrm.m16829i(this.bottomBar.getRetakeButton()), BottomBar.SideButtonPosition.CENTER_RIGHT, mrm.m16829i(this.bottomBar.getCancelButton())), true);
    }

    public void startPhotoSphereCapture() {
        this.bottomBar.changeMultipleSideButtons(mwx.m17120o(BottomBar.SideButtonPosition.CENTER_LEFT, mrm.m16829i(this.bottomBar.getRetakeButton()), BottomBar.SideButtonPosition.CENTER_RIGHT, mrm.m16829i(this.bottomBar.getCancelButton())), true);
    }

    public void startRecording(boolean z, boolean z2) {
        Object objM16829i;
        Object objM16829i2;
        if (!this.isSelfieFlashOn) {
            this.bottomBar.fadeBackground(false, true);
        }
        if (z) {
            PauseResumeButton pauseResumeButton = this.bottomBar.getPauseResumeButton();
            pauseResumeButton.getClass();
            objM16829i = mrm.m16829i(pauseResumeButton);
        } else {
            objM16829i = mqu.f41450a;
        }
        if (z2) {
            SnapshotButton snapshotButton = this.bottomBar.getSnapshotButton();
            snapshotButton.getClass();
            objM16829i2 = mrm.m16829i(snapshotButton);
        } else {
            objM16829i2 = mqu.f41450a;
        }
        this.bottomBar.changeMultipleSideButtons(mwx.m17120o(BottomBar.SideButtonPosition.CENTER_LEFT, objM16829i, BottomBar.SideButtonPosition.CENTER_RIGHT, objM16829i2), true);
    }

    public void startVideoIntentRecording() {
        if (!this.isSelfieFlashOn) {
            this.bottomBar.fadeBackground(false, true);
        }
        this.bottomBar.clearSideButtons(true);
    }

    public void stopAutoTimerCapturing() {
        if (this.isSocialShareOpened) {
            return;
        }
        this.bottomBar.changeMultipleSideButtons(mwx.m17121p(BottomBar.SideButtonPosition.LEFT, getJupiterButton(), BottomBar.SideButtonPosition.CENTER_LEFT, mrm.m16829i(this.cameraSwitchButton), BottomBar.SideButtonPosition.CENTER_RIGHT, mrm.m16829i(this.thumbnailButton)), true);
    }

    public void stopCountdown() {
        switchToMode(this.mode);
        if (this.gcaConfig.mo6184l(dio.f11668j) || this.mode != ikw.PORTRAIT) {
            return;
        }
        startNoPDPortraitCapture();
    }

    public void stopImaxCapture() {
        this.thumbnailButton.setClickable(true);
        this.bottomBar.fadeBackground(true, true);
        this.bottomBar.changeMultipleSideButtons(mwx.m17119n(BottomBar.SideButtonPosition.CENTER_RIGHT, mrm.m16829i(this.thumbnailButton)), true);
    }

    public void stopLongShot() {
        this.bottomBar.changeMultipleSideButtons(mwx.m17121p(BottomBar.SideButtonPosition.LEFT, getJupiterButton(), BottomBar.SideButtonPosition.CENTER_LEFT, mrm.m16829i(this.cameraSwitchButton), BottomBar.SideButtonPosition.CENTER_RIGHT, mrm.m16829i(this.thumbnailButton)), true);
    }

    public void stopNoPDPortraitCapture() {
        this.bottomBar.changeMultipleSideButtons(mwx.m17120o(BottomBar.SideButtonPosition.CENTER_LEFT, mrm.m16829i(this.cameraSwitchButton), BottomBar.SideButtonPosition.CENTER_RIGHT, mrm.m16829i(this.thumbnailButton)), true);
    }

    public void stopPanoramaCapture() {
        this.bottomBar.changeMultipleSideButtons(mwx.m17119n(BottomBar.SideButtonPosition.CENTER_RIGHT, mrm.m16829i(this.thumbnailButton)), true);
    }

    public void stopPhotoSphereCapture() {
        this.bottomBar.changeMultipleSideButtons(mwx.m17120o(BottomBar.SideButtonPosition.LEFT, getJupiterButton(), BottomBar.SideButtonPosition.CENTER_RIGHT, mrm.m16829i(this.thumbnailButton)), true);
    }

    public void stopRecording(boolean z, boolean z2) {
        if (!this.isSelfieFlashOn) {
            this.bottomBar.fadeBackground(true, true);
        }
        this.bottomBar.changeMultipleSideButtons(mwx.m17121p(BottomBar.SideButtonPosition.LEFT, getJupiterButton(), BottomBar.SideButtonPosition.CENTER_LEFT, z ? mrm.m16829i(this.cameraSwitchButton) : mqu.f41450a, BottomBar.SideButtonPosition.CENTER_RIGHT, z2 ? mrm.m16829i(this.thumbnailButton) : mqu.f41450a), true);
        this.bottomBar.getPauseResumeButton().resetButton();
    }

    public void switchCamera() {
        this.cameraSwitchButton.callOnClick();
    }

    public void switchToMode(ikw ikwVar) {
        this.mode = ikwVar;
        this.bottomBar.fadeBackground(true, true);
        ikw ikwVar2 = ikw.UNINITIALIZED;
        switch (ikwVar) {
            case UNINITIALIZED:
            case ORNAMENT:
            case SETTINGS:
            case MEASURE:
            case TIARA:
                throw new UnsupportedOperationException("Unsupported application mode ".concat(String.valueOf(String.valueOf(ikwVar))));
            case PHOTO:
            case VIDEO:
            case PORTRAIT:
            case MOTION_BLUR:
            case LONG_EXPOSURE:
            case TIME_LAPSE:
                this.bottomBar.changeMultipleSideButtons(mwx.m17121p(BottomBar.SideButtonPosition.LEFT, getJupiterButton(), BottomBar.SideButtonPosition.CENTER_LEFT, mrm.m16829i(this.cameraSwitchButton), BottomBar.SideButtonPosition.CENTER_RIGHT, mrm.m16829i(this.thumbnailButton)), true);
                return;
            case IMAX:
            case PHOTO_SPHERE:
            case AMBER:
                this.bottomBar.changeMultipleSideButtons(mwx.m17119n(BottomBar.SideButtonPosition.CENTER_RIGHT, mrm.m16829i(this.thumbnailButton)), true);
                return;
            case SLOW_MOTION:
                this.bottomBar.changeMultipleSideButtons(mwx.m17120o(BottomBar.SideButtonPosition.LEFT, getJupiterButton(), BottomBar.SideButtonPosition.CENTER_RIGHT, mrm.m16829i(this.thumbnailButton)), true);
                return;
            case IMAGE_INTENT:
            case VIDEO_INTENT:
                this.bottomBar.changeMultipleSideButtons(mwx.m17119n(BottomBar.SideButtonPosition.CENTER_LEFT, mrm.m16829i(this.cameraSwitchButton)), true);
                return;
            case LENS:
            case MORE_MODES:
                this.bottomBar.clearSideButtons(true);
                return;
            case REWIND:
                this.bottomBar.changeMultipleSideButtons(mwx.m17121p(BottomBar.SideButtonPosition.LEFT, getJupiterButton(), BottomBar.SideButtonPosition.CENTER_LEFT, mrm.m16829i(this.bottomBar.getLeftSideCancelButton()), BottomBar.SideButtonPosition.CENTER_RIGHT, mrm.m16829i(this.thumbnailButton)), true);
                return;
            default:
                return;
        }
    }

    public void switchToPhotoIntentReview() {
        this.bottomBar.changeMultipleSideButtons(mwx.m17119n(BottomBar.SideButtonPosition.CENTER_LEFT, mrm.m16829i(this.bottomBar.getRetakeButton())), true);
    }

    public void switchToVideoIntentReview() {
        this.bottomBar.fadeBackground(true, true);
        this.bottomBar.changeMultipleSideButtons(mwx.m17120o(BottomBar.SideButtonPosition.CENTER_LEFT, mrm.m16829i(this.bottomBar.getRetakeButton()), BottomBar.SideButtonPosition.CENTER_RIGHT, mrm.m16829i(this.bottomBar.getReviewPlayButton())), true);
    }

    public void wireListeners() {
        jvd.m13538a();
        this.bottomBar.getCameraSwitchButton().setOnClickListener(new View.OnClickListener() { // from class: com.google.android.apps.camera.bottombar.BottomBarController$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m4054xa80caee2(view);
            }
        });
        this.bottomBar.getThumbnailButton().setOnClickListener(new View.OnClickListener() { // from class: com.google.android.apps.camera.bottombar.BottomBarController$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m4055x3c4b1e81(view);
            }
        });
        this.bottomBar.getPauseResumeButton().setListener(this.listenerDispatcher);
        this.bottomBar.getShutterButton().setOnClickListener(new View.OnClickListener() { // from class: com.google.android.apps.camera.bottombar.BottomBarController$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m4056xd0898e20(view);
            }
        });
        this.bottomBar.getSnapshotButton().setOnClickListener(new View.OnClickListener() { // from class: com.google.android.apps.camera.bottombar.BottomBarController$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m4057x64c7fdbf(view);
            }
        });
        this.bottomBar.getSnapshotButton().wirePressedStateAnimationListener();
        this.bottomBar.getRetakeButton().setOnClickListener(new View.OnClickListener() { // from class: com.google.android.apps.camera.bottombar.BottomBarController$$ExternalSyntheticLambda6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m4058xf9066d5e(view);
            }
        });
        this.bottomBar.getCancelButton().setOnClickListener(new View.OnClickListener() { // from class: com.google.android.apps.camera.bottombar.BottomBarController$$ExternalSyntheticLambda7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m4051x6933a54a(view);
            }
        });
        this.bottomBar.getLeftSideCancelButton().setOnClickListener(new View.OnClickListener() { // from class: com.google.android.apps.camera.bottombar.BottomBarController$$ExternalSyntheticLambda8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m4052xfd7214e9(view);
            }
        });
        this.bottomBar.getReviewPlayButton().setOnClickListener(new View.OnClickListener() { // from class: com.google.android.apps.camera.bottombar.BottomBarController$$ExternalSyntheticLambda9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m4053x91b08488(view);
            }
        });
        setClickable(true);
    }
}
