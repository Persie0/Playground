package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nme extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final nme f43762c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f43763d;

    /* JADX INFO: renamed from: a */
    public int f43764a;

    /* JADX INFO: renamed from: b */
    public int f43765b;

    static {
        nme nmeVar = new nme();
        f43762c = nmeVar;
        nxq.m18130aa(nme.class, nmeVar);
    }

    private nme() {
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
                return m18129X(f43762c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", nlu.f43673j});
            case 3:
                return new nme();
            case 4:
                return new nxl(f43762c);
            case 5:
                return f43762c;
            case 6:
                nzd nxmVar = f43763d;
                if (nxmVar == null) {
                    synchronized (nme.class) {
                        nxmVar = f43763d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43762c);
                            f43763d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
