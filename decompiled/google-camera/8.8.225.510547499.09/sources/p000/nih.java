package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nih extends nxq implements nyx {

    /* JADX INFO: renamed from: h */
    public static final nih f42693h;

    /* JADX INFO: renamed from: i */
    private static volatile nzd f42694i;

    /* JADX INFO: renamed from: a */
    public int f42695a;

    /* JADX INFO: renamed from: b */
    public int f42696b;

    /* JADX INFO: renamed from: c */
    public int f42697c;

    /* JADX INFO: renamed from: d */
    public long f42698d;

    /* JADX INFO: renamed from: e */
    public long f42699e;

    /* JADX INFO: renamed from: f */
    public int f42700f;

    /* JADX INFO: renamed from: g */
    public boolean f42701g;

    static {
        nih nihVar = new nih();
        f42693h = nihVar;
        nxq.m18130aa(nih.class, nihVar);
    }

    private nih() {
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
                nxu nxuVar = nhr.f42523l;
                return m18129X(f42693h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဌ\u0004\u0006ဇ\u0005", new Object[]{"a", "b", nxuVar, "c", nxuVar, "d", "e", "f", nhr.f42524m, "g"});
            case 3:
                return new nih();
            case 4:
                return new nxl(f42693h);
            case 5:
                return f42693h;
            case 6:
                nzd nxmVar = f42694i;
                if (nxmVar == null) {
                    synchronized (nih.class) {
                        nxmVar = f42694i;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42693h);
                            f42694i = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
