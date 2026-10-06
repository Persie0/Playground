package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oho extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final oho f46021e;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f46022g;

    /* JADX INFO: renamed from: a */
    public boolean f46023a;

    /* JADX INFO: renamed from: b */
    public String f46024b = "";

    /* JADX INFO: renamed from: c */
    public String f46025c = "";

    /* JADX INFO: renamed from: d */
    public boolean f46026d;

    /* JADX INFO: renamed from: f */
    private int f46027f;

    static {
        oho ohoVar = new oho();
        f46021e = ohoVar;
        nxq.m18130aa(oho.class, ohoVar);
    }

    private oho() {
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
                return m18129X(f46021e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"f", "a", "b", "c", "d"});
            case 3:
                return new oho();
            case 4:
                return new nxl(f46021e);
            case 5:
                return f46021e;
            case 6:
                nzd nxmVar = f46022g;
                if (nxmVar == null) {
                    synchronized (oho.class) {
                        nxmVar = f46022g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f46021e);
                            f46022g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
