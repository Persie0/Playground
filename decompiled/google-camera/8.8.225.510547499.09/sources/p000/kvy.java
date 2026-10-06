package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kvy extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final kvy f37469c;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f37470e;

    /* JADX INFO: renamed from: a */
    public String f37471a = "";

    /* JADX INFO: renamed from: b */
    public float f37472b;

    /* JADX INFO: renamed from: d */
    private int f37473d;

    static {
        kvy kvyVar = new kvy();
        f37469c = kvyVar;
        nxq.m18130aa(kvy.class, kvyVar);
    }

    private kvy() {
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
                return m18129X(f37469c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ခ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new kvy();
            case 4:
                return new nxl(f37469c);
            case 5:
                return f37469c;
            case 6:
                nzd nxmVar = f37470e;
                if (nxmVar == null) {
                    synchronized (kvy.class) {
                        nxmVar = f37470e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f37469c);
                            f37470e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
