package p024b3;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.WeakHashMap;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: b3.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC1294a implements View.OnTouchListener {

    /* JADX INFO: renamed from: L */
    public static final int f8009L = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: H */
    public boolean f8010H;

    /* JADX INFO: renamed from: I */
    public boolean f8011I;

    /* JADX INFO: renamed from: J */
    public boolean f8012J;

    /* JADX INFO: renamed from: K */
    public boolean f8013K;

    /* JADX INFO: renamed from: a */
    public final a f8014a;

    /* JADX INFO: renamed from: b */
    public final AccelerateInterpolator f8015b;

    /* JADX INFO: renamed from: c */
    public final View f8016c;

    /* JADX INFO: renamed from: d */
    public b f8017d;

    /* JADX INFO: renamed from: e */
    public final float[] f8018e;

    /* JADX INFO: renamed from: f */
    public final float[] f8019f;

    /* JADX INFO: renamed from: g */
    public int f8020g;

    /* JADX INFO: renamed from: h */
    public int f8021h;

    /* JADX INFO: renamed from: i */
    public final float[] f8022i;

    /* JADX INFO: renamed from: j */
    public final float[] f8023j;

    /* JADX INFO: renamed from: k */
    public final float[] f8024k;

    /* JADX INFO: renamed from: l */
    public boolean f8025l;

    /* JADX INFO: renamed from: b3.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f8026a;

        /* JADX INFO: renamed from: b */
        public int f8027b;

        /* JADX INFO: renamed from: c */
        public float f8028c;

        /* JADX INFO: renamed from: d */
        public float f8029d;

        /* JADX INFO: renamed from: h */
        public float f8033h;

        /* JADX INFO: renamed from: i */
        public int f8034i;

        /* JADX INFO: renamed from: e */
        public long f8030e = Long.MIN_VALUE;

        /* JADX INFO: renamed from: g */
        public long f8032g = -1;

        /* JADX INFO: renamed from: f */
        public long f8031f = 0;

        /* JADX INFO: renamed from: a */
        public final float m4803a(long j10) {
            long j11 = this.f8030e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f8032g;
            if (j12 >= 0 && j10 >= j12) {
                float f3 = this.f8033h;
                return (AbstractViewOnTouchListenerC1294a.m4798b((j10 - j12) / this.f8034i, 0.0f, 1.0f) * f3) + (1.0f - f3);
            }
            return AbstractViewOnTouchListenerC1294a.m4798b((j10 - j11) / this.f8026a, 0.0f, 1.0f) * 0.5f;
        }
    }

    /* JADX INFO: renamed from: b3.a$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AbstractViewOnTouchListenerC1294a abstractViewOnTouchListenerC1294a = AbstractViewOnTouchListenerC1294a.this;
            if (abstractViewOnTouchListenerC1294a.f8012J) {
                boolean z10 = abstractViewOnTouchListenerC1294a.f8010H;
                a aVar = abstractViewOnTouchListenerC1294a.f8014a;
                if (z10) {
                    abstractViewOnTouchListenerC1294a.f8010H = false;
                    aVar.getClass();
                    long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    aVar.f8030e = jCurrentAnimationTimeMillis;
                    aVar.f8032g = -1L;
                    aVar.f8031f = jCurrentAnimationTimeMillis;
                    aVar.f8033h = 0.5f;
                }
                if ((aVar.f8032g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f8032g + ((long) aVar.f8034i)) || !abstractViewOnTouchListenerC1294a.m4802e()) {
                    abstractViewOnTouchListenerC1294a.f8012J = false;
                    return;
                }
                boolean z11 = abstractViewOnTouchListenerC1294a.f8011I;
                View view = abstractViewOnTouchListenerC1294a.f8016c;
                if (z11) {
                    abstractViewOnTouchListenerC1294a.f8011I = false;
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (aVar.f8031f == 0) {
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                float fM4803a = aVar.m4803a(jCurrentAnimationTimeMillis2);
                long j10 = jCurrentAnimationTimeMillis2 - aVar.f8031f;
                aVar.f8031f = jCurrentAnimationTimeMillis2;
                C1301h.m4820b(((C1300g) abstractViewOnTouchListenerC1294a).f8036M, (int) (j10 * ((fM4803a * 4.0f) + ((-4.0f) * fM4803a * fM4803a)) * aVar.f8029d));
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                C10029b0.d.m18676m(view, this);
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public AbstractViewOnTouchListenerC1294a(View view) {
        a aVar = new a();
        this.f8014a = aVar;
        this.f8015b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f8018e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f8019f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f8022i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f8023j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f8024k = fArr5;
        this.f8016c = view;
        float f3 = Resources.getSystem().getDisplayMetrics().density;
        float f10 = ((int) ((1575.0f * f3) + 0.5f)) / 1000.0f;
        fArr5[0] = f10;
        fArr5[1] = f10;
        float f11 = ((int) ((f3 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f11;
        fArr4[1] = f11;
        this.f8020g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f8021h = f8009L;
        aVar.f8026a = 500;
        aVar.f8027b = 500;
    }

    /* JADX INFO: renamed from: b */
    public static float m4798b(float f3, float f10, float f11) {
        if (f3 > f11) {
            return f11;
        }
        return f3 < f10 ? f10 : f3;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0044  */
    /* JADX WARN: Code duplicated, block: B:14:0x0046  */
    /* JADX WARN: Code duplicated, block: B:16:0x0056  */
    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX INFO: renamed from: a */
    public final float m4799a(float f3, float f10, float f11, int i10) {
        float fM4798b;
        float interpolation;
        float fM4798b2 = m4798b(this.f8018e[i10] * f10, 0.0f, this.f8019f[i10]);
        float fM4800c = m4800c(f10 - f3, fM4798b2) - m4800c(f3, fM4798b2);
        AccelerateInterpolator accelerateInterpolator = this.f8015b;
        if (fM4800c >= 0.0f) {
            if (fM4800c > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fM4800c);
            } else {
                fM4798b = 0.0f;
            }
            if (fM4798b == 0.0f) {
                return 0.0f;
            }
            float f12 = this.f8022i[i10];
            float f13 = this.f8023j[i10];
            float f14 = this.f8024k[i10];
            float f15 = f12 * f11;
            return fM4798b > 0.0f ? m4798b(fM4798b * f15, f13, f14) : -m4798b((-fM4798b) * f15, f13, f14);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fM4800c);
        fM4798b = m4798b(interpolation, -1.0f, 1.0f);
        if (fM4798b == 0.0f) {
            return 0.0f;
        }
        float f16 = this.f8022i[i10];
        float f17 = this.f8023j[i10];
        float f18 = this.f8024k[i10];
        float f19 = f16 * f11;
        if (fM4798b > 0.0f) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final float m4800c(float f3, float f10) {
        if (f10 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f8020g;
        if (i10 == 0 || i10 == 1) {
            if (f3 < f10) {
                if (f3 >= 0.0f) {
                    return 1.0f - (f3 / f10);
                }
                if (this.f8012J && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f3 < 0.0f) {
            return f3 / (-f10);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: d */
    public final void m4801d() {
        int i10 = 0;
        if (this.f8010H) {
            this.f8012J = false;
            return;
        }
        a aVar = this.f8014a;
        aVar.getClass();
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i11 = (int) (jCurrentAnimationTimeMillis - aVar.f8030e);
        int i12 = aVar.f8027b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        aVar.f8034i = i10;
        aVar.f8033h = aVar.m4803a(jCurrentAnimationTimeMillis);
        aVar.f8032g = jCurrentAnimationTimeMillis;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    /* JADX WARN: Code duplicated, block: B:6:0x002d  */
    /* JADX INFO: renamed from: e */
    public final boolean m4802e() {
        boolean z10;
        a aVar = this.f8014a;
        float f3 = aVar.f8029d;
        int iAbs = (int) (f3 / Math.abs(f3));
        float f10 = aVar.f8028c;
        if (iAbs == 0) {
            return false;
        }
        ListView listView = ((C1300g) this).f8036M;
        int count = listView.getCount();
        if (count == 0) {
            z10 = false;
        } else {
            int childCount = listView.getChildCount();
            int firstVisiblePosition = listView.getFirstVisiblePosition();
            int i10 = firstVisiblePosition + childCount;
            if (iAbs <= 0) {
                if (iAbs < 0) {
                    if (firstVisiblePosition > 0 || listView.getChildAt(0).getTop() < 0) {
                        z10 = true;
                    }
                }
                z10 = false;
            } else if (i10 < count || listView.getChildAt(childCount - 1).getBottom() > listView.getHeight()) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001e  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10;
        if (!this.f8013K) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                m4801d();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    m4801d();
                }
            }
            return false;
        }
        this.f8011I = true;
        this.f8025l = false;
        float x10 = motionEvent.getX();
        float width = view.getWidth();
        View view2 = this.f8016c;
        float fM4799a = m4799a(x10, width, view2.getWidth(), 0);
        float fM4799a2 = m4799a(motionEvent.getY(), view.getHeight(), view2.getHeight(), 1);
        a aVar = this.f8014a;
        aVar.f8028c = fM4799a;
        aVar.f8029d = fM4799a2;
        if (!this.f8012J && m4802e()) {
            if (this.f8017d == null) {
                this.f8017d = new b();
            }
            this.f8012J = true;
            this.f8010H = true;
            if (this.f8025l || (i10 = this.f8021h) <= 0) {
                this.f8017d.run();
            } else {
                b bVar = this.f8017d;
                long j10 = i10;
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                C10029b0.d.m18677n(view2, bVar, j10);
            }
            this.f8025l = true;
        }
        return false;
    }
}
