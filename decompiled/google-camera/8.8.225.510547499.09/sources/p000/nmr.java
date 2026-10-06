package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nmr extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final nmr f43883f;

    /* JADX INFO: renamed from: h */
    private static volatile nzd f43884h;

    /* JADX INFO: renamed from: a */
    public int f43885a;

    /* JADX INFO: renamed from: e */
    public int f43889e;

    /* JADX INFO: renamed from: g */
    private byte f43890g = 2;

    /* JADX INFO: renamed from: b */
    public String f43886b = "";

    /* JADX INFO: renamed from: c */
    public String f43887c = "";

    /* JADX INFO: renamed from: d */
    public String f43888d = "";

    static {
        nmr nmrVar = new nmr();
        f43883f = nmrVar;
        nxq.m18130aa(nmr.class, nmrVar);
    }

    private nmr() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f43890g);
            case 1:
            default:
                this.f43890g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f43883f, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0003\u0005ᔈ\u0000\u0006ᔈ\u0001\u0007ဈ\u0002\bᔄ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new nmr();
            case 4:
                return new nxl(f43883f);
            case 5:
                return f43883f;
            case 6:
                nzd nxmVar = f43884h;
                if (nxmVar == null) {
                    synchronized (nmr.class) {
                        nxmVar = f43884h;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43883f);
                            f43884h = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
