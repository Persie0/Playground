package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nhd extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final nhd f42290d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f42291e;

    /* JADX INFO: renamed from: a */
    public int f42292a;

    /* JADX INFO: renamed from: b */
    public boolean f42293b;

    /* JADX INFO: renamed from: c */
    public long f42294c;

    static {
        nhd nhdVar = new nhd();
        f42290d = nhdVar;
        nxq.m18130aa(nhd.class, nhdVar);
    }

    private nhd() {
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
                return m18129X(f42290d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new nhd();
            case 4:
                return new nxl(f42290d);
            case 5:
                return f42290d;
            case 6:
                nzd nxmVar = f42291e;
                if (nxmVar == null) {
                    synchronized (nhd.class) {
                        nxmVar = f42291e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42290d);
                            f42291e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
