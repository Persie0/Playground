package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nid extends nxq implements nyx {

    /* JADX INFO: renamed from: h */
    public static final nid f42657h;

    /* JADX INFO: renamed from: i */
    private static volatile nzd f42658i;

    /* JADX INFO: renamed from: a */
    public int f42659a;

    /* JADX INFO: renamed from: b */
    public nhm f42660b;

    /* JADX INFO: renamed from: c */
    public long f42661c;

    /* JADX INFO: renamed from: d */
    public int f42662d;

    /* JADX INFO: renamed from: e */
    public int f42663e;

    /* JADX INFO: renamed from: f */
    public int f42664f;

    /* JADX INFO: renamed from: g */
    public float f42665g;

    static {
        nid nidVar = new nid();
        f42657h = nidVar;
        nxq.m18130aa(nid.class, nidVar);
    }

    private nid() {
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
                return m18129X(f42657h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဌ\u0002\u0004ဌ\u0003\u0005ဌ\u0004\u0006ခ\u0005", new Object[]{"a", "b", "c", "d", nks.f43293a, "e", njy.f43127q, "f", njy.f43126p, "g"});
            case 3:
                return new nid();
            case 4:
                return new nxl(f42657h);
            case 5:
                return f42657h;
            case 6:
                nzd nxmVar = f42658i;
                if (nxmVar == null) {
                    synchronized (nid.class) {
                        nxmVar = f42658i;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42657h);
                            f42658i = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
