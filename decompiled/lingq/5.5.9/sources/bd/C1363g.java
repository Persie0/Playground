package bd;

import ae.C0062b;
import android.animation.ObjectAnimator;
import android.util.Property;
import p177ic.C6309b;
import p185j.AbstractC6392b;
import p378s3.C8953b;
import p428v4.AbstractC9640c;

/* JADX INFO: renamed from: bd.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1363g extends AbstractC6392b {

    /* JADX INFO: renamed from: l */
    public static final int[] f8222l = {0, 1350, 2700, 4050};

    /* JADX INFO: renamed from: m */
    public static final int[] f8223m = {667, 2017, 3367, 4717};

    /* JADX INFO: renamed from: n */
    public static final int[] f8224n = {1000, 2350, 3700, 5050};

    /* JADX INFO: renamed from: o */
    public static final a f8225o = new a();

    /* JADX INFO: renamed from: p */
    public static final b f8226p = new b();

    /* JADX INFO: renamed from: d */
    public ObjectAnimator f8227d;

    /* JADX INFO: renamed from: e */
    public ObjectAnimator f8228e;

    /* JADX INFO: renamed from: f */
    public final C8953b f8229f;

    /* JADX INFO: renamed from: g */
    public final C1364h f8230g;

    /* JADX INFO: renamed from: h */
    public int f8231h;

    /* JADX INFO: renamed from: i */
    public float f8232i;

    /* JADX INFO: renamed from: j */
    public float f8233j;

    /* JADX INFO: renamed from: k */
    public AbstractC9640c f8234k;

    /* JADX INFO: renamed from: bd.g$a */
    public class a extends Property<C1363g, Float> {
        public a() {
            super(Float.class, "animationFraction");
        }

        @Override // android.util.Property
        public final Float get(C1363g c1363g) {
            return Float.valueOf(c1363g.f8232i);
        }

        @Override // android.util.Property
        public final void set(C1363g c1363g, Float f3) {
            C8953b c8953b;
            C1363g c1363g2 = c1363g;
            float fFloatValue = f3.floatValue();
            c1363g2.f8232i = fFloatValue;
            int i10 = (int) (5400.0f * fFloatValue);
            float[] fArr = (float[]) c1363g2.f36837b;
            float f10 = fFloatValue * 1520.0f;
            fArr[0] = (-20.0f) + f10;
            fArr[1] = f10;
            int i11 = 0;
            while (true) {
                c8953b = c1363g2.f8229f;
                if (i11 >= 4) {
                    break;
                }
                float f11 = 667;
                float f12 = (i10 - C1363g.f8222l[i11]) / f11;
                float[] fArr2 = (float[]) c1363g2.f36837b;
                fArr2[1] = (c8953b.getInterpolation(f12) * 250.0f) + fArr2[1];
                float f13 = (i10 - C1363g.f8223m[i11]) / f11;
                float[] fArr3 = (float[]) c1363g2.f36837b;
                fArr3[0] = (c8953b.getInterpolation(f13) * 250.0f) + fArr3[0];
                i11++;
            }
            float[] fArr4 = (float[]) c1363g2.f36837b;
            float f14 = fArr4[0];
            float f15 = fArr4[1];
            float f16 = ((f15 - f14) * c1363g2.f8233j) + f14;
            fArr4[0] = f16;
            fArr4[0] = f16 / 360.0f;
            fArr4[1] = f15 / 360.0f;
            for (int i12 = 0; i12 < 4; i12++) {
                float f17 = (i10 - C1363g.f8224n[i12]) / 333;
                if (f17 >= 0.0f && f17 <= 1.0f) {
                    int i13 = i12 + c1363g2.f8231h;
                    C1364h c1364h = c1363g2.f8230g;
                    int[] iArr = c1364h.f8212c;
                    int length = i13 % iArr.length;
                    int length2 = (length + 1) % iArr.length;
                    ((int[]) c1363g2.f36838c)[0] = C6309b.m12938a(c8953b.getInterpolation(f17), Integer.valueOf(C0062b.m413x0(iArr[length], ((C1370n) c1363g2.f36836a).f8256j)), Integer.valueOf(C0062b.m413x0(c1364h.f8212c[length2], ((C1370n) c1363g2.f36836a).f8256j))).intValue();
                    break;
                }
            }
            ((C1370n) c1363g2.f36836a).invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: bd.g$b */
    public class b extends Property<C1363g, Float> {
        public b() {
            super(Float.class, "completeEndFraction");
        }

        @Override // android.util.Property
        public final Float get(C1363g c1363g) {
            return Float.valueOf(c1363g.f8233j);
        }

        @Override // android.util.Property
        public final void set(C1363g c1363g, Float f3) {
            c1363g.f8233j = f3.floatValue();
        }
    }

    public C1363g(C1364h c1364h) {
        super(1);
        this.f8231h = 0;
        this.f8234k = null;
        this.f8230g = c1364h;
        this.f8229f = new C8953b();
    }

    @Override // p185j.AbstractC6392b
    /* JADX INFO: renamed from: c */
    public final void mo4945c() {
        ObjectAnimator objectAnimator = this.f8227d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // p185j.AbstractC6392b
    /* JADX INFO: renamed from: f */
    public final void mo4946f() {
        m4951k();
    }

    @Override // p185j.AbstractC6392b
    /* JADX INFO: renamed from: g */
    public final void mo4947g(AbstractC1358b.c cVar) {
        this.f8234k = cVar;
    }

    @Override // p185j.AbstractC6392b
    /* JADX INFO: renamed from: h */
    public final void mo4948h() {
        ObjectAnimator objectAnimator = this.f8228e;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (((C1370n) this.f36836a).isVisible()) {
            this.f8228e.start();
        } else {
            mo4945c();
        }
    }

    @Override // p185j.AbstractC6392b
    /* JADX INFO: renamed from: i */
    public final void mo4949i() {
        if (this.f8227d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f8225o, 0.0f, 1.0f);
            this.f8227d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.f8227d.setInterpolator(null);
            this.f8227d.setRepeatCount(-1);
            this.f8227d.addListener(new C1361e(this));
        }
        if (this.f8228e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f8226p, 0.0f, 1.0f);
            this.f8228e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.f8228e.setInterpolator(this.f8229f);
            this.f8228e.addListener(new C1362f(this));
        }
        m4951k();
        this.f8227d.start();
    }

    @Override // p185j.AbstractC6392b
    /* JADX INFO: renamed from: j */
    public final void mo4950j() {
        this.f8234k = null;
    }

    /* JADX INFO: renamed from: k */
    public final void m4951k() {
        this.f8231h = 0;
        ((int[]) this.f36838c)[0] = C0062b.m413x0(this.f8230g.f8212c[0], ((C1370n) this.f36836a).f8256j);
        this.f8233j = 0.0f;
    }
}
