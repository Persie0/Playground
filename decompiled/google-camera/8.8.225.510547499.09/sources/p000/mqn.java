package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class mqn extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final mqn f41433b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f41434c;

    /* JADX INFO: renamed from: a */
    public boolean f41435a;

    static {
        mqn mqnVar = new mqn();
        f41433b = mqnVar;
        nxq.m18130aa(mqn.class, mqnVar);
    }

    private mqn() {
        nxr nxrVar = nxr.f44982b;
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
                return m18129X(f41433b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            case 3:
                return new mqn();
            case 4:
                return new nxl(f41433b);
            case 5:
                return f41433b;
            case 6:
                nzd nxmVar = f41434c;
                if (nxmVar == null) {
                    synchronized (mqn.class) {
                        nxmVar = f41434c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f41433b);
                            f41434c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
