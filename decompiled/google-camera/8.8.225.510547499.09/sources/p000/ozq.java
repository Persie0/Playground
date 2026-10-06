package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ozq extends nxq implements nyx {

    /* JADX INFO: renamed from: g */
    public static final ozq f47058g;

    /* JADX INFO: renamed from: i */
    private static volatile nzd f47059i;

    /* JADX INFO: renamed from: a */
    public int f47060a;

    /* JADX INFO: renamed from: b */
    public int f47061b;

    /* JADX INFO: renamed from: c */
    public int f47062c;

    /* JADX INFO: renamed from: d */
    public String f47063d;

    /* JADX INFO: renamed from: e */
    public nxx f47064e;

    /* JADX INFO: renamed from: f */
    public ozs f47065f;

    /* JADX INFO: renamed from: h */
    private byte f47066h = 2;

    static {
        ozq ozqVar = new ozq();
        f47058g = ozqVar;
        nxq.m18130aa(ozq.class, ozqVar);
    }

    private ozq() {
        nzg nzgVar = nzg.f45063b;
        this.f47063d = "";
        this.f47064e = nyn.f45025b;
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f47066h);
            case 1:
            default:
                this.f47066h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f47058g, "\u0001\u0005\u0000\u0001\u0005\u0016\u0005\u0000\u0001\u0000\u0005င\u0005\bဌ\b\u0011ဈ\u0013\u0015(\u0016ဉ\u0016", new Object[]{"a", "b", "c", oau.f45205t, "d", "e", "f"});
            case 3:
                return new ozq();
            case 4:
                return new nxl(f47058g);
            case 5:
                return f47058g;
            case 6:
                nzd nxmVar = f47059i;
                if (nxmVar == null) {
                    synchronized (ozq.class) {
                        nxmVar = f47059i;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47058g);
                            f47059i = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
