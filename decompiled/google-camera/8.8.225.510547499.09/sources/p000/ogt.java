package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ogt extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final ogt f45958d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f45959e;

    /* JADX INFO: renamed from: a */
    public int f45960a;

    /* JADX INFO: renamed from: b */
    public int f45961b;

    /* JADX INFO: renamed from: c */
    public int f45962c;

    static {
        ogt ogtVar = new ogt();
        f45958d = ogtVar;
        nxq.m18130aa(ogt.class, ogtVar);
    }

    private ogt() {
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
                return m18129X(f45958d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new ogt();
            case 4:
                return new nxl(f45958d);
            case 5:
                return f45958d;
            case 6:
                nzd nxmVar = f45959e;
                if (nxmVar == null) {
                    synchronized (ogt.class) {
                        nxmVar = f45959e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45958d);
                            f45959e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
