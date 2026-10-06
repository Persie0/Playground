package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mel extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final mel f40191d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f40192e;

    /* JADX INFO: renamed from: a */
    public int f40193a;

    /* JADX INFO: renamed from: b */
    public int f40194b;

    /* JADX INFO: renamed from: c */
    public nxy f40195c = nzg.f45063b;

    static {
        mel melVar = new mel();
        f40191d = melVar;
        nxq.m18130aa(mel.class, melVar);
    }

    private mel() {
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
                return m18129X(f40191d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002င\u0000\u0003\u001a", new Object[]{"a", "b", "c"});
            case 3:
                return new mel();
            case 4:
                return new nxl(f40191d);
            case 5:
                return f40191d;
            case 6:
                nzd nxmVar = f40192e;
                if (nxmVar == null) {
                    synchronized (mel.class) {
                        nxmVar = f40192e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f40191d);
                            f40192e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
