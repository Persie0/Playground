package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cnu extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final cnu f6387d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f6388e;

    /* JADX INFO: renamed from: a */
    public int f6389a;

    /* JADX INFO: renamed from: b */
    public long f6390b;

    /* JADX INFO: renamed from: c */
    public int f6391c;

    static {
        cnu cnuVar = new cnu();
        f6387d = cnuVar;
        nxq.m18130aa(cnu.class, cnuVar);
    }

    private cnu() {
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
                return m18129X(f6387d, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u0002\u0003င\u0000", new Object[]{"a", "b", "c"});
            case 3:
                return new cnu();
            case 4:
                return new nxl(f6387d);
            case 5:
                return f6387d;
            case 6:
                nzd nxmVar = f6388e;
                if (nxmVar == null) {
                    synchronized (cnu.class) {
                        nxmVar = f6388e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f6387d);
                            f6388e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
