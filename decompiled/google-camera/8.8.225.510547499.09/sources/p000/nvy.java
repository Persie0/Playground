package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nvy extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final nvy f44811a;

    /* JADX INFO: renamed from: b */
    private static volatile nzd f44812b;

    static {
        nvy nvyVar = new nvy();
        f44811a = nvyVar;
        nxq.m18130aa(nvy.class, nvyVar);
    }

    private nvy() {
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
                return m18129X(f44811a, "\u0000\u0000", null);
            case 3:
                return new nvy();
            case 4:
                return new nxl(f44811a);
            case 5:
                return f44811a;
            case 6:
                nzd nxmVar = f44812b;
                if (nxmVar == null) {
                    synchronized (nvy.class) {
                        nxmVar = f44812b;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44811a);
                            f44812b = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
