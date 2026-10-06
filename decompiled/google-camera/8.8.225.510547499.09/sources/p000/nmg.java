package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nmg extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final nmg f43777e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f43778f;

    /* JADX INFO: renamed from: a */
    public int f43779a;

    /* JADX INFO: renamed from: b */
    public boolean f43780b;

    /* JADX INFO: renamed from: c */
    public boolean f43781c;

    /* JADX INFO: renamed from: d */
    public boolean f43782d;

    static {
        nmg nmgVar = new nmg();
        f43777e = nmgVar;
        nxq.m18130aa(nmg.class, nmgVar);
    }

    private nmg() {
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
                return m18129X(f43777e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new nmg();
            case 4:
                return new nxl(f43777e);
            case 5:
                return f43777e;
            case 6:
                nzd nxmVar = f43778f;
                if (nxmVar == null) {
                    synchronized (nmg.class) {
                        nxmVar = f43778f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43777e);
                            f43778f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
