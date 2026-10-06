package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class njw extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final njw f43096f;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f43097g;

    /* JADX INFO: renamed from: a */
    public int f43098a;

    /* JADX INFO: renamed from: b */
    public String f43099b = "";

    /* JADX INFO: renamed from: c */
    public String f43100c = "";

    /* JADX INFO: renamed from: d */
    public String f43101d = "";

    /* JADX INFO: renamed from: e */
    public int f43102e;

    static {
        njw njwVar = new njw();
        f43096f = njwVar;
        nxq.m18130aa(njw.class, njwVar);
    }

    private njw() {
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
                return m18129X(f43096f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new njw();
            case 4:
                return new nxl(f43096f);
            case 5:
                return f43096f;
            case 6:
                nzd nxmVar = f43097g;
                if (nxmVar == null) {
                    synchronized (njw.class) {
                        nxmVar = f43097g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43096f);
                            f43097g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
