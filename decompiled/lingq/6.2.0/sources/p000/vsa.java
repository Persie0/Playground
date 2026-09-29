package p000;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class vsa implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    public f6b f65865a = null;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f65866b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gr6 f65867c;

    public vsa(View view, gr6 gr6Var) {
        this.f65866b = view;
        this.f65867c = gr6Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        f6b f6bVarM11570g = f6b.m11570g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        gr6 gr6Var = this.f65867c;
        if (i < 30) {
            wsa.m24143a(windowInsets, this.f65866b);
            if (f6bVarM11570g.equals(this.f65865a)) {
                return gr6Var.mo1889s(view, f6bVarM11570g).m11575f();
            }
        }
        this.f65865a = f6bVarM11570g;
        f6b f6bVarMo1889s = gr6Var.mo1889s(view, f6bVarM11570g);
        if (i >= 30) {
            return f6bVarMo1889s.m11575f();
        }
        WeakHashMap weakHashMap = dta.f36217a;
        view.requestApplyInsets();
        return f6bVarMo1889s.m11575f();
    }
}
