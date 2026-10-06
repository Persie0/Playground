package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nls extends nxq implements nyx {

    /* JADX INFO: renamed from: h */
    public static final nls f43586h;

    /* JADX INFO: renamed from: i */
    private static volatile nzd f43587i;

    /* JADX INFO: renamed from: a */
    public int f43588a;

    /* JADX INFO: renamed from: b */
    public boolean f43589b;

    /* JADX INFO: renamed from: c */
    public boolean f43590c;

    /* JADX INFO: renamed from: d */
    public long f43591d;

    /* JADX INFO: renamed from: e */
    public int f43592e;

    /* JADX INFO: renamed from: f */
    public int f43593f;

    /* JADX INFO: renamed from: g */
    public float f43594g;

    static {
        nls nlsVar = new nls();
        f43586h = nlsVar;
        nxq.m18130aa(nls.class, nlsVar);
    }

    private nls() {
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
                return m18129X(f43586h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004င\u0003\u0005င\u0004\u0006ခ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            case 3:
                return new nls();
            case 4:
                return new nxl(f43586h);
            case 5:
                return f43586h;
            case 6:
                nzd nxmVar = f43587i;
                if (nxmVar == null) {
                    synchronized (nls.class) {
                        nxmVar = f43587i;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43586h);
                            f43587i = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
