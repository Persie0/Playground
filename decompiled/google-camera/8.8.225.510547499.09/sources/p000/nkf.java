package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nkf extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final nkf f43189f;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f43190g;

    /* JADX INFO: renamed from: a */
    public int f43191a;

    /* JADX INFO: renamed from: b */
    public int f43192b;

    /* JADX INFO: renamed from: c */
    public int f43193c;

    /* JADX INFO: renamed from: d */
    public String f43194d = "";

    /* JADX INFO: renamed from: e */
    public String f43195e = "";

    static {
        nkf nkfVar = new nkf();
        f43189f = nkfVar;
        nxq.m18130aa(nkf.class, nkfVar);
    }

    private nkf() {
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
                return m18129X(f43189f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0002\u0003ဈ\u0003\u0004ဌ\u0001", new Object[]{"a", "b", njy.f43121k, "d", "e", "c", njy.f43122l});
            case 3:
                return new nkf();
            case 4:
                return new nxl(f43189f);
            case 5:
                return f43189f;
            case 6:
                nzd nxmVar = f43190g;
                if (nxmVar == null) {
                    synchronized (nkf.class) {
                        nxmVar = f43190g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43189f);
                            f43190g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
