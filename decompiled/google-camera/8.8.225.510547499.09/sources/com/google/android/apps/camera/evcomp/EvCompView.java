package com.google.android.apps.camera.evcomp;

import android.content.Context;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.acp;
import p000.dot;
import p000.dou;
import p000.dov;
import p000.dow;
import p000.ggc;
import p000.ilk;
import p000.jvh;
import p000.jwf;
import p000.jww;
import p000.mqu;
import p000.mrm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class EvCompView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final ArrayList f6642a;

    /* JADX INFO: renamed from: b */
    public final jww f6643b;

    /* JADX INFO: renamed from: c */
    public final int f6644c;

    /* JADX INFO: renamed from: d */
    public CheckBox f6645d;

    /* JADX INFO: renamed from: e */
    public ImageButton f6646e;

    /* JADX INFO: renamed from: f */
    public EvCompSlider f6647f;

    /* JADX INFO: renamed from: g */
    public EvCompSlider f6648g;

    /* JADX INFO: renamed from: h */
    public dov f6649h;

    /* JADX INFO: renamed from: i */
    public dov f6650i;

    /* JADX INFO: renamed from: j */
    public ilk f6651j;

    /* JADX INFO: renamed from: k */
    public float f6652k;

    /* JADX INFO: renamed from: l */
    public float f6653l;

    /* JADX INFO: renamed from: m */
    private final AccessibilityManager f6654m;

    /* JADX INFO: renamed from: n */
    private final AtomicBoolean f6655n;

    /* JADX INFO: renamed from: o */
    private final int f6656o;

    /* JADX INFO: renamed from: p */
    private final int f6657p;

    /* JADX INFO: renamed from: q */
    private final int f6658q;

    /* JADX INFO: renamed from: r */
    private float f6659r;

    public EvCompView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6642a = new ArrayList();
        this.f6655n = new AtomicBoolean(false);
        this.f6643b = new jwf(dot.SINGLE);
        this.f6651j = ilk.PORTRAIT;
        this.f6654m = (AccessibilityManager) context.getSystemService("accessibility");
        this.f6657p = getResources().getDimensionPixelSize(C0100R.dimen.evcomp_slider_width);
        this.f6644c = getResources().getDimensionPixelSize(C0100R.dimen.evcomp_slider_icon_size);
        this.f6656o = getResources().getDimensionPixelSize(C0100R.dimen.evcomp_slider_knob_size);
        this.f6658q = getResources().getDimensionPixelSize(C0100R.dimen.evcomp_slider_touch_area_width);
        this.f6649h = m4106c(dow.BRIGHTNESS, 0.0f, 1.0f, C0100R.drawable.ic_evc_brightness_24px, C0100R.color.google_grey800, C0100R.drawable.bg_evcomp_brightness_knob, C0100R.string.brightness_knob_accessibility_description);
        this.f6650i = m4106c(dow.SHADOW, 0.0f, 1.0f, C0100R.drawable.ic_evc_shadow_24px, C0100R.color.google_grey100, C0100R.drawable.bg_evcomp_shadow_knob, C0100R.string.shadow_knob_accessibility_description);
    }

    /* JADX INFO: renamed from: d */
    public static String m4100d(float f) {
        return String.format("%+.1f", Float.valueOf(f)).replaceFirst("^[-+](0(\\.0*)?)$", "$1");
    }

    /* JADX INFO: renamed from: o */
    private final float m4101o(int i, dov dovVar) {
        return m4102p(1.0f - (((i + (m4104a() / 2.0f)) - (dovVar.f12167f * m4104a())) / ((dovVar.f12166e - dovVar.f12167f) * m4104a())));
    }

    /* JADX INFO: renamed from: p */
    private static float m4102p(float f) {
        return Math.round(f * 100.0f) / 100.0f;
    }

    /* JADX INFO: renamed from: q */
    private final int m4103q(int i, float f, float f2) {
        float fM4104a = m4104a();
        float fM4104a2 = m4104a();
        float fM4104a3 = m4104a();
        float f3 = fM4104a / 2.0f;
        int i2 = (int) ((f * fM4104a2) - f3);
        if (i < i2) {
            return i2;
        }
        int i3 = (int) ((f2 * fM4104a3) - f3);
        return i > i3 ? i3 : i;
    }

    /* JADX INFO: renamed from: a */
    final int m4104a() {
        return m4105b() - this.f6644c;
    }

    /* JADX INFO: renamed from: b */
    public final int m4105b() {
        int dimensionPixelSize;
        dot dotVar = dot.SINGLE;
        int dimensionPixelSize2 = 0;
        switch (((dot) ((jwf) this.f6643b).f34942d).ordinal()) {
            case 0:
            case 1:
                dimensionPixelSize = getResources().getDimensionPixelSize(C0100R.dimen.evcomp_slider_height);
                break;
            case 2:
                dimensionPixelSize = getResources().getDimensionPixelSize(C0100R.dimen.evcomp_dual_slider_height);
                break;
            default:
                dimensionPixelSize = 0;
                break;
        }
        if (this.f6645d != null) {
            if (((dot) ((jwf) this.f6643b).f34942d).equals(dot.DUAL_INDEPENDENT)) {
                int i = this.f6644c;
                dimensionPixelSize2 = dimensionPixelSize + dimensionPixelSize + i + i + getResources().getDimensionPixelSize(C0100R.dimen.evcomp_lock_button_slider_margin) + this.f6645d.getMeasuredWidth();
            } else {
                dimensionPixelSize2 = this.f6644c + dimensionPixelSize + getResources().getDimensionPixelSize(C0100R.dimen.evcomp_lock_button_slider_margin) + this.f6645d.getMeasuredWidth();
            }
        }
        return ((float) dimensionPixelSize2) >= ((float) getMeasuredHeight()) * 0.85f ? (int) (dimensionPixelSize * 0.8f) : dimensionPixelSize;
    }

    /* JADX INFO: renamed from: c */
    public final dov m4106c(dow dowVar, float f, float f2, int i, int i2, int i3, int i4) {
        dov dovVar = new dov(getContext());
        dovVar.setBackground(new InsetDrawable(dovVar.getResources().getDrawable(i3, null), (dovVar.f12164c - dovVar.f12163b) / 2));
        dovVar.setImageResource(i);
        dovVar.setElevation(dovVar.getResources().getDimensionPixelSize(C0100R.dimen.evcomp_slider_knob_elevation));
        dovVar.setScaleType(ImageView.ScaleType.CENTER);
        dovVar.setTag(dowVar);
        dovVar.setFocusable(true);
        dovVar.setContentDescription(dovVar.getResources().getText(i4));
        dovVar.setOnHoverListener(new dou(dovVar, 0));
        dovVar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        if (f > f2) {
            throw new IllegalArgumentException("Min value is greater than max value");
        }
        dovVar.f12167f = f;
        dovVar.f12166e = f2;
        dovVar.getDrawable().setTint(getResources().getColor(i2, null));
        return dovVar;
    }

    /* JADX INFO: renamed from: e */
    public final void m4107e(dov dovVar, float f) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dovVar.getLayoutParams();
        layoutParams.rightMargin = getResources().getDimensionPixelSize(C0100R.dimen.evcomp_slider_portrait_right_margin) - ((this.f6656o - this.f6644c) / 2);
        layoutParams.leftMargin = 0;
        layoutParams.bottomMargin = 0;
        layoutParams.gravity = 8388629;
        float f2 = dovVar.f12167f;
        float f3 = dovVar.f12166e;
        if (f3 > 1.0f || f3 < 0.0f || f2 < 0.0f || f2 > 1.0f || f2 > f3) {
            throw new IllegalArgumentException("Invalid min/max");
        }
        if (f > 1.0f || f < 0.0f) {
            throw new IllegalArgumentException("Fraction is not illegal: " + f);
        }
        layoutParams.topMargin = m4103q((int) (((((f3 - f2) * (1.0f - f)) + f2) * m4104a()) - (m4104a() / 2.0f)), f2, f3);
        float fAbs = Math.abs(f - dovVar.f12165d);
        dovVar.m6464a(f);
        if (fAbs > 0.01f) {
            dovVar.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m4108f(ilk ilkVar) {
        if (this.f6642a.isEmpty()) {
            return;
        }
        jvh.m13577y(this, ilkVar);
        jvh.m13578z(this.f6645d, ilkVar);
        jvh.m13578z(this.f6646e, ilkVar);
        jvh.m13578z(this.f6649h, ilkVar);
        jvh.m13578z(this.f6650i, ilkVar);
    }

    /* JADX INFO: renamed from: g */
    public final void m4109g(float f) {
        if (f <= 1.0f && f >= 0.0f) {
            m4107e(this.f6649h, f);
            return;
        }
        throw new IllegalArgumentException("Fraction is not illegal: " + f);
    }

    /* JADX INFO: renamed from: h */
    public final void m4110h(float f) {
        this.f6652k = f;
        this.f6647f.setContentDescription(((dot) ((jwf) this.f6643b).f34942d).equals(dot.SINGLE) ? getResources().getString(C0100R.string.ev_announcement, String.valueOf(m4102p(this.f6652k))) : getResources().getString(C0100R.string.brightness_ev_announcement, String.valueOf(m4102p(this.f6652k))));
    }

    /* JADX INFO: renamed from: i */
    public final void m4111i(float f) {
        if (((dot) ((jwf) this.f6643b).f34942d).equals(dot.SINGLE)) {
            return;
        }
        if (f <= 1.0f && f >= 0.0f) {
            m4107e(this.f6650i, f);
            return;
        }
        throw new IllegalArgumentException("Fraction is not illegal: " + f);
    }

    /* JADX INFO: renamed from: j */
    public final void m4112j(float f) {
        this.f6653l = f;
        this.f6648g.setContentDescription(getResources().getString(C0100R.string.shadow_ev_announcement, String.valueOf(m4102p(this.f6653l))));
    }

    /* JADX INFO: renamed from: k */
    public final void m4113k() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388629;
        layoutParams.rightMargin = (getResources().getDimensionPixelSize(C0100R.dimen.evcomp_slider_portrait_right_margin) + (this.f6644c / 2)) - (this.f6645d.getMeasuredWidth() / 2);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0100R.dimen.evcomp_lock_button_slider_margin);
        dot dotVar = dot.SINGLE;
        switch (((dot) ((jwf) this.f6643b).f34942d).ordinal()) {
            case 0:
            case 1:
                layoutParams.bottomMargin = (m4105b() / 2) + dimensionPixelSize + (this.f6644c / 2);
                break;
            case 2:
                layoutParams.bottomMargin = m4105b() + dimensionPixelSize + this.f6644c;
                break;
        }
        this.f6645d.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: l */
    public final void m4114l() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388629;
        int measuredWidth = this.f6646e.getMeasuredWidth();
        layoutParams.rightMargin = ((this.f6658q - this.f6657p) / 2) - (measuredWidth / 2);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0100R.dimen.evcomp_reset_button_slider_margin);
        dot dotVar = dot.SINGLE;
        switch (((dot) ((jwf) this.f6643b).f34942d).ordinal()) {
            case 0:
            case 1:
                layoutParams.bottomMargin = (m4105b() / 2) + dimensionPixelSize + (this.f6644c / 2);
                break;
            case 2:
                layoutParams.bottomMargin = m4105b() + dimensionPixelSize + this.f6644c;
                break;
        }
        this.f6646e.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: m */
    public final void m4115m() {
        int i;
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0100R.dimen.evcomp_slider_portrait_right_margin);
        int i2 = this.f6644c / 2;
        int i3 = dimensionPixelSize + i2;
        int i4 = this.f6658q - this.f6657p;
        if (this.f6654m.isTouchExplorationEnabled()) {
            int i5 = this.f6658q;
            i = i5 + i5;
        } else {
            i = this.f6658q;
        }
        int i6 = i3 - (i4 / 2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, m4105b());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, m4105b());
        if (((dot) ((jwf) this.f6643b).f34942d).equals(dot.DUAL_INDEPENDENT)) {
            int iM4105b = (m4105b() / 2) + i2;
            this.f6647f.m4099a(m4105b(), acp.m212d(getResources().getColor(C0100R.color.google_grey200, null), 219), acp.m212d(getResources().getColor(C0100R.color.google_grey500, null), 219), getResources().getColor(C0100R.color.evcomp_brightness_slider_stroke_color, null));
            this.f6648g.m4099a(m4105b(), acp.m212d(getResources().getColor(C0100R.color.google_grey500, null), 219), acp.m212d(getResources().getColor(C0100R.color.google_grey900, null), 219), getResources().getColor(C0100R.color.evcomp_shadows_slider_stroke_color, null));
            layoutParams.bottomMargin = iM4105b;
            layoutParams.gravity = 8388629;
            layoutParams2.gravity = 8388629;
            layoutParams2.rightMargin = i6;
            layoutParams2.topMargin = iM4105b;
            this.f6648g.setLayoutParams(layoutParams2);
            this.f6648g.requestLayout();
            this.f6648g.invalidate();
        } else {
            this.f6647f.m4099a(m4105b(), acp.m212d(getResources().getColor(C0100R.color.google_grey200, null), 219), acp.m212d(getResources().getColor(C0100R.color.google_grey900, null), 219), getResources().getColor(C0100R.color.evcomp_shadows_slider_stroke_color, null));
            layoutParams.height = m4105b();
            layoutParams.gravity = 8388629;
        }
        layoutParams.rightMargin = i6;
        this.f6647f.setLayoutParams(layoutParams);
        this.f6647f.requestLayout();
        this.f6647f.invalidate();
    }

    /* JADX INFO: renamed from: n */
    public final float[] m4116n(View view, MotionEvent motionEvent) {
        mrm mrmVar;
        FrameLayout.LayoutParams layoutParams;
        float[] fArr = {-1.0f, -1.0f};
        dov dovVar = (dov) view;
        if (motionEvent.getAction() == 0) {
            this.f6659r = ilk.m11427e(this.f6651j) ? motionEvent.getRawY() : motionEvent.getRawX();
        } else if (motionEvent.getAction() == 2) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
            float rawY = ilk.m11427e(this.f6651j) ? motionEvent.getRawY() : motionEvent.getRawX();
            int iM4103q = m4103q(this.f6651j.equals(ilk.REVERSE_LANDSCAPE) ? (int) ((layoutParams2.topMargin + this.f6659r) - rawY) : (int) ((layoutParams2.topMargin + rawY) - this.f6659r), dovVar.f12167f, dovVar.f12166e);
            int i = iM4103q - layoutParams2.topMargin;
            layoutParams2.topMargin = iM4103q;
            if (!((dot) ((jwf) this.f6643b).f34942d).equals(dot.DUAL_INDEPENDENT) && this.f6642a.size() > 1) {
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) dovVar.getLayoutParams();
                mrm mrmVarM16829i = mqu.f41450a;
                ArrayList arrayList = this.f6642a;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    dov dovVar2 = (dov) arrayList.get(i2);
                    if (dovVar2.equals(dovVar)) {
                        layoutParams = layoutParams3;
                    } else {
                        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) dovVar2.getLayoutParams();
                        layoutParams = layoutParams3;
                        if (Math.abs(layoutParams3.topMargin - layoutParams4.topMargin) < this.f6644c) {
                            int iM4103q2 = m4103q(layoutParams4.topMargin + i, dovVar2.f12167f, dovVar2.f12166e);
                            layoutParams4.topMargin = iM4103q2;
                            mrmVarM16829i = mrm.m16829i(Integer.valueOf(iM4103q2));
                        }
                    }
                    i2++;
                    layoutParams3 = layoutParams;
                }
                mrmVar = mrmVarM16829i;
            } else {
                mrmVar = mqu.f41450a;
            }
            this.f6659r = rawY;
            view.setLayoutParams(layoutParams2);
            requestLayout();
            invalidate();
            float fM4101o = m4101o(iM4103q, dovVar);
            dovVar.m6464a(fM4101o);
            fArr[0] = fM4101o;
            if (mrmVar.mo16813g()) {
                for (dov dovVar3 : this.f6642a) {
                    if (!dovVar3.equals(view)) {
                        float fM4101o2 = m4101o(((Integer) mrmVar.mo16809c()).intValue(), dovVar3);
                        dovVar3.m6464a(fM4101o2);
                        fArr[1] = fM4101o2;
                    }
                }
            }
        } else if (motionEvent.getAction() == 1) {
            this.f6659r = 0.0f;
        }
        return fArr;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.f6645d = (CheckBox) findViewById(C0100R.id.lock_button);
        this.f6646e = (ImageButton) findViewById(C0100R.id.evcomp_reset_button);
        this.f6647f = (EvCompSlider) findViewById(C0100R.id.evcomp_brightness_slider);
        this.f6648g = (EvCompSlider) findViewById(C0100R.id.evcomp_shadow_slider);
        ggc ggcVar = ggc.f24644b;
        this.f6647f.setOnTouchListener(ggcVar);
        this.f6648g.setOnTouchListener(ggcVar);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x002b A[RETURN] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f6654m.isTouchExplorationEnabled()) {
            if (!this.f6655n.get()) {
                this.f6655n.set(true);
            } else if (!z) {
                return;
            }
        } else if (this.f6655n.get()) {
            this.f6655n.set(false);
        } else if (!z) {
            return;
        }
        m4108f(this.f6651j);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m4115m();
        m4113k();
        m4114l();
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        Iterator it = this.f6642a.iterator();
        while (it.hasNext()) {
            ((dov) it.next()).setVisibility(i);
        }
    }
}
