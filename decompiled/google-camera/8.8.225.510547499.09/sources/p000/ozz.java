package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ozz extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final ozz f47128c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f47129d;

    /* JADX INFO: renamed from: a */
    public int f47130a;

    /* JADX INFO: renamed from: b */
    public ozy f47131b;

    static {
        ozz ozzVar = new ozz();
        f47128c = ozzVar;
        nxq.m18130aa(ozz.class, ozzVar);
    }

    private ozz() {
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
                return m18129X(f47128c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new ozz();
            case 4:
                return new nxl(f47128c);
            case 5:
                return f47128c;
            case 6:
                nzd nxmVar = f47129d;
                if (nxmVar == null) {
                    synchronized (ozz.class) {
                        nxmVar = f47129d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47128c);
                            f47129d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
