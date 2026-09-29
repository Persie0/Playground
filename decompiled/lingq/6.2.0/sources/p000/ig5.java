package p000;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ig5 implements View.OnTouchListener {

    /* JADX INFO: renamed from: M */
    public static final int f44071M = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: H */
    public boolean f44072H;

    /* JADX INFO: renamed from: I */
    public boolean f44073I;

    /* JADX INFO: renamed from: J */
    public boolean f44074J;

    /* JADX INFO: renamed from: K */
    public boolean f44075K;

    /* JADX INFO: renamed from: L */
    public final nm2 f44076L;

    /* JADX INFO: renamed from: a */
    public final f20 f44077a;

    /* JADX INFO: renamed from: b */
    public final AccelerateInterpolator f44078b;

    /* JADX INFO: renamed from: c */
    public final nm2 f44079c;

    /* JADX INFO: renamed from: d */
    public RunnableC3468pp f44080d;

    /* JADX INFO: renamed from: e */
    public final float[] f44081e;

    /* JADX INFO: renamed from: f */
    public final float[] f44082f;

    /* JADX INFO: renamed from: g */
    public final int f44083g;

    /* JADX INFO: renamed from: h */
    public final int f44084h;

    /* JADX INFO: renamed from: i */
    public final float[] f44085i;

    /* JADX INFO: renamed from: j */
    public final float[] f44086j;

    /* JADX INFO: renamed from: k */
    public final float[] f44087k;

    /* JADX INFO: renamed from: l */
    public boolean f44088l;

    public ig5(nm2 nm2Var) {
        f20 f20Var = new f20();
        f20Var.f38292e = Long.MIN_VALUE;
        f20Var.f38294g = -1L;
        f20Var.f38293f = 0L;
        this.f44077a = f20Var;
        this.f44078b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f44081e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f44082f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f44085i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f44086j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f44087k = fArr5;
        this.f44079c = nm2Var;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.f44083g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f44084h = f44071M;
        f20Var.f38288a = 500;
        f20Var.f38289b = 500;
        this.f44076L = nm2Var;
    }

    /* JADX INFO: renamed from: b */
    public static float m13895b(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    /* JADX INFO: renamed from: a */
    public final float m13896a(int i, float f, float f2, float f3) {
        float fM13895b;
        float interpolation;
        float fM13895b2 = m13895b(this.f44081e[i] * f2, 0.0f, this.f44082f[i]);
        float fM13897c = m13897c(f2 - f, fM13895b2) - m13897c(f, fM13895b2);
        AccelerateInterpolator accelerateInterpolator = this.f44078b;
        if (fM13897c >= 0.0f) {
            if (fM13897c > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fM13897c);
            } else {
                fM13895b = 0.0f;
            }
            if (fM13895b == 0.0f) {
                return 0.0f;
            }
            float f4 = this.f44085i[i];
            float f5 = this.f44086j[i];
            float f6 = this.f44087k[i];
            float f7 = f4 * f3;
            return fM13895b > 0.0f ? m13895b(fM13895b * f7, f5, f6) : -m13895b((-fM13895b) * f7, f5, f6);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fM13897c);
        fM13895b = m13895b(interpolation, -1.0f, 1.0f);
        if (fM13895b == 0.0f) {
            return 0.0f;
        }
        float f8 = this.f44085i[i];
        float f9 = this.f44086j[i];
        float f10 = this.f44087k[i];
        float f11 = f8 * f3;
        if (fM13895b > 0.0f) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final float m13897c(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.f44083g;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.f44074J && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: d */
    public final void m13898d() {
        int i = 0;
        if (this.f44072H) {
            this.f44074J = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        f20 f20Var = this.f44077a;
        int i2 = (int) (jCurrentAnimationTimeMillis - f20Var.f38292e);
        int i3 = f20Var.f38289b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        f20Var.f38296i = i;
        f20Var.f38295h = f20Var.m11504a(jCurrentAnimationTimeMillis);
        f20Var.f38294g = jCurrentAnimationTimeMillis;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m13899e() {
        nm2 nm2Var;
        int count;
        f20 f20Var = this.f44077a;
        float f = f20Var.f38291d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(f20Var.f38290c);
        if (iAbs != 0 && (count = (nm2Var = this.f44076L).getCount()) != 0) {
            int childCount = nm2Var.getChildCount();
            int firstVisiblePosition = nm2Var.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && nm2Var.getChildAt(0).getTop() >= 0)) : !(i >= count && nm2Var.getChildAt(childCount - 1).getBottom() <= nm2Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if (this.f44075K) {
            int actionMasked = motionEvent.getActionMasked();
            int i2 = 1;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                m13898d();
                return false;
            }
            this.f44073I = true;
            this.f44088l = false;
            float x = motionEvent.getX();
            float width = view.getWidth();
            nm2 nm2Var = this.f44079c;
            float fM13896a = m13896a(0, x, width, nm2Var.getWidth());
            float fM13896a2 = m13896a(1, motionEvent.getY(), view.getHeight(), nm2Var.getHeight());
            f20 f20Var = this.f44077a;
            f20Var.f38290c = fM13896a;
            f20Var.f38291d = fM13896a2;
            if (!this.f44074J && m13899e()) {
                if (this.f44080d == null) {
                    this.f44080d = new RunnableC3468pp(this, i2);
                }
                this.f44074J = true;
                this.f44072H = true;
                if (this.f44088l || (i = this.f44084h) <= 0) {
                    this.f44080d.run();
                } else {
                    RunnableC3468pp runnableC3468pp = this.f44080d;
                    long j = i;
                    WeakHashMap weakHashMap = dta.f36217a;
                    nm2Var.postOnAnimationDelayed(runnableC3468pp, j);
                }
                this.f44088l = true;
            }
        }
        return false;
    }
}
