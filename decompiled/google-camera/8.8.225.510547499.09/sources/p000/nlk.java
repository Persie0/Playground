package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nlk extends nxq implements nyx {

    /* JADX INFO: renamed from: h */
    public static final nlk f43533h;

    /* JADX INFO: renamed from: i */
    private static volatile nzd f43534i;

    /* JADX INFO: renamed from: a */
    public int f43535a;

    /* JADX INFO: renamed from: b */
    public int f43536b;

    /* JADX INFO: renamed from: d */
    public boolean f43538d;

    /* JADX INFO: renamed from: e */
    public boolean f43539e;

    /* JADX INFO: renamed from: c */
    public String f43537c = "";

    /* JADX INFO: renamed from: f */
    public String f43540f = "";

    /* JADX INFO: renamed from: g */
    public String f43541g = "";

    static {
        nlk nlkVar = new nlk();
        f43533h = nlkVar;
        nxq.m18130aa(nlk.class, nlkVar);
    }

    private nlk() {
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
                return m18129X(f43533h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"a", "b", nks.f43305m, "c", "d", "e", "f", "g"});
            case 3:
                return new nlk();
            case 4:
                return new nxl(f43533h);
            case 5:
                return f43533h;
            case 6:
                nzd nxmVar = f43534i;
                if (nxmVar == null) {
                    synchronized (nlk.class) {
                        nxmVar = f43534i;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43533h);
                            f43534i = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
