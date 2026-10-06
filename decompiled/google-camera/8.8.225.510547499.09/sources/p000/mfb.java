package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mfb extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final mfb f40297e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f40298f;

    /* JADX INFO: renamed from: a */
    public int f40299a;

    /* JADX INFO: renamed from: b */
    public String f40300b = "";

    /* JADX INFO: renamed from: c */
    public nxy f40301c = nzg.f45063b;

    /* JADX INFO: renamed from: d */
    public boolean f40302d;

    static {
        mfb mfbVar = new mfb();
        f40297e = mfbVar;
        nxq.m18130aa(mfb.class, mfbVar);
    }

    private mfb() {
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
                return m18129X(f40297e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဇ\u0001", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new mfb();
            case 4:
                return new nxl(f40297e);
            case 5:
                return f40297e;
            case 6:
                nzd nxmVar = f40298f;
                if (nxmVar == null) {
                    synchronized (mfb.class) {
                        nxmVar = f40298f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f40297e);
                            f40298f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
