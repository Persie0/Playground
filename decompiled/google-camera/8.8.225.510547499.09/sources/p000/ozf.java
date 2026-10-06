package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ozf extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final ozf f46935a;

    /* JADX INFO: renamed from: b */
    private static volatile nzd f46936b;

    static {
        ozf ozfVar = new ozf();
        f46935a = ozfVar;
        nxq.m18130aa(ozf.class, ozfVar);
    }

    private ozf() {
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
                return m18129X(f46935a, "\u0001\u0000", null);
            case 3:
                return new ozf();
            case 4:
                return new nxl(f46935a);
            case 5:
                return f46935a;
            case 6:
                nzd nxmVar = f46936b;
                if (nxmVar == null) {
                    synchronized (ozf.class) {
                        nxmVar = f46936b;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f46935a);
                            f46936b = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
