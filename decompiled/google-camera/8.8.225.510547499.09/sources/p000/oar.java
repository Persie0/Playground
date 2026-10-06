package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oar extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final oar f45172d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f45173e;

    /* JADX INFO: renamed from: a */
    public int f45174a;

    /* JADX INFO: renamed from: b */
    public int f45175b;

    /* JADX INFO: renamed from: c */
    public oaz f45176c;

    static {
        oar oarVar = new oar();
        f45172d = oarVar;
        nxq.m18130aa(oar.class, oarVar);
    }

    private oar() {
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
                return m18129X(f45172d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", oau.f45188c, "c"});
            case 3:
                return new oar();
            case 4:
                return new nxl(f45172d);
            case 5:
                return f45172d;
            case 6:
                nzd nxmVar = f45173e;
                if (nxmVar == null) {
                    synchronized (oar.class) {
                        nxmVar = f45173e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45172d);
                            f45173e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
