package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nud extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final nud f44637b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f44638c;

    /* JADX INFO: renamed from: a */
    public nxy f44639a = nzg.f45063b;

    static {
        nud nudVar = new nud();
        f44637b = nudVar;
        nxq.m18130aa(nud.class, nudVar);
    }

    private nud() {
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
                return m18129X(f44637b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", nug.class});
            case 3:
                return new nud();
            case 4:
                return new nxl(f44637b);
            case 5:
                return f44637b;
            case 6:
                nzd nxmVar = f44638c;
                if (nxmVar == null) {
                    synchronized (nud.class) {
                        nxmVar = f44638c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44637b);
                            f44638c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
