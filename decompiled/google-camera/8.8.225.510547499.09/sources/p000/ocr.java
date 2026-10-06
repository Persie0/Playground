package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ocr extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final ocr f45515e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f45516f;

    /* JADX INFO: renamed from: a */
    public int f45517a;

    /* JADX INFO: renamed from: b */
    public ocs f45518b;

    /* JADX INFO: renamed from: c */
    public ocs f45519c;

    /* JADX INFO: renamed from: d */
    public ocs f45520d;

    static {
        ocr ocrVar = new ocr();
        f45515e = ocrVar;
        nxq.m18130aa(ocr.class, ocrVar);
    }

    private ocr() {
        nwr nwrVar = nwr.f44839b;
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
                return m18129X(f45515e, "\u0001\u0003\u0000\u0001\t\u000b\u0003\u0000\u0000\u0000\tဉ\u0002\nဉ\u0005\u000bဉ\b", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new ocr();
            case 4:
                return new nxl(f45515e);
            case 5:
                return f45515e;
            case 6:
                nzd nxmVar = f45516f;
                if (nxmVar == null) {
                    synchronized (ocr.class) {
                        nxmVar = f45516f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45515e);
                            f45516f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
