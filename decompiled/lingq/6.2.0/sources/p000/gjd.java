package p000;

import com.lingq.feature.lessoninfo.OpenLessonButtonState;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gjd {
    /* JADX INFO: renamed from: a */
    public static final OpenLessonButtonState m12716a(v35 v35Var) {
        v35Var.getClass();
        c35 c35Var = v35Var.f64783a;
        if (c35Var.f9402m) {
            return OpenLessonButtonState.Import;
        }
        return (c35Var.f9407r <= 0 || v35Var.f64784b.f34908g) ? OpenLessonButtonState.Open : OpenLessonButtonState.Buy;
    }

    /* JADX INFO: renamed from: b */
    public static final c55 m12717b(v35 v35Var) {
        v35Var.getClass();
        c35 c35Var = v35Var.f64783a;
        int i = c35Var.f9390a;
        int i2 = c35Var.f9403n;
        String str = c35Var.f9404o;
        if (str == null) {
            str = "";
        }
        return new c55(i, i2, str, c35Var.f9402m, c35Var.f9408s, c35Var.f9409t, c35Var.f9399j, c35Var.f9406q, c35Var.f9410u, c35Var.f9411v, c35Var.f9412w);
    }
}
