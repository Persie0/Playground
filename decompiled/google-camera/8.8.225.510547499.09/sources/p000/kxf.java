package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kxf extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final kxf f37631a;

    /* JADX INFO: renamed from: b */
    private static volatile nzd f37632b;

    static {
        kxf kxfVar = new kxf();
        f37631a = kxfVar;
        nxq.m18130aa(kxf.class, kxfVar);
    }

    private kxf() {
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
                return m18129X(f37631a, "\u0000\u0000", null);
            case 3:
                return new kxf();
            case 4:
                return new nxl(f37631a);
            case 5:
                return f37631a;
            case 6:
                nzd nxmVar = f37632b;
                if (nxmVar == null) {
                    synchronized (kxf.class) {
                        nxmVar = f37632b;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f37631a);
                            f37632b = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
