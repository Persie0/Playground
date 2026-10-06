package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cnt extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final cnt f6383c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f6384d;

    /* JADX INFO: renamed from: a */
    public int f6385a = 0;

    /* JADX INFO: renamed from: b */
    public Object f6386b;

    static {
        cnt cntVar = new cnt();
        f6383c = cntVar;
        nxq.m18130aa(cnt.class, cntVar);
    }

    private cnt() {
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
                return m18129X(f6383c, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"b", "a", cnv.class});
            case 3:
                return new cnt();
            case 4:
                return new nxl(f6383c);
            case 5:
                return f6383c;
            case 6:
                nzd nxmVar = f6384d;
                if (nxmVar == null) {
                    synchronized (cnt.class) {
                        nxmVar = f6384d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f6383c);
                            f6384d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
