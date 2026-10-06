package p000;

import android.graphics.Rect;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.camera.bottombar.C0100R;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: em */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0161em implements aew {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ LayoutInflaterFactory2C0179fd f14697a;

    public C0161em(LayoutInflaterFactory2C0179fd layoutInflaterFactory2C0179fd) {
        this.f14697a = layoutInflaterFactory2C0179fd;
    }

    @Override // p000.aew
    /* JADX INFO: renamed from: a */
    public final ago mo402a(View view, ago agoVar) {
        boolean z;
        ago agoVarMo575a;
        boolean z2;
        int iM606d = agoVar.m606d();
        LayoutInflaterFactory2C0179fd layoutInflaterFactory2C0179fd = this.f14697a;
        int iM606d2 = agoVar.m606d();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C0179fd.f21381p;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C0179fd.f21381p.getLayoutParams();
            if (layoutInflaterFactory2C0179fd.f21381p.isShown()) {
                if (layoutInflaterFactory2C0179fd.f21350I == null) {
                    layoutInflaterFactory2C0179fd.f21350I = new Rect();
                    layoutInflaterFactory2C0179fd.f21351J = new Rect();
                }
                Rect rect = layoutInflaterFactory2C0179fd.f21350I;
                Rect rect2 = layoutInflaterFactory2C0179fd.f21351J;
                rect.set(agoVar.m604b(), agoVar.m606d(), agoVar.m605c(), agoVar.m603a());
                ViewGroup viewGroup = layoutInflaterFactory2C0179fd.f21386u;
                Method method = C0864nw.f44818a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e) {
                    }
                }
                int i = rect.top;
                int i2 = rect.left;
                int i3 = rect.right;
                ago agoVarM497b = afi.m497b(layoutInflaterFactory2C0179fd.f21386u);
                int iM604b = agoVarM497b == null ? 0 : agoVarM497b.m604b();
                int iM605c = agoVarM497b == null ? 0 : agoVarM497b.m605c();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z2 = true;
                }
                if (i <= 0 || layoutInflaterFactory2C0179fd.f21387v != null) {
                    View view2 = layoutInflaterFactory2C0179fd.f21387v;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        if (marginLayoutParams2.height != marginLayoutParams.topMargin || marginLayoutParams2.leftMargin != iM604b || marginLayoutParams2.rightMargin != iM605c) {
                            marginLayoutParams2.height = marginLayoutParams.topMargin;
                            marginLayoutParams2.leftMargin = iM604b;
                            marginLayoutParams2.rightMargin = iM605c;
                            layoutInflaterFactory2C0179fd.f21387v.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    layoutInflaterFactory2C0179fd.f21387v = new View(layoutInflaterFactory2C0179fd.f21374i);
                    layoutInflaterFactory2C0179fd.f21387v.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iM604b;
                    layoutParams.rightMargin = iM605c;
                    layoutInflaterFactory2C0179fd.f21386u.addView(layoutInflaterFactory2C0179fd.f21387v, -1, layoutParams);
                }
                View view3 = layoutInflaterFactory2C0179fd.f21387v;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    View view4 = layoutInflaterFactory2C0179fd.f21387v;
                    view4.setBackgroundColor((afb.m423d(view4) & 8192) != 0 ? abu.m159a(layoutInflaterFactory2C0179fd.f21374i, C0100R.color.abc_decor_view_status_guard_light) : abu.m159a(layoutInflaterFactory2C0179fd.f21374i, C0100R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C0179fd.f21390y && z) {
                    iM606d2 = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = false;
            }
            if (z2) {
                layoutInflaterFactory2C0179fd.f21381p.setLayoutParams(marginLayoutParams);
            }
        }
        View view5 = layoutInflaterFactory2C0179fd.f21387v;
        if (view5 != null) {
            view5.setVisibility(true == z ? 0 : 8);
        }
        if (iM606d != iM606d2) {
            int iM604b2 = agoVar.m604b();
            int iM605c2 = agoVar.m605c();
            int iM603a = agoVar.m603a();
            agf agfVar = new agf(agoVar);
            agfVar.mo577c(acr.m220c(iM604b2, iM606d2, iM605c2, iM603a));
            agoVarMo575a = agfVar.mo575a();
        } else {
            agoVarMo575a = agoVar;
        }
        return afq.m543c(view, agoVarMo575a);
    }
}
