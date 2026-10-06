package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ljp extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final ljp f38408a;

    /* JADX INFO: renamed from: b */
    private static volatile nzd f38409b;

    static {
        ljp ljpVar = new ljp();
        f38408a = ljpVar;
        nxq.m18130aa(ljp.class, ljpVar);
    }

    private ljp() {
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
                return m18129X(f38408a, "\u0001\u0000", null);
            case 3:
                return new ljp();
            case 4:
                return new nxl(f38408a);
            case 5:
                return f38408a;
            case 6:
                nzd nxmVar = f38409b;
                if (nxmVar == null) {
                    synchronized (ljp.class) {
                        nxmVar = f38409b;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f38408a);
                            f38409b = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
