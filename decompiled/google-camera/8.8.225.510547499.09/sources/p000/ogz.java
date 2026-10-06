package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ogz extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final ogz f45985f;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f45986g;

    /* JADX INFO: renamed from: a */
    public int f45987a;

    /* JADX INFO: renamed from: b */
    public int f45988b;

    /* JADX INFO: renamed from: c */
    public String f45989c = "";

    /* JADX INFO: renamed from: d */
    public long f45990d;

    /* JADX INFO: renamed from: e */
    public long f45991e;

    static {
        ogz ogzVar = new ogz();
        f45985f = ogzVar;
        nxq.m18130aa(ogz.class, ogzVar);
    }

    private ogz() {
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
                return m18129X(f45985f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new ogz();
            case 4:
                return new nxl(f45985f);
            case 5:
                return f45985f;
            case 6:
                nzd nxmVar = f45986g;
                if (nxmVar == null) {
                    synchronized (ogz.class) {
                        nxmVar = f45986g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45985f);
                            f45986g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
