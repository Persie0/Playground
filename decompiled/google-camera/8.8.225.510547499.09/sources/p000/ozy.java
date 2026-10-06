package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ozy extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final ozy f47122e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f47123f;

    /* JADX INFO: renamed from: a */
    public int f47124a;

    /* JADX INFO: renamed from: b */
    public long f47125b;

    /* JADX INFO: renamed from: c */
    public boolean f47126c;

    /* JADX INFO: renamed from: d */
    public int f47127d;

    static {
        ozy ozyVar = new ozy();
        f47122e = ozyVar;
        nxq.m18130aa(ozy.class, ozyVar);
    }

    private ozy() {
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
                return m18129X(f47122e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003င\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new ozy();
            case 4:
                return new nxl(f47122e);
            case 5:
                return f47122e;
            case 6:
                nzd nxmVar = f47123f;
                if (nxmVar == null) {
                    synchronized (ozy.class) {
                        nxmVar = f47123f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47122e);
                            f47123f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
