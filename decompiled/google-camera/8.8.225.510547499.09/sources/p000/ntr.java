package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ntr extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final ntr f44528d;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f44529f;

    /* JADX INFO: renamed from: a */
    public float f44530a = -1.0f;

    /* JADX INFO: renamed from: b */
    public nxv f44531b;

    /* JADX INFO: renamed from: c */
    public nxv f44532c;

    /* JADX INFO: renamed from: e */
    private int f44533e;

    static {
        ntr ntrVar = new ntr();
        f44528d = ntrVar;
        nxq.m18130aa(ntr.class, ntrVar);
    }

    private ntr() {
        nxj nxjVar = nxj.f44968b;
        this.f44531b = nxjVar;
        this.f44532c = nxjVar;
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
                return m18129X(f44528d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ခ\u0000\u0002$\u0003$", new Object[]{"e", "a", "b", "c"});
            case 3:
                return new ntr();
            case 4:
                return new nxl(f44528d);
            case 5:
                return f44528d;
            case 6:
                nzd nxmVar = f44529f;
                if (nxmVar == null) {
                    synchronized (ntr.class) {
                        nxmVar = f44529f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44528d);
                            f44529f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
