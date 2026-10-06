package com.google.android.apps.camera.p014ui.shutterbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.C0273iq;
import p000.akf;
import p000.cdp;
import p000.cwu;
import p000.dfg;
import p000.dhv;
import p000.dib;
import p000.dii;
import p000.gzp;
import p000.ibw;
import p000.iff;
import p000.ifg;
import p000.ifh;
import p000.ifi;
import p000.ifj;
import p000.ifk;
import p000.ifl;
import p000.iga;
import p000.igf;
import p000.igm;
import p000.ign;
import p000.ikw;
import p000.ili;
import p000.ill;
import p000.jvh;
import p000.jwj;
import p000.jwn;
import p000.jws;
import p000.jzn;
import p000.lku;
import p000.mxk;
import p000.nbe;
import p000.nbh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ShutterButton extends C0273iq {
    private static final int ALL_CIRCLE_SCALES = 360;
    private static final float BUTTON_CLICK_SPLASH_FACTOR = 1.06f;
    private static final int BUTTON_CLICK_SPLASH_IN_DURATION_MS = 250;
    private static final int BUTTON_CLICK_SPLASH_OUT_DURATION_MS = 100;
    private static final int BUTTON_DISABLED_DELAY_MS = 500;
    static final int DISABLED_FILTER_COLOR_VALUE = 165;
    private static final int INNER_DOTS_BASE = 18;
    private static final float INTER_CIRCLE_RING_ALPHA = 0.32f;
    private static final int MSG_UPDATE_CIRCLE_PAUSE_STATE = 1001;
    private static final int MSG_UPDATE_CIRCLE_PROGRESS_STATE = 1002;
    private static final int MSG_UPDATE_CIRCLE_RESUME_STATE = 1000;
    private static final int PHOTO_DISABLE_ANIMATION_DURATION_MS = 150;
    private static final long TICK_MARK_BLINKING_INTERVAL_MS = 1000;
    private static final int TICK_MARK_SCALE_BASE = 30;
    private static final int TICK_MARK_SCALE_SIZE = 30;
    private static final float VIDEO_RECORDING_INTER_CIRCLE_RING_ALPHA = 0.86f;
    private static ifk msgHandler;
    private ikw applicationMode;
    private boolean blockClickForAnimation;
    private int buttonCenterX;
    private int buttonCenterY;
    private RectF buttonRect;
    private int circleAnimationIndex;
    boolean clickEnabled;
    private final jws clickEnabledObservable;
    private Paint currentInnerPortraitRingPaint;
    private Paint currentMainButtonPaint;
    private Paint currentOuterPortraitRingPaint;
    private Paint currentPhotoCirclePaint;
    private Paint currentRipplePaint;
    private float currentScaleFactor;
    private ign currentSpec;
    private final Object currentSpecLock;
    private Paint currentVideoCirclePaint;
    private int disabledFilterGreyValue;
    private final AtomicBoolean enableLongPressMotion;
    private ValueAnimator enableStateChangeAnimator;
    private final jwn filteredClickEnabledObservable;
    private boolean forRemoteShutter;
    private dhv gcaConfig;
    private GestureDetector gestureDetector;
    private boolean hasPressAndReleaseHaptic;
    public igm inFlightSpecBuilder;
    private Paint innerDotsCirclePaint;
    private final AtomicBoolean isAccessibleShot;
    private boolean isCircleProgressVisible;
    private boolean isCircleWaitingVisible;
    private final AtomicBoolean isLongPressInProgress;
    private boolean isVideoButtonAnimating;
    private boolean isZoomLockEnabled;
    private igf listener;
    private ifg longPressMotionListener;
    private MotionEvent longPressStartMotionEvent;
    private final AccessibilityNodeInfo.AccessibilityAction longShotEndAccessibilityAction;
    private final AccessibilityNodeInfo.AccessibilityAction longShotStartAccessibilityAction;
    private Paint mainInnerCircleButtonPaint;
    private Paint mainOuterCircleButtonPaint;
    private AnimatorSet modeTransitionAnimatorSet;
    private boolean oldPressed;
    private ifh onDrawListener;
    private final boolean[] tickMarkCircleState;
    private Paint tickMarkPaint;
    private ili touchCoordinate;
    private boolean visualFeedbackForEnableState;
    private static final nbh logger = nbh.m17259h("com/google/android/apps/camera/ui/shutterbutton/ShutterButton");
    private static final mxk CAROUSEL_IDLE_MODES = mxk.m17141M(ifi.NIGHT_IDLE, ifi.ASTRO_IDLE, ifi.PORTRAIT_IDLE, ifi.PHOTO_IDLE, ifi.TIMELAPSE_IDLE, ifi.VIDEO_IDLE, ifi.LASAGNA_IDLE, ifi.AMBER_IDLE);
    private static ifl progressState = ifl.STATE_NONE;

    public ShutterButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, false);
    }

    private void animateMainButton(ifi ifiVar, gzp gzpVar, iga igaVar) {
        cancelModeTransitionAnimations(true);
        ign currentSpec = getCurrentSpec();
        ign ignVarM11291b = ign.m11291b(ifiVar, gzpVar, this, this.isZoomLockEnabled, this.forRemoteShutter);
        AnimatorSet animatorSetM11184a = igaVar.m11184a(igaVar.f30701b.getCurrentSpec(), ignVarM11291b);
        setSpecsForAnimatorTransition(currentSpec, ignVarM11291b);
        animatorSetM11184a.addListener(jvh.m13544B(new cwu(this, ignVarM11291b, 7)));
        this.modeTransitionAnimatorSet = animatorSetM11184a;
        animatorSetM11184a.start();
    }

    private void drawInnerDots(Canvas canvas) {
        this.innerDotsCirclePaint.setAlpha(getCurrentSpec().f30839q);
        for (int i = 0; i < 18; i++) {
            canvas.save();
            canvas.rotate(i * 20.0f, this.buttonCenterX, this.buttonCenterY);
            canvas.drawCircle(this.buttonCenterX, this.buttonCenterY, ill.m11431b(1.5f) * this.currentScaleFactor, this.innerDotsCirclePaint);
            canvas.restore();
        }
    }

    private void drawTickMarkForCircleEdge(Canvas canvas) {
        if (progressState == ifl.STATE_NONE || progressState == ifl.STATE_IDLE) {
            return;
        }
        ign currentSpec = getCurrentSpec();
        float f = currentSpec.f30846x;
        float f2 = currentSpec.f30847y;
        float f3 = currentSpec.f30848z;
        int i = 0;
        while (true) {
            boolean[] zArr = this.tickMarkCircleState;
            if (i >= zArr.length) {
                break;
            }
            if (zArr[i]) {
                canvas.save();
                canvas.rotate(i * 12.0f, this.buttonCenterX, this.buttonCenterY);
                canvas.drawRoundRect(this.buttonCenterX - ill.m11431b(0.5f), f2, this.buttonCenterX + ill.m11431b(0.5f), f2 + f, f3, f3, this.tickMarkPaint);
                canvas.restore();
            }
            i++;
        }
        if (progressState == ifl.STATE_PAUSE) {
            updateTickMarkBlinkingState();
        }
    }

    private void endAccessibleLongShot() {
        igf igfVar = this.listener;
        if (igfVar != null) {
            this.isAccessibleShot.set(false);
            igfVar.onShutterButtonLongPressRelease();
            igfVar.onShutterButtonPressedStateChanged(false);
        }
    }

    private ColorFilter getColorFilterToApply(boolean z, ifi ifiVar) {
        if (!this.visualFeedbackForEnableState || z || !CAROUSEL_IDLE_MODES.contains(ifiVar)) {
            return null;
        }
        int i = this.disabledFilterGreyValue;
        return new LightingColorFilter(Color.rgb(i, i, i), 0);
    }

    private int getContentDescriptionIdForMode(ifi ifiVar) {
        ifi ifiVar2 = ifi.PHOTO_IDLE;
        switch (ifiVar) {
            case PHOTO_IDLE:
            case PHOTO_PRESSED:
            case PHOTO_LONGPRESS:
                return C0100R.string.accessibility_take_photo_button;
            case PORTRAIT_IDLE:
            case PORTRAIT_PRESSED:
                return C0100R.string.accessibility_take_portrait_button;
            case VIDEO_IDLE:
            case VIDEO_PRESSED:
            case AMBER_IDLE:
                if (this.applicationMode == ikw.SLOW_MOTION) {
                    return C0100R.string.accessibility_hfr_video_start;
                }
                return this.applicationMode == ikw.AMBER ? C0100R.string.accessibility_amber_start : C0100R.string.accessibility_capture_video_start;
            case CANCEL:
            case NIGHT_CANCEL:
            case NIGHT_STOP:
                return C0100R.string.accessibility_cancel_button;
            case CONFIRM_YES_TRANSIENT:
            case CONFIRM_DISABLED:
            case CONFIRM_ENABLED:
                return C0100R.string.accessibility_done_button;
            case VIDEO_RECORDING:
                if (this.applicationMode == ikw.SLOW_MOTION) {
                    return C0100R.string.accessibility_hfr_video_stop;
                }
                return this.applicationMode == ikw.AMBER ? C0100R.string.accessibility_amber_stop : C0100R.string.accessibility_capture_video_stop;
            case IMAX_IDLE:
                return C0100R.string.accessibility_capture_imax_start;
            case IMAX_RECORDING:
                return C0100R.string.accessibility_capture_imax_stop;
            case CATSHARK_PHOTO_IDLE:
            case CATSHARK_PHOTO_PRESSED:
            case CATSHARK_PHOTO_PROCESSING:
            case NIGHT_IDLE:
            case NIGHT_PRESSED:
            case NIGHT_PROCESSING:
            case ASTRO_IDLE:
            case ASTRO_PRESSED:
                return C0100R.string.accessibility_take_nightsight_button;
            case CATSHARK_PORTRAIT_IDLE:
            case CATSHARK_PORTRAIT_PRESSED:
            case CATSHARK_PORTRAIT_PROCESSING:
                return C0100R.string.accessibility_take_catshark_portrait_button;
            case LASAGNA_IDLE:
            case LASAGNA_PRESSED:
            case LASAGNA_PROCESSING:
                return C0100R.string.accessibility_take_lasagna_button;
            case TIMELAPSE_IDLE:
            case TIMELAPSE_PRESSED:
                return C0100R.string.accessibility_cheetah_video_start;
            case TIMELAPSE_RECORDING:
            case TIMELAPSE_PROCESSING:
                return C0100R.string.accessibility_cheetah_video_stop;
            case PHOTO_LONGPRESS_LOCKED:
                return C0100R.string.accessibility_capture_video_stop;
            case f30628J:
                return C0100R.string.accessibility_autotimer_start;
            case AUTOTIMER_RUNNING:
                return C0100R.string.accessibility_autotimer_stop;
            case PHOTOSPHERE_IDLE:
                return C0100R.string.accessibility_take_photosphere_button;
            default:
                return C0100R.string.accessibility_take_photo_button;
        }
    }

    private void initialize(Context context, boolean z) {
        setLayerType(2, null);
        this.gestureDetector = new GestureDetector(context, new iff(this));
        Paint paint = new Paint();
        this.currentMainButtonPaint = paint;
        paint.setAntiAlias(true);
        this.currentMainButtonPaint.setColor(-1);
        this.currentRipplePaint = new Paint(this.currentMainButtonPaint);
        Paint paint2 = new Paint();
        this.mainInnerCircleButtonPaint = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.mainOuterCircleButtonPaint = paint3;
        paint3.setAntiAlias(true);
        this.mainOuterCircleButtonPaint.setStrokeWidth(getOuterCircleStrokeWidth());
        this.mainOuterCircleButtonPaint.setStyle(Paint.Style.STROKE);
        this.mainOuterCircleButtonPaint.setColor(-1);
        Paint paint4 = new Paint();
        this.innerDotsCirclePaint = paint4;
        paint4.setAntiAlias(true);
        Paint paint5 = new Paint(this.currentMainButtonPaint);
        this.currentPhotoCirclePaint = paint5;
        paint5.setColor(getResources().getColor(C0100R.color.camera_mode_idle_color, null));
        Paint paint6 = new Paint(this.currentMainButtonPaint);
        this.currentInnerPortraitRingPaint = paint6;
        paint6.setColor(getResources().getColor(C0100R.color.portrait_mode_inner_color, null));
        Paint paint7 = new Paint(this.currentMainButtonPaint);
        this.currentOuterPortraitRingPaint = paint7;
        paint7.setColor(getResources().getColor(C0100R.color.portrait_mode_outer_color, null));
        this.disabledFilterGreyValue = 255;
        Paint paint8 = new Paint(this.currentMainButtonPaint);
        this.currentVideoCirclePaint = paint8;
        paint8.setColor(getResources().getColor(C0100R.color.video_mode_color, null));
        Paint paint9 = new Paint();
        this.tickMarkPaint = paint9;
        paint9.setAntiAlias(true);
        this.tickMarkPaint.setColor(-1);
        this.tickMarkPaint.setStyle(Paint.Style.STROKE);
        this.tickMarkPaint.setStrokeWidth(ill.m11431b(2.3f));
        ign ignVarM11291b = ign.m11291b(ifi.PHOTO_IDLE, gzp.f26957e, this, this.isZoomLockEnabled, z);
        setCurrentSpec(ignVarM11291b);
        resetShutterButton();
        this.buttonRect = new RectF();
        this.currentScaleFactor = getDefaultScale();
        setOutlineProvider(new ifj(this));
        updateContentDescription(ignVarM11291b.f30844v);
        setClickEnabled(false);
    }

    private boolean isLasagnaShutter(ifi ifiVar) {
        return ifiVar == ifi.LASAGNA_IDLE || ifiVar == ifi.LASAGNA_PRESSED || ifiVar == ifi.LASAGNA_PROCESSING;
    }

    private void resetShutterButton() {
        ign currentSpec = getCurrentSpec();
        ifi ifiVar = currentSpec.f30844v;
        gzp gzpVar = currentSpec.f30845w;
        cancelModeTransitionAnimations(false);
        setCurrentSpec(ign.m11291b(currentSpec.f30844v, currentSpec.f30845w, this, this.isZoomLockEnabled, this.forRemoteShutter));
        invalidate();
    }

    private void runEnableChangeAnimation(boolean z, boolean z2) {
        ValueAnimator valueAnimator = this.enableStateChangeAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.disabledFilterGreyValue, true != z ? DISABLED_FILTER_COLOR_VALUE : 255);
        this.enableStateChangeAnimator = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(150L);
        this.enableStateChangeAnimator.addUpdateListener(new ibw(this, 6));
        if (!z) {
            this.enableStateChangeAnimator.setStartDelay(true != z2 ? 0L : 500L);
        }
        this.enableStateChangeAnimator.start();
    }

    private void setCurrentSpec(ign ignVar) {
        synchronized (this.currentSpecLock) {
            this.currentSpec = ignVar;
        }
        this.inFlightSpecBuilder = ignVar.m11292c();
    }

    private void setSpecsForAnimatorTransition(ign ignVar, ign ignVar2) {
        synchronized (this.currentSpecLock) {
            this.currentSpec = ignVar2;
        }
        this.inFlightSpecBuilder = ignVar.m11292c();
    }

    private void setZoomLockViewEnabled(boolean z) {
        this.isZoomLockEnabled = z;
        invalidate();
    }

    private boolean shouldDrawVideoDotOrSquare(ifi ifiVar) {
        return ifiVar == ifi.VIDEO_IDLE || ifiVar == ifi.VIDEO_PRESSED || ifiVar == ifi.AUTOTIMER_RUNNING || ifiVar == ifi.CONFIRM_ENABLED || ifiVar == ifi.CONFIRM_DISABLED || ifiVar == ifi.VIDEO_RECORDING || ifiVar == ifi.TIMELAPSE_IDLE || ifiVar == ifi.TIMELAPSE_RECORDING || ifiVar == ifi.TIMELAPSE_PRESSED || ifiVar == ifi.IMAX_RECORDING || ifiVar == ifi.NIGHT_STOP || ifiVar == ifi.AMBER_IDLE;
    }

    private void startAccessibleLongShot() {
        igf igfVar = this.listener;
        if (igfVar != null) {
            this.isAccessibleShot.set(true);
            igfVar.onShutterButtonPressedStateChanged(true);
            igfVar.onShutterButtonLongPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateAnimationProgressIndex(ifl iflVar) {
        if (this.circleAnimationIndex >= 30) {
            this.circleAnimationIndex = 0;
            boolean z = this.isCircleProgressVisible;
            this.isCircleWaitingVisible = z;
            this.isCircleProgressVisible = !z;
        }
        if (iflVar == ifl.STATE_PAUSE) {
            boolean z2 = !this.isCircleWaitingVisible;
            this.isCircleWaitingVisible = z2;
            boolean[] zArr = this.tickMarkCircleState;
            int i = this.circleAnimationIndex;
            zArr[i == 0 ? zArr.length - 1 : i - 1] = z2;
            invalidate();
            return;
        }
        if (iflVar == ifl.STATE_RESUME) {
            boolean[] zArr2 = this.tickMarkCircleState;
            int i2 = this.circleAnimationIndex;
            zArr2[i2 == 0 ? zArr2.length - 1 : i2 - 1] = this.isCircleProgressVisible;
            invalidate();
            return;
        }
        if (iflVar == ifl.STATE_UPDATED) {
            boolean[] zArr3 = this.tickMarkCircleState;
            int i3 = this.circleAnimationIndex;
            zArr3[i3] = this.isCircleProgressVisible;
            this.circleAnimationIndex = i3 + 1;
            invalidate();
        }
    }

    private void updateButtonRect() {
        int i = (int) (getCurrentSpec().f30842t * this.currentScaleFactor);
        int i2 = this.buttonCenterX - i;
        int i3 = this.buttonCenterY - i;
        int i4 = i + i;
        this.buttonRect.set(i2, i3, i4 + i2, i3 + i4);
    }

    private void updateContentDescription(ifi ifiVar) {
        super.setContentDescription(getResources().getString(getContentDescriptionIdForMode(ifiVar)));
    }

    private void updateHapticsForMode(ifi ifiVar) {
        dhv dhvVar = this.gcaConfig;
        boolean z = true;
        if (dhvVar != null && dhvVar.mo6184l(dib.f11317bX)) {
            setHapticsEnabled(true);
            return;
        }
        if (ifiVar != ifi.VIDEO_IDLE && ifiVar != ifi.IMAX_IDLE && ifiVar != ifi.IMAX_RECORDING) {
            z = false;
        }
        setHapticsEnabled(z);
    }

    private void updateTickMarkBlinkingState() {
        msgHandler.sendMessageDelayed(msgHandler.obtainMessage(MSG_UPDATE_CIRCLE_PAUSE_STATE), TICK_MARK_BLINKING_INTERVAL_MS);
    }

    public void animateToScale(float f) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.currentScaleFactor, f * getDefaultScale());
        valueAnimatorOfFloat.addUpdateListener(new ibw(this, 5));
        valueAnimatorOfFloat.setDuration(250L);
        valueAnimatorOfFloat.setInterpolator(new akf());
        valueAnimatorOfFloat.start();
    }

    public void blockClickForAnimation(boolean z) {
        isEnabled();
        this.blockClickForAnimation = z;
    }

    @Override // android.view.View
    public void buildDrawingCache(boolean z) {
        invalidate();
        super.buildDrawingCache(z);
    }

    public void cancelModeTransitionAnimations(boolean z) {
        AnimatorSet animatorSet = this.modeTransitionAnimatorSet;
        if (animatorSet != null) {
            if (z) {
                animatorSet.end();
            }
            this.modeTransitionAnimatorSet.cancel();
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        igf igfVar;
        boolean z = motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() >= ((float) getWidth()) || motionEvent.getY() >= ((float) getHeight());
        boolean z2 = z && !(this.enableLongPressMotion.get() && this.isLongPressInProgress.get());
        boolean z3 = motionEvent.getPointerCount() > 1;
        boolean z4 = motionEvent.getAction() == 0 && motionEvent.getDownTime() != motionEvent.getEventTime();
        boolean z5 = z2 | z3;
        boolean z6 = motionEvent.getActionMasked() != 1;
        boolean z7 = motionEvent.getActionMasked() != 6;
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        int i = iArr[0];
        Rect rect = new Rect(i, iArr[1], getWidth() + i, iArr[1] + getHeight());
        if (this.longPressStartMotionEvent == null) {
            this.longPressStartMotionEvent = MotionEvent.obtain(motionEvent);
        }
        ifg ifgVar = this.longPressMotionListener;
        MotionEvent motionEvent2 = this.longPressStartMotionEvent;
        if (ifgVar != null && motionEvent2 != null && this.enableLongPressMotion.get() && getMode() == ifi.PHOTO_LONGPRESS) {
            ifgVar.mo8351a(motionEvent, motionEvent2, rect, !z);
        }
        boolean z8 = (z5 | z4) & z6 & z7;
        if (!z8) {
            this.gestureDetector.onTouchEvent(motionEvent);
        }
        if (((motionEvent.getActionMasked() != 5 && motionEvent.getActionMasked() != 6 && motionEvent.getActionMasked() != 2) || z8) && this.isLongPressInProgress.compareAndSet(true, false) && (igfVar = this.listener) != null) {
            igfVar.onShutterButtonLongPressRelease();
        }
        if (motionEvent.getActionMasked() == 1) {
            this.touchCoordinate = new ili(motionEvent.getX(), motionEvent.getY(), getMeasuredWidth(), getMeasuredHeight());
            if ((isClickEnabledAndNotBlocked() || getMode() == ifi.VIDEO_PRESSED || getMode() == ifi.TIMELAPSE_PRESSED || getMode() == ifi.PHOTO_IDLE) && getVisibility() == 0) {
                performHapticIfEnabled(4);
            }
        } else if (motionEvent.getActionMasked() == 0) {
            if (isClickEnabledAndNotBlocked() && getVisibility() == 0) {
                performHapticIfEnabled(6);
            }
            performShutterTouchStart();
            performShutterButtonDown();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // p000.C0273iq, android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        igf igfVar;
        super.drawableStateChanged();
        boolean zIsPressed = isPressed();
        if (!zIsPressed && this.isLongPressInProgress.compareAndSet(true, false) && (igfVar = this.listener) != null) {
            igfVar.onShutterButtonLongPressRelease();
        }
        if (zIsPressed != this.oldPressed) {
            igf igfVar2 = this.listener;
            if (igfVar2 != null) {
                igfVar2.onShutterButtonPressedStateChanged(zIsPressed);
            }
            this.oldPressed = zIsPressed;
        }
    }

    public jwn getClickEnabledObservable() {
        return this.filteredClickEnabledObservable;
    }

    String getContentDescriptionString() {
        return super.getContentDescription().toString();
    }

    public ign getCurrentSpec() {
        ign ignVar;
        synchronized (this.currentSpecLock) {
            ignVar = this.currentSpec;
        }
        return ignVar;
    }

    protected float getDefaultScale() {
        return 1.0f;
    }

    @Override // android.widget.ImageView
    public Drawable getDrawable() {
        return getBackground();
    }

    boolean getHapticsEnabled() {
        return this.hasPressAndReleaseHaptic;
    }

    public ifi getMode() {
        return getCurrentSpec().f30844v;
    }

    AnimatorSet getModeTransitionAnimatorSet() {
        return this.modeTransitionAnimatorSet;
    }

    protected float getOuterCircleStrokeWidth() {
        return ill.m11431b(3.0f);
    }

    public int getTimelapseTickMarkVisibleCount() {
        int i = 0;
        for (boolean z : this.tickMarkCircleState) {
            if (z) {
                i++;
            }
        }
        return i;
    }

    public boolean isClickEnabled() {
        return this.clickEnabled;
    }

    public boolean isClickEnabledAndNotBlocked() {
        return !this.blockClickForAnimation && this.clickEnabled;
    }

    /* JADX INFO: renamed from: lambda$animateMainButton$1$com-google-android-apps-camera-ui-shutterbutton-ShutterButton */
    public /* synthetic */ void m4429x7a0dc3(ign ignVar, Animator animator) {
        this.inFlightSpecBuilder = ignVar.m11292c();
        invalidate();
    }

    /* JADX INFO: renamed from: lambda$animateToScale$3$com-google-android-apps-camera-ui-shutterbutton-ShutterButton */
    public /* synthetic */ void m4430x760531c1(ValueAnimator valueAnimator) {
        this.currentScaleFactor = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        updateButtonRect();
        invalidateOutline();
        invalidate();
    }

    /* JADX INFO: renamed from: lambda$new$0$com-google-android-apps-camera-ui-shutterbutton-ShutterButton */
    public /* synthetic */ Boolean m4431xa95bd856() {
        return Boolean.valueOf(this.clickEnabled);
    }

    /* JADX INFO: renamed from: lambda$runEnableChangeAnimation$2$com-google-android-apps-camera-ui-shutterbutton-ShutterButton */
    public /* synthetic */ void m4432x1bc333b8(ValueAnimator valueAnimator) {
        this.disabledFilterGreyValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        ign ignVarM11264a = this.inFlightSpecBuilder.m11264a();
        this.currentPhotoCirclePaint.setColor(ignVarM11264a.f30828f);
        this.currentPhotoCirclePaint.setAlpha(ignVarM11264a.f30827e);
        this.currentInnerPortraitRingPaint.setColor(getResources().getColor(C0100R.color.portrait_mode_inner_color, null));
        this.currentOuterPortraitRingPaint.setColor(getResources().getColor(C0100R.color.portrait_mode_outer_color, null));
        if (this.mainInnerCircleButtonPaint == null) {
            Paint paint = new Paint();
            this.mainInnerCircleButtonPaint = paint;
            paint.setAntiAlias(true);
            Paint paint2 = new Paint();
            this.mainOuterCircleButtonPaint = paint2;
            paint2.setAntiAlias(true);
            this.mainOuterCircleButtonPaint.setStrokeWidth(ill.m11431b(3.0f));
            this.mainOuterCircleButtonPaint.setStyle(Paint.Style.STROKE);
            this.mainOuterCircleButtonPaint.setColor(-1);
        }
        this.currentInnerPortraitRingPaint.setColor(getResources().getColor(C0100R.color.camera_mode_idle_color, null));
        this.currentOuterPortraitRingPaint.setColor(getResources().getColor(C0100R.color.camera_mode_idle_color, null));
        this.currentOuterPortraitRingPaint.setAlpha(127);
        this.mainInnerCircleButtonPaint.setColor(ignVarM11264a.f30841s);
        this.mainInnerCircleButtonPaint.setAlpha((int) ((ignVarM11264a.f30831i > 0 ? VIDEO_RECORDING_INTER_CIRCLE_RING_ALPHA : INTER_CIRCLE_RING_ALPHA) * 255.0f));
        this.currentRipplePaint.setAlpha(ignVarM11264a.f30839q);
        this.currentVideoCirclePaint.setColor(ignVarM11264a.f30830h);
        this.currentMainButtonPaint.setColor(ignVarM11264a.f30841s);
        ColorFilter colorFilterToApply = getColorFilterToApply(isEnabled(), ignVarM11264a.f30844v);
        if (colorFilterToApply == null) {
            isEnabled();
        }
        this.mainOuterCircleButtonPaint.setColorFilter(colorFilterToApply);
        this.mainInnerCircleButtonPaint.setColorFilter(colorFilterToApply);
        this.currentInnerPortraitRingPaint.setColorFilter(colorFilterToApply);
        this.currentOuterPortraitRingPaint.setColorFilter(colorFilterToApply);
        this.currentPhotoCirclePaint.setColorFilter(colorFilterToApply);
        this.currentVideoCirclePaint.setColorFilter(colorFilterToApply);
        this.currentMainButtonPaint.setColorFilter(colorFilterToApply);
        this.innerDotsCirclePaint.setColorFilter(colorFilterToApply);
        ifh ifhVar = this.onDrawListener;
        if (ifhVar != null) {
            ifhVar.mo7762a();
            if (isClickEnabledAndNotBlocked()) {
                this.onDrawListener.mo7763b();
            }
        }
        this.mainOuterCircleButtonPaint.setAlpha(ignVarM11264a.f30824B);
        if (!this.forRemoteShutter) {
            this.currentRipplePaint.setColor(jzn.m13803F(this));
        }
        this.currentPhotoCirclePaint.setColor(ignVarM11264a.f30828f);
        this.currentPhotoCirclePaint.setAlpha(ignVarM11264a.f30827e);
        this.innerDotsCirclePaint.setColor(ignVarM11264a.f30825C);
        canvas.drawCircle(this.buttonCenterX, this.buttonCenterY, ignVarM11264a.f30843u * this.currentScaleFactor, this.mainOuterCircleButtonPaint);
        canvas.drawCircle(this.buttonCenterX, this.buttonCenterY, ignVarM11264a.f30842t * this.currentScaleFactor, this.mainInnerCircleButtonPaint);
        int i = ignVarM11264a.f30833k;
        int i2 = ignVarM11264a.f30826d;
        if (i <= i2 || ignVarM11264a.f30832j <= i2) {
            canvas.drawCircle(this.buttonCenterX, this.buttonCenterY, i * this.currentScaleFactor, this.currentOuterPortraitRingPaint);
        }
        int i3 = ignVarM11264a.f30832j;
        if (i3 < ignVarM11264a.f30826d) {
            canvas.drawCircle(this.buttonCenterX, this.buttonCenterY, i3 * this.currentScaleFactor, this.currentInnerPortraitRingPaint);
        }
        if (ignVarM11264a.f30827e > 0) {
            canvas.drawCircle(this.buttonCenterX, this.buttonCenterY, ignVarM11264a.f30826d * this.currentScaleFactor, this.currentPhotoCirclePaint);
        }
        if (ignVarM11264a.f30838p) {
            if (ignVarM11264a.f30840r >= getResources().getDimensionPixelSize(C0100R.dimen.long_pressed_transit_radius)) {
                if (!isLasagnaShutter(ignVarM11264a.f30844v)) {
                    this.currentRipplePaint.setColor(getResources().getColor(ignVarM11264a.f30844v == ifi.PHOTO_LONGPRESS ? C0100R.color.video_mode_idle_color : C0100R.color.long_shot_transition_color, null));
                }
            } else if (ignVarM11264a.f30844v == ifi.PHOTO_LONGPRESS && ignVarM11264a.f30840r == getResources().getDimensionPixelSize(C0100R.dimen.photo_button_inner_radius)) {
                this.currentRipplePaint.setColor(getResources().getColor(C0100R.color.camera_mode_idle_color, null));
            }
            canvas.drawCircle(this.buttonCenterX, this.buttonCenterY, ignVarM11264a.f30840r * this.currentScaleFactor, this.currentRipplePaint);
        }
        if (shouldDrawVideoDotOrSquare(ignVarM11264a.f30844v) || this.isVideoButtonAnimating) {
            int i4 = ignVarM11264a.f30829g;
            if (i4 > 0) {
                canvas.drawCircle(this.buttonCenterX, this.buttonCenterY, i4 * this.currentScaleFactor, this.currentVideoCirclePaint);
            }
            if (ignVarM11264a.f30831i > 0 && ignVarM11264a.f30823A > 0) {
                drawTickMarkForCircleEdge(canvas);
            }
        }
        Drawable.ConstantState constantState = (Drawable.ConstantState) ignVarM11264a.f30834l.mo16812f();
        if (constantState != null) {
            Drawable drawableMutate = constantState.newDrawable().mutate();
            drawableMutate.setColorFilter(colorFilterToApply);
            int i5 = ignVarM11264a.f30837o;
            int i6 = this.buttonCenterX;
            int i7 = this.buttonCenterY;
            drawableMutate.setBounds(i6 - i5, i7 - i5, i6 + i5, i7 + i5);
            drawableMutate.getBounds();
            drawableMutate.draw(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ifi ifiVar = getCurrentSpec().f30844v;
        if (ifiVar == ifi.PHOTO_IDLE || ifiVar == ifi.CATSHARK_PHOTO_IDLE) {
            accessibilityNodeInfo.removeAction(this.longShotEndAccessibilityAction);
            accessibilityNodeInfo.addAction(this.longShotStartAccessibilityAction);
        } else if (ifiVar != ifi.PHOTO_LONGPRESS && ifiVar != ifi.PHOTO_LONGPRESS_LOCKED) {
            accessibilityNodeInfo.removeAction(this.longShotStartAccessibilityAction);
            accessibilityNodeInfo.removeAction(this.longShotEndAccessibilityAction);
        } else {
            if (this.isAccessibleShot.get()) {
                setEnabled(true);
            }
            accessibilityNodeInfo.removeAction(this.longShotStartAccessibilityAction);
            accessibilityNodeInfo.addAction(this.longShotEndAccessibilityAction);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        updateButtonRect();
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        this.buttonCenterX = i / 2;
        this.buttonCenterY = i2 / 2;
        updateButtonRect();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void pauseTimelapseAnimationState() {
        if (progressState == ifl.STATE_PAUSE || progressState == ifl.STATE_NONE) {
            return;
        }
        updateTickMarkBlinkingState();
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (i == C0100R.id.action_long_shot_start) {
            startAccessibleLongShot();
            return true;
        }
        if (i != C0100R.id.action_long_shot_end) {
            return super.performAccessibilityAction(i, bundle);
        }
        endAccessibleLongShot();
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        igf igfVar;
        if (!isClickEnabledAndNotBlocked()) {
            isEnabled();
            return false;
        }
        boolean zPerformClick = super.performClick();
        if (getVisibility() == 0 && (igfVar = this.listener) != null) {
            ili iliVar = this.touchCoordinate;
            if (iliVar != null) {
                igfVar.onShutterTouch(iliVar);
            }
            this.touchCoordinate = null;
            this.listener.onShutterButtonClick();
        }
        return zPerformClick;
    }

    public void performHapticIfEnabled(int i) {
        if (this.hasPressAndReleaseHaptic) {
            performHapticFeedback(i);
        }
    }

    public void performShutterButtonDown() {
        if (!isClickEnabledAndNotBlocked() || getVisibility() != 0) {
            isEnabled();
            getVisibility();
        } else {
            igf igfVar = this.listener;
            if (igfVar != null) {
                igfVar.onShutterButtonDown();
            }
        }
    }

    public void performShutterTouchStart() {
        igf igfVar = this.listener;
        if (igfVar != null) {
            igfVar.onShutterTouchStart();
        }
    }

    public void resetTo(ifi ifiVar) {
        resetTo(ifiVar, getCurrentSpec().f30845w);
    }

    public void resumeTimelapseAnimationState() {
        if (progressState == ifl.STATE_RESUME || progressState == ifl.STATE_NONE) {
            return;
        }
        progressState = ifl.STATE_RESUME;
        msgHandler.removeMessages(MSG_UPDATE_CIRCLE_PAUSE_STATE);
        msgHandler.sendMessage(msgHandler.obtainMessage(MSG_UPDATE_CIRCLE_RESUME_STATE));
    }

    public void runPressedStateAnimation(boolean z, iga igaVar) {
        ifi mode = getMode();
        if (z) {
            if (!isEnabled() || !this.clickEnabled) {
                isEnabled();
                return;
            }
            igaVar.m11185b(BUTTON_CLICK_SPLASH_FACTOR, 100).start();
            ifi ifiVar = ifi.PHOTO_IDLE;
            switch (mode.ordinal()) {
                case 0:
                    setMode(ifi.PHOTO_PRESSED, igaVar);
                    break;
                case 2:
                    setMode(ifi.PORTRAIT_PRESSED, igaVar);
                    break;
                case 13:
                    setMode(ifi.CATSHARK_PHOTO_PRESSED, igaVar);
                    break;
                case 16:
                    setMode(ifi.CATSHARK_PORTRAIT_PRESSED, igaVar);
                    break;
                case 19:
                    setMode(ifi.NIGHT_PRESSED, igaVar);
                    break;
                case 24:
                    setMode(ifi.ASTRO_PRESSED, igaVar);
                    break;
                case 26:
                    setMode(ifi.LASAGNA_PRESSED, igaVar);
                    break;
            }
        }
        igaVar.m11185b(1.0f, BUTTON_CLICK_SPLASH_IN_DURATION_MS).start();
        ifi ifiVar2 = ifi.PHOTO_IDLE;
        switch (mode.ordinal()) {
            case 1:
                setMode(ifi.PHOTO_IDLE, igaVar);
                break;
            case 3:
                setMode(ifi.PORTRAIT_IDLE, igaVar);
                break;
            case 5:
                setMode(ifi.VIDEO_RECORDING, igaVar);
                break;
            case 14:
                setMode(ifi.CATSHARK_PHOTO_IDLE, igaVar);
                break;
            case 17:
                setMode(ifi.CATSHARK_PORTRAIT_IDLE, igaVar);
                break;
            case 20:
            case 21:
                setMode(ifi.NIGHT_IDLE, igaVar);
                break;
            case 25:
                setMode(ifi.ASTRO_IDLE, igaVar);
                break;
            case 27:
                setMode(ifi.LASAGNA_IDLE, igaVar);
                break;
            case 30:
                setMode(ifi.TIMELAPSE_RECORDING, igaVar);
                break;
        }
    }

    public void setApplicationMode(ikw ikwVar) {
        this.applicationMode = ikwVar;
    }

    public void setClickEnabled(boolean z) {
        getClass().getSimpleName();
        isEnabled();
        isClickable();
        this.clickEnabled = z;
        setClickable(z);
        this.clickEnabledObservable.m13643c();
        invalidate();
    }

    public void setContentDescription(int i) {
        super.setContentDescription(getResources().getString(i));
    }

    public void setEnableLongPressMotion(boolean z) {
        this.enableLongPressMotion.set(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        setEnabled(z, true);
    }

    public void setHapticsEnabled(boolean z) {
        this.hasPressAndReleaseHaptic = z;
    }

    public void setListener(igf igfVar) {
        this.listener = igfVar;
    }

    public void setLongPressMotionListener(ifg ifgVar) {
        this.longPressMotionListener = ifgVar;
    }

    public void setMode(ifi ifiVar, gzp gzpVar, iga igaVar) {
        updateContentDescription(ifiVar);
        updateHapticsForMode(ifiVar);
        dhv dhvVar = this.gcaConfig;
        if (dhvVar != null) {
            setZoomLockViewEnabled(dhvVar.mo6184l(dii.f11540p));
        }
        ign currentSpec = getCurrentSpec();
        if (ifiVar == currentSpec.f30844v && gzpVar == currentSpec.f30845w) {
            return;
        }
        gzp gzpVar2 = currentSpec.f30845w;
        animateMainButton(ifiVar, gzpVar, igaVar);
        setTag(ifiVar.toString());
    }

    public void setOnDrawListener(ifh ifhVar) {
        lku.m15614I(this.onDrawListener == null, "Cannot set on draw listener more than once.");
        this.onDrawListener = ifhVar;
        invalidate();
    }

    public void setVideoButtonAnimating(boolean z) {
        this.isVideoButtonAnimating = z;
    }

    public void setVisualFeedbackForEnableState(boolean z) {
        this.visualFeedbackForEnableState = z;
    }

    public void startTimelapseCircleAnimation() {
        if (progressState == ifl.STATE_NONE) {
            Arrays.fill(this.tickMarkCircleState, false);
            msgHandler = new ifk(this);
        }
        this.circleAnimationIndex = 0;
        this.isCircleProgressVisible = true;
        this.isCircleWaitingVisible = true;
        progressState = ifl.STATE_IDLE;
        this.tickMarkPaint.setColor(-1);
        this.tickMarkPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        this.tickMarkPaint.setStyle(Paint.Style.STROKE);
        this.tickMarkPaint.setStrokeWidth(ill.m11431b(2.3f));
    }

    public void stopTimelapseCircleAnimation() {
        if (progressState == ifl.STATE_NONE) {
            return;
        }
        progressState = ifl.STATE_NONE;
        msgHandler.removeCallbacksAndMessages(null);
        this.circleAnimationIndex = 0;
        this.isCircleProgressVisible = false;
        this.isCircleWaitingVisible = false;
        Arrays.fill(this.tickMarkCircleState, false);
        this.tickMarkPaint.reset();
        this.tickMarkPaint.setAntiAlias(true);
        this.tickMarkPaint.setColor(0);
        this.tickMarkPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public void updateTimelapseProgressState() {
        if (progressState == ifl.STATE_PAUSE || progressState == ifl.STATE_NONE) {
            return;
        }
        msgHandler.sendMessage(msgHandler.obtainMessage(MSG_UPDATE_CIRCLE_PROGRESS_STATE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShutterButton(Context context, AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this.blockClickForAnimation = false;
        this.clickEnabled = false;
        jws jwsVar = new jws(new dfg(this, 6));
        this.clickEnabledObservable = jwsVar;
        this.filteredClickEnabledObservable = jwj.m13624c(jwsVar);
        this.isLongPressInProgress = new AtomicBoolean(false);
        this.enableLongPressMotion = new AtomicBoolean(false);
        this.isAccessibleShot = new AtomicBoolean(false);
        this.currentSpecLock = new Object();
        this.tickMarkCircleState = new boolean[30];
        this.isZoomLockEnabled = false;
        this.forRemoteShutter = false;
        this.hasPressAndReleaseHaptic = false;
        this.visualFeedbackForEnableState = true;
        this.longShotStartAccessibilityAction = new AccessibilityNodeInfo.AccessibilityAction(C0100R.id.action_long_shot_start, getResources().getString(C0100R.string.accessibility_longshot_capture));
        this.longShotEndAccessibilityAction = new AccessibilityNodeInfo.AccessibilityAction(C0100R.id.action_long_shot_end, getResources().getString(C0100R.string.accessibility_capture_video_stop));
        getClass().getSimpleName();
        long longPressTimeout = ViewConfiguration.getLongPressTimeout();
        if (longPressTimeout <= 0) {
            ((nbe) ((nbe) logger.m17252c()).mo17276G(4229)).mo17292q("System has invalid long press threshold value=%d ms", longPressTimeout);
        }
        this.forRemoteShutter = z;
        initialize(context, z);
        if (context instanceof cdp) {
            this.gcaConfig = ((cdp) context).mo3499a();
        }
    }

    public void resetTo(ifi ifiVar, gzp gzpVar) {
        setCurrentSpec(ign.m11291b(ifiVar, gzpVar, this, this.isZoomLockEnabled, this.forRemoteShutter));
        resetShutterButton();
    }

    public void setEnabled(boolean z, boolean z2) {
        getClass().getSimpleName();
        isEnabled();
        isClickable();
        super.setEnabled(z);
        setClickEnabled(z);
        runEnableChangeAnimation(z, z2);
    }

    public void setMode(ifi ifiVar, iga igaVar) {
        setMode(ifiVar, getCurrentSpec().f30845w, igaVar);
    }
}
