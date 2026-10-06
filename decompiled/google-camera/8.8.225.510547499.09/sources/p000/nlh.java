package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nlh extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final nlh f43516a;

    /* JADX INFO: renamed from: b */
    private static volatile nzd f43517b;

    static {
        nlh nlhVar = new nlh();
        f43516a = nlhVar;
        nxq.m18130aa(nlh.class, nlhVar);
    }

    private nlh() {
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
                return m18129X(f43516a, "\u0001\u0000", null);
            case 3:
                return new nlh();
            case 4:
                return new nxl(f43516a);
            case 5:
                return f43516a;
            case 6:
                nzd nxmVar = f43517b;
                if (nxmVar == null) {
                    synchronized (nlh.class) {
                        nxmVar = f43517b;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43516a);
                            f43517b = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
