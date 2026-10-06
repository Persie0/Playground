package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class mqk extends nxq implements nyx {

    /* JADX INFO: renamed from: s */
    public static final mqk f41385s;

    /* JADX INFO: renamed from: t */
    private static volatile nzd f41386t;

    /* JADX INFO: renamed from: a */
    public int f41387a;

    /* JADX INFO: renamed from: b */
    public boolean f41388b;

    /* JADX INFO: renamed from: c */
    public int f41389c;

    /* JADX INFO: renamed from: d */
    public int f41390d;

    /* JADX INFO: renamed from: e */
    public boolean f41391e;

    /* JADX INFO: renamed from: f */
    public nxv f41392f = nxj.f44968b;

    /* JADX INFO: renamed from: g */
    public float f41393g;

    /* JADX INFO: renamed from: h */
    public int f41394h;

    /* JADX INFO: renamed from: i */
    public int f41395i;

    /* JADX INFO: renamed from: j */
    public float f41396j;

    /* JADX INFO: renamed from: k */
    public int f41397k;

    /* JADX INFO: renamed from: l */
    public int f41398l;

    /* JADX INFO: renamed from: m */
    public int f41399m;

    /* JADX INFO: renamed from: n */
    public int f41400n;

    /* JADX INFO: renamed from: o */
    public int f41401o;

    /* JADX INFO: renamed from: p */
    public int f41402p;

    /* JADX INFO: renamed from: q */
    public int f41403q;

    /* JADX INFO: renamed from: r */
    public int f41404r;

    static {
        mqk mqkVar = new mqk();
        f41385s = mqkVar;
        nxq.m18130aa(mqk.class, mqkVar);
    }

    private mqk() {
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
                return m18129X(f41385s, "\u0000\u0012\u0000\u0000\u0001\u0012\u0012\u0000\u0001\u0000\u0001\u000f\u0002\u0007\u0003\u000b\u0004\f\u0005\u0007\u0006$\u0007\u0001\b\f\t\f\n\u0001\u000b\u000f\f\u000f\r\u000f\u000e\u000f\u000f\u000f\u0010\u000f\u0011\u000f\u0012\u000f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r"});
            case 3:
                return new mqk();
            case 4:
                return new nxl(f41385s);
            case 5:
                return f41385s;
            case 6:
                nzd nxmVar = f41386t;
                if (nxmVar == null) {
                    synchronized (mqk.class) {
                        nxmVar = f41386t;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f41385s);
                            f41386t = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
