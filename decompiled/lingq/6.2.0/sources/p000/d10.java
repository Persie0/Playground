package p000;

/* JADX INFO: loaded from: classes.dex */
public final class d10 implements fp6 {

    /* JADX INFO: renamed from: a */
    public static final d10 f34817a = new d10();

    /* JADX INFO: renamed from: b */
    public static final c33 f34818b = c33.m4296c("baseAddress");

    /* JADX INFO: renamed from: c */
    public static final c33 f34819c = c33.m4296c("size");

    /* JADX INFO: renamed from: d */
    public static final c33 f34820d = c33.m4296c("name");

    /* JADX INFO: renamed from: e */
    public static final c33 f34821e = c33.m4296c("uuid");

    @Override // p000.yr2
    /* JADX INFO: renamed from: a */
    public final void mo24a(Object obj, Object obj2) {
        eq1 eq1Var = (eq1) obj;
        gp6 gp6Var = (gp6) obj2;
        gp6Var.mo12793g(f34818b, ((p30) eq1Var).f55506a);
        p30 p30Var = (p30) eq1Var;
        gp6Var.mo12793g(f34819c, p30Var.f55507b);
        gp6Var.mo12789a(f34820d, p30Var.f55508c);
        String str = p30Var.f55509d;
        gp6Var.mo12789a(f34821e, str != null ? str.getBytes(vq1.f65777a) : null);
    }
}
