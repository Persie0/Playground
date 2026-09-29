package p080e;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0318h1;
import com.linguist.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p254m2.C7472a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p471x2.C10063s0;
import p471x2.InterfaceC10060r;

/* JADX INFO: renamed from: e.h */
/* JADX INFO: loaded from: classes.dex */
public final class C5276h implements InterfaceC10060r {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LayoutInflaterFactory2C5275g f33467a;

    public C5276h(LayoutInflaterFactory2C5275g layoutInflaterFactory2C5275g) {
        this.f33467a = layoutInflaterFactory2C5275g;
    }

    @Override // p471x2.InterfaceC10060r
    /* JADX INFO: renamed from: c */
    public final C10063s0 mo2934c(View view, C10063s0 c10063s0) {
        boolean z10;
        boolean z11;
        int iM14851a;
        int iM18868e = c10063s0.m18868e();
        LayoutInflaterFactory2C5275g layoutInflaterFactory2C5275g = this.f33467a;
        layoutInflaterFactory2C5275g.getClass();
        int iM18868e2 = c10063s0.m18868e();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C5275g.f33393Q;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C5275g.f33393Q.getLayoutParams();
            boolean z12 = true;
            if (layoutInflaterFactory2C5275g.f33393Q.isShown()) {
                if (layoutInflaterFactory2C5275g.f33430y0 == null) {
                    layoutInflaterFactory2C5275g.f33430y0 = new Rect();
                    layoutInflaterFactory2C5275g.f33431z0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C5275g.f33430y0;
                Rect rect2 = layoutInflaterFactory2C5275g.f33431z0;
                rect.set(c10063s0.m18866c(), c10063s0.m18868e(), c10063s0.m18867d(), c10063s0.m18865b());
                ViewGroup viewGroup = layoutInflaterFactory2C5275g.f33399W;
                Method method = C0318h1.f1215a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e10) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e10);
                    }
                }
                int i10 = rect.top;
                int i11 = rect.left;
                int i12 = rect.right;
                ViewGroup viewGroup2 = layoutInflaterFactory2C5275g.f33399W;
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                C10063s0 c10063s0M18733a = C10029b0.j.m18733a(viewGroup2);
                int iM18866c = c10063s0M18733a == null ? 0 : c10063s0M18733a.m18866c();
                int iM18867d = c10063s0M18733a == null ? 0 : c10063s0M18733a.m18867d();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                Context context = layoutInflaterFactory2C5275g.f33414k;
                if (i10 <= 0 || layoutInflaterFactory2C5275g.f33401Y != null) {
                    View view2 = layoutInflaterFactory2C5275g.f33401Y;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != iM18866c || marginLayoutParams2.rightMargin != iM18867d) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = iM18866c;
                            marginLayoutParams2.rightMargin = iM18867d;
                            layoutInflaterFactory2C5275g.f33401Y.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C5275g.f33401Y = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iM18866c;
                    layoutParams.rightMargin = iM18867d;
                    layoutInflaterFactory2C5275g.f33399W.addView(layoutInflaterFactory2C5275g.f33401Y, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C5275g.f33401Y;
                z10 = view4 != null;
                if (z10 && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C5275g.f33401Y;
                    if ((C10029b0.d.m18670g(view5) & 8192) != 0) {
                        Object obj = C7472a.f41322a;
                        iM14851a = C7472a.d.m14851a(context, R.color.abc_decor_view_status_guard_light);
                    } else {
                        Object obj2 = C7472a.f41322a;
                        iM14851a = C7472a.d.m14851a(context, R.color.abc_decor_view_status_guard);
                    }
                    view5.setBackgroundColor(iM14851a);
                }
                if (!layoutInflaterFactory2C5275g.f33406d0 && z10) {
                    iM18868e2 = 0;
                }
                z12 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z12 = false;
                z10 = false;
            }
            if (z12) {
                layoutInflaterFactory2C5275g.f33393Q.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C5275g.f33401Y;
        if (view6 != null) {
            view6.setVisibility(z10 ? 0 : 8);
        }
        return C10029b0.m18653i(view, iM18868e != iM18868e2 ? c10063s0.m18869g(c10063s0.m18866c(), iM18868e2, c10063s0.m18867d(), c10063s0.m18865b()) : c10063s0);
    }
}
