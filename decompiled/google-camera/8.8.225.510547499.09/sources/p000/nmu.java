package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nmu extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final nmu f43903e;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f43904g;

    /* JADX INFO: renamed from: a */
    public int f43905a;

    /* JADX INFO: renamed from: b */
    public nms f43906b;

    /* JADX INFO: renamed from: c */
    public int f43907c;

    /* JADX INFO: renamed from: f */
    private byte f43909f = 2;

    /* JADX INFO: renamed from: d */
    public nxw f43908d = nxr.f44982b;

    static {
        nmu nmuVar = new nmu();
        f43903e = nmuVar;
        nxq.m18130aa(nmu.class, nmuVar);
    }

    private nmu() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f43909f);
            case 1:
            default:
                this.f43909f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f43903e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ᐉ\u0000\u0002င\u0001\u0003'", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new nmu();
            case 4:
                return new nxl(f43903e);
            case 5:
                return f43903e;
            case 6:
                nzd nxmVar = f43904g;
                if (nxmVar == null) {
                    synchronized (nmu.class) {
                        nxmVar = f43904g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43903e);
                            f43904g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
