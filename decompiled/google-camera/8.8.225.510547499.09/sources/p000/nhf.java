package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nhf extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final nhf f42299f;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f42300g;

    /* JADX INFO: renamed from: a */
    public int f42301a;

    /* JADX INFO: renamed from: b */
    public int f42302b;

    /* JADX INFO: renamed from: c */
    public int f42303c;

    /* JADX INFO: renamed from: d */
    public float f42304d;

    /* JADX INFO: renamed from: e */
    public int f42305e;

    static {
        nhf nhfVar = new nhf();
        f42299f = nhfVar;
        nxq.m18130aa(nhf.class, nhfVar);
    }

    private nhf() {
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
                nxu nxuVar = kva.f37300n;
                return m18129X(f42299f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ခ\u0002\u0005ဌ\u0004", new Object[]{"a", "b", nxuVar, "c", nxuVar, "d", "e", kva.f37302p});
            case 3:
                return new nhf();
            case 4:
                return new nxl(f42299f);
            case 5:
                return f42299f;
            case 6:
                nzd nxmVar = f42300g;
                if (nxmVar == null) {
                    synchronized (nhf.class) {
                        nxmVar = f42300g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42299f);
                            f42300g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
