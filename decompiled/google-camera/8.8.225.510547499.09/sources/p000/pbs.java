package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pbs extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final pbs f47350b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f47351c;

    /* JADX INFO: renamed from: a */
    public nyr f47352a = nyr.f45033a;

    static {
        pbs pbsVar = new pbs();
        f47350b = pbsVar;
        nxq.m18130aa(pbs.class, pbsVar);
    }

    private pbs() {
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
                return m18129X(f47350b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", pbr.f47349a});
            case 3:
                return new pbs();
            case 4:
                return new nxl(f47350b);
            case 5:
                return f47350b;
            case 6:
                nzd nxmVar = f47351c;
                if (nxmVar == null) {
                    synchronized (pbs.class) {
                        nxmVar = f47351c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47350b);
                            f47351c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
