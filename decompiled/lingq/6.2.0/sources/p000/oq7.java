package p000;

import androidx.compose.material3.AbstractC0226d0;
import androidx.compose.runtime.AbstractC0278f;

/* JADX INFO: loaded from: classes2.dex */
public final class oq7 {

    /* JADX INFO: renamed from: a */
    public final int f54735a;

    /* JADX INFO: renamed from: b */
    public final ui3 f54736b;

    /* JADX INFO: renamed from: c */
    public final h41 f54737c;

    /* JADX INFO: renamed from: d */
    public final qc9 f54738d;

    /* JADX INFO: renamed from: e */
    public final qc9 f54739e;

    /* JADX INFO: renamed from: f */
    public final float[] f54740f;

    /* JADX INFO: renamed from: g */
    public final qc9 f54741g;

    /* JADX INFO: renamed from: h */
    public final qc9 f54742h;

    /* JADX INFO: renamed from: i */
    public final qc9 f54743i;

    /* JADX INFO: renamed from: j */
    public final qc9 f54744j;

    /* JADX INFO: renamed from: k */
    public final sc9 f54745k;

    /* JADX INFO: renamed from: l */
    public final qc9 f54746l;

    /* JADX INFO: renamed from: m */
    public final qc9 f54747m;

    /* JADX INFO: renamed from: n */
    public final t66 f54748n;

    /* JADX INFO: renamed from: o */
    public final t66 f54749o;

    /* JADX INFO: renamed from: p */
    public final nq7 f54750p;

    /* JADX INFO: renamed from: q */
    public final qc9 f54751q;

    /* JADX INFO: renamed from: r */
    public final qc9 f54752r;

    public oq7(float f, float f2, int i, ui3 ui3Var, h41 h41Var) {
        float[] fArr;
        this.f54735a = i;
        this.f54736b = ui3Var;
        this.f54737c = h41Var;
        float fFloatValue = ((Number) l70.m15948k(Float.valueOf(f), h41Var)).floatValue();
        float fFloatValue2 = ((Number) l70.m15948k(Float.valueOf(f2), h41Var)).floatValue();
        this.f54738d = AbstractC0278f.m1256f(Math.min(fFloatValue, fFloatValue2));
        this.f54739e = AbstractC0278f.m1256f(Math.max(fFloatValue, fFloatValue2));
        float f3 = AbstractC0226d0.f3389a;
        if (i == 0) {
            fArr = new float[0];
        } else {
            int i2 = i + 2;
            float[] fArr2 = new float[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                fArr2[i3] = i3 / (i + 1);
            }
            fArr = fArr2;
        }
        this.f54740f = fArr;
        this.f54741g = AbstractC0278f.m1256f(0.0f);
        this.f54742h = AbstractC0278f.m1256f(0.0f);
        this.f54743i = AbstractC0278f.m1256f(0.0f);
        this.f54744j = AbstractC0278f.m1256f(0.0f);
        this.f54745k = AbstractC0278f.m1257g(0);
        this.f54746l = AbstractC0278f.m1256f(0.0f);
        this.f54747m = AbstractC0278f.m1256f(0.0f);
        Boolean bool = Boolean.FALSE;
        this.f54748n = AbstractC0278f.m1260j(bool);
        this.f54749o = AbstractC0278f.m1260j(bool);
        this.f54750p = new nq7(this, 0);
        this.f54751q = AbstractC0278f.m1256f(0.0f);
        this.f54752r = AbstractC0278f.m1256f(0.0f);
    }

    /* JADX INFO: renamed from: a */
    public final float m18207a() {
        h41 h41Var = this.f54737c;
        return AbstractC0226d0.m1139j(h41Var.f41765a, h41Var.f41766b, this.f54739e.m19861h());
    }

    /* JADX INFO: renamed from: b */
    public final float m18208b() {
        h41 h41Var = this.f54737c;
        return AbstractC0226d0.m1139j(h41Var.f41765a, h41Var.f41766b, this.f54738d.m19861h());
    }

    /* JADX INFO: renamed from: c */
    public final int m18209c() {
        return (int) Math.floor((1.0f - m18208b()) * this.f54735a);
    }

