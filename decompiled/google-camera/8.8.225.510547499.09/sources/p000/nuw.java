package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nuw extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final nuw f44705d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f44706e;

    /* JADX INFO: renamed from: b */
    public Object f44708b;

    /* JADX INFO: renamed from: a */
    public int f44707a = 0;

    /* JADX INFO: renamed from: c */
    public nxy f44709c = nzg.f45063b;

    static {
        nuw nuwVar = new nuw();
        f44705d = nuwVar;
        nxq.m18130aa(nuw.class, nuwVar);
    }

    private nuw() {
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
                return m18129X(f44705d, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဵ\u0000\u0002\u001a\u0003ျ\u0000\u0004ျ\u0000", new Object[]{"b", "a", "c"});
            case 3:
                return new nuw();
            case 4:
                return new nxl(f44705d);
            case 5:
                return f44705d;
            case 6:
                nzd nxmVar = f44706e;
                if (nxmVar == null) {
                    synchronized (nuw.class) {
                        nxmVar = f44706e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44705d);
                            f44706e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
