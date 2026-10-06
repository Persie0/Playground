package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ofw extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final ofw f45889a;

    /* JADX INFO: renamed from: b */
    private static volatile nzd f45890b;

    static {
        ofw ofwVar = new ofw();
        f45889a = ofwVar;
        nxq.m18130aa(ofw.class, ofwVar);
    }

    private ofw() {
        nzg nzgVar = nzg.f45063b;
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
                return m18129X(f45889a, "\u0001\u0000", null);
            case 3:
                return new ofw();
            case 4:
                return new nxl(f45889a);
            case 5:
                return f45889a;
            case 6:
                nzd nxmVar = f45890b;
                if (nxmVar == null) {
                    synchronized (ofw.class) {
                        nxmVar = f45890b;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45889a);
                            f45890b = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
