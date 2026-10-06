package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nkk extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final nkk f43218c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f43219d;

    /* JADX INFO: renamed from: a */
    public int f43220a;

    /* JADX INFO: renamed from: b */
    public float f43221b;

    static {
        nkk nkkVar = new nkk();
        f43218c = nkkVar;
        nxq.m18130aa(nkk.class, nkkVar);
    }

    private nkk() {
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
                return m18129X(f43218c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"a", "b"});
            case 3:
                return new nkk();
            case 4:
                return new nxl(f43218c);
            case 5:
                return f43218c;
            case 6:
                nzd nxmVar = f43219d;
                if (nxmVar == null) {
                    synchronized (nkk.class) {
                        nxmVar = f43219d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43218c);
                            f43219d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
