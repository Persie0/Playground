package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pbv extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final pbv f47359c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f47360d;

    /* JADX INFO: renamed from: a */
    public int f47361a;

    /* JADX INFO: renamed from: b */
    public mfj f47362b;

    static {
        pbv pbvVar = new pbv();
        f47359c = pbvVar;
        nxq.m18130aa(pbv.class, pbvVar);
    }

    private pbv() {
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
                return m18129X(f47359c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new pbv();
            case 4:
                return new nxl(f47359c);
            case 5:
                return f47359c;
            case 6:
                nzd nxmVar = f47360d;
                if (nxmVar == null) {
                    synchronized (pbv.class) {
                        nxmVar = f47360d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47359c);
                            f47360d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
