package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nhv extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final nhv f42556c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f42557d;

    /* JADX INFO: renamed from: a */
    public int f42558a;

    /* JADX INFO: renamed from: b */
    public int f42559b;

    static {
        nhv nhvVar = new nhv();
        f42556c = nhvVar;
        nxq.m18130aa(nhv.class, nhvVar);
    }

    private nhv() {
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
                return m18129X(f42556c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", nhr.f42516e});
            case 3:
                return new nhv();
            case 4:
                return new nxl(f42556c);
            case 5:
                return f42556c;
            case 6:
                nzd nxmVar = f42557d;
                if (nxmVar == null) {
                    synchronized (nhv.class) {
                        nxmVar = f42557d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42556c);
                            f42557d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
