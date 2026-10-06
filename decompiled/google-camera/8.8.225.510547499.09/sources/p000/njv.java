package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class njv extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final njv f43091d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f43092e;

    /* JADX INFO: renamed from: a */
    public int f43093a;

    /* JADX INFO: renamed from: b */
    public String f43094b = "";

    /* JADX INFO: renamed from: c */
    public nxy f43095c = nzg.f45063b;

    static {
        njv njvVar = new njv();
        f43091d = njvVar;
        nxq.m18130aa(njv.class, njvVar);
    }

    private njv() {
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
                return m18129X(f43091d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"a", "b", "c", njw.class});
            case 3:
                return new njv();
            case 4:
                return new nxl(f43091d);
            case 5:
                return f43091d;
            case 6:
                nzd nxmVar = f43092e;
                if (nxmVar == null) {
                    synchronized (njv.class) {
                        nxmVar = f43092e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43091d);
                            f43092e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
