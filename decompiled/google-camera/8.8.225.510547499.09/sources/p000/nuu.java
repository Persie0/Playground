package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nuu extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final nuu f44695d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f44696e;

    /* JADX INFO: renamed from: a */
    public int f44697a;

    /* JADX INFO: renamed from: b */
    public String f44698b = "";

    /* JADX INFO: renamed from: c */
    public String f44699c = "";

    static {
        nuu nuuVar = new nuu();
        f44695d = nuuVar;
        nxq.m18130aa(nuu.class, nuuVar);
    }

    private nuu() {
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
                return m18129X(f44695d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new nuu();
            case 4:
                return new nxl(f44695d);
            case 5:
                return f44695d;
            case 6:
                nzd nxmVar = f44696e;
                if (nxmVar == null) {
                    synchronized (nuu.class) {
                        nxmVar = f44696e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44695d);
                            f44696e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
