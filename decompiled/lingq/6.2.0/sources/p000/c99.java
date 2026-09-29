package p000;

import androidx.compose.foundation.layout.Direction;
import androidx.compose.p002ui.platform.AbstractC0406r;

/* JADX INFO: loaded from: classes.dex */
public abstract class c99 {

    /* JADX INFO: renamed from: a */
    public static final y33 f9762a;

    /* JADX INFO: renamed from: b */
    public static final y33 f9763b;

    /* JADX INFO: renamed from: c */
    public static final y33 f9764c;

    /* JADX INFO: renamed from: d */
    public static final j9b f9765d;

    /* JADX INFO: renamed from: e */
    public static final j9b f9766e;

    /* JADX INFO: renamed from: f */
    public static final j9b f9767f;

    /* JADX INFO: renamed from: g */
    public static final j9b f9768g;

    /* JADX INFO: renamed from: h */
    public static final j9b f9769h;

    /* JADX INFO: renamed from: i */
    public static final j9b f9770i;

    static {
        Direction direction = Direction.Horizontal;
        f9762a = new y33(direction, 1.0f, "fillMaxWidth");
        Direction direction2 = Direction.Vertical;
        f9763b = new y33(direction2, 1.0f, "fillMaxHeight");
        Direction direction3 = Direction.Both;
        f9764c = new y33(direction3, 1.0f, "fillMaxSize");
        ec0 ec0Var = nj0.f52792K;
        int i = 25;
        f9765d = new j9b(direction, new C3186kj(ec0Var, i), ec0Var, "wrapContentWidth");
        ec0 ec0Var2 = nj0.f52791J;
        f9766e = new j9b(direction, new C3186kj(ec0Var2, i), ec0Var2, "wrapContentWidth");
        fc0 fc0Var = nj0.f52789H;
        int i2 = 26;
        f9767f = new j9b(direction2, new C3186kj(fc0Var, i2), fc0Var, "wrapContentHeight");
        fc0 fc0Var2 = nj0.f52817l;
        f9768g = new j9b(direction2, new C3186kj(fc0Var2, i2), fc0Var2, "wrapContentHeight");
        gc0 gc0Var = nj0.f52812g;
        int i3 = 27;
        f9769h = new j9b(direction3, new C3186kj(gc0Var, i3), gc0Var, "wrapContentSize");
        gc0 gc0Var2 = nj0.f52808c;
        f9770i = new j9b(direction3, new C3186kj(gc0Var2, i3), gc0Var2, "wrapContentSize");
    }

    /* JADX INFO: renamed from: a */
    public static final e16 m4408a(e16 e16Var, float f, float f2) {
        return e16Var.mo3161g(new eha(f, f2));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ e16 m4409b(e16 e16Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = Float.NaN;
        }
        if ((i & 2) != 0) {
            f2 = Float.NaN;
        }
        return m4408a(e16Var, f, f2);
    }

    /* JADX INFO: renamed from: c */
    public static final e16 m4410c(e16 e16Var, float f) {
        return e16Var.mo3161g(f == 1.0f ? f9763b : new y33(Direction.Vertical, f, "fillMaxHeight"));
    }

    /* JADX INFO: renamed from: d */
    public static final e16 m4411d(e16 e16Var, float f) {
        return e16Var.mo3161g(f == 1.0f ? f9764c : new y33(Direction.Both, f, "fillMaxSize"));
    }

    /* JADX INFO: renamed from: e */
    public static final e16 m4412e(e16 e16Var, float f) {
        return e16Var.mo3161g(f == 1.0f ? f9762a : new y33(Direction.Horizontal, f, "fillMaxWidth"));
    }

    /* JADX INFO: renamed from: g */
    public static final e16 m4414g(e16 e16Var, float f) {
        return e16Var.mo3161g(new b99(0.0f, f, 0.0f, f, true, AbstractC0406r.m1816b(), 5));
    }

    /* JADX INFO: renamed from: h */
    public static final e16 m4415h(e16 e16Var, float f, float f2) {
        return e16Var.mo3161g(new b99(0.0f, f, 0.0f, f2, true, AbstractC0406r.m1816b(), 5));
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ e16 m4416i(e16 e16Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = Float.NaN;
        }
        if ((i & 2) != 0) {
            f2 = Float.NaN;
        }
        return m4415h(e16Var, f, f2);
    }

    /* JADX INFO: renamed from: j */
    public static final e16 m4417j(e16 e16Var, float f) {
        return e16Var.mo3161g(new b99(0.0f, f, 0.0f, f, false, AbstractC0406r.m1816b(), 5));
    }

