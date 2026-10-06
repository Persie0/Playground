package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nhu extends nxq implements nyx {

    /* JADX INFO: renamed from: g */
    public static final nhu f42548g;

    /* JADX INFO: renamed from: h */
    private static volatile nzd f42549h;

    /* JADX INFO: renamed from: a */
    public int f42550a;

    /* JADX INFO: renamed from: b */
    public boolean f42551b;

    /* JADX INFO: renamed from: c */
    public boolean f42552c;

    /* JADX INFO: renamed from: d */
    public boolean f42553d;

    /* JADX INFO: renamed from: e */
    public boolean f42554e;

    /* JADX INFO: renamed from: f */
    public boolean f42555f;

    static {
        nhu nhuVar = new nhu();
        f42548g = nhuVar;
        nxq.m18130aa(nhu.class, nhuVar);
    }

    private nhu() {
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
                return m18129X(f42548g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new nhu();
            case 4:
                return new nxl(f42548g);
            case 5:
                return f42548g;
            case 6:
                nzd nxmVar = f42549h;
                if (nxmVar == null) {
                    synchronized (nhu.class) {
                        nxmVar = f42549h;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42548g);
                            f42549h = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
