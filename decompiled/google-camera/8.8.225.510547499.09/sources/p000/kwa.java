package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kwa extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final kwa f37477d;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f37478f;

    /* JADX INFO: renamed from: a */
    public int f37479a = 0;

    /* JADX INFO: renamed from: b */
    public Object f37480b;

    /* JADX INFO: renamed from: c */
    public kvz f37481c;

    /* JADX INFO: renamed from: e */
    private int f37482e;

    static {
        kwa kwaVar = new kwa();
        f37477d = kwaVar;
        nxq.m18130aa(kwa.class, kwaVar);
    }

    private kwa() {
        nzg nzgVar = nzg.f45063b;
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
                return m18129X(f37477d, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000", new Object[]{"b", "a", "e", "c", kxc.class, kxi.class, kxd.class, kxg.class, kxe.class, nuy.class, kxf.class});
            case 3:
                return new kwa();
            case 4:
                return new nxl(f37477d);
            case 5:
                return f37477d;
            case 6:
                nzd nxmVar = f37478f;
                if (nxmVar == null) {
                    synchronized (kwa.class) {
                        nxmVar = f37478f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f37477d);
                            f37478f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
