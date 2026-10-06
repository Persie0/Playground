package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ing {

    /* JADX INFO: renamed from: a */
    public double f31587a;

    /* JADX INFO: renamed from: b */
    public double f31588b;

    /* JADX INFO: renamed from: c */
    public double f31589c;

    /* JADX INFO: renamed from: d */
    public double f31590d;

    /* JADX INFO: renamed from: a */
    public final void m11510a(ing ingVar) {
        this.f31587a = ingVar.f31587a;
        this.f31588b = ingVar.f31588b;
        this.f31589c = ingVar.f31589c;
        this.f31590d = ingVar.f31590d;
    }

    /* JADX INFO: renamed from: b */
    public final void m11511b(float[] fArr) {
        float f = (float) this.f31587a;
        float f2 = (float) this.f31588b;
        float f3 = (float) this.f31589c;
        float f4 = (float) this.f31590d;
        float f5 = f3 + f3;
        float f6 = f2 + f2;
        float f7 = f6 * f2;
        float f8 = f3 * f5;
        fArr[0] = 1.0f - (f7 + f8);
        float f9 = f6 * f;
        float f10 = f5 * f4;
        fArr[1] = f9 + f10;
        float f11 = f5 * f;
        float f12 = f6 * f4;
        fArr[2] = f11 - f12;
        fArr[3] = 0.0f;
        fArr[4] = f9 - f10;
        float f13 = f + f;
        float f14 = f * f13;
        fArr[5] = 1.0f - (f8 + f14);
        float f15 = f5 * f2;
        float f16 = f13 * f4;
        fArr[6] = f15 + f16;
        fArr[7] = 0.0f;
        fArr[8] = f11 + f12;
        fArr[9] = f15 - f16;
        fArr[10] = 1.0f - (f14 + f7);
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }
}
