package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nkp extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final nkp f43258c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f43259d;

    /* JADX INFO: renamed from: a */
    public int f43260a;

    /* JADX INFO: renamed from: b */
    public int f43261b;

    static {
        nkp nkpVar = new nkp();
        f43258c = nkpVar;
        nxq.m18130aa(nkp.class, nkpVar);
    }

    private nkp() {
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
                return m18129X(f43258c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new nkp();
            case 4:
                return new nxl(f43258c);
            case 5:
                return f43258c;
            case 6:
                nzd nxmVar = f43259d;
                if (nxmVar == null) {
                    synchronized (nkp.class) {
                        nxmVar = f43259d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43258c);
                            f43259d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
