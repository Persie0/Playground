package p000;

import com.google.android.material.behavior.iWN.zuAgeeF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class igm {

    /* JADX INFO: renamed from: A */
    private int f30790A;

    /* JADX INFO: renamed from: a */
    public int f30791a;

    /* JADX INFO: renamed from: b */
    public gzp f30792b;

    /* JADX INFO: renamed from: c */
    public int f30793c;

    /* JADX INFO: renamed from: d */
    private int f30794d;

    /* JADX INFO: renamed from: e */
    private int f30795e;

    /* JADX INFO: renamed from: f */
    private int f30796f;

    /* JADX INFO: renamed from: g */
    private int f30797g;

    /* JADX INFO: renamed from: h */
    private int f30798h;

    /* JADX INFO: renamed from: i */
    private int f30799i;

    /* JADX INFO: renamed from: j */
    private int f30800j;

    /* JADX INFO: renamed from: k */
    private int f30801k;

    /* JADX INFO: renamed from: l */
    private mrm f30802l;

    /* JADX INFO: renamed from: m */
    private String f30803m;

    /* JADX INFO: renamed from: n */
    private int f30804n;

    /* JADX INFO: renamed from: o */
    private boolean f30805o;

    /* JADX INFO: renamed from: p */
    private int f30806p;

    /* JADX INFO: renamed from: q */
    private int f30807q;

    /* JADX INFO: renamed from: r */
    private int f30808r;

    /* JADX INFO: renamed from: s */
    private int f30809s;

    /* JADX INFO: renamed from: t */
    private int f30810t;

    /* JADX INFO: renamed from: u */
    private ifi f30811u;

    /* JADX INFO: renamed from: v */
    private int f30812v;

    /* JADX INFO: renamed from: w */
    private int f30813w;

    /* JADX INFO: renamed from: x */
    private int f30814x;

    /* JADX INFO: renamed from: y */
    private int f30815y;

    /* JADX INFO: renamed from: z */
    private int f30816z;

    public igm() {
    }

    public igm(ign ignVar) {
        this.f30802l = mqu.f41450a;
        this.f30794d = ignVar.f30826d;
        this.f30795e = ignVar.f30827e;
        this.f30796f = ignVar.f30828f;
        this.f30797g = ignVar.f30829g;
        this.f30798h = ignVar.f30830h;
        this.f30799i = ignVar.f30831i;
        this.f30800j = ignVar.f30832j;
        this.f30801k = ignVar.f30833k;
        this.f30802l = ignVar.f30834l;
        this.f30791a = ignVar.f30835m;
        this.f30803m = ignVar.f30836n;
        this.f30804n = ignVar.f30837o;
        this.f30805o = ignVar.f30838p;
        this.f30806p = ignVar.f30839q;
        this.f30807q = ignVar.f30840r;
        this.f30808r = ignVar.f30841s;
        this.f30809s = ignVar.f30842t;
        this.f30810t = ignVar.f30843u;
        this.f30811u = ignVar.f30844v;
        this.f30792b = ignVar.f30845w;
        this.f30812v = ignVar.f30846x;
        this.f30813w = ignVar.f30847y;
        this.f30814x = ignVar.f30848z;
        this.f30815y = ignVar.f30823A;
        this.f30816z = ignVar.f30824B;
        this.f30790A = ignVar.f30825C;
        this.f30793c = 8388607;
    }

    public igm(byte[] bArr) {
        this.f30802l = mqu.f41450a;
    }

    /* JADX INFO: renamed from: A */
    public final void m11263A(int i) {
        this.f30797g = i;
        this.f30793c |= 8;
    }

    /* JADX INFO: renamed from: a */
    public final ign m11264a() {
        if (this.f30793c == 8388607 && this.f30803m != null && this.f30811u != null && this.f30792b != null) {
            return new ign(this.f30794d, this.f30795e, this.f30796f, this.f30797g, this.f30798h, this.f30799i, this.f30800j, this.f30801k, this.f30802l, this.f30791a, this.f30803m, this.f30804n, this.f30805o, this.f30806p, this.f30807q, this.f30808r, this.f30809s, this.f30810t, this.f30811u, this.f30792b, this.f30812v, this.f30813w, this.f30814x, this.f30815y, this.f30816z, this.f30790A);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f30793c & 1) == 0) {
            sb.append(" photoCircleRadius");
        }
        if ((this.f30793c & 2) == 0) {
            sb.append(" photoCircleAlpha");
        }
        if ((this.f30793c & 4) == 0) {
            sb.append(" photoCircleColor");
        }
        if ((this.f30793c & 8) == 0) {
            sb.append(" videoDotRadius");
        }
        if ((this.f30793c & 16) == 0) {
            sb.append(zuAgeeF.QEDVBwKicnLuuxQ);
        }
        if ((this.f30793c & 32) == 0) {
            sb.append(" stopSquareHalfSize");
        }
        if ((this.f30793c & 64) == 0) {
            sb.append(" portraitInnerCircleRadius");
        }
        if ((this.f30793c & 128) == 0) {
            sb.append(" portraitOuterCircleRadius");
        }
        if ((this.f30793c & 256) == 0) {
            sb.append(" buttonImageResourceId");
        }
        if (this.f30803m == null) {
            sb.append(" buttonImageResourceEntryName");
        }
        if ((this.f30793c & 512) == 0) {
            sb.append(" buttonImageRectHalfSize");
        }
        if ((this.f30793c & 1024) == 0) {
            sb.append(" animateRippleEffect");
        }
        if ((this.f30793c & 2048) == 0) {
            sb.append(" ripplePaintAlpha");
        }
        if ((this.f30793c & 4096) == 0) {
            sb.append(" rippleRadius");
        }
        if ((this.f30793c & 8192) == 0) {
            sb.append(" mainButtonColor");
        }
        if ((this.f30793c & 16384) == 0) {
            sb.append(" roundButtonRadius");
        }
        if ((this.f30793c & 32768) == 0) {
            sb.append(" outerButtonRadius");
        }
        if (this.f30811u == null) {
            sb.append(" mode");
        }
        if (this.f30792b == null) {
            sb.append(" timerOption");
        }
        if ((this.f30793c & 65536) == 0) {
            sb.append(" tickMarkLength");
        }
        if ((this.f30793c & 131072) == 0) {
            sb.append(" tickMarkPaddingToCircleEdge");
        }
        if ((this.f30793c & 262144) == 0) {
            sb.append(" tickMarkRectRoundRadius");
        }
        if ((this.f30793c & 524288) == 0) {
            sb.append(" tickMarkAlpha");
        }
        if ((this.f30793c & 1048576) == 0) {
            sb.append(" mainOuterButtonAlpha");
        }
        if ((this.f30793c & 2097152) == 0) {
            sb.append(" innerDotCenterOffset");
        }
        if ((this.f30793c & 4194304) == 0) {
            sb.append(" innerDotColor");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    public final void m11265b(boolean z) {
        this.f30805o = z;
        this.f30793c |= 1024;
    }

    /* JADX INFO: renamed from: c */
    public final void m11266c(String str) {
        if (str == null) {
            throw new NullPointerException("Null buttonImageResourceEntryName");
        }
        this.f30803m = str;
    }

    /* JADX INFO: renamed from: d */
    public final void m11267d(int i) {
        this.f30791a = i;
        this.f30793c |= 256;
    }

    /* JADX INFO: renamed from: e */
    public final void m11268e() {
        this.f30793c |= 2097152;
    }

    /* JADX INFO: renamed from: f */
    public final void m11269f(int i) {
        this.f30790A = i;
        this.f30793c |= 4194304;
    }

    /* JADX INFO: renamed from: g */
    public final void m11270g(int i) {
        this.f30816z = i;
        this.f30793c |= 1048576;
    }

    /* JADX INFO: renamed from: h */
    public final void m11271h(mrm mrmVar) {
        if (mrmVar == null) {
            throw new NullPointerException("Null buttonImage");
        }
        this.f30802l = mrmVar;
    }

    /* JADX INFO: renamed from: i */
    public final void m11272i(int i) {
        this.f30804n = i;
        this.f30793c |= 512;
    }

    /* JADX INFO: renamed from: j */
    public final void m11273j(int i) {
        this.f30808r = i;
        this.f30793c |= 8192;
    }

    /* JADX INFO: renamed from: k */
    public final void m11274k(ifi ifiVar) {
        if (ifiVar == null) {
            throw new NullPointerException("Null mode");
        }
        this.f30811u = ifiVar;
    }

    /* JADX INFO: renamed from: l */
    public final void m11275l(int i) {
        this.f30810t = i;
        this.f30793c |= 32768;
    }

    /* JADX INFO: renamed from: m */
    public final void m11276m(int i) {
        this.f30795e = i;
        this.f30793c |= 2;
    }

    /* JADX INFO: renamed from: n */
    public final void m11277n(int i) {
        this.f30796f = i;
        this.f30793c |= 4;
    }

    /* JADX INFO: renamed from: o */
    public final void m11278o(int i) {
        this.f30794d = i;
        this.f30793c |= 1;
    }

    /* JADX INFO: renamed from: p */
    public final void m11279p(int i) {
        this.f30800j = i;
        this.f30793c |= 64;
    }

    /* JADX INFO: renamed from: q */
    public final void m11280q(int i) {
        this.f30801k = i;
        this.f30793c |= 128;
    }

    /* JADX INFO: renamed from: r */
    public final void m11281r(int i) {
        this.f30806p = i;
        this.f30793c |= 2048;
    }

    /* JADX INFO: renamed from: s */
    public final void m11282s(int i) {
        this.f30807q = i;
        this.f30793c |= 4096;
    }

    /* JADX INFO: renamed from: t */
    public final void m11283t(int i) {
        this.f30809s = i;
        this.f30793c |= 16384;
    }

    /* JADX INFO: renamed from: u */
    public final void m11284u(int i) {
        this.f30799i = i;
        this.f30793c |= 32;
    }

    /* JADX INFO: renamed from: v */
    public final void m11285v(int i) {
        this.f30815y = i;
        this.f30793c |= 524288;
    }

    /* JADX INFO: renamed from: w */
    public final void m11286w(int i) {
        this.f30812v = i;
        this.f30793c |= 65536;
    }

    /* JADX INFO: renamed from: x */
    public final void m11287x(int i) {
        this.f30813w = i;
        this.f30793c |= 131072;
    }

    /* JADX INFO: renamed from: y */
    public final void m11288y(int i) {
        this.f30814x = i;
        this.f30793c |= 262144;
    }

    /* JADX INFO: renamed from: z */
    public final void m11289z(int i) {
        this.f30798h = i;
        this.f30793c |= 16;
    }
}
