package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class paf extends nxq implements nyx {

    /* JADX INFO: renamed from: l */
    public static final paf f47175l;

    /* JADX INFO: renamed from: n */
    private static volatile nzd f47176n;

    /* JADX INFO: renamed from: a */
    public int f47177a;

    /* JADX INFO: renamed from: b */
    public boolean f47178b;

    /* JADX INFO: renamed from: c */
    public ozz f47179c;

    /* JADX INFO: renamed from: f */
    public int f47182f;

    /* JADX INFO: renamed from: h */
    public nmv f47184h;

    /* JADX INFO: renamed from: i */
    public ocg f47185i;

    /* JADX INFO: renamed from: j */
    public pah f47186j;

    /* JADX INFO: renamed from: k */
    public pae f47187k;

    /* JADX INFO: renamed from: m */
    private byte f47188m = 2;

    /* JADX INFO: renamed from: d */
    public String f47180d = "";

    /* JADX INFO: renamed from: e */
    public String f47181e = "";

    /* JADX INFO: renamed from: g */
    public String f47183g = "";

    static {
        paf pafVar = new paf();
        f47175l = pafVar;
        nxq.m18130aa(paf.class, pafVar);
    }

    private paf() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f47188m);
            case 1:
            default:
                this.f47188m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f47175l, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0000\u0001\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဌ\u0004\u0007ဈ\u0007\tᐉ\b\nဉ\t\u000bဉ\n\fဉ\u000b", new Object[]{"a", "b", "c", "d", "e", "f", pab.f47151d, "g", "h", "i", "j", "k"});
            case 3:
                return new paf();
            case 4:
                return new nxl(f47175l);
            case 5:
                return f47175l;
            case 6:
                nzd nxmVar = f47176n;
                if (nxmVar == null) {
                    synchronized (paf.class) {
                        nxmVar = f47176n;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47175l);
                            f47176n = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
