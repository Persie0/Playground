package p297od;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.ExpandableTransformationBehavior;

/* JADX INFO: renamed from: od.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8035a extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ExpandableTransformationBehavior f43689a;

    public C8035a(ExpandableTransformationBehavior expandableTransformationBehavior) {
        this.f43689a = expandableTransformationBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f43689a.f15865b = null;
    }
}
