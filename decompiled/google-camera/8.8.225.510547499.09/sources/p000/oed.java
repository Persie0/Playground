package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oed extends nxq implements nyx {

    /* JADX INFO: renamed from: i */
    public static final oed f45705i;

    /* JADX INFO: renamed from: j */
    private static volatile nzd f45706j;

    /* JADX INFO: renamed from: a */
    public int f45707a;

    /* JADX INFO: renamed from: b */
    public boolean f45708b;

    /* JADX INFO: renamed from: c */
    public String f45709c = "";

    /* JADX INFO: renamed from: d */
    public String f45710d = "";

    /* JADX INFO: renamed from: e */
    public String f45711e = "";

    /* JADX INFO: renamed from: f */
    public String f45712f = "";

    /* JADX INFO: renamed from: g */
    public ocf f45713g;

    /* JADX INFO: renamed from: h */
    public long f45714h;

    static {
        oed oedVar = new oed();
        f45705i = oedVar;
        nxq.m18130aa(oed.class, oedVar);
    }

    private oed() {
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
                return m18129X(f45705i, "\u0001\u0007\u0000\u0001\u0002\u0016\u0007\u0000\u0000\u0000\u0002ဈ\u0006\u0003ဈ\b\u0004ဈ\t\u0005ဉ\n\u0006ဇ\u0000\u000fဂ\u0012\u0016ဈ\u0002", new Object[]{"a", "d", "e", "f", "g", "b", "h", "c"});
            case 3:
                return new oed();
            case 4:
                return new nxl(f45705i);
            case 5:
                return f45705i;
            case 6:
                nzd nxmVar = f45706j;
                if (nxmVar == null) {
                    synchronized (oed.class) {
                        nxmVar = f45706j;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45705i);
                            f45706j = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
