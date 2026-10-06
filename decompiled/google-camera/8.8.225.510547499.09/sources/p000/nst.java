package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nst extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final nst f44441e;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f44442g;

    /* JADX INFO: renamed from: a */
    public int f44443a;

    /* JADX INFO: renamed from: b */
    public int f44444b;

    /* JADX INFO: renamed from: c */
    public int f44445c;

    /* JADX INFO: renamed from: d */
    public int f44446d;

    /* JADX INFO: renamed from: f */
    private int f44447f;

    static {
        nst nstVar = new nst();
        f44441e = nstVar;
        nxq.m18130aa(nst.class, nstVar);
    }

    private nst() {
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
                return m18129X(f44441e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"f", "a", "b", "c", "d"});
            case 3:
                return new nst();
            case 4:
                return new nxl(f44441e);
            case 5:
                return f44441e;
            case 6:
                nzd nxmVar = f44442g;
                if (nxmVar == null) {
                    synchronized (nst.class) {
                        nxmVar = f44442g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44441e);
                            f44442g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
