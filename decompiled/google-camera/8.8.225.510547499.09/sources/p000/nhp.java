package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nhp extends nxq implements nyx {

    /* JADX INFO: renamed from: m */
    public static final nhp f42493m;

    /* JADX INFO: renamed from: n */
    private static volatile nzd f42494n;

    /* JADX INFO: renamed from: a */
    public int f42495a;

    /* JADX INFO: renamed from: b */
    public int f42496b;

    /* JADX INFO: renamed from: e */
    public int f42499e;

    /* JADX INFO: renamed from: f */
    public int f42500f;

    /* JADX INFO: renamed from: g */
    public int f42501g;

    /* JADX INFO: renamed from: h */
    public nju f42502h;

    /* JADX INFO: renamed from: j */
    public int f42504j;

    /* JADX INFO: renamed from: k */
    public boolean f42505k;

    /* JADX INFO: renamed from: c */
    public String f42497c = "";

    /* JADX INFO: renamed from: d */
    public String f42498d = "";

    /* JADX INFO: renamed from: i */
    public nxw f42503i = nxr.f44982b;

    /* JADX INFO: renamed from: l */
    public nxy f42506l = nzg.f45063b;

    static {
        nhp nhpVar = new nhp();
        f42493m = nhpVar;
        nxq.m18130aa(nhp.class, nhpVar);
    }

    private nhp() {
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
                return m18129X(f42493m, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0002\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005င\u0004\u0007င\u0006\bဉ\u0007\n\u001e\u000bင\b\fဇ\t\r\u001a", new Object[]{"a", "b", kva.f37307u, "c", "d", "e", "f", "g", "h", "i", kva.f37302p, "j", "k", "l"});
            case 3:
                return new nhp();
            case 4:
                return new nxl(f42493m);
            case 5:
                return f42493m;
            case 6:
                nzd nxmVar = f42494n;
                if (nxmVar == null) {
                    synchronized (nhp.class) {
                        nxmVar = f42494n;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42493m);
                            f42494n = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
