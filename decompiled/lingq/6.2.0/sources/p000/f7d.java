package p000;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f7d {

    /* JADX INFO: renamed from: a */
    public static p04 f38603a;

    /* JADX INFO: renamed from: b */
    public static Thread f38604b;

    /* JADX INFO: renamed from: a */
    public static final p04 m11590a() {
        p04 p04Var = f38603a;
        if (p04Var != null) {
            return p04Var;
        }
        o04 o04Var = new o04("Rounded.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = soa.f61116a;
        pd9 pd9Var = new pd9(aa1.f403b);
        f57 f57Var = new f57();
        f57Var.m11553h(9.0f, 16.17f);
        f57Var.m11551f(5.53f, 12.7f);
        f57Var.m11548c(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        f57Var.m11548c(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        f57Var.m11552g(4.18f, 4.18f);
        f57Var.m11548c(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        f57Var.m11551f(20.29f, 7.71f);
        f57Var.m11548c(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        f57Var.m11548c(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        f57Var.m11551f(9.0f, 16.17f);
        f57Var.m11546a();
        o04.m17720a(o04Var, f57Var.f38440a, pd9Var);
        p04 p04VarM17721b = o04Var.m17721b();
        f38603a = p04VarM17721b;
        return p04VarM17721b;
    }
}
