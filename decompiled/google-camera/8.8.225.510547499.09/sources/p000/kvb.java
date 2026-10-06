package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kvb extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final kvb f37309f;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f37310g;

    /* JADX INFO: renamed from: a */
    public int f37311a;

    /* JADX INFO: renamed from: b */
    public String f37312b = "";

    /* JADX INFO: renamed from: c */
    public String f37313c = "";

    /* JADX INFO: renamed from: d */
    public int f37314d = -1;

    /* JADX INFO: renamed from: e */
    public int f37315e = -1;

    static {
        kvb kvbVar = new kvb();
        f37309f = kvbVar;
        nxq.m18130aa(kvb.class, kvbVar);
    }

    private kvb() {
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
                nxu nxuVar = kva.f37287a;
                return m18129X(f37309f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", nxuVar, "e", nxuVar});
            case 3:
                return new kvb();
            case 4:
                return new nxl(f37309f);
            case 5:
                return f37309f;
            case 6:
                nzd nxmVar = f37310g;
                if (nxmVar == null) {
                    synchronized (kvb.class) {
                        nxmVar = f37310g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f37309f);
                            f37310g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
