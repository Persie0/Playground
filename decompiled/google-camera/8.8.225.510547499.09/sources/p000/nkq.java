package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nkq extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final nkq f43262e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f43263f;

    /* JADX INFO: renamed from: a */
    public int f43264a;

    /* JADX INFO: renamed from: b */
    public int f43265b;

    /* JADX INFO: renamed from: c */
    public int f43266c;

    /* JADX INFO: renamed from: d */
    public int f43267d;

    static {
        nkq nkqVar = new nkq();
        f43262e = nkqVar;
        nxq.m18130aa(nkq.class, nkqVar);
    }

    private nkq() {
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
                return m18129X(f43262e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", njy.f43131u, "d"});
            case 3:
                return new nkq();
            case 4:
                return new nxl(f43262e);
            case 5:
                return f43262e;
            case 6:
                nzd nxmVar = f43263f;
                if (nxmVar == null) {
                    synchronized (nkq.class) {
                        nxmVar = f43263f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43262e);
                            f43263f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
