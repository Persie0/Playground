package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ivo extends nxo implements nyx {

    /* JADX INFO: renamed from: b */
    public static final ivo f32297b;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f32298e;

    /* JADX INFO: renamed from: c */
    private int f32300c;

    /* JADX INFO: renamed from: d */
    private byte f32301d = 2;

    /* JADX INFO: renamed from: a */
    public int f32299a = 1;

    static {
        ivo ivoVar = new ivo();
        f32297b = ivoVar;
        nxq.m18130aa(ivo.class, ivoVar);
    }

    private ivo() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f32301d);
            case 1:
            default:
                this.f32301d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f32297b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"c", "a", kva.f37288b});
            case 3:
                return new ivo();
            case 4:
                return new nxn(f32297b);
            case 5:
                return f32297b;
            case 6:
                nzd nxmVar = f32298e;
                if (nxmVar == null) {
                    synchronized (ivo.class) {
                        nxmVar = f32298e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f32297b);
                            f32298e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
