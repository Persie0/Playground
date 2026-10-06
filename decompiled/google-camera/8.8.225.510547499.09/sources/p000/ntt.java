package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ntt extends nxq implements nyx {

    /* JADX INFO: renamed from: j */
    public static final ntt f44545j;

    /* JADX INFO: renamed from: l */
    private static volatile nzd f44546l;

    /* JADX INFO: renamed from: a */
    public float f44547a;

    /* JADX INFO: renamed from: b */
    public float f44548b;

    /* JADX INFO: renamed from: c */
    public float f44549c;

    /* JADX INFO: renamed from: d */
    public float f44550d;

    /* JADX INFO: renamed from: e */
    public float f44551e;

    /* JADX INFO: renamed from: f */
    public float f44552f;

    /* JADX INFO: renamed from: g */
    public float f44553g;

    /* JADX INFO: renamed from: h */
    public float f44554h;

    /* JADX INFO: renamed from: i */
    public float f44555i;

    /* JADX INFO: renamed from: k */
    private int f44556k;

    static {
        ntt nttVar = new ntt();
        f44545j = nttVar;
        nxq.m18130aa(ntt.class, nttVar);
    }

    private ntt() {
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
                return m18129X(f44545j, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\fခ\u000b", new Object[]{"k", "a", "b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new ntt();
            case 4:
                return new nxl(f44545j);
            case 5:
                return f44545j;
            case 6:
                nzd nxmVar = f44546l;
                if (nxmVar == null) {
                    synchronized (ntt.class) {
                        nxmVar = f44546l;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44545j);
                            f44546l = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
