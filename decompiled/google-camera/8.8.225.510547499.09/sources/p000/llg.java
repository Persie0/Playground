package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class llg extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final llg f38566d;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f38567f;

    /* JADX INFO: renamed from: a */
    public String f38568a = "";

    /* JADX INFO: renamed from: b */
    public nxy f38569b = nzg.f45063b;

    /* JADX INFO: renamed from: c */
    public boolean f38570c;

    /* JADX INFO: renamed from: e */
    private int f38571e;

    static {
        llg llgVar = new llg();
        f38566d = llgVar;
        nxq.m18130aa(llg.class, llgVar);
    }

    private llg() {
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
                return m18129X(f38566d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"e", "a", "b", llf.class, "c"});
            case 3:
                return new llg();
            case 4:
                return new nxl(f38566d);
            case 5:
                return f38566d;
            case 6:
                nzd nxmVar = f38567f;
                if (nxmVar == null) {
                    synchronized (llg.class) {
                        nxmVar = f38567f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f38566d);
                            f38567f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
