package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nlm extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final nlm f43547d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f43548e;

    /* JADX INFO: renamed from: a */
    public int f43549a;

    /* JADX INFO: renamed from: b */
    public int f43550b;

    /* JADX INFO: renamed from: c */
    public long f43551c;

    static {
        nlm nlmVar = new nlm();
        f43547d = nlmVar;
        nxq.m18130aa(nlm.class, nlmVar);
    }

    private nlm() {
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
                return m18129X(f43547d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", nks.f43308p, "c"});
            case 3:
                return new nlm();
            case 4:
                return new nxl(f43547d);
            case 5:
                return f43547d;
            case 6:
                nzd nxmVar = f43548e;
                if (nxmVar == null) {
                    synchronized (nlm.class) {
                        nxmVar = f43548e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43547d);
                            f43548e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
