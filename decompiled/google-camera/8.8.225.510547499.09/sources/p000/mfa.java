package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mfa extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final mfa f40291d;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f40292f;

    /* JADX INFO: renamed from: a */
    public int f40293a;

    /* JADX INFO: renamed from: b */
    public String f40294b = "";

    /* JADX INFO: renamed from: c */
    public nxy f40295c = nzg.f45063b;

    /* JADX INFO: renamed from: e */
    private int f40296e;

    static {
        mfa mfaVar = new mfa();
        f40291d = mfaVar;
        nxq.m18130aa(mfa.class, mfaVar);
    }

    private mfa() {
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
                return m18129X(f40291d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"e", "a", "b", "c", mem.class});
            case 3:
                return new mfa();
            case 4:
                return new nxl(f40291d);
            case 5:
                return f40291d;
            case 6:
                nzd nxmVar = f40292f;
                if (nxmVar == null) {
                    synchronized (mfa.class) {
                        nxmVar = f40292f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f40291d);
                            f40292f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
