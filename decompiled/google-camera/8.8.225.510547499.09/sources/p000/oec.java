package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oec extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final oec f45694a;

    /* JADX INFO: renamed from: k */
    private static volatile nzd f45695k;

    /* JADX INFO: renamed from: b */
    private int f45696b;

    /* JADX INFO: renamed from: c */
    private nyr f45697c = nyr.f45033a;

    /* JADX INFO: renamed from: d */
    private nyr f45698d;

    /* JADX INFO: renamed from: e */
    private odx f45699e;

    /* JADX INFO: renamed from: f */
    private odx f45700f;

    /* JADX INFO: renamed from: g */
    private nyr f45701g;

    /* JADX INFO: renamed from: h */
    private odx f45702h;

    /* JADX INFO: renamed from: i */
    private nyr f45703i;

    /* JADX INFO: renamed from: j */
    private nyr f45704j;

    static {
        oec oecVar = new oec();
        f45694a = oecVar;
        nxq.m18130aa(oec.class, oecVar);
    }

    private oec() {
        nyr nyrVar = nyr.f45033a;
        this.f45698d = nyrVar;
        this.f45701g = nyrVar;
        this.f45703i = nyrVar;
        this.f45704j = nyrVar;
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
                return m18129X(f45694a, "\u0001\b\u0000\u0001\u0001\u0014\b\u0005\u0000\u0000\u00012\u00052\u0007ဉ\n\bဉ\u0003\t2\u00122\u0013ဉ\u000b\u00142", new Object[]{"b", "c", ody.f45689a, "d", odu.f45682a, "f", "e", "j", odr.f45677a, "g", odz.f45690a, "h", "i", oea.f45691a});
            case 3:
                return new oec();
            case 4:
                return new nxl(f45694a);
            case 5:
                return f45694a;
            case 6:
                nzd nxmVar = f45695k;
                if (nxmVar == null) {
                    synchronized (oec.class) {
                        nxmVar = f45695k;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45694a);
                            f45695k = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
