package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kwy extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final kwy f37584c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f37585d;

    /* JADX INFO: renamed from: a */
    public int f37586a;

    /* JADX INFO: renamed from: b */
    public boolean f37587b;

    static {
        kwy kwyVar = new kwy();
        f37584c = kwyVar;
        nxq.m18130aa(kwy.class, kwyVar);
    }

    private kwy() {
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
                return m18129X(f37584c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0001", new Object[]{"a", "b"});
            case 3:
                return new kwy();
            case 4:
                return new nxl(f37584c);
            case 5:
                return f37584c;
            case 6:
                nzd nxmVar = f37585d;
                if (nxmVar == null) {
                    synchronized (kwy.class) {
                        nxmVar = f37585d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f37584c);
                            f37585d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
