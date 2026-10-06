package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nlv extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final nlv f43686e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f43687f;

    /* JADX INFO: renamed from: a */
    public int f43688a;

    /* JADX INFO: renamed from: b */
    public int f43689b;

    /* JADX INFO: renamed from: c */
    public int f43690c;

    /* JADX INFO: renamed from: d */
    public nlt f43691d;

    static {
        nlv nlvVar = new nlv();
        f43686e = nlvVar;
        nxq.m18130aa(nlv.class, nlvVar);
    }

    private nlv() {
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
                return m18129X(f43686e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", nlu.f43665b, "c", nlu.f43664a, "d"});
            case 3:
                return new nlv();
            case 4:
                return new nxl(f43686e);
            case 5:
                return f43686e;
            case 6:
                nzd nxmVar = f43687f;
                if (nxmVar == null) {
                    synchronized (nlv.class) {
                        nxmVar = f43687f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43686e);
                            f43687f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
