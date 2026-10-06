package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import p000.lyz;
import p000.mlo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior {
    public BaseTransientBottomBar$Behavior() {
        this.f8071d = SwipeDismissBehavior.m4791v(0.1f);
        this.f8072e = SwipeDismissBehavior.m4791v(0.6f);
        this.f8070c = 0;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, p000.aai
    /* JADX INFO: renamed from: d */
    public final boolean mo7d(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        switch (motionEvent.getActionMasked()) {
            case 0:
                if (coordinatorLayout.m1427k(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    synchronized (lyz.m16210a().f39584a) {
                        break;
                    }
                }
                break;
            case 1:
            case 3:
                synchronized (lyz.m16210a().f39584a) {
                    break;
                }
                break;
        }
        return super.mo7d(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* JADX INFO: renamed from: u */
    public final boolean mo4792u(View view) {
        return view instanceof mlo;
    }
}
