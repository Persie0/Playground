package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ozh extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final ozh f46947e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f46948f;

    /* JADX INFO: renamed from: a */
    public int f46949a;

    /* JADX INFO: renamed from: b */
    public int f46950b;

    /* JADX INFO: renamed from: c */
    public int f46951c;

    /* JADX INFO: renamed from: d */
    public ozd f46952d;

    static {
        ozh ozhVar = new ozh();
        f46947e = ozhVar;
        nxq.m18130aa(ozh.class, ozhVar);
    }

    private ozh() {
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
                return m18129X(f46947e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new ozh();
            case 4:
                return new nxl(f46947e);
            case 5:
                return f46947e;
            case 6:
                nzd nxmVar = f46948f;
                if (nxmVar == null) {
                    synchronized (ozh.class) {
                        nxmVar = f46948f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f46947e);
                            f46948f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
