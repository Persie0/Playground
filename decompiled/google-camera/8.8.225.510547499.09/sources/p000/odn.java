package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class odn extends nxq implements nyx {

    /* JADX INFO: renamed from: i */
    public static final odn f45632i;

    /* JADX INFO: renamed from: j */
    public static final ktz f45633j;

    /* JADX INFO: renamed from: m */
    private static volatile nzd f45634m;

    /* JADX INFO: renamed from: a */
    public int f45635a;

    /* JADX INFO: renamed from: b */
    public odk f45636b;

    /* JADX INFO: renamed from: c */
    public odk f45637c;

    /* JADX INFO: renamed from: d */
    public float f45638d;

    /* JADX INFO: renamed from: e */
    public float f45639e;

    /* JADX INFO: renamed from: f */
    public float f45640f;

    /* JADX INFO: renamed from: g */
    public odo f45641g;

    /* JADX INFO: renamed from: h */
    public odo f45642h;

    /* JADX INFO: renamed from: k */
    private nyr f45643k = nyr.f45033a;

    /* JADX INFO: renamed from: l */
    private nyr f45644l = nyr.f45033a;

    static {
        odn odnVar = new odn();
        f45632i = odnVar;
        nxq.m18130aa(odn.class, odnVar);
        f45633j = nxq.m18133af(occ.f45430k, odnVar, odnVar, 202575443, oaj.f45141k);
    }

    private odn() {
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
                return m18129X(f45632i, "\u0001\t\u0000\u0001\u0001\t\t\u0002\u0000\u0000\u00012\u00022\u0003ဉ\u0001\u0004ခ\u0002\u0005ခ\u0003\u0006ခ\u0004\u0007ဉ\u0000\bဉ\u0005\tဉ\u0006", new Object[]{"a", "k", odl.f45629a, "l", odj.f45625a, "c", "d", "e", "f", "b", "g", "h"});
            case 3:
                return new odn();
            case 4:
                return new nxl(f45632i);
            case 5:
                return f45632i;
            case 6:
                nzd nxmVar = f45634m;
                if (nxmVar == null) {
                    synchronized (odn.class) {
                        nxmVar = f45634m;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45632i);
                            f45634m = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
