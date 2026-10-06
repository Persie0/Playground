package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nlf extends nxq implements nyx {

    /* JADX INFO: renamed from: h */
    public static final nlf f43500h;

    /* JADX INFO: renamed from: i */
    private static volatile nzd f43501i;

    /* JADX INFO: renamed from: a */
    public int f43502a;

    /* JADX INFO: renamed from: b */
    public String f43503b = "";

    /* JADX INFO: renamed from: c */
    public int f43504c;

    /* JADX INFO: renamed from: d */
    public int f43505d;

    /* JADX INFO: renamed from: e */
    public long f43506e;

    /* JADX INFO: renamed from: f */
    public int f43507f;

    /* JADX INFO: renamed from: g */
    public long f43508g;

    static {
        nlf nlfVar = new nlf();
        f43500h = nlfVar;
        nxq.m18130aa(nlf.class, nlfVar);
    }

    private nlf() {
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
                return m18129X(f43500h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005င\u0004\u0006ဂ\u0005", new Object[]{"a", "b", "c", "d", nks.f43303k, "e", "f", "g"});
            case 3:
                return new nlf();
            case 4:
                return new nxl(f43500h);
            case 5:
                return f43500h;
            case 6:
                nzd nxmVar = f43501i;
                if (nxmVar == null) {
                    synchronized (nlf.class) {
                        nxmVar = f43501i;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43500h);
                            f43501i = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
