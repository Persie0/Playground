package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oav extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final oav f45208c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f45209d;

    /* JADX INFO: renamed from: a */
    public int f45210a;

    /* JADX INFO: renamed from: b */
    public int f45211b;

    static {
        oav oavVar = new oav();
        f45208c = oavVar;
        nxq.m18130aa(oav.class, oavVar);
    }

    private oav() {
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
                return m18129X(f45208c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", oau.f45189d});
            case 3:
                return new oav();
            case 4:
                return new nxl(f45208c);
            case 5:
                return f45208c;
            case 6:
                nzd nxmVar = f45209d;
                if (nxmVar == null) {
                    synchronized (oav.class) {
                        nxmVar = f45209d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45208c);
                            f45209d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
