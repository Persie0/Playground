package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kwe extends nxo implements nyx {

    /* JADX INFO: renamed from: e */
    public static final kwe f37496e;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f37497g;

    /* JADX INFO: renamed from: a */
    public int f37498a;

    /* JADX INFO: renamed from: b */
    public kwd f37499b;

    /* JADX INFO: renamed from: c */
    public kwc f37500c;

    /* JADX INFO: renamed from: d */
    public kwb f37501d;

    /* JADX INFO: renamed from: f */
    private byte f37502f = 2;

    static {
        kwe kweVar = new kwe();
        f37496e = kweVar;
        nxq.m18130aa(kwe.class, kweVar);
    }

    private kwe() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f37502f);
            case 1:
            default:
                this.f37502f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f37496e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new kwe();
            case 4:
                return new nxn(f37496e);
            case 5:
                return f37496e;
            case 6:
                nzd nxmVar = f37497g;
                if (nxmVar == null) {
                    synchronized (kwe.class) {
                        nxmVar = f37497g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f37496e);
                            f37497g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
