package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class niw extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final niw f42814c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f42815d;

    /* JADX INFO: renamed from: a */
    public int f42816a;

    /* JADX INFO: renamed from: b */
    public int f42817b;

    static {
        niw niwVar = new niw();
        f42814c = niwVar;
        nxq.m18130aa(niw.class, niwVar);
    }

    private niw() {
        nxr nxrVar = nxr.f44982b;
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
                return m18129X(f42814c, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0000\u0005င\u0002", new Object[]{"a", "b"});
            case 3:
                return new niw();
            case 4:
                return new nxl(f42814c);
            case 5:
                return f42814c;
            case 6:
                nzd nxmVar = f42815d;
                if (nxmVar == null) {
                    synchronized (niw.class) {
                        nxmVar = f42815d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42814c);
                            f42815d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