    /* JADX INFO: renamed from: d */
    public final int m18210d() {
        return (int) Math.floor(m18207a() * this.f54735a);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m18211e() {
        return ((Boolean) ((xc9) this.f54749o).getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: f */
    public final void m18212f(float f, boolean z) {
        long jM1136g;
        long jM1136g2;
        qc9 qc9Var = this.f54738d;
        float[] fArr = this.f54740f;
        qc9 qc9Var2 = this.f54739e;
        qc9 qc9Var3 = this.f54747m;
        qc9 qc9Var4 = this.f54746l;
        qc9 qc9Var5 = this.f54751q;
        qc9 qc9Var6 = this.f54752r;
        if (z) {
            qc9Var4.m19862i(qc9Var4.m19861h() + f);
            qc9Var3.m19862i(m18213g(qc9Var6.m19861h(), qc9Var5.m19861h(), qc9Var2.m19861h()));
            float fM19861h = qc9Var3.m19861h();
            float fM1138i = AbstractC0226d0.m1138i(l70.m15944g(qc9Var4.m19861h(), qc9Var6.m19861h(), fM19861h), fArr, qc9Var6.m19861h(), qc9Var5.m19861h());
            if (fM1138i > fM19861h) {
                fM1138i = fM19861h;
            }
            jM1136g = AbstractC0226d0.m1136g(fM1138i, fM19861h);
        } else {
            qc9Var3.m19862i(qc9Var3.m19861h() + f);
            qc9Var4.m19862i(m18213g(qc9Var6.m19861h(), qc9Var5.m19861h(), qc9Var.m19861h()));
            float fM19861h2 = qc9Var4.m19861h();
            float fM1138i2 = AbstractC0226d0.m1138i(l70.m15944g(qc9Var3.m19861h(), fM19861h2, qc9Var5.m19861h()), fArr, qc9Var6.m19861h(), qc9Var5.m19861h());
            if (fM1138i2 < fM19861h2) {
                fM1138i2 = fM19861h2;
            }
            jM1136g = AbstractC0226d0.m1136g(fM19861h2, fM1138i2);
        }
        float fM19861h3 = qc9Var6.m19861h();
        float fM19861h4 = qc9Var5.m19861h();
        h41 h41Var = this.f54737c;
        float f2 = h41Var.f41765a;
        float f3 = h41Var.f41766b;
        float fM1140k = AbstractC0226d0.m1140k(fM19861h3, fM19861h4, wa9.m23825b(jM1136g), f2, f3);
        float fM1140k2 = AbstractC0226d0.m1140k(fM19861h3, fM19861h4, wa9.m23824a(jM1136g), f2, f3);
        if (z) {
            if (fM1140k > fM1140k2) {
                fM1140k = fM1140k2;
            }
            jM1136g2 = AbstractC0226d0.m1136g(fM1140k, fM1140k2);
        } else {
            if (fM1140k2 < fM1140k) {
                fM1140k2 = fM1140k;
            }
            jM1136g2 = AbstractC0226d0.m1136g(fM1140k, fM1140k2);
        }
        if (jM1136g2 == AbstractC0226d0.m1136g(qc9Var.m19861h(), qc9Var2.m19861h())) {
            return;
        }
        m18215i(wa9.m23825b(jM1136g2));
        m18214h(wa9.m23824a(jM1136g2));
    }

    /* JADX INFO: renamed from: g */
    public final float m18213g(float f, float f2, float f3) {
        h41 h41Var = this.f54737c;
        return AbstractC0226d0.m1140k(h41Var.f41765a, h41Var.f41766b, f3, f, f2);
    }

    /* JADX INFO: renamed from: h */
    public final void m18214h(float f) {
        float fM19861h = this.f54738d.m19861h();
        h41 h41Var = this.f54737c;
        float f2 = h41Var.f41766b;
        this.f54739e.m19862i(AbstractC0226d0.m1138i(l70.m15944g(f, fM19861h, f2), this.f54740f, h41Var.f41765a, f2));
    }

    /* JADX INFO: renamed from: i */
    public final void m18215i(float f) {
        h41 h41Var = this.f54737c;
        float f2 = h41Var.f41765a;
        this.f54738d.m19862i(AbstractC0226d0.m1138i(l70.m15944g(f, f2, this.f54739e.m19861h()), this.f54740f, f2, h41Var.f41766b));
    }
}
