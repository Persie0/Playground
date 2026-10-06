package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pbq extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final pbq f47345c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f47346d;

    /* JADX INFO: renamed from: a */
    public int f47347a = 0;

    /* JADX INFO: renamed from: b */
    public Object f47348b;

    static {
        pbq pbqVar = new pbq();
        f47345c = pbqVar;
        nxq.m18130aa(pbq.class, pbqVar);
    }

    private pbq() {
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
                return m18129X(f47345c, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"b", "a", pbo.class, pbt.class, pbu.class});
            case 3:
                return new pbq();
            case 4:
                return new nxl(f47345c);
            case 5:
                return f47345c;
            case 6:
                nzd nxmVar = f47346d;
                if (nxmVar == null) {
                    synchronized (pbq.class) {
                        nxmVar = f47346d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47345c);
                            f47346d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
