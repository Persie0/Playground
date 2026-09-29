package p000;

import android.content.Context;
import android.os.Build;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class dqa {

    /* JADX INFO: renamed from: a */
    public final c63 f36041a;

    /* JADX INFO: renamed from: b */
    public final Context f36042b;

    /* JADX INFO: renamed from: c */
    public aqa f36043c;

    /* JADX INFO: renamed from: d */
    public boolean f36044d;

    /* JADX INFO: renamed from: e */
    public Surface f36045e;

    /* JADX INFO: renamed from: f */
    public float f36046f;

    /* JADX INFO: renamed from: g */
    public float f36047g;

    /* JADX INFO: renamed from: h */
    public float f36048h;

    /* JADX INFO: renamed from: i */
    public float f36049i;

    /* JADX INFO: renamed from: j */
    public int f36050j;

    /* JADX INFO: renamed from: k */
    public long f36051k;

    /* JADX INFO: renamed from: l */
    public long f36052l;

    /* JADX INFO: renamed from: m */
    public long f36053m;

    /* JADX INFO: renamed from: n */
    public long f36054n;

    /* JADX INFO: renamed from: o */
    public long f36055o;

    /* JADX INFO: renamed from: p */
    public long f36056p;

    /* JADX INFO: renamed from: q */
    public long f36057q;

    /* JADX INFO: renamed from: r */
    public long f36058r;

    /* JADX INFO: renamed from: s */
    public long f36059s;

    public dqa(Context context) {
        this.f36042b = context;
        c63 c63Var = new c63();
        c63Var.f9625a = new b63();
        c63Var.f9626b = new b63();
        c63Var.f9628d = -9223372036854775807L;
        this.f36041a = c63Var;
        this.f36046f = -1.0f;
        this.f36049i = 1.0f;
        this.f36050j = 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m10589a() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f36045e) == null || this.f36050j == Integer.MIN_VALUE || this.f36048h == 0.0f || !surface.isValid()) {
            return;
        }
        this.f36048h = 0.0f;
        jad.m14368c(this.f36045e, 0.0f);
    }

    /* JADX INFO: renamed from: b */
    public final void m10590b() {
        this.f36053m = 0L;
        this.f36057q = -1L;
        this.f36054n = -1L;
        this.f36051k = 0L;
        this.f36052l = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    /* JADX INFO: renamed from: c */
    public final void m10591c() {
        float f;
        float f2;
        if (Build.VERSION.SDK_INT < 30 || this.f36045e == null) {
            return;
        }
        c63 c63Var = this.f36041a;
        if (!c63Var.f9625a.m3345a()) {
            f = this.f36046f;
        } else if (c63Var.f9625a.m3345a()) {
            b63 b63Var = c63Var.f9625a;
            long j = b63Var.f7998e;
            f = (float) (1.0E9d / (j != 0 ? b63Var.f7999f / j : 0L));
        } else {
            f = -1.0f;
        }
        float f3 = this.f36047g;
        if (f == f3) {
            return;
        }
        if (f != -1.0f && f3 != -1.0f) {
            if (c63Var.f9625a.m3345a()) {
                if ((c63Var.f9625a.m3345a() ? c63Var.f9625a.f7999f : -9223372036854775807L) >= 5000000000L) {
                    f2 = 0.1f;
                } else {
                    f2 = 1.0f;
                }
            } else {
                f2 = 1.0f;
            }
            if (Math.abs(f - this.f36047g) < f2) {
                return;
            }
        } else if (f == -1.0f && c63Var.f9629e < 30) {
            return;
        }
        this.f36047g = f;
        m10592d(false);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0027  */
    /* JADX INFO: renamed from: d */
    public final void m10592d(boolean z) {
        Surface surface;
        float f;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f36045e) == null || this.f36050j == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        if (this.f36044d) {
            float f2 = this.f36047g;
            if (f2 != -1.0f) {
                f = f2 * this.f36049i;
            } else {
                f = 0.0f;
            }
        } else {
            f = 0.0f;
        }
        if (z || this.f36048h != f) {
            this.f36048h = f;
            jad.m14368c(this.f36045e, f);
        }
    }
}
