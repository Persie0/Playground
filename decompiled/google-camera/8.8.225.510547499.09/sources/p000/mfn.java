package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mfn extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final mfn f40366b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f40367c;

    /* JADX INFO: renamed from: a */
    public nxy f40368a = nzg.f45063b;

    static {
        mfn mfnVar = new mfn();
        f40366b = mfnVar;
        nxq.m18130aa(mfn.class, mfnVar);
    }

    private mfn() {
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
                return m18129X(f40366b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", mfo.class});
            case 3:
                return new mfn();
            case 4:
                return new nxl(f40366b);
            case 5:
                return f40366b;
            case 6:
                nzd nxmVar = f40367c;
                if (nxmVar == null) {
                    synchronized (mfn.class) {
                        nxmVar = f40367c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f40366b);
                            f40367c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
