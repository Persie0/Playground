package com.google.android.material.appbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p000.C0797b4;
import p000.C3133j3;
import p000.C3671v3;
import p000.C3729wo;

/* JADX INFO: renamed from: com.google.android.material.appbar.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C1047b extends C3133j3 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AppBarLayout f12610d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ CoordinatorLayout f12611e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AppBarLayout.BaseBehavior f12612f;

    public C1047b(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.f12612f = baseBehavior;
        this.f12610d = appBarLayout;
        this.f12611e = coordinatorLayout;
    }

    @Override // p000.C3133j3
    /* JADX INFO: renamed from: d */
    public final void mo6010d(View view, C0797b4 c0797b4) {
        this.f44987a.onInitializeAccessibilityNodeInfo(view, c0797b4.f7900a);
        c0797b4.m3279j(ScrollView.class.getName());
        AppBarLayout appBarLayout = this.f12610d;
        if (appBarLayout.getTotalScrollRange() == 0) {
            return;
        }
        CoordinatorLayout coordinatorLayout = this.f12611e;
        AppBarLayout.BaseBehavior baseBehavior = this.f12612f;
        View viewM5987B = AppBarLayout.BaseBehavior.m5987B(baseBehavior, coordinatorLayout);
        if (viewM5987B == null) {
            return;
        }
        int childCount = appBarLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((C3729wo) appBarLayout.getChildAt(i).getLayoutParams()).f67108a != 0) {
                if (baseBehavior.mo6002y() != (-appBarLayout.getTotalScrollRange())) {
                    c0797b4.m3272b(C3671v3.f64758h);
                    c0797b4.m3282m(true);
                }
                if (baseBehavior.mo6002y() != 0) {
                    if (!viewM5987B.canScrollVertically(-1)) {
                        c0797b4.m3272b(C3671v3.f64759i);
                        c0797b4.m3282m(true);
                        return;
                    } else {
                        if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                            c0797b4.m3272b(C3671v3.f64759i);
                            c0797b4.m3282m(true);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // p000.C3133j3
    /* JADX INFO: renamed from: g */
    public final boolean mo6011g(View view, int i, Bundle bundle) {
        AppBarLayout appBarLayout = this.f12610d;
        if (i == 4096) {
            appBarLayout.setExpanded(false);
            return true;
        }
        if (i != 8192) {
            return super.mo6011g(view, i, bundle);
        }
        AppBarLayout.BaseBehavior baseBehavior = this.f12612f;
        if (baseBehavior.mo6002y() != 0) {
            CoordinatorLayout coordinatorLayout = this.f12611e;
            View viewM5987B = AppBarLayout.BaseBehavior.m5987B(baseBehavior, coordinatorLayout);
            if (!viewM5987B.canScrollVertically(-1)) {
                appBarLayout.setExpanded(true);
                return true;
            }
            int i2 = -appBarLayout.getDownNestedPreScrollRange();
            if (i2 != 0) {
                baseBehavior.m5991E(coordinatorLayout, this.f12610d, viewM5987B, i2, new int[]{0, 0});
                return true;
            }
        }
        return false;
    }
}
