package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mei extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final mei f40177a;

    /* JADX INFO: renamed from: b */
    private static volatile nzd f40178b;

    static {
        mei meiVar = new mei();
        f40177a = meiVar;
        nxq.m18130aa(mei.class, meiVar);
    }

    private mei() {
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
                return m18129X(f40177a, "\u0001\u0000", null);
            case 3:
                return new mei();
            case 4:
                return new nxl(f40177a);
            case 5:
                return f40177a;
            case 6:
                nzd nxmVar = f40178b;
                if (nxmVar == null) {
                    synchronized (mei.class) {
                        nxmVar = f40178b;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f40177a);
                            f40178b = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
