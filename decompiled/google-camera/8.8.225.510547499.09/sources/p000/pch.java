package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pch extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final pch f47404f;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f47405g;

    /* JADX INFO: renamed from: a */
    public nyr f47406a = nyr.f45033a;

    /* JADX INFO: renamed from: b */
    public nyr f47407b = nyr.f45033a;

    /* JADX INFO: renamed from: c */
    public nxy f47408c = nzg.f45063b;

    /* JADX INFO: renamed from: d */
    public nxw f47409d = nxr.f44982b;

    /* JADX INFO: renamed from: e */
    public nxy f47410e = nzg.f45063b;

    static {
        pch pchVar = new pch();
        f47404f = pchVar;
        nxq.m18130aa(pch.class, pchVar);
    }

    private pch() {
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
                return m18129X(f47404f, "\u0001\u0005\u0000\u0000\u0001\u0005\u0005\u0002\u0003\u0000\u00012\u00022\u0003\u001b\u0004'\u0005\u001b", new Object[]{"a", pcf.f47402a, "b", pcg.f47403a, "c", pce.class, "d", "e", pcb.class});
            case 3:
                return new pch();
            case 4:
                return new nxl(f47404f);
            case 5:
                return f47404f;
            case 6:
                nzd nxmVar = f47405g;
                if (nxmVar == null) {
                    synchronized (pch.class) {
                        nxmVar = f47405g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47404f);
                            f47405g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
