package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nhj extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final nhj f42326d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f42327e;

    /* JADX INFO: renamed from: a */
    public int f42328a;

    /* JADX INFO: renamed from: b */
    public double f42329b;

    /* JADX INFO: renamed from: c */
    public int f42330c;

    static {
        nhj nhjVar = new nhj();
        f42326d = nhjVar;
        nxq.m18130aa(nhj.class, nhjVar);
    }

    private nhj() {
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
                return m18129X(f42326d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002င\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new nhj();
            case 4:
                return new nxl(f42326d);
            case 5:
                return f42326d;
            case 6:
                nzd nxmVar = f42327e;
                if (nxmVar == null) {
                    synchronized (nhj.class) {
                        nxmVar = f42327e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42326d);
                            f42327e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
