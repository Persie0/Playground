package p000;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ListView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ahf implements View.OnTouchListener {

    /* JADX INFO: renamed from: g */
    private static final int f375g = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: a */
    public final ahe f376a;

    /* JADX INFO: renamed from: b */
    public final View f377b;

    /* JADX INFO: renamed from: c */
    public boolean f378c;

    /* JADX INFO: renamed from: d */
    public boolean f379d;

    /* JADX INFO: renamed from: e */
    public boolean f380e;

    /* JADX INFO: renamed from: f */
    public final ListView f381f;

    /* JADX INFO: renamed from: h */
    private final Interpolator f382h;

    /* JADX INFO: renamed from: i */
    private Runnable f383i;

    /* JADX INFO: renamed from: j */
    private final float[] f384j;

    /* JADX INFO: renamed from: k */
    private final float[] f385k;

    /* JADX INFO: renamed from: l */
    private final int f386l;

    /* JADX INFO: renamed from: m */
    private final float[] f387m;

    /* JADX INFO: renamed from: n */
    private final float[] f388n;

    /* JADX INFO: renamed from: o */
    private final float[] f389o;

    /* JADX INFO: renamed from: p */
    private boolean f390p;

    /* JADX INFO: renamed from: q */
    private boolean f391q;

    public ahf(ListView listView) {
        ahe aheVar = new ahe();
        this.f376a = aheVar;
        this.f382h = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f384j = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f385k = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f387m = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f388n = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f389o = fArr5;
        this.f377b = listView;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        float f = displayMetrics.density * 1575.0f;
        float f2 = displayMetrics.density * 315.0f;
        float f3 = ((int) (f + 0.5f)) / 1000.0f;
        fArr5[0] = f3;
        fArr5[1] = f3;
        float f4 = ((int) (f2 + 0.5f)) / 1000.0f;
        fArr4[0] = f4;
        fArr4[1] = f4;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f386l = f375g;
        aheVar.f366a = 500;
        aheVar.f367b = 500;
        this.f381f = listView;
    }

    /* JADX INFO: renamed from: a */
    static float m659a(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0051  */
    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    /* JADX INFO: renamed from: d */
    private final float m660d(int i, float f, float f2, float f3) {
        float fM659a;
        float interpolation;
        float fM659a2 = m659a(this.f384j[i] * f2, 0.0f, this.f385k[i]);
        float fM661e = m661e(f2 - f, fM659a2) - m661e(f, fM659a2);
        if (fM661e >= 0.0f) {
            if (fM661e > 0.0f) {
                interpolation = this.f382h.getInterpolation(fM661e);
            } else {
                fM659a = 0.0f;
            }
            if (fM659a == 0.0f) {
                return 0.0f;
            }
            float f4 = this.f387m[i];
            float f5 = this.f388n[i];
            float f6 = this.f389o[i];
            float f7 = f4 * f3;
            return fM659a > 0.0f ? m659a(fM659a * f7, f5, f6) : -m659a((-fM659a) * f7, f5, f6);
        }
        interpolation = -this.f382h.getInterpolation(-fM661e);
        fM659a = m659a(interpolation, -1.0f, 1.0f);
        if (fM659a == 0.0f) {
            return 0.0f;
        }
        float f8 = this.f387m[i];
        float f9 = this.f388n[i];
        float f10 = this.f389o[i];
        float f11 = f8 * f3;
        if (fM659a > 0.0f) {
        }
    }

    /* JADX INFO: renamed from: e */
    private final float m661e(float f, float f2) {
        if (f2 != 0.0f && f < f2) {
            if (f >= 0.0f) {
                return 1.0f - (f / f2);
            }
            if (this.f380e) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: f */
    private final void m662f() {
        int i = 0;
        if (this.f378c) {
            this.f380e = false;
            return;
        }
        ahe aheVar = this.f376a;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        long j = jCurrentAnimationTimeMillis - aheVar.f370e;
        int i2 = aheVar.f367b;
        int i3 = (int) j;
        if (i3 > i2) {
            i = i2;
        } else if (i3 >= 0) {
            i = i3;
        }
        aheVar.f374i = i;
        aheVar.f373h = aheVar.m658a(jCurrentAnimationTimeMillis);
        aheVar.f372g = jCurrentAnimationTimeMillis;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m663b() {
        ListView listView;
        int count;
        ahe aheVar = this.f376a;
        float f = aheVar.f369d;
        float fAbs = f / Math.abs(f);
        float f2 = aheVar.f368c;
        float fAbs2 = f2 / Math.abs(f2);
        int i = (int) fAbs;
        if (i != 0 && (count = (listView = this.f381f).getCount()) != 0) {
            int childCount = listView.getChildCount();
            int firstVisiblePosition = listView.getFirstVisiblePosition();
            int i2 = firstVisiblePosition + childCount;
            if (i > 0) {
                if (i2 < count || listView.getChildAt(childCount - 1).getBottom() > listView.getHeight()) {
                    return true;
                }
            } else if (i < 0 && (firstVisiblePosition > 0 || listView.getChildAt(0).getTop() < 0)) {
                return true;
            }
        }
        if (((int) fAbs2) == 0) {
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final void m664c(boolean z) {
        if (this.f391q && !z) {
            m662f();
        }
        this.f391q = z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x0054  */
    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if (!this.f391q) {
            return false;
        }
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.f379d = true;
                this.f390p = false;
                float fM660d = m660d(0, motionEvent.getX(), view.getWidth(), this.f377b.getWidth());
                float fM660d2 = m660d(1, motionEvent.getY(), view.getHeight(), this.f377b.getHeight());
                ahe aheVar = this.f376a;
                aheVar.f368c = fM660d;
                aheVar.f369d = fM660d2;
                if (!this.f380e && m663b()) {
                    if (this.f383i == null) {
                        this.f383i = new RunnableC0852nk(this, 11);
                    }
                    this.f380e = true;
                    this.f378c = true;
                    if (!this.f390p || (i = this.f386l) <= 0) {
                        this.f383i.run();
                    } else {
                        afb.m429j(this.f377b, this.f383i, i);
                    }
                    this.f390p = true;
                }
                return false;
            case 1:
            case 3:
                m662f();
                return false;
            case 2:
                float fM660d3 = m660d(0, motionEvent.getX(), view.getWidth(), this.f377b.getWidth());
                float fM660d4 = m660d(1, motionEvent.getY(), view.getHeight(), this.f377b.getHeight());
                ahe aheVar2 = this.f376a;
                aheVar2.f368c = fM660d3;
                aheVar2.f369d = fM660d4;
                if (!this.f380e) {
                    if (this.f383i == null) {
                        this.f383i = new RunnableC0852nk(this, 11);
                    }
                    this.f380e = true;
                    this.f378c = true;
                    if (this.f390p) {
                        this.f383i.run();
                    } else {
                        this.f383i.run();
                    }
                    this.f390p = true;
                }
                return false;
            default:
                return false;
        }
    }
}
