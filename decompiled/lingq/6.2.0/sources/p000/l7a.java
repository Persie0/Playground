package p000;

import androidx.compose.runtime.AbstractC0278f;

/* JADX INFO: loaded from: classes2.dex */
public final class l7a {

    /* JADX INFO: renamed from: e */
    public static final fs6 f49255e = d32.m10027Y(new cx7(15), new ow8(14));

    /* JADX INFO: renamed from: a */
    public float f49256a;

    /* JADX INFO: renamed from: b */
    public final qc9 f49257b;

    /* JADX INFO: renamed from: c */
    public ui3 f49258c = new e5a(2);

    /* JADX INFO: renamed from: d */
    public final qc9 f49259d;

    public l7a(float f, float f2, float f3) {
        this.f49256a = f;
        this.f49257b = AbstractC0278f.m1256f(f3);
        this.f49259d = AbstractC0278f.m1256f(f2);
    }

    /* JADX INFO: renamed from: a */
    public final float m15978a() {
        if (this.f49256a == 0.0f) {
            return 0.0f;
        }
        return this.f49259d.m19861h() / this.f49256a;
    }

    /* JADX INFO: renamed from: b */
    public final float m15979b() {
        return this.f49259d.m19861h();
    }

    /* JADX INFO: renamed from: c */
    public final float m15980c() {
        return this.f49256a;
    }

    /* JADX INFO: renamed from: d */
    public final float m15981d() {
        boolean zBooleanValue = ((Boolean) this.f49258c.mo0a()).booleanValue();
        qc9 qc9Var = this.f49257b;
        if (!zBooleanValue && qc9Var.m19861h() == 0.0f) {
            return 1.0f;
        }
        float f = this.f49256a;
        if (f == 0.0f) {
            return 0.0f;
        }
        return 1.0f - (l70.m15944g(Math.abs(qc9Var.m19861h()) + f, this.f49256a, 0.0f) / this.f49256a);
    }

    /* JADX INFO: renamed from: e */
    public final void m15982e(float f) {
        this.f49257b.m19862i(f);
    }

    /* JADX INFO: renamed from: f */
    public final void m15983f(float f) {
        this.f49259d.m19862i(l70.m15944g(f, this.f49256a, 0.0f));
    }

    /* JADX INFO: renamed from: g */
    public final void m15984g(float f) {
        this.f49256a = f;
    }
}
