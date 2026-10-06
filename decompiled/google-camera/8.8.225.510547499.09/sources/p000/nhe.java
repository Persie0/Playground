package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nhe extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final nhe f42295c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f42296d;

    /* JADX INFO: renamed from: a */
    public int f42297a;

    /* JADX INFO: renamed from: b */
    public long f42298b;

    static {
        nhe nheVar = new nhe();
        f42295c = nheVar;
        nxq.m18130aa(nhe.class, nheVar);
    }

    private nhe() {
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
                return m18129X(f42295c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new nhe();
            case 4:
                return new nxl(f42295c);
            case 5:
                return f42295c;
            case 6:
                nzd nxmVar = f42296d;
                if (nxmVar == null) {
                    synchronized (nhe.class) {
                        nxmVar = f42296d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42295c);
                            f42296d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
