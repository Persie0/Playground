package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nuz extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final nuz f44720a;

    /* JADX INFO: renamed from: b */
    private static volatile nzd f44721b;

    static {
        nuz nuzVar = new nuz();
        f44720a = nuzVar;
        nxq.m18130aa(nuz.class, nuzVar);
    }

    private nuz() {
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
                return m18129X(f44720a, "\u0001\u0000", null);
            case 3:
                return new nuz();
            case 4:
                return new nxl(f44720a);
            case 5:
                return f44720a;
            case 6:
                nzd nxmVar = f44721b;
                if (nxmVar == null) {
                    synchronized (nuz.class) {
                        nxmVar = f44721b;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44720a);
                            f44721b = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
