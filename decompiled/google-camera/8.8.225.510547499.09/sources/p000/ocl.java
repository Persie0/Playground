package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ocl extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final ocl f45478a;

    /* JADX INFO: renamed from: b */
    private static volatile nzd f45479b;

    static {
        ocl oclVar = new ocl();
        f45478a = oclVar;
        nxq.m18130aa(ocl.class, oclVar);
    }

    private ocl() {
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
                return m18129X(f45478a, "\u0001\u0000", null);
            case 3:
                return new ocl();
            case 4:
                return new nxl(f45478a);
            case 5:
                return f45478a;
            case 6:
                nzd nxmVar = f45479b;
                if (nxmVar == null) {
                    synchronized (ocl.class) {
                        nxmVar = f45479b;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45478a);
                            f45479b = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
