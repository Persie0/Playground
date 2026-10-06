package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oca extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final oca f45417f;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f45418g;

    /* JADX INFO: renamed from: a */
    public int f45419a;

    /* JADX INFO: renamed from: b */
    public float f45420b;

    /* JADX INFO: renamed from: c */
    public float f45421c;

    /* JADX INFO: renamed from: d */
    public float f45422d;

    /* JADX INFO: renamed from: e */
    public float f45423e;

    static {
        oca ocaVar = new oca();
        f45417f = ocaVar;
        nxq.m18130aa(oca.class, ocaVar);
    }

    private oca() {
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
                return m18129X(f45417f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new oca();
            case 4:
                return new nxl(f45417f);
            case 5:
                return f45417f;
            case 6:
                nzd nxmVar = f45418g;
                if (nxmVar == null) {
                    synchronized (oca.class) {
                        nxmVar = f45418g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45417f);
                            f45418g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
