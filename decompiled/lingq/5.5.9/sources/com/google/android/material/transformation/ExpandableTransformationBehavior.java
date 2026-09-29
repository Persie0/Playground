package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import p297od.C8035a;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* JADX INFO: renamed from: b */
    public AnimatorSet f15865b;

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    /* JADX INFO: renamed from: s */
    public void mo8933s(View view, View view2, boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.f15865b;
        boolean z12 = animatorSet != null;
        if (z12) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSetMo8934t = mo8934t(view, view2, z10, z12);
        this.f15865b = animatorSetMo8934t;
        animatorSetMo8934t.addListener(new C8035a(this));
        this.f15865b.start();
        if (!z11) {
            this.f15865b.end();
        }
    }

    /* JADX INFO: renamed from: t */
    public abstract AnimatorSet mo8934t(View view, View view2, boolean z10, boolean z11);
}
