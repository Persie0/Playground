package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nty extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final nty f44594c;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f44595e;

    /* JADX INFO: renamed from: a */
    public double f44596a;

    /* JADX INFO: renamed from: b */
    public int f44597b;

    /* JADX INFO: renamed from: d */
    private int f44598d;

    static {
        nty ntyVar = new nty();
        f44594c = ntyVar;
        nxq.m18130aa(nty.class, ntyVar);
    }

    private nty() {
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
                return m18129X(f44594c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new nty();
            case 4:
                return new nxl(f44594c);
            case 5:
                return f44594c;
            case 6:
                nzd nxmVar = f44595e;
                if (nxmVar == null) {
                    synchronized (nty.class) {
                        nxmVar = f44595e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44594c);
                            f44595e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
