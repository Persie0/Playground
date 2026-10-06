package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nhm extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final nhm f42342c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f42343d;

    /* JADX INFO: renamed from: a */
    public int f42344a;

    /* JADX INFO: renamed from: b */
    public int f42345b;

    static {
        nhm nhmVar = new nhm();
        f42342c = nhmVar;
        nxq.m18130aa(nhm.class, nhmVar);
    }

    private nhm() {
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
                return m18129X(f42342c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဌ\u0001", new Object[]{"a", "b", kva.f37303q});
            case 3:
                return new nhm();
            case 4:
                return new nxl(f42342c);
            case 5:
                return f42342c;
            case 6:
                nzd nxmVar = f42343d;
                if (nxmVar == null) {
                    synchronized (nhm.class) {
                        nxmVar = f42343d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42342c);
                            f42343d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
