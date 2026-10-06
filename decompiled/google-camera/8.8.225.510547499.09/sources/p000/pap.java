package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pap extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final pap f47253c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f47254d;

    /* JADX INFO: renamed from: a */
    public nxw f47255a;

    /* JADX INFO: renamed from: b */
    public nxw f47256b;

    static {
        pap papVar = new pap();
        f47253c = papVar;
        nxq.m18130aa(pap.class, papVar);
    }

    private pap() {
        nxr nxrVar = nxr.f44982b;
        this.f47255a = nxrVar;
        this.f47256b = nxrVar;
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
                return m18129X(f47253c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001'\u0002'", new Object[]{"a", "b"});
            case 3:
                return new pap();
            case 4:
                return new nxl(f47253c);
            case 5:
                return f47253c;
            case 6:
                nzd nxmVar = f47254d;
                if (nxmVar == null) {
                    synchronized (pap.class) {
                        nxmVar = f47254d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47253c);
                            f47254d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
