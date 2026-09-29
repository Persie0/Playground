package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import p177ic.C6315h;
import p260m8.C7499b;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: c */
    public final C6315h f15877c;

    /* JADX INFO: renamed from: d */
    public final C6315h f15878d;

    /* JADX INFO: renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    public class C3106a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f15879a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f15880b;

        public C3106a(boolean z10, View view) {
            this.f15879a = z10;
            this.f15880b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.f15879a) {
                this.f15880b.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (this.f15879a) {
                this.f15880b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.f15877c = new C6315h(75L);
        this.f15878d = new C6315h(0L);
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15877c = new C6315h(75L);
        this.f15878d = new C6315h(0L);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: b */
    public final boolean mo2936b(View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: r */
    public final boolean mo2952r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* JADX INFO: renamed from: t */
    public final AnimatorSet mo8934t(View view, View view2, boolean z10, boolean z11) {
        ObjectAnimator objectAnimatorOfFloat;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        C6315h c6315h = z10 ? this.f15877c : this.f15878d;
        if (z10) {
            if (!z11) {
                view2.setAlpha(0.0f);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        c6315h.m12942a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        AnimatorSet animatorSet = new AnimatorSet();
        C7499b.m14952m0(animatorSet, arrayList);
        animatorSet.addListener(new C3106a(z10, view2));
        return animatorSet;
    }
}
