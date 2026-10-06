package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lpz extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final lpz f38941e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f38942f;

    /* JADX INFO: renamed from: a */
    public int f38943a;

    /* JADX INFO: renamed from: c */
    public Object f38945c;

    /* JADX INFO: renamed from: b */
    public int f38944b = 0;

    /* JADX INFO: renamed from: d */
    public String f38946d = "";

    static {
        lpz lpzVar = new lpz();
        f38941e = lpzVar;
        nxq.m18130aa(lpz.class, lpzVar);
    }

    private lpz() {
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
                return m18129X(f38941e, "\u0001\u0006\u0001\u0001\u0001\n\u0006\u0000\u0000\u0000\u0001း\u0000\u0002်\u0000\u0003ဳ\u0000\u0004ျ\u0000\u0005ွ\u0000\nဈ\u0000", new Object[]{"c", "b", "a", "d"});
            case 3:
                return new lpz();
            case 4:
                return new nxl(f38941e);
            case 5:
                return f38941e;
            case 6:
                nzd nxmVar = f38942f;
                if (nxmVar == null) {
                    synchronized (lpz.class) {
                        nxmVar = f38942f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f38941e);
                            f38942f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
