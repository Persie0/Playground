package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ngw extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final ngw f42240a;

    /* JADX INFO: renamed from: b */
    private static volatile nzd f42241b;

    static {
        ngw ngwVar = new ngw();
        f42240a = ngwVar;
        nxq.m18130aa(ngw.class, ngwVar);
    }

    private ngw() {
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
                return m18129X(f42240a, "\u0001\u0000", null);
            case 3:
                return new ngw();
            case 4:
                return new nxl(f42240a);
            case 5:
                return f42240a;
            case 6:
                nzd nxmVar = f42241b;
                if (nxmVar == null) {
                    synchronized (ngw.class) {
                        nxmVar = f42241b;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42240a);
                            f42241b = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
