package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ocm extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final ocm f45480b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f45481c;

    /* JADX INFO: renamed from: a */
    public nxy f45482a = nzg.f45063b;

    static {
        ocm ocmVar = new ocm();
        f45480b = ocmVar;
        nxq.m18130aa(ocm.class, ocmVar);
    }

    private ocm() {
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
                return m18129X(f45480b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", ocp.class});
            case 3:
                return new ocm();
            case 4:
                return new nxl(f45480b);
            case 5:
                return f45480b;
            case 6:
                nzd nxmVar = f45481c;
                if (nxmVar == null) {
                    synchronized (ocm.class) {
                        nxmVar = f45481c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45480b);
                            f45481c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
