package p000;

import android.opengl.GLES20;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ejj implements ejc {

    /* JADX INFO: renamed from: a */
    private final float[] f14329a;

    /* JADX INFO: renamed from: b */
    private elq f14330b;

    /* JADX INFO: renamed from: d */
    private int f14332d;

    /* JADX INFO: renamed from: e */
    private float[] f14333e;

    /* JADX INFO: renamed from: f */
    private final eim f14334f;

    /* JADX INFO: renamed from: g */
    private final ejd f14335g;

    /* JADX INFO: renamed from: h */
    private final hah f14336h;

    /* JADX INFO: renamed from: c */
    private final float[] f14331c = new float[3];

    /* JADX INFO: renamed from: i */
    private hyn f14337i = hyn.OFF;

    public ejj(ejd ejdVar, eim eimVar, hah hahVar) {
        float[] fArr = {1.0f, 1.0f, 1.0f, 1.0f};
        this.f14329a = fArr;
        this.f14334f = eimVar;
        this.f14335g = ejdVar;
        this.f14336h = hahVar;
        elq elqVar = new elq();
        this.f14330b = elqVar;
        System.arraycopy(fArr, 0, elqVar.f14619a, 0, 4);
    }

    @Override // p000.ejc
    /* JADX INFO: renamed from: a */
    public final void mo7390a() {
        elq elqVar = this.f14330b;
        if (elqVar != null) {
            elqVar.m7464a();
            this.f14330b = null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p000.ejc
    /* JADX INFO: renamed from: b */
    public final void mo7391b() {
        hyn hynVarM10873a = hyn.m10873a(((Integer) this.f14336h.mo10031c(gzy.f27045d)).intValue());
        int i = 0;
        if (this.f14337i != hynVarM10873a) {
            this.f14337i = hynVarM10873a;
            switch (hynVarM10873a) {
                case OFF:
                    this.f14332d = 0;
                    break;
                case THREE_BY_THREE:
                    this.f14332d = 2;
                    float[] fArr = this.f14331c;
                    fArr[0] = 0.33333334f;
                    fArr[1] = 0.6666667f;
                    this.f14333e = new float[this.f14332d * 8];
                    break;
                case FOUR_BY_FOUR:
                    this.f14332d = 3;
                    float[] fArr2 = this.f14331c;
                    fArr2[0] = 0.25f;
                    fArr2[1] = 0.5f;
                    fArr2[2] = 0.75f;
                    this.f14333e = new float[this.f14332d * 8];
                    break;
                case GOLDEN_RATIO:
                    this.f14332d = 2;
                    float[] fArr3 = this.f14331c;
                    fArr3[0] = 0.38196602f;
                    fArr3[1] = 0.618034f;
                    this.f14333e = new float[this.f14332d * 8];
                    break;
                default:
                    this.f14333e = new float[this.f14332d * 8];
                    break;
            }
        }
        if (this.f14330b == null || this.f14332d == 0 || !this.f14334f.m7361b()) {
            return;
        }
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        ejd ejdVar = this.f14335g;
        if (ejdVar.f14312h) {
            int i2 = 0;
            while (i < this.f14332d) {
                float f = this.f14335g.f14308d;
                float f2 = f / 2.0f;
                float[] fArr4 = this.f14331c;
                float f3 = fArr4[i] * f;
                float[] fArr5 = this.f14333e;
                int i3 = i2 + 1;
                float f4 = f2 - f3;
                fArr5[i2] = f4;
                fArr5[i3] = 1.0f;
                int i4 = i3 + 1;
                fArr5[i4] = f4;
                int i5 = i4 + 1;
                fArr5[i5] = -1.0f;
                float f5 = fArr4[i];
                int i6 = i5 + 1;
                fArr5[i6] = (-f) / 2.0f;
                int i7 = i6 + 1;
                float f6 = (f5 + f5) - 1.0f;
                fArr5[i7] = f6;
                int i8 = i7 + 1;
                fArr5[i8] = f2;
                int i9 = i8 + 1;
                fArr5[i9] = f6;
                i2 = i9 + 1;
                i++;
            }
        } else {
            float f7 = ejdVar.f14305a;
            float f8 = -f7;
            float f9 = f7 - f8;
            int i10 = 0;
            while (i < this.f14332d) {
                float[] fArr6 = this.f14331c;
                float f10 = (fArr6[i] * f9) + f8;
                float[] fArr7 = this.f14333e;
                int i11 = i10 + 1;
                fArr7[i10] = f10;
                float f11 = this.f14335g.f14309e;
                float f12 = f11 / 2.0f;
                fArr7[i11] = f12;
                int i12 = i11 + 1;
                fArr7[i12] = f10;
                int i13 = i12 + 1;
                fArr7[i13] = (-f11) / 2.0f;
                float f13 = f11 * fArr6[i];
                int i14 = i13 + 1;
                fArr7[i14] = f8;
                int i15 = i14 + 1;
                float f14 = f12 - f13;
                fArr7[i15] = f14;
                int i16 = i15 + 1;
                fArr7[i16] = f7;
                int i17 = i16 + 1;
                fArr7[i17] = f14;
                i10 = i17 + 1;
                i++;
            }
        }
        elq elqVar = this.f14330b;
        elqVar.getClass();
        elqVar.m7466c(this.f14333e, 1.0f);
        elq elqVar2 = this.f14330b;
        elqVar2.getClass();
        elqVar2.m7465b();
    }

    @Override // p000.ejc
    /* JADX INFO: renamed from: c */
    public final void mo7392c(int i, int i2) {
        elq elqVar = this.f14330b;
        if (elqVar != null) {
            elqVar.m7467d(i, i2);
        }
    }
}
