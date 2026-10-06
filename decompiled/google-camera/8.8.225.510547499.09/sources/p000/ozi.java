package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ozi extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final ozi f46953e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f46954f;

    /* JADX INFO: renamed from: a */
    public int f46955a;

    /* JADX INFO: renamed from: b */
    public int f46956b;

    /* JADX INFO: renamed from: c */
    public long f46957c;

    /* JADX INFO: renamed from: d */
    public ozd f46958d;

    static {
        ozi oziVar = new ozi();
        f46953e = oziVar;
        nxq.m18130aa(ozi.class, oziVar);
    }

    private ozi() {
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
                return m18129X(f46953e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new ozi();
            case 4:
                return new nxl(f46953e);
            case 5:
                return f46953e;
            case 6:
                nzd nxmVar = f46954f;
                if (nxmVar == null) {
                    synchronized (ozi.class) {
                        nxmVar = f46954f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f46953e);
                            f46954f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
