package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nhc extends nxq implements nyx {

    /* JADX INFO: renamed from: h */
    public static final nhc f42281h;

    /* JADX INFO: renamed from: i */
    private static volatile nzd f42282i;

    /* JADX INFO: renamed from: a */
    public int f42283a;

    /* JADX INFO: renamed from: b */
    public int f42284b;

    /* JADX INFO: renamed from: c */
    public int f42285c;

    /* JADX INFO: renamed from: d */
    public int f42286d;

    /* JADX INFO: renamed from: e */
    public long f42287e;

    /* JADX INFO: renamed from: f */
    public long f42288f;

    /* JADX INFO: renamed from: g */
    public long f42289g;

    static {
        nhc nhcVar = new nhc();
        f42281h = nhcVar;
        nxq.m18130aa(nhc.class, nhcVar);
    }

    private nhc() {
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
                return m18129X(f42281h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003င\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"a", "b", kva.f37299m, "c", "d", "e", "f", "g"});
            case 3:
                return new nhc();
            case 4:
                return new nxl(f42281h);
            case 5:
                return f42281h;
            case 6:
                nzd nxmVar = f42282i;
                if (nxmVar == null) {
                    synchronized (nhc.class) {
                        nxmVar = f42282i;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42281h);
                            f42282i = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
