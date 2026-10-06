package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class obt extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final obt f45368d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f45369e;

    /* JADX INFO: renamed from: a */
    public int f45370a;

    /* JADX INFO: renamed from: b */
    public float f45371b;

    /* JADX INFO: renamed from: c */
    public float f45372c;

    static {
        obt obtVar = new obt();
        f45368d = obtVar;
        nxq.m18130aa(obt.class, obtVar);
    }

    private obt() {
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
                return m18129X(f45368d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new obt();
            case 4:
                return new nxl(f45368d);
            case 5:
                return f45368d;
            case 6:
                nzd nxmVar = f45369e;
                if (nxmVar == null) {
                    synchronized (obt.class) {
                        nxmVar = f45369e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45368d);
                            f45369e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
