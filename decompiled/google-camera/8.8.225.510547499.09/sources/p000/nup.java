package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nup extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final nup f44676c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f44677d;

    /* JADX INFO: renamed from: a */
    public int f44678a = 0;

    /* JADX INFO: renamed from: b */
    public Object f44679b;

    static {
        nup nupVar = new nup();
        f44676c = nupVar;
        nxq.m18130aa(nup.class, nupVar);
    }

    private nup() {
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
                return m18129X(f44676c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u00015\u0000\u00025\u0000", new Object[]{"b", "a"});
            case 3:
                return new nup();
            case 4:
                return new nxl(f44676c);
            case 5:
                return f44676c;
            case 6:
                nzd nxmVar = f44677d;
                if (nxmVar == null) {
                    synchronized (nup.class) {
                        nxmVar = f44677d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44676c);
                            f44677d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
