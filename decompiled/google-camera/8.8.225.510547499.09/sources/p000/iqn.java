package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iqn extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final iqn f31805b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f31806c;

    /* JADX INFO: renamed from: a */
    public int f31807a;

    static {
        iqn iqnVar = new iqn();
        f31805b = iqnVar;
        nxq.m18130aa(iqn.class, iqnVar);
    }

    private iqn() {
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
                return m18129X(f31805b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
            case 3:
                return new iqn();
            case 4:
                return new nxl(f31805b);
            case 5:
                return f31805b;
            case 6:
                nzd nxmVar = f31806c;
                if (nxmVar == null) {
                    synchronized (iqn.class) {
                        nxmVar = f31806c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f31805b);
                            f31806c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
