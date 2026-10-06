package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class njr extends nxq implements nyx {

    /* JADX INFO: renamed from: g */
    public static final njr f43065g;

    /* JADX INFO: renamed from: h */
    private static volatile nzd f43066h;

    /* JADX INFO: renamed from: a */
    public int f43067a;

    /* JADX INFO: renamed from: b */
    public int f43068b;

    /* JADX INFO: renamed from: c */
    public int f43069c;

    /* JADX INFO: renamed from: d */
    public int f43070d;

    /* JADX INFO: renamed from: e */
    public int f43071e;

    /* JADX INFO: renamed from: f */
    public int f43072f;

    static {
        njr njrVar = new njr();
        f43065g = njrVar;
        nxq.m18130aa(njr.class, njrVar);
    }

    private njr() {
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
                return m18129X(f43065g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new njr();
            case 4:
                return new nxl(f43065g);
            case 5:
                return f43065g;
            case 6:
                nzd nxmVar = f43066h;
                if (nxmVar == null) {
                    synchronized (njr.class) {
                        nxmVar = f43066h;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43065g);
                            f43066h = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
