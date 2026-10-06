package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class njo extends nxq implements nyx {

    /* JADX INFO: renamed from: g */
    public static final njo f43047g;

    /* JADX INFO: renamed from: h */
    private static volatile nzd f43048h;

    /* JADX INFO: renamed from: a */
    public int f43049a;

    /* JADX INFO: renamed from: b */
    public int f43050b;

    /* JADX INFO: renamed from: c */
    public long f43051c;

    /* JADX INFO: renamed from: d */
    public long f43052d;

    /* JADX INFO: renamed from: e */
    public int f43053e;

    /* JADX INFO: renamed from: f */
    public int f43054f;

    static {
        njo njoVar = new njo();
        f43047g = njoVar;
        nxq.m18130aa(njo.class, njoVar);
    }

    private njo() {
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
                return m18129X(f43047g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဌ\u0003\u0005င\u0004", new Object[]{"a", "b", niy.f42843q, "c", "d", "e", niy.f42844r, "f"});
            case 3:
                return new njo();
            case 4:
                return new nxl(f43047g);
            case 5:
                return f43047g;
            case 6:
                nzd nxmVar = f43048h;
                if (nxmVar == null) {
                    synchronized (njo.class) {
                        nxmVar = f43048h;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43047g);
                            f43048h = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
