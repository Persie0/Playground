package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class obw extends nxq implements nyx {

    /* JADX INFO: renamed from: h */
    public static final obw f45383h;

    /* JADX INFO: renamed from: j */
    private static volatile nzd f45384j;

    /* JADX INFO: renamed from: a */
    public float f45385a = -1.0f;

    /* JADX INFO: renamed from: b */
    public float f45386b = -1.0f;

    /* JADX INFO: renamed from: c */
    public float f45387c = -1.0f;

    /* JADX INFO: renamed from: d */
    public float f45388d = -1.0f;

    /* JADX INFO: renamed from: e */
    public int f45389e = -1;

    /* JADX INFO: renamed from: f */
    public float f45390f = -1.0f;

    /* JADX INFO: renamed from: g */
    public float f45391g = -1.0f;

    /* JADX INFO: renamed from: i */
    private int f45392i;

    static {
        obw obwVar = new obw();
        f45383h = obwVar;
        nxq.m18130aa(obw.class, obwVar);
    }

    private obw() {
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
                return m18129X(f45383h, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005င\u0004\u0006ခ\u0005\u0007ခ\u0006", new Object[]{"i", "a", "b", "c", "d", "e", "f", "g"});
            case 3:
                return new obw();
            case 4:
                return new nxl(f45383h);
            case 5:
                return f45383h;
            case 6:
                nzd nxmVar = f45384j;
                if (nxmVar == null) {
                    synchronized (obw.class) {
                        nxmVar = f45384j;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45383h);
                            f45384j = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
