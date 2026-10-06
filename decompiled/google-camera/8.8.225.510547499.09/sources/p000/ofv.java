package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ofv extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final ofv f45883e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f45884f;

    /* JADX INFO: renamed from: a */
    public int f45885a;

    /* JADX INFO: renamed from: b */
    public float f45886b;

    /* JADX INFO: renamed from: c */
    public float f45887c;

    /* JADX INFO: renamed from: d */
    public float f45888d;

    static {
        ofv ofvVar = new ofv();
        f45883e = ofvVar;
        nxq.m18130aa(ofv.class, ofvVar);
    }

    private ofv() {
        nxj nxjVar = nxj.f44968b;
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
                return m18129X(f45883e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new ofv();
            case 4:
                return new nxl(f45883e);
            case 5:
                return f45883e;
            case 6:
                nzd nxmVar = f45884f;
                if (nxmVar == null) {
                    synchronized (ofv.class) {
                        nxmVar = f45884f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45883e);
                            f45884f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
