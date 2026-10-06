package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lqe extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final lqe f38950d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f38951e;

    /* JADX INFO: renamed from: a */
    public int f38952a;

    /* JADX INFO: renamed from: b */
    public nxy f38953b = nzg.f45063b;

    /* JADX INFO: renamed from: c */
    public String f38954c = "";

    static {
        lqe lqeVar = new lqe();
        f38950d = lqeVar;
        nxq.m18130aa(lqe.class, lqeVar);
    }

    private lqe() {
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
                return m18129X(f38950d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"a", "b", "c"});
            case 3:
                return new lqe();
            case 4:
                return new nxl(f38950d);
            case 5:
                return f38950d;
            case 6:
                nzd nxmVar = f38951e;
                if (nxmVar == null) {
                    synchronized (lqe.class) {
                        nxmVar = f38951e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f38950d);
                            f38951e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
