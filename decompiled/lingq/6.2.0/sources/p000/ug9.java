package p000;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class ug9 extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f63898a;

    /* JADX INFO: renamed from: b */
    public final C3048gr f63899b;

    /* JADX INFO: renamed from: c */
    public CharSequence f63900c;

    /* JADX INFO: renamed from: d */
    public final CheckableImageButton f63901d;

    /* JADX INFO: renamed from: e */
    public ColorStateList f63902e;

    /* JADX INFO: renamed from: f */
    public PorterDuff.Mode f63903f;

    /* JADX INFO: renamed from: g */
    public int f63904g;

    /* JADX INFO: renamed from: h */
    public ImageView.ScaleType f63905h;

    /* JADX INFO: renamed from: i */
    public View.OnLongClickListener f63906i;

    /* JADX INFO: renamed from: j */
    public boolean f63907j;

    public ug9(TextInputLayout textInputLayout, sq5 sq5Var) {
        super(textInputLayout.getContext());
        this.f63898a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R$layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f63901d = checkableImageButton;
        C3048gr c3048gr = new C3048gr(getContext(), null);
        this.f63899b = c3048gr;
        if (pb1.m19020H(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f63906i;
        checkableImageButton.setOnClickListener(null);
        jfd.m14436d(checkableImageButton, onLongClickListener);
        this.f63906i = null;
        checkableImageButton.setOnLongClickListener(null);
        jfd.m14436d(checkableImageButton, null);
        int i = R$styleable.TextInputLayout_startIconTint;
        TypedArray typedArray = (TypedArray) sq5Var.f61249c;
        if (typedArray.hasValue(i)) {
            this.f63902e = pb1.m19053w(getContext(), sq5Var, R$styleable.TextInputLayout_startIconTint);
        }
        if (typedArray.hasValue(R$styleable.TextInputLayout_startIconTintMode)) {
            this.f63903f = gka.m12724c(typedArray.getInt(R$styleable.TextInputLayout_startIconTintMode, -1), null);
        }
        if (typedArray.hasValue(R$styleable.TextInputLayout_startIconDrawable)) {
            m22730c(sq5Var.m21568j(R$styleable.TextInputLayout_startIconDrawable));
            if (typedArray.hasValue(R$styleable.TextInputLayout_startIconContentDescription)) {
                m22729b(typedArray.getText(R$styleable.TextInputLayout_startIconContentDescription));
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(R$styleable.TextInputLayout_startIconCheckable, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(R$styleable.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(R$dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            C3386nv.m17626m("startIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.f63904g) {
            this.f63904g = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(R$styleable.TextInputLayout_startIconScaleType)) {
            ImageView.ScaleType scaleTypeM14434b = jfd.m14434b(typedArray.getInt(R$styleable.TextInputLayout_startIconScaleType, -1));
            this.f63905h = scaleTypeM14434b;
            checkableImageButton.setScaleType(scaleTypeM14434b);
        }
        c3048gr.setVisibility(8);
        c3048gr.setId(R$id.textinput_prefix_text);
        c3048gr.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        c3048gr.setAccessibilityLiveRegion(1);
        c3048gr.setTextAppearance(typedArray.getResourceId(R$styleable.TextInputLayout_prefixTextAppearance, 0));
        if (typedArray.hasValue(R$styleable.TextInputLayout_prefixTextColor)) {
            c3048gr.setTextColor(sq5Var.m21567i(R$styleable.TextInputLayout_prefixTextColor));
        }
        CharSequence text = typedArray.getText(R$styleable.TextInputLayout_prefixText);
        this.f63900c = TextUtils.isEmpty(text) ? null : text;
        c3048gr.setText(text);
        m22733f();
        addView(checkableImageButton);
        addView(c3048gr);
        checkableImageButton.setOnFocusableChangedListener(new dw6(this, 11));
    }

    /* JADX INFO: renamed from: a */
    public final int m22728a() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.f63901d;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        return this.f63899b.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    /* JADX INFO: renamed from: b */
    public final void m22729b(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f63901d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
            jfd.m14437e(checkableImageButton, charSequence);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m22730c(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f63901d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f63902e;
            PorterDuff.Mode mode = this.f63903f;
            TextInputLayout textInputLayout = this.f63898a;
            jfd.m14433a(textInputLayout, checkableImageButton, colorStateList, mode);
            m22731d(true);
            jfd.m14435c(textInputLayout, checkableImageButton, this.f63902e);
            return;
        }
        m22731d(false);
        View.OnLongClickListener onLongClickListener = this.f63906i;
        checkableImageButton.setOnClickListener(null);
        jfd.m14436d(checkableImageButton, onLongClickListener);
        this.f63906i = null;
        checkableImageButton.setOnLongClickListener(null);
        jfd.m14436d(checkableImageButton, null);
        m22729b(null);
    }

    /* JADX INFO: renamed from: d */
    public final void m22731d(boolean z) {
        EditText editText;
        CheckableImageButton checkableImageButton = this.f63901d;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            if (!z && checkableImageButton.hasFocus() && (editText = this.f63898a.getEditText()) != null) {
                editText.requestFocus();
            }
            checkableImageButton.setVisibility(z ? 0 : 8);
            m22732e();
            m22733f();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m22732e() {
        EditText editText = this.f63898a.f13286e;
        if (editText == null) {
            return;
        }
        this.f63899b.setPaddingRelative(this.f63901d.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R$dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    /* JADX INFO: renamed from: f */
    public final void m22733f() {
        int i = (this.f63900c == null || this.f63907j) ? 8 : 0;
        setVisibility((this.f63901d.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f63899b.setVisibility(i);
        this.f63898a.m6235s();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m22732e();
    }
}
