package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class obg extends nxq implements nyx {

    /* JADX INFO: renamed from: h */
    public static final obg f45260h;

    /* JADX INFO: renamed from: i */
    private static volatile nzd f45261i;

    /* JADX INFO: renamed from: a */
    public int f45262a;

    /* JADX INFO: renamed from: b */
    public nxv f45263b = nxj.f44968b;

    /* JADX INFO: renamed from: c */
    public int f45264c;

    /* JADX INFO: renamed from: d */
    public int f45265d;

    /* JADX INFO: renamed from: e */
    public long f45266e;

    /* JADX INFO: renamed from: f */
    public int f45267f;

    /* JADX INFO: renamed from: g */
    public int f45268g;

    static {
        obg obgVar = new obg();
        f45260h = obgVar;
        nxq.m18130aa(obg.class, obgVar);
    }

    private obg() {
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
                return m18129X(f45260h, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0001\u0000\u0001$\u0003င\u0000\u0004င\u0001\u0005ဂ\u0002\u0006ဌ\u0003\tဌ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", oau.f45193h, "g", oau.f45194i});
            case 3:
                return new obg();
            case 4:
                return new nxl(f45260h);
            case 5:
                return f45260h;
            case 6:
                nzd nxmVar = f45261i;
                if (nxmVar == null) {
                    synchronized (obg.class) {
                        nxmVar = f45261i;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45260h);
                            f45261i = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
