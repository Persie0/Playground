package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ocp extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final ocp f45500a;

    /* JADX INFO: renamed from: b */
    private static volatile nzd f45501b;

    static {
        ocp ocpVar = new ocp();
        f45500a = ocpVar;
        nxq.m18130aa(ocp.class, ocpVar);
    }

    private ocp() {
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
                return m18129X(f45500a, "\u0001\u0000", null);
            case 3:
                return new ocp();
            case 4:
                return new nxl(f45500a);
            case 5:
                return f45500a;
            case 6:
                nzd nxmVar = f45501b;
                if (nxmVar == null) {
                    synchronized (ocp.class) {
                        nxmVar = f45501b;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45500a);
                            f45501b = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
