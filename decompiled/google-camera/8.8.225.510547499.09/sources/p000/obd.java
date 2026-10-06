package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class obd extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final obd f45241c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f45242d;

    /* JADX INFO: renamed from: a */
    public int f45243a = 0;

    /* JADX INFO: renamed from: b */
    public Object f45244b;

    static {
        obd obdVar = new obd();
        f45241c = obdVar;
        nxq.m18130aa(obd.class, obdVar);
    }

    private obd() {
    }

    /* JADX INFO: renamed from: c */
    public static nxl m18398c() {
        return f45241c.m18137O();
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
                return m18129X(f45241c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဿ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", oau.f45190e, obb.class, obc.class});
            case 3:
                return new obd();
            case 4:
                return new nxl(f45241c);
            case 5:
                return f45241c;
            case 6:
                nzd nxmVar = f45242d;
                if (nxmVar == null) {
                    synchronized (obd.class) {
                        nxmVar = f45242d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45241c);
                            f45242d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
