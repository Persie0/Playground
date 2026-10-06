package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mfk extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final mfk f40341e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f40342f;

    /* JADX INFO: renamed from: a */
    public int f40343a;

    /* JADX INFO: renamed from: b */
    public int f40344b;

    /* JADX INFO: renamed from: c */
    public long f40345c;

    /* JADX INFO: renamed from: d */
    public long f40346d;

    static {
        mfk mfkVar = new mfk();
        f40341e = mfkVar;
        nxq.m18130aa(mfk.class, mfkVar);
    }

    private mfk() {
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
                return m18129X(f40341e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new mfk();
            case 4:
                return new nxl(f40341e);
            case 5:
                return f40341e;
            case 6:
                nzd nxmVar = f40342f;
                if (nxmVar == null) {
                    synchronized (mfk.class) {
                        nxmVar = f40342f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f40341e);
                            f40342f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
