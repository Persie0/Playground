package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ngz extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final ngz f42267e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f42268f;

    /* JADX INFO: renamed from: a */
    public int f42269a;

    /* JADX INFO: renamed from: b */
    public String f42270b = "";

    /* JADX INFO: renamed from: c */
    public nxy f42271c = nzg.f45063b;

    /* JADX INFO: renamed from: d */
    public long f42272d;

    static {
        ngz ngzVar = new ngz();
        f42267e = ngzVar;
        nxq.m18130aa(ngz.class, ngzVar);
    }

    private ngz() {
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
                return m18129X(f42267e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဂ\u0001", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new ngz();
            case 4:
                return new nxl(f42267e);
            case 5:
                return f42267e;
            case 6:
                nzd nxmVar = f42268f;
                if (nxmVar == null) {
                    synchronized (ngz.class) {
                        nxmVar = f42268f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42267e);
                            f42268f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
