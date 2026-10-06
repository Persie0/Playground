package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nik extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final nik f42718c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f42719d;

    /* JADX INFO: renamed from: a */
    public int f42720a;

    /* JADX INFO: renamed from: b */
    public long f42721b;

    static {
        nik nikVar = new nik();
        f42718c = nikVar;
        nxq.m18130aa(nik.class, nikVar);
    }

    private nik() {
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
                return m18129X(f42718c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new nik();
            case 4:
                return new nxl(f42718c);
            case 5:
                return f42718c;
            case 6:
                nzd nxmVar = f42719d;
                if (nxmVar == null) {
                    synchronized (nik.class) {
                        nxmVar = f42719d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42718c);
                            f42719d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
