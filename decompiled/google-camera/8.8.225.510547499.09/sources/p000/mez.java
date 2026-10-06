package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mez extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final mez f40285a;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f40286e;

    /* JADX INFO: renamed from: b */
    private int f40287b;

    /* JADX INFO: renamed from: c */
    private lvc f40288c;

    /* JADX INFO: renamed from: d */
    private byte f40289d = 2;

    static {
        mez mezVar = new mez();
        f40285a = mezVar;
        nxq.m18130aa(mez.class, mezVar);
    }

    private mez() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f40289d);
            case 1:
            default:
                this.f40289d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f40285a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
            case 3:
                return new mez();
            case 4:
                return new nxl(f40285a);
            case 5:
                return f40285a;
            case 6:
                nzd nxmVar = f40286e;
                if (nxmVar == null) {
                    synchronized (mez.class) {
                        nxmVar = f40286e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f40285a);
                            f40286e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
