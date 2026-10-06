package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class obs extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final obs f45361f;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f45362g;

    /* JADX INFO: renamed from: a */
    public int f45363a;

    /* JADX INFO: renamed from: b */
    public float f45364b;

    /* JADX INFO: renamed from: c */
    public float f45365c;

    /* JADX INFO: renamed from: d */
    public float f45366d;

    /* JADX INFO: renamed from: e */
    public float f45367e;

    static {
        obs obsVar = new obs();
        f45361f = obsVar;
        nxq.m18130aa(obs.class, obsVar);
    }

    private obs() {
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
                return m18129X(f45361f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new obs();
            case 4:
                return new nxl(f45361f);
            case 5:
                return f45361f;
            case 6:
                nzd nxmVar = f45362g;
                if (nxmVar == null) {
                    synchronized (obs.class) {
                        nxmVar = f45362g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45361f);
                            f45362g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
