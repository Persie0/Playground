package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nss extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final nss f44437b;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f44438d;

    /* JADX INFO: renamed from: c */
    private byte f44440c = 2;

    /* JADX INFO: renamed from: a */
    public nxy f44439a = nzg.f45063b;

    static {
        nss nssVar = new nss();
        f44437b = nssVar;
        nxq.m18130aa(nss.class, nssVar);
    }

    private nss() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f44440c);
            case 1:
            default:
                this.f44440c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f44437b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", nsr.class});
            case 3:
                return new nss();
            case 4:
                return new nxl(f44437b);
            case 5:
                return f44437b;
            case 6:
                nzd nxmVar = f44438d;
                if (nxmVar == null) {
                    synchronized (nss.class) {
                        nxmVar = f44438d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44437b);
                            f44438d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
