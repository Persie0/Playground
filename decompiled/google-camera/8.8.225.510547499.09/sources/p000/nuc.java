package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nuc extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final nuc f44634b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f44635c;

    /* JADX INFO: renamed from: a */
    public String f44636a = "";

    static {
        nuc nucVar = new nuc();
        f44634b = nucVar;
        nxq.m18130aa(nuc.class, nucVar);
    }

    private nuc() {
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
                return m18129X(f44634b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"a"});
            case 3:
                return new nuc();
            case 4:
                return new nxl(f44634b);
            case 5:
                return f44634b;
            case 6:
                nzd nxmVar = f44635c;
                if (nxmVar == null) {
                    synchronized (nuc.class) {
                        nxmVar = f44635c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44634b);
                            f44635c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
