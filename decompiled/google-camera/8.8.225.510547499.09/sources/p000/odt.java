package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class odt extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final odt f45679a;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f45680c;

    /* JADX INFO: renamed from: b */
    private nyr f45681b = nyr.f45033a;

    static {
        odt odtVar = new odt();
        f45679a = odtVar;
        nxq.m18130aa(odt.class, odtVar);
    }

    private odt() {
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
                return m18129X(f45679a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", ods.f45678a});
            case 3:
                return new odt();
            case 4:
                return new nxl(f45679a);
            case 5:
                return f45679a;
            case 6:
                nzd nxmVar = f45680c;
                if (nxmVar == null) {
                    synchronized (odt.class) {
                        nxmVar = f45680c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45679a);
                            f45680c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
