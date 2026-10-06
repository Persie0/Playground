package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oeg extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final oeg f45729d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f45730e;

    /* JADX INFO: renamed from: a */
    public int f45731a;

    /* JADX INFO: renamed from: b */
    public float f45732b;

    /* JADX INFO: renamed from: c */
    public boolean f45733c;

    static {
        oeg oegVar = new oeg();
        f45729d = oegVar;
        nxq.m18130aa(oeg.class, oegVar);
    }

    private oeg() {
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
                return m18129X(f45729d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0003ဇ\u0002", new Object[]{"a", "b", "c"});
            case 3:
                return new oeg();
            case 4:
                return new nxl(f45729d);
            case 5:
                return f45729d;
            case 6:
                nzd nxmVar = f45730e;
                if (nxmVar == null) {
                    synchronized (oeg.class) {
                        nxmVar = f45730e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45729d);
                            f45730e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
