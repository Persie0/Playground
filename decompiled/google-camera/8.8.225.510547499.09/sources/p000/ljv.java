package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ljv extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final ljv f38439c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f38440d;

    /* JADX INFO: renamed from: a */
    public int f38441a;

    /* JADX INFO: renamed from: b */
    public int f38442b;

    static {
        ljv ljvVar = new ljv();
        f38439c = ljvVar;
        nxq.m18130aa(ljv.class, ljvVar);
    }

    private ljv() {
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
                return m18129X(f38439c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new ljv();
            case 4:
                return new nxl(f38439c);
            case 5:
                return f38439c;
            case 6:
                nzd nxmVar = f38440d;
                if (nxmVar == null) {
                    synchronized (ljv.class) {
                        nxmVar = f38440d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f38439c);
                            f38440d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
