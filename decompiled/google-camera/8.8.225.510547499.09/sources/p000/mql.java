package p000;

import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class mql extends nxq implements nyx {

    /* JADX INFO: renamed from: k */
    public static final mql f41405k;

    /* JADX INFO: renamed from: l */
    private static volatile nzd f41406l;

    /* JADX INFO: renamed from: a */
    public int f41407a;

    /* JADX INFO: renamed from: b */
    public int f41408b;

    /* JADX INFO: renamed from: c */
    public int f41409c;

    /* JADX INFO: renamed from: d */
    public int f41410d;

    /* JADX INFO: renamed from: e */
    public int f41411e;

    /* JADX INFO: renamed from: f */
    public int f41412f;

    /* JADX INFO: renamed from: g */
    public int f41413g;

    /* JADX INFO: renamed from: h */
    public int f41414h;

    /* JADX INFO: renamed from: i */
    public int f41415i;

    /* JADX INFO: renamed from: j */
    public int f41416j;

    static {
        mql mqlVar = new mql();
        f41405k = mqlVar;
        nxq.m18130aa(mql.class, mqlVar);
    }

    private mql() {
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
                return m18129X(f41405k, "\u0000\n\u0000\u0000\u0002\r\n\u0000\u0000\u0000\u0002\u000b\u0004\u000b\u0005\u000b\u0006\u000f\b\u000f\t\u000f\n\u000b\u000b\u000b\f\u000b\r\u000b", new Object[]{"a", "b", "c", "d", "e", "f", "g", TVkaNXnfP.GwfgfyQdq, "i", "j"});
            case 3:
                return new mql();
            case 4:
                return new nxl(f41405k);
            case 5:
                return f41405k;
            case 6:
                nzd nxmVar = f41406l;
                if (nxmVar == null) {
                    synchronized (mql.class) {
                        nxmVar = f41406l;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f41405k);
                            f41406l = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
