package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nji extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final nji f42924d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f42925e;

    /* JADX INFO: renamed from: a */
    public int f42926a;

    /* JADX INFO: renamed from: b */
    public boolean f42927b;

    /* JADX INFO: renamed from: c */
    public boolean f42928c;

    static {
        nji njiVar = new nji();
        f42924d = njiVar;
        nxq.m18130aa(nji.class, njiVar);
    }

    private nji() {
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
                return m18129X(f42924d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new nji();
            case 4:
                return new nxl(f42924d);
            case 5:
                return f42924d;
            case 6:
                nzd nxmVar = f42925e;
                if (nxmVar == null) {
                    synchronized (nji.class) {
                        nxmVar = f42925e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42924d);
                            f42925e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
