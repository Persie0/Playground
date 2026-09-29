package p240ld;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
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
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0300b1;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.linguist.R;
import java.util.WeakHashMap;
import p072dd.C5150c;
import p471x2.C10029b0;
import p471x2.C10040h;
import p471x2.C10049l0;
import p507yc.C10347n;

/* JADX INFO: renamed from: ld.u */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public final class C7321u extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f41003a;

    /* JADX INFO: renamed from: b */
    public final AppCompatTextView f41004b;

    /* JADX INFO: renamed from: c */
    public CharSequence f41005c;

    /* JADX INFO: renamed from: d */
    public final CheckableImageButton f41006d;

    /* JADX INFO: renamed from: e */
    public ColorStateList f41007e;

    /* JADX INFO: renamed from: f */
    public PorterDuff.Mode f41008f;

    /* JADX INFO: renamed from: g */
    public int f41009g;

    /* JADX INFO: renamed from: h */
    public ImageView.ScaleType f41010h;

    /* JADX INFO: renamed from: i */
    public View.OnLongClickListener f41011i;

    /* JADX INFO: renamed from: j */
    public boolean f41012j;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C7321u(TextInputLayout textInputLayout, C0300b1 c0300b1) {
        CharSequence charSequenceM1122k;
        super(textInputLayout.getContext());
        this.f41003a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f41006d = checkableImageButton;
        CharSequence charSequence = null;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.f41004b = appCompatTextView;
        if (C5150c.m10929e(getContext())) {
            C10040h.m18813g((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        View.OnLongClickListener onLongClickListener = this.f41011i;
        checkableImageButton.setOnClickListener(null);
        C7314n.m14720d(checkableImageButton, onLongClickListener);
        this.f41011i = null;
        checkableImageButton.setOnLongClickListener(null);
        C7314n.m14720d(checkableImageButton, null);
        if (c0300b1.m1123l(67)) {
            this.f41007e = C5150c.m10926b(getContext(), c0300b1, 67);
        }
        if (c0300b1.m1123l(68)) {
            this.f41008f = C10347n.m19366f(c0300b1.m1119h(68, -1), null);
        }
        if (c0300b1.m1123l(64)) {
            m14733a(c0300b1.m1116e(64));
            if (c0300b1.m1123l(63) && checkableImageButton.getContentDescription() != (charSequenceM1122k = c0300b1.m1122k(63))) {
                checkableImageButton.setContentDescription(charSequenceM1122k);
            }
            checkableImageButton.setCheckable(c0300b1.m1112a(62, true));
        }
        int iM1115d = c0300b1.m1115d(65, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (iM1115d < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (iM1115d != this.f41009g) {
            this.f41009g = iM1115d;
            checkableImageButton.setMinimumWidth(iM1115d);
            checkableImageButton.setMinimumHeight(iM1115d);
        }
        if (c0300b1.m1123l(66)) {
            ImageView.ScaleType scaleTypeM14718b = C7314n.m14718b(c0300b1.m1119h(66, -1));
            this.f41010h = scaleTypeM14718b;
            checkableImageButton.setScaleType(scaleTypeM14718b);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_prefix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.g.m18702f(appCompatTextView, 1);
        appCompatTextView.setTextAppearance(c0300b1.m1120i(58, 0));
        if (c0300b1.m1123l(59)) {
            appCompatTextView.setTextColor(c0300b1.m1113b(59));
        }
        CharSequence charSequenceM1122k2 = c0300b1.m1122k(57);
        this.f41005c = TextUtils.isEmpty(charSequenceM1122k2) ? charSequence : charSequenceM1122k2;
        appCompatTextView.setText(charSequenceM1122k2);
        m14736d();
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    /* JADX INFO: renamed from: a */
    public final void m14733a(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f41006d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f41007e;
            PorterDuff.Mode mode = this.f41008f;
            TextInputLayout textInputLayout = this.f41003a;
            C7314n.m14717a(textInputLayout, checkableImageButton, colorStateList, mode);
            m14734b(true);
            C7314n.m14719c(textInputLayout, checkableImageButton, this.f41007e);
            return;
        }
        m14734b(false);
        View.OnLongClickListener onLongClickListener = this.f41011i;
        checkableImageButton.setOnClickListener(null);
        C7314n.m14720d(checkableImageButton, onLongClickListener);
        this.f41011i = null;
        checkableImageButton.setOnLongClickListener(null);
        C7314n.m14720d(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m14734b(boolean z10) {
        CheckableImageButton checkableImageButton = this.f41006d;
        int i10 = 0;
        if ((checkableImageButton.getVisibility() == 0) != z10) {
            if (!z10) {
                i10 = 8;
            }
            checkableImageButton.setVisibility(i10);
            m14735c();
            m14736d();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m14735c() {
        EditText editText = this.f41003a.f15750d;
        if (editText == null) {
            return;
        }
        int iM18688f = 0;
        if (!(this.f41006d.getVisibility() == 0)) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            iM18688f = C10029b0.e.m18688f(editText);
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
        C10029b0.e.m18693k(this.f41004b, iM18688f, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    /* JADX INFO: renamed from: d */
    public final void m14736d() {
        int i10 = (this.f41005c == null || this.f41012j) ? 8 : 0;
        setVisibility(this.f41006d.getVisibility() == 0 || i10 == 0 ? 0 : 8);
        this.f41004b.setVisibility(i10);
        this.f41003a.m8897p();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        m14735c();
    }
}
