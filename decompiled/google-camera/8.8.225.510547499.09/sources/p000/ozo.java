package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ozo extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final ozo f47045c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f47046d;

    /* JADX INFO: renamed from: a */
    public int f47047a;

    /* JADX INFO: renamed from: b */
    public ozm f47048b;

    static {
        ozo ozoVar = new ozo();
        f47045c = ozoVar;
        nxq.m18130aa(ozo.class, ozoVar);
    }

    private ozo() {
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
                return m18129X(f47045c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new ozo();
            case 4:
                return new nxl(f47045c);
            case 5:
                return f47045c;
            case 6:
                nzd nxmVar = f47046d;
                if (nxmVar == null) {
                    synchronized (ozo.class) {
                        nxmVar = f47046d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47045c);
                            f47046d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
