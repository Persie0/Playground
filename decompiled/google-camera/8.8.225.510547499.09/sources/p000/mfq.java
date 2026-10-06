package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mfq extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final mfq f40377b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f40378c;

    /* JADX INFO: renamed from: a */
    public nxy f40379a = nzg.f45063b;

    static {
        mfq mfqVar = new mfq();
        f40377b = mfqVar;
        nxq.m18130aa(mfq.class, mfqVar);
    }

    private mfq() {
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
                return m18129X(f40377b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", mfp.class});
            case 3:
                return new mfq();
            case 4:
                return new nxl(f40377b);
            case 5:
                return f40377b;
            case 6:
                nzd nxmVar = f40378c;
                if (nxmVar == null) {
                    synchronized (mfq.class) {
                        nxmVar = f40378c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f40377b);
                            f40378c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
