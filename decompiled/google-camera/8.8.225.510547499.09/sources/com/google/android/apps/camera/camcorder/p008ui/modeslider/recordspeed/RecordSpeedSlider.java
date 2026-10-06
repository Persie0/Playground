package com.google.android.apps.camera.camcorder.p008ui.modeslider.recordspeed;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.concurrent.atomic.AtomicInteger;
import p000.acn;
import p000.dai;
import p000.ibl;
import p000.ibm;
import p000.kxk;
import p000.mty;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class RecordSpeedSlider extends LinearLayout implements ibm {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f6575a;

    /* JADX INFO: renamed from: b */
    public final int f6576b;

    /* JADX INFO: renamed from: c */
    public mty f6577c;

    /* JADX INFO: renamed from: d */
    public ibl f6578d;

    /* JADX INFO: renamed from: e */
    public int f6579e;

    /* JADX INFO: renamed from: f */
    public int f6580f;

    /* JADX INFO: renamed from: g */
    public int f6581g;

    public RecordSpeedSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6575a = new AtomicInteger(-1);
        this.f6577c = mty.m16936v();
        this.f6576b = getResources().getDimensionPixelSize(C0100R.dimen.record_speed_slider_option_side_padding);
    }

    /* JADX INFO: renamed from: a */
    public final int m4070a() {
        return this.f6575a.get();
    }

    /* JADX INFO: renamed from: b */
    public final int m4071b(int i) {
        if (i != this.f6579e) {
            int i2 = this.f6581g;
            if (i2 != 0) {
                return i2 == 1 ? i - 1 : i;
            }
            throw null;
        }
        throw new IllegalArgumentException(i + " is the index for back option");
    }

    @Override // p000.ibm
    /* JADX INFO: renamed from: c */
    public final void mo4072c() {
        setEnabled(false);
    }

    @Override // p000.ibm
    /* JADX INFO: renamed from: d */
    public final void mo4073d() {
        setEnabled(true);
    }

    @Override // p000.ibm
    /* JADX INFO: renamed from: e */
    public final void mo4074e() {
        setVisibility(8);
    }

    /* JADX INFO: renamed from: f */
    public final void m4075f(int i) {
        m4076g(i, false);
    }

    /* JADX INFO: renamed from: g */
    public final void m4076g(int i, boolean z) {
        if (i < 0) {
            throw new IllegalArgumentException("Illegal index: " + i);
        }
        if (i != this.f6575a.get()) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                TextView textView = (TextView) getChildAt(i2);
                if (i2 == i) {
                    GradientDrawable gradientDrawable = (GradientDrawable) getContext().getDrawable(C0100R.drawable.bg_record_speed_slider_knob);
                    if (gradientDrawable != null) {
                        m4080k(textView, kxk.m15024q(textView, C0100R.attr.colorOnSecondary));
                        gradientDrawable.setTint(kxk.m15024q(textView, C0100R.attr.colorSecondary));
                        textView.setBackground(gradientDrawable);
                    }
                    textView.setSelected(true);
                    textView.sendAccessibilityEvent(4);
                    if (i == this.f6579e) {
                        textView.getCompoundDrawables()[0].setTint(kxk.m15024q(textView, C0100R.attr.colorOnSecondary));
                    } else {
                        Drawable drawable = getContext().getDrawable(this.f6580f);
                        int iM15024q = kxk.m15024q(textView, C0100R.attr.colorOnSecondary);
                        if (drawable != null) {
                            drawable.setTint(iM15024q);
                        }
                        int dimensionPixelSize = getResources().getDimensionPixelSize(C0100R.dimen.record_speed_slider_knob_compound_padding_between_text);
                        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                        textView.setCompoundDrawablePadding(dimensionPixelSize);
                        textView.setPadding(getResources().getDimensionPixelSize(C0100R.dimen.record_speed_slider_drawable_left_padding), 0, this.f6576b, 0);
                    }
                } else {
                    m4080k(textView, kxk.m15024q(textView, C0100R.attr.colorOnSurface));
                    textView.setBackground(null);
                    textView.setSelected(false);
                    if (i2 == this.f6579e) {
                        textView.getCompoundDrawables()[0].setTint(kxk.m15024q(textView, C0100R.attr.colorOnSurface));
                    } else {
                        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                        textView.setCompoundDrawablePadding(0);
                        int i3 = this.f6576b;
                        textView.setPadding(i3, 0, i3, 0);
                    }
                }
            }
            this.f6575a.set(i);
            ibl iblVar = this.f6578d;
            if (iblVar != null) {
                if (!z) {
                    iblVar.mo5805c(false);
                }
                this.f6578d.mo5803a(this, i, z);
                if (z) {
                    return;
                }
                this.f6578d.mo5804b(this, false);
            }
        }
    }

    @Override // p000.ibm
    /* JADX INFO: renamed from: h */
    public final void mo4077h() {
        setVisibility(0);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m4078i() {
        return getChildAt(this.f6579e) != null && getChildAt(this.f6579e).getVisibility() == 0;
    }

    @Override // p000.ibm
    /* JADX INFO: renamed from: j */
    public final boolean mo4079j() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: k */
    public final void m4080k(TextView textView, int i) {
        acn.m206a(getContext(), C0100R.font.google_sans_medium_compat, new dai(textView));
        textView.setTextColor(i);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
