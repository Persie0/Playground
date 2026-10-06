package p000;

import com.google.android.libraries.social.licenses.GWO.HEePJw;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nld extends nxq implements nyx {

    /* JADX INFO: renamed from: A */
    public static final nld f43455A;

    /* JADX INFO: renamed from: B */
    private static volatile nzd f43456B;

    /* JADX INFO: renamed from: a */
    public int f43457a;

    /* JADX INFO: renamed from: b */
    public nlc f43458b;

    /* JADX INFO: renamed from: c */
    public float f43459c;

    /* JADX INFO: renamed from: d */
    public float f43460d;

    /* JADX INFO: renamed from: e */
    public float f43461e;

    /* JADX INFO: renamed from: f */
    public float f43462f;

    /* JADX INFO: renamed from: g */
    public float f43463g;

    /* JADX INFO: renamed from: h */
    public float f43464h;

    /* JADX INFO: renamed from: i */
    public float f43465i;

    /* JADX INFO: renamed from: j */
    public float f43466j;

    /* JADX INFO: renamed from: k */
    public float f43467k;

    /* JADX INFO: renamed from: l */
    public float f43468l;

    /* JADX INFO: renamed from: m */
    public float f43469m;

    /* JADX INFO: renamed from: n */
    public float f43470n;

    /* JADX INFO: renamed from: o */
    public float f43471o;

    /* JADX INFO: renamed from: p */
    public float f43472p;

    /* JADX INFO: renamed from: q */
    public float f43473q;

    /* JADX INFO: renamed from: r */
    public float f43474r;

    /* JADX INFO: renamed from: s */
    public float f43475s;

    /* JADX INFO: renamed from: t */
    public float f43476t;

    /* JADX INFO: renamed from: u */
    public float f43477u;

    /* JADX INFO: renamed from: v */
    public float f43478v;

    /* JADX INFO: renamed from: w */
    public float f43479w;

    /* JADX INFO: renamed from: x */
    public float f43480x;

    /* JADX INFO: renamed from: y */
    public float f43481y;

    /* JADX INFO: renamed from: z */
    public float f43482z;

    static {
        nld nldVar = new nld();
        f43455A = nldVar;
        nxq.m18130aa(nld.class, nldVar);
    }

    private nld() {
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
                return m18129X(f43455A, "\u0001\u0019\u0000\u0001\u0001 \u0019\u0000\u0000\u0000\u0001ဉ\u0000\bခ\u0001\tခ\u0002\nခ\u0003\u000bခ\u0004\fခ\u0005\rခ\u0006\u000eခ\u0007\u000fခ\b\u0010ခ\t\u0011ခ\n\u0012ခ\u000b\u0013ခ\f\u0014ခ\r\u0015ခ\u000e\u0017ခ\u0010\u0018ခ\u0011\u0019ခ\u0012\u001aခ\u0013\u001bခ\u0014\u001cခ\u0015\u001dခ\u0016\u001eခ\u0018\u001fခ\u000f ခ\u0017", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", HEePJw.JJVBdTZ, "w", "x", "z", "q", "y"});
            case 3:
                return new nld();
            case 4:
                return new nxl(f43455A);
            case 5:
                return f43455A;
            case 6:
                nzd nxmVar = f43456B;
                if (nxmVar == null) {
                    synchronized (nld.class) {
                        nxmVar = f43456B;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43455A);
                            f43456B = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
