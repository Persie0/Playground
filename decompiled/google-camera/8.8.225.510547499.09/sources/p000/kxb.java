package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kxb extends nxq implements nyx {

    /* JADX INFO: renamed from: h */
    public static final kxb f37600h;

    /* JADX INFO: renamed from: i */
    private static volatile nzd f37601i;

    /* JADX INFO: renamed from: a */
    public int f37602a;

    /* JADX INFO: renamed from: b */
    public int f37603b;

    /* JADX INFO: renamed from: c */
    public int f37604c;

    /* JADX INFO: renamed from: d */
    public int f37605d;

    /* JADX INFO: renamed from: e */
    public int f37606e;

    /* JADX INFO: renamed from: f */
    public int f37607f;

    /* JADX INFO: renamed from: g */
    public boolean f37608g;

    static {
        kxb kxbVar = new kxb();
        f37600h = kxbVar;
        nxq.m18130aa(kxb.class, kxbVar);
    }

    private kxb() {
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
                return m18129X(f37600h, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0006\u0004\u0007\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            case 3:
                return new kxb();
            case 4:
                return new nxl(f37600h);
            case 5:
                return f37600h;
            case 6:
                nzd nxmVar = f37601i;
                if (nxmVar == null) {
                    synchronized (kxb.class) {
                        nxmVar = f37601i;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f37600h);
                            f37601i = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
