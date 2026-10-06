package p000;

import com.google.android.apps.camera.brella.mediastore.p007hP.wUzNh;
import com.google.android.libraries.vision.opengl.MUg.WIxTIdUIdfb;
import com.google.android.play.core.common.wMe.NptsKnlVczSZ;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nmb extends nxq implements nyx {

    /* JADX INFO: renamed from: x */
    public static final nmb f43725x;

    /* JADX INFO: renamed from: y */
    private static volatile nzd f43726y;

    /* JADX INFO: renamed from: a */
    public int f43727a;

    /* JADX INFO: renamed from: b */
    public long f43728b;

    /* JADX INFO: renamed from: c */
    public long f43729c;

    /* JADX INFO: renamed from: d */
    public int f43730d;

    /* JADX INFO: renamed from: e */
    public int f43731e;

    /* JADX INFO: renamed from: f */
    public int f43732f;

    /* JADX INFO: renamed from: g */
    public int f43733g;

    /* JADX INFO: renamed from: h */
    public int f43734h;

    /* JADX INFO: renamed from: i */
    public int f43735i;

    /* JADX INFO: renamed from: j */
    public int f43736j;

    /* JADX INFO: renamed from: k */
    public long f43737k;

    /* JADX INFO: renamed from: l */
    public long f43738l;

    /* JADX INFO: renamed from: m */
    public long f43739m;

    /* JADX INFO: renamed from: n */
    public long f43740n;

    /* JADX INFO: renamed from: o */
    public long f43741o;

    /* JADX INFO: renamed from: p */
    public long f43742p;

    /* JADX INFO: renamed from: q */
    public long f43743q;

    /* JADX INFO: renamed from: r */
    public long f43744r;

    /* JADX INFO: renamed from: s */
    public long f43745s;

    /* JADX INFO: renamed from: t */
    public long f43746t;

    /* JADX INFO: renamed from: u */
    public long f43747u;

    /* JADX INFO: renamed from: v */
    public long f43748v;

    /* JADX INFO: renamed from: w */
    public boolean f43749w;

    static {
        nmb nmbVar = new nmb();
        f43725x = nmbVar;
        nxq.m18130aa(nmb.class, nmbVar);
    }

    private nmb() {
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
                return m18129X(f43725x, "\u0001\u0016\u0000\u0001\u0001\u0016\u0016\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဌ\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tဂ\t\nဂ\n\u000bဂ\u000b\fဂ\f\rဂ\r\u000eဂ\u000f\u000fဂ\u0010\u0010ဂ\u0011\u0011ဂ\u0012\u0012ဂ\u0013\u0013ဇ\u0015\u0014င\b\u0015ဂ\u000e\u0016ဂ\u0014", new Object[]{"a", "b", "c", "d", nlu.f43672i, "e", "f", "g", "h", "i", "k", "l", wUzNh.KGlKFduidDzVxh, "n", NptsKnlVczSZ.PAaqnvicLbe, WIxTIdUIdfb.zNSbOPLHcu, "r", "s", "t", "u", "w", "j", WIxTIdUIdfb.DGaTZowFVPzk, "v"});
            case 3:
                return new nmb();
            case 4:
                return new nxl(f43725x);
            case 5:
                return f43725x;
            case 6:
                nzd nxmVar = f43726y;
                if (nxmVar == null) {
                    synchronized (nmb.class) {
                        nxmVar = f43726y;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43725x);
                            f43726y = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
