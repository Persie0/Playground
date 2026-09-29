package p000;

import androidx.compose.p002ui.input.pointer.util.VelocityTracker1D$Strategy;

/* JADX INFO: loaded from: classes.dex */
public final class fpa {

    /* JADX INFO: renamed from: a */
    public final boolean f39434a;

    /* JADX INFO: renamed from: b */
    public final VelocityTracker1D$Strategy f39435b;

    /* JADX INFO: renamed from: c */
    public final int f39436c;

    /* JADX INFO: renamed from: d */
    public final b02[] f39437d;

    /* JADX INFO: renamed from: e */
    public int f39438e;

    /* JADX INFO: renamed from: f */
    public final float[] f39439f;

    /* JADX INFO: renamed from: g */
    public final float[] f39440g;

    /* JADX INFO: renamed from: h */
    public final float[] f39441h;

    public fpa(boolean z, VelocityTracker1D$Strategy velocityTracker1D$Strategy) {
        this.f39434a = z;
        this.f39435b = velocityTracker1D$Strategy;
        if (z && velocityTracker1D$Strategy.equals(VelocityTracker1D$Strategy.Lsq2)) {
            C3386nv.m17633t("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int i = epa.f37693a[velocityTracker1D$Strategy.ordinal()];
        int i2 = 2;
        if (i != 1) {
            if (i != 2) {
                gm5.m12750e();
                throw null;
            }
            i2 = 3;
        }
        this.f39436c = i2;
        this.f39437d = new b02[20];
        this.f39439f = new float[20];
        this.f39440g = new float[20];
        this.f39441h = new float[3];
    }

    /* JADX INFO: renamed from: a */
    public final void m11988a(float f, long j) {
        int i = (this.f39438e + 1) % 20;
        this.f39438e = i;
        b02[] b02VarArr = this.f39437d;
        b02 b02Var = b02VarArr[i];
        if (b02Var != null) {
            b02Var.f7717a = j;
            b02Var.f7718b = f;
        } else {
            b02 b02Var2 = new b02();
            b02Var2.f7717a = j;
            b02Var2.f7718b = f;
            b02VarArr[i] = b02Var2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final float m11989b(float f) {
        VelocityTracker1D$Strategy velocityTracker1D$Strategy;
        float[] fArr;
        float[] fArr2;
        float f2;
        boolean z;
        int i;
        float f3;
        float fSignum;
        float f4 = 0.0f;
        if (f <= 0.0f) {
            i54.m13663b("maximumVelocity should be a positive value. You specified=" + f);
        }
        int i2 = this.f39438e;
        b02[] b02VarArr = this.f39437d;
        b02 b02Var = b02VarArr[i2];
        if (b02Var == null) {
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            int i3 = 0;
            b02 b02Var2 = b02Var;
            while (true) {
                b02 b02Var3 = b02VarArr[i2];
                boolean z2 = this.f39434a;
                velocityTracker1D$Strategy = this.f39435b;
                fArr = this.f39439f;
                fArr2 = this.f39440g;
                if (b02Var3 == null) {
                    f2 = f4;
                    z = z2;
                    i = 1;
                    break;
                }
                long j = b02Var.f7717a;
                f2 = f4;
                int i4 = i2;
                long j2 = b02Var3.f7717a;
                float f5 = j - j2;
                z = z2;
                i = 1;
                float fAbs = Math.abs(j2 - b02Var2.f7717a);
                b02Var2 = (velocityTracker1D$Strategy == VelocityTracker1D$Strategy.Lsq2 || z) ? b02Var3 : b02Var;
                if (f5 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i3] = b02Var3.f7718b;
                fArr2[i3] = -f5;
                i2 = (i4 == 0 ? 20 : i4) - 1;
                i3++;
                if (i3 >= 20) {
                    break;
                }
                f4 = f2;
            }
            if (i3 >= this.f39436c) {
                int i5 = epa.f37693a[velocityTracker1D$Strategy.ordinal()];
                if (i5 == i) {
                    int i6 = i3 - i;
                    float f6 = fArr2[i6];
                    int i7 = i6;
                    float fAbs2 = f2;
                    while (i7 > 0) {
                        int i8 = i7 - 1;
                        float f7 = fArr2[i8];
                        if (f6 != f7) {
                            float f8 = (z ? -fArr[i8] : fArr[i7] - fArr[i8]) / (f6 - f7);
                            fAbs2 += Math.abs(f8) * (f8 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2.0f))));
                            if (i7 == i6) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i7--;
                        f6 = f7;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2.0f));
                } else {
                    if (i5 != 2) {
                        gm5.m12750e();
                        return f2;
                    }
                    try {
                        float[] fArr3 = this.f39441h;
                        afa.m354d(fArr2, fArr, i3, fArr3);
                        fSignum = fArr3[i];
                    } catch (IllegalArgumentException unused) {
                        fSignum = f2;
                    }
                }
                f3 = fSignum * 1000.0f;
            } else {
                f3 = f2;
            }
        }
        if (f3 == f2 || Float.isNaN(f3)) {
            return f2;
        }
        if (f3 <= f2) {
            float f9 = -f;
            if (f3 < f9) {
                return f9;
            }
        } else if (f3 > f) {
            f3 = f;
        }
        return f3;
    }

    public fpa() {
        this(true, VelocityTracker1D$Strategy.Impulse);
    }
}
