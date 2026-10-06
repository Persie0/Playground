package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class niq extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final niq f42760c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f42761d;

    /* JADX INFO: renamed from: a */
    public int f42762a;

    /* JADX INFO: renamed from: b */
    public int f42763b;

    static {
        niq niqVar = new niq();
        f42760c = niqVar;
        nxq.m18130aa(niq.class, niqVar);
    }

    private niq() {
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
                return m18129X(f42760c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new Object[]{"a", "b"});
            case 3:
                return new niq();
            case 4:
                return new nxl(f42760c);
            case 5:
                return f42760c;
            case 6:
                nzd nxmVar = f42761d;
                if (nxmVar == null) {
                    synchronized (niq.class) {
                        nxmVar = f42761d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42760c);
                            f42761d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
