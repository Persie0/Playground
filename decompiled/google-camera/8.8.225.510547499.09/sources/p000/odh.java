package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class odh extends nxq implements nyx {

    /* JADX INFO: renamed from: m */
    public static final odh f45607m;

    /* JADX INFO: renamed from: o */
    private static volatile nzd f45608o;

    /* JADX INFO: renamed from: a */
    public int f45609a;

    /* JADX INFO: renamed from: b */
    public long f45610b;

    /* JADX INFO: renamed from: c */
    public long f45611c;

    /* JADX INFO: renamed from: d */
    public odb f45612d;

    /* JADX INFO: renamed from: e */
    public ocd f45613e;

    /* JADX INFO: renamed from: f */
    public boolean f45614f;

    /* JADX INFO: renamed from: h */
    public odi f45616h;

    /* JADX INFO: renamed from: i */
    public odg f45617i;

    /* JADX INFO: renamed from: j */
    public float f45618j;

    /* JADX INFO: renamed from: k */
    public odp f45619k;

    /* JADX INFO: renamed from: l */
    public ocj f45620l;

    /* JADX INFO: renamed from: n */
    private byte f45621n = 2;

    /* JADX INFO: renamed from: g */
    public boolean f45615g = true;

    static {
        odh odhVar = new odh();
        f45607m = odhVar;
        nxq.m18130aa(odh.class, odhVar);
    }

    private odh() {
        nzg nzgVar = nzg.f45063b;
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f45621n);
            case 1:
            default:
                this.f45621n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f45607m, "\u0001\u000b\u0000\u0001\u0001\u0016\u000b\u0000\u0000\u0001\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဉ\u0005\u0004ᐉ\u0006\u0005ခ\u0010\u0006ဉ\u000e\u0007ဉ\u000f\u000bဇ\t\u0013ဉ\u0017\u0015ဉ\u0015\u0016ဇ\u000b", new Object[]{"a", "b", "c", "d", "e", "j", "h", "i", "f", "l", "k", "g"});
            case 3:
                return new odh();
            case 4:
                return new nxl(f45607m);
            case 5:
                return f45607m;
            case 6:
                nzd nxmVar = f45608o;
                if (nxmVar == null) {
                    synchronized (odh.class) {
                        nxmVar = f45608o;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45607m);
                            f45608o = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
