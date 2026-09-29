package p000;

import android.text.PrecomputedText;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d7d {

    /* JADX INFO: renamed from: a */
    public static p04 f35098a;

    /* JADX INFO: renamed from: a */
    public static final p04 m10143a() {
        p04 p04Var = f35098a;
        if (p04Var != null) {
            return p04Var;
        }
        o04 o04Var = new o04("Outlined.CheckCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = soa.f61116a;
        pd9 pd9Var = new pd9(aa1.f403b);
        f57 f57VarM17730e = AbstractC3393o1.m17730e(12.0f, 2.0f);
        f57VarM17730e.m11547b(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        f57VarM17730e.m11555j(4.48f, 10.0f, 10.0f, 10.0f);
        f57VarM17730e.m11555j(10.0f, -4.48f, 10.0f, -10.0f);
        f57VarM17730e.m11554i(17.52f, 2.0f, 12.0f, 2.0f);
        f57VarM17730e.m11546a();
        f57VarM17730e.m11553h(12.0f, 20.0f);
        f57VarM17730e.m11548c(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        f57VarM17730e.m11555j(3.59f, -8.0f, 8.0f, -8.0f);
        f57VarM17730e.m11555j(8.0f, 3.59f, 8.0f, 8.0f);
        f57VarM17730e.m11555j(-3.59f, 8.0f, -8.0f, 8.0f);
        f57VarM17730e.m11546a();
        f57VarM17730e.m11553h(16.59f, 7.58f);
        f57VarM17730e.m11551f(10.0f, 14.17f);
        f57VarM17730e.m11552g(-2.59f, -2.58f);
        f57VarM17730e.m11551f(6.0f, 13.0f);
        f57VarM17730e.m11552g(4.0f, 4.0f);
        f57VarM17730e.m11552g(8.0f, -8.0f);
        f57VarM17730e.m11546a();
        o04.m17720a(o04Var, f57VarM17730e.f38440a, pd9Var);
        p04 p04VarM17721b = o04Var.m17721b();
        f35098a = p04VarM17721b;
        return p04VarM17721b;
    }

    /* JADX INFO: renamed from: b */
    public static PrecomputedText.Params m10144b(C3048gr c3048gr) {
        return c3048gr.getTextMetricsParams();
    }

    /* JADX INFO: renamed from: c */
    public static void m10145c(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }
}
