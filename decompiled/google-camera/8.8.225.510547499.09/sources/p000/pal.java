package p000;

import com.google.android.apps.camera.jni.microvideotonemap.yUpa.qQLA;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pal extends nxq implements nyx {

    /* JADX INFO: renamed from: n */
    public static final pal f47214n;

    /* JADX INFO: renamed from: o */
    private static volatile nzd f47215o;

    /* JADX INFO: renamed from: a */
    public int f47216a;

    /* JADX INFO: renamed from: b */
    public int f47217b;

    /* JADX INFO: renamed from: c */
    public int f47218c;

    /* JADX INFO: renamed from: d */
    public int f47219d;

    /* JADX INFO: renamed from: e */
    public int f47220e;

    /* JADX INFO: renamed from: f */
    public int f47221f;

    /* JADX INFO: renamed from: g */
    public int f47222g;

    /* JADX INFO: renamed from: h */
    public int f47223h;

    /* JADX INFO: renamed from: i */
    public pap f47224i;

    /* JADX INFO: renamed from: j */
    public nxy f47225j = nzg.f45063b;

    /* JADX INFO: renamed from: k */
    public int f47226k;

    /* JADX INFO: renamed from: l */
    public int f47227l;

    /* JADX INFO: renamed from: m */
    public pap f47228m;

    static {
        pal palVar = new pal();
        f47214n = palVar;
        nxq.m18130aa(pal.class, palVar);
    }

    private pal() {
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
                return m18129X(f47214n, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0006\u0005\u001b\u0007င\u0002\bင\u0004\tင\u0005\nဉ\u0007\u000bင\t\fင\n\rဉ\u000b", new Object[]{"a", "b", qQLA.oCibYvwtUaYZkh, "e", "h", "j", pak.class, "d", "f", "g", "i", "k", "l", "m"});
            case 3:
                return new pal();
            case 4:
                return new nxl(f47214n);
            case 5:
                return f47214n;
            case 6:
                nzd nxmVar = f47215o;
                if (nxmVar == null) {
                    synchronized (pal.class) {
                        nxmVar = f47215o;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47214n);
                            f47215o = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
