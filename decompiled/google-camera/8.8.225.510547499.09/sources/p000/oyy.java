package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oyy extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final oyy f46889b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f46890c;

    /* JADX INFO: renamed from: a */
    public nxw f46891a = nxr.f44982b;

    static {
        oyy oyyVar = new oyy();
        f46889b = oyyVar;
        nxq.m18130aa(oyy.class, oyyVar);
    }

    private oyy() {
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
                return m18129X(f46889b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"a", oau.f45202q});
            case 3:
                return new oyy();
            case 4:
                return new nxl(f46889b);
            case 5:
                return f46889b;
            case 6:
                nzd nxmVar = f46890c;
                if (nxmVar == null) {
                    synchronized (oyy.class) {
                        nxmVar = f46890c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f46889b);
                            f46890c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
