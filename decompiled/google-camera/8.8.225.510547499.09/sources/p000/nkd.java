package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nkd extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final nkd f43176e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f43177f;

    /* JADX INFO: renamed from: a */
    public int f43178a;

    /* JADX INFO: renamed from: b */
    public int f43179b;

    /* JADX INFO: renamed from: c */
    public int f43180c;

    /* JADX INFO: renamed from: d */
    public njq f43181d;

    static {
        nkd nkdVar = new nkd();
        f43176e = nkdVar;
        nxq.m18130aa(nkd.class, nkdVar);
    }

    private nkd() {
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
                return m18129X(f43176e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", njy.f43120j, "c", njy.f43119i, "d"});
            case 3:
                return new nkd();
            case 4:
                return new nxl(f43176e);
            case 5:
                return f43176e;
            case 6:
                nzd nxmVar = f43177f;
                if (nxmVar == null) {
                    synchronized (nkd.class) {
                        nxmVar = f43177f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43176e);
                            f43177f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
