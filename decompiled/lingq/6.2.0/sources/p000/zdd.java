package p000;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zdd {

    /* JADX INFO: renamed from: a */
    public static p04 f71427a;

    /* JADX INFO: renamed from: a */
    public static final p04 m25562a() {
        p04 p04Var = f71427a;
        if (p04Var != null) {
            return p04Var;
        }
        o04 o04Var = new o04("Rounded.Forum", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = soa.f61116a;
        pd9 pd9Var = new pd9(aa1.f403b);
        f57 f57Var = new f57();
        f57Var.m11553h(20.0f, 6.0f);
        f57Var.m11550e(-1.0f);
        f57Var.m11557l(8.0f);
        f57Var.m11548c(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        f57Var.m11551f(6.0f, 15.0f);
        f57Var.m11557l(1.0f);
        f57Var.m11548c(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        f57Var.m11550e(10.0f);
        f57Var.m11552g(4.0f, 4.0f);
        f57Var.m11551f(22.0f, 8.0f);
        f57Var.m11548c(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        f57Var.m11546a();
        f57Var.m11553h(17.0f, 11.0f);
        f57Var.m11551f(17.0f, 4.0f);
        f57Var.m11548c(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        f57Var.m11551f(4.0f, 2.0f);
        f57Var.m11548c(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        f57Var.m11557l(13.0f);
        f57Var.m11552g(4.0f, -4.0f);
        f57Var.m11550e(9.0f);
        f57Var.m11548c(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        f57Var.m11546a();
        o04.m17720a(o04Var, f57Var.f38440a, pd9Var);
        p04 p04VarM17721b = o04Var.m17721b();
        f71427a = p04VarM17721b;
        return p04VarM17721b;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m25563b(byte b) {
        return b > -65;
    }
}
