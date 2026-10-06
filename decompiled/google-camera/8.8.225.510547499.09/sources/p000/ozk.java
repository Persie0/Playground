package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ozk extends nxo implements nyx {

    /* JADX INFO: renamed from: a */
    public static final ozk f47026a;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f47027c;

    /* JADX INFO: renamed from: b */
    private byte f47028b = 2;

    static {
        ozk ozkVar = new ozk();
        f47026a = ozkVar;
        nxq.m18130aa(ozk.class, ozkVar);
    }

    private ozk() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f47028b);
            case 1:
            default:
                this.f47028b = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f47026a, "\u0001\u0000", null);
            case 3:
                return new ozk();
            case 4:
                return new nxn(f47026a);
            case 5:
                return f47026a;
            case 6:
                nzd nxmVar = f47027c;
                if (nxmVar == null) {
                    synchronized (ozk.class) {
                        nxmVar = f47027c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47026a);
                            f47027c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
