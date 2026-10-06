package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nlq extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final nlq f43570d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f43571e;

    /* JADX INFO: renamed from: a */
    public int f43572a;

    /* JADX INFO: renamed from: b */
    public long f43573b;

    /* JADX INFO: renamed from: c */
    public nxy f43574c = nzg.f45063b;

    static {
        nlq nlqVar = new nlq();
        f43570d = nlqVar;
        nxq.m18130aa(nlq.class, nlqVar);
    }

    private nlq() {
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
                return m18129X(f43570d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b", new Object[]{"a", "b", "c", nln.class});
            case 3:
                return new nlq();
            case 4:
                return new nxl(f43570d);
            case 5:
                return f43570d;
            case 6:
                nzd nxmVar = f43571e;
                if (nxmVar == null) {
                    synchronized (nlq.class) {
                        nxmVar = f43571e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43570d);
                            f43571e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
