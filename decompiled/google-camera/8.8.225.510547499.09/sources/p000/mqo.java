package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class mqo extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final mqo f41436b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f41437c;

    /* JADX INFO: renamed from: a */
    public int f41438a;

    static {
        mqo mqoVar = new mqo();
        f41436b = mqoVar;
        nxq.m18130aa(mqo.class, mqoVar);
    }

    private mqo() {
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
                return m18129X(f41436b, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u000f", new Object[]{"a"});
            case 3:
                return new mqo();
            case 4:
                return new nxl(f41436b);
            case 5:
                return f41436b;
            case 6:
                nzd nxmVar = f41437c;
                if (nxmVar == null) {
                    synchronized (mqo.class) {
                        nxmVar = f41437c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f41436b);
                            f41437c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
