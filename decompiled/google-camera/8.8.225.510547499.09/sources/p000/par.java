package p000;

import com.google.android.apps.camera.zoomui.view.WdNM.xPAWq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class par extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final par f47262d;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f47263g;

    /* JADX INFO: renamed from: a */
    public int f47264a;

    /* JADX INFO: renamed from: b */
    public int f47265b;

    /* JADX INFO: renamed from: e */
    private paq f47267e;

    /* JADX INFO: renamed from: f */
    private byte f47268f = 2;

    /* JADX INFO: renamed from: c */
    public int f47266c = 1;

    static {
        par parVar = new par();
        f47262d = parVar;
        nxq.m18130aa(par.class, parVar);
    }

    private par() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f47268f);
            case 1:
            default:
                this.f47268f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f47262d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဌ\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"a", xPAWq.THkvVHbuuUuclE, pab.f47153f, "c", "e"});
            case 3:
                return new par();
            case 4:
                return new nxl(f47262d);
            case 5:
                return f47262d;
            case 6:
                nzd nxmVar = f47263g;
                if (nxmVar == null) {
                    synchronized (par.class) {
                        nxmVar = f47263g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47262d);
                            f47263g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
