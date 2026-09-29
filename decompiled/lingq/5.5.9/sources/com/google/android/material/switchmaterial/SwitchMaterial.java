package com.google.android.material.switchmaterial;

import ae.C0062b;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.SwitchCompat;
import java.util.WeakHashMap;
import md.C7542a;
import p153hc.C6031a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p507yc.C10344k;
import vc.C9709a;

/* JADX INFO: loaded from: classes.dex */
public class SwitchMaterial extends SwitchCompat {

    /* JADX INFO: renamed from: v0 */
    public static final int[][] f15604v0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: r0 */
    public final C9709a f15605r0;

    /* JADX INFO: renamed from: s0 */
    public ColorStateList f15606s0;

    /* JADX INFO: renamed from: t0 */
    public ColorStateList f15607t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f15608u0;

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        super(C7542a.m15048a(context, attributeSet, com.linguist.R.attr.switchStyle, com.linguist.R.style.Widget_MaterialComponents_CompoundButton_Switch), attributeSet, 0);
        Context context2 = getContext();
        this.f15605r0 = new C9709a(context2);
        TypedArray typedArrayM19357d = C10344k.m19357d(context2, attributeSet, C6031a.f35644M, com.linguist.R.attr.switchStyle, com.linguist.R.style.Widget_MaterialComponents_CompoundButton_Switch, new int[0]);
        this.f15608u0 = typedArrayM19357d.getBoolean(0, false);
        typedArrayM19357d.recycle();
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f15606s0 == null) {
            int iM340d1 = C0062b.m340d1(this, com.linguist.R.attr.colorSurface);
            int iM340d2 = C0062b.m340d1(this, com.linguist.R.attr.colorControlActivated);
            float dimension = getResources().getDimension(com.linguist.R.dimen.mtrl_switch_thumb_elevation);
            C9709a c9709a = this.f15605r0;
            if (c9709a.f49716a) {
                float fM18715i = 0.0f;
                for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                    WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                    fM18715i += C10029b0.i.m18715i((View) parent);
                }
                dimension += fM18715i;
            }
            int iM18216a = c9709a.m18216a(iM340d1, dimension);
            this.f15606s0 = new ColorStateList(f15604v0, new int[]{C0062b.m250B1(1.0f, iM340d1, iM340d2), iM18216a, C0062b.m250B1(0.38f, iM340d1, iM340d2), iM18216a});
        }
        return this.f15606s0;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f15607t0 == null) {
            int iM340d1 = C0062b.m340d1(this, com.linguist.R.attr.colorSurface);
            int iM340d2 = C0062b.m340d1(this, com.linguist.R.attr.colorControlActivated);
            int iM340d3 = C0062b.m340d1(this, com.linguist.R.attr.colorOnSurface);
            this.f15607t0 = new ColorStateList(f15604v0, new int[]{C0062b.m250B1(0.54f, iM340d1, iM340d2), C0062b.m250B1(0.32f, iM340d1, iM340d3), C0062b.m250B1(0.12f, iM340d1, iM340d2), C0062b.m250B1(0.12f, iM340d1, iM340d3)});
        }
        return this.f15607t0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f15608u0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f15608u0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f15608u0 = z10;
        if (z10) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }
}
