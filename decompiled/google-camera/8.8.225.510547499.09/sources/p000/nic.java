package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nic extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final nic f42650f;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f42651g;

    /* JADX INFO: renamed from: a */
    public int f42652a;

    /* JADX INFO: renamed from: b */
    public nhm f42653b;

    /* JADX INFO: renamed from: c */
    public long f42654c;

    /* JADX INFO: renamed from: d */
    public long f42655d;

    /* JADX INFO: renamed from: e */
    public nif f42656e;

    static {
        nic nicVar = new nic();
        f42650f = nicVar;
        nxq.m18130aa(nic.class, nicVar);
    }

    private nic() {
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
                return m18129X(f42650f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new nic();
            case 4:
                return new nxl(f42650f);
            case 5:
                return f42650f;
            case 6:
                nzd nxmVar = f42651g;
                if (nxmVar == null) {
                    synchronized (nic.class) {
                        nxmVar = f42651g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42650f);
                            f42651g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
