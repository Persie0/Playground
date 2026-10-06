package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ocg extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final ocg f45460a;

    /* JADX INFO: renamed from: b */
    private static volatile nzd f45461b;

    static {
        ocg ocgVar = new ocg();
        f45460a = ocgVar;
        nxq.m18130aa(ocg.class, ocgVar);
    }

    private ocg() {
        nzg nzgVar = nzg.f45063b;
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
                return m18129X(f45460a, "\u0001\u0000", null);
            case 3:
                return new ocg();
            case 4:
                return new nxl(f45460a);
            case 5:
                return f45460a;
            case 6:
                nzd nxmVar = f45461b;
                if (nxmVar == null) {
                    synchronized (ocg.class) {
                        nxmVar = f45461b;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45460a);
                            f45461b = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
