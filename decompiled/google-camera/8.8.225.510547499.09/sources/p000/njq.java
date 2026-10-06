package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class njq extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final njq f43060d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f43061e;

    /* JADX INFO: renamed from: a */
    public int f43062a;

    /* JADX INFO: renamed from: b */
    public float f43063b;

    /* JADX INFO: renamed from: c */
    public float f43064c;

    static {
        njq njqVar = new njq();
        f43060d = njqVar;
        nxq.m18130aa(njq.class, njqVar);
    }

    private njq() {
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
                return m18129X(f43060d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new njq();
            case 4:
                return new nxl(f43060d);
            case 5:
                return f43060d;
            case 6:
                nzd nxmVar = f43061e;
                if (nxmVar == null) {
                    synchronized (njq.class) {
                        nxmVar = f43061e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43060d);
                            f43061e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
