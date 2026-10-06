package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ozs extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final ozs f47071c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f47072d;

    /* JADX INFO: renamed from: a */
    public int f47073a;

    /* JADX INFO: renamed from: b */
    public int f47074b;

    static {
        ozs ozsVar = new ozs();
        f47071c = ozsVar;
        nxq.m18130aa(ozs.class, ozsVar);
    }

    private ozs() {
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
                return m18129X(f47071c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new ozs();
            case 4:
                return new nxl(f47071c);
            case 5:
                return f47071c;
            case 6:
                nzd nxmVar = f47072d;
                if (nxmVar == null) {
                    synchronized (ozs.class) {
                        nxmVar = f47072d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47071c);
                            f47072d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
