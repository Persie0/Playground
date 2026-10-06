package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ivn extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final ivn f32293c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f32294d;

    /* JADX INFO: renamed from: a */
    public int f32295a;

    /* JADX INFO: renamed from: b */
    public boolean f32296b;

    static {
        ivn ivnVar = new ivn();
        f32293c = ivnVar;
        nxq.m18130aa(ivn.class, ivnVar);
    }

    private ivn() {
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
                return m18129X(f32293c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new ivn();
            case 4:
                return new nxl(f32293c);
            case 5:
                return f32293c;
            case 6:
                nzd nxmVar = f32294d;
                if (nxmVar == null) {
                    synchronized (ivn.class) {
                        nxmVar = f32294d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f32293c);
                            f32294d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
