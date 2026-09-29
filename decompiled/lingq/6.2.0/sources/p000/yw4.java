package p000;

import androidx.compose.foundation.text.HandleState;
import androidx.compose.runtime.AbstractC0278f;

/* JADX INFO: loaded from: classes.dex */
public final class yw4 {

    /* JADX INFO: renamed from: A */
    public final t66 f70567A;

    /* JADX INFO: renamed from: B */
    public final t66 f70568B;

    /* JADX INFO: renamed from: a */
    public ut9 f70569a;

    /* JADX INFO: renamed from: b */
    public final x18 f70570b;

    /* JADX INFO: renamed from: c */
    public final ld9 f70571c;

    /* JADX INFO: renamed from: d */
    public final bl2 f70572d;

    /* JADX INFO: renamed from: e */
    public hw9 f70573e;

    /* JADX INFO: renamed from: f */
    public final t66 f70574f;

    /* JADX INFO: renamed from: g */
    public final t66 f70575g;

    /* JADX INFO: renamed from: h */
    public aq4 f70576h;

    /* JADX INFO: renamed from: i */
    public final t66 f70577i;

    /* JADX INFO: renamed from: j */
    public C3419on f70578j;

    /* JADX INFO: renamed from: k */
    public final t66 f70579k;

    /* JADX INFO: renamed from: l */
    public final t66 f70580l;

    /* JADX INFO: renamed from: m */
    public final t66 f70581m;

    /* JADX INFO: renamed from: n */
    public final t66 f70582n;

    /* JADX INFO: renamed from: o */
    public final t66 f70583o;

    /* JADX INFO: renamed from: p */
    public boolean f70584p;

    /* JADX INFO: renamed from: q */
    public final t66 f70585q;

    /* JADX INFO: renamed from: r */
    public final fj4 f70586r;

    /* JADX INFO: renamed from: s */
    public final t66 f70587s;

    /* JADX INFO: renamed from: t */
    public final t66 f70588t;

    /* JADX INFO: renamed from: u */
    public vi3 f70589u;

    /* JADX INFO: renamed from: v */
    public final sm1 f70590v;

    /* JADX INFO: renamed from: w */
    public final sm1 f70591w;

    /* JADX INFO: renamed from: x */
    public final sm1 f70592x;

    /* JADX INFO: renamed from: y */
    public final u8a f70593y;

    /* JADX INFO: renamed from: z */
    public long f70594z;

    public yw4(ut9 ut9Var, x18 x18Var, ld9 ld9Var) {
        this.f70569a = ut9Var;
        this.f70570b = x18Var;
        this.f70571c = ld9Var;
        bl2 bl2Var = new bl2();
        C3419on c3419on = AbstractC3466pn.f56487a;
        long j = cx9.f34692b;
        vv9 vv9Var = new vv9(c3419on, j, (cx9) null);
        bl2Var.f8655a = vv9Var;
        bl2Var.f8656b = new vo2(c3419on, vv9Var.f65991b);
        this.f70572d = bl2Var;
        Boolean bool = Boolean.FALSE;
        this.f70574f = AbstractC0278f.m1260j(bool);
        this.f70575g = AbstractC0278f.m1260j(new xj2(0.0f));
        this.f70577i = AbstractC0278f.m1260j(null);
        this.f70579k = AbstractC0278f.m1260j(HandleState.None);
        this.f70580l = AbstractC0278f.m1260j(bool);
        this.f70581m = AbstractC0278f.m1260j(bool);
        this.f70582n = AbstractC0278f.m1260j(bool);
        this.f70583o = AbstractC0278f.m1260j(bool);
        this.f70584p = true;
        this.f70585q = AbstractC0278f.m1260j(Boolean.TRUE);
        this.f70586r = new fj4(ld9Var);
        this.f70587s = AbstractC0278f.m1260j(bool);
        this.f70588t = AbstractC0278f.m1260j(bool);
        this.f70589u = new tf4(9);
        this.f70590v = new sm1(this, 1);
        this.f70591w = new sm1(this, 2);
        this.f70592x = new sm1(this, 3);
        this.f70593y = eh0.m11125e();
        this.f70594z = aa1.f412k;
        this.f70567A = AbstractC0278f.m1260j(new cx9(j));
        this.f70568B = AbstractC0278f.m1260j(new cx9(j));
    }

    /* JADX INFO: renamed from: a */
    public final HandleState m25360a() {
        return (HandleState) ((xc9) this.f70579k).getValue();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m25361b() {
        return ((Boolean) ((xc9) this.f70574f).getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public final aq4 m25362c() {
        aq4 aq4Var = this.f70576h;
        if (aq4Var == null || !aq4Var.mo1691n()) {
            return null;
        }
        return aq4Var;
    }

    /* JADX INFO: renamed from: d */
    public final sw9 m25363d() {
        return (sw9) ((xc9) this.f70577i).getValue();
    }

    /* JADX INFO: renamed from: e */
    public final void m25364e(long j) {
        ((xc9) this.f70568B).setValue(new cx9(j));
    }

    /* JADX INFO: renamed from: f */
    public final void m25365f(long j) {
        ((xc9) this.f70567A).setValue(new cx9(j));
    }
}
