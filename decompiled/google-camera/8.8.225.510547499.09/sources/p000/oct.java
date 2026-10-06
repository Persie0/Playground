package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class oct extends nxo implements nyx {

    /* JADX INFO: renamed from: j */
    public static final oct f45527j;

    /* JADX INFO: renamed from: m */
    private static volatile nzd f45528m;

    /* JADX INFO: renamed from: a */
    public int f45529a;

    /* JADX INFO: renamed from: e */
    public float f45533e;

    /* JADX INFO: renamed from: g */
    public boolean f45535g;

    /* JADX INFO: renamed from: h */
    public int f45536h;

    /* JADX INFO: renamed from: i */
    public ocr f45537i;

    /* JADX INFO: renamed from: k */
    private byte f45538k = 2;

    /* JADX INFO: renamed from: b */
    public String f45530b = "";

    /* JADX INFO: renamed from: c */
    public int f45531c = 10;

    /* JADX INFO: renamed from: d */
    public int f45532d = 1;

    /* JADX INFO: renamed from: f */
    public float f45534f = 0.3f;

    static {
        oct octVar = new oct();
        f45527j = octVar;
        nxq.m18130aa(oct.class, octVar);
    }

    private oct() {
        nzg nzgVar = nzg.f45063b;
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f45538k);
            case 1:
            default:
                this.f45538k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f45527j, "\u0001\b\u0000\u0001\u0001\u0010\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ခ\u0003\u0005ခ\u0004\tဇ\u0007\nဋ\b\u0010ဉ\r", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new oct();
            case 4:
                return new nxn(f45527j);
            case 5:
                return f45527j;
            case 6:
                nzd nxmVar = f45528m;
                if (nxmVar == null) {
                    synchronized (oct.class) {
                        nxmVar = f45528m;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45527j);
                            f45528m = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
