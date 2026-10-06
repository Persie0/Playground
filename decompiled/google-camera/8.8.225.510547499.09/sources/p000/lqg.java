package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lqg extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final lqg f38956b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f38957c;

    /* JADX INFO: renamed from: a */
    public nyr f38958a = nyr.f45033a;

    static {
        lqg lqgVar = new lqg();
        f38956b = lqgVar;
        nxq.m18130aa(lqg.class, lqgVar);
    }

    private lqg() {
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
                return m18129X(f38956b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"a", lqf.f38955a});
            case 3:
                return new lqg();
            case 4:
                return new nxl(f38956b);
            case 5:
                return f38956b;
            case 6:
                nzd nxmVar = f38957c;
                if (nxmVar == null) {
                    synchronized (lqg.class) {
                        nxmVar = f38957c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f38956b);
                            f38957c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
