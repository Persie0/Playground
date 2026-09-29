package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$attr;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000.AbstractC0853cn;
import p000.C3386nv;
import p000.im1;
import p000.io0;
import p000.lm1;
import p000.qz2;
import p000.r46;
import p000.rs3;
import p000.ss3;
import p000.ts3;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
public class HideViewOnScrollBehavior<V extends View> extends im1 {

    /* JADX INFO: renamed from: n */
    public static final int f12660n = R$attr.motionDurationLong2;

    /* JADX INFO: renamed from: o */
    public static final int f12661o = R$attr.motionDurationMedium4;

    /* JADX INFO: renamed from: p */
    public static final int f12662p = R$attr.motionEasingEmphasizedInterpolator;

    /* JADX INFO: renamed from: a */
    public ts3 f12663a;

    /* JADX INFO: renamed from: b */
    public AccessibilityManager f12664b;

    /* JADX INFO: renamed from: c */
    public rs3 f12665c;

    /* JADX INFO: renamed from: e */
    public int f12667e;

    /* JADX INFO: renamed from: f */
    public int f12668f;

    /* JADX INFO: renamed from: g */
    public TimeInterpolator f12669g;

    /* JADX INFO: renamed from: h */
    public TimeInterpolator f12670h;

    /* JADX INFO: renamed from: k */
    public ViewPropertyAnimator f12673k;

    /* JADX INFO: renamed from: d */
    public final LinkedHashSet f12666d = new LinkedHashSet();

    /* JADX INFO: renamed from: i */
    public int f12671i = 0;

    /* JADX INFO: renamed from: j */
    public int f12672j = 2;

    /* JADX INFO: renamed from: l */
    public int f12674l = 0;

    /* JADX INFO: renamed from: m */
    public int f12675m = 0;

    public HideViewOnScrollBehavior() {
    }

    @Override // p000.im1
    /* JADX INFO: renamed from: l */
    public final boolean mo5994l(CoordinatorLayout coordinatorLayout, View view, int i) {
        int measuredHeight;
        int i2;
        if (this.f12664b == null) {
            this.f12664b = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.f12664b;
        if (accessibilityManager != null && this.f12665c == null) {
            rs3 rs3Var = new rs3(this, view, 1);
            this.f12665c = rs3Var;
            accessibilityManager.addTouchExplorationStateChangeListener(rs3Var);
            view.addOnAttachStateChangeListener(new io0(this, 3));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i3 = ((lm1) view.getLayoutParams()).f49816c;
        if (i3 == 80 || i3 == 81) {
            m6014w(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i3, i);
            m6014w((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        switch (this.f12663a.f62797a) {
            case 0:
                measuredHeight = view.getMeasuredHeight();
                i2 = marginLayoutParams.bottomMargin;
                break;
            case 1:
                measuredHeight = view.getMeasuredWidth();
                i2 = marginLayoutParams.leftMargin;
                break;
            default:
                measuredHeight = view.getMeasuredWidth();
                i2 = marginLayoutParams.rightMargin;
                break;
        }
        this.f12671i = measuredHeight + i2;
        this.f12667e = r46.m20364G(view.getContext(), f12660n, 225);
        this.f12668f = r46.m20364G(view.getContext(), f12661o, 175);
        Context context = view.getContext();
        qz2 qz2Var = AbstractC0853cn.f10299d;
        int i4 = f12662p;
        this.f12669g = r46.m20365H(context, i4, qz2Var);
        this.f12670h = r46.m20365H(view.getContext(), i4, AbstractC0853cn.f10298c);
        return false;
    }

    @Override // p000.im1
    /* JADX INFO: renamed from: p */
    public final void mo5997p(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        if (i <= 0) {
            if (i < 0) {
                m6015x(view);
                return;
            }
            return;
        }
        if (this.f12672j == 1) {
            return;
        }
        AccessibilityManager accessibilityManager = this.f12664b;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            ViewPropertyAnimator viewPropertyAnimator = this.f12673k;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            m6016y(view, 1);
            this.f12673k = this.f12663a.m22282a(view, this.f12671i).setInterpolator(this.f12670h).setDuration(this.f12668f).setListener(new ss3(1, view, this));
        }
    }

    @Override // p000.im1
    /* JADX INFO: renamed from: t */
    public final boolean mo6000t(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        return i == 2;
    }

    /* JADX INFO: renamed from: w */
    public final void m6014w(int i) {
        int i2;
        ts3 ts3Var = this.f12663a;
        if (ts3Var != null) {
            switch (ts3Var.f62797a) {
                case 0:
                    i2 = 1;
                    break;
                case 1:
                    i2 = 2;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            if (i2 == i) {
                return;
            }
        }
        if (i == 0) {
            this.f12663a = new ts3(2);
            return;
        }
        if (i == 1) {
            this.f12663a = new ts3(0);
        } else if (i == 2) {
            this.f12663a = new ts3(1);
        } else {
            C3386nv.m17626m(ux5.m22989l("Invalid view edge position value: ", i, ". Must be 0, 1 or 2."));
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m6015x(View view) {
        if (this.f12672j == 2) {
            return;
        }
        m6016y(view, 2);
        ViewPropertyAnimator viewPropertyAnimator = this.f12673k;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f12663a.getClass();
        this.f12673k = this.f12663a.m22282a(view, 0).setInterpolator(this.f12669g).setDuration(this.f12667e).setListener(new ss3(1, view, this));
    }

    /* JADX INFO: renamed from: y */
    public final void m6016y(View view, int i) {
        this.f12672j = i;
        if (i == 1) {
            if (view.hasFocus()) {
                view.clearFocus();
            }
            if (view.getImportantForAccessibility() != 4) {
                this.f12674l = view.getImportantForAccessibility();
            }
            if (view.getVisibility() != 4) {
                this.f12675m = view.getVisibility();
            }
            view.setImportantForAccessibility(4);
        } else if (i == 2) {
            if (view.getImportantForAccessibility() == 4) {
                view.setImportantForAccessibility(this.f12674l);
            }
            if (view.getVisibility() == 4) {
                view.setVisibility(this.f12675m);
            }
        }
        Iterator it = this.f12666d.iterator();
        if (it.hasNext()) {
            throw wq1.m24110f(it);
        }
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
