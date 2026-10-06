package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nke extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final nke f43182f;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f43183g;

    /* JADX INFO: renamed from: a */
    public int f43184a;

    /* JADX INFO: renamed from: b */
    public nkf f43185b;

    /* JADX INFO: renamed from: c */
    public nkc f43186c;

    /* JADX INFO: renamed from: d */
    public nkg f43187d;

    /* JADX INFO: renamed from: e */
    public String f43188e = "";

    static {
        nke nkeVar = new nke();
        f43182f = nkeVar;
        nxq.m18130aa(nke.class, nkeVar);
    }

    private nke() {
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
                return m18129X(f43182f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new nke();
            case 4:
                return new nxl(f43182f);
            case 5:
                return f43182f;
            case 6:
                nzd nxmVar = f43183g;
                if (nxmVar == null) {
                    synchronized (nke.class) {
                        nxmVar = f43183g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43182f);
                            f43183g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
