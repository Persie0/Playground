package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nqt extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final nqt f44080e;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f44081g;

    /* JADX INFO: renamed from: a */
    public int f44082a;

    /* JADX INFO: renamed from: b */
    public int f44083b;

    /* JADX INFO: renamed from: c */
    public nqr f44084c;

    /* JADX INFO: renamed from: d */
    public nmq f44085d;

    /* JADX INFO: renamed from: f */
    private byte f44086f = 2;

    static {
        nqt nqtVar = new nqt();
        f44080e = nqtVar;
        nxq.m18130aa(nqt.class, nqtVar);
    }

    private nqt() {
        nwr nwrVar = nwr.f44839b;
        nzg nzgVar = nzg.f45063b;
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f44086f);
            case 1:
            default:
                this.f44086f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f44080e, "\u0001\u0003\u0000\u0001\u0002\f\u0003\u0000\u0000\u0001\u0002ဉ\u0004\u0003ᐉ\u0005\fဌ\u0000", new Object[]{"a", "c", "d", "b", nlu.f43682s});
            case 3:
                return new nqt();
            case 4:
                return new nxl(f44080e);
            case 5:
                return f44080e;
            case 6:
                nzd nxmVar = f44081g;
                if (nxmVar == null) {
                    synchronized (nqt.class) {
                        nxmVar = f44081g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44080e);
                            f44081g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
