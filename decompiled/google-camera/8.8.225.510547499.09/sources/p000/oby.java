package p000;

import com.google.android.play.core.common.wMe.NptsKnlVczSZ;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oby extends nxq implements nyx {

    /* JADX INFO: renamed from: i */
    public static final oby f45400i;

    /* JADX INFO: renamed from: j */
    private static volatile nzd f45401j;

    /* JADX INFO: renamed from: a */
    public boolean f45402a;

    /* JADX INFO: renamed from: b */
    public int f45403b;

    /* JADX INFO: renamed from: c */
    public int f45404c;

    /* JADX INFO: renamed from: d */
    public float f45405d;

    /* JADX INFO: renamed from: e */
    public float f45406e;

    /* JADX INFO: renamed from: f */
    public float f45407f;

    /* JADX INFO: renamed from: g */
    public float f45408g;

    /* JADX INFO: renamed from: h */
    public nwr f45409h = nwr.f44839b;

    static {
        oby obyVar = new oby();
        f45400i = obyVar;
        nxq.m18130aa(oby.class, obyVar);
    }

    private oby() {
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
                return m18129X(f45400i, "\u0000\b\u0000\u0000\u0002\t\b\u0000\u0000\u0000\u0002\u0007\u0003\u0004\u0004\u0004\u0005\u0001\u0006\u0001\u0007\u0001\b\u0001\t\n", new Object[]{NptsKnlVczSZ.ztIObBPX, "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new oby();
            case 4:
                return new nxl(f45400i);
            case 5:
                return f45400i;
            case 6:
                nzd nxmVar = f45401j;
                if (nxmVar == null) {
                    synchronized (oby.class) {
                        nxmVar = f45401j;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45400i);
                            f45401j = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
