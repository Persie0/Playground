package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ofx extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final ofx f45891d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f45892e;

    /* JADX INFO: renamed from: a */
    public int f45893a;

    /* JADX INFO: renamed from: b */
    public String f45894b = "";

    /* JADX INFO: renamed from: c */
    public ngy f45895c;

    static {
        ofx ofxVar = new ofx();
        f45891d = ofxVar;
        nxq.m18130aa(ofx.class, ofxVar);
    }

    private ofx() {
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
                return m18129X(f45891d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new ofx();
            case 4:
                return new nxl(f45891d);
            case 5:
                return f45891d;
            case 6:
                nzd nxmVar = f45892e;
                if (nxmVar == null) {
                    synchronized (ofx.class) {
                        nxmVar = f45892e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45891d);
                            f45892e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
