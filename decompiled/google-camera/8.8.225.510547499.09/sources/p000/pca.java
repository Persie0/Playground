package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pca extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final pca f47380e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f47381f;

    /* JADX INFO: renamed from: a */
    public int f47382a;

    /* JADX INFO: renamed from: b */
    public int f47383b;

    /* JADX INFO: renamed from: c */
    public nyr f47384c = nyr.f45033a;

    /* JADX INFO: renamed from: d */
    public nxw f47385d;

    static {
        pca pcaVar = new pca();
        f47380e = pcaVar;
        nxq.m18130aa(pca.class, pcaVar);
    }

    private pca() {
        nzg nzgVar = nzg.f45063b;
        this.f47385d = nxr.f44982b;
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
                return m18129X(f47380e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0001\u0001\u0000\u0002င\u0001\u00032\u0005'", new Object[]{"a", "b", "c", pbz.f47378a, "d"});
            case 3:
                return new pca();
            case 4:
                return new nxl(f47380e);
            case 5:
                return f47380e;
            case 6:
                nzd nxmVar = f47381f;
                if (nxmVar == null) {
                    synchronized (pca.class) {
                        nxmVar = f47381f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47380e);
                            f47381f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
