package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kww extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final kww f37579a;

    /* JADX INFO: renamed from: b */
    private static volatile nzd f37580b;

    static {
        kww kwwVar = new kww();
        f37579a = kwwVar;
        nxq.m18130aa(kww.class, kwwVar);
    }

    private kww() {
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
                return m18129X(f37579a, "\u0001\u0000", null);
            case 3:
                return new kww();
            case 4:
                return new nxl(f37579a);
            case 5:
                return f37579a;
            case 6:
                nzd nxmVar = f37580b;
                if (nxmVar == null) {
                    synchronized (kww.class) {
                        nxmVar = f37580b;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f37579a);
                            f37580b = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
