package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class njg extends nxq implements nyx {

    /* JADX INFO: renamed from: j */
    public static final njg f42906j;

    /* JADX INFO: renamed from: k */
    private static volatile nzd f42907k;

    /* JADX INFO: renamed from: a */
    public int f42908a;

    /* JADX INFO: renamed from: b */
    public int f42909b;

    /* JADX INFO: renamed from: c */
    public long f42910c;

    /* JADX INFO: renamed from: d */
    public long f42911d;

    /* JADX INFO: renamed from: f */
    public nht f42913f;

    /* JADX INFO: renamed from: g */
    public long f42914g;

    /* JADX INFO: renamed from: h */
    public int f42915h;

    /* JADX INFO: renamed from: e */
    public nxx f42912e = nyn.f45025b;

    /* JADX INFO: renamed from: i */
    public nxw f42916i = nxr.f44982b;

    static {
        njg njgVar = new njg();
        f42906j = njgVar;
        nxq.m18130aa(njg.class, njgVar);
    }

    private njg() {
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
                return m18129X(f42906j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004\u0014\u0005ဉ\u0003\u0006ဂ\u0004\u0007ဌ\u0005\b\u001e", new Object[]{"a", "b", niy.f42836j, "c", "d", "e", "f", "g", "h", niy.f42834h, "i", niy.f42835i});
            case 3:
                return new njg();
            case 4:
                return new nxl(f42906j);
            case 5:
                return f42906j;
            case 6:
                nzd nxmVar = f42907k;
                if (nxmVar == null) {
                    synchronized (njg.class) {
                        nxmVar = f42907k;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42906j);
                            f42907k = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
