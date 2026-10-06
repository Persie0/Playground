package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nsr extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final nsr f44429d;

    /* JADX INFO: renamed from: h */
    private static volatile nzd f44430h;

    /* JADX INFO: renamed from: a */
    public int f44431a;

    /* JADX INFO: renamed from: b */
    public nsu f44432b;

    /* JADX INFO: renamed from: c */
    public float f44433c;

    /* JADX INFO: renamed from: e */
    private int f44434e;

    /* JADX INFO: renamed from: f */
    private occ f44435f;

    /* JADX INFO: renamed from: g */
    private byte f44436g = 2;

    static {
        nsr nsrVar = new nsr();
        f44429d = nsrVar;
        nxq.m18130aa(nsr.class, nsrVar);
    }

    private nsr() {
        nzg nzgVar = nzg.f45063b;
        nxj nxjVar = nxj.f44968b;
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f44436g);
            case 1:
            default:
                this.f44436g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f44429d, "\u0001\u0004\u0000\u0001\u0001\n\u0004\u0000\u0000\u0001\u0001င\u0000\u0002ဉ\u0001\u0005ခ\u0004\nᐉ\b", new Object[]{"e", "a", "b", "c", "f"});
            case 3:
                return new nsr();
            case 4:
                return new nxl(f44429d);
            case 5:
                return f44429d;
            case 6:
                nzd nxmVar = f44430h;
                if (nxmVar == null) {
                    synchronized (nsr.class) {
                        nxmVar = f44430h;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44429d);
                            f44430h = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
