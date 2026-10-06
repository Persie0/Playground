package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cnw extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final cnw f6395c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f6396d;

    /* JADX INFO: renamed from: a */
    public int f6397a = 0;

    /* JADX INFO: renamed from: b */
    public Object f6398b;

    static {
        cnw cnwVar = new cnw();
        f6395c = cnwVar;
        nxq.m18130aa(cnw.class, cnwVar);
    }

    private cnw() {
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
                return m18129X(f6395c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u00015\u0000\u00025\u0000", new Object[]{"b", "a"});
            case 3:
                return new cnw();
            case 4:
                return new nxl(f6395c);
            case 5:
                return f6395c;
            case 6:
                nzd nxmVar = f6396d;
                if (nxmVar == null) {
                    synchronized (cnw.class) {
                        nxmVar = f6396d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f6395c);
                            f6396d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
