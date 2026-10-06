package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nvc extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final nvc f44732a;

    /* JADX INFO: renamed from: b */
    private static volatile nzd f44733b;

    static {
        nvc nvcVar = new nvc();
        f44732a = nvcVar;
        nxq.m18130aa(nvc.class, nvcVar);
    }

    private nvc() {
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
                return m18129X(f44732a, "\u0001\u0000", null);
            case 3:
                return new nvc();
            case 4:
                return new nxl(f44732a);
            case 5:
                return f44732a;
            case 6:
                nzd nxmVar = f44733b;
                if (nxmVar == null) {
                    synchronized (nvc.class) {
                        nxmVar = f44733b;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44732a);
                            f44733b = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
