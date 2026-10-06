package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class odd extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final odd f45589a;

    /* JADX INFO: renamed from: b */
    private static volatile nzd f45590b;

    static {
        odd oddVar = new odd();
        f45589a = oddVar;
        nxq.m18130aa(odd.class, oddVar);
    }

    private odd() {
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
                return m18129X(f45589a, "\u0001\u0000", null);
            case 3:
                return new odd();
            case 4:
                return new nxl(f45589a);
            case 5:
                return f45589a;
            case 6:
                nzd nxmVar = f45590b;
                if (nxmVar == null) {
                    synchronized (odd.class) {
                        nxmVar = f45590b;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45589a);
                            f45590b = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
