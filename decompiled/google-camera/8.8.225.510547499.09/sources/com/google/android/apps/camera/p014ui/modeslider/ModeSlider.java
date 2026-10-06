package com.google.android.apps.camera.p014ui.modeslider;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p000.acn;
import p000.cln;
import p000.iav;
import p000.iaw;
import p000.iax;
import p000.iay;
import p000.ibl;
import p000.ibm;
import p000.ill;
import p000.kxk;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ModeSlider extends LinearLayout implements ibm {

    /* JADX INFO: renamed from: a */
    public ibl f7051a;

    /* JADX INFO: renamed from: b */
    final List f7052b;

    /* JADX INFO: renamed from: c */
    public int f7053c;

    /* JADX INFO: renamed from: d */
    private final AtomicInteger f7054d;

    /* JADX INFO: renamed from: e */
    private final int f7055e;

    /* JADX INFO: renamed from: f */
    private final LinearLayout.LayoutParams f7056f;

    public ModeSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7054d = new AtomicInteger(-1);
        this.f7052b = new ArrayList();
        this.f7053c = 0;
        this.f7055e = context.getResources().getDimensionPixelSize(C0100R.dimen.mode_slider_mode_side_padding);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, getResources().getDimensionPixelSize(C0100R.dimen.mode_slider_knob_height));
        this.f7056f = layoutParams;
        layoutParams.gravity = 8388627;
    }

    /* JADX INFO: renamed from: m */
    private final void m4375m(TextView textView, int i) {
        acn.m206a(getContext(), C0100R.font.google_sans_medium_compat, new iaw(textView));
        textView.setTextColor(i);
    }

    /* JADX INFO: renamed from: a */
    public final int m4376a() {
        return this.f7054d.get();
    }

    /* JADX INFO: renamed from: b */
    public final int m4377b(iay iayVar) {
        if (!this.f7052b.contains(iayVar)) {
            throw new IllegalArgumentException("Unsupported mode item: ".concat(iayVar.toString()));
        }
        Iterator it = this.f7052b.iterator();
        int i = 0;
        while (it.hasNext() && !((iay) it.next()).equals(iayVar)) {
            i++;
        }
        return i;
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
    public final iay m4378f(int i) {
        return (iay) this.f7052b.get(i);
    }

    /* JADX INFO: renamed from: g */
    final void m4379g() {
        if (this.f7053c <= 0 || m4376a() == -1) {
            return;
        }
        getChildAt(m4376a()).setLayoutParams(this.f7056f);
        ((TextView) getChildAt(m4376a())).setMaxWidth(Integer.MAX_VALUE);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0100R.dimen.mode_slider_side_margin);
        int i = this.f7053c - (dimensionPixelSize + dimensionPixelSize);
        int size = this.f7052b.size();
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C0100R.dimen.mode_slider_side_padding);
        if (getMeasuredWidth() <= i || size <= 1) {
            return;
        }
        int width = (i - (dimensionPixelSize2 + dimensionPixelSize2)) - getChildAt(m4376a()).getWidth();
        int i2 = size - 1;
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 != m4376a()) {
                ((TextView) getChildAt(i3)).setMaxWidth(width / i2);
            }
        }
    }

    @Override // p000.ibm
    /* JADX INFO: renamed from: h */
    public final void mo4077h() {
        setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX INFO: renamed from: i */
    public final void m4380i(iax iaxVar) {
        this.f7052b.clear();
        this.f7052b.addAll(iaxVar.f30188j);
        List list = iaxVar.f30188j;
        removeAllViews();
        this.f7054d.set(-1);
        int size = this.f7052b.size();
        float dimensionPixelSize = getResources().getDimensionPixelSize(C0100R.dimen.mode_slider_mode_text_size);
        float fM11430a = ill.m11430a(getResources().getDimension(C0100R.dimen.mode_slider_mode_text_letter_spacing));
        for (int i = 0; i < size; i++) {
            ?? r5 = ((iay) this.f7052b.get(i)).f30191c;
            ?? r6 = ((iay) this.f7052b.get(i)).f30192d;
            TextView textView = new TextView(getContext());
            textView.setLayoutParams(this.f7056f);
            textView.setSingleLine(true);
            textView.setBackgroundColor(0);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setText((CharSequence) r5);
            textView.setGravity(17);
            m4375m(textView, kxk.m15024q(textView, C0100R.attr.colorOnSurface));
            textView.setTextAlignment(4);
            textView.setTextSize(0, dimensionPixelSize);
            textView.setLetterSpacing(fM11430a);
            int i2 = this.f7055e;
            textView.setPadding(i2, 0, i2, 0);
            textView.setContentDescription(r6);
            textView.setOnClickListener(new iav(this, i, 0));
            addView(textView, i);
        }
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C0100R.dimen.mode_slider_side_padding);
        setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
        setOnTouchListener(new cln(this, 17));
    }

    @Override // p000.ibm
    /* JADX INFO: renamed from: j */
    public final boolean mo4079j() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: k */
    public final void m4381k(int i) {
        m4382l(i, false);
    }

    /* JADX INFO: renamed from: l */
    public final void m4382l(int i, boolean z) {
        if (i < 0) {
            throw new IllegalArgumentException("Illegal index: " + i);
        }
        if (i != this.f7054d.get()) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                TextView textView = (TextView) getChildAt(i2);
                if (i2 == i) {
                    Drawable drawable = getContext().getDrawable(C0100R.drawable.bg_mode_slider_knob);
                    if (drawable != null) {
                        m4375m(textView, kxk.m15024q(textView, C0100R.attr.colorOnSecondary));
                        drawable.setTint(kxk.m15024q(textView, C0100R.attr.colorSecondary));
                        textView.setBackground(drawable);
                    }
                    textView.setSelected(true);
                } else {
                    textView.setBackground(null);
                    m4375m(textView, kxk.m15024q(textView, C0100R.attr.colorOnSurface));
                    textView.setSelected(false);
                }
            }
            this.f7054d.set(i);
            m4379g();
            ibl iblVar = this.f7051a;
            if (iblVar != null) {
                if (!z) {
                    iblVar.mo5805c(false);
                }
                this.f7051a.mo5803a(this, i, z);
                if (z) {
                    return;
                }
                this.f7051a.mo5804b(this, false);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
