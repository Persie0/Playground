package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ivk extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final ivk f32278f;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f32279g;

    /* JADX INFO: renamed from: a */
    public int f32280a;

    /* JADX INFO: renamed from: b */
    public int f32281b;

    /* JADX INFO: renamed from: c */
    public int f32282c;

    /* JADX INFO: renamed from: d */
    public int f32283d;

    /* JADX INFO: renamed from: e */
    public int f32284e;

    static {
        ivk ivkVar = new ivk();
        f32278f = ivkVar;
        nxq.m18130aa(ivk.class, ivkVar);
    }

    private ivk() {
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
                return m18129X(f32278f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new ivk();
            case 4:
                return new nxl(f32278f);
            case 5:
                return f32278f;
            case 6:
                nzd nxmVar = f32279g;
                if (nxmVar == null) {
                    synchronized (ivk.class) {
                        nxmVar = f32279g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f32278f);
                            f32279g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
