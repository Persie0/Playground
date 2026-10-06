package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class njl extends nxq implements nyx {

    /* JADX INFO: renamed from: l */
    public static final njl f43018l;

    /* JADX INFO: renamed from: m */
    private static volatile nzd f43019m;

    /* JADX INFO: renamed from: a */
    public int f43020a;

    /* JADX INFO: renamed from: b */
    public long f43021b;

    /* JADX INFO: renamed from: c */
    public long f43022c;

    /* JADX INFO: renamed from: d */
    public boolean f43023d;

    /* JADX INFO: renamed from: e */
    public int f43024e;

    /* JADX INFO: renamed from: f */
    public int f43025f;

    /* JADX INFO: renamed from: g */
    public int f43026g;

    /* JADX INFO: renamed from: h */
    public int f43027h;

    /* JADX INFO: renamed from: i */
    public int f43028i;

    /* JADX INFO: renamed from: j */
    public int f43029j;

    /* JADX INFO: renamed from: k */
    public int f43030k;

    static {
        njl njlVar = new njl();
        f43018l = njlVar;
        nxq.m18130aa(njl.class, njlVar);
    }

    private njl() {
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
                return m18129X(f43018l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဌ\u0007\tင\b\nဋ\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", niy.f42839m, "j", "k"});
            case 3:
                return new njl();
            case 4:
                return new nxl(f43018l);
            case 5:
                return f43018l;
            case 6:
                nzd nxmVar = f43019m;
                if (nxmVar == null) {
                    synchronized (njl.class) {
                        nxmVar = f43019m;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43018l);
                            f43019m = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
