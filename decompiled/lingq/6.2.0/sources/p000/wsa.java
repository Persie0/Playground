package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.R$id;

/* JADX INFO: loaded from: classes.dex */
public abstract class wsa {
    /* JADX INFO: renamed from: a */
    public static void m24143a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R$id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    /* JADX INFO: renamed from: b */
    public static f6b m24144b(View view, f6b f6bVar, Rect rect) {
        WindowInsets windowInsetsM11575f = f6bVar.m11575f();
        if (windowInsetsM11575f != null) {
            return f6b.m11570g(view, view.computeSystemWindowInsets(windowInsetsM11575f, rect));
        }
        rect.setEmpty();
        return f6bVar;
    }

    /* JADX INFO: renamed from: c */
    public static void m24145c(View view, gr6 gr6Var) {
        vsa vsaVar = gr6Var != null ? new vsa(view, gr6Var) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R$id.tag_on_apply_window_listener, vsaVar);
        }
        if (view.getTag(R$id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (vsaVar != null) {
            view.setOnApplyWindowInsetsListener(vsaVar);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R$id.tag_window_insets_animation_callback));
        }
    }
}
