package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nif extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final nif f42681d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f42682e;

    /* JADX INFO: renamed from: a */
    public int f42683a;

    /* JADX INFO: renamed from: b */
    public int f42684b;

    /* JADX INFO: renamed from: c */
    public int f42685c;

    static {
        nif nifVar = new nif();
        f42681d = nifVar;
        nxq.m18130aa(nif.class, nifVar);
    }

    private nif() {
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
                nxu nxuVar = nhr.f42521j;
                return m18129X(f42681d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", nxuVar, "c", nxuVar});
            case 3:
                return new nif();
            case 4:
                return new nxl(f42681d);
            case 5:
                return f42681d;
            case 6:
                nzd nxmVar = f42682e;
                if (nxmVar == null) {
                    synchronized (nif.class) {
                        nxmVar = f42682e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42681d);
                            f42682e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
