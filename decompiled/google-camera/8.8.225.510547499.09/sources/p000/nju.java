package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nju extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final nju f43088b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f43089c;

    /* JADX INFO: renamed from: a */
    public nxy f43090a = nzg.f45063b;

    static {
        nju njuVar = new nju();
        f43088b = njuVar;
        nxq.m18130aa(nju.class, njuVar);
    }

    private nju() {
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
                return m18129X(f43088b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", njv.class});
            case 3:
                return new nju();
            case 4:
                return new nxl(f43088b);
            case 5:
                return f43088b;
            case 6:
                nzd nxmVar = f43089c;
                if (nxmVar == null) {
                    synchronized (nju.class) {
                        nxmVar = f43089c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43088b);
                            f43089c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
