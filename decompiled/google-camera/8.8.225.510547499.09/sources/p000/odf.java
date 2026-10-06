package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class odf extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final odf f45592b;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f45593d;

    /* JADX INFO: renamed from: a */
    public float f45594a;

    /* JADX INFO: renamed from: c */
    private int f45595c;

    static {
        odf odfVar = new odf();
        f45592b = odfVar;
        nxq.m18130aa(odf.class, odfVar);
    }

    private odf() {
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
                return m18129X(f45592b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"c", "a"});
            case 3:
                return new odf();
            case 4:
                return new nxl(f45592b);
            case 5:
                return f45592b;
            case 6:
                nzd nxmVar = f45593d;
                if (nxmVar == null) {
                    synchronized (odf.class) {
                        nxmVar = f45593d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45592b);
                            f45593d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
