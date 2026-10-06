package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ozg extends nxq implements nyx {

    /* JADX INFO: renamed from: i */
    public static final ozg f46937i;

    /* JADX INFO: renamed from: j */
    private static volatile nzd f46938j;

    /* JADX INFO: renamed from: a */
    public int f46939a;

    /* JADX INFO: renamed from: b */
    public long f46940b;

    /* JADX INFO: renamed from: c */
    public long f46941c;

    /* JADX INFO: renamed from: d */
    public long f46942d;

    /* JADX INFO: renamed from: e */
    public long f46943e;

    /* JADX INFO: renamed from: f */
    public long f46944f;

    /* JADX INFO: renamed from: g */
    public long f46945g;

    /* JADX INFO: renamed from: h */
    public ozd f46946h;

    static {
        ozg ozgVar = new ozg();
        f46937i = ozgVar;
        nxq.m18130aa(ozg.class, ozgVar);
    }

    private ozg() {
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
                return m18129X(f46937i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဉ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new ozg();
            case 4:
                return new nxl(f46937i);
            case 5:
                return f46937i;
            case 6:
                nzd nxmVar = f46938j;
                if (nxmVar == null) {
                    synchronized (ozg.class) {
                        nxmVar = f46938j;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f46937i);
                            f46938j = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
