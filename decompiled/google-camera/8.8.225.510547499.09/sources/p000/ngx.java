package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ngx extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final ngx f42242a;

    /* JADX INFO: renamed from: b */
    private static volatile nzd f42243b;

    static {
        ngx ngxVar = new ngx();
        f42242a = ngxVar;
        nxq.m18130aa(ngx.class, ngxVar);
    }

    private ngx() {
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
                return m18129X(f42242a, "\u0001\u0000", null);
            case 3:
                return new ngx();
            case 4:
                return new nxl(f42242a);
            case 5:
                return f42242a;
            case 6:
                nzd nxmVar = f42243b;
                if (nxmVar == null) {
                    synchronized (ngx.class) {
                        nxmVar = f42243b;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42242a);
                            f42243b = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
