package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nmc extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final nmc f43750f;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f43751g;

    /* JADX INFO: renamed from: a */
    public int f43752a;

    /* JADX INFO: renamed from: b */
    public float f43753b;

    /* JADX INFO: renamed from: c */
    public float f43754c;

    /* JADX INFO: renamed from: d */
    public float f43755d;

    /* JADX INFO: renamed from: e */
    public float f43756e;

    static {
        nmc nmcVar = new nmc();
        f43750f = nmcVar;
        nxq.m18130aa(nmc.class, nmcVar);
    }

    private nmc() {
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
                return m18129X(f43750f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new nmc();
            case 4:
                return new nxl(f43750f);
            case 5:
                return f43750f;
            case 6:
                nzd nxmVar = f43751g;
                if (nxmVar == null) {
                    synchronized (nmc.class) {
                        nxmVar = f43751g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43750f);
                            f43751g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
