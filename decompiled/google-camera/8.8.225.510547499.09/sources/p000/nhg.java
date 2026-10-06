package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nhg extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final nhg f42306e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f42307f;

    /* JADX INFO: renamed from: a */
    public int f42308a;

    /* JADX INFO: renamed from: b */
    public boolean f42309b;

    /* JADX INFO: renamed from: c */
    public boolean f42310c;

    /* JADX INFO: renamed from: d */
    public float f42311d;

    static {
        nhg nhgVar = new nhg();
        f42306e = nhgVar;
        nxq.m18130aa(nhg.class, nhgVar);
    }

    private nhg() {
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
                return m18129X(f42306e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ခ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new nhg();
            case 4:
                return new nxl(f42306e);
            case 5:
                return f42306e;
            case 6:
                nzd nxmVar = f42307f;
                if (nxmVar == null) {
                    synchronized (nhg.class) {
                        nxmVar = f42307f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42306e);
                            f42307f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
