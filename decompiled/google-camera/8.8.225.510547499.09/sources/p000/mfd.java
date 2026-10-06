package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mfd extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final mfd f40306c;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f40307e;

    /* JADX INFO: renamed from: a */
    public int f40308a;

    /* JADX INFO: renamed from: b */
    public int f40309b;

    /* JADX INFO: renamed from: d */
    private int f40310d;

    static {
        mfd mfdVar = new mfd();
        f40306c = mfdVar;
        nxq.m18130aa(mfd.class, mfdVar);
    }

    private mfd() {
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
                return m18129X(f40306c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new mfd();
            case 4:
                return new nxl(f40306c);
            case 5:
                return f40306c;
            case 6:
                nzd nxmVar = f40307e;
                if (nxmVar == null) {
                    synchronized (mfd.class) {
                        nxmVar = f40307e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f40306c);
                            f40307e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
