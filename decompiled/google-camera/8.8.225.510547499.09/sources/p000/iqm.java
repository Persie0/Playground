package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iqm extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final iqm f31801c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f31802d;

    /* JADX INFO: renamed from: a */
    public nwr f31803a = nwr.f44839b;

    /* JADX INFO: renamed from: b */
    public long f31804b;

    static {
        iqm iqmVar = new iqm();
        f31801c = iqmVar;
        nxq.m18130aa(iqm.class, iqmVar);
    }

    private iqm() {
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
                return m18129X(f31801c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\n\u0002\u0002", new Object[]{"a", "b"});
            case 3:
                return new iqm();
            case 4:
                return new nxl(f31801c);
            case 5:
                return f31801c;
            case 6:
                nzd nxmVar = f31802d;
                if (nxmVar == null) {
                    synchronized (iqm.class) {
                        nxmVar = f31802d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f31801c);
                            f31802d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
