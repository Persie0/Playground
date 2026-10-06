package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nlo extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final nlo f43558d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f43559e;

    /* JADX INFO: renamed from: a */
    public int f43560a;

    /* JADX INFO: renamed from: b */
    public int f43561b;

    /* JADX INFO: renamed from: c */
    public boolean f43562c;

    static {
        nlo nloVar = new nlo();
        f43558d = nloVar;
        nxq.m18130aa(nlo.class, nloVar);
    }

    private nlo() {
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
                return m18129X(f43558d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", nks.f43309q, "c"});
            case 3:
                return new nlo();
            case 4:
                return new nxl(f43558d);
            case 5:
                return f43558d;
            case 6:
                nzd nxmVar = f43559e;
                if (nxmVar == null) {
                    synchronized (nlo.class) {
                        nxmVar = f43559e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43558d);
                            f43559e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
