package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oyx extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final oyx f46883e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f46884f;

    /* JADX INFO: renamed from: a */
    public int f46885a;

    /* JADX INFO: renamed from: b */
    public nxy f46886b = nzg.f45063b;

    /* JADX INFO: renamed from: c */
    public oyy f46887c;

    /* JADX INFO: renamed from: d */
    public int f46888d;

    static {
        oyx oyxVar = new oyx();
        f46883e = oyxVar;
        nxq.m18130aa(oyx.class, oyxVar);
    }

    private oyx() {
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
                return m18129X(f46883e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003င\u0001", new Object[]{"a", "b", oyw.class, "c", "d"});
            case 3:
                return new oyx();
            case 4:
                return new nxl(f46883e);
            case 5:
                return f46883e;
            case 6:
                nzd nxmVar = f46884f;
                if (nxmVar == null) {
                    synchronized (oyx.class) {
                        nxmVar = f46884f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f46883e);
                            f46884f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
