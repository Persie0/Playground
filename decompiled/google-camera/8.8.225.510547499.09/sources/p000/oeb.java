package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oeb extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final oeb f45692a;

    /* JADX INFO: renamed from: b */
    private static volatile nzd f45693b;

    static {
        oeb oebVar = new oeb();
        f45692a = oebVar;
        nxq.m18130aa(oeb.class, oebVar);
    }

    private oeb() {
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
                return m18129X(f45692a, "\u0001\u0000", null);
            case 3:
                return new oeb();
            case 4:
                return new nxl(f45692a);
            case 5:
                return f45692a;
            case 6:
                nzd nxmVar = f45693b;
                if (nxmVar == null) {
                    synchronized (oeb.class) {
                        nxmVar = f45693b;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45692a);
                            f45693b = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
