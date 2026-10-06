package com.google.android.apps.camera.p014ui.modeslider;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.camcorder.p008ui.modeslider.recordspeed.RecordSpeedSlider;
import p000.ilk;
import p000.jvh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ModeSliderUi extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private ModeSlider f7057a;

    /* JADX INFO: renamed from: b */
    private RecordSpeedSlider f7058b;

    /* JADX INFO: renamed from: c */
    private ilk f7059c;

    public ModeSliderUi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7059c = ilk.PORTRAIT;
    }

    /* JADX INFO: renamed from: a */
    public final RecordSpeedSlider m4383a() {
        RecordSpeedSlider recordSpeedSlider = this.f7058b;
        recordSpeedSlider.getClass();
        return recordSpeedSlider;
    }

    /* JADX INFO: renamed from: b */
    public final ModeSlider m4384b() {
        ModeSlider modeSlider = this.f7057a;
        modeSlider.getClass();
        return modeSlider;
    }

    /* JADX INFO: renamed from: c */
    public final void m4385c(ilk ilkVar) {
        this.f7059c = ilkVar;
        jvh.m13577y(this, ilkVar);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C0100R.layout.mode_slider_layout, this);
        ModeSlider modeSlider = (ModeSlider) findViewById(C0100R.id.mode_slider);
        modeSlider.getClass();
        this.f7057a = modeSlider;
        RecordSpeedSlider recordSpeedSlider = (RecordSpeedSlider) findViewById(C0100R.id.record_speed_slider);
        recordSpeedSlider.getClass();
        this.f7058b = recordSpeedSlider;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m4384b().f7053c = getMeasuredWidth();
            m4384b().m4379g();
            m4385c(this.f7059c);
        }
    }
}
