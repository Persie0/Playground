package p000;

import com.google.android.apps.camera.zoomui.view.WdNM.xPAWq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ntk extends nxq implements nyx {

    /* JADX INFO: renamed from: l */
    public static final ntk f44476l;

    /* JADX INFO: renamed from: n */
    private static volatile nzd f44477n;

    /* JADX INFO: renamed from: a */
    public float f44478a = -1.0f;

    /* JADX INFO: renamed from: b */
    public float f44479b = -1.0f;

    /* JADX INFO: renamed from: c */
    public float f44480c = -1.0f;

    /* JADX INFO: renamed from: d */
    public float f44481d = -1.0f;

    /* JADX INFO: renamed from: e */
    public float f44482e = -1.0f;

    /* JADX INFO: renamed from: f */
    public float f44483f = -1.0f;

    /* JADX INFO: renamed from: g */
    public float f44484g = -1.0f;

    /* JADX INFO: renamed from: h */
    public float f44485h = -1.0f;

    /* JADX INFO: renamed from: i */
    public float f44486i = -999.0f;

    /* JADX INFO: renamed from: j */
    public float f44487j;

    /* JADX INFO: renamed from: k */
    public float f44488k;

    /* JADX INFO: renamed from: m */
    private int f44489m;

    static {
        ntk ntkVar = new ntk();
        f44476l = ntkVar;
        nxq.m18130aa(ntk.class, ntkVar);
    }

    private ntk() {
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
                return m18129X(f44476l, "\u0001\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tခ\b\nခ\t\u000bခ\n\fခ\u000b", new Object[]{"m", "a", "b", "c", "d", "e", "f", "g", "h", "i", xPAWq.xGjGVkoSBpx, "k"});
            case 3:
                return new ntk();
            case 4:
                return new nxl(f44476l);
            case 5:
                return f44476l;
            case 6:
                nzd nxmVar = f44477n;
                if (nxmVar == null) {
                    synchronized (ntk.class) {
                        nxmVar = f44477n;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44476l);
                            f44477n = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
