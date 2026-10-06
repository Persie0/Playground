package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nim extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final nim f42730e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f42731f;

    /* JADX INFO: renamed from: a */
    public int f42732a;

    /* JADX INFO: renamed from: b */
    public int f42733b;

    /* JADX INFO: renamed from: c */
    public boolean f42734c;

    /* JADX INFO: renamed from: d */
    public int f42735d;

    static {
        nim nimVar = new nim();
        f42730e = nimVar;
        nxq.m18130aa(nim.class, nimVar);
    }

    private nim() {
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
                return m18129X(f42730e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003င\u0002", new Object[]{"a", "b", nhr.f42529r, "c", "d"});
            case 3:
                return new nim();
            case 4:
                return new nxl(f42730e);
            case 5:
                return f42730e;
            case 6:
                nzd nxmVar = f42731f;
                if (nxmVar == null) {
                    synchronized (nim.class) {
                        nxmVar = f42731f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42730e);
                            f42731f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
