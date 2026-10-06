package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nhw extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final nhw f42560d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f42561e;

    /* JADX INFO: renamed from: a */
    public int f42562a;

    /* JADX INFO: renamed from: b */
    public int f42563b;

    /* JADX INFO: renamed from: c */
    public String f42564c = "";

    static {
        nhw nhwVar = new nhw();
        f42560d = nhwVar;
        nxq.m18130aa(nhw.class, nhwVar);
    }

    private nhw() {
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
                return m18129X(f42560d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", nhr.f42517f, "c"});
            case 3:
                return new nhw();
            case 4:
                return new nxl(f42560d);
            case 5:
                return f42560d;
            case 6:
                nzd nxmVar = f42561e;
                if (nxmVar == null) {
                    synchronized (nhw.class) {
                        nxmVar = f42561e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42560d);
                            f42561e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
