package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kxi extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final kxi f37644e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f37645f;

    /* JADX INFO: renamed from: b */
    public int f37647b;

    /* JADX INFO: renamed from: d */
    public boolean f37649d;

    /* JADX INFO: renamed from: a */
    public String f37646a = "";

    /* JADX INFO: renamed from: c */
    public String f37648c = "";

    static {
        kxi kxiVar = new kxi();
        f37644e = kxiVar;
        nxq.m18130aa(kxi.class, kxiVar);
    }

    private kxi() {
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
                return m18129X(f37644e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ\u0004\u0007", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new kxi();
            case 4:
                return new nxl(f37644e);
            case 5:
                return f37644e;
            case 6:
                nzd nxmVar = f37645f;
                if (nxmVar == null) {
                    synchronized (kxi.class) {
                        nxmVar = f37645f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f37644e);
                            f37645f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
