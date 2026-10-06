package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nla extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final nla f43436d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f43437e;

    /* JADX INFO: renamed from: a */
    public int f43438a;

    /* JADX INFO: renamed from: b */
    public boolean f43439b;

    /* JADX INFO: renamed from: c */
    public long f43440c;

    static {
        nla nlaVar = new nla();
        f43436d = nlaVar;
        nxq.m18130aa(nla.class, nlaVar);
    }

    private nla() {
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
                return m18129X(f43436d, "\u0001\u0002\u0000\u0001\t\n\u0002\u0000\u0000\u0000\tဇ\u0001\nဂ\u0002", new Object[]{"a", "b", "c"});
            case 3:
                return new nla();
            case 4:
                return new nxl(f43436d);
            case 5:
                return f43436d;
            case 6:
                nzd nxmVar = f43437e;
                if (nxmVar == null) {
                    synchronized (nla.class) {
                        nxmVar = f43437e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43436d);
                            f43437e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
