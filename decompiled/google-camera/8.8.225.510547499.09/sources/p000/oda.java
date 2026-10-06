package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class oda extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final oda f45573b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f45574c;

    /* JADX INFO: renamed from: a */
    public nxv f45575a = nxj.f44968b;

    static {
        oda odaVar = new oda();
        f45573b = odaVar;
        nxq.m18130aa(oda.class, odaVar);
    }

    private oda() {
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
                return m18129X(f45573b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0013", new Object[]{"a"});
            case 3:
                return new oda();
            case 4:
                return new nxl(f45573b);
            case 5:
                return f45573b;
            case 6:
                nzd nxmVar = f45574c;
                if (nxmVar == null) {
                    synchronized (oda.class) {
                        nxmVar = f45574c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45573b);
                            f45574c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
