package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ivh extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final ivh f32267a;

    /* JADX INFO: renamed from: b */
    private static volatile nzd f32268b;

    static {
        ivh ivhVar = new ivh();
        f32267a = ivhVar;
        nxq.m18130aa(ivh.class, ivhVar);
    }

    private ivh() {
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
                return m18129X(f32267a, "\u0001\u0000", null);
            case 3:
                return new ivh();
            case 4:
                return new nxl(f32267a);
            case 5:
                return f32267a;
            case 6:
                nzd nxmVar = f32268b;
                if (nxmVar == null) {
                    synchronized (ivh.class) {
                        nxmVar = f32268b;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f32267a);
                            f32268b = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
