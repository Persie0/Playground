package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lvc extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final lvc f39379a;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f39380d;

    /* JADX INFO: renamed from: b */
    private int f39381b;

    /* JADX INFO: renamed from: c */
    private nvv f39382c;

    static {
        lvc lvcVar = new lvc();
        f39379a = lvcVar;
        nxq.m18130aa(lvc.class, lvcVar);
    }

    private lvc() {
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
                return m18129X(f39379a, "\u0001\u0001\u0000\u0001\u0017\u0017\u0001\u0000\u0000\u0000\u0017ဉ\u0003", new Object[]{"b", "c"});
            case 3:
                return new lvc();
            case 4:
                return new nxl(f39379a);
            case 5:
                return f39379a;
            case 6:
                nzd nxmVar = f39380d;
                if (nxmVar == null) {
                    synchronized (lvc.class) {
                        nxmVar = f39380d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f39379a);
                            f39380d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
