package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oas extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final oas f45177b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f45178c;

    /* JADX INFO: renamed from: a */
    public nxy f45179a = nzg.f45063b;

    static {
        oas oasVar = new oas();
        f45177b = oasVar;
        nxq.m18130aa(oas.class, oasVar);
    }

    private oas() {
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
                return m18129X(f45177b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", oat.class});
            case 3:
                return new oas();
            case 4:
                return new nxl(f45177b);
            case 5:
                return f45177b;
            case 6:
                nzd nxmVar = f45178c;
                if (nxmVar == null) {
                    synchronized (oas.class) {
                        nxmVar = f45178c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45177b);
                            f45178c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
