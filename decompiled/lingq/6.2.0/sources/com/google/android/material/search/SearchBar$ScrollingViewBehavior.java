package com.google.android.material.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: loaded from: classes2.dex */
public class SearchBar$ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

    /* JADX INFO: renamed from: g */
    public boolean f13082g;

    public SearchBar$ScrollingViewBehavior() {
        this.f13082g = false;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, p000.im1
    /* JADX INFO: renamed from: h */
    public final boolean mo6006h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        super.mo6006h(coordinatorLayout, view, view2);
        if (!this.f13082g && (view2 instanceof AppBarLayout)) {
            this.f13082g = true;
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            appBarLayout.setTouchscreenBlocksFocus(false);
            appBarLayout.setBackgroundColor(0);
            appBarLayout.setTargetElevation(0.0f);
        }
        return false;
    }

    public SearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13082g = false;
    }
}
