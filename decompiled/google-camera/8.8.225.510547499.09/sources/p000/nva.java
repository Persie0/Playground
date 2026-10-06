package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nva extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final nva f44726c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f44727d;

    /* JADX INFO: renamed from: a */
    public int f44728a;

    /* JADX INFO: renamed from: b */
    public nuy f44729b;

    static {
        nva nvaVar = new nva();
        f44726c = nvaVar;
        nxq.m18130aa(nva.class, nvaVar);
    }

    private nva() {
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
                return m18129X(f44726c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new nva();
            case 4:
                return new nxl(f44726c);
            case 5:
                return f44726c;
            case 6:
                nzd nxmVar = f44727d;
                if (nxmVar == null) {
                    synchronized (nva.class) {
                        nxmVar = f44727d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44726c);
                            f44727d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
