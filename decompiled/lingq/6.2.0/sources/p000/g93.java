package p000;

/* JADX INFO: loaded from: classes.dex */
public final class g93 implements tj8 {

    /* JADX INFO: renamed from: a */
    public static final g93 f40419a = new g93();

    @Override // p000.tj8
    /* JADX INFO: renamed from: a */
    public final e16 mo12420a(float f, e16 e16Var, boolean z) {
        if (f <= 0.0d) {
            g54.m12362a("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return e16Var.mo3161g(new as4(f, true));
    }

    @Override // p000.tj8
    /* JADX INFO: renamed from: b */
    public final e16 mo12421b(e16 e16Var) {
        return new opa(nj0.f52789H);
    }
}
