package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nlx extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final nlx f43699d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f43700e;

    /* JADX INFO: renamed from: a */
    public int f43701a;

    /* JADX INFO: renamed from: b */
    public nmc f43702b;

    /* JADX INFO: renamed from: c */
    public boolean f43703c;

    static {
        nlx nlxVar = new nlx();
        f43699d = nlxVar;
        nxq.m18130aa(nlx.class, nlxVar);
    }

    private nlx() {
        nzg nzgVar = nzg.f45063b;
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
                return m18129X(f43699d, "\u0001\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0005ဇ\u0003", new Object[]{"a", "b", "c"});
            case 3:
                return new nlx();
            case 4:
                return new nxl(f43699d);
            case 5:
                return f43699d;
            case 6:
                nzd nxmVar = f43700e;
                if (nxmVar == null) {
                    synchronized (nlx.class) {
                        nxmVar = f43700e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43699d);
                            f43700e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
