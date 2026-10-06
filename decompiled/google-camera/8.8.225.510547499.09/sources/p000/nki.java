package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nki extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final nki f43208d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f43209e;

    /* JADX INFO: renamed from: a */
    public int f43210a;

    /* JADX INFO: renamed from: b */
    public int f43211b;

    /* JADX INFO: renamed from: c */
    public nxy f43212c = nzg.f45063b;

    static {
        nki nkiVar = new nki();
        f43208d = nkiVar;
        nxq.m18130aa(nki.class, nkiVar);
    }

    private nki() {
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
                return m18129X(f43208d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"a", "b", njy.f43123m, "c", nkh.class});
            case 3:
                return new nki();
            case 4:
                return new nxl(f43208d);
            case 5:
                return f43208d;
            case 6:
                nzd nxmVar = f43209e;
                if (nxmVar == null) {
                    synchronized (nki.class) {
                        nxmVar = f43209e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43208d);
                            f43209e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
