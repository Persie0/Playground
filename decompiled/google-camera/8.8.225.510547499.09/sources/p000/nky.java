package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nky extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final nky f43423e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f43424f;

    /* JADX INFO: renamed from: a */
    public int f43425a;

    /* JADX INFO: renamed from: b */
    public int f43426b;

    /* JADX INFO: renamed from: c */
    public int f43427c;

    /* JADX INFO: renamed from: d */
    public int f43428d;

    static {
        nky nkyVar = new nky();
        f43423e = nkyVar;
        nxq.m18130aa(nky.class, nkyVar);
    }

    private nky() {
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
                return m18129X(f43423e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဌ\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"a", "b", nkw.f43339a, "c", nks.f43299g, "d", nks.f43298f});
            case 3:
                return new nky();
            case 4:
                return new nxl(f43423e);
            case 5:
                return f43423e;
            case 6:
                nzd nxmVar = f43424f;
                if (nxmVar == null) {
                    synchronized (nky.class) {
                        nxmVar = f43424f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43423e);
                            f43424f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
