package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ozm extends nxq implements nyx {

    /* JADX INFO: renamed from: i */
    public static final ozm f47031i;

    /* JADX INFO: renamed from: j */
    private static volatile nzd f47032j;

    /* JADX INFO: renamed from: a */
    public int f47033a;

    /* JADX INFO: renamed from: b */
    public int f47034b;

    /* JADX INFO: renamed from: c */
    public int f47035c;

    /* JADX INFO: renamed from: d */
    public long f47036d;

    /* JADX INFO: renamed from: e */
    public long f47037e;

    /* JADX INFO: renamed from: f */
    public long f47038f;

    /* JADX INFO: renamed from: g */
    public long f47039g;

    /* JADX INFO: renamed from: h */
    public long f47040h;

    static {
        ozm ozmVar = new ozm();
        f47031i = ozmVar;
        nxq.m18130aa(ozm.class, ozmVar);
    }

    private ozm() {
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
                return m18129X(f47031i, "\u0001\u0007\u0000\u0001\u0011\u0018\u0007\u0000\u0000\u0000\u0011င\u0011\u0012င\u0012\u0014ဂ\u0013\u0015ဂ\u0014\u0016ဂ\u0015\u0017ဂ\u0016\u0018ဂ\u0017", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new ozm();
            case 4:
                return new nxl(f47031i);
            case 5:
                return f47031i;
            case 6:
                nzd nxmVar = f47032j;
                if (nxmVar == null) {
                    synchronized (ozm.class) {
                        nxmVar = f47032j;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47031i);
                            f47032j = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
