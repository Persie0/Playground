package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pag extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final pag f47189f;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f47190g;

    /* JADX INFO: renamed from: a */
    public int f47191a;

    /* JADX INFO: renamed from: b */
    public int f47192b;

    /* JADX INFO: renamed from: c */
    public int f47193c;

    /* JADX INFO: renamed from: d */
    public nxw f47194d;

    /* JADX INFO: renamed from: e */
    public nxw f47195e;

    static {
        pag pagVar = new pag();
        f47189f = pagVar;
        nxq.m18130aa(pag.class, pagVar);
    }

    private pag() {
        nxr nxrVar = nxr.f44982b;
        this.f47194d = nxrVar;
        this.f47195e = nxrVar;
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
                return m18129X(f47189f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001င\u0000\u0002င\u0001\u0003'\u0004'", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new pag();
            case 4:
                return new nxl(f47189f);
            case 5:
                return f47189f;
            case 6:
                nzd nxmVar = f47190g;
                if (nxmVar == null) {
                    synchronized (pag.class) {
                        nxmVar = f47190g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47189f);
                            f47190g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
