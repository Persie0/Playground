package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ntn extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final ntn f44504c;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f44505e;

    /* JADX INFO: renamed from: a */
    public boolean f44506a;

    /* JADX INFO: renamed from: b */
    public boolean f44507b;

    /* JADX INFO: renamed from: d */
    private int f44508d;

    static {
        ntn ntnVar = new ntn();
        f44504c = ntnVar;
        nxq.m18130aa(ntn.class, ntnVar);
    }

    private ntn() {
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
                return m18129X(f44504c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new ntn();
            case 4:
                return new nxl(f44504c);
            case 5:
                return f44504c;
            case 6:
                nzd nxmVar = f44505e;
                if (nxmVar == null) {
                    synchronized (ntn.class) {
                        nxmVar = f44505e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44504c);
                            f44505e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
