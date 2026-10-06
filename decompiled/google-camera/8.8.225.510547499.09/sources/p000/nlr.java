package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nlr extends nxq implements nyx {

    /* JADX INFO: renamed from: j */
    public static final nlr f43575j;

    /* JADX INFO: renamed from: k */
    private static volatile nzd f43576k;

    /* JADX INFO: renamed from: a */
    public int f43577a;

    /* JADX INFO: renamed from: b */
    public boolean f43578b;

    /* JADX INFO: renamed from: c */
    public int f43579c;

    /* JADX INFO: renamed from: d */
    public int f43580d;

    /* JADX INFO: renamed from: e */
    public int f43581e;

    /* JADX INFO: renamed from: f */
    public int f43582f;

    /* JADX INFO: renamed from: g */
    public String f43583g = "";

    /* JADX INFO: renamed from: h */
    public boolean f43584h;

    /* JADX INFO: renamed from: i */
    public boolean f43585i;

    static {
        nlr nlrVar = new nlr();
        f43575j = nlrVar;
        nxq.m18130aa(nlr.class, nlrVar);
    }

    private nlr() {
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
                return m18129X(f43575j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004င\u0003\u0005င\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"a", "b", "c", nks.f43310r, "d", nks.f43311s, "e", "f", "g", "h", "i"});
            case 3:
                return new nlr();
            case 4:
                return new nxl(f43575j);
            case 5:
                return f43575j;
            case 6:
                nzd nxmVar = f43576k;
                if (nxmVar == null) {
                    synchronized (nlr.class) {
                        nxmVar = f43576k;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43575j);
                            f43576k = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
