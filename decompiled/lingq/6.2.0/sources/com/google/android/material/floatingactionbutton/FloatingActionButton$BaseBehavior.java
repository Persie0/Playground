package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$styleable;
import p000.im1;
import p000.lm1;

/* JADX INFO: loaded from: classes2.dex */
public class FloatingActionButton$BaseBehavior<T> extends im1 {
    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FloatingActionButton_Behavior_Layout);
        typedArrayObtainStyledAttributes.getBoolean(R$styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // p000.im1
    /* JADX INFO: renamed from: e */
    public final boolean mo6142e(View view) {
        throw new ClassCastException();
    }

    @Override // p000.im1
    /* JADX INFO: renamed from: g */
    public final void mo6044g(lm1 lm1Var) {
        if (lm1Var.f49821h == 0) {
            lm1Var.f49821h = 80;
        }
    }

    @Override // p000.im1
    /* JADX INFO: renamed from: h */
    public final boolean mo6006h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    @Override // p000.im1
    /* JADX INFO: renamed from: l */
    public final boolean mo5994l(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior() {
    }
}
