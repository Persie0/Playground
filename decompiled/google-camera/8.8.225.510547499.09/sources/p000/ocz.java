package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ocz extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final ocz f45569b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f45570c;

    /* JADX INFO: renamed from: a */
    public nxx f45571a = nyn.f45025b;

    static {
        ocz oczVar = new ocz();
        f45569b = oczVar;
        nxq.m18130aa(ocz.class, oczVar);
    }

    private ocz() {
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
                return m18129X(f45569b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0015", new Object[]{"a"});
            case 3:
                return new ocz();
            case 4:
                return new nxl(f45569b);
            case 5:
                return f45569b;
            case 6:
                nzd nxmVar = f45570c;
                if (nxmVar == null) {
                    synchronized (ocz.class) {
                        nxmVar = f45570c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45569b);
                            f45570c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
