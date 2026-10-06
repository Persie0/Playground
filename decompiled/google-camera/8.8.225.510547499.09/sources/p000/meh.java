package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class meh extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final meh f40172c;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f40173e;

    /* JADX INFO: renamed from: a */
    public int f40174a;

    /* JADX INFO: renamed from: b */
    public nuy f40175b;

    /* JADX INFO: renamed from: d */
    private byte f40176d = 2;

    static {
        meh mehVar = new meh();
        f40172c = mehVar;
        nxq.m18130aa(meh.class, mehVar);
    }

    private meh() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f40176d);
            case 1:
            default:
                this.f40176d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f40172c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0001", new Object[]{"a", "b"});
            case 3:
                return new meh();
            case 4:
                return new nxl(f40172c);
            case 5:
                return f40172c;
            case 6:
                nzd nxmVar = f40173e;
                if (nxmVar == null) {
                    synchronized (meh.class) {
                        nxmVar = f40173e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f40172c);
                            f40173e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
