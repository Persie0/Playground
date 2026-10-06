package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jks extends nxq implements nyx {

    /* JADX INFO: renamed from: n */
    public static final jks f34256n;

    /* JADX INFO: renamed from: o */
    private static volatile nzd f34257o;

    /* JADX INFO: renamed from: a */
    public int f34258a;

    /* JADX INFO: renamed from: b */
    public int f34259b;

    /* JADX INFO: renamed from: g */
    public int f34264g;

    /* JADX INFO: renamed from: i */
    public int f34266i;

    /* JADX INFO: renamed from: k */
    public int f34268k;

    /* JADX INFO: renamed from: l */
    public int f34269l;

    /* JADX INFO: renamed from: m */
    public boolean f34270m;

    /* JADX INFO: renamed from: c */
    public String f34260c = "";

    /* JADX INFO: renamed from: d */
    public String f34261d = "";

    /* JADX INFO: renamed from: e */
    public String f34262e = "";

    /* JADX INFO: renamed from: f */
    public String f34263f = "";

    /* JADX INFO: renamed from: h */
    public long f34265h = -1;

    /* JADX INFO: renamed from: j */
    public String f34267j = "";

    static {
        jks jksVar = new jks();
        f34256n = jksVar;
        nxq.m18130aa(jks.class, jksVar);
    }

    private jks() {
        nzg nzgVar = nzg.f45063b;
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
                return m18129X(f34256n, "\u0001\u000b\u0000\u0002\u0002$\u000b\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဈ\u0006\u0013ဂ\u0018\u0017င\u001e\u0019ဌ\b ဈ!!ဈ\u0004\"င\"#င#$ဇ$", new Object[]{"a", "b", "c", "d", "f", "h", "i", "g", oau.f45200o, "j", "e", "k", "l", "m"});
            case 3:
                return new jks();
            case 4:
                return new nxl(f34256n);
            case 5:
                return f34256n;
            case 6:
                nzd nxmVar = f34257o;
                if (nxmVar == null) {
                    synchronized (jks.class) {
                        nxmVar = f34257o;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f34256n);
                            f34257o = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
