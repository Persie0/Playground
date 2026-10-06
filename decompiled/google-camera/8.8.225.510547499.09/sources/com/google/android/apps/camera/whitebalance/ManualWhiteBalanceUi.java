package com.google.android.apps.camera.whitebalance;

import android.content.Context;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.SeekBar;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.hzj;
import p000.ikw;
import p000.ilk;
import p000.jvh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ManualWhiteBalanceUi extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public hzj f7322a;

    /* JADX INFO: renamed from: b */
    private ikw f7323b;

    /* JADX INFO: renamed from: c */
    private ilk f7324c;

    public ManualWhiteBalanceUi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7323b = ikw.UNINITIALIZED;
        this.f7324c = ilk.PORTRAIT;
        this.f7322a = hzj.PHONE_LAYOUT;
    }

    /* JADX INFO: renamed from: f */
    private final int m4519f(int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0100R.dimen.manual_wb_reset_btn_width);
        return (i / 2) + (dimensionPixelSize / 2) + (getResources().getDimensionPixelSize(C0100R.dimen.manual_wb_reset_btn_inset_size) / 2) + getResources().getDimensionPixelSize(C0100R.dimen.manual_wb_slider_margin_between_reset_btn);
    }

    /* JADX INFO: renamed from: a */
    public final ImageButton m4520a() {
        return (ImageButton) findViewById(C0100R.id.manual_wb_reset_button);
    }

    /* JADX INFO: renamed from: b */
    public final SeekBar m4521b() {
        return (SeekBar) findViewById(C0100R.id.manual_wb_slider);
    }

    /* JADX INFO: renamed from: c */
    public final ManualWhiteBalanceKnob m4522c() {
        return (ManualWhiteBalanceKnob) findViewById(C0100R.id.manual_wb_knob);
    }

    /* JADX INFO: renamed from: d */
    public final void m4523d(ilk ilkVar, hzj hzjVar, ikw ikwVar) {
        this.f7324c = ilkVar;
        this.f7322a = hzjVar;
        this.f7323b = ikwVar;
        jvh.m13577y(this, ilkVar);
        if (m4522c() != null) {
            jvh.m13578z(m4522c(), ilkVar);
        }
        if (m4520a() != null) {
            jvh.m13578z(m4520a(), ilkVar);
        }
        m4524e(m4521b().getProgress(), m4521b().getMax());
    }

    /* JADX INFO: renamed from: e */
    public final void m4524e(int i, int i2) {
        m4522c().setTranslationY((-(i - (i2 / 2))) * ((m4521b().getWidth() - getResources().getDimensionPixelSize(C0100R.dimen.manual_wb_slider_knob_size)) / i2));
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(C0100R.layout.chameleon_layout, this);
        ImageButton imageButton = (ImageButton) findViewById(C0100R.id.manual_wb_reset_button);
        imageButton.getClass();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageButton.getLayoutParams();
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0100R.dimen.manual_wb_slider_width);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C0100R.dimen.manual_wb_slider_height);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(C0100R.dimen.manual_wb_slider_touch_area);
        int dimensionPixelSize4 = getResources().getDimensionPixelSize(C0100R.dimen.manual_wb_reset_btn_width);
        int dimensionPixelSize5 = getResources().getDimensionPixelSize(C0100R.dimen.manual_wb_reset_btn_inset_size);
        InsetDrawable insetDrawable = new InsetDrawable(getResources().getDrawable(C0100R.drawable.ic_reset_outlines, null), dimensionPixelSize5);
        layoutParams.bottomMargin = m4519f(dimensionPixelSize);
        layoutParams.leftMargin = ((Math.abs(dimensionPixelSize3 - dimensionPixelSize4) / 2) - dimensionPixelSize5) + dimensionPixelSize2;
        imageButton.setLayoutParams(layoutParams);
        imageButton.setImageDrawable(insetDrawable);
        SeekBar seekBar = (SeekBar) findViewById(C0100R.id.manual_wb_slider);
        seekBar.getClass();
        seekBar.setRotation(270.0f);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) seekBar.getLayoutParams();
        int dimensionPixelSize6 = getResources().getDimensionPixelSize(C0100R.dimen.manual_wb_slider_touch_area);
        int dimensionPixelSize7 = getResources().getDimensionPixelSize(C0100R.dimen.manual_wb_slider_knob_size);
        int dimensionPixelSize8 = getResources().getDimensionPixelSize(C0100R.dimen.manual_wb_slider_knob_inset_size);
        int dimensionPixelSize9 = getResources().getDimensionPixelSize(C0100R.dimen.manual_wb_slider_width);
        int dimensionPixelSize10 = getResources().getDimensionPixelSize(C0100R.dimen.manual_wb_slider_height);
        layoutParams2.width = dimensionPixelSize9;
        layoutParams2.leftMargin = ((-Math.abs(layoutParams2.width - dimensionPixelSize6)) / 2) + dimensionPixelSize10;
        seekBar.setLayoutParams(layoutParams2);
        seekBar.setPadding(0, 0, 0, 0);
        ManualWhiteBalanceKnob manualWhiteBalanceKnob = (ManualWhiteBalanceKnob) findViewById(C0100R.id.manual_wb_knob);
        manualWhiteBalanceKnob.getClass();
        InsetDrawable insetDrawable2 = new InsetDrawable(getResources().getDrawable(C0100R.drawable.bg_manual_wb_knob, null), dimensionPixelSize8);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) manualWhiteBalanceKnob.getLayoutParams();
        layoutParams3.leftMargin = ((Math.abs(dimensionPixelSize6 - dimensionPixelSize7) / 2) - dimensionPixelSize8) + dimensionPixelSize10;
        manualWhiteBalanceKnob.setLayoutParams(layoutParams3);
        manualWhiteBalanceKnob.setBackground(insetDrawable2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m4523d(this.f7324c, this.f7322a, this.f7323b);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0100R.dimen.manual_wb_slider_width);
        if (hzj.f30014d.equals(this.f7322a)) {
            dimensionPixelSize = getResources().getDimensionPixelSize(C0100R.dimen.manual_wb_slider_width_jarvis);
        } else {
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(C0100R.dimen.manual_wb_slider_knob_size);
            ImageButton imageButton = (ImageButton) findViewById(C0100R.id.manual_wb_reset_button);
            imageButton.getClass();
            if (dimensionPixelSize2 + dimensionPixelSize + getResources().getDimensionPixelSize(C0100R.dimen.manual_wb_slider_margin_between_reset_btn) + imageButton.getMeasuredWidth() >= getMeasuredHeight() * 0.9f) {
                dimensionPixelSize = (int) (dimensionPixelSize * 0.8f);
            }
        }
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(C0100R.dimen.manual_wb_slider_touch_area);
        int dimensionPixelSize4 = getResources().getDimensionPixelSize(C0100R.dimen.manual_wb_slider_height);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) m4521b().getLayoutParams();
        layoutParams.width = dimensionPixelSize;
        layoutParams.leftMargin = ((-Math.abs(layoutParams.width - dimensionPixelSize3)) / 2) + dimensionPixelSize4;
        ImageButton imageButtonM4520a = m4520a();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageButtonM4520a.getLayoutParams();
        layoutParams2.bottomMargin = m4519f(dimensionPixelSize);
        imageButtonM4520a.setLayoutParams(layoutParams2);
    }
}
