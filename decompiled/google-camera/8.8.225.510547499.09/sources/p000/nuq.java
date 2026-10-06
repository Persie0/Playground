package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nuq extends nxq implements nyx {

    /* JADX INFO: renamed from: h */
    public static final nuq f44680h;

    /* JADX INFO: renamed from: i */
    private static volatile nzd f44681i;

    /* JADX INFO: renamed from: a */
    public int f44682a;

    /* JADX INFO: renamed from: b */
    public int f44683b;

    /* JADX INFO: renamed from: c */
    public int f44684c;

    /* JADX INFO: renamed from: d */
    public int f44685d;

    /* JADX INFO: renamed from: e */
    public nzw f44686e;

    /* JADX INFO: renamed from: f */
    public nzw f44687f;

    /* JADX INFO: renamed from: g */
    public int f44688g;

    static {
        nuq nuqVar = new nuq();
        f44680h = nuqVar;
        nxq.m18130aa(nuq.class, nuqVar);
    }

    private nuq() {
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
                return m18129X(f44680h, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\f\u0005\t\u0006\t\u0007\u0004", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            case 3:
                return new nuq();
            case 4:
                return new nxl(f44680h);
            case 5:
                return f44680h;
            case 6:
                nzd nxmVar = f44681i;
                if (nxmVar == null) {
                    synchronized (nuq.class) {
                        nxmVar = f44681i;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44680h);
                            f44681i = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
