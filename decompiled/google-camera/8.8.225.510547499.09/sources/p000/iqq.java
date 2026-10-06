package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iqq extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final iqq f31816b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f31817c;

    /* JADX INFO: renamed from: a */
    public float f31818a;

    static {
        iqq iqqVar = new iqq();
        f31816b = iqqVar;
        nxq.m18130aa(iqq.class, iqqVar);
    }

    private iqq() {
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
                return m18129X(f31816b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new Object[]{"a"});
            case 3:
                return new iqq();
            case 4:
                return new nxl(f31816b);
            case 5:
                return f31816b;
            case 6:
                nzd nxmVar = f31817c;
                if (nxmVar == null) {
                    synchronized (iqq.class) {
                        nxmVar = f31817c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f31816b);
                            f31817c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
