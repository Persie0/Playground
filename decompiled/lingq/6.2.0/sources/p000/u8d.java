package p000;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.C3263c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u8d {

    /* JADX INFO: renamed from: a */
    public static p04 f63607a;

    /* JADX INFO: renamed from: a */
    public static final p04 m22577a() {
        p04 p04Var = f63607a;
        if (p04Var != null) {
            return p04Var;
        }
        o04 o04Var = new o04("Rounded.ContentCopy", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = soa.f61116a;
        pd9 pd9Var = new pd9(aa1.f403b);
        f57 f57Var = new f57();
        f57Var.m11553h(15.0f, 20.0f);
        f57Var.m11549d(5.0f);
        f57Var.m11556k(7.0f);
        f57Var.m11548c(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        f57Var.m11550e(0.0f);
        f57Var.m11547b(3.45f, 6.0f, 3.0f, 6.45f, 3.0f, 7.0f);
        f57Var.m11557l(13.0f);
        f57Var.m11548c(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        f57Var.m11550e(10.0f);
        f57Var.m11548c(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        f57Var.m11557l(0.0f);
        f57Var.m11547b(16.0f, 20.45f, 15.55f, 20.0f, 15.0f, 20.0f);
        f57Var.m11546a();
        f57Var.m11553h(20.0f, 16.0f);
        f57Var.m11556k(4.0f);
        f57Var.m11548c(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        f57Var.m11549d(9.0f);
        f57Var.m11547b(7.9f, 2.0f, 7.0f, 2.9f, 7.0f, 4.0f);
        f57Var.m11557l(12.0f);
        f57Var.m11548c(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        f57Var.m11550e(9.0f);
        f57Var.m11547b(19.1f, 18.0f, 20.0f, 17.1f, 20.0f, 16.0f);
        f57Var.m11546a();
        f57Var.m11553h(18.0f, 16.0f);
        f57Var.m11549d(9.0f);
        f57Var.m11556k(4.0f);
        f57Var.m11550e(9.0f);
        f57Var.m11556k(16.0f);
        f57Var.m11546a();
        o04.m17720a(o04Var, f57Var.f38440a, pd9Var);
        p04 p04VarM17721b = o04Var.m17721b();
        f63607a = p04VarM17721b;
        return p04VarM17721b;
    }

    /* JADX INFO: renamed from: b */
    public static final Object m22578b(df4 df4Var, String str, C3263c c3263c, KSerializer kSerializer) {
        df4Var.getClass();
        str.getClass();
        return new kg4(df4Var, c3263c, str, kSerializer.getDescriptor()).mo15604w(kSerializer);
    }
}
