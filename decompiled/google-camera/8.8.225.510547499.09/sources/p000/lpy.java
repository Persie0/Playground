package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lpy extends nxq implements nyx {

    /* JADX INFO: renamed from: i */
    public static final lpy f38931i;

    /* JADX INFO: renamed from: j */
    private static volatile nzd f38932j;

    /* JADX INFO: renamed from: a */
    public int f38933a;

    /* JADX INFO: renamed from: b */
    public String f38934b = "";

    /* JADX INFO: renamed from: c */
    public nwr f38935c = nwr.f44839b;

    /* JADX INFO: renamed from: d */
    public String f38936d = "";

    /* JADX INFO: renamed from: e */
    public nxy f38937e;

    /* JADX INFO: renamed from: f */
    public nxy f38938f;

    /* JADX INFO: renamed from: g */
    public boolean f38939g;

    /* JADX INFO: renamed from: h */
    public long f38940h;

    static {
        lpy lpyVar = new lpy();
        f38931i = lpyVar;
        nxq.m18130aa(lpy.class, lpyVar);
    }

    private lpy() {
        nzg nzgVar = nzg.f45063b;
        this.f38937e = nzgVar;
        this.f38938f = nzgVar;
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
                return m18129X(f38931i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"a", "d", "b", "c", "e", lpz.class, "f", "g", "h"});
            case 3:
                return new lpy();
            case 4:
                return new nxl(f38931i);
            case 5:
                return f38931i;
            case 6:
                nzd nxmVar = f38932j;
                if (nxmVar == null) {
                    synchronized (lpy.class) {
                        nxmVar = f38932j;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f38931i);
                            f38932j = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
