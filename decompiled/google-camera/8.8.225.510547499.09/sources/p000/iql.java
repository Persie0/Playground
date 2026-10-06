package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iql extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final iql f31798b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f31799c;

    /* JADX INFO: renamed from: a */
    public long f31800a;

    static {
        iql iqlVar = new iql();
        f31798b = iqlVar;
        nxq.m18130aa(iql.class, iqlVar);
    }

    private iql() {
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
                return m18129X(f31798b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new Object[]{"a"});
            case 3:
                return new iql();
            case 4:
                return new nxl(f31798b);
            case 5:
                return f31798b;
            case 6:
                nzd nxmVar = f31799c;
                if (nxmVar == null) {
                    synchronized (iql.class) {
                        nxmVar = f31799c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f31798b);
                            f31799c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
