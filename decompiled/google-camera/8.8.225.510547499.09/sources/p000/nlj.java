package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nlj extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final nlj f43528d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f43529e;

    /* JADX INFO: renamed from: a */
    public int f43530a;

    /* JADX INFO: renamed from: b */
    public int f43531b;

    /* JADX INFO: renamed from: c */
    public int f43532c;

    static {
        nlj nljVar = new nlj();
        f43528d = nljVar;
        nxq.m18130aa(nlj.class, nljVar);
    }

    private nlj() {
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
                return m18129X(f43528d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new nlj();
            case 4:
                return new nxl(f43528d);
            case 5:
                return f43528d;
            case 6:
                nzd nxmVar = f43529e;
                if (nxmVar == null) {
                    synchronized (nlj.class) {
                        nxmVar = f43529e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43528d);
                            f43529e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
