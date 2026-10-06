package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class odp extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final odp f45650c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f45651d;

    /* JADX INFO: renamed from: a */
    public int f45652a;

    /* JADX INFO: renamed from: b */
    public boolean f45653b;

    static {
        odp odpVar = new odp();
        f45650c = odpVar;
        nxq.m18130aa(odp.class, odpVar);
    }

    private odp() {
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
                return m18129X(f45650c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new odp();
            case 4:
                return new nxl(f45650c);
            case 5:
                return f45650c;
            case 6:
                nzd nxmVar = f45651d;
                if (nxmVar == null) {
                    synchronized (odp.class) {
                        nxmVar = f45651d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45650c);
                            f45651d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
