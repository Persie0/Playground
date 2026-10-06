package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lju extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final lju f38431f;

    /* JADX INFO: renamed from: h */
    private static volatile nzd f38432h;

    /* JADX INFO: renamed from: a */
    public boolean f38433a;

    /* JADX INFO: renamed from: b */
    public int f38434b;

    /* JADX INFO: renamed from: c */
    public int f38435c;

    /* JADX INFO: renamed from: d */
    public int f38436d;

    /* JADX INFO: renamed from: e */
    public float f38437e;

    /* JADX INFO: renamed from: g */
    private int f38438g;

    static {
        lju ljuVar = new lju();
        f38431f = ljuVar;
        nxq.m18130aa(lju.class, ljuVar);
    }

    private lju() {
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
                return m18129X(f38431f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ခ\u0004", new Object[]{"g", "a", "b", "c", "d", "e"});
            case 3:
                return new lju();
            case 4:
                return new nxl(f38431f);
            case 5:
                return f38431f;
            case 6:
                nzd nxmVar = f38432h;
                if (nxmVar == null) {
                    synchronized (lju.class) {
                        nxmVar = f38432h;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f38431f);
                            f38432h = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
