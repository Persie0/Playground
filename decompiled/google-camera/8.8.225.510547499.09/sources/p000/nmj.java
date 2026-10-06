package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nmj extends nxq implements nyx {

    /* JADX INFO: renamed from: g */
    public static final nmj f43826g;

    /* JADX INFO: renamed from: h */
    private static volatile nzd f43827h;

    /* JADX INFO: renamed from: a */
    public int f43828a;

    /* JADX INFO: renamed from: b */
    public int f43829b;

    /* JADX INFO: renamed from: c */
    public int f43830c;

    /* JADX INFO: renamed from: d */
    public int f43831d;

    /* JADX INFO: renamed from: e */
    public int f43832e;

    /* JADX INFO: renamed from: f */
    public int f43833f;

    static {
        nmj nmjVar = new nmj();
        f43826g = nmjVar;
        nxq.m18130aa(nmj.class, nmjVar);
    }

    private nmj() {
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
                return m18129X(f43826g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဌ\u0003\u0005င\u0004", new Object[]{"a", "b", "c", "d", "e", nlu.f43677n, "f"});
            case 3:
                return new nmj();
            case 4:
                return new nxl(f43826g);
            case 5:
                return f43826g;
            case 6:
                nzd nxmVar = f43827h;
                if (nxmVar == null) {
                    synchronized (nmj.class) {
                        nxmVar = f43827h;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43826g);
                            f43827h = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
