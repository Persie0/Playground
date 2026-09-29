package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* JADX INFO: renamed from: com.google.android.material.timepicker.f */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC3102f implements View.OnTouchListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ GestureDetector f15859a;

    public ViewOnTouchListenerC3102f(GestureDetector gestureDetector) {
        this.f15859a = gestureDetector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f15859a.onTouchEvent(motionEvent);
        }
        return false;
    }
}
