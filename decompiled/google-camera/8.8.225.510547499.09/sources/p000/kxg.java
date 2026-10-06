package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kxg extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final kxg f37633c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f37634d;

    /* JADX INFO: renamed from: a */
    public String f37635a = "";

    /* JADX INFO: renamed from: b */
    public String f37636b = "";

    static {
        kxg kxgVar = new kxg();
        f37633c = kxgVar;
        nxq.m18130aa(kxg.class, kxgVar);
    }

    private kxg() {
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
                return m18129X(f37633c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new kxg();
            case 4:
                return new nxl(f37633c);
            case 5:
                return f37633c;
            case 6:
                nzd nxmVar = f37634d;
                if (nxmVar == null) {
                    synchronized (kxg.class) {
                        nxmVar = f37634d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f37633c);
                            f37634d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
