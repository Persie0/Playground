package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class meq extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final meq f40215a;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f40216e;

    /* JADX INFO: renamed from: b */
    private int f40217b;

    /* JADX INFO: renamed from: c */
    private nvs f40218c;

    /* JADX INFO: renamed from: d */
    private byte f40219d = 2;

    static {
        meq meqVar = new meq();
        f40215a = meqVar;
        nxq.m18130aa(meq.class, meqVar);
    }

    private meq() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f40219d);
            case 1:
            default:
                this.f40219d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f40215a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"b", "c"});
            case 3:
                return new meq();
            case 4:
                return new nxl(f40215a);
            case 5:
                return f40215a;
            case 6:
                nzd nxmVar = f40216e;
                if (nxmVar == null) {
                    synchronized (meq.class) {
                        nxmVar = f40216e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f40215a);
                            f40216e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
