package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class obp extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final obp f45346c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f45347d;

    /* JADX INFO: renamed from: a */
    public int f45348a;

    /* JADX INFO: renamed from: b */
    public obk f45349b;

    static {
        obp obpVar = new obp();
        f45346c = obpVar;
        nxq.m18130aa(obp.class, obpVar);
    }

    private obp() {
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
                return m18129X(f45346c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new obp();
            case 4:
                return new nxl(f45346c);
            case 5:
                return f45346c;
            case 6:
                nzd nxmVar = f45347d;
                if (nxmVar == null) {
                    synchronized (obp.class) {
                        nxmVar = f45347d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45346c);
                            f45347d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
