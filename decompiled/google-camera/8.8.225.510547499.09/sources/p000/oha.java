package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oha extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final oha f46004b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f46005c;

    /* JADX INFO: renamed from: a */
    public nxy f46006a = nzg.f45063b;

    static {
        oha ohaVar = new oha();
        f46004b = ohaVar;
        nxq.m18130aa(oha.class, ohaVar);
    }

    private oha() {
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
                return m18129X(f46004b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", ogz.class});
            case 3:
                return new oha();
            case 4:
                return new nxl(f46004b);
            case 5:
                return f46004b;
            case 6:
                nzd nxmVar = f46005c;
                if (nxmVar == null) {
                    synchronized (oha.class) {
                        nxmVar = f46005c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f46004b);
                            f46005c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
