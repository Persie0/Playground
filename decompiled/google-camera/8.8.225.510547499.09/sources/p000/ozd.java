package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ozd extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final ozd f46924d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f46925e;

    /* JADX INFO: renamed from: a */
    public int f46926a;

    /* JADX INFO: renamed from: b */
    public long f46927b;

    /* JADX INFO: renamed from: c */
    public String f46928c = "";

    static {
        ozd ozdVar = new ozd();
        f46924d = ozdVar;
        nxq.m18130aa(ozd.class, ozdVar);
    }

    private ozd() {
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
                return m18129X(f46924d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001စ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new ozd();
            case 4:
                return new nxl(f46924d);
            case 5:
                return f46924d;
            case 6:
                nzd nxmVar = f46925e;
                if (nxmVar == null) {
                    synchronized (ozd.class) {
                        nxmVar = f46925e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f46924d);
                            f46925e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
