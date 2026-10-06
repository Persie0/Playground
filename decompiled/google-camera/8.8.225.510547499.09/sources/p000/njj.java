package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class njj extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final njj f42929c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f42930d;

    /* JADX INFO: renamed from: a */
    public int f42931a;

    /* JADX INFO: renamed from: b */
    public boolean f42932b;

    static {
        njj njjVar = new njj();
        f42929c = njjVar;
        nxq.m18130aa(njj.class, njjVar);
    }

    private njj() {
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
                return m18129X(f42929c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new njj();
            case 4:
                return new nxl(f42929c);
            case 5:
                return f42929c;
            case 6:
                nzd nxmVar = f42930d;
                if (nxmVar == null) {
                    synchronized (njj.class) {
                        nxmVar = f42930d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42929c);
                            f42930d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
