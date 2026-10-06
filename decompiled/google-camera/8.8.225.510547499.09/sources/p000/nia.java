package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nia extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final nia f42637e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f42638f;

    /* JADX INFO: renamed from: a */
    public int f42639a;

    /* JADX INFO: renamed from: b */
    public nhm f42640b;

    /* JADX INFO: renamed from: c */
    public nie f42641c;

    /* JADX INFO: renamed from: d */
    public nif f42642d;

    static {
        nia niaVar = new nia();
        f42637e = niaVar;
        nxq.m18130aa(nia.class, niaVar);
    }

    private nia() {
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
                return m18129X(f42637e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new nia();
            case 4:
                return new nxl(f42637e);
            case 5:
                return f42637e;
            case 6:
                nzd nxmVar = f42638f;
                if (nxmVar == null) {
                    synchronized (nia.class) {
                        nxmVar = f42638f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42637e);
                            f42638f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
