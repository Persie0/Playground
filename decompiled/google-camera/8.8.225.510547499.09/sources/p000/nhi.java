package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nhi extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final nhi f42320e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f42321f;

    /* JADX INFO: renamed from: a */
    public int f42322a;

    /* JADX INFO: renamed from: b */
    public long f42323b;

    /* JADX INFO: renamed from: c */
    public long f42324c;

    /* JADX INFO: renamed from: d */
    public int f42325d;

    static {
        nhi nhiVar = new nhi();
        f42320e = nhiVar;
        nxq.m18130aa(nhi.class, nhiVar);
    }

    private nhi() {
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
                return m18129X(f42320e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", "d", nks.f43293a});
            case 3:
                return new nhi();
            case 4:
                return new nxl(f42320e);
            case 5:
                return f42320e;
            case 6:
                nzd nxmVar = f42321f;
                if (nxmVar == null) {
                    synchronized (nhi.class) {
                        nxmVar = f42321f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42320e);
                            f42321f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
