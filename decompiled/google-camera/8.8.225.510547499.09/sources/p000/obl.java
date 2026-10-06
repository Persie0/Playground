package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class obl extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final obl f45316d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f45317e;

    /* JADX INFO: renamed from: a */
    public int f45318a;

    /* JADX INFO: renamed from: b */
    public long f45319b;

    /* JADX INFO: renamed from: c */
    public float f45320c;

    static {
        obl oblVar = new obl();
        f45316d = oblVar;
        nxq.m18130aa(obl.class, oblVar);
    }

    private obl() {
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
                return m18129X(f45316d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ခ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new obl();
            case 4:
                return new nxl(f45316d);
            case 5:
                return f45316d;
            case 6:
                nzd nxmVar = f45317e;
                if (nxmVar == null) {
                    synchronized (obl.class) {
                        nxmVar = f45317e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45316d);
                            f45317e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
