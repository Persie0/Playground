package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ntm extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final ntm f44496f;

    /* JADX INFO: renamed from: h */
    private static volatile nzd f44497h;

    /* JADX INFO: renamed from: a */
    public boolean f44498a;

    /* JADX INFO: renamed from: b */
    public int f44499b = -1;

    /* JADX INFO: renamed from: c */
    public int f44500c = -1;

    /* JADX INFO: renamed from: d */
    public float f44501d = -1.0f;

    /* JADX INFO: renamed from: e */
    public float f44502e = -1.0f;

    /* JADX INFO: renamed from: g */
    private int f44503g;

    static {
        ntm ntmVar = new ntm();
        f44496f = ntmVar;
        nxq.m18130aa(ntm.class, ntmVar);
    }

    private ntm() {
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
                return m18129X(f44496f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003င\u0002\u0004ခ\u0003\u0005ခ\u0004", new Object[]{"g", "a", "b", "c", "d", "e"});
            case 3:
                return new ntm();
            case 4:
                return new nxl(f44496f);
            case 5:
                return f44496f;
            case 6:
                nzd nxmVar = f44497h;
                if (nxmVar == null) {
                    synchronized (ntm.class) {
                        nxmVar = f44497h;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44496f);
                            f44497h = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
