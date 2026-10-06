package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class njp extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final njp f43055d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f43056e;

    /* JADX INFO: renamed from: a */
    public int f43057a;

    /* JADX INFO: renamed from: b */
    public long f43058b;

    /* JADX INFO: renamed from: c */
    public int f43059c;

    static {
        njp njpVar = new njp();
        f43055d = njpVar;
        nxq.m18130aa(njp.class, njpVar);
    }

    private njp() {
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
                return m18129X(f43055d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", "c", niy.f42845s});
            case 3:
                return new njp();
            case 4:
                return new nxl(f43055d);
            case 5:
                return f43055d;
            case 6:
                nzd nxmVar = f43056e;
                if (nxmVar == null) {
                    synchronized (njp.class) {
                        nxmVar = f43056e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43055d);
                            f43056e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
