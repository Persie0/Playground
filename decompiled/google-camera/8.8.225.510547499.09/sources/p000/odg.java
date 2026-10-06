package p000;

import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class odg extends nxq implements nyx {

    /* JADX INFO: renamed from: i */
    public static final odg f45596i;

    /* JADX INFO: renamed from: k */
    private static volatile nzd f45597k;

    /* JADX INFO: renamed from: a */
    public int f45598a;

    /* JADX INFO: renamed from: b */
    public float f45599b;

    /* JADX INFO: renamed from: d */
    public oda f45601d;

    /* JADX INFO: renamed from: e */
    public float f45602e;

    /* JADX INFO: renamed from: f */
    public float f45603f;

    /* JADX INFO: renamed from: g */
    public float f45604g;

    /* JADX INFO: renamed from: h */
    public float f45605h;

    /* JADX INFO: renamed from: c */
    public nyr f45600c = nyr.f45033a;

    /* JADX INFO: renamed from: j */
    private nyr f45606j = nyr.f45033a;

    static {
        odg odgVar = new odg();
        f45596i = odgVar;
        nxq.m18130aa(odg.class, odgVar);
    }

    private odg() {
        nzg nzgVar = nzg.f45063b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m18402c(String str) {
        return this.f45600c.containsKey(str);
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
                return m18129X(f45596i, "\u0001\b\u0000\u0001\u0002\u000f\b\u0002\u0000\u0000\u0002ခ\u0002\b2\tဉ\u0007\n2\fခ\b\rခ\t\u000eခ\n\u000fခ\u000b", new Object[]{"a", "b", "c", odc.f45588a, "d", "j", ode.f45591a, voNZjxiJou.yDUsRhjaWzIK, "f", "g", "h"});
            case 3:
                return new odg();
            case 4:
                return new nxl(f45596i);
            case 5:
                return f45596i;
            case 6:
                nzd nxmVar = f45597k;
                if (nxmVar == null) {
                    synchronized (odg.class) {
                        nxmVar = f45597k;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45596i);
                            f45597k = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
