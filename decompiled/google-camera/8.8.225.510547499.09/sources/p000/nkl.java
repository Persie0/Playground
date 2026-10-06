package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nkl extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final nkl f43222f;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f43223g;

    /* JADX INFO: renamed from: a */
    public int f43224a;

    /* JADX INFO: renamed from: b */
    public int f43225b;

    /* JADX INFO: renamed from: c */
    public String f43226c = "";

    /* JADX INFO: renamed from: d */
    public float f43227d;

    /* JADX INFO: renamed from: e */
    public float f43228e;

    static {
        nkl nklVar = new nkl();
        f43222f = nklVar;
        nxq.m18130aa(nkl.class, nklVar);
    }

    private nkl() {
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
                return m18129X(f43222f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0004ဈ\u0003\u0005ခ\u0004\u0006ခ\u0005", new Object[]{"a", "b", njy.f43124n, "c", "d", "e"});
            case 3:
                return new nkl();
            case 4:
                return new nxl(f43222f);
            case 5:
                return f43222f;
            case 6:
                nzd nxmVar = f43223g;
                if (nxmVar == null) {
                    synchronized (nkl.class) {
                        nxmVar = f43223g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43222f);
                            f43223g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
