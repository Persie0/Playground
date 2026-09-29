package p000;

import com.google.android.gms.internal.mlkit_vision_text_common.C0984o;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vkd {

    /* JADX INFO: renamed from: a */
    public static m2d f65556a;

    /* JADX INFO: renamed from: b */
    public static p04 f65557b;

    /* JADX INFO: renamed from: a */
    public static final p04 m23404a() {
        p04 p04Var = f65557b;
        if (p04Var != null) {
            return p04Var;
        }
        o04 o04Var = new o04("Outlined.Lightbulb", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = soa.f61116a;
        pd9 pd9Var = new pd9(aa1.f403b);
        f57 f57VarM17730e = AbstractC3393o1.m17730e(9.0f, 21.0f);
        f57VarM17730e.m11548c(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        f57VarM17730e.m11550e(4.0f);
        f57VarM17730e.m11548c(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        f57VarM17730e.m11557l(-1.0f);
        f57VarM17730e.m11551f(9.0f, 20.0f);
        f57VarM17730e.m11557l(1.0f);
        f57VarM17730e.m11546a();
        f57VarM17730e.m11553h(12.0f, 2.0f);
        f57VarM17730e.m11547b(8.14f, 2.0f, 5.0f, 5.14f, 5.0f, 9.0f);
        f57VarM17730e.m11548c(0.0f, 2.38f, 1.19f, 4.47f, 3.0f, 5.74f);
        f57VarM17730e.m11551f(8.0f, 17.0f);
        f57VarM17730e.m11548c(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        f57VarM17730e.m11550e(6.0f);
        f57VarM17730e.m11548c(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        f57VarM17730e.m11557l(-2.26f);
        f57VarM17730e.m11548c(1.81f, -1.27f, 3.0f, -3.36f, 3.0f, -5.74f);
        f57VarM17730e.m11548c(0.0f, -3.86f, -3.14f, -7.0f, -7.0f, -7.0f);
        f57VarM17730e.m11546a();
        f57VarM17730e.m11553h(14.85f, 13.1f);
        f57VarM17730e.m11552g(-0.85f, 0.6f);
        f57VarM17730e.m11551f(14.0f, 16.0f);
        f57VarM17730e.m11550e(-4.0f);
        f57VarM17730e.m11557l(-2.3f);
        f57VarM17730e.m11552g(-0.85f, -0.6f);
        f57VarM17730e.m11547b(7.8f, 12.16f, 7.0f, 10.63f, 7.0f, 9.0f);
        f57VarM17730e.m11548c(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f);
        f57VarM17730e.m11555j(5.0f, 2.24f, 5.0f, 5.0f);
        f57VarM17730e.m11548c(0.0f, 1.63f, -0.8f, 3.16f, -2.15f, 4.1f);
        f57VarM17730e.m11546a();
        o04.m17720a(o04Var, f57VarM17730e.f38440a, pd9Var);
        p04 p04VarM17721b = o04Var.m17721b();
        f65557b = p04VarM17721b;
        return p04VarM17721b;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized C0984o m23405b(String str) {
        C0984o c0984o;
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        dkd dkdVar = new dkd(str);
        synchronized (vkd.class) {
            try {
                if (f65556a == null) {
                    f65556a = new m2d(3);
                }
                c0984o = (C0984o) f65556a.m21326o(dkdVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0984o;
        return c0984o;
    }
}
