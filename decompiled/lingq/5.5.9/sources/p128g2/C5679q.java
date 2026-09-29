package p128g2;

import androidx.activity.result.C0204c;
import androidx.constraintlayout.widget.C0762b;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.util.LinkedHashMap;
import p038c2.C1660c;

/* JADX INFO: renamed from: g2.q */
/* JADX INFO: loaded from: classes.dex */
public final class C5679q implements Comparable<C5679q> {

    /* JADX INFO: renamed from: M */
    public static final String[] f34645M = {"position", "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: H */
    public C5676n f34646H;

    /* JADX INFO: renamed from: I */
    public final LinkedHashMap<String, ConstraintAttribute> f34647I;

    /* JADX INFO: renamed from: J */
    public int f34648J;

    /* JADX INFO: renamed from: K */
    public double[] f34649K;

    /* JADX INFO: renamed from: L */
    public double[] f34650L;

    /* JADX INFO: renamed from: a */
    public C1660c f34651a;

    /* JADX INFO: renamed from: b */
    public int f34652b;

    /* JADX INFO: renamed from: c */
    public float f34653c;

    /* JADX INFO: renamed from: d */
    public float f34654d;

    /* JADX INFO: renamed from: e */
    public float f34655e;

    /* JADX INFO: renamed from: f */
    public float f34656f;

    /* JADX INFO: renamed from: g */
    public float f34657g;

    /* JADX INFO: renamed from: h */
    public float f34658h;

    /* JADX INFO: renamed from: i */
    public float f34659i;

    /* JADX INFO: renamed from: j */
    public int f34660j;

    /* JADX INFO: renamed from: k */
    public int f34661k;

    /* JADX INFO: renamed from: l */
    public float f34662l;

    public C5679q() {
        this.f34652b = 0;
        this.f34659i = Float.NaN;
        this.f34660j = -1;
        this.f34661k = -1;
        this.f34662l = Float.NaN;
        this.f34646H = null;
        this.f34647I = new LinkedHashMap<>();
        this.f34648J = 0;
        this.f34649K = new double[18];
        this.f34650L = new double[18];
    }

    public C5679q(int i10, int i11, C5670h c5670h, C5679q c5679q, C5679q c5679q2) {
        float f3;
        int i12;
        float fMin;
        float fM845d;
        this.f34652b = 0;
        this.f34659i = Float.NaN;
        this.f34660j = -1;
        this.f34661k = -1;
        this.f34662l = Float.NaN;
        this.f34646H = null;
        this.f34647I = new LinkedHashMap<>();
        this.f34648J = 0;
        this.f34649K = new double[18];
        this.f34650L = new double[18];
        if (c5679q.f34661k != -1) {
            float f10 = c5670h.f34497a / 100.0f;
            this.f34653c = f10;
            this.f34652b = c5670h.f34541h;
            this.f34648J = c5670h.f34548o;
            float f11 = Float.isNaN(c5670h.f34542i) ? f10 : c5670h.f34542i;
            float f12 = Float.isNaN(c5670h.f34543j) ? f10 : c5670h.f34543j;
            float f13 = c5679q2.f34657g;
            float f14 = c5679q.f34657g;
            float f15 = c5679q2.f34658h;
            float f16 = c5679q.f34658h;
            this.f34654d = this.f34653c;
            this.f34657g = (int) (((f13 - f14) * f11) + f14);
            this.f34658h = (int) (((f15 - f16) * f12) + f16);
            int i13 = c5670h.f34548o;
            if (i13 == 1) {
                float f17 = Float.isNaN(c5670h.f34544k) ? f10 : c5670h.f34544k;
                float f18 = c5679q2.f34655e;
                float f19 = c5679q.f34655e;
                this.f34655e = C0204c.m845d(f18, f19, f17, f19);
                f10 = Float.isNaN(c5670h.f34545l) ? f10 : c5670h.f34545l;
                float f20 = c5679q2.f34656f;
                float f21 = c5679q.f34656f;
                this.f34656f = C0204c.m845d(f20, f21, f10, f21);
            } else if (i13 != 2) {
                float f22 = Float.isNaN(c5670h.f34544k) ? f10 : c5670h.f34544k;
                float f23 = c5679q2.f34655e;
                float f24 = c5679q.f34655e;
                this.f34655e = C0204c.m845d(f23, f24, f22, f24);
                f10 = Float.isNaN(c5670h.f34545l) ? f10 : c5670h.f34545l;
                float f25 = c5679q2.f34656f;
                float f26 = c5679q.f34656f;
                this.f34656f = C0204c.m845d(f25, f26, f10, f26);
            } else {
                if (Float.isNaN(c5670h.f34544k)) {
                    float f27 = c5679q2.f34655e;
                    float f28 = c5679q.f34655e;
                    fMin = C0204c.m845d(f27, f28, f10, f28);
                } else {
                    fMin = c5670h.f34544k * Math.min(f12, f11);
                }
                this.f34655e = fMin;
                if (Float.isNaN(c5670h.f34545l)) {
                    float f29 = c5679q2.f34656f;
                    float f30 = c5679q.f34656f;
                    fM845d = C0204c.m845d(f29, f30, f10, f30);
                } else {
                    fM845d = c5670h.f34545l;
                }
                this.f34656f = fM845d;
            }
            this.f34661k = c5679q.f34661k;
            this.f34651a = C1660c.m5383c(c5670h.f34539f);
            this.f34660j = c5670h.f34540g;
            return;
        }
        int i14 = c5670h.f34548o;
        if (i14 == 1) {
            float f31 = c5670h.f34497a / 100.0f;
            this.f34653c = f31;
            this.f34652b = c5670h.f34541h;
            float f32 = Float.isNaN(c5670h.f34542i) ? f31 : c5670h.f34542i;
            float f33 = Float.isNaN(c5670h.f34543j) ? f31 : c5670h.f34543j;
            float f34 = c5679q2.f34657g - c5679q.f34657g;
            float f35 = c5679q2.f34658h - c5679q.f34658h;
            this.f34654d = this.f34653c;
            f31 = Float.isNaN(c5670h.f34544k) ? f31 : c5670h.f34544k;
            float f36 = c5679q.f34655e;
            float f37 = c5679q.f34657g;
            float f38 = c5679q.f34656f;
            float f39 = c5679q.f34658h;
            float f40 = ((c5679q2.f34657g / 2.0f) + c5679q2.f34655e) - ((f37 / 2.0f) + f36);
            float f41 = ((c5679q2.f34658h / 2.0f) + c5679q2.f34656f) - ((f39 / 2.0f) + f38);
            float f42 = f40 * f31;
            float f43 = f34 * f32;
            float f44 = f43 / 2.0f;
            this.f34655e = (int) ((f36 + f42) - f44);
            float f45 = f31 * f41;
            float f46 = f35 * f33;
            float f47 = f46 / 2.0f;
            this.f34656f = (int) ((f38 + f45) - f47);
            this.f34657g = (int) (f37 + f43);
            this.f34658h = (int) (f39 + f46);
            float f48 = Float.isNaN(c5670h.f34545l) ? 0.0f : c5670h.f34545l;
            this.f34648J = 1;
            float f49 = (int) ((c5679q.f34655e + f42) - f44);
            float f50 = (int) ((c5679q.f34656f + f45) - f47);
            this.f34655e = f49 + ((-f41) * f48);
            this.f34656f = f50 + (f40 * f48);
            this.f34661k = this.f34661k;
            this.f34651a = C1660c.m5383c(c5670h.f34539f);
            this.f34660j = c5670h.f34540g;
            return;
        }
        if (i14 == 2) {
            float f51 = c5670h.f34497a / 100.0f;
            this.f34653c = f51;
            this.f34652b = c5670h.f34541h;
            float f52 = Float.isNaN(c5670h.f34542i) ? f51 : c5670h.f34542i;
            float f53 = Float.isNaN(c5670h.f34543j) ? f51 : c5670h.f34543j;
            float f54 = c5679q2.f34657g;
            float f55 = c5679q.f34657g;
            float f56 = f54 - f55;
            float f57 = c5679q2.f34658h;
            float f58 = c5679q.f34658h;
            float f59 = f57 - f58;
            this.f34654d = this.f34653c;
            float f60 = c5679q.f34655e;
            float f61 = c5679q.f34656f;
            float f62 = (f54 / 2.0f) + c5679q2.f34655e;
            float f63 = (f57 / 2.0f) + c5679q2.f34656f;
            float f64 = f56 * f52;
            this.f34655e = (int) ((((f62 - ((f55 / 2.0f) + f60)) * f51) + f60) - (f64 / 2.0f));
            float f65 = f59 * f53;
            this.f34656f = (int) ((((f63 - ((f58 / 2.0f) + f61)) * f51) + f61) - (f65 / 2.0f));
            this.f34657g = (int) (f55 + f64);
            this.f34658h = (int) (f58 + f65);
            this.f34648J = 2;
            if (!Float.isNaN(c5670h.f34544k)) {
                this.f34655e = (int) (c5670h.f34544k * ((int) (i10 - this.f34657g)));
            }
            if (!Float.isNaN(c5670h.f34545l)) {
                this.f34656f = (int) (c5670h.f34545l * ((int) (i11 - this.f34658h)));
            }
            this.f34661k = this.f34661k;
            this.f34651a = C1660c.m5383c(c5670h.f34539f);
            this.f34660j = c5670h.f34540g;
            return;
        }
        float f66 = c5670h.f34497a / 100.0f;
        this.f34653c = f66;
        this.f34652b = c5670h.f34541h;
        float f67 = Float.isNaN(c5670h.f34542i) ? f66 : c5670h.f34542i;
        float f68 = Float.isNaN(c5670h.f34543j) ? f66 : c5670h.f34543j;
        float f69 = c5679q2.f34657g;
        float f70 = c5679q.f34657g;
        float f71 = f69 - f70;
        float f72 = c5679q2.f34658h;
        float f73 = c5679q.f34658h;
        float f74 = f72 - f73;
        this.f34654d = this.f34653c;
        float f75 = c5679q.f34655e;
        float f76 = c5679q.f34656f;
        float f77 = ((f69 / 2.0f) + c5679q2.f34655e) - ((f70 / 2.0f) + f75);
        float f78 = ((f72 / 2.0f) + c5679q2.f34656f) - ((f73 / 2.0f) + f76);
        float f79 = f71 * f67;
        float f80 = f79 / 2.0f;
        this.f34655e = (int) (((f77 * f66) + f75) - f80);
        float f81 = (f78 * f66) + f76;
        float f82 = f74 * f68;
        float f83 = f82 / 2.0f;
        this.f34656f = (int) (f81 - f83);
        this.f34657g = (int) (f70 + f79);
        this.f34658h = (int) (f73 + f82);
        float f84 = Float.isNaN(c5670h.f34544k) ? f66 : c5670h.f34544k;
        float f85 = Float.isNaN(c5670h.f34547n) ? 0.0f : c5670h.f34547n;
        f66 = Float.isNaN(c5670h.f34545l) ? f66 : c5670h.f34545l;
        if (Float.isNaN(c5670h.f34546m)) {
            i12 = 0;
            f3 = 0.0f;
        } else {
            f3 = c5670h.f34546m;
            i12 = 0;
        }
        this.f34648J = i12;
        this.f34655e = (int) (((f3 * f78) + ((f84 * f77) + c5679q.f34655e)) - f80);
        this.f34656f = (int) (((f78 * f66) + ((f77 * f85) + c5679q.f34656f)) - f83);
        this.f34651a = C1660c.m5383c(c5670h.f34539f);
        this.f34660j = c5670h.f34540g;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m12045f(float f3, float f10) {
        if (!Float.isNaN(f3) && !Float.isNaN(f10)) {
            return Math.abs(f3 - f10) > 1.0E-6f;
        }
        return Float.isNaN(f3) != Float.isNaN(f10);
    }

    /* JADX INFO: renamed from: l */
    public static void m12046l(float f3, float f10, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            float f15 = (float) dArr[i10];
            double d10 = dArr2[i10];
            int i11 = iArr[i10];
            if (i11 == 1) {
                f12 = f15;
            } else if (i11 == 2) {
                f14 = f15;
            } else if (i11 == 3) {
                f11 = f15;
            } else if (i11 == 4) {
                f13 = f15;
            }
        }
        float f16 = f12 - ((0.0f * f11) / 2.0f);
        float f17 = f14 - ((0.0f * f13) / 2.0f);
        fArr[0] = (((f11 * 1.0f) + f16) * f3) + ((1.0f - f3) * f16) + 0.0f;
        fArr[1] = (((f13 * 1.0f) + f17) * f10) + ((1.0f - f10) * f17) + 0.0f;
    }

    /* JADX INFO: renamed from: a */
    public final void m12047a(C0762b.a aVar) {
        this.f34651a = C1660c.m5383c(aVar.f5386d.f5476d);
        C0762b.c cVar = aVar.f5386d;
        this.f34660j = cVar.f5477e;
        this.f34661k = cVar.f5474b;
        this.f34659i = cVar.f5480h;
        this.f34652b = cVar.f5478f;
        float f3 = aVar.f5385c.f5490e;
        this.f34662l = aVar.f5387e.f5406C;
        while (true) {
            for (String str : aVar.f5389g.keySet()) {
                ConstraintAttribute constraintAttribute = aVar.f5389g.get(str);
                if (constraintAttribute != null) {
                    int i10 = ConstraintAttribute.C0757a.f5269a[constraintAttribute.f5263c.ordinal()];
                    boolean z10 = true;
                    if (i10 == 1 || i10 == 2 || i10 == 3) {
                        z10 = false;
                    }
                    if (z10) {
                        this.f34647I.put(str, constraintAttribute);
                    }
                }
            }
            return;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(C5679q c5679q) {
        return Float.compare(this.f34654d, c5679q.f34654d);
    }

    /* JADX INFO: renamed from: g */
    public final void m12048g(double d10, int[] iArr, double[] dArr, float[] fArr, int i10) {
        float fSin = this.f34655e;
        float fCos = this.f34656f;
        float f3 = this.f34657g;
        float f10 = this.f34658h;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            float f11 = (float) dArr[i11];
            int i12 = iArr[i11];
            if (i12 == 1) {
                fSin = f11;
            } else if (i12 == 2) {
                fCos = f11;
            } else if (i12 == 3) {
                f3 = f11;
            } else if (i12 == 4) {
                f10 = f11;
            }
        }
        C5676n c5676n = this.f34646H;
        if (c5676n != null) {
            float[] fArr2 = new float[2];
            c5676n.m12041b(d10, fArr2, new float[2]);
            float f12 = fArr2[0];
            float f13 = fArr2[1];
            double d11 = f12;
            double d12 = fSin;
            double d13 = fCos;
            fSin = (float) (((Math.sin(d13) * d12) + d11) - ((double) (f3 / 2.0f)));
            fCos = (float) ((((double) f13) - (Math.cos(d13) * d12)) - ((double) (f10 / 2.0f)));
        }
        fArr[i10] = (f3 / 2.0f) + fSin + 0.0f;
        fArr[i10 + 1] = (f10 / 2.0f) + fCos + 0.0f;
    }

    /* JADX INFO: renamed from: i */
    public final void m12049i(float f3, float f10, float f11, float f12) {
        this.f34655e = f3;
        this.f34656f = f10;
        this.f34657g = f11;
        this.f34658h = f12;
    }

    /* JADX INFO: renamed from: m */
    public final void m12050m(C5676n c5676n, C5679q c5679q) {
        double d10 = (((this.f34657g / 2.0f) + this.f34655e) - c5679q.f34655e) - (c5679q.f34657g / 2.0f);
        double d11 = (((this.f34658h / 2.0f) + this.f34656f) - c5679q.f34656f) - (c5679q.f34658h / 2.0f);
        this.f34646H = c5676n;
        this.f34655e = (float) Math.hypot(d11, d10);
        if (Float.isNaN(this.f34662l)) {
            this.f34656f = (float) (Math.atan2(d11, d10) + 1.5707963267948966d);
        } else {
            this.f34656f = (float) Math.toRadians(this.f34662l);
        }
    }
}
