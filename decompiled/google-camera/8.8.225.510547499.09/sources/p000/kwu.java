package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kwu extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final kwu f37538a;

    /* JADX INFO: renamed from: b */
    private static volatile nzd f37539b;

    static {
        kwu kwuVar = new kwu();
        f37538a = kwuVar;
        nxq.m18130aa(kwu.class, kwuVar);
    }

    private kwu() {
        nzg nzgVar = nzg.f45063b;
        nxr nxrVar = nxr.f44982b;
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
                return m18129X(f37538a, "\u0001\u0000", null);
            case 3:
                return new kwu();
            case 4:
                return new nxl(f37538a);
            case 5:
                return f37538a;
            case 6:
                nzd nxmVar = f37539b;
                if (nxmVar == null) {
                    synchronized (kwu.class) {
                        nxmVar = f37539b;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f37538a);
                            f37539b = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
