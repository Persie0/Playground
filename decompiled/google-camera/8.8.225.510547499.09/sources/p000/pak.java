package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pak extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final pak f47208e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f47209f;

    /* JADX INFO: renamed from: a */
    public int f47210a;

    /* JADX INFO: renamed from: b */
    public int f47211b;

    /* JADX INFO: renamed from: c */
    public int f47212c;

    /* JADX INFO: renamed from: d */
    public int f47213d;

    static {
        pak pakVar = new pak();
        f47208e = pakVar;
        nxq.m18130aa(pak.class, pakVar);
    }

    private pak() {
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
                return m18129X(f47208e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new pak();
            case 4:
                return new nxl(f47208e);
            case 5:
                return f47208e;
            case 6:
                nzd nxmVar = f47209f;
                if (nxmVar == null) {
                    synchronized (pak.class) {
                        nxmVar = f47209f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47208e);
                            f47209f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
