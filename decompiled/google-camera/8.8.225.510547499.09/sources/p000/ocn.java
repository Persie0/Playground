package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ocn extends nxo implements nyx {

    /* JADX INFO: renamed from: g */
    public static final ocn f45483g;

    /* JADX INFO: renamed from: i */
    private static volatile nzd f45484i;

    /* JADX INFO: renamed from: a */
    public int f45485a;

    /* JADX INFO: renamed from: e */
    public ocl f45489e;

    /* JADX INFO: renamed from: f */
    public boolean f45490f;

    /* JADX INFO: renamed from: h */
    private byte f45491h = 2;

    /* JADX INFO: renamed from: b */
    public String f45486b = "";

    /* JADX INFO: renamed from: c */
    public String f45487c = "";

    /* JADX INFO: renamed from: d */
    public nwr f45488d = nwr.f44839b;

    static {
        ocn ocnVar = new ocn();
        f45483g = ocnVar;
        nxq.m18130aa(ocn.class, ocnVar);
    }

    private ocn() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f45491h);
            case 1:
            default:
                this.f45491h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f45483g, "\u0001\u0005\u0000\u0001\u0001\u0010\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ဉ\u0003\u0010ဇ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new ocn();
            case 4:
                return new nxn(f45483g);
            case 5:
                return f45483g;
            case 6:
                nzd nxmVar = f45484i;
                if (nxmVar == null) {
                    synchronized (ocn.class) {
                        nxmVar = f45484i;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45483g);
                            f45484i = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
