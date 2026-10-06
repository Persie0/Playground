package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mey extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final mey f40280d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f40281e;

    /* JADX INFO: renamed from: a */
    public int f40282a;

    /* JADX INFO: renamed from: b */
    public mep f40283b;

    /* JADX INFO: renamed from: c */
    public mfc f40284c;

    static {
        mey meyVar = new mey();
        f40280d = meyVar;
        nxq.m18130aa(mey.class, meyVar);
    }

    private mey() {
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
                return m18129X(f40280d, "\u0001\u0002\u0000\u0001\u0001\u0006\u0002\u0000\u0000\u0000\u0001ဉ\u0001\u0006ဉ\u0003", new Object[]{"a", "b", "c"});
            case 3:
                return new mey();
            case 4:
                return new nxl(f40280d);
            case 5:
                return f40280d;
            case 6:
                nzd nxmVar = f40281e;
                if (nxmVar == null) {
                    synchronized (mey.class) {
                        nxmVar = f40281e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f40280d);
                            f40281e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
