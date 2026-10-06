package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class oci extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final oci f45468d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f45469e;

    /* JADX INFO: renamed from: a */
    public int f45470a;

    /* JADX INFO: renamed from: b */
    public och f45471b;

    /* JADX INFO: renamed from: c */
    public nxy f45472c;

    static {
        oci ociVar = new oci();
        f45468d = ociVar;
        nxq.m18130aa(oci.class, ociVar);
    }

    private oci() {
        nxj nxjVar = nxj.f44968b;
        nxr nxrVar = nxr.f44982b;
        this.f45472c = nzg.f45063b;
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
                return m18129X(f45468d, "\u0001\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0005\u001a", new Object[]{"a", "b", "c"});
            case 3:
                return new oci();
            case 4:
                return new nxl(f45468d);
            case 5:
                return f45468d;
            case 6:
                nzd nxmVar = f45469e;
                if (nxmVar == null) {
                    synchronized (oci.class) {
                        nxmVar = f45469e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45468d);
                            f45469e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
