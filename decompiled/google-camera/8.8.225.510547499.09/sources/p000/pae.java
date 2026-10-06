package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pae extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final pae f47170d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f47171e;

    /* JADX INFO: renamed from: a */
    public int f47172a;

    /* JADX INFO: renamed from: b */
    public int f47173b;

    /* JADX INFO: renamed from: c */
    public int f47174c;

    static {
        pae paeVar = new pae();
        f47170d = paeVar;
        nxq.m18130aa(pae.class, paeVar);
    }

    private pae() {
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
                return m18129X(f47170d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", pab.f47150c, "c"});
            case 3:
                return new pae();
            case 4:
                return new nxl(f47170d);
            case 5:
                return f47170d;
            case 6:
                nzd nxmVar = f47171e;
                if (nxmVar == null) {
                    synchronized (pae.class) {
                        nxmVar = f47171e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47170d);
                            f47171e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
