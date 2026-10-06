package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class mqq extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final mqq f41446b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f41447c;

    /* JADX INFO: renamed from: a */
    public nxy f41448a = nzg.f45063b;

    static {
        mqq mqqVar = new mqq();
        f41446b = mqqVar;
        nxq.m18130aa(mqq.class, mqqVar);
    }

    private mqq() {
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
                return m18129X(f41446b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", mqp.class});
            case 3:
                return new mqq();
            case 4:
                return new nxl(f41446b);
            case 5:
                return f41446b;
            case 6:
                nzd nxmVar = f41447c;
                if (nxmVar == null) {
                    synchronized (mqq.class) {
                        nxmVar = f41447c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f41446b);
                            f41447c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
