package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nlg extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final nlg f43509f;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f43510g;

    /* JADX INFO: renamed from: a */
    public int f43511a;

    /* JADX INFO: renamed from: b */
    public int f43512b;

    /* JADX INFO: renamed from: c */
    public int f43513c;

    /* JADX INFO: renamed from: d */
    public int f43514d;

    /* JADX INFO: renamed from: e */
    public nlh f43515e;

    static {
        nlg nlgVar = new nlg();
        f43509f = nlgVar;
        nxq.m18130aa(nlg.class, nlgVar);
    }

    private nlg() {
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
                return m18129X(f43509f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new nlg();
            case 4:
                return new nxl(f43509f);
            case 5:
                return f43509f;
            case 6:
                nzd nxmVar = f43510g;
                if (nxmVar == null) {
                    synchronized (nlg.class) {
                        nxmVar = f43510g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43509f);
                            f43510g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
