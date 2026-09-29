package p000;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class i36 implements Comparable {

    /* JADX INFO: renamed from: M */
    public static final String[] f43407M = {"position", "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: a */
    public fo2 f43413a;

    /* JADX INFO: renamed from: c */
    public float f43415c;

    /* JADX INFO: renamed from: d */
    public float f43416d;

    /* JADX INFO: renamed from: e */
    public float f43417e;

    /* JADX INFO: renamed from: f */
    public float f43418f;

    /* JADX INFO: renamed from: g */
    public float f43419g;

    /* JADX INFO: renamed from: h */
    public float f43420h;

    /* JADX INFO: renamed from: b */
    public int f43414b = 0;

    /* JADX INFO: renamed from: i */
    public float f43421i = Float.NaN;

    /* JADX INFO: renamed from: j */
    public int f43422j = -1;

    /* JADX INFO: renamed from: k */
    public int f43423k = -1;

    /* JADX INFO: renamed from: l */
    public float f43424l = Float.NaN;

    /* JADX INFO: renamed from: H */
    public y26 f43408H = null;

    /* JADX INFO: renamed from: I */
    public LinkedHashMap f43409I = new LinkedHashMap();

    /* JADX INFO: renamed from: J */
    public int f43410J = 0;

    /* JADX INFO: renamed from: K */
    public double[] f43411K = new double[18];

    /* JADX INFO: renamed from: L */
    public double[] f43412L = new double[18];

    /* JADX INFO: renamed from: b */
    public static boolean m13637b(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return Float.isNaN(f) != Float.isNaN(f2);
        }
        return Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX INFO: renamed from: e */
    public static void m13638e(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f3 = f7;
            } else if (i2 == 2) {
                f5 = f7;
            } else if (i2 == 3) {
                f4 = f7;
            } else if (i2 == 4) {
                f6 = f7;
            }
        }
        float f8 = f3 - ((0.0f * f4) / 2.0f);
        float f9 = f5 - ((0.0f * f6) / 2.0f);
        fArr[0] = (((f4 * 1.0f) + f8) * f) + ((1.0f - f) * f8) + 0.0f;
        fArr[1] = (((f6 * 1.0f) + f9) * f2) + ((1.0f - f2) * f9) + 0.0f;
    }

    /* JADX INFO: renamed from: a */
    public final void m13639a(nj1 nj1Var) {
        int iOrdinal;
        this.f43413a = fo2.m11964d(nj1Var.f52822d.f56300d);
        pj1 pj1Var = nj1Var.f52822d;
        this.f43422j = pj1Var.f56301e;
        this.f43423k = pj1Var.f56298b;
        this.f43421i = pj1Var.f56304h;
        this.f43414b = pj1Var.f56302f;
        this.f43424l = nj1Var.f52823e.f54392C;
        for (String str : nj1Var.f52825g.keySet()) {
            cj1 cj1Var = (cj1) nj1Var.f52825g.get(str);
            if (cj1Var != null && (iOrdinal = cj1Var.f10161c.ordinal()) != 4 && iOrdinal != 5 && iOrdinal != 7) {
                this.f43409I.put(str, cj1Var);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m13640c(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f43417e;
        float fCos = this.f43418f;
        float f2 = this.f43419g;
        float f3 = this.f43420h;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f4 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f4;
            } else if (i3 == 2) {
                fCos = f4;
            } else if (i3 == 3) {
                f2 = f4;
            } else if (i3 == 4) {
                f3 = f4;
            }
        }
        y26 y26Var = this.f43408H;
        if (y26Var != null) {
            float[] fArr2 = new float[2];
            y26Var.m24866b(d, fArr2, new float[2]);
            float f5 = fArr2[0];
            float f6 = fArr2[1];
            double d2 = f;
            double d3 = fCos;
            double dSin = Math.sin(d3) * d2;
            fCos = (float) ((((double) f6) - (Math.cos(d3) * d2)) - ((double) (f3 / 2.0f)));
            f = (float) ((dSin + ((double) f5)) - ((double) (f2 / 2.0f)));
        }
        fArr[i] = (f2 / 2.0f) + f + 0.0f;
        fArr[i + 1] = (f3 / 2.0f) + fCos + 0.0f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.f43416d, ((i36) obj).f43416d);
    }

    /* JADX INFO: renamed from: d */
    public final void m13641d(float f, float f2, float f3, float f4) {
        this.f43417e = f;
        this.f43418f = f2;
        this.f43419g = f3;
        this.f43420h = f4;
    }

    /* JADX INFO: renamed from: f */
    public final void m13642f(y26 y26Var, i36 i36Var) {
        double d = (((this.f43419g / 2.0f) + this.f43417e) - i36Var.f43417e) - (i36Var.f43419g / 2.0f);
        double d2 = (((this.f43420h / 2.0f) + this.f43418f) - i36Var.f43418f) - (i36Var.f43420h / 2.0f);
        this.f43408H = y26Var;
        this.f43417e = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.f43424l)) {
            this.f43418f = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.f43418f = (float) Math.toRadians(this.f43424l);
        }
    }
}
