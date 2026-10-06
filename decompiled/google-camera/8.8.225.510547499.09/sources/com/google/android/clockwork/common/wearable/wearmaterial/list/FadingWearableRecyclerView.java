package com.google.android.clockwork.common.wearable.wearmaterial.list;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.SystemClock;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.wear.ambient.AmbientMode;
import p000.AbstractC0806ls;
import p000.AbstractC0812ly;
import p000.AbstractC0815ma;
import p000.iwk;
import p000.iws;
import p000.iwt;
import p000.iwu;
import p000.iwv;
import p000.iww;
import p000.iwx;
import p000.iwz;
import p000.ixc;
import p000.ixd;
import p000.iyp;
import p000.iyq;
import p000.jfs;
import p000.jwl;
import p000.lkm;
import p000.oju;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class FadingWearableRecyclerView extends RecyclerView implements iwx {

    /* JADX INFO: renamed from: W */
    iyp f7458W;

    /* JADX INFO: renamed from: aa */
    ixc f7459aa;

    /* JADX INFO: renamed from: ab */
    public ixd f7460ab;

    /* JADX INFO: renamed from: ac */
    public boolean f7461ac;

    /* JADX INFO: renamed from: ad */
    jwl f7462ad;

    /* JADX INFO: renamed from: ae */
    private final Context f7463ae;

    /* JADX INFO: renamed from: af */
    private final int f7464af;

    /* JADX INFO: renamed from: ag */
    private final int f7465ag;

    /* JADX INFO: renamed from: ah */
    private iyq f7466ah;

    /* JADX INFO: renamed from: ai */
    private boolean f7467ai;

    /* JADX INFO: renamed from: aj */
    private int f7468aj;

    /* JADX INFO: renamed from: ak */
    private long f7469ak;

    /* JADX INFO: renamed from: al */
    private long f7470al;

    /* JADX INFO: renamed from: am */
    private Interpolator f7471am;

    /* JADX INFO: renamed from: an */
    private final Interpolator f7472an;

    /* JADX INFO: renamed from: ao */
    private boolean f7473ao;

    /* JADX INFO: renamed from: ap */
    private boolean f7474ap;

    /* JADX INFO: renamed from: aq */
    private int f7475aq;

    /* JADX INFO: renamed from: ar */
    private int f7476ar;

    /* JADX INFO: renamed from: as */
    private float f7477as;

    /* JADX INFO: renamed from: at */
    private float f7478at;

    /* JADX INFO: renamed from: au */
    private boolean f7479au;

    /* JADX INFO: renamed from: av */
    private boolean f7480av;

    /* JADX INFO: renamed from: aw */
    private float f7481aw;

    /* JADX INFO: renamed from: ax */
    private int f7482ax;

    /* JADX INFO: renamed from: ay */
    private final ViewTreeObserver.OnPreDrawListener f7483ay;

    public FadingWearableRecyclerView(Context context) {
        this(context, null);
    }

    @Override // android.support.v7.widget.RecyclerView
    /* JADX INFO: renamed from: Q */
    public final void mo1218Q(int i) {
        ixc ixcVar = this.f7459aa;
        if (ixcVar != null) {
            ixcVar.f32534f.mo2035d(i);
        }
    }

    @Override // android.support.v7.widget.RecyclerView
    /* JADX INFO: renamed from: R */
    public final void mo1219R(int i, int i2) {
        int i3;
        this.f7460ab.m11851c();
        iyp iypVar = this.f7458W;
        if (iypVar != null) {
            jfs jfsVar = iypVar.f32677k;
            if (iypVar.f32669c && iypVar.f32673g && (!iypVar.f32668b || iypVar.f32674h)) {
                boolean z = true;
                if (jfsVar.m13097c(i, i2, true)) {
                    i3 = 2;
                } else if (jfsVar.m13096b(i, i2, true)) {
                    i3 = 3;
                } else {
                    i3 = 1;
                    z = false;
                }
                if (z) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    long j = iypVar.f32675i;
                    if (j == 0 || jElapsedRealtime - j > 500 || iypVar.f32676j != i3) {
                        iypVar.f32675i = jElapsedRealtime;
                        iypVar.f32676j = i3;
                        iypVar.m11908a(20);
                    }
                }
            }
        }
        ixc ixcVar = this.f7459aa;
        if (ixcVar != null) {
            ixcVar.f32534f.mo2034c(this, i, i2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m4602a(int i) {
        if (getChildAt(i) == null) {
            return 0;
        }
        return getChildAt(i).getHeight();
    }

    @Override // p000.iwx
    /* JADX INFO: renamed from: aA */
    public final void mo4603aA(float f) {
        this.f7481aw = f;
    }

    /* JADX INFO: renamed from: aB */
    public final void m4604aB() {
        AbstractC0806ls abstractC0806ls = this.f1123m;
        abstractC0806ls.getClass();
        abstractC0806ls.m15926h(new iwu(this));
        if (getChildCount() <= 0 || !this.f7473ao) {
            return;
        }
        if (getChildCount() >= 2 || !this.f7474ap) {
            m4605az(m4602a(0), m4602a(1));
        }
    }

    /* JADX INFO: renamed from: az */
    public final void m4605az(int i, int i2) {
        int iMax;
        float f = this.f7477as;
        if (f == -2.1474836E9f) {
            boolean z = this.f7474ap;
            int i3 = true != z ? 0 : i;
            if (true == z) {
                i = i2;
            }
            iMax = Math.max((int) (((getHeight() * 0.5f) - (i * 0.5f)) - i3), 0);
        } else {
            iMax = Math.max((int) (this.f7465ag * f), 0);
        }
        float f2 = this.f7478at;
        int paddingBottom = f2 == -2.1474836E9f ? getPaddingBottom() : Math.max((int) (this.f7465ag * f2), 0);
        if (getPaddingTop() == iMax && getPaddingBottom() == paddingBottom) {
            return;
        }
        this.f7475aq = getPaddingTop();
        this.f7476ar = getPaddingBottom();
        setPadding(getPaddingLeft(), iMax, getPaddingRight(), paddingBottom);
        AbstractC0812ly abstractC0812ly = this.f1124n;
        if (abstractC0812ly != null) {
            View focusedChild = getFocusedChild();
            abstractC0812ly.mo1159S(focusedChild != null ? AbstractC0812ly.m16136be(focusedChild) : 0);
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final int computeVerticalScrollExtent() {
        int iComputeVerticalScrollExtent = super.computeVerticalScrollExtent();
        this.f7482ax = iComputeVerticalScrollExtent;
        return (int) (iComputeVerticalScrollExtent * (1.0f - this.f7481aw));
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final int computeVerticalScrollOffset() {
        int iComputeVerticalScrollOffset = super.computeVerticalScrollOffset();
        return iComputeVerticalScrollOffset > 0 ? (int) ((this.f7482ax * this.f7481aw) + iComputeVerticalScrollOffset) : iComputeVerticalScrollOffset;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.f7460ab.m11851c();
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7467ai) {
            setTranslationY(this.f7468aj);
            ViewPropertyAnimator viewPropertyAnimatorWithLayer = animate().withLayer();
            viewPropertyAnimatorWithLayer.translationY(0.0f);
            viewPropertyAnimatorWithLayer.setUpdateListener(new iws(this, 2));
            viewPropertyAnimatorWithLayer.setStartDelay(this.f7469ak);
            viewPropertyAnimatorWithLayer.setDuration(this.f7470al);
            viewPropertyAnimatorWithLayer.setInterpolator(this.f7471am);
            viewPropertyAnimatorWithLayer.start();
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(225L);
            alphaAnimation.setFillAfter(true);
            alphaAnimation.setStartOffset(this.f7469ak);
            alphaAnimation.setInterpolator(this.f7472an);
            startAnimation(alphaAnimation);
        }
        getViewTreeObserver().addOnPreDrawListener(this.f7483ay);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this.f7483ay);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f7460ab.m11851c();
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        iyp iypVar = this.f7458W;
        if (iypVar != null) {
            iypVar.f32673g = false;
        }
        return zOnTouchEvent;
    }

    public FadingWearableRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FadingWearableRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7467ai = false;
        this.f7469ak = 75L;
        this.f7470al = 225L;
        this.f7471am = new PathInterpolator(0.2f, 0.2f, 0.0f, 1.0f);
        this.f7472an = new PathInterpolator(0.33f, 0.0f, 0.67f, 0.2f);
        this.f7474ap = false;
        this.f7475aq = Integer.MIN_VALUE;
        this.f7476ar = Integer.MIN_VALUE;
        this.f7477as = -2.1474836E9f;
        this.f7478at = -2.1474836E9f;
        this.f7479au = true;
        this.f7480av = false;
        this.f7483ay = new iwk(this, 2);
        this.f7463ae = context;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f7464af = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        this.f7465ag = i2;
        this.f7468aj = i2;
        this.f7460ab = new ixd(this, new AmbientMode.AmbientController(this), null, null, null, null, null, null);
        try {
            iww iwwVar = (iww) lkm.m15565F(context.getApplicationContext(), iww.class);
            if (iwwVar.m11846a().mo16813g()) {
                this.f7466ah = (iyq) ((oju) iwwVar.m11846a().mo16809c()).get();
            }
        } catch (RuntimeException e) {
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, iwz.f32525a, i, 0);
        try {
            this.f7467ai = typedArrayObtainStyledAttributes.getBoolean(5, false);
            boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
            this.f7473ao = z;
            if (!z) {
                if (this.f7475aq != Integer.MIN_VALUE) {
                    setPadding(getPaddingLeft(), this.f7475aq, getPaddingRight(), this.f7476ar);
                }
                this.f7461ac = false;
            } else if (getChildCount() > 0) {
                m4604aB();
            } else {
                this.f7461ac = true;
            }
            this.f7474ap = typedArrayObtainStyledAttributes.getBoolean(6, false);
            this.f7477as = Math.min(typedArrayObtainStyledAttributes.getFloat(9, -2.1474836E9f), 1.0f);
            this.f7478at = Math.min(typedArrayObtainStyledAttributes.getFloat(0, -2.1474836E9f), 1.0f);
            float fMin = Math.min(typedArrayObtainStyledAttributes.getFloat(8, -2.1474836E9f), 1.0f);
            float fMin2 = Math.min(typedArrayObtainStyledAttributes.getFloat(2, -2.1474836E9f), 1.0f);
            setPaddingRelative(fMin == -2.1474836E9f ? getPaddingStart() : Math.max((int) (this.f7464af * fMin), 0), getPaddingTop(), fMin2 == -2.1474836E9f ? getPaddingEnd() : Math.max((int) (this.f7464af * fMin2), 0), getPaddingBottom());
            boolean z2 = typedArrayObtainStyledAttributes.getBoolean(7, this.f7480av);
            this.f7480av = z2;
            if (z2 && this.f7462ad == null) {
                this.f7462ad = new jwl(this);
            }
            jwl jwlVar = this.f7462ad;
            if (jwlVar != null) {
                jwlVar.f34954a = z2;
                ((AbstractC0815ma) jwlVar.f34955b).mo11874e((RecyclerView) (z2 ? jwlVar.f34956c : null));
            }
            boolean z3 = typedArrayObtainStyledAttributes.getBoolean(3, this.f7479au);
            this.f7479au = z3;
            if (z3 && this.f7459aa == null) {
                this.f7459aa = new ixc(this.f7463ae);
            }
            int i3 = new int[]{1, 2}[typedArrayObtainStyledAttributes.getInteger(4, 1)];
            boolean z4 = i3 == 1;
            if (i3 != 1 && this.f7458W == null) {
                this.f7458W = new iyp(this.f7463ae, this);
            }
            iyp iypVar = this.f7458W;
            if (iypVar != null) {
                iypVar.f32668b = i3 == 2;
                iypVar.f32669c = !z4;
            }
            typedArrayObtainStyledAttributes.recycle();
            iwt iwtVar = new iwt(this.f7460ab);
            iwtVar.f39371h = 450L;
            iwtVar.f39372i = 450L;
            iwtVar.f39373j = 450L;
            iwtVar.f39374k = 450L;
            m1227Z(iwtVar);
            if (getOverScrollMode() != 2) {
                this.f1083U = new iwv(this);
                m1208G();
            }
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.lang.Runnable] */
    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        boolean z;
        ixc ixcVar;
        InputDevice.MotionRange motionRange;
        if (this.f7466ah != null && Build.VERSION.SDK_INT == 33 && motionEvent.getAction() == 8 && motionEvent.isFromSource(4194304) && this.f7466ah.m11909a()) {
            z = true;
        } else {
            super.onGenericMotionEvent(motionEvent);
            z = false;
        }
        jwl jwlVar = this.f7462ad;
        if (jwlVar != null && jwlVar.f34954a && motionEvent.getAction() == 8 && (motionEvent.getSource() & 4194304) != 0) {
            ((RecyclerView) jwlVar.f34956c).removeCallbacks(jwlVar.f34957d);
            ((RecyclerView) jwlVar.f34956c).postDelayed(jwlVar.f34957d, 80L);
        }
        iyp iypVar = this.f7458W;
        if (iypVar != null && iypVar.f32668b && motionEvent.getAction() == 8 && (4194304 & motionEvent.getSource()) != 0) {
            iypVar.f32673g = true;
            InputDevice device = motionEvent.getDevice();
            Float fValueOf = null;
            if (device != null && (motionRange = device.getMotionRange(26)) != null) {
                fValueOf = Float.valueOf(motionRange.getResolution());
            }
            if (fValueOf != null) {
                iypVar.f32674h = true;
                float axisValue = motionEvent.getAxisValue(26);
                int iM13061a = jfs.m13061a(motionEvent);
                jfs jfsVar = iypVar.f32677k;
                int iM13061a2 = jfs.m13061a(motionEvent);
                if (iM13061a2 <= 0 ? iM13061a2 >= 0 || !jfsVar.m13097c(0, 0, false) : !jfsVar.m13096b(0, 0, false)) {
                    if (iM13061a != iypVar.f32672f) {
                        iypVar.f32671e = 0.0f;
                    }
                    iypVar.f32672f = iM13061a;
                    float fFloatValue = iypVar.f32671e + ((axisValue * iypVar.f32670d) / fValueOf.floatValue());
                    iypVar.f32671e = fFloatValue;
                    if (Math.abs(fFloatValue) > 45.0f) {
                        iypVar.f32671e %= 45.0f;
                        iypVar.m11908a(18);
                    }
                }
            }
        }
        if (this.f7479au && (ixcVar = this.f7459aa) != null) {
            ixcVar.f32533e.onGenericMotion(this, motionEvent);
        }
        return z;
    }
}
