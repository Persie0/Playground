package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nha extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final nha f42273c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f42274d;

    /* JADX INFO: renamed from: a */
    public int f42275a;

    /* JADX INFO: renamed from: b */
    public int f42276b;

    static {
        nha nhaVar = new nha();
        f42273c = nhaVar;
        nxq.m18130aa(nha.class, nhaVar);
    }

    private nha() {
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
                return m18129X(f42273c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", kva.f37298l});
            case 3:
                return new nha();
            case 4:
                return new nxl(f42273c);
            case 5:
                return f42273c;
            case 6:
                nzd nxmVar = f42274d;
                if (nxmVar == null) {
                    synchronized (nha.class) {
                        nxmVar = f42274d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42273c);
                            f42274d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
