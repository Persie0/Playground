package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mfl extends nxq implements nyx {

    /* JADX INFO: renamed from: k */
    public static final mfl f40347k;

    /* JADX INFO: renamed from: m */
    private static volatile nzd f40348m;

    /* JADX INFO: renamed from: a */
    public int f40349a;

    /* JADX INFO: renamed from: c */
    public Object f40351c;

    /* JADX INFO: renamed from: d */
    public boolean f40352d;

    /* JADX INFO: renamed from: h */
    public float f40356h;

    /* JADX INFO: renamed from: i */
    public float f40357i;

    /* JADX INFO: renamed from: j */
    public float f40358j;

    /* JADX INFO: renamed from: b */
    public int f40350b = 0;

    /* JADX INFO: renamed from: l */
    private byte f40359l = 2;

    /* JADX INFO: renamed from: e */
    public nxy f40353e = nzg.f45063b;

    /* JADX INFO: renamed from: f */
    public nxv f40354f = nxj.f44968b;

    /* JADX INFO: renamed from: g */
    public float f40355g = 0.15f;

    static {
        mfl mflVar = new mfl();
        f40347k = mflVar;
        nxq.m18130aa(mfl.class, mflVar);
    }

    private mfl() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f40359l);
            case 1:
            default:
                this.f40359l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f40347k, "\u0001\b\u0001\u0001\u0002\u000b\b\u0000\u0002\u0001\u0002ᐼ\u0000\u0003ဇ\u0000\u0004\u001b\u0005\u0013\u0006ခ\u0003\u0007ခ\u0004\bခ\u0005\u000bခ\u0006", new Object[]{"c", "b", "a", mfm.class, "d", "e", mfi.class, "f", "g", "h", "i", "j"});
            case 3:
                return new mfl();
            case 4:
                return new nxl(f40347k);
            case 5:
                return f40347k;
            case 6:
                nzd nxmVar = f40348m;
                if (nxmVar == null) {
                    synchronized (mfl.class) {
                        nxmVar = f40348m;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f40347k);
                            f40348m = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
