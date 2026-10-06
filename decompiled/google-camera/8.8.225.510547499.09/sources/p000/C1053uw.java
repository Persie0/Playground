package p000;

/* JADX INFO: renamed from: uw */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1053uw implements ous {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f47781a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f47782b;

    public C1053uw(aea aeaVar, int i) {
        this.f47782b = i;
        this.f47781a = aeaVar;
    }

    public C1053uw(ooi ooiVar, int i) {
        this.f47782b = i;
        this.f47781a = ooiVar;
    }

    public C1053uw(C1056uz c1056uz, int i) {
        this.f47782b = i;
        this.f47781a = c1056uz;
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [aea, java.lang.Object] */
    @Override // p000.ous
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo16103a(Object obj, ols olsVar) throws Exception {
        switch (this.f47782b) {
            case 0:
                C0748jo c0748jo = (C0748jo) obj;
                Object obj2 = this.f47781a;
                synchronized (((C1056uz) obj2).f47791b) {
                    if (!((C1056uz) obj2).f47792c) {
                        ((C1056uz) obj2).m19459c(c0748jo);
                    }
                    break;
                }
                return oki.f46196a;
            case 1:
                C0748jo c0748jo2 = (C0748jo) obj;
                if (c0748jo2 instanceof C1019tp) {
                    C1028ty c1028ty = (C1028ty) ((ooi) this.f47781a).f46351a;
                    InterfaceC1016tm interfaceC1016tm = ((C1019tp) c0748jo2).f47686a;
                    synchronized (c1028ty.f47702b) {
                        int i = c1028ty.f47704d;
                        if (i != 4 && i != 5) {
                            c1028ty.f47703c = interfaceC1016tm;
                            ooc.m18746l(c1028ty.f47701a, null, new C1025tv(c1028ty, null), 3);
                        }
                    }
                } else if ((c0748jo2 instanceof C1018to) || (c0748jo2 instanceof C1017tn)) {
                    ((C1028ty) ((ooi) this.f47781a).f46351a).m19453d();
                }
                return oki.f46196a;
            default:
                this.f47781a.mo309a((avx) obj);
                return oki.f46196a;
        }
    }
}
