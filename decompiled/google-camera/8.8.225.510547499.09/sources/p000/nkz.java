package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nkz extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final nkz f43429d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f43430e;

    /* JADX INFO: renamed from: a */
    public int f43431a;

    /* JADX INFO: renamed from: b */
    public int f43432b;

    /* JADX INFO: renamed from: c */
    public float f43433c;

    static {
        nkz nkzVar = new nkz();
        f43429d = nkzVar;
        nxq.m18130aa(nkz.class, nkzVar);
    }

    private nkz() {
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
                return m18129X(f43429d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ခ\u0001", new Object[]{"a", "b", nks.f43300h, "c"});
            case 3:
                return new nkz();
            case 4:
                return new nxl(f43429d);
            case 5:
                return f43429d;
            case 6:
                nzd nxmVar = f43430e;
                if (nxmVar == null) {
                    synchronized (nkz.class) {
                        nxmVar = f43430e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43429d);
                            f43430e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
