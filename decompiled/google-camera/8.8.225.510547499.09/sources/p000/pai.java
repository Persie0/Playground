package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pai extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final pai f47201a;

    /* JADX INFO: renamed from: b */
    private static volatile nzd f47202b;

    static {
        pai paiVar = new pai();
        f47201a = paiVar;
        nxq.m18130aa(pai.class, paiVar);
    }

    private pai() {
        nyn nynVar = nyn.f45025b;
        nxr nxrVar = nxr.f44982b;
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
                return m18129X(f47201a, "\u0001\u0000", null);
            case 3:
                return new pai();
            case 4:
                return new nxl(f47201a);
            case 5:
                return f47201a;
            case 6:
                nzd nxmVar = f47202b;
                if (nxmVar == null) {
                    synchronized (pai.class) {
                        nxmVar = f47202b;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47201a);
                            f47202b = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
