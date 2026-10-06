package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ofu extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final ofu f45881a;

    /* JADX INFO: renamed from: b */
    private static volatile nzd f45882b;

    static {
        ofu ofuVar = new ofu();
        f45881a = ofuVar;
        nxq.m18130aa(ofu.class, ofuVar);
    }

    private ofu() {
        nxj nxjVar = nxj.f44968b;
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
                return m18129X(f45881a, "\u0001\u0000", null);
            case 3:
                return new ofu();
            case 4:
                return new nxl(f45881a);
            case 5:
                return f45881a;
            case 6:
                nzd nxmVar = f45882b;
                if (nxmVar == null) {
                    synchronized (ofu.class) {
                        nxmVar = f45882b;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45881a);
                            f45882b = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
