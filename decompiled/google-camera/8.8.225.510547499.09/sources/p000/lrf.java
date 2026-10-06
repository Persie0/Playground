package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lrf extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final lrf f39070e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f39071f;

    /* JADX INFO: renamed from: a */
    public int f39072a;

    /* JADX INFO: renamed from: c */
    public Object f39074c;

    /* JADX INFO: renamed from: b */
    public int f39073b = 0;

    /* JADX INFO: renamed from: d */
    public String f39075d = "";

    static {
        lrf lrfVar = new lrf();
        f39070e = lrfVar;
        nxq.m18130aa(lrf.class, lrfVar);
    }

    private lrf() {
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
                return m18129X(f39070e, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဵ\u0000\u0003်\u0000\u0004ဳ\u0000\u0005ျ\u0000\u0006ွ\u0000", new Object[]{"c", "b", "a", "d"});
            case 3:
                return new lrf();
            case 4:
                return new nxl(f39070e);
            case 5:
                return f39070e;
            case 6:
                nzd nxmVar = f39071f;
                if (nxmVar == null) {
                    synchronized (lrf.class) {
                        nxmVar = f39071f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f39070e);
                            f39071f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
