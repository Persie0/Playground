package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kvz extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final kvz f37474b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f37475c;

    /* JADX INFO: renamed from: a */
    public nxy f37476a = nzg.f45063b;

    static {
        kvz kvzVar = new kvz();
        f37474b = kvzVar;
        nxq.m18130aa(kvz.class, kvzVar);
    }

    private kvz() {
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
                return m18129X(f37474b, "\u0001\u0001\u0000\u0000\u0007\u0007\u0001\u0000\u0001\u0000\u0007\u001b", new Object[]{"a", kvy.class});
            case 3:
                return new kvz();
            case 4:
                return new nxl(f37474b);
            case 5:
                return f37474b;
            case 6:
                nzd nxmVar = f37475c;
                if (nxmVar == null) {
                    synchronized (kvz.class) {
                        nxmVar = f37475c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f37474b);
                            f37475c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
