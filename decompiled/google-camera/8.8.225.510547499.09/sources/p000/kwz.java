package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kwz extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final kwz f37588a;

    /* JADX INFO: renamed from: b */
    private static volatile nzd f37589b;

    static {
        kwz kwzVar = new kwz();
        f37588a = kwzVar;
        nxq.m18130aa(kwz.class, kwzVar);
    }

    private kwz() {
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
                return m18129X(f37588a, "\u0001\u0000", null);
            case 3:
                return new kwz();
            case 4:
                return new nxl(f37588a);
            case 5:
                return f37588a;
            case 6:
                nzd nxmVar = f37589b;
                if (nxmVar == null) {
                    synchronized (kwz.class) {
                        nxmVar = f37589b;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f37588a);
                            f37589b = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
