package p000;

import com.google.android.libraries.vision.opengl.MUg.WIxTIdUIdfb;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class njt extends nxq implements nyx {

    /* JADX INFO: renamed from: i */
    public static final njt f43078i;

    /* JADX INFO: renamed from: j */
    private static volatile nzd f43079j;

    /* JADX INFO: renamed from: a */
    public int f43080a;

    /* JADX INFO: renamed from: b */
    public int f43081b;

    /* JADX INFO: renamed from: c */
    public int f43082c;

    /* JADX INFO: renamed from: d */
    public int f43083d;

    /* JADX INFO: renamed from: e */
    public int f43084e;

    /* JADX INFO: renamed from: f */
    public nxy f43085f;

    /* JADX INFO: renamed from: g */
    public nxy f43086g;

    /* JADX INFO: renamed from: h */
    public int f43087h;

    static {
        njt njtVar = new njt();
        f43078i = njtVar;
        nxq.m18130aa(njt.class, njtVar);
    }

    private njt() {
        nzg nzgVar = nzg.f45063b;
        this.f43085f = nzgVar;
        this.f43086g = nzgVar;
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
                return m18129X(f43078i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001င\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004င\u0003\u0005\u001b\u0006\u001b\u0007င\u0004", new Object[]{"a", "b", "c", niy.f42847u, "d", niy.f42846t, "e", WIxTIdUIdfb.LDHHQfkgIw, njr.class, "g", njs.class, "h"});
            case 3:
                return new njt();
            case 4:
                return new nxl(f43078i);
            case 5:
                return f43078i;
            case 6:
                nzd nxmVar = f43079j;
                if (nxmVar == null) {
                    synchronized (njt.class) {
                        nxmVar = f43079j;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43078i);
                            f43079j = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
