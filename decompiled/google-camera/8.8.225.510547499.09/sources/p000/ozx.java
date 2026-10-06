package p000;

import androidx.wear.widget.iZcI.hiCTUJiAxf;
import com.google.android.libraries.vision.opengl.MUg.WIxTIdUIdfb;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ozx extends nxq implements nyx {

    /* JADX INFO: renamed from: w */
    public static final ozx f47098w;

    /* JADX INFO: renamed from: x */
    private static volatile nzd f47099x;

    /* JADX INFO: renamed from: a */
    public int f47100a;

    /* JADX INFO: renamed from: b */
    public long f47101b;

    /* JADX INFO: renamed from: c */
    public long f47102c;

    /* JADX INFO: renamed from: d */
    public long f47103d;

    /* JADX INFO: renamed from: e */
    public long f47104e;

    /* JADX INFO: renamed from: f */
    public long f47105f;

    /* JADX INFO: renamed from: g */
    public long f47106g;

    /* JADX INFO: renamed from: h */
    public long f47107h;

    /* JADX INFO: renamed from: i */
    public long f47108i;

    /* JADX INFO: renamed from: j */
    public long f47109j;

    /* JADX INFO: renamed from: k */
    public long f47110k;

    /* JADX INFO: renamed from: l */
    public long f47111l;

    /* JADX INFO: renamed from: m */
    public long f47112m;

    /* JADX INFO: renamed from: n */
    public long f47113n;

    /* JADX INFO: renamed from: o */
    public long f47114o;

    /* JADX INFO: renamed from: p */
    public long f47115p;

    /* JADX INFO: renamed from: q */
    public boolean f47116q;

    /* JADX INFO: renamed from: r */
    public int f47117r;

    /* JADX INFO: renamed from: s */
    public boolean f47118s;

    /* JADX INFO: renamed from: t */
    public ozv f47119t;

    /* JADX INFO: renamed from: u */
    public ozv f47120u;

    /* JADX INFO: renamed from: v */
    public nyr f47121v = nyr.f45033a;

    static {
        ozx ozxVar = new ozx();
        f47098w = ozxVar;
        nxq.m18130aa(ozx.class, ozxVar);
    }

    private ozx() {
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
                return m18129X(f47098w, "\u0001\u0015\u0000\u0001\u0001\u0019\u0015\u0001\u0000\u0000\u0001ဂ\u0000\u0003ဂ\u0004\u0004ဂ\u0007\u0005ဂ\t\tဂ\n\nဂ\u000f\u000bဇ\u0010\fဉ\u0013\rဉ\u0014\u000eဂ\u0001\u000fဂ\u0002\u00102\u0011ဂ\u0005\u0012ဂ\b\u0013ဂ\u0006\u0014ဂ\u000b\u0015ဂ\f\u0016ဌ\u0011\u0017ဂ\r\u0018ဂ\u000e\u0019ဇ\u0012", new Object[]{"a", hiCTUJiAxf.sdBYpqSvLMsONI, "e", "h", "j", "k", "p", "q", "t", "u", "c", "d", WIxTIdUIdfb.xjEXqcqBc, ozw.f47097a, "f", "i", "g", "l", "m", "r", pab.f47149b, "n", "o", "s"});
            case 3:
                return new ozx();
            case 4:
                return new nxl(f47098w);
            case 5:
                return f47098w;
            case 6:
                nzd nxmVar = f47099x;
                if (nxmVar == null) {
                    synchronized (ozx.class) {
                        nxmVar = f47099x;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47098w);
                            f47099x = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
