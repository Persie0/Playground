package p000;

import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;
import com.google.android.material.behavior.iWN.zuAgeeF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class obi extends nxq implements nyx {

    /* JADX INFO: renamed from: m */
    public static final obi f45288m;

    /* JADX INFO: renamed from: n */
    private static volatile nzd f45289n;

    /* JADX INFO: renamed from: a */
    public int f45290a;

    /* JADX INFO: renamed from: b */
    public float f45291b;

    /* JADX INFO: renamed from: c */
    public float f45292c;

    /* JADX INFO: renamed from: d */
    public float f45293d;

    /* JADX INFO: renamed from: e */
    public float f45294e;

    /* JADX INFO: renamed from: f */
    public float f45295f;

    /* JADX INFO: renamed from: g */
    public float f45296g;

    /* JADX INFO: renamed from: h */
    public float f45297h;

    /* JADX INFO: renamed from: i */
    public float f45298i;

    /* JADX INFO: renamed from: j */
    public float f45299j;

    /* JADX INFO: renamed from: k */
    public float f45300k;

    /* JADX INFO: renamed from: l */
    public float f45301l;

    static {
        obi obiVar = new obi();
        f45288m = obiVar;
        nxq.m18130aa(obi.class, obiVar);
    }

    private obi() {
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
                return m18129X(f45288m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tခ\b\nခ\t\u000bခ\n", new Object[]{"a", "b", "c", zuAgeeF.MVwAegMHsnkR, "e", "f", "g", "h", "i", "j", voNZjxiJou.KLruyTzwJEzBiSF, "l"});
            case 3:
                return new obi();
            case 4:
                return new nxl(f45288m);
            case 5:
                return f45288m;
            case 6:
                nzd nxmVar = f45289n;
                if (nxmVar == null) {
                    synchronized (obi.class) {
                        nxmVar = f45289n;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45288m);
                            f45289n = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
