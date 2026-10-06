package com.google.android.clockwork.common.wearable.wearmaterial.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.C1178zm;
import p000.C1190zy;
import p000.afq;
import p000.iwf;
import p000.iwi;
import p000.iwk;
import p000.iwl;
import p000.iwm;
import p000.iwn;
import p000.kbd;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class WearChipButton extends iwi {

    /* JADX INFO: renamed from: A */
    private int f7426A;

    /* JADX INFO: renamed from: B */
    private Drawable f7427B;

    /* JADX INFO: renamed from: C */
    private Drawable f7428C;

    /* JADX INFO: renamed from: D */
    private Drawable f7429D;

    /* JADX INFO: renamed from: E */
    private Drawable f7430E;

    /* JADX INFO: renamed from: F */
    private int f7431F;

    /* JADX INFO: renamed from: G */
    private boolean f7432G;

    /* JADX INFO: renamed from: H */
    private boolean f7433H;

    /* JADX INFO: renamed from: I */
    private Transition f7434I;

    /* JADX INFO: renamed from: J */
    private boolean f7435J;

    /* JADX INFO: renamed from: K */
    private final int f7436K;

    /* JADX INFO: renamed from: j */
    public TextView f7437j;

    /* JADX INFO: renamed from: k */
    public CompoundButton f7438k;

    /* JADX INFO: renamed from: l */
    public boolean f7439l;

    /* JADX INFO: renamed from: m */
    private final int f7440m;

    /* JADX INFO: renamed from: n */
    private final C1190zy f7441n;

    /* JADX INFO: renamed from: o */
    private final ViewTreeObserver.OnPreDrawListener f7442o;

    /* JADX INFO: renamed from: p */
    private iwn f7443p;

    /* JADX INFO: renamed from: q */
    private TextView f7444q;

    /* JADX INFO: renamed from: r */
    private FrameLayout f7445r;

    /* JADX INFO: renamed from: s */
    private View f7446s;

    /* JADX INFO: renamed from: t */
    private ImageView f7447t;

    /* JADX INFO: renamed from: u */
    private CharSequence f7448u;

    /* JADX INFO: renamed from: v */
    private int f7449v;

    /* JADX INFO: renamed from: w */
    private ColorStateList f7450w;

    /* JADX INFO: renamed from: x */
    private int f7451x;

    /* JADX INFO: renamed from: y */
    private int f7452y;

    /* JADX INFO: renamed from: z */
    private int f7453z;

    public WearChipButton(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: m */
    private final int m4584m(int i) {
        return getResources().getDimensionPixelSize(i);
    }

    /* JADX INFO: renamed from: n */
    private static int m4585n(boolean z) {
        return z ? 255 : 0;
    }

    /* JADX INFO: renamed from: o */
    private final void m4586o() {
        Drawable drawable = this.f7427B;
        if (drawable == null || this.f7429D == null || this.f7428C == null || this.f7430E == null) {
            return;
        }
        boolean z = this.f7431F == 1;
        boolean z2 = this.f7438k == null;
        drawable.setAlpha(m4585n(z2 && !z));
        this.f7428C.setAlpha(m4585n(z2 && z));
        this.f7429D.setAlpha(m4585n((z2 || z) ? false : true));
        this.f7430E.setAlpha(m4585n(!z2 && z));
    }

    /* JADX INFO: renamed from: p */
    private final void m4587p() {
        CharSequence charSequenceM4593g = this.f7448u;
        if (charSequenceM4593g == null) {
            charSequenceM4593g = m4593g();
        }
        this.f7446s.setContentDescription(m4593g());
        this.f7445r.setContentDescription(charSequenceM4593g);
        ImageView imageView = this.f7447t;
        if (imageView != null) {
            imageView.setContentDescription(charSequenceM4593g);
            this.f7447t.setImportantForAccessibility(2);
        }
        CompoundButton compoundButton = this.f7438k;
        if (compoundButton != null) {
            compoundButton.setContentDescription(charSequenceM4593g);
            this.f7438k.setImportantForAccessibility(2);
        }
        this.f7445r.setImportantForAccessibility(2);
    }

    /* JADX INFO: renamed from: q */
    private final void m4588q() {
        if (this.f7435J) {
            return;
        }
        this.f7441n.m19820e(this);
        if (this.f32475f.getVisibility() == 0 && this.f7444q.getVisibility() == 8 && this.f7437j.getVisibility() == 8 && this.f7443p == iwn.NONE) {
            this.f7441n.m19829p(C0100R.id.start_guideline, this.f7453z);
            this.f7441n.m19830q(C0100R.id.end_guideline, this.f7453z);
            this.f7441n.m19822g(C0100R.id.wear_chip_icon, 7, C0100R.id.end_guideline, 6);
        } else {
            this.f7441n.m19829p(C0100R.id.start_guideline, this.f7426A);
            this.f7441n.m19830q(C0100R.id.end_guideline, this.f7426A);
            this.f7441n.m19819d(C0100R.id.wear_chip_icon, 7);
        }
        if (m4598l()) {
            int i = this.f7437j.getVisibility() == 0 ? C0100R.id.top_text_center_line : 0;
            this.f7441n.m19822g(C0100R.id.wear_chip_primary_text, 3, i, 3);
            this.f7441n.m19822g(C0100R.id.wear_chip_primary_text, 4, i, 4);
        }
        this.f7441n.m19818c(this);
    }

    /* JADX INFO: renamed from: r */
    private final void m4589r(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (this.f7435J || (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) == null) {
            return;
        }
        marginLayoutParams.setMarginStart(this.f32475f.getVisibility() == 0 ? getResources().getDimensionPixelSize(C0100R.dimen.wear_button_padding_between_icon_and_text) : 0);
        view.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: s */
    private static final void m4590s(TextView textView, int i) {
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(i);
        }
    }

    @Override // p000.iwi
    /* JADX INFO: renamed from: c */
    protected final void mo4591c(ColorStateList colorStateList) {
        Drawable background = getBackground();
        Drawable drawable = this.f7427B;
        if (drawable == null || this.f7429D == null || this.f7428C == null || this.f7430E == null) {
            if (background != null) {
                background.mutate().setTintList(colorStateList);
            }
        } else {
            drawable.mutate().setTintList(colorStateList);
            this.f7428C.mutate().setTintList(colorStateList);
            this.f7429D.mutate().setTintList(colorStateList);
            this.f7430E.mutate().setTintList(colorStateList);
        }
    }

    @Override // p000.iwi
    /* JADX INFO: renamed from: f */
    public final void mo4592f(int i) {
        if (i != 0) {
            m4597k();
            this.f32475f.setImageResource(i);
            this.f32475f.setVisibility(0);
            this.f32475f.setDuplicateParentStateEnabled(true);
            m4594h();
        }
    }

    /* JADX INFO: renamed from: g */
    public final CharSequence m4593g() {
        return this.f7444q.getVisibility() == 0 ? this.f7444q.getText() : "";
    }

    /* JADX INFO: renamed from: h */
    public final void m4594h() {
        m4589r(this.f7444q);
        m4589r(this.f7437j);
        m4588q();
    }

    /* JADX INFO: renamed from: i */
    public final void m4595i(CharSequence charSequence) {
        if (this.f7444q == null) {
            return;
        }
        m4597k();
        if (TextUtils.isEmpty(charSequence)) {
            this.f7444q.setVisibility(8);
        } else {
            this.f7444q.setVisibility(0);
            ContentChangeTransition.m4581c(this.f7444q, charSequence);
            m4588q();
        }
        m4587p();
    }

    /* JADX INFO: renamed from: j */
    public final void m4596j(CharSequence charSequence) {
        m4597k();
        if (TextUtils.isEmpty(charSequence)) {
            this.f7437j.setVisibility(8);
            this.f7444q.setMaxLines(this.f7451x);
        } else {
            this.f7437j.setVisibility(0);
            ContentChangeTransition.m4581c(this.f7437j, charSequence);
            this.f7444q.setMaxLines(this.f7452y);
        }
        m4588q();
    }

    /* JADX INFO: renamed from: k */
    public final void m4597k() {
        if (this.f7433H && !this.f7435J && this.f7439l) {
            if (this.f7444q.getVisibility() == 8 && this.f7437j.getVisibility() == 8) {
                return;
            }
            TransitionManager.beginDelayedTransition(this, this.f7434I);
        }
    }

    /* JADX INFO: renamed from: l */
    final boolean m4598l() {
        return this.f7436K == 1;
    }

    @Override // p000.iwi, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getRootView().getViewTreeObserver().addOnPreDrawListener(this.f7442o);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        TransitionManager.endTransitions(this);
        this.f7439l = false;
        getRootView().getViewTreeObserver().removeOnPreDrawListener(this.f7442o);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int iM4584m;
        super.onMeasure(i, i2);
        if (m4598l()) {
            return;
        }
        int minHeight = getMinHeight();
        int measuredHeight = getMeasuredHeight();
        int iM4584m2 = 0;
        boolean z = true;
        if (minHeight != 0 && measuredHeight >= minHeight && this.f7444q.getLineCount() + this.f7437j.getLineCount() == 2) {
            z = false;
        }
        if (this.f7432G == z) {
            return;
        }
        this.f7432G = z;
        if (z) {
            iM4584m2 = m4584m(C0100R.dimen.wear_multiline_button_top_padding);
            iM4584m = m4584m(C0100R.dimen.wear_multiline_button_bottom_padding);
        } else {
            iM4584m = 0;
        }
        this.f7441n.m19820e(this);
        this.f7441n.m19829p(C0100R.id.top_guideline, iM4584m2);
        this.f7441n.m19830q(C0100R.id.bottom_guideline, iM4584m);
        this.f7441n.m19818c(this);
        measure(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (this.f7431F != i) {
            this.f7431F = i;
            m4586o();
        }
    }

    @Override // p000.iwi, android.view.View
    public final void setBackground(Drawable drawable) {
        if (getBackground() != drawable) {
            m4597k();
            super.setBackground(drawable);
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                this.f7427B = layerDrawable.findDrawableByLayerId(C0100R.id.wear_chip_start_accent);
                this.f7428C = layerDrawable.findDrawableByLayerId(C0100R.id.wear_chip_start_accent_rtl);
                this.f7429D = layerDrawable.findDrawableByLayerId(C0100R.id.wear_chip_end_accent);
                this.f7430E = layerDrawable.findDrawableByLayerId(C0100R.id.wear_chip_end_accent_rtl);
            } else {
                this.f7427B = null;
                this.f7428C = null;
                this.f7429D = null;
                this.f7430E = null;
            }
            m4586o();
        }
    }

    @Override // p000.iwi, android.widget.Checkable
    public final void setChecked(boolean z) {
        super.setChecked(z);
        CompoundButton compoundButton = this.f7438k;
        if (compoundButton != null) {
            compoundButton.setChecked(z);
        }
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f7443p == iwn.ICON) {
            this.f7445r.setEnabled(isEnabled());
            ImageView imageView = this.f7447t;
            if (imageView != null) {
                imageView.setEnabled(isEnabled());
            }
        } else {
            this.f7445r.setEnabled(isEnabled());
        }
        this.f7446s.setEnabled(z);
    }

    public WearChipButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0100R.attr.wearChipButtonStyle);
    }

    public WearChipButton(Context context, AttributeSet attributeSet, int i) {
        ImageView imageView;
        super(context, attributeSet, i);
        C1190zy c1190zy = new C1190zy();
        this.f7441n = c1190zy;
        this.f7442o = new iwk(this, 0);
        this.f7443p = iwn.NONE;
        this.f7431F = 0;
        this.f7432G = true;
        this.f7433H = true;
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, iwf.f32465b, i, C0100R.style.WearChipButtonDefault);
        try {
            int i2 = typedArrayObtainStyledAttributes.getInt(6, 0);
            typedArrayObtainStyledAttributes.recycle();
            this.f7436K = i2 == 1 ? 2 : 1;
            int dimensionPixelSize = getResources().getDimensionPixelSize(true != m4598l() ? C0100R.dimen.wear_multiline_button_start_padding : C0100R.dimen.wear_button_start_padding);
            this.f7440m = dimensionPixelSize;
            this.f7453z = dimensionPixelSize;
            this.f7426A = dimensionPixelSize;
            LayoutInflater.from(getContext()).inflate(C0100R.layout.wear_chip_button_layout, (ViewGroup) this, true);
            this.f32475f = (ImageView) findViewById(C0100R.id.wear_chip_icon);
            this.f7444q = (TextView) findViewById(C0100R.id.wear_chip_primary_text);
            this.f7437j = (TextView) findViewById(C0100R.id.wear_chip_secondary_text);
            this.f7445r = (FrameLayout) findViewById(C0100R.id.wear_chip_selection_control_container);
            this.f7446s = findViewById(C0100R.id.wear_chip_start);
            if (!m4598l()) {
                c1190zy.m19820e(this);
                c1190zy.m19829p(C0100R.id.start_guideline, m4584m(C0100R.dimen.wear_multiline_button_start_padding));
                c1190zy.m19830q(C0100R.id.end_guideline, m4584m(C0100R.dimen.wear_multiline_button_end_padding));
                c1190zy.m19829p(C0100R.id.top_guideline, m4584m(C0100R.dimen.wear_multiline_button_top_padding));
                c1190zy.m19830q(C0100R.id.bottom_guideline, m4584m(C0100R.dimen.wear_multiline_button_bottom_padding));
                c1190zy.m19828o(C0100R.id.wear_chip_primary_text);
                c1190zy.m19828o(C0100R.id.wear_chip_secondary_text);
                c1190zy.m19822g(C0100R.id.wear_chip_primary_text, 3, C0100R.id.top_guideline, 3);
                c1190zy.m19822g(C0100R.id.wear_chip_primary_text, 4, C0100R.id.wear_chip_secondary_text, 3);
                c1190zy.m19822g(C0100R.id.wear_chip_secondary_text, 3, C0100R.id.wear_chip_primary_text, 4);
                c1190zy.m19822g(C0100R.id.wear_chip_secondary_text, 4, C0100R.id.bottom_guideline, 4);
                c1190zy.m19817b(C0100R.id.wear_chip_primary_text).f48481d.f48510Y = 2;
                c1190zy.m19818c(this);
            }
            setTransitionName("WearChipButton:Transition");
            this.f7434I = TransitionInflater.from(getContext()).inflateTransition(C0100R.transition.wear_chip_button_state);
            this.f7435J = true;
            super.m11826d(attributeSet, i);
            TypedArray typedArrayObtainStyledAttributes2 = getContext().getTheme().obtainStyledAttributes(attributeSet, iwf.f32465b, i, C0100R.style.WearChipButtonDefault);
            try {
                this.f7451x = getContext().getResources().getInteger(true != m4598l() ? C0100R.integer.wear_multiline_button_primary_text_max_lines : C0100R.integer.wear_button_primary_text_max_lines);
                this.f7452y = getContext().getResources().getInteger(true != m4598l() ? C0100R.integer.wear_multiline_button_primary_text_max_lines_with_secondary : C0100R.integer.wear_button_primary_text_max_lines_with_secondary);
                if (typedArrayObtainStyledAttributes2.hasValue(7)) {
                    m4595i(typedArrayObtainStyledAttributes2.getString(7));
                }
                int i3 = 8;
                if (typedArrayObtainStyledAttributes2.hasValue(8)) {
                    this.f7444q.setTextAppearance(typedArrayObtainStyledAttributes2.getResourceId(8, 0));
                    this.f7444q.setMaxLines(this.f7451x);
                }
                if (typedArrayObtainStyledAttributes2.hasValue(9)) {
                    ColorStateList colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(9);
                    this.f7444q.setTextColor(colorStateList == null ? ColorStateList.valueOf(-1) : colorStateList);
                }
                int i4 = typedArrayObtainStyledAttributes2.getInt(10, 0);
                if (i4 >= 0) {
                    kbd.m13924m();
                    if (i4 < 2) {
                        int i5 = kbd.m13924m()[i4];
                        C1178zm c1178zm = (C1178zm) this.f7444q.getLayoutParams();
                        c1178zm.f48373G = i5 == 1 ? 0.0f : 0.5f;
                        this.f7444q.setLayoutParams(c1178zm);
                        this.f7444q.setGravity(i5 == 1 ? 8388611 : 1);
                        this.f7444q.setTextAlignment(i5 == 1 ? 5 : 4);
                    }
                }
                if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                    int i6 = typedArrayObtainStyledAttributes2.getInt(11, this.f7451x);
                    this.f7451x = i6;
                    this.f7452y = i6;
                    this.f7444q.setMaxLines(i6);
                }
                if (typedArrayObtainStyledAttributes2.hasValue(12)) {
                    m4596j(typedArrayObtainStyledAttributes2.getString(12));
                }
                if (typedArrayObtainStyledAttributes2.hasValue(13)) {
                    this.f7437j.setTextAppearance(typedArrayObtainStyledAttributes2.getResourceId(13, 0));
                }
                if (typedArrayObtainStyledAttributes2.hasValue(14)) {
                    ColorStateList colorStateList2 = typedArrayObtainStyledAttributes2.getColorStateList(14);
                    this.f7437j.setTextColor(colorStateList2 == null ? ColorStateList.valueOf(-1) : colorStateList2);
                }
                if (!typedArrayObtainStyledAttributes2.getBoolean(15, true)) {
                    this.f7437j.setVisibility(8);
                }
                int iM4584m = m4584m(C0100R.dimen.wear_chip_button_icon_size);
                if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(18, iM4584m);
                    ViewGroup.LayoutParams layoutParams = this.f32475f.getLayoutParams();
                    layoutParams.width = dimensionPixelSize2;
                    layoutParams.height = dimensionPixelSize2;
                    this.f32475f.setLayoutParams(layoutParams);
                }
                if (typedArrayObtainStyledAttributes2.hasValue(5)) {
                    this.f7453z = typedArrayObtainStyledAttributes2.getDimensionPixelSize(5, dimensionPixelSize);
                }
                if (typedArrayObtainStyledAttributes2.hasValue(4)) {
                    this.f7426A = typedArrayObtainStyledAttributes2.getDimensionPixelSize(4, dimensionPixelSize);
                }
                this.f7437j.setMaxLines(typedArrayObtainStyledAttributes2.getInt(16, true != m4598l() ? 2 : 1));
                iwn iwnVar = iwn.NONE;
                int i7 = typedArrayObtainStyledAttributes2.getInt(2, 0);
                if (i7 >= 0 && i7 < iwn.values().length) {
                    iwnVar = iwn.values()[i7];
                }
                if (this.f7443p != iwnVar) {
                    m4597k();
                    this.f7445r.removeAllViews();
                    this.f7438k = null;
                    this.f7447t = null;
                    this.f7443p = iwnVar;
                    if (iwnVar.f32492f != 0) {
                        LayoutInflater.from(getContext()).inflate(iwnVar.f32492f, (ViewGroup) this.f7445r, true);
                        if (iwnVar == iwn.ICON) {
                            ImageView imageView2 = (ImageView) this.f7445r.findViewById(C0100R.id.wear_chip_end_icon);
                            this.f7447t = imageView2;
                            imageView2.setImageResource(this.f7449v);
                            this.f7447t.setImageTintList(this.f7450w);
                        } else {
                            this.f7438k = (CompoundButton) this.f7445r.findViewById(C0100R.id.wear_chip_selection_control);
                        }
                    }
                    boolean z = iwnVar == iwn.ICON || this.f7438k != null;
                    FrameLayout frameLayout = this.f7445r;
                    if (true == z) {
                        i3 = 0;
                    }
                    frameLayout.setVisibility(i3);
                    int dimensionPixelSize3 = z ? getResources().getDimensionPixelSize(C0100R.dimen.wear_chip_button_selection_control_start_margin) : 0;
                    m4590s(this.f7444q, dimensionPixelSize3);
                    m4590s(this.f7437j, dimensionPixelSize3);
                    m4594h();
                    m4586o();
                    m4587p();
                    this.f7445r.setForeground(null);
                }
                if (typedArrayObtainStyledAttributes2.hasValue(0)) {
                    this.f7449v = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                    ImageView imageView3 = this.f7447t;
                    if (imageView3 != null) {
                        m4597k();
                        imageView3.setImageResource(this.f7449v);
                    }
                }
                if (typedArrayObtainStyledAttributes2.hasValue(17)) {
                    this.f7448u = typedArrayObtainStyledAttributes2.getString(17);
                    m4587p();
                }
                if (typedArrayObtainStyledAttributes2.hasValue(1)) {
                    ColorStateList colorStateList3 = typedArrayObtainStyledAttributes2.getColorStateList(1);
                    this.f7450w = colorStateList3;
                    if (this.f7443p == iwn.ICON && (imageView = this.f7447t) != null) {
                        imageView.setImageTintList(colorStateList3);
                    }
                }
                this.f7433H = typedArrayObtainStyledAttributes2.getBoolean(3, this.f7433H);
                this.f7435J = false;
                typedArrayObtainStyledAttributes2.recycle();
                m4594h();
                m4589r(this.f7444q);
                m4589r(this.f7437j);
                afq.m547g(this, new iwl(this, this));
                afq.m547g(this.f7445r, new iwm(this, this));
            } catch (Throwable th) {
                this.f7435J = false;
                typedArrayObtainStyledAttributes2.recycle();
                throw th;
            }
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
