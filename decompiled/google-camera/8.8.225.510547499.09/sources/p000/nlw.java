package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nlw extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final nlw f43692f;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f43693g;

    /* JADX INFO: renamed from: a */
    public int f43694a;

    /* JADX INFO: renamed from: b */
    public int f43695b;

    /* JADX INFO: renamed from: c */
    public int f43696c;

    /* JADX INFO: renamed from: d */
    public int f43697d;

    /* JADX INFO: renamed from: e */
    public boolean f43698e;

    static {
        nlw nlwVar = new nlw();
        f43692f = nlwVar;
        nxq.m18130aa(nlw.class, nlwVar);
    }

    private nlw() {
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
                return m18129X(f43692f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004ဇ\u0003", new Object[]{"a", "b", nlu.f43666c, "c", nlu.f43667d, "d", "e"});
            case 3:
                return new nlw();
            case 4:
                return new nxl(f43692f);
            case 5:
                return f43692f;
            case 6:
                nzd nxmVar = f43693g;
                if (nxmVar == null) {
                    synchronized (nlw.class) {
                        nxmVar = f43693g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43692f);
                            f43693g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
