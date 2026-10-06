package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nmp extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final nmp f43867e;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f43868g;

    /* JADX INFO: renamed from: a */
    public int f43869a;

    /* JADX INFO: renamed from: b */
    public long f43870b;

    /* JADX INFO: renamed from: c */
    public int f43871c;

    /* JADX INFO: renamed from: d */
    public int f43872d;

    /* JADX INFO: renamed from: f */
    private byte f43873f = 2;

    static {
        nmp nmpVar = new nmp();
        f43867e = nmpVar;
        nxq.m18130aa(nmp.class, nmpVar);
    }

    private nmp() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f43873f);
            case 1:
            default:
                this.f43873f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f43867e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔂ\u0000\u0002ᔆ\u0001\u0003ᔆ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new nmp();
            case 4:
                return new nxl(f43867e);
            case 5:
                return f43867e;
            case 6:
                nzd nxmVar = f43868g;
                if (nxmVar == null) {
                    synchronized (nmp.class) {
                        nxmVar = f43868g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43867e);
                            f43868g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
