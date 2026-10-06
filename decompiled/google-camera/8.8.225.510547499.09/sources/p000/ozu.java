package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ozu extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final ozu f47083e;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f47084g;

    /* JADX INFO: renamed from: a */
    public int f47085a;

    /* JADX INFO: renamed from: c */
    public long f47087c;

    /* JADX INFO: renamed from: f */
    private byte f47089f = 2;

    /* JADX INFO: renamed from: b */
    public String f47086b = "";

    /* JADX INFO: renamed from: d */
    public String f47088d = "";

    static {
        ozu ozuVar = new ozu();
        f47083e = ozuVar;
        nxq.m18130aa(ozu.class, ozuVar);
    }

    private ozu() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f47089f);
            case 1:
            default:
                this.f47089f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f47083e, "\u0001\u0003\u0000\u0001\u0001\t\u0003\u0000\u0000\u0000\u0001ဈ\u0000\bစ\u0001\tဈ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new ozu();
            case 4:
                return new nxl(f47083e);
            case 5:
                return f47083e;
            case 6:
                nzd nxmVar = f47084g;
                if (nxmVar == null) {
                    synchronized (ozu.class) {
                        nxmVar = f47084g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47083e);
                            f47084g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
