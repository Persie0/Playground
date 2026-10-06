package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lkc extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final lkc f38470c;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f38471e;

    /* JADX INFO: renamed from: a */
    public int f38472a;

    /* JADX INFO: renamed from: b */
    public int f38473b;

    /* JADX INFO: renamed from: d */
    private int f38474d;

    static {
        lkc lkcVar = new lkc();
        f38470c = lkcVar;
        nxq.m18130aa(lkc.class, lkcVar);
    }

    private lkc() {
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
                return m18129X(f38470c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new lkc();
            case 4:
                return new nxl(f38470c);
            case 5:
                return f38470c;
            case 6:
                nzd nxmVar = f38471e;
                if (nxmVar == null) {
                    synchronized (lkc.class) {
                        nxmVar = f38471e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f38470c);
                            f38471e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
