package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mem extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final mem f40196a;

    /* JADX INFO: renamed from: b */
    private static volatile nzd f40197b;

    static {
        mem memVar = new mem();
        f40196a = memVar;
        nxq.m18130aa(mem.class, memVar);
    }

    private mem() {
        nzg nzgVar = nzg.f45063b;
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
                return m18129X(f40196a, "\u0001\u0000", null);
            case 3:
                return new mem();
            case 4:
                return new nxl(f40196a);
            case 5:
                return f40196a;
            case 6:
                nzd nxmVar = f40197b;
                if (nxmVar == null) {
                    synchronized (mem.class) {
                        nxmVar = f40197b;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f40196a);
                            f40197b = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
