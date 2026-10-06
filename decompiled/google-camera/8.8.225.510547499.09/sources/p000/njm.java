package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class njm extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final njm f43031f;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f43032g;

    /* JADX INFO: renamed from: a */
    public int f43033a;

    /* JADX INFO: renamed from: b */
    public boolean f43034b;

    /* JADX INFO: renamed from: c */
    public boolean f43035c;

    /* JADX INFO: renamed from: d */
    public int f43036d;

    /* JADX INFO: renamed from: e */
    public boolean f43037e;

    static {
        njm njmVar = new njm();
        f43031f = njmVar;
        nxq.m18130aa(njm.class, njmVar);
    }

    private njm() {
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
                return m18129X(f43031f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဇ\u0003", new Object[]{"a", "b", "c", "d", niy.f42840n, "e"});
            case 3:
                return new njm();
            case 4:
                return new nxl(f43031f);
            case 5:
                return f43031f;
            case 6:
                nzd nxmVar = f43032g;
                if (nxmVar == null) {
                    synchronized (njm.class) {
                        nxmVar = f43032g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43031f);
                            f43032g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
