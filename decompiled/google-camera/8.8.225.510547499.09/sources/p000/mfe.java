package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mfe extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final mfe f40311e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f40312f;

    /* JADX INFO: renamed from: a */
    public int f40313a;

    /* JADX INFO: renamed from: b */
    public int f40314b;

    /* JADX INFO: renamed from: c */
    public String f40315c = "";

    /* JADX INFO: renamed from: d */
    public nxy f40316d = nzg.f45063b;

    static {
        mfe mfeVar = new mfe();
        f40311e = mfeVar;
        nxq.m18130aa(mfe.class, mfeVar);
    }

    private mfe() {
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
                return m18129X(f40311e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"a", "b", kva.f37295i, "c", "d", mfd.class});
            case 3:
                return new mfe();
            case 4:
                return new nxl(f40311e);
            case 5:
                return f40311e;
            case 6:
                nzd nxmVar = f40312f;
                if (nxmVar == null) {
                    synchronized (mfe.class) {
                        nxmVar = f40312f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f40311e);
                            f40312f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
