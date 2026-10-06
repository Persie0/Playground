package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ntz extends nxq implements nyx {

    /* JADX INFO: renamed from: g */
    public static final ntz f44599g;

    /* JADX INFO: renamed from: i */
    private static volatile nzd f44600i;

    /* JADX INFO: renamed from: a */
    public int f44601a;

    /* JADX INFO: renamed from: b */
    public int f44602b;

    /* JADX INFO: renamed from: c */
    public int f44603c;

    /* JADX INFO: renamed from: d */
    public int f44604d;

    /* JADX INFO: renamed from: e */
    public int f44605e;

    /* JADX INFO: renamed from: f */
    public int f44606f;

    /* JADX INFO: renamed from: h */
    private int f44607h;

    static {
        ntz ntzVar = new ntz();
        f44599g = ntzVar;
        nxq.m18130aa(ntz.class, ntzVar);
    }

    private ntz() {
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
                return m18129X(f44599g, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005", new Object[]{"h", "a", "b", "c", "d", "e", "f"});
            case 3:
                return new ntz();
            case 4:
                return new nxl(f44599g);
            case 5:
                return f44599g;
            case 6:
                nzd nxmVar = f44600i;
                if (nxmVar == null) {
                    synchronized (ntz.class) {
                        nxmVar = f44600i;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44599g);
                            f44600i = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
