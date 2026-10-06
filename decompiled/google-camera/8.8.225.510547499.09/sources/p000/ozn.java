package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ozn extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final ozn f47041c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f47042d;

    /* JADX INFO: renamed from: a */
    public int f47043a;

    /* JADX INFO: renamed from: b */
    public boolean f47044b;

    static {
        ozn oznVar = new ozn();
        f47041c = oznVar;
        nxq.m18130aa(ozn.class, oznVar);
    }

    private ozn() {
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
                return m18129X(f47041c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new ozn();
            case 4:
                return new nxl(f47041c);
            case 5:
                return f47041c;
            case 6:
                nzd nxmVar = f47042d;
                if (nxmVar == null) {
                    synchronized (ozn.class) {
                        nxmVar = f47042d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47041c);
                            f47042d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
