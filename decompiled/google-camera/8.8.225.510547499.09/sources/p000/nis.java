package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nis extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final nis f42768f;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f42769g;

    /* JADX INFO: renamed from: a */
    public int f42770a;

    /* JADX INFO: renamed from: b */
    public int f42771b;

    /* JADX INFO: renamed from: c */
    public int f42772c;

    /* JADX INFO: renamed from: d */
    public int f42773d;

    /* JADX INFO: renamed from: e */
    public int f42774e;

    static {
        nis nisVar = new nis();
        f42768f = nisVar;
        nxq.m18130aa(nis.class, nisVar);
    }

    private nis() {
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
                return m18129X(f42768f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0006င\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new nis();
            case 4:
                return new nxl(f42768f);
            case 5:
                return f42768f;
            case 6:
                nzd nxmVar = f42769g;
                if (nxmVar == null) {
                    synchronized (nis.class) {
                        nxmVar = f42769g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42768f);
                            f42769g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
