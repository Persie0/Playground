package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nir extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final nir f42764c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f42765d;

    /* JADX INFO: renamed from: a */
    public int f42766a;

    /* JADX INFO: renamed from: b */
    public int f42767b;

    static {
        nir nirVar = new nir();
        f42764c = nirVar;
        nxq.m18130aa(nir.class, nirVar);
    }

    private nir() {
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
                return m18129X(f42764c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", nhr.f42532u});
            case 3:
                return new nir();
            case 4:
                return new nxl(f42764c);
            case 5:
                return f42764c;
            case 6:
                nzd nxmVar = f42765d;
                if (nxmVar == null) {
                    synchronized (nir.class) {
                        nxmVar = f42765d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42764c);
                            f42765d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
