package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nuf extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final nuf f44645d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f44646e;

    /* JADX INFO: renamed from: a */
    public int f44647a;

    /* JADX INFO: renamed from: b */
    public nud f44648b;

    /* JADX INFO: renamed from: c */
    public String f44649c = "";

    static {
        nuf nufVar = new nuf();
        f44645d = nufVar;
        nxq.m18130aa(nuf.class, nufVar);
    }

    private nuf() {
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
                return m18129X(f44645d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\t\u0003Ȉ", new Object[]{"a", "b", "c"});
            case 3:
                return new nuf();
            case 4:
                return new nxl(f44645d);
            case 5:
                return f44645d;
            case 6:
                nzd nxmVar = f44646e;
                if (nxmVar == null) {
                    synchronized (nuf.class) {
                        nxmVar = f44646e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44645d);
                            f44646e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
