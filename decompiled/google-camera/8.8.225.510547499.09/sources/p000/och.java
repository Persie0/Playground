package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class och extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final och f45462e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f45463f;

    /* JADX INFO: renamed from: a */
    public nxv f45464a;

    /* JADX INFO: renamed from: b */
    public nxv f45465b;

    /* JADX INFO: renamed from: c */
    public nxv f45466c;

    /* JADX INFO: renamed from: d */
    public nxv f45467d;

    static {
        och ochVar = new och();
        f45462e = ochVar;
        nxq.m18130aa(och.class, ochVar);
    }

    private och() {
        nxj nxjVar = nxj.f44968b;
        this.f45464a = nxjVar;
        this.f45465b = nxjVar;
        this.f45466c = nxjVar;
        this.f45467d = nxjVar;
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
                return m18129X(f45462e, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0013\u0002\u0013\u0003\u0013\u0004\u0013", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new och();
            case 4:
                return new nxl(f45462e);
            case 5:
                return f45462e;
            case 6:
                nzd nxmVar = f45463f;
                if (nxmVar == null) {
                    synchronized (och.class) {
                        nxmVar = f45463f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45462e);
                            f45463f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
