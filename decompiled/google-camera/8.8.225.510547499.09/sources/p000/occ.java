package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class occ extends nxo implements nyx {

    /* JADX INFO: renamed from: k */
    public static final occ f45430k;

    /* JADX INFO: renamed from: n */
    private static volatile nzd f45431n;

    /* JADX INFO: renamed from: a */
    public int f45432a;

    /* JADX INFO: renamed from: b */
    public oca f45433b;

    /* JADX INFO: renamed from: c */
    public nxy f45434c;

    /* JADX INFO: renamed from: d */
    public float f45435d;

    /* JADX INFO: renamed from: e */
    public float f45436e;

    /* JADX INFO: renamed from: f */
    public float f45437f;

    /* JADX INFO: renamed from: g */
    public float f45438g;

    /* JADX INFO: renamed from: h */
    public nxy f45439h;

    /* JADX INFO: renamed from: i */
    public long f45440i;

    /* JADX INFO: renamed from: j */
    public long f45441j;

    /* JADX INFO: renamed from: m */
    private byte f45442m = 2;

    static {
        occ occVar = new occ();
        f45430k = occVar;
        nxq.m18130aa(occ.class, occVar);
    }

    private occ() {
        nzg nzgVar = nzg.f45063b;
        this.f45434c = nzgVar;
        this.f45439h = nzgVar;
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f45442m);
            case 1:
            default:
                this.f45442m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f45430k, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003ခ\u0001\u0004ခ\u0002\u0005ခ\u0003\u0006ခ\u0004\b\u001b\tဃ\u0007\fဃ\u0006", new Object[]{"a", "b", "c", ocb.class, "d", "e", "f", "g", "h", obz.class, "j", "i"});
            case 3:
                return new occ();
            case 4:
                return new nxn(f45430k);
            case 5:
                return f45430k;
            case 6:
                nzd nxmVar = f45431n;
                if (nxmVar == null) {
                    synchronized (occ.class) {
                        nxmVar = f45431n;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45430k);
                            f45431n = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
