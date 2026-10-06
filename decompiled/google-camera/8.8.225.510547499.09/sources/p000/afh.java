package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.clockwork.common.wearable.wearmaterial.selectioncontrol.eMjB.VzWFSVj;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class afh {
    /* JADX INFO: renamed from: A */
    public static final void m469A(View view, aqn aqnVar) {
        view.getClass();
        view.setTag(C0100R.id.view_tree_saved_state_registry_owner, aqnVar);
    }

    /* JADX INFO: renamed from: a */
    public static float m470a(View view) {
        return view.getElevation();
    }

    /* JADX INFO: renamed from: b */
    public static float m471b(View view) {
        return view.getTranslationZ();
    }

    /* JADX INFO: renamed from: c */
    public static float m472c(View view) {
        return view.getZ();
    }

    /* JADX INFO: renamed from: d */
    public static ColorStateList m473d(View view) {
        return view.getBackgroundTintList();
    }

    /* JADX INFO: renamed from: e */
    public static PorterDuff.Mode m474e(View view) {
        return view.getBackgroundTintMode();
    }

    /* JADX INFO: renamed from: f */
    public static ago m475f(View view, ago agoVar, Rect rect) {
        WindowInsets windowInsetsM607e = agoVar.m607e();
        if (windowInsetsM607e != null) {
            return ago.m602n(view.computeSystemWindowInsets(windowInsetsM607e, rect), view);
        }
        rect.setEmpty();
        return agoVar;
    }

    /* JADX INFO: renamed from: g */
    public static ago m476g(View view) {
        if (!agd.f295d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = agd.f292a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) agd.f293b.get(obj);
            Rect rect2 = (Rect) agd.f294c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            agf agfVar = new agf();
            agfVar.mo576b(acr.m219b(rect));
            agfVar.mo577c(acr.m219b(rect2));
            ago agoVarMo575a = agfVar.mo575a();
            agoVarMo575a.m615p(agoVarMo575a);
            agoVarMo575a.m614o(view.getRootView());
            return agoVarMo575a;
        } catch (IllegalAccessException e) {
            Log.w("WindowInsetsCompat", VzWFSVj.MBIvqunW.concat(String.valueOf(e.getMessage())), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m477h(View view) {
        return view.getTransitionName();
    }

    /* JADX INFO: renamed from: i */
    static void m478i(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(C0100R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m479j(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    /* JADX INFO: renamed from: k */
    public static void m480k(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    /* JADX INFO: renamed from: l */
    public static void m481l(View view, float f) {
        view.setElevation(f);
    }

    /* JADX INFO: renamed from: m */
    static void m482m(View view, boolean z) {
        view.setNestedScrollingEnabled(z);
    }

    /* JADX INFO: renamed from: n */
    public static void m483n(View view, aew aewVar) {
        if (aewVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(C0100R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new afg(view, aewVar));
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m484o(View view, String str) {
        view.setTransitionName(str);
    }

    /* JADX INFO: renamed from: p */
    public static void m485p(View view, float f) {
        view.setTranslationZ(f);
    }

    /* JADX INFO: renamed from: q */
    public static void m486q(View view, float f) {
        view.setZ(f);
    }

    /* JADX INFO: renamed from: r */
    static void m487r(View view) {
        view.stopNestedScroll();
    }

    /* JADX INFO: renamed from: s */
    static boolean m488s(View view, float f, float f2, boolean z) {
        return view.dispatchNestedFling(f, f2, z);
    }

    /* JADX INFO: renamed from: t */
    static boolean m489t(View view, float f, float f2) {
        return view.dispatchNestedPreFling(f, f2);
    }

    /* JADX INFO: renamed from: u */
    static boolean m490u(View view, int i, int i2, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    /* JADX INFO: renamed from: v */
    static boolean m491v(View view, int i, int i2, int i3, int i4, int[] iArr) {
        return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    /* JADX INFO: renamed from: w */
    static boolean m492w(View view) {
        return view.hasNestedScrollingParent();
    }

    /* JADX INFO: renamed from: x */
    static boolean m493x(View view) {
        return view.isImportantForAccessibility();
    }

    /* JADX INFO: renamed from: y */
    public static boolean m494y(View view) {
        return view.isNestedScrollingEnabled();
    }

    /* JADX INFO: renamed from: z */
    static boolean m495z(View view, int i) {
        return view.startNestedScroll(i);
    }
}
