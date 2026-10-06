package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mfh extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final mfh f40325d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f40326e;

    /* JADX INFO: renamed from: a */
    public int f40327a;

    /* JADX INFO: renamed from: b */
    public float f40328b;

    /* JADX INFO: renamed from: c */
    public String f40329c = "";

    static {
        mfh mfhVar = new mfh();
        f40325d = mfhVar;
        nxq.m18130aa(mfh.class, mfhVar);
    }

    private mfh() {
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
                return m18129X(f40325d, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002ခ\u0001\u0004ဈ\u0003", new Object[]{"a", "b", "c"});
            case 3:
                return new mfh();
            case 4:
                return new nxl(f40325d);
            case 5:
                return f40325d;
            case 6:
                nzd nxmVar = f40326e;
                if (nxmVar == null) {
                    synchronized (mfh.class) {
                        nxmVar = f40326e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f40325d);
                            f40326e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
