package p000;

import android.os.UserManager;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nfb {

    /* JADX INFO: renamed from: a */
    public static volatile UserManager f52686a = null;

    /* JADX INFO: renamed from: b */
    public static volatile boolean f52687b = false;

    /* JADX INFO: renamed from: c */
    public static final C0282a f52688c = new C0282a(1860418479, false, new jx0(11));

    /* JADX INFO: renamed from: d */
    public static final C0282a f52689d = new C0282a(1367294672, false, new z70(4));

    /* JADX INFO: renamed from: e */
    public static final C0282a f52690e = new C0282a(-1613328085, false, new jx0(12));

    /* JADX INFO: renamed from: f */
    public static p04 f52691f;

    /* JADX INFO: renamed from: a */
    public static final p04 m17405a() {
        p04 p04Var = f52691f;
        if (p04Var != null) {
            return p04Var;
        }
        o04 o04Var = new o04("Rounded.Lock", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = soa.f61116a;
        pd9 pd9Var = new pd9(aa1.f403b);
        f57 f57Var = new f57();
        f57Var.m11553h(18.0f, 8.0f);
        f57Var.m11550e(-1.0f);
        f57Var.m11551f(17.0f, 6.0f);
        f57Var.m11548c(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        f57Var.m11554i(7.0f, 3.24f, 7.0f, 6.0f);
        f57Var.m11557l(2.0f);
        f57Var.m11551f(6.0f, 8.0f);
        f57Var.m11548c(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        f57Var.m11557l(10.0f);
        f57Var.m11548c(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        f57Var.m11550e(12.0f);
        f57Var.m11548c(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        f57Var.m11551f(20.0f, 10.0f);
        f57Var.m11548c(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        f57Var.m11546a();
        f57Var.m11553h(12.0f, 17.0f);
        f57Var.m11548c(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        f57Var.m11555j(0.9f, -2.0f, 2.0f, -2.0f);
        f57Var.m11555j(2.0f, 0.9f, 2.0f, 2.0f);
        f57Var.m11555j(-0.9f, 2.0f, -2.0f, 2.0f);
        f57Var.m11546a();
        f57Var.m11553h(9.0f, 8.0f);
        f57Var.m11551f(9.0f, 6.0f);
        f57Var.m11548c(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
        f57Var.m11555j(3.0f, 1.34f, 3.0f, 3.0f);
        f57Var.m11557l(2.0f);
        f57Var.m11551f(9.0f, 8.0f);
        f57Var.m11546a();
        o04.m17720a(o04Var, f57Var.f38440a, pd9Var);
        p04 p04VarM17721b = o04Var.m17721b();
        f52691f = p04VarM17721b;
        return p04VarM17721b;
    }
}
