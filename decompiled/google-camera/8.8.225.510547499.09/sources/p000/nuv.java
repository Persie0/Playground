package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nuv extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final nuv f44700d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f44701e;

    /* JADX INFO: renamed from: a */
    public int f44702a;

    /* JADX INFO: renamed from: b */
    public nxd f44703b;

    /* JADX INFO: renamed from: c */
    public nzw f44704c;

    static {
        nuv nuvVar = new nuv();
        f44700d = nuvVar;
        nxq.m18130aa(nuv.class, nuvVar);
    }

    private nuv() {
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
                return m18129X(f44700d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new nuv();
            case 4:
                return new nxl(f44700d);
            case 5:
                return f44700d;
            case 6:
                nzd nxmVar = f44701e;
                if (nxmVar == null) {
                    synchronized (nuv.class) {
                        nxmVar = f44701e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44700d);
                            f44701e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
