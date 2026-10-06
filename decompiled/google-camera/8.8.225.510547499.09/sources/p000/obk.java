package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class obk extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final obk f45310e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f45311f;

    /* JADX INFO: renamed from: a */
    public int f45312a;

    /* JADX INFO: renamed from: b */
    public int f45313b;

    /* JADX INFO: renamed from: c */
    public int f45314c;

    /* JADX INFO: renamed from: d */
    public nwr f45315d = nwr.f44839b;

    static {
        obk obkVar = new obk();
        f45310e = obkVar;
        nxq.m18130aa(obk.class, obkVar);
    }

    private obk() {
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
                return m18129X(f45310e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ည\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new obk();
            case 4:
                return new nxl(f45310e);
            case 5:
                return f45310e;
            case 6:
                nzd nxmVar = f45311f;
                if (nxmVar == null) {
                    synchronized (obk.class) {
                        nxmVar = f45311f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45310e);
                            f45311f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
