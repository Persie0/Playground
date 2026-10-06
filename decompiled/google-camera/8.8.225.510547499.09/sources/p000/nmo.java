package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nmo extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final nmo f43862d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f43863e;

    /* JADX INFO: renamed from: a */
    public int f43864a;

    /* JADX INFO: renamed from: b */
    public int f43865b;

    /* JADX INFO: renamed from: c */
    public int f43866c;

    static {
        nmo nmoVar = new nmo();
        f43862d = nmoVar;
        nxq.m18130aa(nmo.class, nmoVar);
    }

    private nmo() {
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
                return m18129X(f43862d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new nmo();
            case 4:
                return new nxl(f43862d);
            case 5:
                return f43862d;
            case 6:
                nzd nxmVar = f43863e;
                if (nxmVar == null) {
                    synchronized (nmo.class) {
                        nxmVar = f43863e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43862d);
                            f43863e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
