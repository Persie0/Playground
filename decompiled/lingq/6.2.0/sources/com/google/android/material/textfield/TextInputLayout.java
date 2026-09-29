package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R$color;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import p000.AbstractC0853cn;
import p000.AbstractC3184kh;
import p000.C2893cq;
import p000.C3048gr;
import p000.C3386nv;
import p000.C3479q;
import p000.RunnableC3468pp;
import p000.bna;
import p000.c51;
import p000.ck6;
import p000.cw9;
import p000.do7;
import p000.ds5;
import p000.dta;
import p000.dw6;
import p000.dw9;
import p000.dy9;
import p000.ew9;
import p000.fg2;
import p000.fn1;
import p000.fs5;
import p000.gg0;
import p000.hc2;
import p000.hg0;
import p000.hr5;
import p000.hs2;
import p000.i9d;
import p000.ic0;
import p000.is2;
import p000.jfd;
import p000.mt6;
import p000.oaa;
import p000.omd;
import p000.pb1;
import p000.pm0;
import p000.q39;
import p000.qs5;
import p000.r39;
import p000.r46;
import p000.sq5;
import p000.to2;
import p000.ug9;
import p000.uh9;
import p000.uk9;
import p000.ur5;
import p000.us9;
import p000.ux1;
import p000.vi8;
import p000.vx1;
import p000.wl2;
import p000.wq1;
import p000.wt9;
import p000.xwc;
import p000.y34;
import p000.ya1;
import p000.ym2;
import p000.zy2;

