package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nhb extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final nhb f42277c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f42278d;

    /* JADX INFO: renamed from: a */
    public int f42279a;

    /* JADX INFO: renamed from: b */
    public int f42280b;

    static {
        nhb nhbVar = new nhb();
        f42277c = nhbVar;
        nxq.m18130aa(nhb.class, nhbVar);
    }

    private nhb() {
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
                return m18129X(f42277c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", kva.f37298l});
            case 3:
                return new nhb();
            case 4:
                return new nxl(f42277c);
            case 5:
                return f42277c;
            case 6:
                nzd nxmVar = f42278d;
                if (nxmVar == null) {
                    synchronized (nhb.class) {
                        nxmVar = f42278d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42277c);
                            f42278d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
