package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nmf extends nxq implements nyx {

    /* JADX INFO: renamed from: j */
    public static final nmf f43766j;

    /* JADX INFO: renamed from: k */
    private static volatile nzd f43767k;

    /* JADX INFO: renamed from: a */
    public int f43768a;

    /* JADX INFO: renamed from: b */
    public int f43769b;

    /* JADX INFO: renamed from: c */
    public int f43770c;

    /* JADX INFO: renamed from: d */
    public int f43771d;

    /* JADX INFO: renamed from: e */
    public boolean f43772e;

    /* JADX INFO: renamed from: f */
    public int f43773f;

    /* JADX INFO: renamed from: g */
    public int f43774g;

    /* JADX INFO: renamed from: h */
    public int f43775h;

    /* JADX INFO: renamed from: i */
    public boolean f43776i;

    static {
        nmf nmfVar = new nmf();
        f43766j = nmfVar;
        nxq.m18130aa(nmf.class, nmfVar);
    }

    private nmf() {
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
                return m18129X(f43766j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0006ဌ\u0004\u0007ဌ\u0005\bဌ\u0006\tဇ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", nlu.f43675l, "g", nlu.f43674k, "h", nks.f43293a, "i"});
            case 3:
                return new nmf();
            case 4:
                return new nxl(f43766j);
            case 5:
                return f43766j;
            case 6:
                nzd nxmVar = f43767k;
                if (nxmVar == null) {
                    synchronized (nmf.class) {
                        nxmVar = f43767k;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43766j);
                            f43767k = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
