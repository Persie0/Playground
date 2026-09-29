package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class hq5 extends to2 {

    /* JADX INFO: renamed from: d */
    public final float f42778d;

    public hq5(float f) {
        this.f42778d = f - 0.001f;
    }

    @Override // p000.to2
    /* JADX INFO: renamed from: i */
    public final void mo13433i(float f, float f2, float f3, l49 l49Var) {
        double d = this.f42778d;
        float fSqrt = (float) ((Math.sqrt(2.0d) * d) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(d, 2.0d) - Math.pow(fSqrt, 2.0d));
        l49Var.m15800d(f2 - fSqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + fSqrt2, 270.0f, 0.0f);
        l49Var.m15799c(f2, (float) (-((Math.sqrt(2.0d) * d) - d)));
        l49Var.m15799c(f2 + fSqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + fSqrt2);
    }
}
