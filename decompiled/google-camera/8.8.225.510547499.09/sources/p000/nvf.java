package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nvf extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final nvf f44738a;

    /* JADX INFO: renamed from: b */
    private static volatile nzd f44739b;

    static {
        nvf nvfVar = new nvf();
        f44738a = nvfVar;
        nxq.m18130aa(nvf.class, nvfVar);
    }

    private nvf() {
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
                return m18129X(f44738a, "\u0001\u0000", null);
            case 3:
                return new nvf();
            case 4:
                return new nxl(f44738a);
            case 5:
                return f44738a;
            case 6:
                nzd nxmVar = f44739b;
                if (nxmVar == null) {
                    synchronized (nvf.class) {
                        nxmVar = f44739b;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44738a);
                            f44739b = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
