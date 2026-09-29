package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: com.google.android.material.timepicker.a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC3097a implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ClockFaceView f15852a;

    public ViewTreeObserverOnPreDrawListenerC3097a(ClockFaceView clockFaceView) {
        this.f15852a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f15852a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f15821O.f15840d) - clockFaceView.f15829W;
        if (height != clockFaceView.f15855M) {
            clockFaceView.f15855M = height;
            clockFaceView.mo8928s();
            int i10 = clockFaceView.f15855M;
            ClockHandView clockHandView = clockFaceView.f15821O;
            clockHandView.f15848l = i10;
            clockHandView.invalidate();
        }
        return true;
    }
}
