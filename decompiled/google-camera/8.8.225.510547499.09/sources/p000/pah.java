package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pah extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final pah f47196d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f47197e;

    /* JADX INFO: renamed from: a */
    public int f47198a;

    /* JADX INFO: renamed from: b */
    public nxy f47199b = nzg.f45063b;

    /* JADX INFO: renamed from: c */
    public pag f47200c;

    static {
        pah pahVar = new pah();
        f47196d = pahVar;
        nxq.m18130aa(pah.class, pahVar);
    }

    private pah() {
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
                return m18129X(f47196d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဉ\u0000", new Object[]{"a", "b", "c"});
            case 3:
                return new pah();
            case 4:
                return new nxl(f47196d);
            case 5:
                return f47196d;
            case 6:
                nzd nxmVar = f47197e;
                if (nxmVar == null) {
                    synchronized (pah.class) {
                        nxmVar = f47197e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47196d);
                            f47197e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
