package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mff extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final mff f40317d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f40318e;

    /* JADX INFO: renamed from: a */
    public int f40319a;

    /* JADX INFO: renamed from: b */
    public nxw f40320b = nxr.f44982b;

    /* JADX INFO: renamed from: c */
    public int f40321c = 1;

    static {
        mff mffVar = new mff();
        f40317d = mffVar;
        nxq.m18130aa(mff.class, mffVar);
    }

    private mff() {
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
                return m18129X(f40317d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0000\u0001\u001e\u0004ဌ\u0002", new Object[]{"a", "b", kva.f37295i, "c", kva.f37296j});
            case 3:
                return new mff();
            case 4:
                return new nxl(f40317d);
            case 5:
                return f40317d;
            case 6:
                nzd nxmVar = f40318e;
                if (nxmVar == null) {
                    synchronized (mff.class) {
                        nxmVar = f40318e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f40317d);
                            f40318e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
