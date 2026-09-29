package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.linguist.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p177ic.C6308a;
import p531zc.C10477a;

/* JADX INFO: loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.AbstractC0768c<V> {

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet<InterfaceC2949b> f14768a;

    /* JADX INFO: renamed from: b */
    public int f14769b;

    /* JADX INFO: renamed from: c */
    public int f14770c;

    /* JADX INFO: renamed from: d */
    public TimeInterpolator f14771d;

    /* JADX INFO: renamed from: e */
    public TimeInterpolator f14772e;

    /* JADX INFO: renamed from: f */
    public int f14773f;

    /* JADX INFO: renamed from: g */
    public int f14774g;

    /* JADX INFO: renamed from: h */
    public int f14775h;

    /* JADX INFO: renamed from: i */
    public ViewPropertyAnimator f14776i;

    /* JADX INFO: renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    public class C2948a extends AnimatorListenerAdapter {
        public C2948a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f14776i = null;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$b */
    public interface InterfaceC2949b {
        /* JADX INFO: renamed from: a */
        void m8582a();
    }

    public HideBottomViewOnScrollBehavior() {
        this.f14768a = new LinkedHashSet<>();
        this.f14773f = 0;
        this.f14774g = 2;
        this.f14775h = 0;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14768a = new LinkedHashSet<>();
        this.f14773f = 0;
        this.f14774g = 2;
        this.f14775h = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: h */
    public boolean mo2942h(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        this.f14773f = v10.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v10.getLayoutParams()).bottomMargin;
        this.f14769b = C10477a.m19428c(R.attr.motionDurationLong2, v10.getContext(), 225);
        this.f14770c = C10477a.m19428c(R.attr.motionDurationMedium4, v10.getContext(), 175);
        this.f14771d = C10477a.m19429d(v10.getContext(), R.attr.motionEasingEmphasizedInterpolator, C6308a.f36526d);
        this.f14772e = C10477a.m19429d(v10.getContext(), R.attr.motionEasingEmphasizedInterpolator, C6308a.f36525c);
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: l */
    public final void mo2946l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
        LinkedHashSet<InterfaceC2949b> linkedHashSet = this.f14768a;
        if (i10 > 0) {
            if (this.f14774g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f14776i;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f14774g = 1;
            Iterator<InterfaceC2949b> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                it.next().m8582a();
            }
            m8581s(view, this.f14773f + this.f14775h, this.f14770c, this.f14772e);
            return;
        }
        if (i10 < 0) {
            if (this.f14774g == 2) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator2 = this.f14776i;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                view.clearAnimation();
            }
            this.f14774g = 2;
            Iterator<InterfaceC2949b> it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                it2.next().m8582a();
            }
            m8581s(view, 0, this.f14769b, this.f14771d);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: p */
    public boolean mo2950p(CoordinatorLayout coordinatorLayout, V v10, View view, View view2, int i10, int i11) {
        return i10 == 2;
    }

    /* JADX INFO: renamed from: s */
    public final void m8581s(V v10, int i10, long j10, TimeInterpolator timeInterpolator) {
        this.f14776i = v10.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j10).setListener(new C2948a());
    }
}
