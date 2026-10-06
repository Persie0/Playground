package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nqs extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final nqs f44076c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f44077d;

    /* JADX INFO: renamed from: a */
    public int f44078a;

    /* JADX INFO: renamed from: b */
    public String f44079b = "";

    static {
        nqs nqsVar = new nqs();
        f44076c = nqsVar;
        nxq.m18130aa(nqs.class, nqsVar);
    }

    private nqs() {
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
                return m18129X(f44076c, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဈ\u0001", new Object[]{"a", "b"});
            case 3:
                return new nqs();
            case 4:
                return new nxl(f44076c);
            case 5:
                return f44076c;
            case 6:
                nzd nxmVar = f44077d;
                if (nxmVar == null) {
                    synchronized (nqs.class) {
                        nxmVar = f44077d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44076c);
                            f44077d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