/* JADX INFO: loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: Y0 */
    public static final int f13236Y0 = R$style.Widget_Design_TextInputLayout;

    /* JADX INFO: renamed from: Z0 */
    public static final int[][] f13237Z0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* JADX INFO: renamed from: A0 */
    public final LinkedHashSet f13238A0;

    /* JADX INFO: renamed from: B0 */
    public ColorDrawable f13239B0;

    /* JADX INFO: renamed from: C0 */
    public int f13240C0;

    /* JADX INFO: renamed from: D0 */
    public Drawable f13241D0;

    /* JADX INFO: renamed from: E0 */
    public ColorStateList f13242E0;

    /* JADX INFO: renamed from: F0 */
    public ColorStateList f13243F0;

    /* JADX INFO: renamed from: G0 */
    public int f13244G0;

    /* JADX INFO: renamed from: H */
    public int f13245H;

    /* JADX INFO: renamed from: H0 */
    public int f13246H0;

    /* JADX INFO: renamed from: I */
    public boolean f13247I;

    /* JADX INFO: renamed from: I0 */
    public int f13248I0;

    /* JADX INFO: renamed from: J */
    public ew9 f13249J;

    /* JADX INFO: renamed from: J0 */
    public ColorStateList f13250J0;

    /* JADX INFO: renamed from: K */
    public C3048gr f13251K;

    /* JADX INFO: renamed from: K0 */
    public int f13252K0;

    /* JADX INFO: renamed from: L */
    public int f13253L;

    /* JADX INFO: renamed from: L0 */
    public int f13254L0;

    /* JADX INFO: renamed from: M */
    public int f13255M;

    /* JADX INFO: renamed from: M0 */
    public int f13256M0;

    /* JADX INFO: renamed from: N */
    public CharSequence f13257N;

    /* JADX INFO: renamed from: N0 */
    public int f13258N0;

    /* JADX INFO: renamed from: O */
    public boolean f13259O;

    /* JADX INFO: renamed from: O0 */
    public int f13260O0;

    /* JADX INFO: renamed from: P */
    public C3048gr f13261P;

    /* JADX INFO: renamed from: P0 */
    public int f13262P0;

    /* JADX INFO: renamed from: Q */
    public ColorStateList f13263Q;

    /* JADX INFO: renamed from: Q0 */
    public boolean f13264Q0;

    /* JADX INFO: renamed from: R */
    public int f13265R;

    /* JADX INFO: renamed from: R0 */
    public final c51 f13266R0;

    /* JADX INFO: renamed from: S */
    public zy2 f13267S;

    /* JADX INFO: renamed from: S0 */
    public boolean f13268S0;

    /* JADX INFO: renamed from: T */
    public zy2 f13269T;

    /* JADX INFO: renamed from: T0 */
    public boolean f13270T0;

    /* JADX INFO: renamed from: U */
    public ColorStateList f13271U;

    /* JADX INFO: renamed from: U0 */
    public ValueAnimator f13272U0;

    /* JADX INFO: renamed from: V */
    public ColorStateList f13273V;

    /* JADX INFO: renamed from: V0 */
    public boolean f13274V0;

    /* JADX INFO: renamed from: W */
    public ColorStateList f13275W;

    /* JADX INFO: renamed from: W0 */
    public boolean f13276W0;

    /* JADX INFO: renamed from: X0 */
    public boolean f13277X0;

    /* JADX INFO: renamed from: a */
    public final FrameLayout f13278a;

    /* JADX INFO: renamed from: a0 */
    public ColorStateList f13279a0;

    /* JADX INFO: renamed from: b */
    public final ug9 f13280b;

    /* JADX INFO: renamed from: b0 */
    public boolean f13281b0;

    /* JADX INFO: renamed from: c */
    public final is2 f13282c;

    /* JADX INFO: renamed from: c0 */
    public CharSequence f13283c0;

    /* JADX INFO: renamed from: d */
    public final int f13284d;

    /* JADX INFO: renamed from: d0 */
    public boolean f13285d0;

    /* JADX INFO: renamed from: e */
    public EditText f13286e;

    /* JADX INFO: renamed from: e0 */
    public fs5 f13287e0;

    /* JADX INFO: renamed from: f */
    public CharSequence f13288f;

    /* JADX INFO: renamed from: f0 */
    public fs5 f13289f0;

    /* JADX INFO: renamed from: g */
    public int f13290g;

    /* JADX INFO: renamed from: g0 */
    public StateListDrawable f13291g0;

    /* JADX INFO: renamed from: h */
    public int f13292h;

    /* JADX INFO: renamed from: h0 */
    public boolean f13293h0;

    /* JADX INFO: renamed from: i */
    public int f13294i;

    /* JADX INFO: renamed from: i0 */
    public fs5 f13295i0;

    /* JADX INFO: renamed from: j */
    public int f13296j;

    /* JADX INFO: renamed from: j0 */
    public fs5 f13297j0;

    /* JADX INFO: renamed from: k */
    public final y34 f13298k;

    /* JADX INFO: renamed from: k0 */
    public r39 f13299k0;

    /* JADX INFO: renamed from: l */
    public boolean f13300l;

    /* JADX INFO: renamed from: l0 */
    public boolean f13301l0;

    /* JADX INFO: renamed from: m0 */
    public final int f13302m0;

    /* JADX INFO: renamed from: n0 */
    public int f13303n0;

    /* JADX INFO: renamed from: o0 */
    public int f13304o0;

    /* JADX INFO: renamed from: p0 */
    public int f13305p0;

    /* JADX INFO: renamed from: q0 */
    public int f13306q0;

    /* JADX INFO: renamed from: r0 */
    public int f13307r0;

    /* JADX INFO: renamed from: s0 */
    public int f13308s0;

    /* JADX INFO: renamed from: t0 */
    public int f13309t0;

    /* JADX INFO: renamed from: u0 */
    public final Rect f13310u0;

    /* JADX INFO: renamed from: v0 */
    public final Rect f13311v0;

    /* JADX INFO: renamed from: w0 */
    public final RectF f13312w0;

    /* JADX INFO: renamed from: x0 */
    public Typeface f13313x0;

    /* JADX INFO: renamed from: y0 */
    public ColorDrawable f13314y0;

    /* JADX INFO: renamed from: z0 */
    public int f13315z0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1073a();

        /* JADX INFO: renamed from: c */
        public CharSequence f13316c;

        /* JADX INFO: renamed from: d */
        public boolean f13317d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f13316c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f13317d = parcel.readInt() == 1;
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f13316c) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f13316c, parcel, i);
            parcel.writeInt(this.f13317d ? 1 : 0);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        int i2 = f13236Y0;
        super(qs5.m20141b(context, attributeSet, i, i2), attributeSet, i);
        this.f13290g = -1;
        this.f13292h = -1;
        this.f13294i = -1;
        this.f13296j = -1;
        this.f13298k = new y34(this);
        this.f13249J = new fg2(19);
        this.f13310u0 = new Rect();
        this.f13311v0 = new Rect();
        this.f13312w0 = new RectF();
        this.f13238A0 = new LinkedHashSet();
        c51 c51Var = new c51(this);
        this.f13266R0 = c51Var;
        this.f13277X0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f13278a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC0853cn.f10296a;
        c51Var.f9526R = linearInterpolator;
        c51Var.m4323j(false);
        c51Var.f9525Q = linearInterpolator;
        c51Var.m4323j(false);
        if (c51Var.f9547g != 8388659) {
            c51Var.f9547g = 8388659;
            c51Var.m4323j(false);
        }
        sq5 sq5VarM10752e = dy9.m10752e(context2, attributeSet, R$styleable.TextInputLayout, i, i2, R$styleable.TextInputLayout_counterTextAppearance, R$styleable.TextInputLayout_counterOverflowTextAppearance, R$styleable.TextInputLayout_errorTextAppearance, R$styleable.TextInputLayout_helperTextTextAppearance, R$styleable.TextInputLayout_hintTextAppearance);
        ug9 ug9Var = new ug9(this, sq5VarM10752e);
        this.f13280b = ug9Var;
        int i3 = R$styleable.TextInputLayout_hintEnabled;
        TypedArray typedArray = (TypedArray) sq5VarM10752e.f61249c;
        this.f13281b0 = typedArray.getBoolean(i3, true);
        setHint(typedArray.getText(R$styleable.TextInputLayout_android_hint));
        this.f13270T0 = typedArray.getBoolean(R$styleable.TextInputLayout_hintAnimationEnabled, true);
        this.f13268S0 = typedArray.getBoolean(R$styleable.TextInputLayout_expandedHintEnabled, true);
        if (typedArray.hasValue(R$styleable.TextInputLayout_android_minEms)) {
            setMinEms(typedArray.getInt(R$styleable.TextInputLayout_android_minEms, -1));
        } else if (typedArray.hasValue(R$styleable.TextInputLayout_android_minWidth)) {
            setMinWidth(typedArray.getDimensionPixelSize(R$styleable.TextInputLayout_android_minWidth, -1));
        }
        if (typedArray.hasValue(R$styleable.TextInputLayout_android_maxEms)) {
            setMaxEms(typedArray.getInt(R$styleable.TextInputLayout_android_maxEms, -1));
        } else if (typedArray.hasValue(R$styleable.TextInputLayout_android_maxWidth)) {
            setMaxWidth(typedArray.getDimensionPixelSize(R$styleable.TextInputLayout_android_maxWidth, -1));
        }
        this.f13299k0 = r39.m20281h(context2, attributeSet, i, i2).m19627a();
        this.f13302m0 = context2.getResources().getDimensionPixelOffset(R$dimen.mtrl_textinput_box_label_cutout_padding);
        this.f13304o0 = typedArray.getDimensionPixelOffset(R$styleable.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.f13284d = getResources().getDimensionPixelSize(R$dimen.m3_multiline_hint_filled_text_extra_space);
        this.f13306q0 = typedArray.getDimensionPixelSize(R$styleable.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(R$dimen.mtrl_textinput_box_stroke_width_default));
        this.f13307r0 = typedArray.getDimensionPixelSize(R$styleable.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(R$dimen.mtrl_textinput_box_stroke_width_focused));
        this.f13305p0 = this.f13306q0;
        float dimension = typedArray.getDimension(R$styleable.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float dimension2 = typedArray.getDimension(R$styleable.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float dimension3 = typedArray.getDimension(R$styleable.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float dimension4 = typedArray.getDimension(R$styleable.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        q39 q39VarM20285l = this.f13299k0.m20285l();
        if (dimension >= 0.0f) {
            q39VarM20285l.f57200e = new C3479q(dimension);
        }
        if (dimension2 >= 0.0f) {
            q39VarM20285l.f57201f = new C3479q(dimension2);
        }
        if (dimension3 >= 0.0f) {
            q39VarM20285l.f57202g = new C3479q(dimension3);
        }
        if (dimension4 >= 0.0f) {
            q39VarM20285l.f57203h = new C3479q(dimension4);
        }
        this.f13299k0 = q39VarM20285l.m19627a();
        ColorStateList colorStateListM19053w = pb1.m19053w(context2, sq5VarM10752e, R$styleable.TextInputLayout_boxBackgroundColor);
        if (colorStateListM19053w != null) {
            int defaultColor = colorStateListM19053w.getDefaultColor();
            this.f13252K0 = defaultColor;
            this.f13309t0 = defaultColor;
            if (colorStateListM19053w.isStateful()) {
                this.f13254L0 = colorStateListM19053w.getColorForState(new int[]{-16842910}, -1);
                this.f13256M0 = colorStateListM19053w.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f13258N0 = colorStateListM19053w.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f13256M0 = this.f13252K0;
                ColorStateList colorStateListM10540p = do7.m10540p(context2, R$color.mtrl_filled_background_color);
                this.f13254L0 = colorStateListM10540p.getColorForState(new int[]{-16842910}, -1);
                this.f13258N0 = colorStateListM10540p.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f13309t0 = 0;
            this.f13252K0 = 0;
            this.f13254L0 = 0;
            this.f13256M0 = 0;
            this.f13258N0 = 0;
        }
        if (typedArray.hasValue(R$styleable.TextInputLayout_android_textColorHint)) {
            ColorStateList colorStateListM21567i = sq5VarM10752e.m21567i(R$styleable.TextInputLayout_android_textColorHint);
            this.f13243F0 = colorStateListM21567i;
            this.f13242E0 = colorStateListM21567i;
        }
        ColorStateList colorStateListM19053w2 = pb1.m19053w(context2, sq5VarM10752e, R$styleable.TextInputLayout_boxStrokeColor);
        this.f13248I0 = typedArray.getColor(R$styleable.TextInputLayout_boxStrokeColor, 0);
        this.f13244G0 = context2.getColor(R$color.mtrl_textinput_default_box_stroke_color);
        this.f13260O0 = context2.getColor(R$color.mtrl_textinput_disabled_color);
        this.f13246H0 = context2.getColor(R$color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListM19053w2 != null) {
            setBoxStrokeColorStateList(colorStateListM19053w2);
        }
        if (typedArray.hasValue(R$styleable.TextInputLayout_boxStrokeErrorColor)) {
            setBoxStrokeErrorColor(pb1.m19053w(context2, sq5VarM10752e, R$styleable.TextInputLayout_boxStrokeErrorColor));
        }
        if (typedArray.getResourceId(R$styleable.TextInputLayout_hintTextAppearance, -1) != -1) {
            setHintTextAppearance(typedArray.getResourceId(R$styleable.TextInputLayout_hintTextAppearance, 0));
        }
        this.f13275W = sq5VarM10752e.m21567i(R$styleable.TextInputLayout_cursorColor);
        this.f13279a0 = sq5VarM10752e.m21567i(R$styleable.TextInputLayout_cursorErrorColor);
        int resourceId = typedArray.getResourceId(R$styleable.TextInputLayout_errorTextAppearance, 0);
        CharSequence text = typedArray.getText(R$styleable.TextInputLayout_errorContentDescription);
        int i4 = typedArray.getInt(R$styleable.TextInputLayout_errorAccessibilityLiveRegion, 1);
        boolean z = typedArray.getBoolean(R$styleable.TextInputLayout_errorEnabled, false);
        int resourceId2 = typedArray.getResourceId(R$styleable.TextInputLayout_helperTextTextAppearance, 0);
        boolean z2 = typedArray.getBoolean(R$styleable.TextInputLayout_helperTextEnabled, false);
        CharSequence text2 = typedArray.getText(R$styleable.TextInputLayout_helperText);
        int resourceId3 = typedArray.getResourceId(R$styleable.TextInputLayout_placeholderTextAppearance, 0);
        CharSequence text3 = typedArray.getText(R$styleable.TextInputLayout_placeholderText);
        boolean z3 = typedArray.getBoolean(R$styleable.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(typedArray.getInt(R$styleable.TextInputLayout_counterMaxLength, -1));
        this.f13255M = typedArray.getResourceId(R$styleable.TextInputLayout_counterTextAppearance, 0);
        this.f13253L = typedArray.getResourceId(R$styleable.TextInputLayout_counterOverflowTextAppearance, 0);
        setBoxBackgroundMode(typedArray.getInt(R$styleable.TextInputLayout_boxBackgroundMode, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i4);
        setCounterOverflowTextAppearance(this.f13253L);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f13255M);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArray.hasValue(R$styleable.TextInputLayout_errorTextColor)) {
            setErrorTextColor(sq5VarM10752e.m21567i(R$styleable.TextInputLayout_errorTextColor));
        }
        if (typedArray.hasValue(R$styleable.TextInputLayout_helperTextTextColor)) {
            setHelperTextColor(sq5VarM10752e.m21567i(R$styleable.TextInputLayout_helperTextTextColor));
        }
        if (typedArray.hasValue(R$styleable.TextInputLayout_hintTextColor)) {
            setHintTextColor(sq5VarM10752e.m21567i(R$styleable.TextInputLayout_hintTextColor));
        }
        if (typedArray.hasValue(R$styleable.TextInputLayout_counterTextColor)) {
            setCounterTextColor(sq5VarM10752e.m21567i(R$styleable.TextInputLayout_counterTextColor));
        }
        if (typedArray.hasValue(R$styleable.TextInputLayout_counterOverflowTextColor)) {
            setCounterOverflowTextColor(sq5VarM10752e.m21567i(R$styleable.TextInputLayout_counterOverflowTextColor));
        }
        if (typedArray.hasValue(R$styleable.TextInputLayout_placeholderTextColor)) {
            setPlaceholderTextColor(sq5VarM10752e.m21567i(R$styleable.TextInputLayout_placeholderTextColor));
        }
        is2 is2Var = new is2(this, sq5VarM10752e);
        this.f13282c = is2Var;
        boolean z4 = typedArray.getBoolean(R$styleable.TextInputLayout_android_enabled, true);
        setHintMaxLines(typedArray.getInt(R$styleable.TextInputLayout_hintMaxLines, 1));
        sq5VarM10752e.m21582y();
        setImportantForAccessibility(2);
        setImportantForAutofill(1);
        frameLayout.addView(ug9Var);
        frameLayout.addView(is2Var);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f13286e;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.f13287e0;
        }
        EditText editText2 = this.f13286e;
        int iM18142c0 = omd.m18142c0(editText2.getContext(), xwc.m24752Y(editText2, R$attr.colorControlHighlight));
        int i = this.f13303n0;
        int[][] iArr = f13237Z0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            fs5 fs5Var = this.f13287e0;
            int i2 = this.f13309t0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{omd.m18130T(iM18142c0, 0.1f, i2), i2}), fs5Var, fs5Var);
        }
        Context context = getContext();
        fs5 fs5Var2 = this.f13287e0;
        int iM18142c1 = omd.m18142c0(context, xwc.m24751X(com.google.android.material.R$attr.colorSurface, context, "TextInputLayout"));
        fs5 fs5Var3 = new fs5(fs5Var2.m12067k());
        int iM18130T = omd.m18130T(iM18142c0, 0.1f, iM18142c1);
        fs5Var3.m12076t(new ColorStateList(iArr, new int[]{iM18130T, 0}));
        fs5Var3.setTint(iM18142c1);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iM18130T, iM18142c1});
        fs5 fs5Var4 = new fs5(fs5Var2.m12067k());
        fs5Var4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, fs5Var3, fs5Var4), fs5Var2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f13291g0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f13291g0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f13291g0.addState(new int[0], m6225h(false));
        }
        return this.f13291g0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f13289f0 == null) {
            this.f13289f0 = m6225h(true);
        }
        return this.f13289f0;
    }

    /* JADX INFO: renamed from: m */
    public static void m6217m(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m6217m((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f13286e != null) {
            C3386nv.m17626m("We already have an EditText, can only have one");
            return;
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f13286e = editText;
        int i = this.f13290g;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f13294i);
        }
        int i2 = this.f13292h;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.f13296j);
        }
        this.f13293h0 = false;
        m6228k();
        setTextInputAccessibilityDelegate(new dw9(this));
        Typeface typeface = this.f13286e.getTypeface();
        c51 c51Var = this.f13266R0;
        c51Var.m4327n(typeface);
        float textSize = this.f13286e.getTextSize();
        if (c51Var.f9549h != textSize) {
            c51Var.f9549h = textSize;
            c51Var.m4323j(false);
        }
        float letterSpacing = this.f13286e.getLetterSpacing();
        if (c51Var.f9532X != letterSpacing) {
            c51Var.f9532X = letterSpacing;
            c51Var.m4323j(false);
        }
        int gravity = this.f13286e.getGravity();
        int i3 = (gravity & (-113)) | 48;
        if (c51Var.f9547g != i3) {
            c51Var.f9547g = i3;
            c51Var.m4323j(false);
        }
        if (c51Var.f9545f != gravity) {
            c51Var.f9545f = gravity;
            c51Var.m4323j(false);
        }
        this.f13262P0 = editText.getMinimumHeight();
        this.f13286e.addTextChangedListener(new cw9(this, editText));
        if (this.f13242E0 == null) {
            this.f13242E0 = this.f13286e.getHintTextColors();
        }
        if (this.f13281b0) {
            if (TextUtils.isEmpty(this.f13283c0)) {
                CharSequence hint = this.f13286e.getHint();
                this.f13288f = hint;
                setHint(hint);
                this.f13286e.setHint((CharSequence) null);
            }
            this.f13285d0 = true;
        }
        m6234r();
        if (this.f13251K != null) {
            m6232p(this.f13286e.getText());
        }
        m6236t();
        this.f13298k.m24925b();
        this.f13280b.bringToFront();
        is2 is2Var = this.f13282c;
        is2Var.bringToFront();
        Iterator it = this.f13238A0.iterator();
        while (it.hasNext()) {
            ((hs2) it.next()).m13452a(this);
        }
        is2Var.m14126n();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m6239w(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f13283c0)) {
            return;
        }
        this.f13283c0 = charSequence;
        c51 c51Var = this.f13266R0;
        if (charSequence == null || !TextUtils.equals(c51Var.f9510B, charSequence)) {
            c51Var.f9510B = charSequence;
            c51Var.f9511C = null;
            c51Var.m4323j(false);
        }
        if (this.f13264Q0) {
            return;
        }
        m6229l();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f13259O == z) {
            return;
        }
        C3048gr c3048gr = this.f13261P;
        if (!z) {
            if (c3048gr != null) {
                c3048gr.setVisibility(8);
            }
            this.f13261P = null;
        } else if (c3048gr != null) {
            this.f13278a.addView(c3048gr);
            this.f13261P.setVisibility(0);
        }
        this.f13259O = z;
    }

    /* JADX INFO: renamed from: a */
    public final void m6218a() {
        if (this.f13286e == null || this.f13303n0 != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.f13286e;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.f13266R0.m4320f() + this.f13284d), this.f13286e.getPaddingEnd(), getResources().getDimensionPixelSize(R$dimen.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.f13286e;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(R$dimen.material_filled_edittext_font_2_0_padding_top), this.f13286e.getPaddingEnd(), getResources().getDimensionPixelSize(R$dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (pb1.m19020H(getContext())) {
            EditText editText3 = this.f13286e;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(R$dimen.material_filled_edittext_font_1_3_padding_top), this.f13286e.getPaddingEnd(), getResources().getDimensionPixelSize(R$dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f13278a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        m6238v();
        setEditText((EditText) view);
    }

    /* JADX INFO: renamed from: b */
    public final void m6219b(float f) {
        c51 c51Var = this.f13266R0;
        if (c51Var.f9537b == f) {
            return;
        }
        if (this.f13272U0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f13272U0 = valueAnimator;
            valueAnimator.setInterpolator(r46.m20365H(getContext(), com.google.android.material.R$attr.motionEasingEmphasizedInterpolator, AbstractC0853cn.f10297b));
            this.f13272U0.setDuration(r46.m20364G(getContext(), com.google.android.material.R$attr.motionDurationMedium4, 167));
            this.f13272U0.addUpdateListener(new gg0(this, 4));
        }
        this.f13272U0.setFloatValues(c51Var.f9537b, f);
        this.f13272U0.start();
    }

    /* JADX INFO: renamed from: c */
    public final void m6220c() {
        int i;
        int i2;
        fs5 fs5Var = this.f13287e0;
        if (fs5Var == null) {
            return;
        }
        r39 r39VarM12067k = fs5Var.m12067k();
        r39 r39Var = this.f13299k0;
        if (r39VarM12067k != r39Var) {
            this.f13287e0.setShapeAppearanceModel(r39Var);
        }
        if (this.f13303n0 == 2 && (i = this.f13305p0) > -1 && (i2 = this.f13308s0) != 0) {
            fs5 fs5Var2 = this.f13287e0;
            fs5Var2.m12053A(i);
            fs5Var2.m12081y(ColorStateList.valueOf(i2));
        }
        int iM25014g = this.f13309t0;
        if (this.f13303n0 == 1) {
            Integer numM18120H = omd.m18120H(getContext(), com.google.android.material.R$attr.colorSurface);
            iM25014g = ya1.m25014g(this.f13309t0, numM18120H != null ? numM18120H.intValue() : 0);
        }
        this.f13309t0 = iM25014g;
        this.f13287e0.m12076t(ColorStateList.valueOf(iM25014g));
        fs5 fs5Var3 = this.f13295i0;
        if (fs5Var3 != null && this.f13297j0 != null) {
            if (this.f13305p0 > -1 && this.f13308s0 != 0) {
                fs5Var3.m12076t(this.f13286e.isFocused() ? ColorStateList.valueOf(this.f13244G0) : ColorStateList.valueOf(this.f13308s0));
                this.f13297j0.m12076t(ColorStateList.valueOf(this.f13308s0));
            }
            invalidate();
        }
        m6237u();
    }

    /* JADX INFO: renamed from: d */
    public final Rect m6221d(Rect rect) {
        if (this.f13286e == null) {
            uk9.m22770c();
            return null;
        }
        boolean z = getLayoutDirection() == 1;
        int i = rect.bottom;
        Rect rect2 = this.f13311v0;
        rect2.bottom = i;
        int i2 = this.f13303n0;
        if (i2 == 1) {
            rect2.left = m6226i(rect.left, z);
            rect2.top = rect.top + this.f13304o0;
            rect2.right = m6227j(rect.right, z);
            return rect2;
        }
        int i3 = rect.left;
        if (i2 != 2) {
            rect2.left = m6226i(i3, z);
            rect2.top = getPaddingTop();
            rect2.right = m6227j(rect.right, z);
            return rect2;
        }
        rect2.left = this.f13286e.getPaddingLeft() + i3;
        rect2.top = rect.top - m6222e();
        rect2.right = rect.right - this.f13286e.getPaddingRight();
        return rect2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f13286e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f13288f != null) {
            boolean z = this.f13285d0;
            this.f13285d0 = false;
            CharSequence hint = editText.getHint();
            this.f13286e.setHint(this.f13288f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f13286e.setHint(hint);
                this.f13285d0 = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f13278a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.f13286e) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f13276W0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f13276W0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        fs5 fs5Var;
        super.draw(canvas);
        boolean z = this.f13281b0;
        c51 c51Var = this.f13266R0;
        if (z) {
            TextPaint textPaint = c51Var.f9523O;
            RectF rectF = c51Var.f9543e;
            int iSave = canvas.save();
            if (c51Var.f9511C != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(c51Var.f9515G);
                float f = c51Var.f9562q;
                float f2 = c51Var.f9563r;
                float f3 = c51Var.f9514F;
                if (f3 != 1.0f) {
                    canvas.scale(f3, f3, f, f2);
                }
                if ((c51Var.f9544e0 > 1 || c51Var.f9546f0 > 1) && !c51Var.f9512D && c51Var.m4328o()) {
                    float lineStart = c51Var.f9562q - c51Var.f9534Z.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas.translate(lineStart, f2);
                    float f4 = alpha;
                    textPaint.setAlpha((int) (c51Var.f9540c0 * f4));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        textPaint.setShadowLayer(c51Var.f9516H, c51Var.f9517I, c51Var.f9518J, omd.m18163s(c51Var.f9519K, textPaint.getAlpha()));
                    }
                    c51Var.f9534Z.draw(canvas);
                    textPaint.setAlpha((int) (c51Var.f9538b0 * f4));
                    if (i >= 31) {
                        textPaint.setShadowLayer(c51Var.f9516H, c51Var.f9517I, c51Var.f9518J, omd.m18163s(c51Var.f9519K, textPaint.getAlpha()));
                    }
                    int lineBaseline = c51Var.f9534Z.getLineBaseline(0);
                    CharSequence charSequence = c51Var.f9542d0;
                    float f5 = lineBaseline;
                    canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f5, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(c51Var.f9516H, c51Var.f9517I, c51Var.f9518J, c51Var.f9519K);
                    }
                    String strTrim = c51Var.f9542d0.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = wq1.m24112h(1, strTrim, 0);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(c51Var.f9534Z.getLineEnd(0), str.length()), 0.0f, f5, (Paint) textPaint);
                    canvas = canvas;
                } else {
                    canvas.translate(f, f2);
                    c51Var.f9534Z.draw(canvas);
                }
                canvas.restoreToCount(iSave);
            }
        }
        if (this.f13297j0 == null || (fs5Var = this.f13295i0) == null) {
            return;
        }
        fs5Var.draw(canvas);
        if (this.f13286e.isFocused()) {
            Rect bounds = this.f13297j0.getBounds();
            Rect bounds2 = this.f13295i0.getBounds();
            float f6 = c51Var.f9537b;
            int iCenterX = bounds2.centerX();
            bounds.left = AbstractC0853cn.m4880c(iCenterX, f6, bounds2.left);
            bounds.right = AbstractC0853cn.m4880c(iCenterX, f6, bounds2.right);
            this.f13297j0.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        if (this.f13274V0) {
            return;
        }
        this.f13274V0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        c51 c51Var = this.f13266R0;
        if (c51Var != null) {
            c51Var.f9521M = drawableState;
            ColorStateList colorStateList2 = c51Var.f9555k;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = c51Var.f9553j) == null || !colorStateList.isStateful())) {
                z = false;
            } else {
                c51Var.m4323j(false);
                z = true;
            }
        } else {
            z = false;
        }
        if (this.f13286e != null) {
            m6239w(isLaidOut() && isEnabled(), false);
        }
        m6236t();
        m6242z();
        if (z) {
            invalidate();
        }
        this.f13274V0 = false;
    }

    /* JADX INFO: renamed from: e */
    public final int m6222e() {
        if (this.f13281b0) {
            int i = this.f13303n0;
            c51 c51Var = this.f13266R0;
            if (i == 0) {
                return (int) c51Var.m4320f();
            }
            if (i == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (c51Var.m4320f() / 2.0f);
                }
                float fM4320f = c51Var.m4320f();
                TextPaint textPaint = c51Var.f9524P;
                textPaint.setTextSize(c51Var.f9551i);
                textPaint.setTypeface(c51Var.f9564s);
                textPaint.setLetterSpacing(c51Var.f9531W);
                return Math.max(0, (int) (fM4320f - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: f */
    public final zy2 m6223f() {
        zy2 zy2Var = new zy2();
        zy2Var.f35331c = r46.m20364G(getContext(), com.google.android.material.R$attr.motionDurationShort2, 87);
        zy2Var.f35332d = r46.m20365H(getContext(), com.google.android.material.R$attr.motionEasingLinearInterpolator, AbstractC0853cn.f10296a);
        return zy2Var;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m6224g() {
        return this.f13281b0 && !TextUtils.isEmpty(this.f13283c0) && (this.f13287e0 instanceof vx1);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f13286e;
        if (editText == null) {
            return super.getBaseline();
        }
        return m6222e() + getPaddingTop() + editText.getBaseline();
    }

    public fs5 getBoxBackground() {
        int i = this.f13303n0;
        if (i == 1 || i == 2) {
            return this.f13287e0;
        }
        uk9.m22770c();
        return null;
    }

    public int getBoxBackgroundColor() {
        return this.f13309t0;
    }

    public int getBoxBackgroundMode() {
        return this.f13303n0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f13304o0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        r39 r39Var = this.f13299k0;
        RectF rectF = this.f13312w0;
        return layoutDirection == 1 ? r39Var.f58569h.mo11947a(rectF) : r39Var.f58568g.mo11947a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        r39 r39Var = this.f13299k0;
        RectF rectF = this.f13312w0;
        return layoutDirection == 1 ? r39Var.f58568g.mo11947a(rectF) : r39Var.f58569h.mo11947a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        r39 r39Var = this.f13299k0;
        RectF rectF = this.f13312w0;
        return layoutDirection == 1 ? r39Var.f58566e.mo11947a(rectF) : r39Var.f58567f.mo11947a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        r39 r39Var = this.f13299k0;
        RectF rectF = this.f13312w0;
        return layoutDirection == 1 ? r39Var.f58567f.mo11947a(rectF) : r39Var.f58566e.mo11947a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f13248I0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f13250J0;
    }

    public int getBoxStrokeWidth() {
        return this.f13306q0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f13307r0;
    }

    public int getCounterMaxLength() {
        return this.f13245H;
    }

    public CharSequence getCounterOverflowDescription() {
        C3048gr c3048gr;
        if (this.f13300l && this.f13247I && (c3048gr = this.f13251K) != null) {
            return c3048gr.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f13273V;
    }

    public ColorStateList getCounterTextColor() {
        return this.f13271U;
    }

    public ColorStateList getCursorColor() {
        return this.f13275W;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f13279a0;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f13242E0;
    }

    public EditText getEditText() {
        return this.f13286e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f13282c.f44498g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f13282c.f44498g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f13282c.f44482H;
    }

    public int getEndIconMode() {
        return this.f13282c.f44500i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f13282c.f44483I;
    }

    public CheckableImageButton getEndIconView() {
        return this.f13282c.f44498g;
    }

    public CharSequence getError() {
        y34 y34Var = this.f13298k;
        if (y34Var.f69230q) {
            return y34Var.f69229p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f13298k.f69233t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f13298k.f69232s;
    }

    public int getErrorCurrentTextColors() {
        C3048gr c3048gr = this.f13298k.f69231r;
        if (c3048gr != null) {
            return c3048gr.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f13282c.f44494c.getDrawable();
    }

    public CharSequence getHelperText() {
        y34 y34Var = this.f13298k;
        if (y34Var.f69237x) {
            return y34Var.f69236w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C3048gr c3048gr = this.f13298k.f69238y;
        if (c3048gr != null) {
            return c3048gr.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f13281b0) {
            return this.f13283c0;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f13266R0.m4320f();
    }

    public final int getHintCurrentCollapsedTextColor() {
        c51 c51Var = this.f13266R0;
        return c51Var.m4321g(c51Var.f9555k);
    }

    public int getHintMaxLines() {
        return this.f13266R0.f9544e0;
    }

    public ColorStateList getHintTextColor() {
        return this.f13243F0;
    }

    public ew9 getLengthCounter() {
        return this.f13249J;
    }

    public int getMaxEms() {
        return this.f13292h;
    }

    public int getMaxWidth() {
        return this.f13296j;
    }

    public int getMinEms() {
        return this.f13290g;
    }

    public int getMinWidth() {
        return this.f13294i;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f13282c.f44498g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f13282c.f44498g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f13259O) {
            return this.f13257N;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f13265R;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f13263Q;
    }

    public CharSequence getPrefixText() {
        return this.f13280b.f63900c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f13280b.f63899b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f13280b.f63899b;
    }

    public r39 getShapeAppearanceModel() {
        return this.f13299k0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f13280b.f63901d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f13280b.f63901d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f13280b.f63904g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f13280b.f63905h;
    }

    public CharSequence getSuffixText() {
        return this.f13282c.f44485K;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f13282c.f44486L.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f13282c.f44486L;
    }

    public Typeface getTypeface() {
        return this.f13313x0;
    }

    /* JADX INFO: renamed from: h */
    public final fs5 m6225h(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(R$dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f13286e;
        float popupElevation = editText instanceof hr5 ? ((hr5) editText).getPopupElevation() : getResources().getDimensionPixelOffset(R$dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R$dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        vi8 vi8Var = new vi8();
        vi8 vi8Var2 = new vi8();
        vi8 vi8Var3 = new vi8();
        vi8 vi8Var4 = new vi8();
        to2 to2Var = new to2();
        to2 to2Var2 = new to2();
        to2 to2Var3 = new to2();
        to2 to2Var4 = new to2();
        C3479q c3479q = new C3479q(f);
        C3479q c3479q2 = new C3479q(f);
        C3479q c3479q3 = new C3479q(dimensionPixelOffset);
        C3479q c3479q4 = new C3479q(dimensionPixelOffset);
        r39 r39Var = new r39();
        r39Var.f58562a = vi8Var;
        r39Var.f58563b = vi8Var2;
        r39Var.f58564c = vi8Var3;
        r39Var.f58565d = vi8Var4;
        r39Var.f58566e = c3479q;
        r39Var.f58567f = c3479q2;
        r39Var.f58568g = c3479q4;
        r39Var.f58569h = c3479q3;
        r39Var.f58570i = to2Var;
        r39Var.f58571j = to2Var2;
        r39Var.f58572k = to2Var3;
        r39Var.f58573l = to2Var4;
        EditText editText2 = this.f13286e;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof hr5 ? ((hr5) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = fs5.f39556a0;
            dropDownBackgroundTintList = ColorStateList.valueOf(omd.m18142c0(context, xwc.m24751X(com.google.android.material.R$attr.colorSurface, context, fs5.class.getSimpleName())));
        }
        fs5 fs5Var = new fs5();
        fs5Var.m12072p(context);
        fs5Var.m12076t(dropDownBackgroundTintList);
        fs5Var.m12075s(popupElevation);
        fs5Var.setShapeAppearanceModel(r39Var);
        ds5 ds5Var = fs5Var.f39578b;
        if (ds5Var.f36167h == null) {
            ds5Var.f36167h = new Rect();
        }
        fs5Var.f39578b.f36167h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        fs5Var.invalidateSelf();
        return fs5Var;
    }

    /* JADX INFO: renamed from: i */
    public final int m6226i(int i, boolean z) {
        int compoundPaddingLeft;
        if (z || getPrefixText() == null) {
            compoundPaddingLeft = (!z || getSuffixText() == null) ? this.f13286e.getCompoundPaddingLeft() : this.f13282c.m14115c();
        } else {
            compoundPaddingLeft = this.f13280b.m22728a();
        }
        return compoundPaddingLeft + i;
    }

    /* JADX INFO: renamed from: j */
    public final int m6227j(int i, boolean z) {
        int compoundPaddingRight;
        if (z || getSuffixText() == null) {
            compoundPaddingRight = (!z || getPrefixText() == null) ? this.f13286e.getCompoundPaddingRight() : this.f13280b.m22728a();
        } else {
            compoundPaddingRight = this.f13282c.m14115c();
        }
        return i - compoundPaddingRight;
    }

    /* JADX INFO: renamed from: k */
    public final void m6228k() {
        int i = this.f13303n0;
        if (i == 0) {
            this.f13287e0 = null;
            this.f13295i0 = null;
            this.f13297j0 = null;
        } else if (i == 1) {
            this.f13287e0 = new fs5(this.f13299k0);
            this.f13295i0 = new fs5();
            this.f13297j0 = new fs5();
        } else {
            if (i != 2) {
                C3386nv.m17626m(wq1.m24123s(new StringBuilder(), this.f13303n0, " is illegal; only @BoxBackgroundMode constants are supported."));
                return;
            }
            if (!this.f13281b0 || (this.f13287e0 instanceof vx1)) {
                this.f13287e0 = new fs5(this.f13299k0);
            } else {
                r39 r39Var = this.f13299k0;
                int i2 = vx1.f66040d0;
                if (r39Var == null) {
                    r39Var = new r39();
                }
                ux1 ux1Var = new ux1(r39Var, new RectF());
                vx1 vx1Var = new vx1(ux1Var);
                vx1Var.f66041c0 = ux1Var;
                this.f13287e0 = vx1Var;
            }
            this.f13295i0 = null;
            this.f13297j0 = null;
        }
        m6237u();
        m6242z();
        if (this.f13303n0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f13304o0 = getResources().getDimensionPixelSize(R$dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (pb1.m19020H(getContext())) {
                this.f13304o0 = getResources().getDimensionPixelSize(R$dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        m6218a();
        if (this.f13303n0 != 0) {
            m6238v();
        }
        EditText editText = this.f13286e;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f13303n0;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cb  */
    /* JADX INFO: renamed from: l */
    public final void m6229l() {
        float f;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        float lineWidth;
        int i;
        float f5;
        int i2;
        if (m6224g()) {
            int width = this.f13286e.getWidth();
            int gravity = this.f13286e.getGravity();
            c51 c51Var = this.f13266R0;
            boolean zM4317c = c51Var.m4317c(c51Var.f9510B);
            c51Var.f9512D = zM4317c;
            Rect rect = c51Var.f9541d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zM4317c) {
                        i2 = rect.left;
                        f3 = i2;
                    } else {
                        f = rect.right;
                        f2 = c51Var.f9536a0;
                    }
                } else if (zM4317c) {
                    f = rect.right;
                    f2 = c51Var.f9536a0;
                } else {
                    i2 = rect.left;
                    f3 = i2;
                }
                float fMax = Math.max(f3, rect.left);
                rectF = this.f13312w0;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (c51Var.f9536a0 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c51Var.f9512D) {
                        f5 = c51Var.f9536a0;
                        f4 = f5 + fMax;
                    } else {
                        i = rect.right;
                        f4 = i;
                    }
                } else if (c51Var.f9512D) {
                    i = rect.right;
                    f4 = i;
                } else {
                    f5 = c51Var.f9536a0;
                    f4 = f5 + fMax;
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = c51Var.m4320f() + rect.top;
                if (c51Var.f9534Z != null && !c51Var.m4328o()) {
                    StaticLayout staticLayout = c51Var.f9534Z;
                    lineWidth = (c51Var.f9551i / c51Var.f9549h) * staticLayout.getLineWidth(staticLayout.getLineCount() - 1);
                    if (c51Var.f9512D) {
                        rectF.left = rectF.right - lineWidth;
                    } else {
                        rectF.right = rectF.left + lineWidth;
                    }
                }
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f6 = rectF.left;
                float f7 = this.f13302m0;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f13305p0);
                rectF.top = 0.0f;
                vx1 vx1Var = (vx1) this.f13287e0;
                vx1Var.getClass();
                vx1Var.m23564F(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f = width / 2.0f;
            f2 = c51Var.f9536a0 / 2.0f;
            f3 = f - f2;
            float fMax2 = Math.max(f3, rect.left);
            rectF = this.f13312w0;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f4 = (width / 2.0f) + (c51Var.f9536a0 / 2.0f);
            } else {
                f4 = (width / 2.0f) + (c51Var.f9536a0 / 2.0f);
            }
            rectF.right = Math.min(f4, rect.right);
            rectF.bottom = c51Var.m4320f() + rect.top;
            if (c51Var.f9534Z != null) {
                StaticLayout staticLayout2 = c51Var.f9534Z;
                lineWidth = (c51Var.f9551i / c51Var.f9549h) * staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1);
                if (c51Var.f9512D) {
                    rectF.left = rectF.right - lineWidth;
                } else {
                    rectF.right = rectF.left + lineWidth;
                }
            }
            if (rectF.width() > 0.0f) {
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m6230n(C3048gr c3048gr, int i) {
        try {
            c3048gr.setTextAppearance(i);
            if (c3048gr.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c3048gr.setTextAppearance(androidx.appcompat.R$style.TextAppearance_AppCompat_Caption);
        c3048gr.setTextColor(getContext().getColor(R$color.design_error));
    }

    /* JADX INFO: renamed from: o */
    public final boolean m6231o() {
        y34 y34Var = this.f13298k;
        return (y34Var.f69228o != 1 || y34Var.f69231r == null || TextUtils.isEmpty(y34Var.f69229p)) ? false : true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f13266R0.m4322i(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        is2 is2Var = this.f13282c;
        is2Var.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.f13277X0 = false;
        if (this.f13286e != null && this.f13286e.getMeasuredHeight() < (iMax = Math.max(is2Var.getMeasuredHeight(), this.f13280b.getMeasuredHeight()))) {
            this.f13286e.setMinimumHeight(iMax);
            z = true;
        }
        boolean zM6235s = m6235s();
        if (z || zM6235s) {
            this.f13286e.post(new mt6(this, 13));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float fDescent;
        int i5;
        int compoundPaddingTop;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f13286e;
        if (editText != null) {
            ThreadLocal threadLocal = hc2.f42160a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f13310u0;
            rect.set(0, 0, width, height);
            hc2.m13192b(this, editText, rect);
            fs5 fs5Var = this.f13295i0;
            if (fs5Var != null) {
                int i6 = rect.bottom;
                fs5Var.setBounds(rect.left, i6 - this.f13306q0, rect.right, i6);
            }
            fs5 fs5Var2 = this.f13297j0;
            if (fs5Var2 != null) {
                int i7 = rect.bottom;
                fs5Var2.setBounds(rect.left, i7 - this.f13307r0, rect.right, i7);
            }
            if (this.f13281b0) {
                float textSize = this.f13286e.getTextSize();
                c51 c51Var = this.f13266R0;
                float f = c51Var.f9549h;
                TextPaint textPaint = c51Var.f9524P;
                if (f != textSize) {
                    c51Var.f9549h = textSize;
                    c51Var.m4323j(false);
                }
                int gravity = this.f13286e.getGravity();
                int i8 = (gravity & (-113)) | 48;
                if (c51Var.f9547g != i8) {
                    c51Var.f9547g = i8;
                    c51Var.m4323j(false);
                }
                if (c51Var.f9545f != gravity) {
                    c51Var.f9545f = gravity;
                    c51Var.m4323j(false);
                }
                Rect rectM6221d = m6221d(rect);
                int i9 = rectM6221d.left;
                int i10 = rectM6221d.top;
                int i11 = rectM6221d.right;
                int i12 = rectM6221d.bottom;
                Rect rect2 = c51Var.f9541d;
                if (rect2.left != i9 || rect2.top != i10 || rect2.right != i11 || rect2.bottom != i12) {
                    rect2.set(i9, i10, i11, i12);
                    c51Var.f9522N = true;
                }
                if (this.f13286e == null) {
                    uk9.m22770c();
                    return;
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(c51Var.f9549h);
                    textPaint.setTypeface(c51Var.f9567v);
                    textPaint.setLetterSpacing(c51Var.f9532X);
                    fDescent = -textPaint.ascent();
                } else {
                    textPaint.setTextSize(c51Var.f9549h);
                    textPaint.setTypeface(c51Var.f9567v);
                    textPaint.setLetterSpacing(c51Var.f9532X);
                    fDescent = c51Var.f9557l * (textPaint.descent() + (-textPaint.ascent()));
                }
                int compoundPaddingLeft = this.f13286e.getCompoundPaddingLeft() + rect.left;
                Rect rect3 = this.f13311v0;
                rect3.left = compoundPaddingLeft;
                if (this.f13303n0 != 1 || this.f13286e.getMinLines() > 1) {
                    if (this.f13303n0 != 0 || getHintMaxLines() == 1) {
                        i5 = 0;
                    } else {
                        textPaint.setTextSize(c51Var.f9549h);
                        textPaint.setTypeface(c51Var.f9567v);
                        textPaint.setLetterSpacing(c51Var.f9532X);
                        i5 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.f13286e.getCompoundPaddingTop() + rect.top) - i5;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (fDescent / 2.0f));
                }
                rect3.top = compoundPaddingTop;
                rect3.right = rect.right - this.f13286e.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f13303n0 != 1 || this.f13286e.getMinLines() > 1) ? rect.bottom - this.f13286e.getCompoundPaddingBottom() : (int) (rect3.top + fDescent);
                rect3.bottom = compoundPaddingBottom;
                int i13 = rect3.left;
                int i14 = rect3.top;
                int i15 = rect3.right;
                Rect rect4 = c51Var.f9539c;
                if (rect4.left != i13 || rect4.top != i14 || rect4.right != i15 || rect4.bottom != compoundPaddingBottom || true != c51Var.f9556k0) {
                    rect4.set(i13, i14, i15, compoundPaddingBottom);
                    c51Var.f9522N = true;
                    c51Var.f9556k0 = true;
                }
                c51Var.m4323j(false);
                if (!m6224g() || this.f13264Q0) {
                    return;
                }
                m6229l();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.f13277X0;
        is2 is2Var = this.f13282c;
        if (!z) {
            is2Var.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f13277X0 = true;
        }
        if (this.f13261P != null && (editText = this.f13286e) != null) {
            this.f13261P.setGravity(editText.getGravity());
            this.f13261P.setPadding(this.f13286e.getCompoundPaddingLeft(), this.f13286e.getCompoundPaddingTop(), this.f13286e.getCompoundPaddingRight(), this.f13286e.getCompoundPaddingBottom());
        }
        is2Var.m14126n();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.f13286e.getMeasuredWidth() - this.f13286e.getCompoundPaddingLeft()) - this.f13286e.getCompoundPaddingRight();
        c51 c51Var = this.f13266R0;
        TextPaint textPaint = c51Var.f9524P;
        textPaint.setTextSize(c51Var.f9551i);
        textPaint.setTypeface(c51Var.f9564s);
        textPaint.setLetterSpacing(c51Var.f9531W);
        float f2 = measuredWidth;
        c51Var.f9552i0 = c51Var.m4319e((c51Var.f9551i / c51Var.f9549h) * f2, c51Var.f9546f0, textPaint, c51Var.f9510B, c51Var.f9512D).getHeight();
        textPaint.setTextSize(c51Var.f9549h);
        textPaint.setTypeface(c51Var.f9567v);
        textPaint.setLetterSpacing(c51Var.f9532X);
        c51Var.f9554j0 = c51Var.m4319e(f2, c51Var.f9544e0, textPaint, c51Var.f9510B, c51Var.f9512D).getHeight();
        EditText editText2 = this.f13286e;
        ThreadLocal threadLocal = hc2.f42160a;
        int width = editText2.getWidth();
        int height = editText2.getHeight();
        Rect rect = this.f13310u0;
        rect.set(0, 0, width, height);
        hc2.m13192b(this, editText2, rect);
        Rect rectM6221d = m6221d(rect);
        int i3 = rectM6221d.left;
        int i4 = rectM6221d.top;
        int i5 = rectM6221d.right;
        int i6 = rectM6221d.bottom;
        Rect rect2 = c51Var.f9541d;
        if (rect2.left != i3 || rect2.top != i4 || rect2.right != i5 || rect2.bottom != i6) {
            rect2.set(i3, i4, i5, i6);
            c51Var.f9522N = true;
        }
        m6238v();
        m6218a();
        if (this.f13286e == null) {
            return;
        }
        int i7 = c51Var.f9554j0;
        if (i7 != -1) {
            f = i7;
        } else {
            TextPaint textPaint2 = c51Var.f9524P;
            textPaint2.setTextSize(c51Var.f9549h);
            textPaint2.setTypeface(c51Var.f9567v);
            textPaint2.setLetterSpacing(c51Var.f9532X);
            f = -textPaint2.ascent();
        }
        float height2 = 0.0f;
        if (this.f13257N != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.f13261P.getPaint());
            textPaint3.setTextSize(this.f13261P.getTextSize());
            textPaint3.setTypeface(this.f13261P.getTypeface());
            textPaint3.setLetterSpacing(this.f13261P.getLetterSpacing());
            try {
                uh9 uh9Var = new uh9(this.f13257N, textPaint3, measuredWidth);
                uh9Var.f63945k = getLayoutDirection() == 1;
                uh9Var.f63944j = true;
                float lineSpacingExtra = this.f13261P.getLineSpacingExtra();
                float lineSpacingMultiplier = this.f13261P.getLineSpacingMultiplier();
                uh9Var.f63941g = lineSpacingExtra;
                uh9Var.f63942h = lineSpacingMultiplier;
                uh9Var.f63947m = new dw6(this, 14);
                height2 = uh9Var.m22737a().getHeight() + (this.f13303n0 == 1 ? c51Var.m4320f() + this.f13304o0 + this.f13284d : 0.0f);
            } catch (StaticLayoutBuilderCompat$StaticLayoutBuilderCompatException e) {
                Log.e("TextInputLayout", e.getCause().getMessage(), e);
            }
        }
        float fMax = Math.max(f, height2);
        if (this.f13286e.getMeasuredHeight() < fMax) {
            this.f13286e.setMinimumHeight(Math.round(fMax));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f5563a);
        setError(savedState.f13316c);
        if (savedState.f13317d) {
            post(new RunnableC3468pp(this, 17));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.f13301l0) {
            fn1 fn1Var = this.f13299k0.f58566e;
            RectF rectF = this.f13312w0;
            float fMo11947a = fn1Var.mo11947a(rectF);
            float fMo11947a2 = this.f13299k0.f58567f.mo11947a(rectF);
            float fMo11947a3 = this.f13299k0.f58569h.mo11947a(rectF);
            float fMo11947a4 = this.f13299k0.f58568g.mo11947a(rectF);
            r39 r39Var = this.f13299k0;
            i9d i9dVar = r39Var.f58562a;
            i9d i9dVar2 = r39Var.f58563b;
            i9d i9dVar3 = r39Var.f58565d;
            i9d i9dVar4 = r39Var.f58564c;
            to2 to2Var = new to2();
            to2 to2Var2 = new to2();
            to2 to2Var3 = new to2();
            to2 to2Var4 = new to2();
            C3479q c3479q = new C3479q(fMo11947a2);
            C3479q c3479q2 = new C3479q(fMo11947a);
            C3479q c3479q3 = new C3479q(fMo11947a4);
            C3479q c3479q4 = new C3479q(fMo11947a3);
            r39 r39Var2 = new r39();
            r39Var2.f58562a = i9dVar2;
            r39Var2.f58563b = i9dVar;
            r39Var2.f58564c = i9dVar3;
            r39Var2.f58565d = i9dVar4;
            r39Var2.f58566e = c3479q;
            r39Var2.f58567f = c3479q2;
            r39Var2.f58568g = c3479q4;
            r39Var2.f58569h = c3479q3;
            r39Var2.f58570i = to2Var;
            r39Var2.f58571j = to2Var2;
            r39Var2.f58572k = to2Var3;
            r39Var2.f58573l = to2Var4;
            this.f13301l0 = z;
            setShapeAppearanceModel(r39Var2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (m6231o()) {
            savedState.f13316c = getError();
        }
        is2 is2Var = this.f13282c;
        savedState.f13317d = is2Var.f44500i != 0 && is2Var.f44498g.f13018d;
        return savedState;
    }

    /* JADX INFO: renamed from: p */
    public final void m6232p(Editable editable) {
        ((fg2) this.f13249J).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.f13247I;
        int i = this.f13245H;
        if (i == -1) {
            this.f13251K.setText(String.valueOf(length));
            this.f13251K.setContentDescription(null);
            this.f13247I = false;
        } else {
            this.f13247I = length > i;
            Context context = getContext();
            this.f13251K.setContentDescription(context.getString(this.f13247I ? R$string.character_counter_overflowed_content_description : R$string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f13245H)));
            if (z != this.f13247I) {
                m6233q();
            }
            String str = ic0.f43912b;
            ic0 ic0Var = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? ic0.f43915e : ic0.f43914d;
            C3048gr c3048gr = this.f13251K;
            String string = getContext().getString(R$string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f13245H));
            ic0Var.getClass();
            hg0 hg0Var = wt9.f67283a;
            c3048gr.setText(string != null ? ic0Var.m13761c(string).toString() : null);
        }
        if (this.f13286e == null || z == this.f13247I) {
            return;
        }
        m6239w(false, false);
        m6242z();
        m6236t();
    }

    /* JADX INFO: renamed from: q */
    public final void m6233q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C3048gr c3048gr = this.f13251K;
        if (c3048gr != null) {
            m6230n(c3048gr, this.f13247I ? this.f13253L : this.f13255M);
            if (!this.f13247I && (colorStateList2 = this.f13271U) != null) {
                this.f13251K.setTextColor(colorStateList2);
            }
            if (!this.f13247I || (colorStateList = this.f13273V) == null) {
                return;
            }
            this.f13251K.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: r */
    public final void m6234r() {
        ColorStateList colorStateList;
        ColorStateList colorStateListValueOf = this.f13275W;
        if (colorStateListValueOf == null) {
            Context context = getContext();
            TypedValue typedValueM24748U = xwc.m24748U(context.getTheme(), R$attr.colorControlActivated);
            if (typedValueM24748U != null) {
                int i = typedValueM24748U.resourceId;
                if (i != 0) {
                    colorStateListValueOf = do7.m10540p(context, i);
                } else {
                    int i2 = typedValueM24748U.data;
                    if (i2 != 0) {
                        colorStateListValueOf = ColorStateList.valueOf(i2);
                    } else {
                        colorStateListValueOf = null;
                    }
                }
            } else {
                colorStateListValueOf = null;
            }
        }
        EditText editText = this.f13286e;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = this.f13286e.getTextCursorDrawable().mutate();
        if ((m6231o() || (this.f13251K != null && this.f13247I)) && (colorStateList = this.f13279a0) != null) {
            colorStateListValueOf = colorStateList;
        }
        drawableMutate.setTintList(colorStateListValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0063  */
    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    /* JADX INFO: renamed from: s */
    public final boolean m6235s() {
        boolean z;
        if (this.f13286e == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            ug9 ug9Var = this.f13280b;
            if (ug9Var.getMeasuredWidth() > 0) {
                int iMax = Math.max(0, ug9Var.getMeasuredWidth() - this.f13286e.getPaddingLeft());
                if (this.f13314y0 == null || this.f13315z0 != iMax) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.f13314y0 = colorDrawable;
                    this.f13315z0 = iMax;
                    colorDrawable.setBounds(0, 0, iMax, 1);
                }
                Drawable[] compoundDrawablesRelative = this.f13286e.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.f13314y0;
                if (drawable != colorDrawable2) {
                    this.f13286e.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z = true;
                } else {
                    z = false;
                }
            } else if (this.f13314y0 != null) {
                Drawable[] compoundDrawablesRelative2 = this.f13286e.getCompoundDrawablesRelative();
                this.f13286e.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.f13314y0 = null;
                z = true;
            } else {
                z = false;
            }
        } else if (this.f13314y0 != null) {
            Drawable[] compoundDrawablesRelative3 = this.f13286e.getCompoundDrawablesRelative();
            this.f13286e.setCompoundDrawablesRelative(null, compoundDrawablesRelative3[1], compoundDrawablesRelative3[2], compoundDrawablesRelative3[3]);
            this.f13314y0 = null;
            z = true;
        } else {
            z = false;
        }
        is2 is2Var = this.f13282c;
        if ((is2Var.m14117e() || ((is2Var.f44500i != 0 && is2Var.m14116d()) || is2Var.f44485K != null)) && is2Var.getMeasuredWidth() > 0) {
            int measuredWidth = is2Var.f44486L.getMeasuredWidth() - this.f13286e.getPaddingRight();
            if (is2Var.m14117e()) {
                checkableImageButton = is2Var.f44494c;
            } else if (is2Var.f44500i != 0 && is2Var.m14116d()) {
                checkableImageButton = is2Var.f44498g;
            }
            if (checkableImageButton != null) {
                measuredWidth = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth;
            }
            int iMax2 = Math.max(0, measuredWidth);
            Drawable[] compoundDrawablesRelative4 = this.f13286e.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.f13239B0;
            if (colorDrawable3 != null && this.f13240C0 != iMax2) {
                this.f13240C0 = iMax2;
                colorDrawable3.setBounds(0, 0, iMax2, 1);
                this.f13286e.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f13239B0, compoundDrawablesRelative4[3]);
                return true;
            }
            if (colorDrawable3 == null) {
                ColorDrawable colorDrawable4 = new ColorDrawable();
                this.f13239B0 = colorDrawable4;
                this.f13240C0 = iMax2;
                colorDrawable4.setBounds(0, 0, iMax2, 1);
            }
            Drawable drawable2 = compoundDrawablesRelative4[2];
            ColorDrawable colorDrawable5 = this.f13239B0;
            if (drawable2 != colorDrawable5) {
                this.f13241D0 = drawable2;
                this.f13286e.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], colorDrawable5, compoundDrawablesRelative4[3]);
                return true;
            }
        } else if (this.f13239B0 != null) {
            Drawable[] compoundDrawablesRelative5 = this.f13286e.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative5[2] == this.f13239B0) {
                this.f13286e.setCompoundDrawablesRelative(compoundDrawablesRelative5[0], compoundDrawablesRelative5[1], this.f13241D0, compoundDrawablesRelative5[3]);
            } else {
                z2 = z;
            }
            this.f13239B0 = null;
            return z2;
        }
        return z;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f13309t0 != i) {
            this.f13309t0 = i;
            this.f13252K0 = i;
            this.f13256M0 = i;
            this.f13258N0 = i;
            m6220c();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f13252K0 = defaultColor;
        this.f13309t0 = defaultColor;
        this.f13254L0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f13256M0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f13258N0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m6220c();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f13303n0) {
            return;
        }
        this.f13303n0 = i;
        if (this.f13286e != null) {
            m6228k();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f13304o0 = i;
    }

    public void setBoxCornerFamily(int i) {
        q39 q39VarM20285l = this.f13299k0.m20285l();
        fn1 fn1Var = this.f13299k0.f58566e;
        q39VarM20285l.f57196a = AbstractC3184kh.m15216j(i);
        q39VarM20285l.f57200e = fn1Var;
        fn1 fn1Var2 = this.f13299k0.f58567f;
        q39VarM20285l.f57197b = AbstractC3184kh.m15216j(i);
        q39VarM20285l.f57201f = fn1Var2;
        fn1 fn1Var3 = this.f13299k0.f58569h;
        q39VarM20285l.f57199d = AbstractC3184kh.m15216j(i);
        q39VarM20285l.f57203h = fn1Var3;
        fn1 fn1Var4 = this.f13299k0.f58568g;
        q39VarM20285l.f57198c = AbstractC3184kh.m15216j(i);
        q39VarM20285l.f57202g = fn1Var4;
        this.f13299k0 = q39VarM20285l.m19627a();
        m6220c();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f13248I0 != i) {
            this.f13248I0 = i;
            m6242z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f13244G0 = colorStateList.getDefaultColor();
            this.f13260O0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f13246H0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f13248I0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f13248I0 != colorStateList.getDefaultColor()) {
            this.f13248I0 = colorStateList.getDefaultColor();
        }
        m6242z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f13250J0 != colorStateList) {
            this.f13250J0 = colorStateList;
            m6242z();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f13306q0 = i;
        m6242z();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f13307r0 = i;
        m6242z();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f13300l != z) {
            y34 y34Var = this.f13298k;
            if (z) {
                C3048gr c3048gr = new C3048gr(getContext(), null);
                this.f13251K = c3048gr;
                c3048gr.setId(R$id.textinput_counter);
                Typeface typeface = this.f13313x0;
                if (typeface != null) {
                    this.f13251K.setTypeface(typeface);
                }
                this.f13251K.setMaxLines(1);
                y34Var.m24924a(this.f13251K, 2);
                ((ViewGroup.MarginLayoutParams) this.f13251K.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R$dimen.mtrl_textinput_counter_margin_start));
                m6233q();
                if (this.f13251K != null) {
                    EditText editText = this.f13286e;
                    m6232p(editText != null ? editText.getText() : null);
                }
            } else {
                y34Var.m24930g(this.f13251K, 2);
                this.f13251K = null;
            }
            this.f13300l = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f13245H != i) {
            if (i > 0) {
                this.f13245H = i;
            } else {
                this.f13245H = -1;
            }
            if (!this.f13300l || this.f13251K == null) {
                return;
            }
            EditText editText = this.f13286e;
            m6232p(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f13253L != i) {
            this.f13253L = i;
            m6233q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f13273V != colorStateList) {
            this.f13273V = colorStateList;
            m6233q();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f13255M != i) {
            this.f13255M = i;
            m6233q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f13271U != colorStateList) {
            this.f13271U = colorStateList;
            m6233q();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f13275W != colorStateList) {
            this.f13275W = colorStateList;
            m6234r();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f13279a0 != colorStateList) {
            this.f13279a0 = colorStateList;
            if (m6231o() || (this.f13251K != null && this.f13247I)) {
                m6234r();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f13242E0 = colorStateList;
        this.f13243F0 = colorStateList;
        if (this.f13286e != null) {
            m6239w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m6217m(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f13282c.f44498g.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f13282c.f44498g.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        is2 is2Var = this.f13282c;
        is2Var.m14119g(i != 0 ? is2Var.getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        is2 is2Var = this.f13282c;
        Drawable drawableM3932U = i != 0 ? bna.m3932U(is2Var.getContext(), i) : null;
        TextInputLayout textInputLayout = is2Var.f44492a;
        CheckableImageButton checkableImageButton = is2Var.f44498g;
        checkableImageButton.setImageDrawable(drawableM3932U);
        if (drawableM3932U != null) {
            jfd.m14433a(textInputLayout, checkableImageButton, is2Var.f44502k, is2Var.f44503l);
            jfd.m14435c(textInputLayout, checkableImageButton, is2Var.f44502k);
        }
    }

    public void setEndIconMinSize(int i) {
        is2 is2Var = this.f13282c;
        if (i < 0) {
            is2Var.getClass();
            C3386nv.m17626m("endIconSize cannot be less than 0");
        } else if (i != is2Var.f44482H) {
            is2Var.f44482H = i;
            CheckableImageButton checkableImageButton = is2Var.f44498g;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = is2Var.f44494c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f13282c.m14120h(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        is2 is2Var = this.f13282c;
        CheckableImageButton checkableImageButton = is2Var.f44498g;
        View.OnLongClickListener onLongClickListener = is2Var.f44484J;
        checkableImageButton.setOnClickListener(onClickListener);
        jfd.m14436d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        is2 is2Var = this.f13282c;
        is2Var.f44484J = onLongClickListener;
        CheckableImageButton checkableImageButton = is2Var.f44498g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        jfd.m14436d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        is2 is2Var = this.f13282c;
        is2Var.f44483I = scaleType;
        is2Var.f44498g.setScaleType(scaleType);
        is2Var.f44494c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        is2 is2Var = this.f13282c;
        if (is2Var.f44502k != colorStateList) {
            is2Var.f44502k = colorStateList;
            jfd.m14433a(is2Var.f44492a, is2Var.f44498g, colorStateList, is2Var.f44503l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        is2 is2Var = this.f13282c;
        if (is2Var.f44503l != mode) {
            is2Var.f44503l = mode;
            jfd.m14433a(is2Var.f44492a, is2Var.f44498g, is2Var.f44502k, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.f13282c.m14121i(z);
    }

    public void setError(CharSequence charSequence) {
        y34 y34Var = this.f13298k;
        if (!y34Var.f69230q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            y34Var.m24929f();
            return;
        }
        y34Var.m24926c();
        y34Var.f69229p = charSequence;
        y34Var.f69231r.setText(charSequence);
        int i = y34Var.f69227n;
        if (i != 1) {
            y34Var.f69228o = 1;
        }
        y34Var.m24932i(i, y34Var.f69228o, y34Var.m24931h(y34Var.f69231r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        y34 y34Var = this.f13298k;
        y34Var.f69233t = i;
        C3048gr c3048gr = y34Var.f69231r;
        if (c3048gr != null) {
            c3048gr.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        y34 y34Var = this.f13298k;
        y34Var.f69232s = charSequence;
        C3048gr c3048gr = y34Var.f69231r;
        if (c3048gr != null) {
            c3048gr.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        y34 y34Var = this.f13298k;
        TextInputLayout textInputLayout = y34Var.f69221h;
        if (y34Var.f69230q == z) {
            return;
        }
        y34Var.m24926c();
        if (z) {
            C3048gr c3048gr = new C3048gr(y34Var.f69220g, null);
            y34Var.f69231r = c3048gr;
            c3048gr.setId(R$id.textinput_error);
            y34Var.f69231r.setTextAlignment(5);
            Typeface typeface = y34Var.f69213B;
            if (typeface != null) {
                y34Var.f69231r.setTypeface(typeface);
            }
            int i = y34Var.f69234u;
            y34Var.f69234u = i;
            C3048gr c3048gr2 = y34Var.f69231r;
            if (c3048gr2 != null) {
                y34Var.f69221h.m6230n(c3048gr2, i);
            }
            ColorStateList colorStateList = y34Var.f69235v;
            y34Var.f69235v = colorStateList;
            C3048gr c3048gr3 = y34Var.f69231r;
            if (c3048gr3 != null && colorStateList != null) {
                c3048gr3.setTextColor(colorStateList);
            }
            CharSequence charSequence = y34Var.f69232s;
            y34Var.f69232s = charSequence;
            C3048gr c3048gr4 = y34Var.f69231r;
            if (c3048gr4 != null) {
                c3048gr4.setContentDescription(charSequence);
            }
            int i2 = y34Var.f69233t;
            y34Var.f69233t = i2;
            C3048gr c3048gr5 = y34Var.f69231r;
            if (c3048gr5 != null) {
                c3048gr5.setAccessibilityLiveRegion(i2);
            }
            y34Var.f69231r.setVisibility(4);
            y34Var.m24924a(y34Var.f69231r, 0);
        } else {
            y34Var.m24929f();
            y34Var.m24930g(y34Var.f69231r, 0);
            y34Var.f69231r = null;
            textInputLayout.m6236t();
            textInputLayout.m6242z();
        }
        y34Var.f69230q = z;
    }

    public void setErrorIconDrawable(int i) {
        is2 is2Var = this.f13282c;
        is2Var.m14122j(i != 0 ? bna.m3932U(is2Var.getContext(), i) : null);
        jfd.m14435c(is2Var.f44492a, is2Var.f44494c, is2Var.f44495d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        is2 is2Var = this.f13282c;
        CheckableImageButton checkableImageButton = is2Var.f44494c;
        View.OnLongClickListener onLongClickListener = is2Var.f44497f;
        checkableImageButton.setOnClickListener(onClickListener);
        jfd.m14436d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        is2 is2Var = this.f13282c;
        is2Var.f44497f = onLongClickListener;
        CheckableImageButton checkableImageButton = is2Var.f44494c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        jfd.m14436d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        is2 is2Var = this.f13282c;
        if (is2Var.f44495d != colorStateList) {
            is2Var.f44495d = colorStateList;
            jfd.m14433a(is2Var.f44492a, is2Var.f44494c, colorStateList, is2Var.f44496e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        is2 is2Var = this.f13282c;
        if (is2Var.f44496e != mode) {
            is2Var.f44496e = mode;
            jfd.m14433a(is2Var.f44492a, is2Var.f44494c, is2Var.f44495d, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        y34 y34Var = this.f13298k;
        y34Var.f69234u = i;
        C3048gr c3048gr = y34Var.f69231r;
        if (c3048gr != null) {
            y34Var.f69221h.m6230n(c3048gr, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        y34 y34Var = this.f13298k;
        y34Var.f69235v = colorStateList;
        C3048gr c3048gr = y34Var.f69231r;
        if (c3048gr == null || colorStateList == null) {
            return;
        }
        c3048gr.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f13268S0 != z) {
            this.f13268S0 = z;
            m6239w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        y34 y34Var = this.f13298k;
        if (zIsEmpty) {
            if (y34Var.f69237x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!y34Var.f69237x) {
            setHelperTextEnabled(true);
        }
        y34Var.m24926c();
        y34Var.f69236w = charSequence;
        y34Var.f69238y.setText(charSequence);
        int i = y34Var.f69227n;
        if (i != 2) {
            y34Var.f69228o = 2;
        }
        y34Var.m24932i(i, y34Var.f69228o, y34Var.m24931h(y34Var.f69238y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        y34 y34Var = this.f13298k;
        y34Var.f69212A = colorStateList;
        C3048gr c3048gr = y34Var.f69238y;
        if (c3048gr == null || colorStateList == null) {
            return;
        }
        c3048gr.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        y34 y34Var = this.f13298k;
        TextInputLayout textInputLayout = y34Var.f69221h;
        if (y34Var.f69237x == z) {
            return;
        }
        y34Var.m24926c();
        if (z) {
            C3048gr c3048gr = new C3048gr(y34Var.f69220g, null);
            y34Var.f69238y = c3048gr;
            c3048gr.setId(R$id.textinput_helper_text);
            y34Var.f69238y.setTextAlignment(5);
            Typeface typeface = y34Var.f69213B;
            if (typeface != null) {
                y34Var.f69238y.setTypeface(typeface);
            }
            y34Var.f69238y.setVisibility(4);
            y34Var.f69238y.setImportantForAccessibility(2);
            int i = y34Var.f69239z;
            y34Var.f69239z = i;
            C3048gr c3048gr2 = y34Var.f69238y;
            if (c3048gr2 != null) {
                c3048gr2.setTextAppearance(i);
            }
            ColorStateList colorStateList = y34Var.f69212A;
            y34Var.f69212A = colorStateList;
            C3048gr c3048gr3 = y34Var.f69238y;
            if (c3048gr3 != null && colorStateList != null) {
                c3048gr3.setTextColor(colorStateList);
            }
            y34Var.m24924a(y34Var.f69238y, 1);
        } else {
            y34Var.m24926c();
            int i2 = y34Var.f69227n;
            if (i2 == 2) {
                y34Var.f69228o = 0;
            }
            y34Var.m24932i(i2, y34Var.f69228o, y34Var.m24931h(y34Var.f69238y, ""));
            y34Var.m24930g(y34Var.f69238y, 1);
            y34Var.f69238y = null;
            textInputLayout.m6236t();
            textInputLayout.m6242z();
        }
        y34Var.f69237x = z;
    }

    public void setHelperTextTextAppearance(int i) {
        y34 y34Var = this.f13298k;
        y34Var.f69239z = i;
        C3048gr c3048gr = y34Var.f69238y;
        if (c3048gr != null) {
            c3048gr.setTextAppearance(i);
        }
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f13270T0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f13281b0) {
            this.f13281b0 = z;
            if (z) {
                CharSequence hint = this.f13286e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f13283c0)) {
                        setHint(hint);
                    }
                    this.f13286e.setHint((CharSequence) null);
                }
                this.f13285d0 = true;
            } else {
                this.f13285d0 = false;
                if (!TextUtils.isEmpty(this.f13283c0) && TextUtils.isEmpty(this.f13286e.getHint())) {
                    this.f13286e.setHint(this.f13283c0);
                }
                setHintInternal(null);
            }
            if (this.f13286e != null) {
                m6238v();
            }
        }
    }

    public void setHintMaxLines(int i) {
        c51 c51Var = this.f13266R0;
        if (i != c51Var.f9546f0) {
            c51Var.f9546f0 = i;
            c51Var.m4323j(false);
        }
        if (i != c51Var.f9544e0) {
            c51Var.f9544e0 = i;
            c51Var.m4323j(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i) {
        c51 c51Var = this.f13266R0;
        TextInputLayout textInputLayout = c51Var.f9535a;
        us9 us9Var = new us9(textInputLayout.getContext(), i);
        ColorStateList colorStateList = us9Var.f64308k;
        if (colorStateList != null) {
            c51Var.f9555k = colorStateList;
        }
        float f = us9Var.f64309l;
        if (f != 0.0f) {
            c51Var.f9551i = f;
        }
        ColorStateList colorStateList2 = us9Var.f64298a;
        if (colorStateList2 != null) {
            c51Var.f9530V = colorStateList2;
        }
        c51Var.f9528T = us9Var.f64303f;
        c51Var.f9529U = us9Var.f64304g;
        c51Var.f9527S = us9Var.f64305h;
        c51Var.f9531W = us9Var.f64307j;
        pm0 pm0Var = c51Var.f9571z;
        if (pm0Var != null) {
            pm0Var.f56441c = true;
        }
        ck6 ck6Var = new ck6(c51Var, 6);
        us9Var.m22900a();
        c51Var.f9571z = new pm0(ck6Var, us9Var.f64313p);
        us9Var.m22901b(textInputLayout.getContext(), c51Var.f9571z);
        c51Var.m4323j(false);
        this.f13243F0 = c51Var.f9555k;
        if (this.f13286e != null) {
            m6239w(false, false);
            m6238v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f13243F0 != colorStateList) {
            if (this.f13242E0 == null) {
                c51 c51Var = this.f13266R0;
                if (c51Var.f9555k != colorStateList) {
                    c51Var.f9555k = colorStateList;
                    c51Var.m4323j(false);
                }
            }
            this.f13243F0 = colorStateList;
            if (this.f13286e != null) {
                m6239w(false, false);
            }
        }
    }

    public void setLengthCounter(ew9 ew9Var) {
        this.f13249J = ew9Var;
    }

    public void setMaxEms(int i) {
        this.f13292h = i;
        EditText editText = this.f13286e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.f13296j = i;
        EditText editText = this.f13286e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f13290g = i;
        EditText editText = this.f13286e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.f13294i = i;
        EditText editText = this.f13286e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        is2 is2Var = this.f13282c;
        is2Var.f44498g.setContentDescription(i != 0 ? is2Var.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        is2 is2Var = this.f13282c;
        is2Var.f44498g.setImageDrawable(i != 0 ? bna.m3932U(is2Var.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        is2 is2Var = this.f13282c;
        if (z && is2Var.f44500i != 1) {
            is2Var.m14120h(1);
        } else if (z) {
            is2Var.getClass();
        } else {
            is2Var.m14120h(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        is2 is2Var = this.f13282c;
        is2Var.f44502k = colorStateList;
        jfd.m14433a(is2Var.f44492a, is2Var.f44498g, colorStateList, is2Var.f44503l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        is2 is2Var = this.f13282c;
        is2Var.f44503l = mode;
        jfd.m14433a(is2Var.f44492a, is2Var.f44498g, is2Var.f44502k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f13261P == null) {
            C3048gr c3048gr = new C3048gr(getContext(), null);
            this.f13261P = c3048gr;
            c3048gr.setId(R$id.textinput_placeholder);
            this.f13261P.setImportantForAccessibility(1);
            this.f13261P.setAccessibilityLiveRegion(1);
            zy2 zy2VarM6223f = m6223f();
            this.f13267S = zy2VarM6223f;
            zy2VarM6223f.f35330b = 67L;
            this.f13269T = m6223f();
            setPlaceholderTextAppearance(this.f13265R);
            setPlaceholderTextColor(this.f13263Q);
            dta.m10640k(this.f13261P, new ur5(4));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f13259O) {
                setPlaceholderTextEnabled(true);
            }
            this.f13257N = charSequence;
        }
        EditText editText = this.f13286e;
        m6240x(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f13265R = i;
        C3048gr c3048gr = this.f13261P;
        if (c3048gr != null) {
            c3048gr.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f13263Q != colorStateList) {
            this.f13263Q = colorStateList;
            C3048gr c3048gr = this.f13261P;
            if (c3048gr == null || colorStateList == null) {
                return;
            }
            c3048gr.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        ug9 ug9Var = this.f13280b;
        ug9Var.getClass();
        ug9Var.f63900c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        ug9Var.f63899b.setText(charSequence);
        ug9Var.m22733f();
    }

    public void setPrefixTextAppearance(int i) {
        this.f13280b.f63899b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f13280b.f63899b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(r39 r39Var) {
        fs5 fs5Var = this.f13287e0;
        if (fs5Var == null || fs5Var.m12067k() == r39Var) {
            return;
        }
        this.f13299k0 = r39Var;
        m6220c();
    }

    public void setStartIconCheckable(boolean z) {
        this.f13280b.f63901d.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? bna.m3932U(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        ug9 ug9Var = this.f13280b;
        if (i < 0) {
            ug9Var.getClass();
            C3386nv.m17626m("startIconSize cannot be less than 0");
        } else if (i != ug9Var.f63904g) {
            ug9Var.f63904g = i;
            CheckableImageButton checkableImageButton = ug9Var.f63901d;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        ug9 ug9Var = this.f13280b;
        CheckableImageButton checkableImageButton = ug9Var.f63901d;
        View.OnLongClickListener onLongClickListener = ug9Var.f63906i;
        checkableImageButton.setOnClickListener(onClickListener);
        jfd.m14436d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        ug9 ug9Var = this.f13280b;
        ug9Var.f63906i = onLongClickListener;
        CheckableImageButton checkableImageButton = ug9Var.f63901d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        jfd.m14436d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        ug9 ug9Var = this.f13280b;
        ug9Var.f63905h = scaleType;
        ug9Var.f63901d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        ug9 ug9Var = this.f13280b;
        if (ug9Var.f63902e != colorStateList) {
            ug9Var.f63902e = colorStateList;
            jfd.m14433a(ug9Var.f63898a, ug9Var.f63901d, colorStateList, ug9Var.f63903f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        ug9 ug9Var = this.f13280b;
        if (ug9Var.f63903f != mode) {
            ug9Var.f63903f = mode;
            jfd.m14433a(ug9Var.f63898a, ug9Var.f63901d, ug9Var.f63902e, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.f13280b.m22731d(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        is2 is2Var = this.f13282c;
        is2Var.getClass();
        is2Var.f44485K = TextUtils.isEmpty(charSequence) ? null : charSequence;
        is2Var.f44486L.setText(charSequence);
        is2Var.m14127o();
    }

    public void setSuffixTextAppearance(int i) {
        this.f13282c.f44486L.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f13282c.f44486L.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(dw9 dw9Var) {
        EditText editText = this.f13286e;
        if (editText != null) {
            dta.m10640k(editText, dw9Var);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f13313x0) {
            this.f13313x0 = typeface;
            this.f13266R0.m4327n(typeface);
            y34 y34Var = this.f13298k;
            if (typeface != y34Var.f69213B) {
                y34Var.f69213B = typeface;
                C3048gr c3048gr = y34Var.f69231r;
                if (c3048gr != null) {
                    c3048gr.setTypeface(typeface);
                }
                C3048gr c3048gr2 = y34Var.f69238y;
                if (c3048gr2 != null) {
                    c3048gr2.setTypeface(typeface);
                }
            }
            C3048gr c3048gr3 = this.f13251K;
            if (c3048gr3 != null) {
                c3048gr3.setTypeface(typeface);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m6236t() {
        Drawable background;
        C3048gr c3048gr;
        EditText editText = this.f13286e;
        if (editText == null || this.f13303n0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = wl2.f66994a;
        Drawable drawableMutate = background.mutate();
        if (m6231o()) {
            drawableMutate.setColorFilter(C2893cq.m9844c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f13247I && (c3048gr = this.f13251K) != null) {
            drawableMutate.setColorFilter(C2893cq.m9844c(c3048gr.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f13286e.refreshDrawableState();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m6237u() {
        EditText editText = this.f13286e;
        if (editText == null || this.f13287e0 == null) {
            return;
        }
        if ((this.f13293h0 || editText.getBackground() == null) && this.f13303n0 != 0) {
            this.f13286e.setBackground(getEditTextBoxBackground());
            this.f13293h0 = true;
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m6238v() {
        if (this.f13303n0 != 1) {
            FrameLayout frameLayout = this.f13278a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iM6222e = m6222e();
            if (iM6222e != layoutParams.topMargin) {
                layoutParams.topMargin = iM6222e;
                frameLayout.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m6239w(boolean z, boolean z2) {
        ColorStateList colorStateList;
        C3048gr c3048gr;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f13286e;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f13286e;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f13242E0;
        c51 c51Var = this.f13266R0;
        if (colorStateList2 != null) {
            c51Var.m4324k(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f13242E0;
            int colorForState = this.f13260O0;
            if (colorStateList3 != null) {
                colorForState = colorStateList3.getColorForState(new int[]{-16842910}, colorForState);
            }
            c51Var.m4324k(ColorStateList.valueOf(colorForState));
        } else if (m6231o()) {
            C3048gr c3048gr2 = this.f13298k.f69231r;
            c51Var.m4324k(c3048gr2 != null ? c3048gr2.getTextColors() : null);
        } else if (this.f13247I && (c3048gr = this.f13251K) != null) {
            c51Var.m4324k(c3048gr.getTextColors());
        } else if (z4 && (colorStateList = this.f13243F0) != null && c51Var.f9555k != colorStateList) {
            c51Var.f9555k = colorStateList;
            c51Var.m4323j(false);
        }
        is2 is2Var = this.f13282c;
        ug9 ug9Var = this.f13280b;
        if (z3 || !this.f13268S0 || (isEnabled() && z4)) {
            if (z2 || this.f13264Q0) {
                ValueAnimator valueAnimator = this.f13272U0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f13272U0.cancel();
                }
                if (z && this.f13270T0) {
                    m6219b(1.0f);
                } else {
                    c51Var.m4326m(1.0f);
                }
                this.f13264Q0 = false;
                if (m6224g()) {
                    m6229l();
                }
                EditText editText3 = this.f13286e;
                m6240x(editText3 != null ? editText3.getText() : null);
                ug9Var.f63907j = false;
                ug9Var.m22733f();
                is2Var.f44487M = false;
                is2Var.m14127o();
                return;
            }
            return;
        }
        if (z2 || !this.f13264Q0) {
            ValueAnimator valueAnimator2 = this.f13272U0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f13272U0.cancel();
            }
            if (z && this.f13270T0) {
                m6219b(0.0f);
            } else {
                c51Var.m4326m(0.0f);
            }
            if (m6224g() && !((vx1) this.f13287e0).f66041c0.f64484s.isEmpty() && m6224g()) {
                ((vx1) this.f13287e0).m23564F(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f13264Q0 = true;
            C3048gr c3048gr3 = this.f13261P;
            if (c3048gr3 != null && this.f13259O) {
                c3048gr3.setText((CharSequence) null);
                oaa.m17884a(this.f13278a, this.f13269T);
                this.f13261P.setVisibility(4);
            }
            ug9Var.f63907j = true;
            ug9Var.m22733f();
            is2Var.f44487M = true;
            is2Var.m14127o();
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m6240x(Editable editable) {
        ((fg2) this.f13249J).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f13278a;
        if (length != 0 || this.f13264Q0) {
            C3048gr c3048gr = this.f13261P;
            if (c3048gr == null || !this.f13259O) {
                return;
            }
            c3048gr.setText((CharSequence) null);
            oaa.m17884a(frameLayout, this.f13269T);
            this.f13261P.setVisibility(4);
            return;
        }
        if (this.f13261P == null || !this.f13259O || TextUtils.isEmpty(this.f13257N)) {
            return;
        }
        this.f13261P.setText(this.f13257N);
        oaa.m17884a(frameLayout, this.f13267S);
        this.f13261P.setVisibility(0);
        this.f13261P.bringToFront();
    }

    /* JADX INFO: renamed from: y */
    public final void m6241y(boolean z, boolean z2) {
        int defaultColor = this.f13250J0.getDefaultColor();
        int colorForState = this.f13250J0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f13250J0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.f13308s0 = colorForState2;
        } else if (z2) {
            this.f13308s0 = colorForState;
        } else {
            this.f13308s0 = defaultColor;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m6242z() {
        C3048gr c3048gr;
        EditText editText;
        EditText editText2;
        if (this.f13287e0 == null || this.f13303n0 == 0) {
            return;
        }
        boolean z = isFocused() || ((editText2 = this.f13286e) != null && editText2.hasFocus());
        boolean z2 = isHovered() || ((editText = this.f13286e) != null && editText.isHovered());
        if (!isEnabled()) {
            this.f13308s0 = this.f13260O0;
        } else if (m6231o()) {
            if (this.f13250J0 != null) {
                m6241y(z, z2);
            } else {
                this.f13308s0 = getErrorCurrentTextColors();
            }
        } else if (!this.f13247I || (c3048gr = this.f13251K) == null) {
            if (z) {
                this.f13308s0 = this.f13248I0;
            } else if (z2) {
                this.f13308s0 = this.f13246H0;
            } else {
                this.f13308s0 = this.f13244G0;
            }
        } else if (this.f13250J0 != null) {
            m6241y(z, z2);
        } else {
            this.f13308s0 = c3048gr.getCurrentTextColor();
        }
        m6234r();
        is2 is2Var = this.f13282c;
        TextInputLayout textInputLayout = is2Var.f44492a;
        CheckableImageButton checkableImageButton = is2Var.f44498g;
        TextInputLayout textInputLayout2 = is2Var.f44492a;
        is2Var.m14125m();
        jfd.m14435c(textInputLayout2, is2Var.f44494c, is2Var.f44495d);
        jfd.m14435c(textInputLayout2, checkableImageButton, is2Var.f44502k);
        if (is2Var.m14114b() instanceof ym2) {
            if (!textInputLayout.m6231o() || checkableImageButton.getDrawable() == null) {
                jfd.m14433a(textInputLayout, checkableImageButton, is2Var.f44502k, is2Var.f44503l);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        ug9 ug9Var = this.f13280b;
        jfd.m14435c(ug9Var.f63898a, ug9Var.f63901d, ug9Var.f63902e);
        if (this.f13303n0 == 2) {
            int i = this.f13305p0;
            if (z && isEnabled()) {
                this.f13305p0 = this.f13307r0;
            } else {
                this.f13305p0 = this.f13306q0;
            }
            if (this.f13305p0 != i && m6224g() && !this.f13264Q0) {
                if (m6224g()) {
                    ((vx1) this.f13287e0).m23564F(0.0f, 0.0f, 0.0f, 0.0f);
                }
                m6229l();
            }
        }
        if (this.f13303n0 == 1) {
            if (!isEnabled()) {
                this.f13309t0 = this.f13254L0;
            } else if (z2 && !z) {
                this.f13309t0 = this.f13258N0;
            } else if (z) {
                this.f13309t0 = this.f13256M0;
            } else {
                this.f13309t0 = this.f13252K0;
            }
        }
        m6220c();
        if (getEndIconMode() == 3) {
            EditText editText3 = this.f13286e;
            if ((editText3 instanceof AutoCompleteTextView) && editText3.getInputType() == 0) {
                getEndIconView().setFocusable(false);
                getEndIconView().setClickable(false);
            } else {
                getEndIconView().setFocusable(true);
                getEndIconView().setClickable(true);
            }
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f13281b0) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f13280b.m22729b(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f13280b.m22730c(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f13282c.m14119g(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f13282c.f44498g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f13282c.f44498g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f13282c.m14122j(drawable);
    }

    public void setEndIconDrawable(Drawable drawable) {
        is2 is2Var = this.f13282c;
        TextInputLayout textInputLayout = is2Var.f44492a;
        CheckableImageButton checkableImageButton = is2Var.f44498g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            jfd.m14433a(textInputLayout, checkableImageButton, is2Var.f44502k, is2Var.f44503l);
            jfd.m14435c(textInputLayout, checkableImageButton, is2Var.f44502k);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R$attr.textInputStyle);
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }
}
