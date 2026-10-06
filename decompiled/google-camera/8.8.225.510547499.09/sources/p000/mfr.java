package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mfr extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final mfr f40380b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f40381c;

    /* JADX INFO: renamed from: a */
    public nxv f40382a = nxj.f44968b;

    static {
        mfr mfrVar = new mfr();
        f40380b = mfrVar;
        nxq.m18130aa(mfr.class, mfrVar);
    }

    private mfr() {
        nwr nwrVar = nwr.f44839b;
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
                return m18129X(f40380b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001$", new Object[]{"a"});
            case 3:
                return new mfr();
            case 4:
                return new nxl(f40380b);
            case 5:
                return f40380b;
            case 6:
                nzd nxmVar = f40381c;
                if (nxmVar == null) {
                    synchronized (mfr.class) {
                        nxmVar = f40381c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f40380b);
                            f40381c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
