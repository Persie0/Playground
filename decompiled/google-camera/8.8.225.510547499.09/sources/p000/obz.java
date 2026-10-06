package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class obz extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final obz f45410e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f45411f;

    /* JADX INFO: renamed from: a */
    public int f45412a;

    /* JADX INFO: renamed from: b */
    public String f45413b = "";

    /* JADX INFO: renamed from: c */
    public float f45414c;

    /* JADX INFO: renamed from: d */
    public float f45415d;

    static {
        obz obzVar = new obz();
        f45410e = obzVar;
        nxq.m18130aa(obz.class, obzVar);
    }

    private obz() {
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
                return m18129X(f45410e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဈ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new obz();
            case 4:
                return new nxl(f45410e);
            case 5:
                return f45410e;
            case 6:
                nzd nxmVar = f45411f;
                if (nxmVar == null) {
                    synchronized (obz.class) {
                        nxmVar = f45411f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45410e);
                            f45411f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
