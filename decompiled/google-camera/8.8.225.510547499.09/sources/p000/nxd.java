package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nxd extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final nxd f44898c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f44899d;

    /* JADX INFO: renamed from: a */
    public long f44900a;

    /* JADX INFO: renamed from: b */
    public int f44901b;

    static {
        nxd nxdVar = new nxd();
        f44898c = nxdVar;
        nxq.m18130aa(nxd.class, nxdVar);
    }

    private nxd() {
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
                return m18129X(f44898c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"a", "b"});
            case 3:
                return new nxd();
            case 4:
                return new nxl(f44898c);
            case 5:
                return f44898c;
            case 6:
                nzd nxmVar = f44899d;
                if (nxmVar == null) {
                    synchronized (nxd.class) {
                        nxmVar = f44899d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44898c);
                            f44899d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
