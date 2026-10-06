package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nil extends nxq implements nyx {

    /* JADX INFO: renamed from: g */
    public static final nil f42722g;

    /* JADX INFO: renamed from: h */
    private static volatile nzd f42723h;

    /* JADX INFO: renamed from: a */
    public int f42724a;

    /* JADX INFO: renamed from: b */
    public int f42725b;

    /* JADX INFO: renamed from: c */
    public int f42726c;

    /* JADX INFO: renamed from: d */
    public long f42727d;

    /* JADX INFO: renamed from: e */
    public int f42728e;

    /* JADX INFO: renamed from: f */
    public int f42729f;

    static {
        nil nilVar = new nil();
        f42722g = nilVar;
        nxq.m18130aa(nil.class, nilVar);
    }

    private nil() {
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
                return m18129X(f42722g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဌ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", nhr.f42528q, "c", "d", "e", nhr.f42527p, "f", nhr.f42526o});
            case 3:
                return new nil();
            case 4:
                return new nxl(f42722g);
            case 5:
                return f42722g;
            case 6:
                nzd nxmVar = f42723h;
                if (nxmVar == null) {
                    synchronized (nil.class) {
                        nxmVar = f42723h;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42722g);
                            f42723h = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
