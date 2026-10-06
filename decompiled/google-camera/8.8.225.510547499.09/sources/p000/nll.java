package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nll extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final nll f43542d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f43543e;

    /* JADX INFO: renamed from: a */
    public int f43544a;

    /* JADX INFO: renamed from: b */
    public int f43545b;

    /* JADX INFO: renamed from: c */
    public int f43546c;

    static {
        nll nllVar = new nll();
        f43542d = nllVar;
        nxq.m18130aa(nll.class, nllVar);
    }

    private nll() {
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
                return m18129X(f43542d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", nks.f43307o, "c", nks.f43306n});
            case 3:
                return new nll();
            case 4:
                return new nxl(f43542d);
            case 5:
                return f43542d;
            case 6:
                nzd nxmVar = f43543e;
                if (nxmVar == null) {
                    synchronized (nll.class) {
                        nxmVar = f43543e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43542d);
                            f43543e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
