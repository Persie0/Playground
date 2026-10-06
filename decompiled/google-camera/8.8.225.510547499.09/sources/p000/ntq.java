package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ntq extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final ntq f44520f;

    /* JADX INFO: renamed from: h */
    private static volatile nzd f44521h;

    /* JADX INFO: renamed from: a */
    public boolean f44522a;

    /* JADX INFO: renamed from: b */
    public boolean f44523b;

    /* JADX INFO: renamed from: c */
    public int f44524c = -1;

    /* JADX INFO: renamed from: d */
    public float f44525d = -1.0f;

    /* JADX INFO: renamed from: e */
    public float f44526e = -1.0f;

    /* JADX INFO: renamed from: g */
    private int f44527g;

    static {
        ntq ntqVar = new ntq();
        f44520f = ntqVar;
        nxq.m18130aa(ntq.class, ntqVar);
    }

    private ntq() {
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
                return m18129X(f44520f, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004ခ\u0003\u0007ခ\u0006", new Object[]{"g", "a", "b", "c", "d", "e"});
            case 3:
                return new ntq();
            case 4:
                return new nxl(f44520f);
            case 5:
                return f44520f;
            case 6:
                nzd nxmVar = f44521h;
                if (nxmVar == null) {
                    synchronized (ntq.class) {
                        nxmVar = f44521h;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44520f);
                            f44521h = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