    /* JADX INFO: renamed from: k */
    public static e16 m4418k(e16 e16Var, int i) {
        return e16Var.mo3161g(new b99(0.0f, (i & 1) != 0 ? Float.NaN : 48.0f, 0.0f, (i & 2) == 0 ? 150.0f : Float.NaN, false, AbstractC0406r.m1816b(), 5));
    }

    /* JADX INFO: renamed from: l */
    public static final e16 m4419l(e16 e16Var, float f) {
        return e16Var.mo3161g(new b99(f, f, f, f, false, AbstractC0406r.m1816b()));
    }

    /* JADX INFO: renamed from: m */
    public static e16 m4420m(e16 e16Var, float f, float f2, float f3, float f4, int i) {
        return e16Var.mo3161g(new b99((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, false, AbstractC0406r.m1816b()));
    }

    /* JADX INFO: renamed from: n */
    public static final e16 m4421n(e16 e16Var, float f) {
        return e16Var.mo3161g(new b99(f, 0.0f, f, 0.0f, false, AbstractC0406r.m1816b(), 10));
    }

    /* JADX INFO: renamed from: o */
    public static final e16 m4422o(e16 e16Var, float f) {
        return e16Var.mo3161g(new b99(f, f, f, f, true, AbstractC0406r.m1816b()));
    }

    /* JADX INFO: renamed from: p */
    public static final e16 m4423p(e16 e16Var, float f, float f2) {
        return e16Var.mo3161g(new b99(f, f2, f, f2, true, AbstractC0406r.m1816b()));
    }

    /* JADX INFO: renamed from: q */
    public static final e16 m4424q(e16 e16Var, float f, float f2, float f3, float f4) {
        return e16Var.mo3161g(new b99(f, f2, f3, f4, true, AbstractC0406r.m1816b()));
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ e16 m4425r(e16 e16Var, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = Float.NaN;
        }
        if ((i & 2) != 0) {
            f2 = Float.NaN;
        }
        if ((i & 4) != 0) {
            f3 = Float.NaN;
        }
        return m4424q(e16Var, f, f2, f3, (i & 8) == 0 ? 60.0f : Float.NaN);
    }

    /* JADX INFO: renamed from: s */
    public static final e16 m4426s(e16 e16Var, float f) {
        return e16Var.mo3161g(new b99(f, 0.0f, f, 0.0f, true, AbstractC0406r.m1816b(), 10));
    }

    /* JADX INFO: renamed from: t */
    public static final e16 m4427t(e16 e16Var, float f, float f2) {
        return e16Var.mo3161g(new b99(f, 0.0f, f2, 0.0f, true, AbstractC0406r.m1816b(), 10));
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ e16 m4428u(e16 e16Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = Float.NaN;
        }
        if ((i & 2) != 0) {
            f2 = Float.NaN;
        }
        return m4427t(e16Var, f, f2);
    }

    /* JADX INFO: renamed from: v */
    public static e16 m4429v(e16 e16Var) {
        j9b j9bVar;
        fc0 fc0Var = nj0.f52789H;
        if (fa4.m11650l(fc0Var, fc0Var)) {
            j9bVar = f9767f;
        } else {
            j9bVar = fa4.m11650l(fc0Var, nj0.f52817l) ? f9768g : new j9b(Direction.Vertical, new C3186kj(fc0Var, 26), fc0Var, "wrapContentHeight");
        }
        return e16Var.mo3161g(j9bVar);
    }

    /* JADX INFO: renamed from: w */
    public static e16 m4430w(e16 e16Var, gc0 gc0Var, int i) {
        j9b j9bVar;
        gc0 gc0Var2 = nj0.f52812g;
        if ((i & 1) != 0) {
            gc0Var = gc0Var2;
        }
        if (gc0Var.equals(gc0Var2)) {
            j9bVar = f9769h;
        } else {
            j9bVar = gc0Var.equals(nj0.f52808c) ? f9770i : new j9b(Direction.Both, new C3186kj(gc0Var, 27), gc0Var, "wrapContentSize");
        }
        return e16Var.mo3161g(j9bVar);
    }

    /* JADX INFO: renamed from: x */
    public static e16 m4431x(e16 e16Var) {
        j9b j9bVar;
        ec0 ec0Var = nj0.f52792K;
        if (fa4.m11650l(ec0Var, ec0Var)) {
            j9bVar = f9765d;
        } else {
            j9bVar = fa4.m11650l(ec0Var, nj0.f52791J) ? f9766e : new j9b(Direction.Horizontal, new C3186kj(ec0Var, 25), ec0Var, "wrapContentWidth");
        }
        return e16Var.mo3161g(j9bVar);
    }
}
