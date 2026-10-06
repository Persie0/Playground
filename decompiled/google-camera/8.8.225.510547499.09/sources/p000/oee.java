package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oee extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final oee f45715a;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f45716e;

    /* JADX INFO: renamed from: b */
    private int f45717b;

    /* JADX INFO: renamed from: c */
    private oec f45718c;

    /* JADX INFO: renamed from: d */
    private oec f45719d;

    static {
        oee oeeVar = new oee();
        f45715a = oeeVar;
        nxq.m18130aa(oee.class, oeeVar);
    }

    private oee() {
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
                return m18129X(f45715a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0002", new Object[]{"b", "c", "d"});
            case 3:
                return new oee();
            case 4:
                return new nxl(f45715a);
            case 5:
                return f45715a;
            case 6:
                nzd nxmVar = f45716e;
                if (nxmVar == null) {
                    synchronized (oee.class) {
                        nxmVar = f45716e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45715a);
                            f45716e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
