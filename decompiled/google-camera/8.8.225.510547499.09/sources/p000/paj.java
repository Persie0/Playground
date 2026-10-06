package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class paj extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final paj f47203d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f47204e;

    /* JADX INFO: renamed from: a */
    public int f47205a;

    /* JADX INFO: renamed from: b */
    public long f47206b;

    /* JADX INFO: renamed from: c */
    public long f47207c;

    static {
        paj pajVar = new paj();
        f47203d = pajVar;
        nxq.m18130aa(paj.class, pajVar);
    }

    private paj() {
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
                return m18129X(f47203d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new paj();
            case 4:
                return new nxl(f47203d);
            case 5:
                return f47203d;
            case 6:
                nzd nxmVar = f47204e;
                if (nxmVar == null) {
                    synchronized (paj.class) {
                        nxmVar = f47204e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47203d);
                            f47204e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
