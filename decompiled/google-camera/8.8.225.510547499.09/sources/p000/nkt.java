package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nkt extends nxq implements nyx {

    /* JADX INFO: renamed from: h */
    public static final nkt f43315h;

    /* JADX INFO: renamed from: i */
    private static volatile nzd f43316i;

    /* JADX INFO: renamed from: a */
    public int f43317a;

    /* JADX INFO: renamed from: b */
    public int f43318b;

    /* JADX INFO: renamed from: c */
    public int f43319c;

    /* JADX INFO: renamed from: d */
    public int f43320d;

    /* JADX INFO: renamed from: e */
    public float f43321e;

    /* JADX INFO: renamed from: f */
    public long f43322f;

    /* JADX INFO: renamed from: g */
    public long f43323g;

    static {
        nkt nktVar = new nkt();
        f43315h = nktVar;
        nxq.m18130aa(nkt.class, nktVar);
    }

    private nkt() {
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
                nxu nxuVar = nks.f43293a;
                return m18129X(f43315h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ခ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"a", "b", nxuVar, "c", nxuVar, "d", nks.f43294b, "e", "f", "g"});
            case 3:
                return new nkt();
            case 4:
                return new nxl(f43315h);
            case 5:
                return f43315h;
            case 6:
                nzd nxmVar = f43316i;
                if (nxmVar == null) {
                    synchronized (nkt.class) {
                        nxmVar = f43316i;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43315h);
                            f43316i = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
