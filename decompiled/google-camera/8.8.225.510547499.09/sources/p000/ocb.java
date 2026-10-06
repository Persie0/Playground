package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ocb extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final ocb f45424e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f45425f;

    /* JADX INFO: renamed from: a */
    public int f45426a;

    /* JADX INFO: renamed from: b */
    public float f45427b;

    /* JADX INFO: renamed from: c */
    public float f45428c;

    /* JADX INFO: renamed from: d */
    public int f45429d = 15000;

    static {
        ocb ocbVar = new ocb();
        f45424e = ocbVar;
        nxq.m18130aa(ocb.class, ocbVar);
    }

    private ocb() {
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
                return m18129X(f45424e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0004ဌ\u0003", new Object[]{"a", "b", "c", "d", oau.f45196k});
            case 3:
                return new ocb();
            case 4:
                return new nxl(f45424e);
            case 5:
                return f45424e;
            case 6:
                nzd nxmVar = f45425f;
                if (nxmVar == null) {
                    synchronized (ocb.class) {
                        nxmVar = f45425f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45424e);
                            f45425f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
