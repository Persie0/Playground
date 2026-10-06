package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kwc extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final kwc f37486d;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f37487f;

    /* JADX INFO: renamed from: a */
    public int f37488a;

    /* JADX INFO: renamed from: b */
    public mfg f37489b;

    /* JADX INFO: renamed from: c */
    public mfq f37490c;

    /* JADX INFO: renamed from: e */
    private byte f37491e = 2;

    static {
        kwc kwcVar = new kwc();
        f37486d = kwcVar;
        nxq.m18130aa(kwc.class, kwcVar);
    }

    private kwc() {
        nzg nzgVar = nzg.f45063b;
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f37491e);
            case 1:
            default:
                this.f37491e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f37486d, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0004ဉ\u0002", new Object[]{"a", "b", "c"});
            case 3:
                return new kwc();
            case 4:
                return new nxl(f37486d);
            case 5:
                return f37486d;
            case 6:
                nzd nxmVar = f37487f;
                if (nxmVar == null) {
                    synchronized (kwc.class) {
                        nxmVar = f37487f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f37486d);
                            f37487f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
