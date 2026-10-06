package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nmn extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final nmn f43857d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f43858e;

    /* JADX INFO: renamed from: a */
    public int f43859a;

    /* JADX INFO: renamed from: b */
    public int f43860b;

    /* JADX INFO: renamed from: c */
    public long f43861c;

    static {
        nmn nmnVar = new nmn();
        f43857d = nmnVar;
        nxq.m18130aa(nmn.class, nmnVar);
    }

    private nmn() {
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
                return m18129X(f43857d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", nlu.f43680q, "c"});
            case 3:
                return new nmn();
            case 4:
                return new nxl(f43857d);
            case 5:
                return f43857d;
            case 6:
                nzd nxmVar = f43858e;
                if (nxmVar == null) {
                    synchronized (nmn.class) {
                        nxmVar = f43858e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43857d);
                            f43858e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
