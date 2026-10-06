package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mfg extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final mfg f40322b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f40323c;

    /* JADX INFO: renamed from: a */
    public nxy f40324a = nzg.f45063b;

    static {
        mfg mfgVar = new mfg();
        f40322b = mfgVar;
        nxq.m18130aa(mfg.class, mfgVar);
    }

    private mfg() {
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
                return m18129X(f40322b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", mfe.class});
            case 3:
                return new mfg();
            case 4:
                return new nxl(f40322b);
            case 5:
                return f40322b;
            case 6:
                nzd nxmVar = f40323c;
                if (nxmVar == null) {
                    synchronized (mfg.class) {
                        nxmVar = f40323c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f40322b);
                            f40323c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
