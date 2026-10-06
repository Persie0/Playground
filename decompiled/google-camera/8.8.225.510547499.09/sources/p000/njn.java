package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class njn extends nxq implements nyx {

    /* JADX INFO: renamed from: h */
    public static final njn f43038h;

    /* JADX INFO: renamed from: i */
    private static volatile nzd f43039i;

    /* JADX INFO: renamed from: a */
    public int f43040a;

    /* JADX INFO: renamed from: b */
    public int f43041b;

    /* JADX INFO: renamed from: c */
    public float f43042c;

    /* JADX INFO: renamed from: d */
    public boolean f43043d;

    /* JADX INFO: renamed from: e */
    public int f43044e;

    /* JADX INFO: renamed from: f */
    public long f43045f;

    /* JADX INFO: renamed from: g */
    public long f43046g;

    static {
        njn njnVar = new njn();
        f43038h = njnVar;
        nxq.m18130aa(njn.class, njnVar);
    }

    private njn() {
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
                return m18129X(f43038h, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0006ခ\u0005\u0007ဇ\u0006\bဌ\u0007\tဂ\b\nဂ\t", new Object[]{"a", "b", niy.f42841o, "c", "d", "e", niy.f42842p, "f", "g"});
            case 3:
                return new njn();
            case 4:
                return new nxl(f43038h);
            case 5:
                return f43038h;
            case 6:
                nzd nxmVar = f43039i;
                if (nxmVar == null) {
                    synchronized (njn.class) {
                        nxmVar = f43039i;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43038h);
                            f43039i = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
