package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ivg extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final ivg f32265a;

    /* JADX INFO: renamed from: b */
    private static volatile nzd f32266b;

    static {
        ivg ivgVar = new ivg();
        f32265a = ivgVar;
        nxq.m18130aa(ivg.class, ivgVar);
    }

    private ivg() {
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
                return m18129X(f32265a, "\u0001\u0000", null);
            case 3:
                return new ivg();
            case 4:
                return new nxl(f32265a);
            case 5:
                return f32265a;
            case 6:
                nzd nxmVar = f32266b;
                if (nxmVar == null) {
                    synchronized (ivg.class) {
                        nxmVar = f32266b;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f32265a);
                            f32266b = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
