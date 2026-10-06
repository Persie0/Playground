package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nln extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final nln f43552e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f43553f;

    /* JADX INFO: renamed from: a */
    public int f43554a;

    /* JADX INFO: renamed from: b */
    public long f43555b;

    /* JADX INFO: renamed from: c */
    public String f43556c = "";

    /* JADX INFO: renamed from: d */
    public boolean f43557d;

    static {
        nln nlnVar = new nln();
        f43552e = nlnVar;
        nxq.m18130aa(nln.class, nlnVar);
    }

    private nln() {
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
                return m18129X(f43552e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new nln();
            case 4:
                return new nxl(f43552e);
            case 5:
                return f43552e;
            case 6:
                nzd nxmVar = f43553f;
                if (nxmVar == null) {
                    synchronized (nln.class) {
                        nxmVar = f43553f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43552e);
                            f43553f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
