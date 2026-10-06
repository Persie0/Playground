package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mej extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final mej f40179e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f40180f;

    /* JADX INFO: renamed from: a */
    public int f40181a;

    /* JADX INFO: renamed from: b */
    public int f40182b = 0;

    /* JADX INFO: renamed from: c */
    public Object f40183c;

    /* JADX INFO: renamed from: d */
    public long f40184d;

    static {
        mej mejVar = new mej();
        f40179e = mejVar;
        nxq.m18130aa(mej.class, mejVar);
    }

    private mej() {
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
                return m18129X(f40179e, "\u0001\r\u0001\u0001\u0001\r\r\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဴ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nဴ\u0000\u000bဴ\u0000\fဴ\u0000\rဴ\u0000", new Object[]{"c", "b", "a", "d", mek.class, mek.class, mek.class, mek.class, mek.class, mei.class, mei.class});
            case 3:
                return new mej();
            case 4:
                return new nxl(f40179e);
            case 5:
                return f40179e;
            case 6:
                nzd nxmVar = f40180f;
                if (nxmVar == null) {
                    synchronized (mej.class) {
                        nxmVar = f40180f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f40179e);
                            f40180f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
