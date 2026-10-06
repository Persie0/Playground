package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pac extends nxq implements nyx {

    /* JADX INFO: renamed from: g */
    public static final pac f47157g;

    /* JADX INFO: renamed from: h */
    private static volatile nzd f47158h;

    /* JADX INFO: renamed from: a */
    public int f47159a;

    /* JADX INFO: renamed from: d */
    public int f47162d;

    /* JADX INFO: renamed from: e */
    public long f47163e;

    /* JADX INFO: renamed from: b */
    public String f47160b = "";

    /* JADX INFO: renamed from: c */
    public String f47161c = "";

    /* JADX INFO: renamed from: f */
    public String f47164f = "";

    static {
        pac pacVar = new pac();
        f47157g = pacVar;
        nxq.m18130aa(pac.class, pacVar);
    }

    private pac() {
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
                return m18129X(f47157g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", pab.f47148a, "e", "f"});
            case 3:
                return new pac();
            case 4:
                return new nxl(f47157g);
            case 5:
                return f47157g;
            case 6:
                nzd nxmVar = f47158h;
                if (nxmVar == null) {
                    synchronized (pac.class) {
                        nxmVar = f47158h;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47157g);
                            f47158h = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
