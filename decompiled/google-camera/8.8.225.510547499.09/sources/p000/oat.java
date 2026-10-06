package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oat extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final oat f45180e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f45181f;

    /* JADX INFO: renamed from: a */
    public int f45182a;

    /* JADX INFO: renamed from: b */
    public oaw f45183b;

    /* JADX INFO: renamed from: c */
    public nxy f45184c;

    /* JADX INFO: renamed from: d */
    public nxy f45185d;

    static {
        oat oatVar = new oat();
        f45180e = oatVar;
        nxq.m18130aa(oat.class, oatVar);
    }

    private oat() {
        nzg nzgVar = nzg.f45063b;
        this.f45184c = nzgVar;
        this.f45185d = nzgVar;
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
                return m18129X(f45180e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003\u001b", new Object[]{"a", "b", "c", oay.class, "d", oar.class});
            case 3:
                return new oat();
            case 4:
                return new nxl(f45180e);
            case 5:
                return f45180e;
            case 6:
                nzd nxmVar = f45181f;
                if (nxmVar == null) {
                    synchronized (oat.class) {
                        nxmVar = f45181f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45180e);
                            f45181f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
