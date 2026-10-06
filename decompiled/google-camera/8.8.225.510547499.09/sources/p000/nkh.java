package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nkh extends nxq implements nyx {

    /* JADX INFO: renamed from: g */
    public static final nkh f43200g;

    /* JADX INFO: renamed from: h */
    private static volatile nzd f43201h;

    /* JADX INFO: renamed from: a */
    public int f43202a;

    /* JADX INFO: renamed from: b */
    public int f43203b;

    /* JADX INFO: renamed from: c */
    public float f43204c;

    /* JADX INFO: renamed from: d */
    public float f43205d;

    /* JADX INFO: renamed from: e */
    public float f43206e;

    /* JADX INFO: renamed from: f */
    public long f43207f;

    static {
        nkh nkhVar = new nkh();
        f43200g = nkhVar;
        nxq.m18130aa(nkh.class, nkhVar);
    }

    private nkh() {
        nzg nzgVar = nzg.f45063b;
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
                return m18129X(f43200g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ဂ\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new nkh();
            case 4:
                return new nxl(f43200g);
            case 5:
                return f43200g;
            case 6:
                nzd nxmVar = f43201h;
                if (nxmVar == null) {
                    synchronized (nkh.class) {
                        nxmVar = f43201h;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43200g);
                            f43201h = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
