package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nwg extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final nwg f44822c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f44823d;

    /* JADX INFO: renamed from: a */
    public String f44824a = "";

    /* JADX INFO: renamed from: b */
    public nwr f44825b = nwr.f44839b;

    static {
        nwg nwgVar = new nwg();
        f44822c = nwgVar;
        nxq.m18130aa(nwg.class, nwgVar);
    }

    private nwg() {
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
                return m18129X(f44822c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"a", "b"});
            case 3:
                return new nwg();
            case 4:
                return new nxl(f44822c);
            case 5:
                return f44822c;
            case 6:
                nzd nxmVar = f44823d;
                if (nxmVar == null) {
                    synchronized (nwg.class) {
                        nxmVar = f44823d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44822c);
                            f44823d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
