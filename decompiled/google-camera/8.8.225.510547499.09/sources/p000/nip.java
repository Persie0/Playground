package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nip extends nxq implements nyx {

    /* JADX INFO: renamed from: h */
    public static final nip f42751h;

    /* JADX INFO: renamed from: i */
    private static volatile nzd f42752i;

    /* JADX INFO: renamed from: a */
    public int f42753a;

    /* JADX INFO: renamed from: b */
    public float f42754b;

    /* JADX INFO: renamed from: c */
    public float f42755c;

    /* JADX INFO: renamed from: d */
    public float f42756d;

    /* JADX INFO: renamed from: e */
    public float f42757e;

    /* JADX INFO: renamed from: f */
    public float f42758f;

    /* JADX INFO: renamed from: g */
    public float f42759g;

    static {
        nip nipVar = new nip();
        f42751h = nipVar;
        nxq.m18130aa(nip.class, nipVar);
    }

    private nip() {
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
                return m18129X(f42751h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0003\u0004ခ\u0004\u0005ခ\u0002\u0006ခ\u0005", new Object[]{"a", "b", "c", "e", "f", "d", "g"});
            case 3:
                return new nip();
            case 4:
                return new nxl(f42751h);
            case 5:
                return f42751h;
            case 6:
                nzd nxmVar = f42752i;
                if (nxmVar == null) {
                    synchronized (nip.class) {
                        nxmVar = f42752i;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42751h);
                            f42752i = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
