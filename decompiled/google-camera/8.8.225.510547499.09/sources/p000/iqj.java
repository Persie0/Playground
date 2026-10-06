package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iqj extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final iqj f31792b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f31793c;

    /* JADX INFO: renamed from: a */
    public String f31794a = "";

    static {
        iqj iqjVar = new iqj();
        f31792b = iqjVar;
        nxq.m18130aa(iqj.class, iqjVar);
    }

    private iqj() {
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
                return m18129X(f31792b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new iqj();
            case 4:
                return new nxl(f31792b);
            case 5:
                return f31792b;
            case 6:
                nzd nxmVar = f31793c;
                if (nxmVar == null) {
                    synchronized (iqj.class) {
                        nxmVar = f31793c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f31792b);
                            f31793c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
