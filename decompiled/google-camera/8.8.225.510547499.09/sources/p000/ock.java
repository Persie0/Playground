package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ock extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final ock f45476a;

    /* JADX INFO: renamed from: b */
    private static volatile nzd f45477b;

    static {
        ock ockVar = new ock();
        f45476a = ockVar;
        nxq.m18130aa(ock.class, ockVar);
    }

    private ock() {
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
                return m18129X(f45476a, "\u0001\u0000", null);
            case 3:
                return new ock();
            case 4:
                return new nxl(f45476a);
            case 5:
                return f45476a;
            case 6:
                nzd nxmVar = f45477b;
                if (nxmVar == null) {
                    synchronized (ock.class) {
                        nxmVar = f45477b;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45476a);
                            f45477b = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
