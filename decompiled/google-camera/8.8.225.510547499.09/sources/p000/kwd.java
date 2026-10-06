package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kwd extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final kwd f37492b;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f37493d;

    /* JADX INFO: renamed from: a */
    public long f37494a;

    /* JADX INFO: renamed from: c */
    private int f37495c;

    static {
        kwd kwdVar = new kwd();
        f37492b = kwdVar;
        nxq.m18130aa(kwd.class, kwdVar);
    }

    private kwd() {
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
                return m18129X(f37492b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဃ\u0000", new Object[]{"c", "a"});
            case 3:
                return new kwd();
            case 4:
                return new nxl(f37492b);
            case 5:
                return f37492b;
            case 6:
                nzd nxmVar = f37493d;
                if (nxmVar == null) {
                    synchronized (kwd.class) {
                        nxmVar = f37493d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f37492b);
                            f37493d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
