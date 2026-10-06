package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ogu extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final ogu f45963e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f45964f;

    /* JADX INFO: renamed from: a */
    public int f45965a;

    /* JADX INFO: renamed from: b */
    public int f45966b;

    /* JADX INFO: renamed from: c */
    public int f45967c;

    /* JADX INFO: renamed from: d */
    public int f45968d;

    static {
        ogu oguVar = new ogu();
        f45963e = oguVar;
        nxq.m18130aa(ogu.class, oguVar);
    }

    private ogu() {
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
                return m18129X(f45963e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new ogu();
            case 4:
                return new nxl(f45963e);
            case 5:
                return f45963e;
            case 6:
                nzd nxmVar = f45964f;
                if (nxmVar == null) {
                    synchronized (ogu.class) {
                        nxmVar = f45964f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45963e);
                            f45964f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
