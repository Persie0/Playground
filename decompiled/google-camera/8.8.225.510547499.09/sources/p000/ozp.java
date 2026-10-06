package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ozp extends nxo implements nyx {

    /* JADX INFO: renamed from: g */
    public static final ozp f47049g;

    /* JADX INFO: renamed from: i */
    private static volatile nzd f47050i;

    /* JADX INFO: renamed from: a */
    public int f47051a;

    /* JADX INFO: renamed from: b */
    public ozo f47052b;

    /* JADX INFO: renamed from: c */
    public ozz f47053c;

    /* JADX INFO: renamed from: d */
    public int f47054d;

    /* JADX INFO: renamed from: e */
    public ozn f47055e;

    /* JADX INFO: renamed from: h */
    private byte f47057h = 2;

    /* JADX INFO: renamed from: f */
    public String f47056f = "";

    static {
        ozp ozpVar = new ozp();
        f47049g = ozpVar;
        nxq.m18130aa(ozp.class, ozpVar);
    }

    private ozp() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f47057h);
            case 1:
            default:
                this.f47057h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f47049g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ဉ\u0003\u0005ဈ\u0004", new Object[]{"a", "b", "c", "d", oau.f45204s, "e", "f"});
            case 3:
                return new ozp();
            case 4:
                return new nxn(f47049g);
            case 5:
                return f47049g;
            case 6:
                nzd nxmVar = f47050i;
                if (nxmVar == null) {
                    synchronized (ozp.class) {
                        nxmVar = f47050i;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47049g);
                            f47050i = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
