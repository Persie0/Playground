package p000;

/* JADX INFO: loaded from: classes.dex */
public final class c20 implements fp6 {

    /* JADX INFO: renamed from: a */
    public static final c20 f9324a = new c20();

    /* JADX INFO: renamed from: b */
    public static final c33 f9325b;

    /* JADX INFO: renamed from: c */
    public static final c33 f9326c;

    static {
        C3126ix c3126ixM14165c = C3126ix.m14165c();
        c3126ixM14165c.f44720b = 1;
        f9325b = new c33("startMs", AbstractC3393o1.m17744s(AbstractC3393o1.m17743r(fo7.class, c3126ixM14165c.m14168b())));
        C3126ix c3126ixM14165c2 = C3126ix.m14165c();
        c3126ixM14165c2.f44720b = 2;
        f9326c = new c33("endMs", AbstractC3393o1.m17744s(AbstractC3393o1.m17743r(fo7.class, c3126ixM14165c2.m14168b())));
    }

    @Override // p000.yr2
    /* JADX INFO: renamed from: a */
    public final void mo24a(Object obj, Object obj2) {
        u0a u0aVar = (u0a) obj;
        gp6 gp6Var = (gp6) obj2;
        gp6Var.mo12793g(f9325b, u0aVar.f63220a);
        gp6Var.mo12793g(f9326c, u0aVar.f63221b);
    }
}
