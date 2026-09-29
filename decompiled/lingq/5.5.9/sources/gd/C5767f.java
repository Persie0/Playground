package gd;

/* JADX INFO: renamed from: gd.f */
/* JADX INFO: loaded from: classes.dex */
public final class C5767f extends C5766e {

    /* JADX INFO: renamed from: a */
    public final float f34845a;

    public C5767f(float f3) {
        this.f34845a = f3 - 0.001f;
    }

    @Override // gd.C5766e
    /* JADX INFO: renamed from: c */
    public final void mo12129c(float f3, float f10, float f11, C5775n c5775n) {
        double d10 = this.f34845a;
        float fSqrt = (float) ((Math.sqrt(2.0d) * d10) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(d10, 2.0d) - Math.pow(fSqrt, 2.0d));
        c5775n.m12168e(f10 - fSqrt, ((float) (-((Math.sqrt(2.0d) * d10) - d10))) + fSqrt2, 270.0f, 0.0f);
        c5775n.m12167d(f10, (float) (-((Math.sqrt(2.0d) * d10) - d10)));
        c5775n.m12167d(f10 + fSqrt, ((float) (-((Math.sqrt(2.0d) * d10) - d10))) + fSqrt2);
    }
}
