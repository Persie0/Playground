package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nvd extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final nvd f44734a;

    /* JADX INFO: renamed from: b */
    private static volatile nzd f44735b;

    static {
        nvd nvdVar = new nvd();
        f44734a = nvdVar;
        nxq.m18130aa(nvd.class, nvdVar);
    }

    private nvd() {
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
                return m18129X(f44734a, "\u0001\u0000", null);
            case 3:
                return new nvd();
            case 4:
                return new nxl(f44734a);
            case 5:
                return f44734a;
            case 6:
                nzd nxmVar = f44735b;
                if (nxmVar == null) {
                    synchronized (nvd.class) {
                        nxmVar = f44735b;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44734a);
                            f44735b = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
