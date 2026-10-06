package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nml extends nxq implements nyx {

    /* JADX INFO: renamed from: g */
    public static final nml f43842g;

    /* JADX INFO: renamed from: i */
    private static volatile nzd f43843i;

    /* JADX INFO: renamed from: a */
    public int f43844a;

    /* JADX INFO: renamed from: b */
    public long f43845b;

    /* JADX INFO: renamed from: c */
    public long f43846c;

    /* JADX INFO: renamed from: d */
    public int f43847d;

    /* JADX INFO: renamed from: e */
    public int f43848e;

    /* JADX INFO: renamed from: f */
    public int f43849f;

    /* JADX INFO: renamed from: h */
    private byte f43850h = 2;

    static {
        nml nmlVar = new nml();
        f43842g = nmlVar;
        nxq.m18130aa(nml.class, nmlVar);
    }

    private nml() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f43850h);
            case 1:
            default:
                this.f43850h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f43842g, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0002\u0001ᔂ\u0000\u0002ᔂ\u0001\u0003င\u0002\u0007င\u0006\bဌ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", nlu.f43679p});
            case 3:
                return new nml();
            case 4:
                return new nxl(f43842g);
            case 5:
                return f43842g;
            case 6:
                nzd nxmVar = f43843i;
                if (nxmVar == null) {
                    synchronized (nml.class) {
                        nxmVar = f43843i;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43842g);
                            f43843i = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
