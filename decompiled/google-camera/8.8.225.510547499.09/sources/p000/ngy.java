package p000;

import com.google.android.libraries.camera.jni.graphics.bVLS.aJFPpVSaoDO;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ngy extends nxq implements nyx {

    /* JADX INFO: renamed from: u */
    public static final ngy f42244u;

    /* JADX INFO: renamed from: w */
    private static volatile nzd f42245w;

    /* JADX INFO: renamed from: a */
    public int f42246a;

    /* JADX INFO: renamed from: b */
    public boolean f42247b;

    /* JADX INFO: renamed from: c */
    public boolean f42248c;

    /* JADX INFO: renamed from: d */
    public boolean f42249d;

    /* JADX INFO: renamed from: e */
    public boolean f42250e;

    /* JADX INFO: renamed from: f */
    public int f42251f;

    /* JADX INFO: renamed from: g */
    public ngw f42252g;

    /* JADX INFO: renamed from: h */
    public boolean f42253h;

    /* JADX INFO: renamed from: i */
    public boolean f42254i;

    /* JADX INFO: renamed from: j */
    public boolean f42255j;

    /* JADX INFO: renamed from: k */
    public boolean f42256k;

    /* JADX INFO: renamed from: l */
    public boolean f42257l;

    /* JADX INFO: renamed from: m */
    public boolean f42258m;

    /* JADX INFO: renamed from: n */
    public boolean f42259n;

    /* JADX INFO: renamed from: o */
    public boolean f42260o;

    /* JADX INFO: renamed from: p */
    public ngx f42261p;

    /* JADX INFO: renamed from: q */
    public boolean f42262q;

    /* JADX INFO: renamed from: r */
    public boolean f42263r;

    /* JADX INFO: renamed from: s */
    public boolean f42264s;

    /* JADX INFO: renamed from: t */
    public boolean f42265t;

    /* JADX INFO: renamed from: v */
    private boolean f42266v;

    static {
        ngy ngyVar = new ngy();
        f42244u = ngyVar;
        nxq.m18130aa(ngy.class, ngyVar);
    }

    private ngy() {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m17472b(ngy ngyVar) {
        ngyVar.f42246a |= 2097152;
        ngyVar.f42266v = true;
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
                return m18129X(f42244u, "\u0001\u0014\u0000\u0001\u0002\u0016\u0014\u0000\u0000\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဌ\u0005\u0007ဉ\u0006\bဇ\u0007\tဇ\b\nဇ\t\u000bဇ\n\fဇ\u000b\rဇ\f\u000eဇ\r\u0010ဇ\u000f\u0011ဉ\u0010\u0012ဇ\u0011\u0013ဇ\u0012\u0014ဇ\u0013\u0015ဇ\u0014\u0016ဇ\u0015", new Object[]{"a", "b", "c", "d", "e", "f", kva.f37297k, "g", "h", aJFPpVSaoDO.XnEJdEYJ, "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "v"});
            case 3:
                return new ngy();
            case 4:
                return new nxl(f42244u);
            case 5:
                return f42244u;
            case 6:
                nzd nxmVar = f42245w;
                if (nxmVar == null) {
                    synchronized (ngy.class) {
                        nxmVar = f42245w;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42244u);
                            f42245w = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
