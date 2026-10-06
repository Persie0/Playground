package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mep extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final mep f40212b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f40213c;

    /* JADX INFO: renamed from: a */
    public nxy f40214a = nzg.f45063b;

    static {
        mep mepVar = new mep();
        f40212b = mepVar;
        nxq.m18130aa(mep.class, mepVar);
    }

    private mep() {
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
                return m18129X(f40212b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", men.class});
            case 3:
                return new mep();
            case 4:
                return new nxl(f40212b);
            case 5:
                return f40212b;
            case 6:
                nzd nxmVar = f40213c;
                if (nxmVar == null) {
                    synchronized (mep.class) {
                        nxmVar = f40213c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f40212b);
                            f40213c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
