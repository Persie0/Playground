package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nto extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final nto f44509c;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f44510e;

    /* JADX INFO: renamed from: a */
    public int f44511a = -1;

    /* JADX INFO: renamed from: b */
    public int f44512b = -1;

    /* JADX INFO: renamed from: d */
    private int f44513d;

    static {
        nto ntoVar = new nto();
        f44509c = ntoVar;
        nxq.m18130aa(nto.class, ntoVar);
    }

    private nto() {
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
                return m18129X(f44509c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new nto();
            case 4:
                return new nxl(f44509c);
            case 5:
                return f44509c;
            case 6:
                nzd nxmVar = f44510e;
                if (nxmVar == null) {
                    synchronized (nto.class) {
                        nxmVar = f44510e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44509c);
                            f44510e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
