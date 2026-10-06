package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iqo extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final iqo f31808b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f31809c;

    /* JADX INFO: renamed from: a */
    public float f31810a;

    static {
        iqo iqoVar = new iqo();
        f31808b = iqoVar;
        nxq.m18130aa(iqo.class, iqoVar);
    }

    private iqo() {
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
                return m18129X(f31808b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new Object[]{"a"});
            case 3:
                return new iqo();
            case 4:
                return new nxl(f31808b);
            case 5:
                return f31808b;
            case 6:
                nzd nxmVar = f31809c;
                if (nxmVar == null) {
                    synchronized (iqo.class) {
                        nxmVar = f31809c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f31808b);
                            f31809c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
