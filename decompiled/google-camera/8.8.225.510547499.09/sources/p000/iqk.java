package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iqk extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final iqk f31795b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f31796c;

    /* JADX INFO: renamed from: a */
    public int f31797a;

    static {
        iqk iqkVar = new iqk();
        f31795b = iqkVar;
        nxq.m18130aa(iqk.class, iqkVar);
    }

    private iqk() {
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
                return m18129X(f31795b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
            case 3:
                return new iqk();
            case 4:
                return new nxl(f31795b);
            case 5:
                return f31795b;
            case 6:
                nzd nxmVar = f31796c;
                if (nxmVar == null) {
                    synchronized (iqk.class) {
                        nxmVar = f31796c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f31795b);
                            f31796c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
