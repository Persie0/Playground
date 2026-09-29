package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p000.C3671v3;
import p000.ck6;
import p000.dta;
import p000.im1;
import p000.ita;
import p000.po9;

/* JADX INFO: loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends im1 {

    /* JADX INFO: renamed from: a */
    public ita f12676a;

    /* JADX INFO: renamed from: b */
    public boolean f12677b;

    /* JADX INFO: renamed from: c */
    public boolean f12678c;

    /* JADX INFO: renamed from: d */
    public int f12679d = 2;

    /* JADX INFO: renamed from: e */
    public float f12680e = 0.0f;

    /* JADX INFO: renamed from: f */
    public float f12681f = 0.5f;

    /* JADX INFO: renamed from: g */
    public final po9 f12682g = new po9(this);

    @Override // p000.im1
    /* JADX INFO: renamed from: k */
    public boolean mo6017k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean zM1982o = this.f12677b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zM1982o = coordinatorLayout.m1982o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f12677b = zM1982o;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f12677b = false;
        }
        if (zM1982o) {
            if (this.f12676a == null) {
                this.f12676a = new ita(coordinatorLayout.getContext(), coordinatorLayout, this.f12682g);
            }
            if (!this.f12678c && this.f12676a.m14142o(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.im1
    /* JADX INFO: renamed from: l */
    public final boolean mo5994l(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            dta.m10638i(view, 1048576);
            dta.m10636g(view, 0);
            if (mo6019w(view)) {
                dta.m10639j(view, C3671v3.f64761k, new ck6(this, 27));
            }
        }
        return false;
    }

    @Override // p000.im1
    /* JADX INFO: renamed from: v */
    public final boolean mo6018v(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f12676a == null) {
            return false;
        }
        if (this.f12678c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f12676a.m14136i(motionEvent);
        return true;
    }

    /* JADX INFO: renamed from: w */
    public boolean mo6019w(View view) {
        return true;
    }
}
