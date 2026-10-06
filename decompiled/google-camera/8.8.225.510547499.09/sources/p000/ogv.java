package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ogv extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final ogv f45969d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f45970e;

    /* JADX INFO: renamed from: a */
    public int f45971a;

    /* JADX INFO: renamed from: b */
    public ogu f45972b;

    /* JADX INFO: renamed from: c */
    public ogt f45973c;

    static {
        ogv ogvVar = new ogv();
        f45969d = ogvVar;
        nxq.m18130aa(ogv.class, ogvVar);
    }

    private ogv() {
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
                return m18129X(f45969d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new ogv();
            case 4:
                return new nxl(f45969d);
            case 5:
                return f45969d;
            case 6:
                nzd nxmVar = f45970e;
                if (nxmVar == null) {
                    synchronized (ogv.class) {
                        nxmVar = f45970e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45969d);
                            f45970e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
