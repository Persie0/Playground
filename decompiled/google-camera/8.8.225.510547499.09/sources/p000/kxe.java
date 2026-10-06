package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kxe extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final kxe f37627c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f37628d;

    /* JADX INFO: renamed from: a */
    public double f37629a;

    /* JADX INFO: renamed from: b */
    public double f37630b;

    static {
        kxe kxeVar = new kxe();
        f37627c = kxeVar;
        nxq.m18130aa(kxe.class, kxeVar);
    }

    private kxe() {
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
                return m18129X(f37627c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"a", "b"});
            case 3:
                return new kxe();
            case 4:
                return new nxl(f37627c);
            case 5:
                return f37627c;
            case 6:
                nzd nxmVar = f37628d;
                if (nxmVar == null) {
                    synchronized (kxe.class) {
                        nxmVar = f37628d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f37627c);
                            f37628d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
