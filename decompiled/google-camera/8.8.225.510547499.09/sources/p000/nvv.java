package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nvv extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final nvv f44804a;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f44805c;

    /* JADX INFO: renamed from: b */
    private nvx f44806b;

    static {
        nvv nvvVar = new nvv();
        f44804a = nvvVar;
        nxq.m18130aa(nvv.class, nvvVar);
    }

    private nvv() {
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
                return m18129X(f44804a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"b"});
            case 3:
                return new nvv();
            case 4:
                return new nxl(f44804a);
            case 5:
                return f44804a;
            case 6:
                nzd nxmVar = f44805c;
                if (nxmVar == null) {
                    synchronized (nvv.class) {
                        nxmVar = f44805c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44804a);
                            f44805c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
