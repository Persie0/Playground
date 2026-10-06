package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kwx extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final kwx f37581b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f37582c;

    /* JADX INFO: renamed from: a */
    public nxy f37583a = nzg.f45063b;

    static {
        kwx kwxVar = new kwx();
        f37581b = kwxVar;
        nxq.m18130aa(kwx.class, kwxVar);
    }

    private kwx() {
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
                return m18129X(f37581b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new kwx();
            case 4:
                return new nxl(f37581b);
            case 5:
                return f37581b;
            case 6:
                nzd nxmVar = f37582c;
                if (nxmVar == null) {
                    synchronized (kwx.class) {
                        nxmVar = f37582c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f37581b);
                            f37582c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
