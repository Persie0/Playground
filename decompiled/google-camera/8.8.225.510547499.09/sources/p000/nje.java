package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nje extends nxq implements nyx {

    /* JADX INFO: renamed from: i */
    public static final nje f42891i;

    /* JADX INFO: renamed from: j */
    private static volatile nzd f42892j;

    /* JADX INFO: renamed from: a */
    public int f42893a;

    /* JADX INFO: renamed from: b */
    public long f42894b;

    /* JADX INFO: renamed from: c */
    public long f42895c;

    /* JADX INFO: renamed from: d */
    public long f42896d;

    /* JADX INFO: renamed from: e */
    public int f42897e;

    /* JADX INFO: renamed from: f */
    public int f42898f;

    /* JADX INFO: renamed from: g */
    public int f42899g;

    /* JADX INFO: renamed from: h */
    public int f42900h;

    static {
        nje njeVar = new nje();
        f42891i = njeVar;
        nxq.m18130aa(nje.class, njeVar);
    }

    private nje() {
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
                return m18129X(f42891i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new nje();
            case 4:
                return new nxl(f42891i);
            case 5:
                return f42891i;
            case 6:
                nzd nxmVar = f42892j;
                if (nxmVar == null) {
                    synchronized (nje.class) {
                        nxmVar = f42892j;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42891i);
                            f42892j = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
