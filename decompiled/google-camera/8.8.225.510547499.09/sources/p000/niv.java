package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class niv extends nxq implements nyx {

    /* JADX INFO: renamed from: k */
    public static final niv f42802k;

    /* JADX INFO: renamed from: l */
    private static volatile nzd f42803l;

    /* JADX INFO: renamed from: a */
    public int f42804a;

    /* JADX INFO: renamed from: b */
    public int f42805b;

    /* JADX INFO: renamed from: c */
    public nxv f42806c;

    /* JADX INFO: renamed from: d */
    public nxv f42807d;

    /* JADX INFO: renamed from: e */
    public int f42808e;

    /* JADX INFO: renamed from: f */
    public int f42809f;

    /* JADX INFO: renamed from: g */
    public int f42810g;

    /* JADX INFO: renamed from: h */
    public int f42811h;

    /* JADX INFO: renamed from: i */
    public boolean f42812i;

    /* JADX INFO: renamed from: j */
    public nxw f42813j;

    static {
        niv nivVar = new niv();
        f42802k = nivVar;
        nxq.m18130aa(niv.class, nivVar);
    }

    private niv() {
        nxj nxjVar = nxj.f44968b;
        this.f42806c = nxjVar;
        this.f42807d = nxjVar;
        this.f42813j = nxr.f44982b;
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
                return m18129X(f42802k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0003\u0000\u0001ဌ\u0000\u0002\u0013\u0003\u0013\u0004င\u0001\u0006င\u0003\u0007င\u0004\tင\u0006\nဇ\u0007\u000b,", new Object[]{"a", "b", niy.f42828b, "c", "d", "e", "f", "g", "h", "i", "j", pab.f47155h});
            case 3:
                return new niv();
            case 4:
                return new nxl(f42802k);
            case 5:
                return f42802k;
            case 6:
                nzd nxmVar = f42803l;
                if (nxmVar == null) {
                    synchronized (niv.class) {
                        nxmVar = f42803l;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42802k);
                            f42803l = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
