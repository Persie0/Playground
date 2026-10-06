package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nij extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final nij f42712e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f42713f;

    /* JADX INFO: renamed from: a */
    public int f42714a;

    /* JADX INFO: renamed from: b */
    public int f42715b;

    /* JADX INFO: renamed from: c */
    public float f42716c;

    /* JADX INFO: renamed from: d */
    public int f42717d;

    static {
        nij nijVar = new nij();
        f42712e = nijVar;
        nxq.m18130aa(nij.class, nijVar);
    }

    private nij() {
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
                return m18129X(f42712e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ခ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", nks.f43295c, "c", "d", nks.f43293a});
            case 3:
                return new nij();
            case 4:
                return new nxl(f42712e);
            case 5:
                return f42712e;
            case 6:
                nzd nxmVar = f42713f;
                if (nxmVar == null) {
                    synchronized (nij.class) {
                        nxmVar = f42713f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42712e);
                            f42713f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
