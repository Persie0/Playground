package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class obx extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final obx f45393e;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f45394g;

    /* JADX INFO: renamed from: a */
    public float f45395a = -1.0f;

    /* JADX INFO: renamed from: b */
    public float f45396b = -1.0f;

    /* JADX INFO: renamed from: c */
    public boolean f45397c = true;

    /* JADX INFO: renamed from: d */
    public obw f45398d;

    /* JADX INFO: renamed from: f */
    private int f45399f;

    static {
        obx obxVar = new obx();
        f45393e = obxVar;
        nxq.m18130aa(obx.class, obxVar);
    }

    private obx() {
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
                return m18129X(f45393e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ဇ\u0002\u0004ဉ\u0003", new Object[]{"f", "a", "b", "c", "d"});
            case 3:
                return new obx();
            case 4:
                return new nxl(f45393e);
            case 5:
                return f45393e;
            case 6:
                nzd nxmVar = f45394g;
                if (nxmVar == null) {
                    synchronized (obx.class) {
                        nxmVar = f45394g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45393e);
                            f45394g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
