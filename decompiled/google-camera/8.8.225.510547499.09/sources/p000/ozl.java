package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ozl extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final ozl f47029a;

    /* JADX INFO: renamed from: b */
    private static volatile nzd f47030b;

    static {
        ozl ozlVar = new ozl();
        f47029a = ozlVar;
        nxq.m18130aa(ozl.class, ozlVar);
    }

    private ozl() {
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
                return m18129X(f47029a, "\u0001\u0000", null);
            case 3:
                return new ozl();
            case 4:
                return new nxl(f47029a);
            case 5:
                return f47029a;
            case 6:
                nzd nxmVar = f47030b;
                if (nxmVar == null) {
                    synchronized (ozl.class) {
                        nxmVar = f47030b;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47029a);
                            f47030b = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
