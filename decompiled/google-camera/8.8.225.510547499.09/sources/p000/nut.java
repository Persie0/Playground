package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nut extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final nut f44692a;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f44693c;

    /* JADX INFO: renamed from: b */
    private nyr f44694b = nyr.f45033a;

    static {
        nut nutVar = new nut();
        f44692a = nutVar;
        nxq.m18130aa(nut.class, nutVar);
    }

    private nut() {
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
                return m18129X(f44692a, "\u0001\u0001\u0000\u0000\n\n\u0001\u0001\u0000\u0000\n2", new Object[]{"b", nus.f44691a});
            case 3:
                return new nut();
            case 4:
                return new nxl(f44692a);
            case 5:
                return f44692a;
            case 6:
                nzd nxmVar = f44693c;
                if (nxmVar == null) {
                    synchronized (nut.class) {
                        nxmVar = f44693c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44692a);
                            f44693c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
