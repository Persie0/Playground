package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class meu extends nxq implements nyx {

    /* JADX INFO: renamed from: g */
    public static final meu f40226g;

    /* JADX INFO: renamed from: i */
    private static volatile nzd f40227i;

    /* JADX INFO: renamed from: a */
    public int f40228a;

    /* JADX INFO: renamed from: c */
    public Object f40230c;

    /* JADX INFO: renamed from: d */
    public mex f40231d;

    /* JADX INFO: renamed from: e */
    public boolean f40232e;

    /* JADX INFO: renamed from: f */
    public int f40233f;

    /* JADX INFO: renamed from: b */
    public int f40229b = 0;

    /* JADX INFO: renamed from: h */
    private byte f40234h = 2;

    static {
        meu meuVar = new meu();
        f40226g = meuVar;
        nxq.m18130aa(meu.class, meuVar);
    }

    private meu() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f40234h);
            case 1:
            default:
                this.f40234h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f40226g, "\u0001\u0005\u0001\u0001\u0001\b\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဇ\u0001\u0005်\u0000\u0006်\u0000\bင\u0007", new Object[]{"c", "b", "a", "d", "e", "f"});
            case 3:
                return new meu();
            case 4:
                return new nxl(f40226g);
            case 5:
                return f40226g;
            case 6:
                nzd nxmVar = f40227i;
                if (nxmVar == null) {
                    synchronized (meu.class) {
                        nxmVar = f40227i;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f40226g);
                            f40227i = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
