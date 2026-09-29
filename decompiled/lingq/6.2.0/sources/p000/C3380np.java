package p000;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.R$color;
import androidx.appcompat.widget.ActionBarContextView;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: np */
/* JADX INFO: loaded from: classes.dex */
public final class C3380np implements gr6, dx5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LayoutInflaterFactory2C3804yp f53084a;

    public /* synthetic */ C3380np(LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp) {
        this.f53084a = layoutInflaterFactory2C3804yp;
    }

    @Override // p000.dx5
    /* JADX INFO: renamed from: b */
    public void mo10740b(hw5 hw5Var, boolean z) {
        this.f53084a.m25232p(hw5Var);
    }

    @Override // p000.dx5
    /* JADX INFO: renamed from: j */
    public boolean mo10741j(hw5 hw5Var) {
        Window.Callback callback = this.f53084a.f70217l.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, hw5Var);
        return true;
    }

    @Override // p000.gr6
    /* JADX INFO: renamed from: s */
    public f6b mo1889s(View view, f6b f6bVar) {
        boolean z;
        t5b o5bVar;
        boolean z2;
        f6b f6bVarMo17237b = f6bVar;
        int iM11574d = f6bVarMo17237b.m11574d();
        LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp = this.f53084a;
        Context context = layoutInflaterFactory2C3804yp.f70215k;
        int iM11574d2 = f6bVarMo17237b.m11574d();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C3804yp.f70193P;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C3804yp.f70193P.getLayoutParams();
            boolean z3 = true;
            if (layoutInflaterFactory2C3804yp.f70193P.isShown()) {
                if (layoutInflaterFactory2C3804yp.f70229w0 == null) {
                    layoutInflaterFactory2C3804yp.f70229w0 = new Rect();
                    layoutInflaterFactory2C3804yp.f70230x0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C3804yp.f70229w0;
                Rect rect2 = layoutInflaterFactory2C3804yp.f70230x0;
                rect.set(f6bVarMo17237b.m11572b(), f6bVarMo17237b.m11574d(), f6bVarMo17237b.m11573c(), f6bVarMo17237b.m11571a());
                xva.m24713a(layoutInflaterFactory2C3804yp.f70198U, rect, rect2);
                int i = rect.top;
                int i2 = rect.left;
                int i3 = rect.right;
                ViewGroup viewGroup = layoutInflaterFactory2C3804yp.f70198U;
                WeakHashMap weakHashMap = dta.f36217a;
                f6b f6bVarM24661a = xsa.m24661a(viewGroup);
                int iM11572b = f6bVarM24661a == null ? 0 : f6bVarM24661a.m11572b();
                int iM11573c = f6bVarM24661a == null ? 0 : f6bVarM24661a.m11573c();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z2 = true;
                }
                if (i <= 0 || layoutInflaterFactory2C3804yp.f70200W != null) {
                    View view2 = layoutInflaterFactory2C3804yp.f70200W;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i4 = marginLayoutParams2.height;
                        int i5 = marginLayoutParams.topMargin;
                        if (i4 != i5 || marginLayoutParams2.leftMargin != iM11572b || marginLayoutParams2.rightMargin != iM11573c) {
                            marginLayoutParams2.height = i5;
                            marginLayoutParams2.leftMargin = iM11572b;
                            marginLayoutParams2.rightMargin = iM11573c;
                            layoutInflaterFactory2C3804yp.f70200W.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C3804yp.f70200W = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iM11572b;
                    layoutParams.rightMargin = iM11573c;
                    layoutInflaterFactory2C3804yp.f70198U.addView(layoutInflaterFactory2C3804yp.f70200W, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C3804yp.f70200W;
                z3 = view4 != null;
                if (z3 && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C3804yp.f70200W;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R$color.abc_decor_view_status_guard_light) : context.getColor(R$color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C3804yp.f70205b0 && z3) {
                    iM11574d2 = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                layoutInflaterFactory2C3804yp.f70193P.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C3804yp.f70200W;
        if (view6 != null) {
            view6.setVisibility(z ? 0 : 8);
        }
        if (iM11574d != iM11574d2) {
            int iM11572b2 = f6bVarMo17237b.m11572b();
            int iM11573c2 = f6bVarMo17237b.m11573c();
            int iM11571a = f6bVarMo17237b.m11571a();
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 36) {
                o5bVar = new s5b(f6bVarMo17237b);
            } else if (i6 >= 35) {
                o5bVar = new r5b(f6bVarMo17237b);
            } else if (i6 >= 34) {
                o5bVar = new q5b(f6bVarMo17237b);
            } else if (i6 >= 31) {
                o5bVar = new p5b(f6bVarMo17237b);
            } else {
                o5bVar = i6 >= 30 ? new o5b(f6bVarMo17237b) : new n5b(f6bVarMo17237b);
            }
            o5bVar.mo17241h(l64.m15830c(iM11572b2, iM11574d2, iM11573c2, iM11571a));
            f6bVarMo17237b = o5bVar.mo17237b();
        }
        WeakHashMap weakHashMap2 = dta.f36217a;
        WindowInsets windowInsetsM11575f = f6bVarMo17237b.m11575f();
        if (windowInsetsM11575f != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsM11575f);
            if (!windowInsetsOnApplyWindowInsets.equals(windowInsetsM11575f)) {
                return f6b.m11570g(view, windowInsetsOnApplyWindowInsets);
            }
        }
        return f6bVarMo17237b;
    }
}
