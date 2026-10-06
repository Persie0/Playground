package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nmm extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final nmm f43851e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f43852f;

    /* JADX INFO: renamed from: a */
    public int f43853a;

    /* JADX INFO: renamed from: b */
    public float f43854b;

    /* JADX INFO: renamed from: c */
    public float f43855c;

    /* JADX INFO: renamed from: d */
    public int f43856d;

    static {
        nmm nmmVar = new nmm();
        f43851e = nmmVar;
        nxq.m18130aa(nmm.class, nmmVar);
    }

    private nmm() {
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
                return m18129X(f43851e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", kva.f37302p});
            case 3:
                return new nmm();
            case 4:
                return new nxl(f43851e);
            case 5:
                return f43851e;
            case 6:
                nzd nxmVar = f43852f;
                if (nxmVar == null) {
                    synchronized (nmm.class) {
                        nxmVar = f43852f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43851e);
                            f43852f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
