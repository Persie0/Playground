package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ivc extends nxo implements nyx {

    /* JADX INFO: renamed from: c */
    public static final ivc f32254c;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f32255e;

    /* JADX INFO: renamed from: a */
    public int f32256a;

    /* JADX INFO: renamed from: b */
    public int f32257b;

    /* JADX INFO: renamed from: d */
    private byte f32258d = 2;

    static {
        ivc ivcVar = new ivc();
        f32254c = ivcVar;
        nxq.m18130aa(ivc.class, ivcVar);
    }

    private ivc() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f32258d);
            case 1:
            default:
                this.f32258d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f32254c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", ivb.f32253a});
            case 3:
                return new ivc();
            case 4:
                return new nxn(f32254c);
            case 5:
                return f32254c;
            case 6:
                nzd nxmVar = f32255e;
                if (nxmVar == null) {
                    synchronized (ivc.class) {
                        nxmVar = f32255e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f32254c);
                            f32255e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
