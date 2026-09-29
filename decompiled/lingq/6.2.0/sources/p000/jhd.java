package p000;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jhd {

    /* JADX INFO: renamed from: a */
    public static p04 f45554a;

    /* JADX INFO: renamed from: a */
    public static final p04 m14483a() {
        p04 p04Var = f45554a;
        if (p04Var != null) {
            return p04Var;
        }
        o04 o04Var = new o04("Rounded.KeyboardArrowUp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = soa.f61116a;
        pd9 pd9Var = new pd9(aa1.f403b);
        f57 f57Var = new f57();
        f57Var.m11553h(8.12f, 14.71f);
        f57Var.m11551f(12.0f, 10.83f);
        f57Var.m11552g(3.88f, 3.88f);
        f57Var.m11548c(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        f57Var.m11548c(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        f57Var.m11551f(12.7f, 8.71f);
        f57Var.m11548c(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        f57Var.m11551f(6.7f, 13.3f);
        f57Var.m11548c(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        f57Var.m11548c(0.39f, 0.38f, 1.03f, 0.39f, 1.42f, 0.0f);
        f57Var.m11546a();
        o04.m17720a(o04Var, f57Var.f38440a, pd9Var);
        p04 p04VarM17721b = o04Var.m17721b();
        f45554a = p04VarM17721b;
        return p04VarM17721b;
    }
}
