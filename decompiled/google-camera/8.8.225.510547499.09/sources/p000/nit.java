package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nit extends nxq implements nyx {

    /* JADX INFO: renamed from: p */
    public static final nit f42775p;

    /* JADX INFO: renamed from: q */
    private static volatile nzd f42776q;

    /* JADX INFO: renamed from: a */
    public int f42777a;

    /* JADX INFO: renamed from: b */
    public String f42778b = "";

    /* JADX INFO: renamed from: c */
    public String f42779c = "";

    /* JADX INFO: renamed from: d */
    public float f42780d;

    /* JADX INFO: renamed from: e */
    public int f42781e;

    /* JADX INFO: renamed from: f */
    public float f42782f;

    /* JADX INFO: renamed from: g */
    public float f42783g;

    /* JADX INFO: renamed from: h */
    public boolean f42784h;

    /* JADX INFO: renamed from: i */
    public int f42785i;

    /* JADX INFO: renamed from: j */
    public int f42786j;

    /* JADX INFO: renamed from: k */
    public int f42787k;

    /* JADX INFO: renamed from: l */
    public boolean f42788l;

    /* JADX INFO: renamed from: m */
    public int f42789m;

    /* JADX INFO: renamed from: n */
    public float f42790n;

    /* JADX INFO: renamed from: o */
    public float f42791o;

    static {
        nit nitVar = new nit();
        f42775p = nitVar;
        nxq.m18130aa(nit.class, nitVar);
    }

    private nit() {
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
                return m18129X(f42775p, "\u0001\u000e\u0000\u0001\u0001\u0010\u000e\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0004ခ\u0003\u0005င\u0004\u0006ခ\u0005\u0007ခ\u0006\tဇ\b\nင\t\u000bင\n\fင\u000b\rဇ\f\u000eင\r\u000fခ\u000e\u0010ခ\u000f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"});
            case 3:
                return new nit();
            case 4:
                return new nxl(f42775p);
            case 5:
                return f42775p;
            case 6:
                nzd nxmVar = f42776q;
                if (nxmVar == null) {
                    synchronized (nit.class) {
                        nxmVar = f42776q;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42775p);
                            f42776q = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
