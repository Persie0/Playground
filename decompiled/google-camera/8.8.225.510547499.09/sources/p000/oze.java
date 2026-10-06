package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oze extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final oze f46929e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f46930f;

    /* JADX INFO: renamed from: a */
    public int f46931a;

    /* JADX INFO: renamed from: b */
    public nxy f46932b;

    /* JADX INFO: renamed from: c */
    public nxy f46933c;

    /* JADX INFO: renamed from: d */
    public ozd f46934d;

    static {
        oze ozeVar = new oze();
        f46929e = ozeVar;
        nxq.m18130aa(oze.class, ozeVar);
    }

    private oze() {
        nzg nzgVar = nzg.f45063b;
        this.f46932b = nzgVar;
        this.f46933c = nzgVar;
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
                return m18129X(f46929e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"a", "b", ozh.class, "c", ozc.class, "d"});
            case 3:
                return new oze();
            case 4:
                return new nxl(f46929e);
            case 5:
                return f46929e;
            case 6:
                nzd nxmVar = f46930f;
                if (nxmVar == null) {
                    synchronized (oze.class) {
                        nxmVar = f46930f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f46929e);
                            f46930f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
