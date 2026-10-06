package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nsu extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final nsu f44448c;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f44449e;

    /* JADX INFO: renamed from: a */
    public nst f44450a;

    /* JADX INFO: renamed from: b */
    public nst f44451b;

    /* JADX INFO: renamed from: d */
    private int f44452d;

    static {
        nsu nsuVar = new nsu();
        f44448c = nsuVar;
        nxq.m18130aa(nsu.class, nsuVar);
    }

    private nsu() {
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
                return m18129X(f44448c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new nsu();
            case 4:
                return new nxl(f44448c);
            case 5:
                return f44448c;
            case 6:
                nzd nxmVar = f44449e;
                if (nxmVar == null) {
                    synchronized (nsu.class) {
                        nxmVar = f44449e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44448c);
                            f44449e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
