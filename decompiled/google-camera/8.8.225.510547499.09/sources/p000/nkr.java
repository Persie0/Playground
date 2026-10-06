package p000;

import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;
import com.google.android.material.behavior.iWN.zuAgeeF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nkr extends nxq implements nyx {

    /* JADX INFO: renamed from: x */
    public static final nkr f43268x;

    /* JADX INFO: renamed from: y */
    private static volatile nzd f43269y;

    /* JADX INFO: renamed from: a */
    public int f43270a;

    /* JADX INFO: renamed from: b */
    public int f43271b;

    /* JADX INFO: renamed from: c */
    public boolean f43272c;

    /* JADX INFO: renamed from: d */
    public int f43273d;

    /* JADX INFO: renamed from: e */
    public float f43274e;

    /* JADX INFO: renamed from: f */
    public float f43275f;

    /* JADX INFO: renamed from: g */
    public float f43276g;

    /* JADX INFO: renamed from: h */
    public float f43277h;

    /* JADX INFO: renamed from: i */
    public float f43278i;

    /* JADX INFO: renamed from: j */
    public int f43279j;

    /* JADX INFO: renamed from: k */
    public int f43280k;

    /* JADX INFO: renamed from: l */
    public int f43281l;

    /* JADX INFO: renamed from: m */
    public boolean f43282m;

    /* JADX INFO: renamed from: n */
    public int f43283n;

    /* JADX INFO: renamed from: o */
    public boolean f43284o;

    /* JADX INFO: renamed from: p */
    public nix f43285p;

    /* JADX INFO: renamed from: q */
    public nix f43286q;

    /* JADX INFO: renamed from: r */
    public nix f43287r;

    /* JADX INFO: renamed from: s */
    public nix f43288s;

    /* JADX INFO: renamed from: t */
    public nix f43289t;

    /* JADX INFO: renamed from: u */
    public float f43290u;

    /* JADX INFO: renamed from: v */
    public float f43291v;

    /* JADX INFO: renamed from: w */
    public nhj f43292w;

    static {
        nkr nkrVar = new nkr();
        f43268x = nkrVar;
        nxq.m18130aa(nkr.class, nkrVar);
    }

    private nkr() {
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
                return m18129X(f43268x, "\u0001\u0016\u0000\u0001\u0001\u0017\u0016\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003င\u0002\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tခ\b\nင\t\u000bင\n\fင\u000b\rဇ\f\u000eင\r\u000fဇ\u000e\u0010ဉ\u000f\u0011ဉ\u0010\u0012ဉ\u0011\u0013ဉ\u0012\u0014ဉ\u0013\u0015ဉ\u0016\u0016ခ\u0014\u0017ခ\u0015", new Object[]{"a", hsSUWRJfoeC.QRL, "c", "d", "e", "f", "g", "h", "i", "j", zuAgeeF.hxGB, "l", "m", "n", "o", "p", "q", "r", "s", "t", "w", "u", "v"});
            case 3:
                return new nkr();
            case 4:
                return new nxl(f43268x);
            case 5:
                return f43268x;
            case 6:
                nzd nxmVar = f43269y;
                if (nxmVar == null) {
                    synchronized (nkr.class) {
                        nxmVar = f43269y;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43268x);
                            f43269y = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
