package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class odm extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final odm f45630a;

    /* JADX INFO: renamed from: b */
    private static volatile nzd f45631b;

    static {
        odm odmVar = new odm();
        f45630a = odmVar;
        nxq.m18130aa(odm.class, odmVar);
    }

    private odm() {
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
                return m18129X(f45630a, "\u0001\u0000", null);
            case 3:
                return new odm();
            case 4:
                return new nxl(f45630a);
            case 5:
                return f45630a;
            case 6:
                nzd nxmVar = f45631b;
                if (nxmVar == null) {
                    synchronized (odm.class) {
                        nxmVar = f45631b;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45630a);
                            f45631b = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
