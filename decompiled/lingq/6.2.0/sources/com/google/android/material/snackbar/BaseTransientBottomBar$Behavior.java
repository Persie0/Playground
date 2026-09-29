package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p000.c62;
import p000.j13;
import p000.ka0;

/* JADX INFO: loaded from: classes2.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* JADX INFO: renamed from: h */
    public final j13 f13229h;

    public BaseTransientBottomBar$Behavior() {
        j13 j13Var = new j13();
        this.f12680e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f12681f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.f12679d = 0;
        this.f13229h = j13Var;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, p000.im1
    /* JADX INFO: renamed from: k */
    public final boolean mo6017k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f13229h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (c62.f9623b == null) {
                    c62.f9623b = new c62(1);
                }
                synchronized (c62.f9623b.f9624a) {
                }
            }
        } else if (coordinatorLayout.m1982o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (c62.f9623b == null) {
                c62.f9623b = new c62(1);
            }
            synchronized (c62.f9623b.f9624a) {
            }
        }
        return super.mo6017k(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* JADX INFO: renamed from: w */
    public final boolean mo6019w(View view) {
        this.f13229h.getClass();
        return view instanceof ka0;
    }
}
