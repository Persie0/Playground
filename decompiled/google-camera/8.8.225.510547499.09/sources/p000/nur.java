package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nur extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final nur f44689a;

    /* JADX INFO: renamed from: b */
    private static volatile nzd f44690b;

    static {
        nur nurVar = new nur();
        f44689a = nurVar;
        nxq.m18130aa(nur.class, nurVar);
    }

    private nur() {
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
                return m18129X(f44689a, "\u0000\u0000", null);
            case 3:
                return new nur();
            case 4:
                return new nxl(f44689a);
            case 5:
                return f44689a;
            case 6:
                nzd nxmVar = f44690b;
                if (nxmVar == null) {
                    synchronized (nur.class) {
                        nxmVar = f44690b;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44689a);
                            f44690b = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
