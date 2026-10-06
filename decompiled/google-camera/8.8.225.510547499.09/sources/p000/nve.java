package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nve extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final nve f44736a;

    /* JADX INFO: renamed from: b */
    private static volatile nzd f44737b;

    static {
        nve nveVar = new nve();
        f44736a = nveVar;
        nxq.m18130aa(nve.class, nveVar);
    }

    private nve() {
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
                return m18129X(f44736a, "\u0001\u0000", null);
            case 3:
                return new nve();
            case 4:
                return new nxl(f44736a);
            case 5:
                return f44736a;
            case 6:
                nzd nxmVar = f44737b;
                if (nxmVar == null) {
                    synchronized (nve.class) {
                        nxmVar = f44737b;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44736a);
                            f44737b = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
