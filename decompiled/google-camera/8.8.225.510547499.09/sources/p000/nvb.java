package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nvb extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final nvb f44730a;

    /* JADX INFO: renamed from: b */
    private static volatile nzd f44731b;

    static {
        nvb nvbVar = new nvb();
        f44730a = nvbVar;
        nxq.m18130aa(nvb.class, nvbVar);
    }

    private nvb() {
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
                return m18129X(f44730a, "\u0001\u0000", null);
            case 3:
                return new nvb();
            case 4:
                return new nxl(f44730a);
            case 5:
                return f44730a;
            case 6:
                nzd nxmVar = f44731b;
                if (nxmVar == null) {
                    synchronized (nvb.class) {
                        nxmVar = f44731b;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44730a);
                            f44731b = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
