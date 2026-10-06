package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class niz extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final niz f42849e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f42850f;

    /* JADX INFO: renamed from: a */
    public int f42851a;

    /* JADX INFO: renamed from: b */
    public int f42852b;

    /* JADX INFO: renamed from: c */
    public int f42853c;

    /* JADX INFO: renamed from: d */
    public int f42854d;

    static {
        niz nizVar = new niz();
        f42849e = nizVar;
        nxq.m18130aa(niz.class, nizVar);
    }

    private niz() {
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
                return m18129X(f42849e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", niy.f42829c, "d", niy.f42827a});
            case 3:
                return new niz();
            case 4:
                return new nxl(f42849e);
            case 5:
                return f42849e;
            case 6:
                nzd nxmVar = f42850f;
                if (nxmVar == null) {
                    synchronized (niz.class) {
                        nxmVar = f42850f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42849e);
                            f42850f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
