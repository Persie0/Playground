package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class odk extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final odk f45626b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f45627c;

    /* JADX INFO: renamed from: a */
    public nxv f45628a = nxj.f44968b;

    static {
        odk odkVar = new odk();
        f45626b = odkVar;
        nxq.m18130aa(odk.class, odkVar);
    }

    private odk() {
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
                return m18129X(f45626b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u0013", new Object[]{"a"});
            case 3:
                return new odk();
            case 4:
                return new nxl(f45626b);
            case 5:
                return f45626b;
            case 6:
                nzd nxmVar = f45627c;
                if (nxmVar == null) {
                    synchronized (odk.class) {
                        nxmVar = f45627c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45626b);
                            f45627c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
