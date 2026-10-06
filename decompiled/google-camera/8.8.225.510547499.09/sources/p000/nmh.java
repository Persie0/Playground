package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nmh extends nxq implements nyx {

    /* JADX INFO: renamed from: k */
    public static final nmh f43783k;

    /* JADX INFO: renamed from: l */
    private static volatile nzd f43784l;

    /* JADX INFO: renamed from: a */
    public int f43785a;

    /* JADX INFO: renamed from: b */
    public int f43786b;

    /* JADX INFO: renamed from: c */
    public int f43787c;

    /* JADX INFO: renamed from: d */
    public int f43788d;

    /* JADX INFO: renamed from: e */
    public int f43789e;

    /* JADX INFO: renamed from: f */
    public int f43790f;

    /* JADX INFO: renamed from: g */
    public int f43791g;

    /* JADX INFO: renamed from: h */
    public int f43792h;

    /* JADX INFO: renamed from: i */
    public int f43793i;

    /* JADX INFO: renamed from: j */
    public int f43794j;

    static {
        nmh nmhVar = new nmh();
        f43783k = nmhVar;
        nxq.m18130aa(nmh.class, nmhVar);
    }

    private nmh() {
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
                return m18129X(f43783k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new nmh();
            case 4:
                return new nxl(f43783k);
            case 5:
                return f43783k;
            case 6:
                nzd nxmVar = f43784l;
                if (nxmVar == null) {
                    synchronized (nmh.class) {
                        nxmVar = f43784l;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43783k);
                            f43784l = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
