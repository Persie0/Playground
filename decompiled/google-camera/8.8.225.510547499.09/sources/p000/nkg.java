package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nkg extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final nkg f43196c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f43197d;

    /* JADX INFO: renamed from: a */
    public int f43198a;

    /* JADX INFO: renamed from: b */
    public boolean f43199b;

    static {
        nkg nkgVar = new nkg();
        f43196c = nkgVar;
        nxq.m18130aa(nkg.class, nkgVar);
    }

    private nkg() {
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
                return m18129X(f43196c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new nkg();
            case 4:
                return new nxl(f43196c);
            case 5:
                return f43196c;
            case 6:
                nzd nxmVar = f43197d;
                if (nxmVar == null) {
                    synchronized (nkg.class) {
                        nxmVar = f43197d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43196c);
                            f43197d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
