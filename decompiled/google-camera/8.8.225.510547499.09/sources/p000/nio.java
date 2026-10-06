package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nio extends nxq implements nyx {

    /* JADX INFO: renamed from: g */
    public static final nio f42743g;

    /* JADX INFO: renamed from: h */
    private static volatile nzd f42744h;

    /* JADX INFO: renamed from: a */
    public int f42745a;

    /* JADX INFO: renamed from: b */
    public int f42746b;

    /* JADX INFO: renamed from: c */
    public float f42747c;

    /* JADX INFO: renamed from: d */
    public float f42748d;

    /* JADX INFO: renamed from: e */
    public float f42749e;

    /* JADX INFO: renamed from: f */
    public float f42750f;

    static {
        nio nioVar = new nio();
        f42743g = nioVar;
        nxq.m18130aa(nio.class, nioVar);
    }

    private nio() {
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
                return m18129X(f42743g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004", new Object[]{"a", "b", nhr.f42531t, "c", "d", "e", "f"});
            case 3:
                return new nio();
            case 4:
                return new nxl(f42743g);
            case 5:
                return f42743g;
            case 6:
                nzd nxmVar = f42744h;
                if (nxmVar == null) {
                    synchronized (nio.class) {
                        nxmVar = f42744h;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42743g);
                            f42744h = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
