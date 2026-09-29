package com.google.android.material.snackbar;

import ae.C0062b;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.linguist.R;
import gd.C5768g;
import gd.C5772k;
import java.util.List;
import java.util.WeakHashMap;
import md.C7542a;
import p072dd.C5150c;
import p153hc.C6031a;
import p177ic.C6308a;
import p199jd.C6456a;
import p199jd.C6458c;
import p199jd.C6459d;
import p199jd.C6460e;
import p199jd.InterfaceC6463h;
import p199jd.RunnableC6461f;
import p329q2.C8488a;
import p378s3.C8953b;
import p378s3.C8954c;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p507yc.C10344k;
import p507yc.C10347n;
import p507yc.C10350q;
import p531zc.C10477a;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* JADX INFO: renamed from: a */
    public final int f15545a;

    /* JADX INFO: renamed from: b */
    public final int f15546b;

    /* JADX INFO: renamed from: c */
    public final int f15547c;

    /* JADX INFO: renamed from: d */
    public final TimeInterpolator f15548d;

    /* JADX INFO: renamed from: e */
    public final TimeInterpolator f15549e;

    /* JADX INFO: renamed from: f */
    public final TimeInterpolator f15550f;

    /* JADX INFO: renamed from: g */
    public final ViewGroup f15551g;

    /* JADX INFO: renamed from: h */
    public final Context f15552h;

    /* JADX INFO: renamed from: i */
    public final C3061e f15553i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC6463h f15554j;

    /* JADX INFO: renamed from: k */
    public int f15555k;

    /* JADX INFO: renamed from: m */
    public int f15557m;

    /* JADX INFO: renamed from: n */
    public int f15558n;

    /* JADX INFO: renamed from: o */
    public int f15559o;

    /* JADX INFO: renamed from: p */
    public int f15560p;

    /* JADX INFO: renamed from: q */
    public int f15561q;

    /* JADX INFO: renamed from: r */
    public boolean f15562r;

    /* JADX INFO: renamed from: s */
    public final AccessibilityManager f15563s;

    /* JADX INFO: renamed from: u */
    public static final C8953b f15539u = C6308a.f36524b;

    /* JADX INFO: renamed from: v */
    public static final LinearInterpolator f15540v = C6308a.f36523a;

    /* JADX INFO: renamed from: w */
    public static final C8954c f15541w = C6308a.f36526d;

    /* JADX INFO: renamed from: y */
    public static final int[] f15543y = {R.attr.snackbarStyle};

    /* JADX INFO: renamed from: z */
    public static final String f15544z = BaseTransientBottomBar.class.getSimpleName();

    /* JADX INFO: renamed from: x */
    public static final Handler f15542x = new Handler(Looper.getMainLooper(), new C3057a());

    /* JADX INFO: renamed from: l */
    public final RunnableC3058b f15556l = new RunnableC3058b();

    /* JADX INFO: renamed from: t */
    public final C3059c f15564t = new C3059c();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* JADX INFO: renamed from: j */
        public final C3060d f15565j = new C3060d(this);

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
        /* JADX INFO: renamed from: g */
        public final boolean mo2941g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            C3060d c3060d = this.f15565j;
            c3060d.getClass();
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    C3068g c3068gM8847b = C3068g.m8847b();
                    C3059c c3059c = c3060d.f15568a;
                    synchronized (c3068gM8847b.f15595a) {
                        if (c3068gM8847b.m8849c(c3059c)) {
                            C3068g.c cVar = c3068gM8847b.f15597c;
                            if (cVar.f15602c) {
                                cVar.f15602c = false;
                                c3068gM8847b.m8850d(cVar);
                            }
                        }
                    }
                }
            } else if (coordinatorLayout.m2926j(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                C3068g c3068gM8847b2 = C3068g.m8847b();
                C3059c c3059c2 = c3060d.f15568a;
                synchronized (c3068gM8847b2.f15595a) {
                    if (c3068gM8847b2.m8849c(c3059c2)) {
                        C3068g.c cVar2 = c3068gM8847b2.f15597c;
                        if (!cVar2.f15602c) {
                            cVar2.f15602c = true;
                            c3068gM8847b2.f15596b.removeCallbacksAndMessages(cVar2);
                        }
                    }
                }
            }
            return super.mo2941g(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        /* JADX INFO: renamed from: s */
        public final boolean mo8583s(View view) {
            this.f15565j.getClass();
            return view instanceof C3061e;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$a */
    public class C3057a implements Handler.Callback {
        /* JADX WARN: Code duplicated, block: B:26:0x00b9  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
            int i10 = message.what;
            if (i10 == 0) {
                BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) message.obj;
                C3061e c3061e = baseTransientBottomBar.f15553i;
                if (c3061e.getParent() == null) {
                    ViewGroup.LayoutParams layoutParams = c3061e.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.C0771f) {
                        CoordinatorLayout.C0771f c0771f = (CoordinatorLayout.C0771f) layoutParams;
                        Behavior behavior = new Behavior();
                        C3060d c3060d = behavior.f15565j;
                        c3060d.getClass();
                        c3060d.f15568a = baseTransientBottomBar.f15564t;
                        behavior.f14779b = new C3066e(baseTransientBottomBar);
                        c0771f.m2954b(behavior);
                        c0771f.f5556g = 80;
                    }
                    c3061e.f15580k = true;
                    baseTransientBottomBar.f15551g.addView(c3061e);
                    c3061e.f15580k = false;
                    baseTransientBottomBar.m8838f();
                    c3061e.setVisibility(4);
                }
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                if (C10029b0.g.m18699c(c3061e)) {
                    baseTransientBottomBar.m8837e();
                } else {
                    baseTransientBottomBar.f15562r = true;
                }
                return true;
            }
            if (i10 != 1) {
                return false;
            }
            BaseTransientBottomBar baseTransientBottomBar2 = (BaseTransientBottomBar) message.obj;
            int i11 = message.arg1;
            AccessibilityManager accessibilityManager = baseTransientBottomBar2.f15563s;
            if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
                C3061e c3061e2 = baseTransientBottomBar2.f15553i;
                if (c3061e2.getVisibility() != 0) {
                    baseTransientBottomBar2.m8835c();
                } else if (c3061e2.getAnimationMode() == 1) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat.setInterpolator(baseTransientBottomBar2.f15548d);
                    valueAnimatorOfFloat.addUpdateListener(new C3062a(baseTransientBottomBar2));
                    valueAnimatorOfFloat.setDuration(baseTransientBottomBar2.f15546b);
                    valueAnimatorOfFloat.addListener(new C6456a(baseTransientBottomBar2, i11));
                    valueAnimatorOfFloat.start();
                } else {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    int[] iArr = new int[2];
                    iArr[0] = 0;
                    int height = c3061e2.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = c3061e2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        height += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                    }
                    iArr[1] = height;
                    valueAnimator.setIntValues(iArr);
                    valueAnimator.setInterpolator(baseTransientBottomBar2.f15549e);
                    valueAnimator.setDuration(baseTransientBottomBar2.f15547c);
                    valueAnimator.addListener(new C6458c(baseTransientBottomBar2, i11));
                    valueAnimator.addUpdateListener(new C3065d(baseTransientBottomBar2));
                    valueAnimator.start();
                }
            } else {
                baseTransientBottomBar2.m8835c();
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$b */
    public class RunnableC3058b implements Runnable {
        public RunnableC3058b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Context context;
            Rect rect;
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f15553i != null && (context = baseTransientBottomBar.f15552h) != null) {
                int i10 = C10350q.f52058a;
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (Build.VERSION.SDK_INT >= 30) {
                    rect = windowManager.getCurrentWindowMetrics().getBounds();
                } else {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    rect = new Rect();
                    rect.right = point.x;
                    rect.bottom = point.y;
                }
                int iHeight = rect.height();
                int[] iArr = new int[2];
                C3061e c3061e = baseTransientBottomBar.f15553i;
                c3061e.getLocationOnScreen(iArr);
                int height = (iHeight - (c3061e.getHeight() + iArr[1])) + ((int) baseTransientBottomBar.f15553i.getTranslationY());
                int i11 = baseTransientBottomBar.f15560p;
                if (height >= i11) {
                    baseTransientBottomBar.f15561q = i11;
                    return;
                }
                ViewGroup.LayoutParams layoutParams = baseTransientBottomBar.f15553i.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    Log.w(BaseTransientBottomBar.f15544z, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                int i12 = baseTransientBottomBar.f15560p;
                baseTransientBottomBar.f15561q = i12;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = (i12 - height) + marginLayoutParams.bottomMargin;
                baseTransientBottomBar.f15553i.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$c */
    public class C3059c implements C3068g.b {
        public C3059c() {
        }

        @Override // com.google.android.material.snackbar.C3068g.b
        /* JADX INFO: renamed from: b */
        public final void mo8839b() {
            Handler handler = BaseTransientBottomBar.f15542x;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.C3068g.b
        /* JADX INFO: renamed from: c */
        public final void mo8840c(int i10) {
            Handler handler = BaseTransientBottomBar.f15542x;
            handler.sendMessage(handler.obtainMessage(1, i10, 0, BaseTransientBottomBar.this));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$d */
    public static class C3060d {

        /* JADX INFO: renamed from: a */
        public C3059c f15568a;

        public C3060d(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.getClass();
            swipeDismissBehavior.f14784g = Math.min(Math.max(0.0f, 0.1f), 1.0f);
            swipeDismissBehavior.f14785h = Math.min(Math.max(0.0f, 0.6f), 1.0f);
            swipeDismissBehavior.f14782e = 0;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$e */
    public static class C3061e extends FrameLayout {

        /* JADX INFO: renamed from: l */
        public static final a f15569l = new a();

        /* JADX INFO: renamed from: a */
        public BaseTransientBottomBar<?> f15570a;

        /* JADX INFO: renamed from: b */
        public final C5772k f15571b;

        /* JADX INFO: renamed from: c */
        public int f15572c;

        /* JADX INFO: renamed from: d */
        public final float f15573d;

        /* JADX INFO: renamed from: e */
        public final float f15574e;

        /* JADX INFO: renamed from: f */
        public final int f15575f;

        /* JADX INFO: renamed from: g */
        public final int f15576g;

        /* JADX INFO: renamed from: h */
        public ColorStateList f15577h;

        /* JADX INFO: renamed from: i */
        public PorterDuff.Mode f15578i;

        /* JADX INFO: renamed from: j */
        public Rect f15579j;

        /* JADX INFO: renamed from: k */
        public boolean f15580k;

        /* JADX INFO: renamed from: com.google.android.material.snackbar.BaseTransientBottomBar$e$a */
        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            @SuppressLint({"ClickableViewAccessibility"})
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public C3061e(Context context, AttributeSet attributeSet) {
            Drawable drawable;
            super(C7542a.m15048a(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C6031a.f35643L);
            if (typedArrayObtainStyledAttributes.hasValue(6)) {
                float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                C10029b0.i.m18725s(this, dimensionPixelSize);
            }
            this.f15572c = typedArrayObtainStyledAttributes.getInt(2, 0);
            if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
                this.f15571b = new C5772k(C5772k.m12150b(context2, attributeSet, 0, 0));
            }
            this.f15573d = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
            setBackgroundTintList(C5150c.m10925a(context2, typedArrayObtainStyledAttributes, 4));
            setBackgroundTintMode(C10347n.m19366f(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
            this.f15574e = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
            this.f15575f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
            this.f15576g = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f15569l);
            setFocusable(true);
            if (getBackground() == null) {
                int iM250B1 = C0062b.m250B1(getBackgroundOverlayColorAlpha(), C0062b.m340d1(this, R.attr.colorSurface), C0062b.m340d1(this, R.attr.colorOnSurface));
                C5772k c5772k = this.f15571b;
                if (c5772k != null) {
                    C8953b c8953b = BaseTransientBottomBar.f15539u;
                    C5768g c5768g = new C5768g(c5772k);
                    c5768g.m12141m(ColorStateList.valueOf(iM250B1));
                    drawable = c5768g;
                } else {
                    Resources resources = getResources();
                    C8953b c8953b2 = BaseTransientBottomBar.f15539u;
                    float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setShape(0);
                    gradientDrawable.setCornerRadius(dimension);
                    gradientDrawable.setColor(iM250B1);
                    drawable = gradientDrawable;
                }
                ColorStateList colorStateList = this.f15577h;
                if (colorStateList != null) {
                    C8488a.b.m16570h(drawable, colorStateList);
                }
                WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
                C10029b0.d.m18680q(this, drawable);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f15570a = baseTransientBottomBar;
        }

        public float getActionTextColorAlpha() {
            return this.f15574e;
        }

        public int getAnimationMode() {
            return this.f15572c;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f15573d;
        }

        public int getMaxInlineActionWidth() {
            return this.f15576g;
        }

        public int getMaxWidth() {
            return this.f15575f;
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f15570a;
            if (baseTransientBottomBar != null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    WindowInsets rootWindowInsets = baseTransientBottomBar.f15553i.getRootWindowInsets();
                    if (rootWindowInsets != null) {
                        baseTransientBottomBar.f15560p = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                        baseTransientBottomBar.m8838f();
                    }
                } else {
                    baseTransientBottomBar.getClass();
                }
            }
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.h.m18706c(this);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0039  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // android.view.ViewGroup, android.view.View
        public final void onDetachedFromWindow() {
            boolean z10;
            boolean z11;
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f15570a;
            if (baseTransientBottomBar != null) {
                C3068g c3068gM8847b = C3068g.m8847b();
                C3059c c3059c = baseTransientBottomBar.f15564t;
                synchronized (c3068gM8847b.f15595a) {
                    try {
                        z10 = true;
                        if (!c3068gM8847b.m8849c(c3059c)) {
                            C3068g.c cVar = c3068gM8847b.f15598d;
                            if (cVar == null) {
                                z11 = false;
                            } else {
                                if (c3059c != null && cVar.f15600a.get() == c3059c) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                            }
                            if (!z11) {
                                z10 = false;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z10) {
                    BaseTransientBottomBar.f15542x.post(new RunnableC6461f(baseTransientBottomBar));
                }
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f15570a;
            if (baseTransientBottomBar == null || !baseTransientBottomBar.f15562r) {
                return;
            }
            baseTransientBottomBar.m8837e();
            baseTransientBottomBar.f15562r = false;
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int i12 = this.f15575f;
            if (i12 <= 0 || getMeasuredWidth() <= i12) {
                return;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
        }

        public void setAnimationMode(int i10) {
            this.f15572c = i10;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f15577h != null) {
                drawable = drawable.mutate();
                C8488a.b.m16570h(drawable, this.f15577h);
                C8488a.b.m16571i(drawable, this.f15578i);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f15577h = colorStateList;
            if (getBackground() != null) {
                Drawable drawableMutate = getBackground().mutate();
                C8488a.b.m16570h(drawableMutate, colorStateList);
                C8488a.b.m16571i(drawableMutate, this.f15578i);
                if (drawableMutate != getBackground()) {
                    super.setBackgroundDrawable(drawableMutate);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f15578i = mode;
            if (getBackground() != null) {
                Drawable drawableMutate = getBackground().mutate();
                C8488a.b.m16571i(drawableMutate, mode);
                if (drawableMutate != getBackground()) {
                    super.setBackgroundDrawable(drawableMutate);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (!this.f15580k && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f15579j = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                BaseTransientBottomBar<?> baseTransientBottomBar = this.f15570a;
                if (baseTransientBottomBar != null) {
                    C8953b c8953b = BaseTransientBottomBar.f15539u;
                    baseTransientBottomBar.m8838f();
                }
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f15569l);
            super.setOnClickListener(onClickListener);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public BaseTransientBottomBar(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        if (snackbarContentLayout == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (snackbarContentLayout2 == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f15551g = viewGroup;
        this.f15554j = snackbarContentLayout2;
        this.f15552h = context;
        C10344k.m19356c(context, C10344k.f52047a, "Theme.AppCompat");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f15543y);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        C3061e c3061e = (C3061e) layoutInflaterFrom.inflate(resourceId != -1 ? R.layout.mtrl_layout_snackbar : R.layout.design_layout_snackbar, viewGroup, false);
        this.f15553i = c3061e;
        c3061e.setBaseTransientBottomBar(this);
        float actionTextColorAlpha = c3061e.getActionTextColorAlpha();
        if (actionTextColorAlpha != 1.0f) {
            snackbarContentLayout.f15585b.setTextColor(C0062b.m250B1(actionTextColorAlpha, C0062b.m340d1(snackbarContentLayout, R.attr.colorSurface), snackbarContentLayout.f15585b.getCurrentTextColor()));
        }
        snackbarContentLayout.setMaxInlineActionWidth(c3061e.getMaxInlineActionWidth());
        c3061e.addView(snackbarContentLayout);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.g.m18702f(c3061e, 1);
        C10029b0.d.m18682s(c3061e, 1);
        c3061e.setFitsSystemWindows(true);
        C10029b0.i.m18727u(c3061e, new C6459d(this));
        C10029b0.m18658n(c3061e, new C6460e(this));
        this.f15563s = (AccessibilityManager) context.getSystemService("accessibility");
        this.f15547c = C10477a.m19428c(R.attr.motionDurationLong2, context, 250);
        this.f15545a = C10477a.m19428c(R.attr.motionDurationLong2, context, 150);
        this.f15546b = C10477a.m19428c(R.attr.motionDurationMedium1, context, 75);
        this.f15548d = C10477a.m19429d(context, R.attr.motionEasingEmphasizedInterpolator, f15540v);
        this.f15550f = C10477a.m19429d(context, R.attr.motionEasingEmphasizedInterpolator, f15541w);
        this.f15549e = C10477a.m19429d(context, R.attr.motionEasingEmphasizedInterpolator, f15539u);
    }

    /* JADX INFO: renamed from: a */
    public void mo8833a() {
        m8834b(3);
    }

    /* JADX INFO: renamed from: b */
    public final void m8834b(int i10) {
        C3068g c3068gM8847b = C3068g.m8847b();
        C3059c c3059c = this.f15564t;
        synchronized (c3068gM8847b.f15595a) {
            if (c3068gM8847b.m8849c(c3059c)) {
                c3068gM8847b.m8848a(c3068gM8847b.f15597c, i10);
            } else {
                C3068g.c cVar = c3068gM8847b.f15598d;
                boolean z10 = false;
                if (cVar != null) {
                    if (c3059c != null && cVar.f15600a.get() == c3059c) {
                        z10 = true;
                    }
                }
                if (z10) {
                    c3068gM8847b.m8848a(c3068gM8847b.f15598d, i10);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003d  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final void m8835c() {
        C3068g c3068gM8847b = C3068g.m8847b();
        C3059c c3059c = this.f15564t;
        synchronized (c3068gM8847b.f15595a) {
            try {
                if (c3068gM8847b.m8849c(c3059c)) {
                    c3068gM8847b.f15597c = null;
                    C3068g.c cVar = c3068gM8847b.f15598d;
                    if (cVar != null && cVar != null) {
                        c3068gM8847b.f15597c = cVar;
                        c3068gM8847b.f15598d = null;
                        C3068g.b bVar = cVar.f15600a.get();
                        if (bVar != null) {
                            bVar.mo8839b();
                        } else {
                            c3068gM8847b.f15597c = null;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ViewParent parent = this.f15553i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f15553i);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final void m8836d() {
        C3068g c3068gM8847b = C3068g.m8847b();
        C3059c c3059c = this.f15564t;
        synchronized (c3068gM8847b.f15595a) {
            if (c3068gM8847b.m8849c(c3059c)) {
                c3068gM8847b.m8850d(c3068gM8847b.f15597c);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m8837e() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z10 = true;
        AccessibilityManager accessibilityManager = this.f15563s;
        if (accessibilityManager != null && ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) == null || !enabledAccessibilityServiceList.isEmpty())) {
            z10 = false;
        }
        C3061e c3061e = this.f15553i;
        if (z10) {
            c3061e.post(new RunnableC3067f(this));
            return;
        }
        if (c3061e.getParent() != null) {
            c3061e.setVisibility(0);
        }
        m8836d();
    }

    /* JADX INFO: renamed from: f */
    public final void m8838f() {
        C3061e c3061e = this.f15553i;
        ViewGroup.LayoutParams layoutParams = c3061e.getLayoutParams();
        boolean z10 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        String str = f15544z;
        if (!z10) {
            Log.w(str, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (c3061e.f15579j == null) {
            Log.w(str, "Unable to update margins because original view margins are not set");
            return;
        }
        if (c3061e.getParent() == null) {
            return;
        }
        int i10 = this.f15557m;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Rect rect = c3061e.f15579j;
        int i11 = rect.bottom + i10;
        int i12 = rect.left + this.f15558n;
        int i13 = rect.right + this.f15559o;
        int i14 = rect.top;
        boolean z11 = false;
        boolean z12 = (marginLayoutParams.bottomMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13 && marginLayoutParams.topMargin == i14) ? false : true;
        if (z12) {
            marginLayoutParams.bottomMargin = i11;
            marginLayoutParams.leftMargin = i12;
            marginLayoutParams.rightMargin = i13;
            marginLayoutParams.topMargin = i14;
            c3061e.requestLayout();
        }
        if ((z12 || this.f15561q != this.f15560p) && Build.VERSION.SDK_INT >= 29) {
            if (this.f15560p > 0) {
                ViewGroup.LayoutParams layoutParams2 = c3061e.getLayoutParams();
                if ((layoutParams2 instanceof CoordinatorLayout.C0771f) && (((CoordinatorLayout.C0771f) layoutParams2).f5550a instanceof SwipeDismissBehavior)) {
                    z11 = true;
                }
            }
            if (z11) {
                RunnableC3058b runnableC3058b = this.f15556l;
                c3061e.removeCallbacks(runnableC3058b);
                c3061e.post(runnableC3058b);
            }
        }
    }
}
