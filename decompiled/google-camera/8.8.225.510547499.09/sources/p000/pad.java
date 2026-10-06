package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pad extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final pad f47165a;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f47166e;

    /* JADX INFO: renamed from: b */
    private int f47167b;

    /* JADX INFO: renamed from: c */
    private nmq f47168c;

    /* JADX INFO: renamed from: d */
    private byte f47169d = 2;

    static {
        pad padVar = new pad();
        f47165a = padVar;
        nxq.m18130aa(pad.class, padVar);
    }

    private pad() {
        nzg nzgVar = nzg.f45063b;
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f47169d);
            case 1:
            default:
                this.f47169d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f47165a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005ᐉ\u0004", new Object[]{"b", "c"});
            case 3:
                return new pad();
            case 4:
                return new nxl(f47165a);
            case 5:
                return f47165a;
            case 6:
                nzd nxmVar = f47166e;
                if (nxmVar == null) {
                    synchronized (pad.class) {
                        nxmVar = f47166e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47165a);
                            f47166e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
