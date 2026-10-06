package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nug extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final nug f44650e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f44651f;

    /* JADX INFO: renamed from: a */
    public String f44652a = "";

    /* JADX INFO: renamed from: b */
    public nxy f44653b = nzg.f45063b;

    /* JADX INFO: renamed from: c */
    public String f44654c = "";

    /* JADX INFO: renamed from: d */
    public String f44655d = "";

    static {
        nug nugVar = new nug();
        f44650e = nugVar;
        nxq.m18130aa(nug.class, nugVar);
    }

    private nug() {
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
                return m18129X(f44650e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003Ȉ\u0004Ȉ", new Object[]{"a", "b", nuc.class, "c", "d"});
            case 3:
                return new nug();
            case 4:
                return new nxl(f44650e);
            case 5:
                return f44650e;
            case 6:
                nzd nxmVar = f44651f;
                if (nxmVar == null) {
                    synchronized (nug.class) {
                        nxmVar = f44651f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44650e);
                            f44651f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
