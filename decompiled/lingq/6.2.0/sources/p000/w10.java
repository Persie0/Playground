package p000;

/* JADX INFO: loaded from: classes.dex */
public final class w10 implements fp6 {

    /* JADX INFO: renamed from: a */
    public static final w10 f66198a = new w10();

    /* JADX INFO: renamed from: b */
    public static final c33 f66199b;

    /* JADX INFO: renamed from: c */
    public static final c33 f66200c;

    static {
        C3126ix c3126ixM14165c = C3126ix.m14165c();
        c3126ixM14165c.f44720b = 1;
        f66199b = new c33("logSource", AbstractC3393o1.m17744s(AbstractC3393o1.m17743r(fo7.class, c3126ixM14165c.m14168b())));
        C3126ix c3126ixM14165c2 = C3126ix.m14165c();
        c3126ixM14165c2.f44720b = 2;
        f66200c = new c33("logEventDropped", AbstractC3393o1.m17744s(AbstractC3393o1.m17743r(fo7.class, c3126ixM14165c2.m14168b())));
    }

    @Override // p000.yr2
    /* JADX INFO: renamed from: a */
    public final void mo24a(Object obj, Object obj2) {
        ij5 ij5Var = (ij5) obj;
        gp6 gp6Var = (gp6) obj2;
        gp6Var.mo12789a(f66199b, ij5Var.m13945b());
        gp6Var.mo12789a(f66200c, ij5Var.m13944a());
    }
}
