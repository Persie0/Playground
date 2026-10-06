package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ocu extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final ocu f45539a;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f45540f;

    /* JADX INFO: renamed from: b */
    private int f45541b;

    /* JADX INFO: renamed from: c */
    private double f45542c;

    /* JADX INFO: renamed from: d */
    private double f45543d;

    /* JADX INFO: renamed from: e */
    private byte f45544e = 2;

    static {
        ocu ocuVar = new ocu();
        f45539a = ocuVar;
        nxq.m18130aa(ocu.class, ocuVar);
    }

    private ocu() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f45544e);
            case 1:
            default:
                this.f45544e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f45539a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔀ\u0000\u0002ᔀ\u0001", new Object[]{"b", "c", "d"});
            case 3:
                return new ocu();
            case 4:
                return new nxl(f45539a);
            case 5:
                return f45539a;
            case 6:
                nzd nxmVar = f45540f;
                if (nxmVar == null) {
                    synchronized (ocu.class) {
                        nxmVar = f45540f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45539a);
                            f45540f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
