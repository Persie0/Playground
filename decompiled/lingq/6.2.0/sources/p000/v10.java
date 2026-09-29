package p000;

/* JADX INFO: loaded from: classes.dex */
public final class v10 implements fp6 {

    /* JADX INFO: renamed from: a */
    public static final v10 f64683a = new v10();

    /* JADX INFO: renamed from: b */
    public static final c33 f64684b;

    /* JADX INFO: renamed from: c */
    public static final c33 f64685c;

    static {
        C3126ix c3126ixM14165c = C3126ix.m14165c();
        c3126ixM14165c.f44720b = 1;
        f64684b = new c33("eventsDroppedCount", AbstractC3393o1.m17744s(AbstractC3393o1.m17743r(fo7.class, c3126ixM14165c.m14168b())));
        C3126ix c3126ixM14165c2 = C3126ix.m14165c();
        c3126ixM14165c2.f44720b = 3;
        f64685c = new c33("reason", AbstractC3393o1.m17744s(AbstractC3393o1.m17743r(fo7.class, c3126ixM14165c2.m14168b())));
    }

    @Override // p000.yr2
    /* JADX INFO: renamed from: a */
    public final void mo24a(Object obj, Object obj2) {
        fj5 fj5Var = (fj5) obj;
        gp6 gp6Var = (gp6) obj2;
        gp6Var.mo12793g(f64684b, fj5Var.m11890a());
        gp6Var.mo12789a(f64685c, fj5Var.m11891b());
    }
}
