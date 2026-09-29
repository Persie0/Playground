package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.C0059a;
import androidx.compose.p002ui.graphics.layer.C0312a;
import androidx.compose.runtime.AbstractC0278f;
import p000.C3757xf;
import p000.f84;
import p000.l43;
import p000.pk9;
import p000.qp3;
import p000.t66;
import p000.un1;
import p000.wfb;
import p000.xc9;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0134c {

    /* JADX INFO: renamed from: a */
    public final un1 f2536a;

    /* JADX INFO: renamed from: b */
    public final qp3 f2537b;

    /* JADX INFO: renamed from: c */
    public final C3757xf f2538c;

    /* JADX INFO: renamed from: d */
    public l43 f2539d;

    /* JADX INFO: renamed from: e */
    public l43 f2540e;

    /* JADX INFO: renamed from: f */
    public l43 f2541f;

    /* JADX INFO: renamed from: g */
    public boolean f2542g;

    /* JADX INFO: renamed from: h */
    public final t66 f2543h;

    /* JADX INFO: renamed from: i */
    public final t66 f2544i;

    /* JADX INFO: renamed from: j */
    public final t66 f2545j;

    /* JADX INFO: renamed from: k */
    public final t66 f2546k;

    /* JADX INFO: renamed from: l */
    public long f2547l;

    /* JADX INFO: renamed from: m */
    public long f2548m;

    /* JADX INFO: renamed from: n */
    public long f2549n;

    /* JADX INFO: renamed from: o */
    public C0312a f2550o;

    /* JADX INFO: renamed from: p */
    public final C0059a f2551p;

    /* JADX INFO: renamed from: q */
    public final C0059a f2552q;

    /* JADX INFO: renamed from: r */
    public final t66 f2553r;

    public C0134c(un1 un1Var, qp3 qp3Var, C3757xf c3757xf) {
        this.f2536a = un1Var;
        this.f2537b = qp3Var;
        this.f2538c = c3757xf;
        Boolean bool = Boolean.FALSE;
        this.f2543h = AbstractC0278f.m1260j(bool);
        this.f2544i = AbstractC0278f.m1260j(bool);
        this.f2545j = AbstractC0278f.m1260j(bool);
        this.f2546k = AbstractC0278f.m1260j(bool);
        this.f2547l = 9223372034707292159L;
        long j = 0;
        this.f2548m = 0L;
        this.f2549n = 9223372034707292159L;
        Object obj = null;
        this.f2550o = qp3Var != null ? qp3Var.mo14487c() : null;
        int i = 12;
        this.f2551p = new C0059a(new f84(j), pk9.f56369n, obj, i);
        this.f2552q = new C0059a(Float.valueOf(1.0f), pk9.f56363h, obj, i);
        this.f2553r = AbstractC0278f.m1260j(new f84(j));
    }

    /* JADX INFO: renamed from: a */
    public final void m999a() {
        C0312a c0312a = this.f2550o;
        l43 l43Var = this.f2539d;
        boolean zBooleanValue = ((Boolean) ((xc9) this.f2544i).getValue()).booleanValue();
        un1 un1Var = this.f2536a;
        if (zBooleanValue || l43Var == null || c0312a == null) {
            if (m1001c()) {
                if (c0312a != null) {
                    c0312a.m1430g(1.0f);
                }
                wfb.m23926u(un1Var, null, null, new LazyLayoutItemAnimation$animateAppearance$1(this, null), 3);
                return;
            }
            return;
        }
        m1003e(true);
        boolean zM1001c = m1001c();
        boolean z = !zM1001c;
        if (!zM1001c) {
            c0312a.m1430g(0.0f);
        }
        wfb.m23926u(un1Var, null, null, new LazyLayoutItemAnimation$animateAppearance$2(z, this, l43Var, c0312a, null), 3);
    }

    /* JADX INFO: renamed from: b */
    public final void m1000b() {
        if (((Boolean) ((xc9) this.f2543h).getValue()).booleanValue()) {
            wfb.m23926u(this.f2536a, null, null, new LazyLayoutItemAnimation$cancelPlacementAnimation$1(this, null), 3);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1001c() {
        return ((Boolean) ((xc9) this.f2545j).getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public final void m1002d() {
        qp3 qp3Var;
        boolean zBooleanValue = ((Boolean) ((xc9) this.f2543h).getValue()).booleanValue();
        un1 un1Var = this.f2536a;
        if (zBooleanValue) {
            m1005g(false);
            wfb.m23926u(un1Var, null, null, new LazyLayoutItemAnimation$release$1(this, null), 3);
        }
        if (((Boolean) ((xc9) this.f2544i).getValue()).booleanValue()) {
            m1003e(false);
            wfb.m23926u(un1Var, null, null, new LazyLayoutItemAnimation$release$2(this, null), 3);
        }
        if (m1001c()) {
            m1004f(false);
            wfb.m23926u(un1Var, null, null, new LazyLayoutItemAnimation$release$3(this, null), 3);
        }
        this.f2542g = false;
        m1006h(0L);
        this.f2547l = 9223372034707292159L;
        C0312a c0312a = this.f2550o;
        if (c0312a != null && (qp3Var = this.f2537b) != null) {
            qp3Var.mo14485a(c0312a);
        }
        this.f2550o = null;
        this.f2539d = null;
        this.f2541f = null;
        this.f2540e = null;
    }

    /* JADX INFO: renamed from: e */
    public final void m1003e(boolean z) {
        ((xc9) this.f2544i).setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: f */
    public final void m1004f(boolean z) {
        ((xc9) this.f2545j).setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: g */
    public final void m1005g(boolean z) {
        ((xc9) this.f2543h).setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: h */
    public final void m1006h(long j) {
        ((xc9) this.f2553r).setValue(new f84(j));
    }
}
