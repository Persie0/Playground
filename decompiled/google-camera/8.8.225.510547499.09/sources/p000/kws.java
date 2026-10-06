package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kws extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final kws f37527c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f37528d;

    /* JADX INFO: renamed from: a */
    public int f37529a;

    /* JADX INFO: renamed from: b */
    public String f37530b = "";

    static {
        kws kwsVar = new kws();
        f37527c = kwsVar;
        nxq.m18130aa(kws.class, kwsVar);
    }

    private kws() {
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
                return m18129X(f37527c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new kws();
            case 4:
                return new nxl(f37527c);
            case 5:
                return f37527c;
            case 6:
                nzd nxmVar = f37528d;
                if (nxmVar == null) {
                    synchronized (kws.class) {
                        nxmVar = f37528d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f37527c);
                            f37528d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
