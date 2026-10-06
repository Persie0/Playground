package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class obj extends nxq implements nyx {

    /* JADX INFO: renamed from: g */
    public static final obj f45302g;

    /* JADX INFO: renamed from: h */
    private static volatile nzd f45303h;

    /* JADX INFO: renamed from: a */
    public int f45304a;

    /* JADX INFO: renamed from: b */
    public long f45305b;

    /* JADX INFO: renamed from: c */
    public long f45306c;

    /* JADX INFO: renamed from: d */
    public boolean f45307d;

    /* JADX INFO: renamed from: e */
    public obp f45308e;

    /* JADX INFO: renamed from: f */
    public obm f45309f;

    static {
        obj objVar = new obj();
        f45302g = objVar;
        nxq.m18130aa(obj.class, objVar);
    }

    private obj() {
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
                return m18129X(f45302g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new obj();
            case 4:
                return new nxl(f45302g);
            case 5:
                return f45302g;
            case 6:
                nzd nxmVar = f45303h;
                if (nxmVar == null) {
                    synchronized (obj.class) {
                        nxmVar = f45303h;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45302g);
                            f45303h = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
