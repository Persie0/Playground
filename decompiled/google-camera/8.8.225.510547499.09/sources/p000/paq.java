package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class paq extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final paq f47257a;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f47258e;

    /* JADX INFO: renamed from: b */
    private int f47259b;

    /* JADX INFO: renamed from: c */
    private paf f47260c;

    /* JADX INFO: renamed from: d */
    private byte f47261d = 2;

    static {
        paq paqVar = new paq();
        f47257a = paqVar;
        nxq.m18130aa(paq.class, paqVar);
    }

    private paq() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f47261d);
            case 1:
            default:
                this.f47261d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f47257a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new paq();
            case 4:
                return new nxl(f47257a);
            case 5:
                return f47257a;
            case 6:
                nzd nxmVar = f47258e;
                if (nxmVar == null) {
                    synchronized (paq.class) {
                        nxmVar = f47258e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47257a);
                            f47258e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
