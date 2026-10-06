package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kxj extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final kxj f37650a;

    /* JADX INFO: renamed from: b */
    private static volatile nzd f37651b;

    static {
        kxj kxjVar = new kxj();
        f37650a = kxjVar;
        nxq.m18130aa(kxj.class, kxjVar);
    }

    private kxj() {
        nzg nzgVar = nzg.f45063b;
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
                return m18129X(f37650a, "\u0001\u0000", null);
            case 3:
                return new kxj();
            case 4:
                return new nxl(f37650a);
            case 5:
                return f37650a;
            case 6:
                nzd nxmVar = f37651b;
                if (nxmVar == null) {
                    synchronized (kxj.class) {
                        nxmVar = f37651b;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f37650a);
                            f37651b = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
