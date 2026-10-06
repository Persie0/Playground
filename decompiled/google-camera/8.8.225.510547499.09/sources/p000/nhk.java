package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nhk extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final nhk f42331e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f42332f;

    /* JADX INFO: renamed from: a */
    public int f42333a;

    /* JADX INFO: renamed from: b */
    public int f42334b;

    /* JADX INFO: renamed from: c */
    public long f42335c;

    /* JADX INFO: renamed from: d */
    public nxy f42336d = nzg.f45063b;

    static {
        nhk nhkVar = new nhk();
        f42331e = nhkVar;
        nxq.m18130aa(nhk.class, nhkVar);
    }

    private nhk() {
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
                return m18129X(f42331e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003\u001b", new Object[]{"a", "b", kva.f37301o, "c", "d", nkq.class});
            case 3:
                return new nhk();
            case 4:
                return new nxl(f42331e);
            case 5:
                return f42331e;
            case 6:
                nzd nxmVar = f42332f;
                if (nxmVar == null) {
                    synchronized (nhk.class) {
                        nxmVar = f42332f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42331e);
                            f42332f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
