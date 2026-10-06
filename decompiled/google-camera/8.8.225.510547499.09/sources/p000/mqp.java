package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class mqp extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final mqp f41439f;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f41440g;

    /* JADX INFO: renamed from: a */
    public int f41441a;

    /* JADX INFO: renamed from: b */
    public int f41442b;

    /* JADX INFO: renamed from: c */
    public int f41443c;

    /* JADX INFO: renamed from: d */
    public int f41444d;

    /* JADX INFO: renamed from: e */
    public long f41445e;

    static {
        mqp mqpVar = new mqp();
        f41439f = mqpVar;
        nxq.m18130aa(mqp.class, mqpVar);
    }

    private mqp() {
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
                return m18129X(f41439f, "\u0000\u0000", null);
            case 3:
                return new mqp();
            case 4:
                return new nxl(f41439f);
            case 5:
                return f41439f;
            case 6:
                nzd nxmVar = f41440g;
                if (nxmVar == null) {
                    synchronized (mqp.class) {
                        nxmVar = f41440g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f41439f);
                            f41440g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
