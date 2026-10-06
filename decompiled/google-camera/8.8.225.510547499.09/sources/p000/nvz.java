package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nvz extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final nvz f44813a;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f44814e;

    /* JADX INFO: renamed from: b */
    private int f44815b;

    /* JADX INFO: renamed from: d */
    private byte f44817d = 2;

    /* JADX INFO: renamed from: c */
    private nwr f44816c = nwr.f44839b;

    static {
        nvz nvzVar = new nvz();
        f44813a = nvzVar;
        nxq.m18130aa(nvz.class, nvzVar);
    }

    private nvz() {
        nzg nzgVar = nzg.f45063b;
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f44817d);
            case 1:
            default:
                this.f44817d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f44813a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᔊ\u0000", new Object[]{"b", "c"});
            case 3:
                return new nvz();
            case 4:
                return new nxl(f44813a);
            case 5:
                return f44813a;
            case 6:
                nzd nxmVar = f44814e;
                if (nxmVar == null) {
                    synchronized (nvz.class) {
                        nxmVar = f44814e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44813a);
                            f44814e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
