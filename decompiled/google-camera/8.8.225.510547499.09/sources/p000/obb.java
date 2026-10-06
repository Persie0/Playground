package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class obb extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final obb f45233c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f45234d;

    /* JADX INFO: renamed from: a */
    public nxw f45235a = nxr.f44982b;

    /* JADX INFO: renamed from: b */
    public nxy f45236b = nzg.f45063b;

    static {
        obb obbVar = new obb();
        f45233c = obbVar;
        nxq.m18130aa(obb.class, obbVar);
    }

    private obb() {
    }

    /* JADX INFO: renamed from: c */
    public static nxl m18396c() {
        return f45233c.m18137O();
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
                return m18129X(f45233c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001,\u0002\u001b", new Object[]{"a", oau.f45190e, "b", obc.class});
            case 3:
                return new obb();
            case 4:
                return new nxl(f45233c);
            case 5:
                return f45233c;
            case 6:
                nzd nxmVar = f45234d;
                if (nxmVar == null) {
                    synchronized (obb.class) {
                        nxmVar = f45234d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45233c);
                            f45234d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
