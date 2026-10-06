package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kxa extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final kxa f37595d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f37596e;

    /* JADX INFO: renamed from: a */
    public int f37597a;

    /* JADX INFO: renamed from: b */
    public String f37598b = "";

    /* JADX INFO: renamed from: c */
    public float f37599c;

    static {
        kxa kxaVar = new kxa();
        f37595d = kxaVar;
        nxq.m18130aa(kxa.class, kxaVar);
    }

    private kxa() {
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
                return m18129X(f37595d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new kxa();
            case 4:
                return new nxl(f37595d);
            case 5:
                return f37595d;
            case 6:
                nzd nxmVar = f37596e;
                if (nxmVar == null) {
                    synchronized (kxa.class) {
                        nxmVar = f37596e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f37595d);
                            f37596e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
