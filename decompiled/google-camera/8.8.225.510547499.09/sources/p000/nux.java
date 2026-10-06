package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nux extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final nux f44710e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f44711f;

    /* JADX INFO: renamed from: a */
    public int f44712a;

    /* JADX INFO: renamed from: b */
    public boolean f44713b;

    /* JADX INFO: renamed from: c */
    public nuv f44714c;

    /* JADX INFO: renamed from: d */
    public nuw f44715d;

    static {
        nux nuxVar = new nux();
        f44710e = nuxVar;
        nxq.m18130aa(nux.class, nuxVar);
    }

    private nux() {
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
                return m18129X(f44710e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new nux();
            case 4:
                return new nxl(f44710e);
            case 5:
                return f44710e;
            case 6:
                nzd nxmVar = f44711f;
                if (nxmVar == null) {
                    synchronized (nux.class) {
                        nxmVar = f44711f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44710e);
                            f44711f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
