package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class loe extends nxo implements nyx {

    /* JADX INFO: renamed from: c */
    public static final loe f38797c;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f38798e;

    /* JADX INFO: renamed from: a */
    public int f38799a;

    /* JADX INFO: renamed from: b */
    public pat f38800b;

    /* JADX INFO: renamed from: d */
    private byte f38801d = 2;

    static {
        loe loeVar = new loe();
        f38797c = loeVar;
        nxq.m18130aa(loe.class, loeVar);
    }

    private loe() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f38801d);
            case 1:
            default:
                this.f38801d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f38797c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new loe();
            case 4:
                return new nxn(f38797c);
            case 5:
                return f38797c;
            case 6:
                nzd nxmVar = f38798e;
                if (nxmVar == null) {
                    synchronized (loe.class) {
                        nxmVar = f38798e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f38797c);
                            f38798e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
