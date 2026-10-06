package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mfj extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final mfj f40337c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f40338d;

    /* JADX INFO: renamed from: a */
    public int f40339a;

    /* JADX INFO: renamed from: b */
    public mfk f40340b;

    static {
        mfj mfjVar = new mfj();
        f40337c = mfjVar;
        nxq.m18130aa(mfj.class, mfjVar);
    }

    private mfj() {
        nwr nwrVar = nwr.f44839b;
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
                return m18129X(f40337c, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဉ\u0002", new Object[]{"a", "b"});
            case 3:
                return new mfj();
            case 4:
                return new nxl(f40337c);
            case 5:
                return f40337c;
            case 6:
                nzd nxmVar = f40338d;
                if (nxmVar == null) {
                    synchronized (mfj.class) {
                        nxmVar = f40338d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f40337c);
                            f40338d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
