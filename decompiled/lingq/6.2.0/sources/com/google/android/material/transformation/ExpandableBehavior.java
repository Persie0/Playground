package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import p000.im1;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class ExpandableBehavior extends im1 {
    public ExpandableBehavior() {
    }

    @Override // p000.im1
    /* JADX INFO: renamed from: f */
    public abstract boolean mo6005f(View view, View view2);

    @Override // p000.im1
    /* JADX INFO: renamed from: h */
    public final boolean mo6006h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // p000.im1
    /* JADX INFO: renamed from: l */
    public final boolean mo5994l(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (!view.isLaidOut()) {
            ArrayList arrayListM1979j = coordinatorLayout.m1979j(view);
            int size = arrayListM1979j.size();
            for (int i2 = 0; i2 < size; i2++) {
                mo6005f(view, (View) arrayListM1979j.get(i2));
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
