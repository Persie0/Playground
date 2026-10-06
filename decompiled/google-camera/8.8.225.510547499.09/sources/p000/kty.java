package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kty extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final kty f37194b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f37195c;

    /* JADX INFO: renamed from: a */
    public nyr f37196a = nyr.f45033a;

    static {
        kty ktyVar = new kty();
        f37194b = ktyVar;
        nxq.m18130aa(kty.class, ktyVar);
    }

    private kty() {
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
                return m18129X(f37194b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", ktx.f37193a});
            case 3:
                return new kty();
            case 4:
                return new nxl(f37194b);
            case 5:
                return f37194b;
            case 6:
                nzd nxmVar = f37195c;
                if (nxmVar == null) {
                    synchronized (kty.class) {
                        nxmVar = f37195c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f37194b);
                            f37195c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
