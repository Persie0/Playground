package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oay extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final oay f45221d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f45222e;

    /* JADX INFO: renamed from: a */
    public int f45223a;

    /* JADX INFO: renamed from: b */
    public nxy f45224b = nzg.f45063b;

    /* JADX INFO: renamed from: c */
    public int f45225c;

    static {
        oay oayVar = new oay();
        f45221d = oayVar;
        nxq.m18130aa(oay.class, oayVar);
    }

    private oay() {
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
                return m18129X(f45221d, "\u0001\u0002\u0000\u0001\u0003\n\u0002\u0000\u0001\u0000\u0003\u001a\nင\u0005", new Object[]{"a", "b", "c"});
            case 3:
                return new oay();
            case 4:
                return new nxl(f45221d);
            case 5:
                return f45221d;
            case 6:
                nzd nxmVar = f45222e;
                if (nxmVar == null) {
                    synchronized (oay.class) {
                        nxmVar = f45222e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45221d);
                            f45222e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
