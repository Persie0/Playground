package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ocj extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final ocj f45473b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f45474c;

    /* JADX INFO: renamed from: a */
    public nxy f45475a = nzg.f45063b;

    static {
        ocj ocjVar = new ocj();
        f45473b = ocjVar;
        nxq.m18130aa(ocj.class, ocjVar);
    }

    private ocj() {
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
                return m18129X(f45473b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", oci.class});
            case 3:
                return new ocj();
            case 4:
                return new nxl(f45473b);
            case 5:
                return f45473b;
            case 6:
                nzd nxmVar = f45474c;
                if (nxmVar == null) {
                    synchronized (ocj.class) {
                        nxmVar = f45474c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45473b);
                            f45474c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
