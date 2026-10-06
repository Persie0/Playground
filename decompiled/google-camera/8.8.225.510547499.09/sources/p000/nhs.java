package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nhs extends nxq implements nyx {

    /* JADX INFO: renamed from: g */
    public static final nhs f42534g;

    /* JADX INFO: renamed from: h */
    private static volatile nzd f42535h;

    /* JADX INFO: renamed from: a */
    public int f42536a;

    /* JADX INFO: renamed from: b */
    public int f42537b;

    /* JADX INFO: renamed from: c */
    public int f42538c;

    /* JADX INFO: renamed from: d */
    public int f42539d;

    /* JADX INFO: renamed from: e */
    public int f42540e;

    /* JADX INFO: renamed from: f */
    public int f42541f;

    static {
        nhs nhsVar = new nhs();
        f42534g = nhsVar;
        nxq.m18130aa(nhs.class, nhsVar);
    }

    private nhs() {
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
                return m18129X(f42534g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", nhr.f42512a, "c", nhr.f42513b, "d", nhr.f42514c, "e", kva.f37302p, "f", nhr.f42515d});
            case 3:
                return new nhs();
            case 4:
                return new nxl(f42534g);
            case 5:
                return f42534g;
            case 6:
                nzd nxmVar = f42535h;
                if (nxmVar == null) {
                    synchronized (nhs.class) {
                        nxmVar = f42535h;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42534g);
                            f42535h = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
