package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nkv extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final nkv f43332f;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f43333g;

    /* JADX INFO: renamed from: a */
    public int f43334a;

    /* JADX INFO: renamed from: b */
    public int f43335b;

    /* JADX INFO: renamed from: c */
    public int f43336c;

    /* JADX INFO: renamed from: d */
    public String f43337d = "";

    /* JADX INFO: renamed from: e */
    public int f43338e;

    static {
        nkv nkvVar = new nkv();
        f43332f = nkvVar;
        nxq.m18130aa(nkv.class, nkvVar);
    }

    private nkv() {
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
                return m18129X(f43332f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", nks.f43296d, "c", "d", "e", nks.f43297e});
            case 3:
                return new nkv();
            case 4:
                return new nxl(f43332f);
            case 5:
                return f43332f;
            case 6:
                nzd nxmVar = f43333g;
                if (nxmVar == null) {
                    synchronized (nkv.class) {
                        nxmVar = f43333g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43332f);
                            f43333g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
