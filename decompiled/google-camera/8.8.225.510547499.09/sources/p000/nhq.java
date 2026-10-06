package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nhq extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final nhq f42507d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f42508e;

    /* JADX INFO: renamed from: a */
    public int f42509a;

    /* JADX INFO: renamed from: b */
    public nja f42510b;

    /* JADX INFO: renamed from: c */
    public nis f42511c;

    static {
        nhq nhqVar = new nhq();
        f42507d = nhqVar;
        nxq.m18130aa(nhq.class, nhqVar);
    }

    private nhq() {
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
                return m18129X(f42507d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new nhq();
            case 4:
                return new nxl(f42507d);
            case 5:
                return f42507d;
            case 6:
                nzd nxmVar = f42508e;
                if (nxmVar == null) {
                    synchronized (nhq.class) {
                        nxmVar = f42508e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42507d);
                            f42508e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
