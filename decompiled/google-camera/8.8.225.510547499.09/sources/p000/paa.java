package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class paa extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final paa f47144c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f47145d;

    /* JADX INFO: renamed from: a */
    public int f47146a;

    /* JADX INFO: renamed from: b */
    public String f47147b = "";

    static {
        paa paaVar = new paa();
        f47144c = paaVar;
        nxq.m18130aa(paa.class, paaVar);
    }

    private paa() {
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
                return m18129X(f47144c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new paa();
            case 4:
                return new nxl(f47144c);
            case 5:
                return f47144c;
            case 6:
                nzd nxmVar = f47145d;
                if (nxmVar == null) {
                    synchronized (paa.class) {
                        nxmVar = f47145d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47144c);
                            f47145d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
