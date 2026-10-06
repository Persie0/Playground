package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nmq extends nxq implements nyx {

    /* JADX INFO: renamed from: g */
    public static final nmq f43874g;

    /* JADX INFO: renamed from: i */
    private static volatile nzd f43875i;

    /* JADX INFO: renamed from: a */
    public int f43876a;

    /* JADX INFO: renamed from: b */
    public nmp f43877b;

    /* JADX INFO: renamed from: d */
    public int f43879d;

    /* JADX INFO: renamed from: f */
    public nmv f43881f;

    /* JADX INFO: renamed from: h */
    private byte f43882h = 2;

    /* JADX INFO: renamed from: c */
    public String f43878c = "";

    /* JADX INFO: renamed from: e */
    public String f43880e = "";

    static {
        nmq nmqVar = new nmq();
        f43874g = nmqVar;
        nxq.m18130aa(nmq.class, nmqVar);
    }

    private nmq() {
        nzg nzgVar = nzg.f45063b;
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f43882h);
            case 1:
            default:
                this.f43882h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f43874g, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0004\u0001ᔉ\u0000\u0002ᔈ\u0001\u0003ᔄ\u0002\u0004ဈ\u0003\bᐉ\n", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new nmq();
            case 4:
                return new nxl(f43874g);
            case 5:
                return f43874g;
            case 6:
                nzd nxmVar = f43875i;
                if (nxmVar == null) {
                    synchronized (nmq.class) {
                        nxmVar = f43875i;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43874g);
                            f43875i = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
