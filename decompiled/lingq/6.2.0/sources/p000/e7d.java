package p000;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e7d {

    /* JADX INFO: renamed from: a */
    public static p04 f36827a;

    /* JADX INFO: renamed from: a */
    public static final long m10915a() {
        return Thread.currentThread().getId();
    }

    /* JADX INFO: renamed from: b */
    public static final p04 m10916b() {
        p04 p04Var = f36827a;
        if (p04Var != null) {
            return p04Var;
        }
        o04 o04Var = new o04("Filled.CheckCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = soa.f61116a;
        pd9 pd9Var = new pd9(aa1.f403b);
        f57 f57VarM17730e = AbstractC3393o1.m17730e(12.0f, 2.0f);
        f57VarM17730e.m11547b(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        f57VarM17730e.m11555j(4.48f, 10.0f, 10.0f, 10.0f);
        f57VarM17730e.m11555j(10.0f, -4.48f, 10.0f, -10.0f);
        f57VarM17730e.m11554i(17.52f, 2.0f, 12.0f, 2.0f);
        f57VarM17730e.m11546a();
        f57VarM17730e.m11553h(10.0f, 17.0f);
        f57VarM17730e.m11552g(-5.0f, -5.0f);
        f57VarM17730e.m11552g(1.41f, -1.41f);
        f57VarM17730e.m11551f(10.0f, 14.17f);
        f57VarM17730e.m11552g(7.59f, -7.59f);
        f57VarM17730e.m11551f(19.0f, 8.0f);
        f57VarM17730e.m11552g(-9.0f, 9.0f);
        f57VarM17730e.m11546a();
        o04.m17720a(o04Var, f57VarM17730e.f38440a, pd9Var);
        p04 p04VarM17721b = o04Var.m17721b();
        f36827a = p04VarM17721b;
        return p04VarM17721b;
    }
}
