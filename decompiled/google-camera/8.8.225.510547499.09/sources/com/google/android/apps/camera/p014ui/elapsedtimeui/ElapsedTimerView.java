package com.google.android.apps.camera.p014ui.elapsedtimeui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ElapsedTimerView extends LinearLayout {
    public ElapsedTimerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final TextView m4364a() {
        return (TextView) findViewById(C0100R.id.output_timer);
    }

    /* JADX INFO: renamed from: b */
    public final TextView m4365b() {
        return (TextView) findViewById(C0100R.id.recording_timer);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C0100R.layout.elapsed_time_layout, this);
    }
}
