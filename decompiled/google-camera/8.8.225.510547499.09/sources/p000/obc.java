package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class obc extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final obc f45237c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f45238d;

    /* JADX INFO: renamed from: a */
    public nxw f45239a = nxr.f44982b;

    /* JADX INFO: renamed from: b */
    public nxy f45240b = nzg.f45063b;

    static {
        obc obcVar = new obc();
        f45237c = obcVar;
        nxq.m18130aa(obc.class, obcVar);
    }

    private obc() {
    }

    /* JADX INFO: renamed from: c */
    public static nxl m18397c() {
        return f45237c.m18137O();
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
                return m18129X(f45237c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001,\u0002\u001b", new Object[]{"a", oau.f45190e, "b", obb.class});
            case 3:
                return new obc();
            case 4:
                return new nxl(f45237c);
            case 5:
                return f45237c;
            case 6:
                nzd nxmVar = f45238d;
                if (nxmVar == null) {
                    synchronized (obc.class) {
                        nxmVar = f45238d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45237c);
                            f45238d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
