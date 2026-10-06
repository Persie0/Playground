package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nlz extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final nlz f43710e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f43711f;

    /* JADX INFO: renamed from: a */
    public int f43712a;

    /* JADX INFO: renamed from: b */
    public int f43713b;

    /* JADX INFO: renamed from: c */
    public int f43714c;

    /* JADX INFO: renamed from: d */
    public int f43715d;

    static {
        nlz nlzVar = new nlz();
        f43710e = nlzVar;
        nxq.m18130aa(nlz.class, nlzVar);
    }

    private nlz() {
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
                nxu nxuVar = nlu.f43670g;
                return m18129X(f43710e, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0000\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", nxuVar, "c", nxuVar, "d", nlu.f43671h});
            case 3:
                return new nlz();
            case 4:
                return new nxl(f43710e);
            case 5:
                return f43710e;
            case 6:
                nzd nxmVar = f43711f;
                if (nxmVar == null) {
                    synchronized (nlz.class) {
                        nxmVar = f43711f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43710e);
                            f43711f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
