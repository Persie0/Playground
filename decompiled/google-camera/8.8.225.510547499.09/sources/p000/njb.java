package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class njb extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final njb f42865d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f42866e;

    /* JADX INFO: renamed from: a */
    public int f42867a;

    /* JADX INFO: renamed from: b */
    public int f42868b;

    /* JADX INFO: renamed from: c */
    public nmd f42869c;

    static {
        njb njbVar = new njb();
        f42865d = njbVar;
        nxq.m18130aa(njb.class, njbVar);
    }

    private njb() {
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
                return m18129X(f42865d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", niy.f42830d, "c"});
            case 3:
                return new njb();
            case 4:
                return new nxl(f42865d);
            case 5:
                return f42865d;
            case 6:
                nzd nxmVar = f42866e;
                if (nxmVar == null) {
                    synchronized (njb.class) {
                        nxmVar = f42866e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42865d);
                            f42866e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
