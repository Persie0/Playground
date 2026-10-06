package com.google.android.apps.camera.bottombar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ImageButton;
import p000.ilj;
import p000.jvd;
import p000.jzn;
import p000.lku;
import p000.mqu;
import p000.mrm;
import p000.nbh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class RoundedThumbnailView extends ImageButton {
    private static final float HIT_STATE_CIRCLE_OPACITY_SHOW = 0.7f;
    private static final long HIT_STATE_DURATION_MS = 150;
    private static final int MAX_THUMBNAIL_BITMAP_SIZE = 512;
    private static final int PLACEHOLDER_ICON_COLOR = -10525848;
    private static final long RIPPLE_DURATION_MS = 200;
    private static final float RIPPLE_OPACITY_BEGIN = 0.4f;
    private static final float RIPPLE_OPACITY_END = 0.0f;
    private static final long RIPPLE_START_DELAY_MS = 100;
    private static final float THUMBNAIL_FLASH_CIRCLE_OPACITY_BEGIN = 0.8f;
    private static final float THUMBNAIL_FLASH_CIRCLE_OPACITY_END = 0.0f;
    private static final long THUMBNAIL_FLASH_DURATION_MS = 200;
    private static final float THUMBNAIL_REVEAL_CIRCLE_OPACITY_BEGIN = 0.5f;
    private static final float THUMBNAIL_REVEAL_CIRCLE_OPACITY_END = 0.0f;
    private static final long THUMBNAIL_SHRINK_DURATION_MS = 200;
    private static final long THUMBNAIL_STRETCH_DURATION_MS = 200;
    private static final nbh logger = nbh.m17259h("com/google/android/apps/camera/bottombar/RoundedThumbnailView");
    private RevealRequest backgroundRequest;
    private float badgeOffset;
    private Paint badgePaint;
    private float badgeSize;
    private Paint borderStrokePaint;
    private ValueAnimator burstFlashAnimator;
    private mrm callback;
    private float currentHitStateCircleOpacity;
    private float currentRevealCircleOpacity;
    private float currentRippleRingDiameter;
    private float currentRippleRingOpacity;
    private float currentRippleRingThickness;
    private float currentThumbnailDiameter;
    private RevealRequest foregroundRequest;
    private Paint hitStateCirclePaint;
    private final ValueAnimator hitStateFadeOutAnimator;
    private float innerStrokeWidth;
    private final View.OnClickListener onClickListener;
    private mrm optionalOnClickListener;
    private RevealRequest pendingRequest;
    private Paint revealCirclePaint;
    private ValueAnimator rippleAnimator;
    private Paint ripplePaint;
    private float rippleRingDiameterBegin;
    private float rippleRingDiameterEnd;
    private float rippleRingThicknessBegin;
    private float rippleRingThicknessEnd;
    private boolean showLockedBadge;
    private boolean shrinkTouchArea;
    private AnimatorSet thumbnailAnimatorSet;
    private float thumbnailPadding;
    private float thumbnailShrinkDiameterBegin;
    private float thumbnailShrinkDiameterEnd;
    private float thumbnailStretchDiameterBegin;
    private float thumbnailStretchDiameterEnd;
    private float thumbnailTypeIconSize;
    private int touchShrinkSize;
    private RectF viewRect;

    /* JADX INFO: renamed from: com.google.android.apps.camera.bottombar.RoundedThumbnailView$5 */
    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes.dex */
    /* synthetic */ class C01055 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$android$apps$camera$uiutils$TypedThumbnailBitmap$ThumbnailType */
        static final /* synthetic */ int[] f6565x2330d0c4;

        static {
            int[] iArr = new int[ilj.values().length];
            f6565x2330d0c4 = iArr;
            try {
                iArr[ilj.BURST.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f6565x2330d0c4[ilj.PHOTO.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f6565x2330d0c4[ilj.VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f6565x2330d0c4[ilj.SECURE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                f6565x2330d0c4[ilj.MARS_PLACEHOLDER.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f6565x2330d0c4[ilj.PLACEHOLDER.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
        }
    }

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes.dex */
    public interface Callback {
        void onClickAnimationEnd();

        boolean onLongPress();
    }

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes.dex */
    class RevealRequest {
        private String accessibilityString;
        private boolean animationDisabled;
        private boolean rippleAnimationFinished;
        private boolean thumbnailAnimationFinished;
        private Paint thumbnailPaint;
        private float viewSize;

        private RevealRequest(float f, String str) {
            this.accessibilityString = str;
            this.viewSize = f;
        }

        static RevealRequest createAnimatedRevealRequest(float f, String str) {
            return new RevealRequest(f, str);
        }

        static RevealRequest createNonAnimatedRevealRequest(float f, String str) {
            RevealRequest revealRequest = new RevealRequest(f, str);
            revealRequest.animationDisabled = true;
            return revealRequest;
        }

        private void precomputeThumbnailPaint(Bitmap bitmap, int i) {
            if (this.thumbnailPaint == null && bitmap != null && bitmap.getWidth() == bitmap.getHeight()) {
                BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
                if (bitmap.getWidth() != this.viewSize) {
                    RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
                    float f = this.viewSize;
                    RectF rectF2 = new RectF(0.0f, 0.0f, f, f);
                    Matrix matrix = new Matrix();
                    matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
                    matrix.preRotate(i, rectF.width() / 2.0f, rectF.height() / 2.0f);
                    bitmapShader.setLocalMatrix(matrix);
                }
                Paint paint = new Paint();
                this.thumbnailPaint = paint;
                paint.setAntiAlias(true);
                this.thumbnailPaint.setShader(bitmapShader);
            }
        }

        public void finishRippleAnimation() {
            this.rippleAnimationFinished = true;
        }

        public void finishThumbnailAnimation() {
            this.thumbnailAnimationFinished = true;
        }

        public String getAccessibilityString() {
            return this.accessibilityString;
        }

        public Paint getThumbnailPaint() {
            return this.thumbnailPaint;
        }

        public boolean isAnimationDisabled() {
            return this.animationDisabled;
        }

        public boolean isFinished() {
            return this.thumbnailAnimationFinished && this.rippleAnimationFinished;
        }

        public void setThumbnailBitmap(Bitmap bitmap, int i) {
            int i2;
            if (bitmap.getWidth() != bitmap.getHeight()) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i3 = 512;
                if (width > 512 || height > 512) {
                    if (width > height) {
                        i2 = (height * 512) / width;
                    } else {
                        i3 = (width * 512) / height;
                        i2 = 512;
                    }
                    bitmap = Bitmap.createScaledBitmap(bitmap, i3, i2, false);
                }
                int width2 = bitmap.getWidth();
                int height2 = bitmap.getHeight();
                bitmap = width2 >= height2 ? Bitmap.createBitmap(bitmap, (width2 / 2) - (height2 / 2), 0, height2, height2) : Bitmap.createBitmap(bitmap, 0, (height2 / 2) - (width2 / 2), width2, width2);
            }
            precomputeThumbnailPaint(bitmap, i);
        }
    }

    public RoundedThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mqu mquVar = mqu.f41450a;
        this.callback = mquVar;
        this.optionalOnClickListener = mquVar;
        this.shrinkTouchArea = false;
        this.hitStateFadeOutAnimator = ValueAnimator.ofFloat(HIT_STATE_CIRCLE_OPACITY_SHOW, 0.0f);
        this.showLockedBadge = false;
        this.onClickListener = new View.OnClickListener() { // from class: com.google.android.apps.camera.bottombar.RoundedThumbnailView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (view.isClickable()) {
                    if (RoundedThumbnailView.this.callback.mo16813g()) {
                        ((Callback) RoundedThumbnailView.this.callback.mo16809c()).onClickAnimationEnd();
                    }
                    if (RoundedThumbnailView.this.optionalOnClickListener.mo16813g()) {
                        ((View.OnClickListener) RoundedThumbnailView.this.optionalOnClickListener.mo16809c()).onClick(view);
                    }
                }
            }
        };
        initialize();
    }

    private void clearAnimations() {
        AnimatorSet animatorSet = this.thumbnailAnimatorSet;
        if (animatorSet != null && animatorSet.isStarted()) {
            this.thumbnailAnimatorSet.removeAllListeners();
            this.thumbnailAnimatorSet.cancel();
            this.thumbnailAnimatorSet = null;
        }
        ValueAnimator valueAnimator = this.rippleAnimator;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            this.rippleAnimator.removeAllListeners();
            this.rippleAnimator.cancel();
            this.rippleAnimator = null;
        }
        ValueAnimator valueAnimator2 = this.burstFlashAnimator;
        if (valueAnimator2 == null || !valueAnimator2.isStarted()) {
            return;
        }
        this.burstFlashAnimator.removeAllListeners();
        this.burstFlashAnimator.cancel();
        this.burstFlashAnimator = null;
    }

    private void drawLockedFolderBadge(Canvas canvas, float f, float f2) {
        float f3 = this.badgeOffset;
        canvas.drawCircle(f + f3, f3 + f2, (this.badgeSize - this.innerStrokeWidth) / 2.0f, this.badgePaint);
        Drawable drawable = getResources().getDrawable(C0100R.drawable.quantum_gm_ic_lock_vd_theme_24, null);
        drawable.mutate().setTint(jzn.m13798A(this));
        float f4 = this.badgeOffset + f;
        float f5 = this.badgeSize;
        int i = (int) (f4 - (f5 / 4.0f));
        int i2 = (((int) f5) / 2) + i;
        drawable.setBounds(i, i, i2, i2);
        drawable.draw(canvas);
        this.borderStrokePaint.setStrokeWidth(this.innerStrokeWidth);
        float f6 = this.badgeOffset;
        canvas.drawCircle(f + f6, f2 + f6, (this.badgeSize - this.innerStrokeWidth) / 2.0f, this.borderStrokePaint);
    }

    private int getColor(int i) {
        return getResources().getColor(i, null);
    }

    private void initialize() {
        super.setOnClickListener(this.onClickListener);
        setOnLongClickListener(new View.OnLongClickListener() { // from class: com.google.android.apps.camera.bottombar.RoundedThumbnailView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f$0.m4060x9cd5ab1(view);
            }
        });
        setClickable(true);
        this.thumbnailPadding = getResources().getDimension(C0100R.dimen.rounded_thumbnail_padding);
        this.thumbnailStretchDiameterBegin = getResources().getDimension(C0100R.dimen.rounded_thumbnail_diameter_min);
        float dimension = getResources().getDimension(C0100R.dimen.rounded_thumbnail_diameter_max);
        this.thumbnailStretchDiameterEnd = dimension;
        this.thumbnailShrinkDiameterBegin = dimension;
        this.thumbnailShrinkDiameterEnd = getResources().getDimension(C0100R.dimen.rounded_thumbnail_diameter_normal);
        this.thumbnailTypeIconSize = getResources().getDimension(C0100R.dimen.rounded_thumbnail_type_icon_size);
        float dimension2 = getResources().getDimension(C0100R.dimen.rounded_thumbnail_ripple_ring_diameter_max);
        this.rippleRingDiameterEnd = dimension2;
        this.viewRect = new RectF(0.0f, 0.0f, dimension2, dimension2);
        this.rippleRingDiameterBegin = getResources().getDimension(C0100R.dimen.rounded_thumbnail_ripple_ring_diameter_min);
        this.rippleRingThicknessBegin = getResources().getDimension(C0100R.dimen.rounded_thumbnail_ripple_ring_thick_max);
        this.rippleRingThicknessEnd = getResources().getDimension(C0100R.dimen.rounded_thumbnail_ripple_ring_thick_min);
        this.touchShrinkSize = getResources().getDimensionPixelOffset(C0100R.dimen.rounded_thumbnail_shrink_size);
        Paint paint = new Paint(1);
        this.hitStateCirclePaint = paint;
        paint.setColor(-1);
        this.hitStateCirclePaint.setStyle(Paint.Style.FILL);
        this.hitStateFadeOutAnimator.setDuration(HIT_STATE_DURATION_MS);
        this.hitStateFadeOutAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        this.hitStateFadeOutAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.apps.camera.bottombar.RoundedThumbnailView$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.m4061xfd5cdef2(valueAnimator);
            }
        });
        Paint paint2 = new Paint(1);
        this.ripplePaint = paint2;
        paint2.setColor(-1);
        this.ripplePaint.setStyle(Paint.Style.STROKE);
        Paint paint3 = new Paint(1);
        this.revealCirclePaint = paint3;
        paint3.setColor(-1);
        this.revealCirclePaint.setStyle(Paint.Style.FILL);
        Paint paint4 = new Paint(1);
        this.borderStrokePaint = paint4;
        paint4.setStyle(Paint.Style.STROKE);
        float dimension3 = getResources().getDimension(C0100R.dimen.rounded_thumbnail_inner_stroke_width);
        this.innerStrokeWidth = dimension3;
        this.borderStrokePaint.setStrokeWidth(dimension3);
        this.borderStrokePaint.setColor(-1);
        Paint paint5 = new Paint(1);
        this.badgePaint = paint5;
        paint5.setColor(jzn.m13803F(this));
        this.badgePaint.setStyle(Paint.Style.FILL);
        this.badgeSize = getResources().getDimension(C0100R.dimen.badge_size);
        this.badgeOffset = getResources().getDimension(C0100R.dimen.badge_offset_from_center);
        setThumbnail(getDefaultThumbnail(ilj.PLACEHOLDER), 0, false);
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            Drawable drawableMutate = background.getConstantState().newDrawable().mutate();
            ((RippleDrawable) drawableMutate).setRadius(getResources().getDimensionPixelSize(C0100R.dimen.camera_switch_button_ripple_diameter) / 2);
            setBackground(drawableMutate);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processRevealRequests() {
        RevealRequest revealRequest = this.foregroundRequest;
        if (revealRequest == null || !revealRequest.isFinished()) {
            return;
        }
        this.backgroundRequest = this.foregroundRequest;
        this.foregroundRequest = null;
    }

    private void runBurstFlashAnimation() {
        RevealRequest revealRequest = this.foregroundRequest;
        if (revealRequest != null) {
            this.backgroundRequest = revealRequest;
            revealRequest.finishRippleAnimation();
            this.backgroundRequest.finishThumbnailAnimation();
        }
        this.foregroundRequest = this.backgroundRequest;
        this.pendingRequest = null;
        clearAnimations();
        setVisibility(0);
        Interpolator interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(getContext(), android.R.interpolator.fast_out_slow_in);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.thumbnailStretchDiameterBegin, this.thumbnailShrinkDiameterEnd);
        this.burstFlashAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(200L);
        this.burstFlashAnimator.setInterpolator(interpolatorLoadInterpolator);
        this.burstFlashAnimator.setRepeatCount(-1);
        this.burstFlashAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.apps.camera.bottombar.RoundedThumbnailView$$ExternalSyntheticLambda2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.m4062x74c8f30f(valueAnimator);
            }
        });
        this.burstFlashAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.apps.camera.bottombar.RoundedThumbnailView.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                RoundedThumbnailView.this.burstFlashAnimator = null;
            }
        });
        this.burstFlashAnimator.start();
    }

    private void runPendingRequestAnimation() {
        RevealRequest revealRequest = this.pendingRequest;
        lku.m15662p(revealRequest);
        boolean z = !revealRequest.isAnimationDisabled();
        if (z) {
            this.backgroundRequest = null;
            RevealRequest revealRequest2 = this.foregroundRequest;
            if (revealRequest2 != null) {
                this.backgroundRequest = revealRequest2;
                revealRequest2.finishRippleAnimation();
                this.backgroundRequest.finishThumbnailAnimation();
            }
        }
        RevealRequest revealRequest3 = this.pendingRequest;
        this.foregroundRequest = revealRequest3;
        this.pendingRequest = null;
        if (!z) {
            if (this.thumbnailAnimatorSet == null) {
                this.currentThumbnailDiameter = this.thumbnailShrinkDiameterEnd;
                this.currentRevealCircleOpacity = 0.0f;
                lku.m15662p(revealRequest3);
                revealRequest3.finishThumbnailAnimation();
            }
            if (this.rippleAnimator == null) {
                RevealRequest revealRequest4 = this.foregroundRequest;
                lku.m15662p(revealRequest4);
                revealRequest4.finishRippleAnimation();
            }
            invalidate();
            return;
        }
        clearAnimations();
        setVisibility(0);
        Interpolator interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(getContext(), android.R.interpolator.fast_out_slow_in);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.thumbnailStretchDiameterBegin, this.thumbnailStretchDiameterEnd);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(interpolatorLoadInterpolator);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.apps.camera.bottombar.RoundedThumbnailView$$ExternalSyntheticLambda3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.m4063x7085e004(valueAnimator);
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.thumbnailShrinkDiameterBegin, this.thumbnailShrinkDiameterEnd);
        valueAnimatorOfFloat2.setDuration(200L);
        valueAnimatorOfFloat2.setInterpolator(interpolatorLoadInterpolator);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.apps.camera.bottombar.RoundedThumbnailView$$ExternalSyntheticLambda4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.m4064x64156445(valueAnimator);
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.thumbnailAnimatorSet = animatorSet;
        animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.thumbnailAnimatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.apps.camera.bottombar.RoundedThumbnailView.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (RoundedThumbnailView.this.foregroundRequest != null) {
                    RoundedThumbnailView.this.foregroundRequest.finishThumbnailAnimation();
                    RoundedThumbnailView.this.processRevealRequests();
                }
                RoundedThumbnailView.this.thumbnailAnimatorSet = null;
            }
        });
        this.thumbnailAnimatorSet.start();
        Interpolator interpolatorLoadInterpolator2 = AnimationUtils.loadInterpolator(getContext(), android.R.interpolator.linear_out_slow_in);
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(this.rippleRingDiameterBegin, this.rippleRingDiameterEnd);
        this.rippleAnimator = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(200L);
        this.rippleAnimator.setInterpolator(interpolatorLoadInterpolator2);
        this.rippleAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.apps.camera.bottombar.RoundedThumbnailView.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (RoundedThumbnailView.this.foregroundRequest != null) {
                    RoundedThumbnailView.this.foregroundRequest.finishRippleAnimation();
                    RoundedThumbnailView.this.processRevealRequests();
                }
                RoundedThumbnailView.this.rippleAnimator = null;
            }
        });
        this.rippleAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.apps.camera.bottombar.RoundedThumbnailView$$ExternalSyntheticLambda5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.m4065x57a4e886(valueAnimator);
            }
        });
        this.rippleAnimator.setStartDelay(RIPPLE_START_DELAY_MS);
        this.rippleAnimator.start();
        RevealRequest revealRequest5 = this.foregroundRequest;
        lku.m15662p(revealRequest5);
        announceForAccessibility(revealRequest5.getAccessibilityString());
    }

    private void stopBurstFlashAnimation() {
        ValueAnimator valueAnimator = this.burstFlashAnimator;
        if (valueAnimator != null) {
            valueAnimator.setRepeatCount(0);
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.shrinkTouchArea && motionEvent.getAction() == 0 && motionEvent.getY() < this.touchShrinkSize) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void flashThumbnail() {
        jvd.m13538a();
        runBurstFlashAnimation();
    }

    public Bitmap getDefaultThumbnail(ilj iljVar) {
        int i = (int) this.thumbnailShrinkDiameterEnd;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(getColor(C0100R.color.indicator_background));
        ilj iljVar2 = ilj.PLACEHOLDER;
        Drawable drawable = null;
        switch (iljVar) {
            case PLACEHOLDER:
                bitmapCreateBitmap.eraseColor(PLACEHOLDER_ICON_COLOR);
                return bitmapCreateBitmap;
            case MARS_PLACEHOLDER:
                drawable = getResources().getDrawable(C0100R.drawable.quantum_gm_ic_lock_vd_theme_24, null);
                drawable.mutate().setTint(jzn.m13798A(this));
                bitmapCreateBitmap.eraseColor(jzn.m13803F(this));
                break;
            case PHOTO:
                drawable = getResources().getDrawable(C0100R.drawable.ic_camera_thumbnail, null);
                break;
            case BURST:
                drawable = getResources().getDrawable(C0100R.drawable.ic_burst_thumbnail, null);
                break;
            case VIDEO:
                drawable = getResources().getDrawable(C0100R.drawable.ic_videocam_thumbnail, null);
                break;
            case SECURE:
                drawable = getResources().getDrawable(C0100R.drawable.quantum_gm_ic_lock_vd_theme_24, null);
                break;
        }
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (drawable != null) {
            float f = this.thumbnailTypeIconSize;
            int i2 = (int) ((i - f) / 2.0f);
            int i3 = ((int) f) + i2;
            drawable.setBounds(i2, i2, i3, i3);
            drawable.draw(canvas);
        }
        return bitmapCreateBitmap;
    }

    public float getRippleRingMaxDiameterDp() {
        return this.rippleRingDiameterEnd;
    }

    public float getThumbnailFinalDiameter() {
        return this.thumbnailShrinkDiameterEnd;
    }

    public float getThumbnailPadding() {
        return this.thumbnailPadding;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return true;
    }

    /* JADX INFO: renamed from: lambda$initialize$0$com-google-android-apps-camera-bottombar-RoundedThumbnailView */
    public /* synthetic */ boolean m4060x9cd5ab1(View view) {
        if (view.isClickable() && this.callback.mo16813g()) {
            return ((Callback) this.callback.mo16809c()).onLongPress();
        }
        return false;
    }

    /* JADX INFO: renamed from: lambda$initialize$1$com-google-android-apps-camera-bottombar-RoundedThumbnailView */
    public /* synthetic */ void m4061xfd5cdef2(ValueAnimator valueAnimator) {
        this.currentHitStateCircleOpacity = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    /* JADX INFO: renamed from: lambda$runBurstFlashAnimation$5$com-google-android-apps-camera-bottombar-RoundedThumbnailView */
    public /* synthetic */ void m4062x74c8f30f(ValueAnimator valueAnimator) {
        this.currentThumbnailDiameter = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.currentRevealCircleOpacity = (valueAnimator.getAnimatedFraction() * (-0.8f)) + THUMBNAIL_FLASH_CIRCLE_OPACITY_BEGIN;
        invalidate();
    }

    /* JADX INFO: renamed from: lambda$runPendingRequestAnimation$2$com-google-android-apps-camera-bottombar-RoundedThumbnailView */
    public /* synthetic */ void m4063x7085e004(ValueAnimator valueAnimator) {
        this.currentThumbnailDiameter = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.currentRevealCircleOpacity = (valueAnimator.getAnimatedFraction() * (-0.5f)) + THUMBNAIL_REVEAL_CIRCLE_OPACITY_BEGIN;
        invalidate();
    }

    /* JADX INFO: renamed from: lambda$runPendingRequestAnimation$3$com-google-android-apps-camera-bottombar-RoundedThumbnailView */
    public /* synthetic */ void m4064x64156445(ValueAnimator valueAnimator) {
        this.currentThumbnailDiameter = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    /* JADX INFO: renamed from: lambda$runPendingRequestAnimation$4$com-google-android-apps-camera-bottombar-RoundedThumbnailView */
    public /* synthetic */ void m4065x57a4e886(ValueAnimator valueAnimator) {
        this.currentRippleRingDiameter = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f = this.rippleRingThicknessBegin;
        this.currentRippleRingThickness = f + ((this.rippleRingThicknessEnd - f) * animatedFraction);
        this.currentRippleRingOpacity = (animatedFraction * (-0.4f)) + RIPPLE_OPACITY_BEGIN;
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        ValueAnimator valueAnimator;
        Paint thumbnailPaint;
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        float f = this.rippleRingDiameterEnd;
        float f2 = this.thumbnailShrinkDiameterEnd;
        canvas.clipRect(this.viewRect);
        float f3 = width / 2.0f;
        float f4 = height / 2.0f;
        RevealRequest revealRequest = this.backgroundRequest;
        if (revealRequest != null && (thumbnailPaint = revealRequest.getThumbnailPaint()) != null) {
            float f5 = f2 / f;
            canvas.save();
            canvas.scale(f5, f5, f3, f4);
            canvas.drawRoundRect(this.viewRect, f3, f4, thumbnailPaint);
            float f6 = this.innerStrokeWidth / f5;
            this.borderStrokePaint.setStrokeWidth(f6);
            canvas.drawCircle(f3, f4, f3 - (f6 / 2.0f), this.borderStrokePaint);
            canvas.restore();
        }
        if (this.foregroundRequest != null) {
            if (this.currentRippleRingThickness > 0.0f && (valueAnimator = this.rippleAnimator) != null && valueAnimator.isRunning()) {
                this.ripplePaint.setAlpha((int) (this.currentRippleRingOpacity * 255.0f));
                this.ripplePaint.setStrokeWidth(this.currentRippleRingThickness);
                canvas.save();
                canvas.drawCircle(f3, f4, this.currentRippleRingDiameter / 2.0f, this.ripplePaint);
                canvas.restore();
            }
            float f7 = this.currentThumbnailDiameter / this.rippleRingDiameterEnd;
            canvas.save();
            canvas.scale(f7, f7, f3, f4);
            RevealRequest revealRequest2 = this.foregroundRequest;
            lku.m15662p(revealRequest2);
            Paint thumbnailPaint2 = revealRequest2.getThumbnailPaint();
            if (thumbnailPaint2 != null) {
                canvas.drawRoundRect(this.viewRect, f3, f4, thumbnailPaint2);
                float f8 = this.innerStrokeWidth / f7;
                this.borderStrokePaint.setStrokeWidth(f8);
                canvas.drawCircle(f3, f4, f3 - (f8 / 2.0f), this.borderStrokePaint);
            }
            this.revealCirclePaint.setAlpha((int) (this.currentRevealCircleOpacity * 255.0f));
            canvas.drawCircle(f3, f4, this.rippleRingDiameterEnd / 2.0f, this.revealCirclePaint);
            canvas.restore();
        }
        if (this.showLockedBadge) {
            drawLockedFolderBadge(canvas, f3, f4);
        }
        if (this.currentHitStateCircleOpacity > 0.0f) {
            canvas.save();
            float f9 = f2 / f;
            canvas.scale(f9, f9, f3, f4);
            this.hitStateCirclePaint.setAlpha((int) (this.currentHitStateCircleOpacity * 255.0f));
            canvas.drawCircle(f3, f4, this.rippleRingDiameterEnd / 2.0f, this.hitStateCirclePaint);
            canvas.restore();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = (int) this.rippleRingDiameterEnd;
        setMeasuredDimension(i3, i3);
    }

    public void resetThumbnailView() {
        setPressed(false);
        invalidate();
    }

    public void setCallback(Callback callback) {
        this.callback = mrm.m16829i(callback);
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.optionalOnClickListener = mrm.m16828h(onClickListener);
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        if (z) {
            this.currentHitStateCircleOpacity = HIT_STATE_CIRCLE_OPACITY_SHOW;
            invalidate();
        } else if (this.currentHitStateCircleOpacity > 0.0f) {
            this.hitStateFadeOutAnimator.start();
        }
    }

    public void setThumbnail(Bitmap bitmap, int i, boolean z) {
        bitmap.getClass();
        jvd.m13538a();
        this.showLockedBadge = z;
        if (this.pendingRequest == null) {
            this.pendingRequest = RevealRequest.createNonAnimatedRevealRequest(this.rippleRingDiameterEnd, "");
        }
        this.pendingRequest.setThumbnailBitmap(bitmap, i);
        if (getVisibility() != 0) {
            this.backgroundRequest = null;
            this.foregroundRequest = null;
        }
        runPendingRequestAnimation();
    }

    public void startRevealThumbnailAnimation(String str) {
        jvd.m13538a();
        this.pendingRequest = RevealRequest.createAnimatedRevealRequest(getMeasuredWidth(), str);
    }

    public void stopFlashThumbnail() {
        jvd.m13538a();
        stopBurstFlashAnimation();
    }
}
