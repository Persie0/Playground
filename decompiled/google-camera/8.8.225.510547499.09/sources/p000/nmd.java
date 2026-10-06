package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nmd extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final nmd f43757d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f43758e;

    /* JADX INFO: renamed from: a */
    public int f43759a;

    /* JADX INFO: renamed from: b */
    public float f43760b;

    /* JADX INFO: renamed from: c */
    public float f43761c;

    static {
        nmd nmdVar = new nmd();
        f43757d = nmdVar;
        nxq.m18130aa(nmd.class, nmdVar);
    }

    private nmd() {
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
                return m18129X(f43757d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new nmd();
            case 4:
                return new nxl(f43757d);
            case 5:
                return f43757d;
            case 6:
                nzd nxmVar = f43758e;
                if (nxmVar == null) {
                    synchronized (nmd.class) {
                        nxmVar = f43758e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43757d);
                            f43758e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
