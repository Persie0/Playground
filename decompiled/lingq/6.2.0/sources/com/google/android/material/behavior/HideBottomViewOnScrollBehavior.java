package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$attr;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000.AbstractC0853cn;
import p000.im1;
import p000.io0;
import p000.qz2;
import p000.r46;
import p000.rs3;
import p000.ss3;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class HideBottomViewOnScrollBehavior<V extends View> extends im1 {

    /* JADX INFO: renamed from: n */
    public static final int f12644n = R$attr.motionDurationLong2;

    /* JADX INFO: renamed from: o */
    public static final int f12645o = R$attr.motionDurationMedium4;

    /* JADX INFO: renamed from: p */
    public static final int f12646p = R$attr.motionEasingEmphasizedInterpolator;

    /* JADX INFO: renamed from: b */
    public int f12648b;

    /* JADX INFO: renamed from: c */
    public int f12649c;

    /* JADX INFO: renamed from: d */
    public TimeInterpolator f12650d;

    /* JADX INFO: renamed from: e */
    public TimeInterpolator f12651e;

    /* JADX INFO: renamed from: g */
    public AccessibilityManager f12653g;

    /* JADX INFO: renamed from: h */
    public rs3 f12654h;

    /* JADX INFO: renamed from: k */
    public ViewPropertyAnimator f12657k;

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet f12647a = new LinkedHashSet();

    /* JADX INFO: renamed from: f */
    public int f12652f = 0;

    /* JADX INFO: renamed from: i */
    public final boolean f12655i = true;

    /* JADX INFO: renamed from: j */
    public int f12656j = 2;

    /* JADX INFO: renamed from: l */
    public int f12658l = 0;

    /* JADX INFO: renamed from: m */
    public int f12659m = 0;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // p000.im1
    /* JADX INFO: renamed from: l */
    public boolean mo5994l(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f12652f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f12648b = r46.m20364G(view.getContext(), f12644n, 225);
        this.f12649c = r46.m20364G(view.getContext(), f12645o, 175);
        Context context = view.getContext();
        qz2 qz2Var = AbstractC0853cn.f10299d;
        int i2 = f12646p;
        this.f12650d = r46.m20365H(context, i2, qz2Var);
        this.f12651e = r46.m20365H(view.getContext(), i2, AbstractC0853cn.f10298c);
        if (this.f12653g == null) {
            this.f12653g = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f12653g;
        if (accessibilityManager != null && this.f12654h == null) {
            rs3 rs3Var = new rs3(this, view, 0);
            this.f12654h = rs3Var;
            accessibilityManager.addTouchExplorationStateChangeListener(rs3Var);
            view.addOnAttachStateChangeListener(new io0(this, 2));
        }
        return false;
    }

    @Override // p000.im1
    /* JADX INFO: renamed from: p */
    public final void mo5997p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i <= 0) {
            if (i < 0) {
                m6012w(view);
            }
        } else {
            if (this.f12656j == 1) {
                return;
            }
            if (this.f12655i && (accessibilityManager = this.f12653g) != null && accessibilityManager.isTouchExplorationEnabled()) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f12657k;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            m6013x(view, 1);
            this.f12657k = view.animate().translationY(this.f12652f).setInterpolator(this.f12651e).setDuration(this.f12649c).setListener(new ss3(0, view, this));
        }
    }

    @Override // p000.im1
    /* JADX INFO: renamed from: t */
    public boolean mo6000t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        return i == 2;
    }

    /* JADX INFO: renamed from: w */
    public final void m6012w(View view) {
        if (this.f12656j == 2) {
            return;
        }
        m6013x(view, 2);
        ViewPropertyAnimator viewPropertyAnimator = this.f12657k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f12657k = view.animate().translationY(0.0f).setInterpolator(this.f12650d).setDuration(this.f12648b).setListener(new ss3(0, view, this));
    }

    /* JADX INFO: renamed from: x */
    public final void m6013x(View view, int i) {
        this.f12656j = i;
        if (i == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.f12658l = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.f12659m = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
        } else if (i == 2) {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.f12658l);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.f12659m);
            }
        }
        Iterator it = this.f12647a.iterator();
        if (it.hasNext()) {
            throw wq1.m24110f(it);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
