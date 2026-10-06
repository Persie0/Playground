package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mfm extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final mfm f40360d;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f40361f;

    /* JADX INFO: renamed from: a */
    public int f40362a;

    /* JADX INFO: renamed from: b */
    public oct f40363b;

    /* JADX INFO: renamed from: c */
    public float f40364c;

    /* JADX INFO: renamed from: e */
    private byte f40365e = 2;

    static {
        mfm mfmVar = new mfm();
        f40360d = mfmVar;
        nxq.m18130aa(mfm.class, mfmVar);
    }

    private mfm() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f40365e);
            case 1:
            default:
                this.f40365e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f40360d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ခ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new mfm();
            case 4:
                return new nxl(f40360d);
            case 5:
                return f40360d;
            case 6:
                nzd nxmVar = f40361f;
                if (nxmVar == null) {
                    synchronized (mfm.class) {
                        nxmVar = f40361f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f40360d);
                            f40361f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
