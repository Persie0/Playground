package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ntp extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final ntp f44514d;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f44515f;

    /* JADX INFO: renamed from: a */
    public boolean f44516a;

    /* JADX INFO: renamed from: b */
    public int f44517b;

    /* JADX INFO: renamed from: c */
    public boolean f44518c;

    /* JADX INFO: renamed from: e */
    private int f44519e;

    static {
        ntp ntpVar = new ntp();
        f44514d = ntpVar;
        nxq.m18130aa(ntp.class, ntpVar);
    }

    private ntp() {
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
                return m18129X(f44514d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဇ\u0002", new Object[]{"e", "a", "b", "c"});
            case 3:
                return new ntp();
            case 4:
                return new nxl(f44514d);
            case 5:
                return f44514d;
            case 6:
                nzd nxmVar = f44515f;
                if (nxmVar == null) {
                    synchronized (ntp.class) {
                        nxmVar = f44515f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44514d);
                            f44515f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
