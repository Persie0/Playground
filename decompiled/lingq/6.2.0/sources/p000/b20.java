package p000;

/* JADX INFO: loaded from: classes.dex */
public final class b20 implements fp6 {

    /* JADX INFO: renamed from: a */
    public static final b20 f7777a = new b20();

    /* JADX INFO: renamed from: b */
    public static final c33 f7778b;

    /* JADX INFO: renamed from: c */
    public static final c33 f7779c;

    static {
        C3126ix c3126ixM14165c = C3126ix.m14165c();
        c3126ixM14165c.f44720b = 1;
        f7778b = new c33("currentCacheSizeBytes", AbstractC3393o1.m17744s(AbstractC3393o1.m17743r(fo7.class, c3126ixM14165c.m14168b())));
        C3126ix c3126ixM14165c2 = C3126ix.m14165c();
        c3126ixM14165c2.f44720b = 2;
        f7779c = new c33("maxCacheSizeBytes", AbstractC3393o1.m17744s(AbstractC3393o1.m17743r(fo7.class, c3126ixM14165c2.m14168b())));
    }

    @Override // p000.yr2
    /* JADX INFO: renamed from: a */
    public final void mo24a(Object obj, Object obj2) {
        aj9 aj9Var = (aj9) obj;
        gp6 gp6Var = (gp6) obj2;
        gp6Var.mo12793g(f7778b, aj9Var.f730a);
        gp6Var.mo12793g(f7779c, aj9Var.f731b);
    }
}
