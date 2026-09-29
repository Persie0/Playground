package p000;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class is2 extends LinearLayout {

    /* JADX INFO: renamed from: H */
    public int f44482H;

    /* JADX INFO: renamed from: I */
    public ImageView.ScaleType f44483I;

    /* JADX INFO: renamed from: J */
    public View.OnLongClickListener f44484J;

    /* JADX INFO: renamed from: K */
    public CharSequence f44485K;

    /* JADX INFO: renamed from: L */
    public final C3048gr f44486L;

    /* JADX INFO: renamed from: M */
    public boolean f44487M;

    /* JADX INFO: renamed from: N */
    public EditText f44488N;

    /* JADX INFO: renamed from: O */
    public final AccessibilityManager f44489O;

    /* JADX INFO: renamed from: P */
    public AccessibilityManager.TouchExplorationStateChangeListener f44490P;

    /* JADX INFO: renamed from: Q */
    public final r11 f44491Q;

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f44492a;

    /* JADX INFO: renamed from: b */
    public final FrameLayout f44493b;

    /* JADX INFO: renamed from: c */
    public final CheckableImageButton f44494c;

    /* JADX INFO: renamed from: d */
    public ColorStateList f44495d;

    /* JADX INFO: renamed from: e */
    public PorterDuff.Mode f44496e;

    /* JADX INFO: renamed from: f */
    public View.OnLongClickListener f44497f;

    /* JADX INFO: renamed from: g */
    public final CheckableImageButton f44498g;

    /* JADX INFO: renamed from: h */
    public final xh0 f44499h;

    /* JADX INFO: renamed from: i */
    public int f44500i;

    /* JADX INFO: renamed from: j */
    public final LinkedHashSet f44501j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f44502k;

    /* JADX INFO: renamed from: l */
    public PorterDuff.Mode f44503l;

    public is2(TextInputLayout textInputLayout, sq5 sq5Var) {
        super(textInputLayout.getContext());
        final int i = 0;
        this.f44500i = 0;
        this.f44501j = new LinkedHashSet();
        final int i2 = 1;
        this.f44491Q = new r11(this, i2);
        hs2 hs2Var = new hs2(this);
        this.f44489O = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f44492a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f44493b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonM14113a = m14113a(this, layoutInflaterFrom, R$id.text_input_error_icon);
        this.f44494c = checkableImageButtonM14113a;
        CheckableImageButton checkableImageButtonM14113a2 = m14113a(frameLayout, layoutInflaterFrom, R$id.text_input_end_icon);
        this.f44498g = checkableImageButtonM14113a2;
        this.f44499h = new xh0(this, sq5Var);
        C3048gr c3048gr = new C3048gr(getContext(), null);
        this.f44486L = c3048gr;
        int i3 = R$styleable.TextInputLayout_errorIconTint;
        TypedArray typedArray = (TypedArray) sq5Var.f61249c;
        if (typedArray.hasValue(i3)) {
            this.f44495d = pb1.m19053w(getContext(), sq5Var, R$styleable.TextInputLayout_errorIconTint);
        }
        if (typedArray.hasValue(R$styleable.TextInputLayout_errorIconTintMode)) {
            this.f44496e = gka.m12724c(typedArray.getInt(R$styleable.TextInputLayout_errorIconTintMode, -1), null);
        }
        if (typedArray.hasValue(R$styleable.TextInputLayout_errorIconDrawable)) {
            m14122j(sq5Var.m21568j(R$styleable.TextInputLayout_errorIconDrawable));
        }
        checkableImageButtonM14113a.setContentDescription(getResources().getText(R$string.error_icon_content_description));
        checkableImageButtonM14113a.setImportantForAccessibility(2);
        checkableImageButtonM14113a.setClickable(false);
        checkableImageButtonM14113a.setPressable(false);
        checkableImageButtonM14113a.setCheckable(false);
        checkableImageButtonM14113a.setFocusable(false);
        if (!typedArray.hasValue(R$styleable.TextInputLayout_passwordToggleEnabled)) {
            if (typedArray.hasValue(R$styleable.TextInputLayout_endIconTint)) {
                this.f44502k = pb1.m19053w(getContext(), sq5Var, R$styleable.TextInputLayout_endIconTint);
            }
            if (typedArray.hasValue(R$styleable.TextInputLayout_endIconTintMode)) {
                this.f44503l = gka.m12724c(typedArray.getInt(R$styleable.TextInputLayout_endIconTintMode, -1), null);
            }
        }
        if (typedArray.hasValue(R$styleable.TextInputLayout_endIconMode)) {
            m14120h(typedArray.getInt(R$styleable.TextInputLayout_endIconMode, 0));
            if (typedArray.hasValue(R$styleable.TextInputLayout_endIconContentDescription)) {
                m14119g(typedArray.getText(R$styleable.TextInputLayout_endIconContentDescription));
            }
            checkableImageButtonM14113a2.setCheckable(typedArray.getBoolean(R$styleable.TextInputLayout_endIconCheckable, true));
        } else if (typedArray.hasValue(R$styleable.TextInputLayout_passwordToggleEnabled)) {
            if (typedArray.hasValue(R$styleable.TextInputLayout_passwordToggleTint)) {
                this.f44502k = pb1.m19053w(getContext(), sq5Var, R$styleable.TextInputLayout_passwordToggleTint);
            }
            if (typedArray.hasValue(R$styleable.TextInputLayout_passwordToggleTintMode)) {
                this.f44503l = gka.m12724c(typedArray.getInt(R$styleable.TextInputLayout_passwordToggleTintMode, -1), null);
            }
            m14120h(typedArray.getBoolean(R$styleable.TextInputLayout_passwordToggleEnabled, false) ? 1 : 0);
            m14119g(typedArray.getText(R$styleable.TextInputLayout_passwordToggleContentDescription));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(R$styleable.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(R$dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            C3386nv.m17626m("endIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.f44482H) {
            this.f44482H = dimensionPixelSize;
            checkableImageButtonM14113a2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM14113a2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonM14113a.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM14113a.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(R$styleable.TextInputLayout_endIconScaleType)) {
            ImageView.ScaleType scaleTypeM14434b = jfd.m14434b(typedArray.getInt(R$styleable.TextInputLayout_endIconScaleType, -1));
            this.f44483I = scaleTypeM14434b;
            checkableImageButtonM14113a2.setScaleType(scaleTypeM14434b);
            checkableImageButtonM14113a.setScaleType(scaleTypeM14434b);
        }
        c3048gr.setVisibility(8);
        c3048gr.setId(R$id.textinput_suffix_text);
        c3048gr.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c3048gr.setAccessibilityLiveRegion(1);
        c3048gr.setTextAppearance(typedArray.getResourceId(R$styleable.TextInputLayout_suffixTextAppearance, 0));
        if (typedArray.hasValue(R$styleable.TextInputLayout_suffixTextColor)) {
            c3048gr.setTextColor(sq5Var.m21567i(R$styleable.TextInputLayout_suffixTextColor));
        }
        CharSequence text = typedArray.getText(R$styleable.TextInputLayout_suffixText);
        this.f44485K = TextUtils.isEmpty(text) ? null : text;
        c3048gr.setText(text);
        m14127o();
        frameLayout.addView(checkableImageButtonM14113a2);
        addView(c3048gr);
        addView(frameLayout);
        addView(checkableImageButtonM14113a);
        checkableImageButtonM14113a.setOnFocusableChangedListener(new f01(this) { // from class: gs2

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ is2 f41262b;

            {
                this.f41262b = this;
            }

            @Override // p000.f01
            /* JADX INFO: renamed from: b */
            public final void mo10700b() {
                int i4 = i;
                is2 is2Var = this.f41262b;
                switch (i4) {
                    case 0:
                        CheckableImageButton checkableImageButton = is2Var.f44494c;
                        jfd.m14437e(checkableImageButton, checkableImageButton.getContentDescription());
                        break;
                    default:
                        CheckableImageButton checkableImageButton2 = is2Var.f44498g;
                        jfd.m14437e(checkableImageButton2, checkableImageButton2.getContentDescription());
                        break;
                }
            }
        });
        checkableImageButtonM14113a2.setOnFocusableChangedListener(new f01(this) { // from class: gs2

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ is2 f41262b;

            {
                this.f41262b = this;
            }

            @Override // p000.f01
            /* JADX INFO: renamed from: b */
            public final void mo10700b() {
                int i4 = i2;
                is2 is2Var = this.f41262b;
                switch (i4) {
                    case 0:
                        CheckableImageButton checkableImageButton = is2Var.f44494c;
                        jfd.m14437e(checkableImageButton, checkableImageButton.getContentDescription());
                        break;
                    default:
                        CheckableImageButton checkableImageButton2 = is2Var.f44498g;
                        jfd.m14437e(checkableImageButton2, checkableImageButton2.getContentDescription());
                        break;
                }
            }
        });
        textInputLayout.f13238A0.add(hs2Var);
        if (textInputLayout.f13286e != null) {
            hs2Var.m13452a(textInputLayout);
        }
        addOnAttachStateChangeListener(new io0(this, i2));
    }

    /* JADX INFO: renamed from: a */
    public final CheckableImageButton m14113a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R$layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (pb1.m19020H(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    /* JADX INFO: renamed from: b */
    public final js2 m14114b() {
        js2 gx1Var;
        int i = this.f44500i;
        xh0 xh0Var = this.f44499h;
        SparseArray sparseArray = (SparseArray) xh0Var.f68194c;
        js2 js2Var = (js2) sparseArray.get(i);
        if (js2Var != null) {
            return js2Var;
        }
        is2 is2Var = (is2) xh0Var.f68195d;
        if (i != -1) {
            int i2 = 1;
            if (i == 0) {
                gx1Var = new gx1(is2Var, i2);
            } else if (i == 1) {
                gx1Var = new b57(is2Var, xh0Var.f68193b);
            } else if (i == 2) {
                gx1Var = new l31(is2Var);
            } else {
                if (i != 3) {
                    C3386nv.m17626m(ux5.m22988k(i, "Invalid end icon mode: "));
                    return null;
                }
                gx1Var = new ym2(is2Var);
            }
        } else {
            gx1Var = new gx1(is2Var, 0);
        }
        sparseArray.append(i, gx1Var);
        return gx1Var;
    }

    /* JADX INFO: renamed from: c */
    public final int m14115c() {
        int marginStart;
        if (m14116d() || m14117e()) {
            CheckableImageButton checkableImageButton = this.f44498g;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.f44486L.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m14116d() {
        return this.f44493b.getVisibility() == 0 && this.f44498g.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m14117e() {
        return this.f44494c.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: f */
    public final void m14118f(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        js2 js2VarM14114b = m14114b();
        boolean zMo3305j = js2VarM14114b.mo3305j();
        CheckableImageButton checkableImageButton = this.f44498g;
        boolean z4 = true;
        if (!zMo3305j || (z3 = checkableImageButton.f13018d) == js2VarM14114b.mo3306k()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(js2VarM14114b instanceof ym2) || (zIsActivated = checkableImageButton.isActivated()) == ((ym2) js2VarM14114b).f70057l) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            jfd.m14435c(this.f44492a, checkableImageButton, this.f44502k);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m14119g(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f44498g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
            jfd.m14437e(checkableImageButton, charSequence);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m14120h(int i) {
        if (this.f44500i == i) {
            return;
        }
        js2 js2VarM14114b = m14114b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f44490P;
        AccessibilityManager accessibilityManager = this.f44489O;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.f44490P = null;
        js2VarM14114b.mo3309r();
        this.f44500i = i;
        Iterator it = this.f44501j.iterator();
        if (it.hasNext()) {
            throw wq1.m24110f(it);
        }
        m14121i(i != 0);
        js2 js2VarM14114b2 = m14114b();
        int iMo3303d = this.f44499h.f68192a;
        if (iMo3303d == 0) {
            iMo3303d = js2VarM14114b2.mo3303d();
        }
        Drawable drawableM3932U = iMo3303d != 0 ? bna.m3932U(getContext(), iMo3303d) : null;
        CheckableImageButton checkableImageButton = this.f44498g;
        checkableImageButton.setImageDrawable(drawableM3932U);
        TextInputLayout textInputLayout = this.f44492a;
        if (drawableM3932U != null) {
            jfd.m14433a(textInputLayout, checkableImageButton, this.f44502k, this.f44503l);
            jfd.m14435c(textInputLayout, checkableImageButton, this.f44502k);
        }
        checkableImageButton.setCheckable(js2VarM14114b2.mo3305j());
        if (!js2VarM14114b2.mo14634i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        js2VarM14114b2.mo3308q();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListenerMo14633h = js2VarM14114b2.mo14633h();
        this.f44490P = touchExplorationStateChangeListenerMo14633h;
        if (touchExplorationStateChangeListenerMo14633h != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.f44490P);
        }
        View.OnClickListener onClickListenerMo3304f = js2VarM14114b2.mo3304f();
        View.OnLongClickListener onLongClickListener = this.f44484J;
        checkableImageButton.setOnClickListener(onClickListenerMo3304f);
        jfd.m14436d(checkableImageButton, onLongClickListener);
        int iMo3302c = js2VarM14114b2.mo3302c();
        m14119g(iMo3302c != 0 ? getResources().getText(iMo3302c) : null);
        EditText editText = this.f44488N;
        if (editText != null) {
            js2VarM14114b2.mo3307l(editText);
            m14123k(js2VarM14114b2);
        }
        jfd.m14433a(textInputLayout, checkableImageButton, this.f44502k, this.f44503l);
        m14118f(true);
    }

    /* JADX INFO: renamed from: i */
    public final void m14121i(boolean z) {
        EditText editText;
        if (m14116d() != z) {
            CheckableImageButton checkableImageButton = this.f44498g;
            if (!z && checkableImageButton.hasFocus() && (editText = this.f44488N) != null) {
                editText.requestFocus();
            }
            checkableImageButton.setVisibility(z ? 0 : 8);
            m14124l();
            m14126n();
            this.f44492a.m6235s();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m14122j(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f44494c;
        checkableImageButton.setImageDrawable(drawable);
        m14125m();
        jfd.m14433a(this.f44492a, checkableImageButton, this.f44495d, this.f44496e);
    }

    /* JADX INFO: renamed from: k */
    public final void m14123k(js2 js2Var) {
        if (this.f44488N == null) {
            return;
        }
        if (js2Var.mo14631e() != null) {
            this.f44488N.setOnFocusChangeListener(js2Var.mo14631e());
        }
        if (js2Var.mo14632g() != null) {
            this.f44498g.setOnFocusChangeListener(js2Var.mo14632g());
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m14124l() {
        this.f44493b.setVisibility((this.f44498g.getVisibility() != 0 || m14117e()) ? 8 : 0);
        setVisibility((m14116d() || m14117e() || ((this.f44485K == null || this.f44487M) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    /* JADX INFO: renamed from: m */
    public final void m14125m() {
        CheckableImageButton checkableImageButton = this.f44494c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f44492a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f13298k.f69230q && textInputLayout.m6231o()) ? 0 : 8);
        m14124l();
        m14126n();
        if (this.f44500i != 0) {
            return;
        }
        textInputLayout.m6235s();
    }

    /* JADX INFO: renamed from: n */
    public final void m14126n() {
        TextInputLayout textInputLayout = this.f44492a;
        if (textInputLayout.f13286e == null) {
            return;
        }
        this.f44486L.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R$dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.f13286e.getPaddingTop(), (m14116d() || m14117e()) ? 0 : textInputLayout.f13286e.getPaddingEnd(), textInputLayout.f13286e.getPaddingBottom());
    }

    /* JADX INFO: renamed from: o */
    public final void m14127o() {
        C3048gr c3048gr = this.f44486L;
        int visibility = c3048gr.getVisibility();
        int i = (this.f44485K == null || this.f44487M) ? 8 : 0;
        if (visibility != i) {
            m14114b().mo14637o(i == 0);
        }
        m14124l();
        c3048gr.setVisibility(i);
        this.f44492a.m6235s();
    }
}
