package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nhx extends nxq implements nyx {

    /* JADX INFO: renamed from: g */
    public static final nhx f42565g;

    /* JADX INFO: renamed from: h */
    private static volatile nzd f42566h;

    /* JADX INFO: renamed from: a */
    public int f42567a;

    /* JADX INFO: renamed from: b */
    public int f42568b;

    /* JADX INFO: renamed from: c */
    public nlb f42569c;

    /* JADX INFO: renamed from: d */
    public nle f42570d;

    /* JADX INFO: renamed from: e */
    public long f42571e;

    /* JADX INFO: renamed from: f */
    public nlr f42572f;

    static {
        nhx nhxVar = new nhx();
        f42565g = nhxVar;
        nxq.m18130aa(nhx.class, nhxVar);
    }

    private nhx() {
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
                return m18129X(f42565g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0003ဉ\u0002\u0005ဉ\u0004\u0006ဂ\u0005\u0007ဉ\u0006", new Object[]{"a", "b", nks.f43293a, "c", "d", "e", "f"});
            case 3:
                return new nhx();
            case 4:
                return new nxl(f42565g);
            case 5:
                return f42565g;
            case 6:
                nzd nxmVar = f42566h;
                if (nxmVar == null) {
                    synchronized (nhx.class) {
                        nxmVar = f42566h;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42565g);
                            f42566h = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
