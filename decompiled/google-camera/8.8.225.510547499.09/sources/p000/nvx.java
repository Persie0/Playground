package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nvx extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final nvx f44808a;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f44809c;

    /* JADX INFO: renamed from: b */
    private nyr f44810b = nyr.f45033a;

    static {
        nvx nvxVar = new nvx();
        f44808a = nvxVar;
        nxq.m18130aa(nvx.class, nvxVar);
    }

    private nvx() {
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
                return m18129X(f44808a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", nvw.f44807a});
            case 3:
                return new nvx();
            case 4:
                return new nxl(f44808a);
            case 5:
                return f44808a;
            case 6:
                nzd nxmVar = f44809c;
                if (nxmVar == null) {
                    synchronized (nvx.class) {
                        nxmVar = f44809c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44808a);
                            f44809c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
