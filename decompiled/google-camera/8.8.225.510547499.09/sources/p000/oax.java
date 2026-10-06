package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oax extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final oax f45217c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f45218d;

    /* JADX INFO: renamed from: a */
    public int f45219a;

    /* JADX INFO: renamed from: b */
    public String f45220b = "";

    static {
        oax oaxVar = new oax();
        f45217c = oaxVar;
        nxq.m18130aa(oax.class, oaxVar);
    }

    private oax() {
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
                return m18129X(f45217c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"a", "b"});
            case 3:
                return new oax();
            case 4:
                return new nxl(f45217c);
            case 5:
                return f45217c;
            case 6:
                nzd nxmVar = f45218d;
                if (nxmVar == null) {
                    synchronized (oax.class) {
                        nxmVar = f45218d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45217c);
                            f45218d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
