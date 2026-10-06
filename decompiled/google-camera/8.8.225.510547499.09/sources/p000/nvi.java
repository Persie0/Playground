package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nvi extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final nvi f44746b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f44747c;

    /* JADX INFO: renamed from: a */
    public nxy f44748a = nzg.f45063b;

    static {
        nvi nviVar = new nvi();
        f44746b = nviVar;
        nxq.m18130aa(nvi.class, nviVar);
    }

    private nvi() {
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
                return m18129X(f44746b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", nvh.class});
            case 3:
                return new nvi();
            case 4:
                return new nxl(f44746b);
            case 5:
                return f44746b;
            case 6:
                nzd nxmVar = f44747c;
                if (nxmVar == null) {
                    synchronized (nvi.class) {
                        nxmVar = f44747c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44746b);
                            f44747c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
