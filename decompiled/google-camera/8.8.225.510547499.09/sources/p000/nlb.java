package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nlb extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final nlb f43441f;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f43442g;

    /* JADX INFO: renamed from: a */
    public int f43443a;

    /* JADX INFO: renamed from: b */
    public int f43444b;

    /* JADX INFO: renamed from: c */
    public int f43445c;

    /* JADX INFO: renamed from: d */
    public float f43446d;

    /* JADX INFO: renamed from: e */
    public int f43447e;

    static {
        nlb nlbVar = new nlb();
        f43441f = nlbVar;
        nxq.m18130aa(nlb.class, nlbVar);
    }

    private nlb() {
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
                return m18129X(f43441f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002င\u0001\u0003င\u0002\u0004ခ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", "c", "d", "e", nks.f43301i});
            case 3:
                return new nlb();
            case 4:
                return new nxl(f43441f);
            case 5:
                return f43441f;
            case 6:
                nzd nxmVar = f43442g;
                if (nxmVar == null) {
                    synchronized (nlb.class) {
                        nxmVar = f43442g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43441f);
                            f43442g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
