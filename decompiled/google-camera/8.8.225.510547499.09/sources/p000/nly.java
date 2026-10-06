package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nly extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final nly f43704e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f43705f;

    /* JADX INFO: renamed from: a */
    public int f43706a;

    /* JADX INFO: renamed from: b */
    public int f43707b;

    /* JADX INFO: renamed from: c */
    public int f43708c;

    /* JADX INFO: renamed from: d */
    public int f43709d;

    static {
        nly nlyVar = new nly();
        f43704e = nlyVar;
        nxq.m18130aa(nly.class, nlyVar);
    }

    private nly() {
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
                return m18129X(f43704e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", nlu.f43669f, "c", nks.f43293a, "d", nlu.f43668e});
            case 3:
                return new nly();
            case 4:
                return new nxl(f43704e);
            case 5:
                return f43704e;
            case 6:
                nzd nxmVar = f43705f;
                if (nxmVar == null) {
                    synchronized (nly.class) {
                        nxmVar = f43705f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43704e);
                            f43705f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
