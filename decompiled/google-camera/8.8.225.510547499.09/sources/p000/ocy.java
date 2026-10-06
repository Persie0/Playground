package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ocy extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final ocy f45565b;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f45566d;

    /* JADX INFO: renamed from: a */
    public long f45567a;

    /* JADX INFO: renamed from: c */
    private int f45568c;

    static {
        ocy ocyVar = new ocy();
        f45565b = ocyVar;
        nxq.m18130aa(ocy.class, ocyVar);
    }

    private ocy() {
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
                return m18129X(f45565b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဃ\u0001", new Object[]{"c", "a"});
            case 3:
                return new ocy();
            case 4:
                return new nxl(f45565b);
            case 5:
                return f45565b;
            case 6:
                nzd nxmVar = f45566d;
                if (nxmVar == null) {
                    synchronized (ocy.class) {
                        nxmVar = f45566d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45565b);
                            f45566d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
