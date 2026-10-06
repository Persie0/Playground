package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nvh extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final nvh f44744a;

    /* JADX INFO: renamed from: b */
    private static volatile nzd f44745b;

    static {
        nvh nvhVar = new nvh();
        f44744a = nvhVar;
        nxq.m18130aa(nvh.class, nvhVar);
    }

    private nvh() {
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
                return m18129X(f44744a, "\u0001\u0000", null);
            case 3:
                return new nvh();
            case 4:
                return new nxl(f44744a);
            case 5:
                return f44744a;
            case 6:
                nzd nxmVar = f44745b;
                if (nxmVar == null) {
                    synchronized (nvh.class) {
                        nxmVar = f44745b;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44744a);
                            f44745b = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
