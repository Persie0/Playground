package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000.aai;
import p000.lij;
import p000.mfs;
import p000.mgo;
import p000.mgp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior extends aai {

    /* JADX INFO: renamed from: a */
    public ViewPropertyAnimator f8060a;

    /* JADX INFO: renamed from: b */
    private final LinkedHashSet f8061b;

    /* JADX INFO: renamed from: c */
    private int f8062c;

    /* JADX INFO: renamed from: d */
    private int f8063d;

    /* JADX INFO: renamed from: e */
    private TimeInterpolator f8064e;

    /* JADX INFO: renamed from: f */
    private TimeInterpolator f8065f;

    /* JADX INFO: renamed from: g */
    private int f8066g;

    /* JADX INFO: renamed from: h */
    private int f8067h;

    public HideBottomViewOnScrollBehavior() {
        this.f8061b = new LinkedHashSet();
        this.f8066g = 0;
        this.f8067h = 2;
    }

    /* JADX INFO: renamed from: u */
    private final void m4789u(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.f8060a = view.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new mgo(this));
    }

    /* JADX INFO: renamed from: v */
    private final void m4790v(int i) {
        this.f8067h = i;
        Iterator it = this.f8061b.iterator();
        while (it.hasNext()) {
            ((mgp) it.next()).m16360a();
        }
    }

    @Override // p000.aai
    /* JADX INFO: renamed from: e */
    public final boolean mo8e(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f8066g = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f8062c = lij.m15393A(view.getContext(), C0100R.attr.motionDurationLong2, 225);
        this.f8063d = lij.m15393A(view.getContext(), C0100R.attr.motionDurationMedium4, 175);
        this.f8064e = lij.m15398F(view.getContext(), C0100R.attr.motionEasingEmphasizedInterpolator, mfs.f40386d);
        this.f8065f = lij.m15398F(view.getContext(), C0100R.attr.motionEasingEmphasizedInterpolator, mfs.f40385c);
        return false;
    }

    @Override // p000.aai
    /* JADX INFO: renamed from: n */
    public final void mo17n(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        if (i > 0) {
            if (this.f8067h == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f8060a;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            m4790v(1);
            m4789u(view, this.f8066g, this.f8063d, this.f8065f);
            return;
        }
        if (i >= 0 || this.f8067h == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f8060a;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        m4790v(2);
        m4789u(view, 0, this.f8062c, this.f8064e);
    }

    @Override // p000.aai
    /* JADX INFO: renamed from: q */
    public final boolean mo20q(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8061b = new LinkedHashSet();
        this.f8066g = 0;
        this.f8067h = 2;
    }
}
