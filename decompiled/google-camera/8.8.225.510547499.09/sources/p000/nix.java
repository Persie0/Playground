package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nix extends nxq implements nyx {

    /* JADX INFO: renamed from: h */
    public static final nix f42818h;

    /* JADX INFO: renamed from: i */
    private static volatile nzd f42819i;

    /* JADX INFO: renamed from: a */
    public int f42820a;

    /* JADX INFO: renamed from: b */
    public int f42821b;

    /* JADX INFO: renamed from: c */
    public int f42822c;

    /* JADX INFO: renamed from: d */
    public int f42823d;

    /* JADX INFO: renamed from: e */
    public int f42824e;

    /* JADX INFO: renamed from: f */
    public int f42825f;

    /* JADX INFO: renamed from: g */
    public int f42826g;

    static {
        nix nixVar = new nix();
        f42818h = nixVar;
        nxq.m18130aa(nix.class, nixVar);
    }

    private nix() {
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
                return m18129X(f42818h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            case 3:
                return new nix();
            case 4:
                return new nxl(f42818h);
            case 5:
                return f42818h;
            case 6:
                nzd nxmVar = f42819i;
                if (nxmVar == null) {
                    synchronized (nix.class) {
                        nxmVar = f42819i;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42818h);
                            f42819i = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
