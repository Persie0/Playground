package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lre extends nxq implements nyx {

    /* JADX INFO: renamed from: h */
    public static final lre f39061h;

    /* JADX INFO: renamed from: i */
    private static volatile nzd f39062i;

    /* JADX INFO: renamed from: a */
    public int f39063a;

    /* JADX INFO: renamed from: e */
    public long f39067e;

    /* JADX INFO: renamed from: f */
    public long f39068f;

    /* JADX INFO: renamed from: b */
    public String f39064b = "";

    /* JADX INFO: renamed from: c */
    public nwr f39065c = nwr.f44839b;

    /* JADX INFO: renamed from: d */
    public String f39066d = "";

    /* JADX INFO: renamed from: g */
    public nxy f39069g = nzg.f45063b;

    static {
        lre lreVar = new lre();
        f39061h = lreVar;
        nxq.m18130aa(lre.class, lreVar);
    }

    private lre() {
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
                return m18129X(f39061h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b\u0006ဂ\u0004", new Object[]{"a", "b", "c", "d", "e", "g", lrf.class, "f"});
            case 3:
                return new lre();
            case 4:
                return new nxl(f39061h);
            case 5:
                return f39061h;
            case 6:
                nzd nxmVar = f39062i;
                if (nxmVar == null) {
                    synchronized (lre.class) {
                        nxmVar = f39062i;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f39061h);
                            f39062i = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
