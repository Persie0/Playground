package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class obn extends nxq implements nyx {

    /* JADX INFO: renamed from: i */
    public static final obn f45328i;

    /* JADX INFO: renamed from: j */
    private static volatile nzd f45329j;

    /* JADX INFO: renamed from: a */
    public int f45330a;

    /* JADX INFO: renamed from: b */
    public int f45331b;

    /* JADX INFO: renamed from: c */
    public int f45332c;

    /* JADX INFO: renamed from: d */
    public int f45333d;

    /* JADX INFO: renamed from: e */
    public nwr f45334e = nwr.f44839b;

    /* JADX INFO: renamed from: f */
    public nwr f45335f = nwr.f44839b;

    /* JADX INFO: renamed from: g */
    public String f45336g = "";

    /* JADX INFO: renamed from: h */
    public nxw f45337h = nxr.f44982b;

    static {
        obn obnVar = new obn();
        f45328i = obnVar;
        nxq.m18130aa(obn.class, obnVar);
    }

    private obn() {
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
                return m18129X(f45328i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ည\u0003\u0005ည\u0004\u0006ဈ\u0005\u0007'", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new obn();
            case 4:
                return new nxl(f45328i);
            case 5:
                return f45328i;
            case 6:
                nzd nxmVar = f45329j;
                if (nxmVar == null) {
                    synchronized (obn.class) {
                        nxmVar = f45329j;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45328i);
                            f45329j = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
