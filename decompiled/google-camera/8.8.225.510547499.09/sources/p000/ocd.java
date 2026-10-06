package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ocd extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final ocd f45443b;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f45444d;

    /* JADX INFO: renamed from: c */
    private byte f45446c = 2;

    /* JADX INFO: renamed from: a */
    public nxy f45445a = nzg.f45063b;

    static {
        ocd ocdVar = new ocd();
        f45443b = ocdVar;
        nxq.m18130aa(ocd.class, ocdVar);
    }

    private ocd() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f45446c);
            case 1:
            default:
                this.f45446c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f45443b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", occ.class});
            case 3:
                return new ocd();
            case 4:
                return new nxl(f45443b);
            case 5:
                return f45443b;
            case 6:
                nzd nxmVar = f45444d;
                if (nxmVar == null) {
                    synchronized (ocd.class) {
                        nxmVar = f45444d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45443b);
                            f45444d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
