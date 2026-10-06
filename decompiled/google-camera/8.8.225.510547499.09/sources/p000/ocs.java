package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ocs extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final ocs f45521e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f45522f;

    /* JADX INFO: renamed from: a */
    public int f45523a;

    /* JADX INFO: renamed from: b */
    public int f45524b;

    /* JADX INFO: renamed from: c */
    public long f45525c;

    /* JADX INFO: renamed from: d */
    public long f45526d;

    static {
        ocs ocsVar = new ocs();
        f45521e = ocsVar;
        nxq.m18130aa(ocs.class, ocsVar);
    }

    private ocs() {
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
                return m18129X(f45521e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new ocs();
            case 4:
                return new nxl(f45521e);
            case 5:
                return f45521e;
            case 6:
                nzd nxmVar = f45522f;
                if (nxmVar == null) {
                    synchronized (ocs.class) {
                        nxmVar = f45522f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45521e);
                            f45522f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
