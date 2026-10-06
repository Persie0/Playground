package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ive extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final ive f32260c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f32261d;

    /* JADX INFO: renamed from: a */
    public int f32262a;

    /* JADX INFO: renamed from: b */
    public int f32263b;

    static {
        ive iveVar = new ive();
        f32260c = iveVar;
        nxq.m18130aa(ive.class, iveVar);
    }

    private ive() {
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
                return m18129X(f32260c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new ive();
            case 4:
                return new nxl(f32260c);
            case 5:
                return f32260c;
            case 6:
                nzd nxmVar = f32261d;
                if (nxmVar == null) {
                    synchronized (ive.class) {
                        nxmVar = f32261d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f32260c);
                            f32261d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
