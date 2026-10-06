package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nub extends nxq implements nyx {

    /* JADX INFO: renamed from: r */
    public static final nub f44615r;

    /* JADX INFO: renamed from: s */
    private static volatile nzd f44616s;

    /* JADX INFO: renamed from: a */
    public int f44617a;

    /* JADX INFO: renamed from: b */
    public int f44618b;

    /* JADX INFO: renamed from: c */
    public int f44619c;

    /* JADX INFO: renamed from: d */
    public int f44620d;

    /* JADX INFO: renamed from: e */
    public float f44621e = -1.0f;

    /* JADX INFO: renamed from: f */
    public float f44622f = -1.0f;

    /* JADX INFO: renamed from: g */
    public int f44623g;

    /* JADX INFO: renamed from: h */
    public nxv f44624h;

    /* JADX INFO: renamed from: i */
    public boolean f44625i;

    /* JADX INFO: renamed from: j */
    public ntz f44626j;

    /* JADX INFO: renamed from: k */
    public float f44627k;

    /* JADX INFO: renamed from: l */
    public float f44628l;

    /* JADX INFO: renamed from: m */
    public ntz f44629m;

    /* JADX INFO: renamed from: n */
    public ntz f44630n;

    /* JADX INFO: renamed from: o */
    public ntz f44631o;

    /* JADX INFO: renamed from: p */
    public ntz f44632p;

    /* JADX INFO: renamed from: q */
    public nty f44633q;

    static {
        nub nubVar = new nub();
        f44615r = nubVar;
        nxq.m18130aa(nub.class, nubVar);
    }

    private nub() {
        nxr nxrVar = nxr.f44982b;
        this.f44624h = nxj.f44968b;
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
                return m18129X(f44615r, "\u0001\u0010\u0000\u0001\u0003,\u0010\u0000\u0001\u0000\u0003ဋ\u0004\u0004ဋ\u0005\u0006ဋ\t\nခ\u0007\u000bခ\b\fဇ\u000b\r\u0013\u001dင\u0003#ဉ\u0013$ဉ\u0016%ဉ\u0017&ဉ\u0018'ဉ\u0019(ဉ\u001a+ခ\u0014,ခ\u0015", new Object[]{"a", "c", "d", "g", "e", "f", "i", "h", "b", "j", "m", "n", "o", "p", "q", "k", "l"});
            case 3:
                return new nub();
            case 4:
                return new nxl(f44615r);
            case 5:
                return f44615r;
            case 6:
                nzd nxmVar = f44616s;
                if (nxmVar == null) {
                    synchronized (nub.class) {
                        nxmVar = f44616s;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44615r);
                            f44616s = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
