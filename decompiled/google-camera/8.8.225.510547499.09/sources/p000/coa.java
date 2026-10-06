package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class coa extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final coa f6414c;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f6415e;

    /* JADX INFO: renamed from: d */
    private int f6418d;

    /* JADX INFO: renamed from: b */
    public nyr f6417b = nyr.f45033a;

    /* JADX INFO: renamed from: a */
    public String f6416a = "";

    static {
        coa coaVar = new coa();
        f6414c = coaVar;
        nxq.m18130aa(coa.class, coaVar);
    }

    private coa() {
        nzg nzgVar = nzg.f45063b;
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
                return m18129X(f6414c, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ለ\u0000\u00022", new Object[]{"d", "a", "b", cnz.f6413a});
            case 3:
                return new coa();
            case 4:
                return new nxl(f6414c);
            case 5:
                return f6414c;
            case 6:
                nzd nxmVar = f6415e;
                if (nxmVar == null) {
                    synchronized (coa.class) {
                        nxmVar = f6415e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f6414c);
                            f6415e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
