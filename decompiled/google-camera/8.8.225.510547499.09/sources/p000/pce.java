package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pce extends nxq implements nyx {

    /* JADX INFO: renamed from: h */
    public static final pce f47393h;

    /* JADX INFO: renamed from: i */
    private static volatile nzd f47394i;

    /* JADX INFO: renamed from: a */
    public nyr f47395a = nyr.f45033a;

    /* JADX INFO: renamed from: b */
    public nyr f47396b = nyr.f45033a;

    /* JADX INFO: renamed from: c */
    public nxy f47397c = nzg.f45063b;

    /* JADX INFO: renamed from: d */
    public nxx f47398d = nyn.f45025b;

    /* JADX INFO: renamed from: e */
    public nxw f47399e;

    /* JADX INFO: renamed from: f */
    public nxw f47400f;

    /* JADX INFO: renamed from: g */
    public nxx f47401g;

    static {
        pce pceVar = new pce();
        f47393h = pceVar;
        nxq.m18130aa(pce.class, pceVar);
    }

    private pce() {
        nxr nxrVar = nxr.f44982b;
        this.f47399e = nxrVar;
        this.f47400f = nxrVar;
        this.f47401g = nyn.f45025b;
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
                return m18129X(f47393h, "\u0001\u0007\u0000\u0000\u0002\n\u0007\u0002\u0005\u0000\u00022\u00032\u0006\u001b\u0007%\b'\t'\n%", new Object[]{"a", pcc.f47391a, "b", pcd.f47392a, "c", pca.class, "d", "e", "f", "g"});
            case 3:
                return new pce();
            case 4:
                return new nxl(f47393h);
            case 5:
                return f47393h;
            case 6:
                nzd nxmVar = f47394i;
                if (nxmVar == null) {
                    synchronized (pce.class) {
                        nxmVar = f47394i;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47393h);
                            f47394i = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
