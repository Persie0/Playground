package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class njs extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final njs f43073d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f43074e;

    /* JADX INFO: renamed from: a */
    public int f43075a;

    /* JADX INFO: renamed from: b */
    public int f43076b;

    /* JADX INFO: renamed from: c */
    public int f43077c;

    static {
        njs njsVar = new njs();
        f43073d = njsVar;
        nxq.m18130aa(njs.class, njsVar);
    }

    private njs() {
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
                return m18129X(f43073d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new njs();
            case 4:
                return new nxl(f43073d);
            case 5:
                return f43073d;
            case 6:
                nzd nxmVar = f43074e;
                if (nxmVar == null) {
                    synchronized (njs.class) {
                        nxmVar = f43074e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43073d);
                            f43074e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
