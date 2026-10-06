package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pas extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final pas f47269d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f47270e;

    /* JADX INFO: renamed from: a */
    public int f47271a;

    /* JADX INFO: renamed from: b */
    public long f47272b;

    /* JADX INFO: renamed from: c */
    public int f47273c;

    static {
        pas pasVar = new pas();
        f47269d = pasVar;
        nxq.m18130aa(pas.class, pasVar);
    }

    private pas() {
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
                return m18129X(f47269d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဂ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", "c", pab.f47154g});
            case 3:
                return new pas();
            case 4:
                return new nxl(f47269d);
            case 5:
                return f47269d;
            case 6:
                nzd nxmVar = f47270e;
                if (nxmVar == null) {
                    synchronized (pas.class) {
                        nxmVar = f47270e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47269d);
                            f47270e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
