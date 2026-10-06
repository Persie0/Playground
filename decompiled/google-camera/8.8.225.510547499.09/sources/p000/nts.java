package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nts extends nxq implements nyx {

    /* JADX INFO: renamed from: i */
    public static final nts f44534i;

    /* JADX INFO: renamed from: k */
    private static volatile nzd f44535k;

    /* JADX INFO: renamed from: b */
    public float f44537b;

    /* JADX INFO: renamed from: c */
    public float f44538c;

    /* JADX INFO: renamed from: d */
    public float f44539d;

    /* JADX INFO: renamed from: e */
    public float f44540e;

    /* JADX INFO: renamed from: f */
    public float f44541f;

    /* JADX INFO: renamed from: j */
    private int f44544j;

    /* JADX INFO: renamed from: a */
    public int f44536a = 1;

    /* JADX INFO: renamed from: g */
    public float f44542g = -1.0f;

    /* JADX INFO: renamed from: h */
    public float f44543h = -1.0f;

    static {
        nts ntsVar = new nts();
        f44534i = ntsVar;
        nxq.m18130aa(nts.class, ntsVar);
    }

    private nts() {
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
                return m18129X(f44534i, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007", new Object[]{"j", "a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new nts();
            case 4:
                return new nxl(f44534i);
            case 5:
                return f44534i;
            case 6:
                nzd nxmVar = f44535k;
                if (nxmVar == null) {
                    synchronized (nts.class) {
                        nxmVar = f44535k;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44534i);
                            f44535k = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
