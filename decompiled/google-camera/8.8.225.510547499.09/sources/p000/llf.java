package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class llf extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final llf f38561c;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f38562e;

    /* JADX INFO: renamed from: a */
    public int f38563a;

    /* JADX INFO: renamed from: b */
    public String f38564b = "";

    /* JADX INFO: renamed from: d */
    private int f38565d;

    static {
        llf llfVar = new llf();
        f38561c = llfVar;
        nxq.m18130aa(llf.class, llfVar);
    }

    private llf() {
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
                return m18129X(f38561c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", kva.f37293g, "b"});
            case 3:
                return new llf();
            case 4:
                return new nxl(f38561c);
            case 5:
                return f38561c;
            case 6:
                nzd nxmVar = f38562e;
                if (nxmVar == null) {
                    synchronized (llf.class) {
                        nxmVar = f38562e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f38561c);
                            f38562e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
