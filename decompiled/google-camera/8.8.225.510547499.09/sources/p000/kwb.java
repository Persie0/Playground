package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kwb extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final kwb f37483b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f37484c;

    /* JADX INFO: renamed from: a */
    public nxy f37485a = nzg.f45063b;

    static {
        kwb kwbVar = new kwb();
        f37483b = kwbVar;
        nxq.m18130aa(kwb.class, kwbVar);
    }

    private kwb() {
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
                return m18129X(f37483b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", kwa.class});
            case 3:
                return new kwb();
            case 4:
                return new nxl(f37483b);
            case 5:
                return f37483b;
            case 6:
                nzd nxmVar = f37484c;
                if (nxmVar == null) {
                    synchronized (kwb.class) {
                        nxmVar = f37484c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f37483b);
                            f37484c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
