package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nqr extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final nqr f44071d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f44072e;

    /* JADX INFO: renamed from: a */
    public int f44073a;

    /* JADX INFO: renamed from: b */
    public nqs f44074b;

    /* JADX INFO: renamed from: c */
    public nqu f44075c;

    static {
        nqr nqrVar = new nqr();
        f44071d = nqrVar;
        nxq.m18130aa(nqr.class, nqrVar);
    }

    private nqr() {
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
                return m18129X(f44071d, "\u0001\u0002\u0000\u0001\u0002\u0006\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0006ဉ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new nqr();
            case 4:
                return new nxl(f44071d);
            case 5:
                return f44071d;
            case 6:
                nzd nxmVar = f44072e;
                if (nxmVar == null) {
                    synchronized (nqr.class) {
                        nxmVar = f44072e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44071d);
                            f44072e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
