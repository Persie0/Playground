package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class obo extends nxq implements nyx {

    /* JADX INFO: renamed from: g */
    public static final obo f45338g;

    /* JADX INFO: renamed from: h */
    private static volatile nzd f45339h;

    /* JADX INFO: renamed from: a */
    public int f45340a;

    /* JADX INFO: renamed from: b */
    public long f45341b;

    /* JADX INFO: renamed from: c */
    public long f45342c;

    /* JADX INFO: renamed from: d */
    public float f45343d;

    /* JADX INFO: renamed from: e */
    public nxv f45344e;

    /* JADX INFO: renamed from: f */
    public nxv f45345f;

    static {
        obo oboVar = new obo();
        f45338g = oboVar;
        nxq.m18130aa(obo.class, oboVar);
    }

    private obo() {
        nxj nxjVar = nxj.f44968b;
        this.f45344e = nxjVar;
        this.f45345f = nxjVar;
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
                return m18129X(f45338g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ခ\u0002\u0004$\u0005$", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new obo();
            case 4:
                return new nxl(f45338g);
            case 5:
                return f45338g;
            case 6:
                nzd nxmVar = f45339h;
                if (nxmVar == null) {
                    synchronized (obo.class) {
                        nxmVar = f45339h;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45338g);
                            f45339h = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
