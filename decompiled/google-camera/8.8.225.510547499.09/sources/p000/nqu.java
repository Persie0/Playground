package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nqu extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final nqu f44087c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f44088d;

    /* JADX INFO: renamed from: a */
    public int f44089a;

    /* JADX INFO: renamed from: b */
    public int f44090b;

    static {
        nqu nquVar = new nqu();
        f44087c = nquVar;
        nxq.m18130aa(nqu.class, nquVar);
    }

    private nqu() {
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
                return m18129X(f44087c, "\u0001\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဌ\u0000", new Object[]{"a", "b", nlu.f43683t});
            case 3:
                return new nqu();
            case 4:
                return new nxl(f44087c);
            case 5:
                return f44087c;
            case 6:
                nzd nxmVar = f44088d;
                if (nxmVar == null) {
                    synchronized (nqu.class) {
                        nxmVar = f44088d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44087c);
                            f44088d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
