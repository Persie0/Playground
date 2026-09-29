package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import androidx.core.R$id;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class h5b extends l5b {

    /* JADX INFO: renamed from: e */
    public static final PathInterpolator f41821e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: f */
    public static final qz2 f41822f = new qz2(0);

    /* JADX INFO: renamed from: g */
    public static final DecelerateInterpolator f41823g = new DecelerateInterpolator(1.5f);

    /* JADX INFO: renamed from: h */
    public static final AccelerateInterpolator f41824h = new AccelerateInterpolator(1.5f);

    public h5b(int i, Interpolator interpolator, long j) {
        super(i, interpolator, j);
    }

    /* JADX INFO: renamed from: f */
    public static void m13061f(View view, m5b m5bVar) {
        m80 m80VarM13066k = m13066k(view);
        if (m80VarM13066k != null) {
            m80VarM13066k.mo14068g(m5bVar);
            if (m80VarM13066k.f50743a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m13061f(viewGroup.getChildAt(i), m5bVar);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m13062g(View view, m5b m5bVar, f6b f6bVar, boolean z) {
        m80 m80VarM13066k = m13066k(view);
        if (m80VarM13066k != null) {
            m80VarM13066k.f50744b = f6bVar;
            if (!z) {
                m80VarM13066k.mo14069h(m5bVar);
                z = m80VarM13066k.f50743a == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m13062g(viewGroup.getChildAt(i), m5bVar, f6bVar, z);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m13063h(View view, f6b f6bVar, List list) {
        m80 m80VarM13066k = m13066k(view);
        if (m80VarM13066k != null) {
            f6bVar = m80VarM13066k.mo14070i(f6bVar, list);
            if (m80VarM13066k.f50743a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m13063h(viewGroup.getChildAt(i), f6bVar, list);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m13064i(View view, m5b m5bVar, p33 p33Var) {
        m80 m80VarM13066k = m13066k(view);
        if (m80VarM13066k != null) {
            m80VarM13066k.mo14071j(m5bVar, p33Var);
            if (m80VarM13066k.f50743a == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m13064i(viewGroup.getChildAt(i), m5bVar, p33Var);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static WindowInsets m13065j(View view, WindowInsets windowInsets) {
        return view.getTag(R$id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: k */
    public static m80 m13066k(View view) {
        Object tag = view.getTag(R$id.tag_window_insets_animation_callback);
        if (tag instanceof g5b) {
            return ((g5b) tag).f40254a;
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static void m13067l(View view, m80 m80Var) {
        View.OnApplyWindowInsetsListener g5bVar = m80Var != null ? new g5b(view, m80Var) : null;
        view.setTag(R$id.tag_window_insets_animation_callback, g5bVar);
        if (view.getTag(R$id.tag_compat_insets_dispatch) == null && view.getTag(R$id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(g5bVar);
        }
    }
}
