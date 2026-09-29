package p000;

/* JADX INFO: loaded from: classes.dex */
public final class qz6 implements uo7 {

    /* JADX INFO: renamed from: c */
    public static final ij6 f58421c = new ij6(2);

    /* JADX INFO: renamed from: d */
    public static final cd1 f58422d = new cd1(8);

    /* JADX INFO: renamed from: a */
    public w92 f58423a;

    /* JADX INFO: renamed from: b */
    public volatile uo7 f58424b;

    public qz6(ij6 ij6Var, uo7 uo7Var) {
        this.f58423a = ij6Var;
        this.f58424b = uo7Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m20220a(w92 w92Var) {
        uo7 uo7Var;
        uo7 uo7Var2;
        uo7 uo7Var3 = this.f58424b;
        cd1 cd1Var = f58422d;
        if (uo7Var3 != cd1Var) {
            w92Var.mo13969h(uo7Var3);
            return;
        }
        synchronized (this) {
            uo7Var = this.f58424b;
            if (uo7Var != cd1Var) {
                uo7Var2 = uo7Var;
            } else {
                this.f58423a = new r41(6, this.f58423a, w92Var);
                uo7Var2 = null;
            }
        }
        if (uo7Var2 != null) {
            w92Var.mo13969h(uo7Var);
        }
    }

    @Override // p000.uo7
    public final Object get() {
        return this.f58424b.get();
    }
}
