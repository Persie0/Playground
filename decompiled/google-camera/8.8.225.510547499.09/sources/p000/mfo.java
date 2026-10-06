package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mfo extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final mfo f40369b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f40370c;

    /* JADX INFO: renamed from: a */
    public nxy f40371a = nzg.f45063b;

    static {
        mfo mfoVar = new mfo();
        f40369b = mfoVar;
        nxq.m18130aa(mfo.class, mfoVar);
    }

    private mfo() {
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
                return m18129X(f40369b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", mfh.class});
            case 3:
                return new mfo();
            case 4:
                return new nxl(f40369b);
            case 5:
                return f40369b;
            case 6:
                nzd nxmVar = f40370c;
                if (nxmVar == null) {
                    synchronized (mfo.class) {
                        nxmVar = f40370c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f40369b);
                            f40370c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
