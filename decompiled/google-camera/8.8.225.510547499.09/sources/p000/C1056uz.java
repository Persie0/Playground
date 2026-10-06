package p000;

/* JADX INFO: renamed from: uz */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1056uz implements InterfaceC1041uk {

    /* JADX INFO: renamed from: a */
    public final String f47790a;

    /* JADX INFO: renamed from: c */
    public boolean f47792c;

    /* JADX INFO: renamed from: d */
    public final our f47793d;

    /* JADX INFO: renamed from: e */
    public ory f47794e;

    /* JADX INFO: renamed from: f */
    public app f47795f;

    /* JADX INFO: renamed from: h */
    private final ovl f47797h;

    /* JADX INFO: renamed from: i */
    private C0748jo f47798i;

    /* JADX INFO: renamed from: g */
    private final int f47796g = C1042ul.f47751a.m18846b();

    /* JADX INFO: renamed from: b */
    public final Object f47791b = new Object();

    public C1056uz(String str) {
        this.f47790a = str;
        ovl ovlVarM19106c = ovr.m19106c(1, 3, 4);
        this.f47797h = ovlVarM19106c;
        this.f47793d = ova.m19084a(ovlVarM19106c);
        C1022ts c1022ts = C1022ts.f47695a;
        this.f47798i = c1022ts;
        if (!ovlVarM19106c.mo19085b(c1022ts)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // p000.InterfaceC1041uk
    /* JADX INFO: renamed from: a */
    public final void mo19457a(C0947qy c0947qy) {
        synchronized (this.f47791b) {
            if (this.f47792c) {
                return;
            }
            this.f47792c = true;
            StringBuilder sb = new StringBuilder();
            sb.append("Disconnecting ");
            sb.append(this);
            ory oryVar = this.f47794e;
            if (oryVar != null) {
                oryVar.mo18977r(null);
            }
            app appVar = this.f47795f;
            if (appVar != null) {
                appVar.m1809a();
            }
            if (!(m19458b() instanceof C1017tn)) {
                if (!(this.f47798i instanceof C1018to)) {
                    m19459c(new C1018to(null));
                }
                m19459c(new C1017tn(this.f47790a, 2, null, null, null, null, null, null, c0947qy));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final C0748jo m19458b() {
        C0748jo c0748jo;
        synchronized (this.f47791b) {
            c0748jo = this.f47798i;
        }
        return c0748jo;
    }

    /* JADX INFO: renamed from: c */
    public final void m19459c(C0748jo c0748jo) {
        this.f47798i = c0748jo;
        if (this.f47797h.mo19085b(c0748jo)) {
            return;
        }
        throw new IllegalStateException("Failed to emit " + c0748jo + " in " + this);
    }

    public final String toString() {
        return "VirtualCamera-" + this.f47796g;
    }
}
