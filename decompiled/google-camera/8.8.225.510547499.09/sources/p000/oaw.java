package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oaw extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final oaw f45212d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f45213e;

    /* JADX INFO: renamed from: a */
    public int f45214a;

    /* JADX INFO: renamed from: b */
    public String f45215b = "";

    /* JADX INFO: renamed from: c */
    public oax f45216c;

    static {
        oaw oawVar = new oaw();
        f45212d = oawVar;
        nxq.m18130aa(oaw.class, oawVar);
    }

    private oaw() {
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
                return m18129X(f45212d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new oaw();
            case 4:
                return new nxl(f45212d);
            case 5:
                return f45212d;
            case 6:
                nzd nxmVar = f45213e;
                if (nxmVar == null) {
                    synchronized (oaw.class) {
                        nxmVar = f45213e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45212d);
                            f45213e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
