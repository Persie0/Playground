package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lkd extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final lkd f38475e;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f38476g;

    /* JADX INFO: renamed from: a */
    public boolean f38477a;

    /* JADX INFO: renamed from: b */
    public int f38478b;

    /* JADX INFO: renamed from: c */
    public int f38479c;

    /* JADX INFO: renamed from: d */
    public int f38480d;

    /* JADX INFO: renamed from: f */
    private int f38481f;

    static {
        lkd lkdVar = new lkd();
        f38475e = lkdVar;
        nxq.m18130aa(lkd.class, lkdVar);
    }

    private lkd() {
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
                return m18129X(f38475e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"f", "a", "b", "c", "d"});
            case 3:
                return new lkd();
            case 4:
                return new nxl(f38475e);
            case 5:
                return f38475e;
            case 6:
                nzd nxmVar = f38476g;
                if (nxmVar == null) {
                    synchronized (lkd.class) {
                        nxmVar = f38476g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f38475e);
                            f38476g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
