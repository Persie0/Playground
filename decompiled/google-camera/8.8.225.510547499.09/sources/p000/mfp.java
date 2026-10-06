package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mfp extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final mfp f40372c;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f40373e;

    /* JADX INFO: renamed from: a */
    public mfr f40374a;

    /* JADX INFO: renamed from: b */
    public int f40375b;

    /* JADX INFO: renamed from: d */
    private int f40376d;

    static {
        mfp mfpVar = new mfp();
        f40372c = mfpVar;
        nxq.m18130aa(mfp.class, mfpVar);
    }

    private mfp() {
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
                return m18129X(f40372c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new mfp();
            case 4:
                return new nxl(f40372c);
            case 5:
                return f40372c;
            case 6:
                nzd nxmVar = f40373e;
                if (nxmVar == null) {
                    synchronized (mfp.class) {
                        nxmVar = f40373e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f40372c);
                            f40373e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
