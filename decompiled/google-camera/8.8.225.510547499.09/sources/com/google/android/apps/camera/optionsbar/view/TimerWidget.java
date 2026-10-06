package com.google.android.apps.camera.optionsbar.view;

import android.content.Context;
import android.os.Trace;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class TimerWidget extends LinearLayoutCompat {
    public TimerWidget(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        Trace.beginSection("timerWidget:inflate");
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C0100R.layout.timer_widget, this);
        Trace.endSection();
    }

    public TimerWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TimerWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
