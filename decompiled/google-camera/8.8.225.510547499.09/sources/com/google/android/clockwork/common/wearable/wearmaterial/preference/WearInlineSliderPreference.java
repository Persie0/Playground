package com.google.android.clockwork.common.wearable.wearmaterial.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.preference.Preference;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.clockwork.common.wearable.wearmaterial.slider.WearInlineSlider;
import p000.aor;
import p000.iyj;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class WearInlineSliderPreference extends Preference {

    /* JADX INFO: renamed from: a */
    public float f7514a;

    /* JADX INFO: renamed from: b */
    private final float f7515b;

    /* JADX INFO: renamed from: c */
    private final float f7516c;

    /* JADX INFO: renamed from: d */
    private final float f7517d;

    /* JADX INFO: renamed from: e */
    private final boolean f7518e;

    /* JADX INFO: renamed from: f */
    private final boolean f7519f;

    /* JADX INFO: renamed from: g */
    private CharSequence f7520g;

    /* JADX INFO: renamed from: h */
    private CharSequence f7521h;

    /* JADX INFO: renamed from: i */
    private CharSequence f7522i;

    public WearInlineSliderPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0100R.attr.inlineSliderPreferenceStyle, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iyj.f32653c, C0100R.attr.inlineSliderPreferenceStyle, 0);
        this.f7515b = typedArrayObtainStyledAttributes.getFloat(3, 0.0f);
        this.f7516c = typedArrayObtainStyledAttributes.getFloat(2, 1.0f);
        this.f7519f = typedArrayObtainStyledAttributes.getBoolean(4, false);
        this.f7517d = typedArrayObtainStyledAttributes.getFloat(0, 1.0f);
        this.f7518e = typedArrayObtainStyledAttributes.getBoolean(1, false);
        if (typedArrayObtainStyledAttributes.hasValue(7)) {
            this.f7520g = typedArrayObtainStyledAttributes.getString(7);
        }
        if (typedArrayObtainStyledAttributes.hasValue(10)) {
            this.f7521h = typedArrayObtainStyledAttributes.getString(10);
        }
        if (typedArrayObtainStyledAttributes.hasValue(12)) {
            this.f7522i = typedArrayObtainStyledAttributes.getString(12);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: a */
    public final void mo1466a(aor aorVar) {
        super.mo1466a(aorVar);
        WearInlineSlider wearInlineSlider = (WearInlineSlider) aorVar.f41155a;
        wearInlineSlider.f7538e = this;
        wearInlineSlider.m4628h(this.f7515b);
        wearInlineSlider.m4629i(this.f7516c);
        wearInlineSlider.m4627g(this.f7514a);
        wearInlineSlider.m4626f(this.f7517d);
        wearInlineSlider.m4624d(this.f7518e);
        wearInlineSlider.m4625e(this.f7519f);
        CharSequence charSequence = this.f7521h;
        if (charSequence != null) {
            wearInlineSlider.m4622b(charSequence);
        }
        CharSequence charSequence2 = this.f7520g;
        if (charSequence2 != null) {
            wearInlineSlider.m4621a(charSequence2);
        }
        CharSequence charSequence3 = this.f7522i;
        if (charSequence3 != null) {
            wearInlineSlider.m4623c(charSequence3);
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: f */
    protected final Object mo1471f(TypedArray typedArray, int i) {
        return Float.valueOf(typedArray.getFloat(i, 0.0f));
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: h */
    protected final void mo1473h(Object obj) {
        if (obj == null) {
            obj = Float.valueOf(this.f7515b);
        }
        m4617k(m1516p(((Float) obj).floatValue()), true);
    }

    /* JADX INFO: renamed from: k */
    public final void m4617k(float f, boolean z) {
        if (this.f7514a != f) {
            this.f7514a = f;
            if (m1510aa() && f != m1516p(Float.NaN)) {
                SharedPreferences.Editor editorM1776b = this.f1583k.m1776b();
                editorM1776b.putFloat(this.f1590r, f);
                super.m1503U(editorM1776b);
            }
            if (z) {
                mo1469d();
            }
        }
    }
}
