package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ivl extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final ivl f32285e;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f32286g;

    /* JADX INFO: renamed from: a */
    public int f32287a;

    /* JADX INFO: renamed from: b */
    public ivk f32288b;

    /* JADX INFO: renamed from: c */
    public ivj f32289c;

    /* JADX INFO: renamed from: d */
    public int f32290d = -1;

    /* JADX INFO: renamed from: f */
    private int f32291f;

    static {
        ivl ivlVar = new ivl();
        f32285e = ivlVar;
        nxq.m18130aa(ivl.class, ivlVar);
    }

    private ivl() {
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
                return m18129X(f32285e, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0007ဌ\u0005", new Object[]{"f", "a", "b", "c", "d", kva.f37287a});
            case 3:
                return new ivl();
            case 4:
                return new nxl(f32285e);
            case 5:
                return f32285e;
            case 6:
                nzd nxmVar = f32286g;
                if (nxmVar == null) {
                    synchronized (ivl.class) {
                        nxmVar = f32286g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f32285e);
                            f32286g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
