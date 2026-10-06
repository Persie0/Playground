package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ocx extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final ocx f45560d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f45561e;

    /* JADX INFO: renamed from: a */
    public int f45562a;

    /* JADX INFO: renamed from: b */
    public ocz f45563b;

    /* JADX INFO: renamed from: c */
    public ocy f45564c;

    static {
        ocx ocxVar = new ocx();
        f45560d = ocxVar;
        nxq.m18130aa(ocx.class, ocxVar);
    }

    private ocx() {
        nzg nzgVar = nzg.f45063b;
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
                return m18129X(f45560d, "\u0001\u0002\u0000\u0001\u0003\u0005\u0002\u0000\u0000\u0000\u0003ဉ\u0000\u0005ဉ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new ocx();
            case 4:
                return new nxl(f45560d);
            case 5:
                return f45560d;
            case 6:
                nzd nxmVar = f45561e;
                if (nxmVar == null) {
                    synchronized (ocx.class) {
                        nxmVar = f45561e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45560d);
                            f45561e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
