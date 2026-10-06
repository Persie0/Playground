package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nzw extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final nzw f45101c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f45102d;

    /* JADX INFO: renamed from: a */
    public long f45103a;

    /* JADX INFO: renamed from: b */
    public int f45104b;

    static {
        nzw nzwVar = new nzw();
        f45101c = nzwVar;
        nxq.m18130aa(nzw.class, nzwVar);
    }

    private nzw() {
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
                return m18129X(f45101c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"a", "b"});
            case 3:
                return new nzw();
            case 4:
                return new nxl(f45101c);
            case 5:
                return f45101c;
            case 6:
                nzd nxmVar = f45102d;
                if (nxmVar == null) {
                    synchronized (nzw.class) {
                        nxmVar = f45102d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45101c);
                            f45102d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
