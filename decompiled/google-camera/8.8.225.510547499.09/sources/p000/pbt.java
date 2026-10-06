package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pbt extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final pbt f47353b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f47354c;

    /* JADX INFO: renamed from: a */
    public nxv f47355a = nxj.f44968b;

    static {
        pbt pbtVar = new pbt();
        f47353b = pbtVar;
        nxq.m18130aa(pbt.class, pbtVar);
    }

    private pbt() {
    }

    /* JADX INFO: renamed from: c */
    public final void m19310c() {
        nxv nxvVar = this.f47355a;
        if (nxvVar.mo17770c()) {
            return;
        }
        this.f47355a = nxq.m18124R(nxvVar);
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 1:
            default:
                return null;
            case 2:
                return m18129X(f47353b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001$", new Object[]{"a"});
            case 3:
                return new pbt();
            case 4:
                return new nxl(f47353b);
            case 5:
                return f47353b;
            case 6:
                nzd nxmVar = f47354c;
                if (nxmVar == null) {
                    synchronized (pbt.class) {
                        nxmVar = f47354c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47353b);
                            f47354c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
