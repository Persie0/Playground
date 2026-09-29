package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.C0166e;
import android.text.Editable;
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
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0300b1;
import com.google.android.material.internal.CheckableImageButton;
import com.linguist.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p072dd.C5150c;
import p104f.C5452a;
import p240ld.AbstractC7313m;
import p240ld.C7304d;
import p240ld.C7305e;
import p240ld.C7312l;
import p240ld.C7314n;
import p240ld.C7319s;
import p240ld.C7320t;
import p471x2.C10029b0;
import p471x2.C10040h;
import p471x2.C10049l0;
import p497y2.C10281c;
import p497y2.InterfaceC10282d;
import p507yc.C10343j;
import p507yc.C10347n;

/* JADX INFO: renamed from: com.google.android.material.textfield.a */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public final class C3093a extends LinearLayout {

    /* JADX INFO: renamed from: H */
    public int f15789H;

    /* JADX INFO: renamed from: I */
    public ImageView.ScaleType f15790I;

    /* JADX INFO: renamed from: J */
    public View.OnLongClickListener f15791J;

    /* JADX INFO: renamed from: K */
    public CharSequence f15792K;

    /* JADX INFO: renamed from: L */
    public final AppCompatTextView f15793L;

    /* JADX INFO: renamed from: M */
    public boolean f15794M;

    /* JADX INFO: renamed from: N */
    public EditText f15795N;

    /* JADX INFO: renamed from: O */
    public final AccessibilityManager f15796O;

    /* JADX INFO: renamed from: P */
    public InterfaceC10282d f15797P;

    /* JADX INFO: renamed from: Q */
    public final a f15798Q;

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f15799a;

    /* JADX INFO: renamed from: b */
    public final FrameLayout f15800b;

    /* JADX INFO: renamed from: c */
    public final CheckableImageButton f15801c;

    /* JADX INFO: renamed from: d */
    public ColorStateList f15802d;

    /* JADX INFO: renamed from: e */
    public PorterDuff.Mode f15803e;

    /* JADX INFO: renamed from: f */
    public View.OnLongClickListener f15804f;

    /* JADX INFO: renamed from: g */
    public final CheckableImageButton f15805g;

    /* JADX INFO: renamed from: h */
    public final d f15806h;

    /* JADX INFO: renamed from: i */
    public int f15807i;

    /* JADX INFO: renamed from: j */
    public final LinkedHashSet<TextInputLayout.InterfaceC3092h> f15808j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f15809k;

    /* JADX INFO: renamed from: l */
    public PorterDuff.Mode f15810l;

    /* JADX INFO: renamed from: com.google.android.material.textfield.a$a */
    public class a extends C10343j {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            C3093a.this.m8908b().mo14693a();
        }

        @Override // p507yc.C10343j, android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            C3093a.this.m8908b().mo14714b();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.a$b */
    public class b implements TextInputLayout.InterfaceC3091g {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.InterfaceC3091g
        /* JADX INFO: renamed from: a */
        public final void mo8905a(TextInputLayout textInputLayout) {
            C3093a c3093a = C3093a.this;
            if (c3093a.f15795N == textInputLayout.getEditText()) {
                return;
            }
            EditText editText = c3093a.f15795N;
            a aVar = c3093a.f15798Q;
            if (editText != null) {
                editText.removeTextChangedListener(aVar);
                if (c3093a.f15795N.getOnFocusChangeListener() == c3093a.m8908b().mo14696e()) {
                    c3093a.f15795N.setOnFocusChangeListener(null);
                }
            }
            EditText editText2 = textInputLayout.getEditText();
            c3093a.f15795N = editText2;
            if (editText2 != null) {
                editText2.addTextChangedListener(aVar);
            }
            c3093a.m8908b().mo14699m(c3093a.f15795N);
            c3093a.m8915i(c3093a.m8908b());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.a$c */
    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            AccessibilityManager accessibilityManager;
            C3093a c3093a = C3093a.this;
            if (c3093a.f15797P == null || (accessibilityManager = c3093a.f15796O) == null) {
                return;
            }
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            if (C10029b0.g.m18698b(c3093a)) {
                C10281c.m19254a(accessibilityManager, c3093a.f15797P);
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            AccessibilityManager accessibilityManager;
            C3093a c3093a = C3093a.this;
            InterfaceC10282d interfaceC10282d = c3093a.f15797P;
            if (interfaceC10282d == null || (accessibilityManager = c3093a.f15796O) == null) {
                return;
            }
            C10281c.m19255b(accessibilityManager, interfaceC10282d);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.a$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public final SparseArray<AbstractC7313m> f15814a = new SparseArray<>();

        /* JADX INFO: renamed from: b */
        public final C3093a f15815b;

        /* JADX INFO: renamed from: c */
        public final int f15816c;

        /* JADX INFO: renamed from: d */
        public final int f15817d;

        public d(C3093a c3093a, C0300b1 c0300b1) {
            this.f15815b = c3093a;
            this.f15816c = c0300b1.m1120i(26, 0);
            this.f15817d = c0300b1.m1120i(50, 0);
        }
    }

    public C3093a(TextInputLayout textInputLayout, C0300b1 c0300b1) {
        CharSequence charSequenceM1122k;
        super(textInputLayout.getContext());
        this.f15807i = 0;
        this.f15808j = new LinkedHashSet<>();
        this.f15798Q = new a();
        b bVar = new b();
        this.f15796O = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f15799a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f15800b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonM8907a = m8907a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f15801c = checkableImageButtonM8907a;
        CheckableImageButton checkableImageButtonM8907a2 = m8907a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f15805g = checkableImageButtonM8907a2;
        this.f15806h = new d(this, c0300b1);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.f15793L = appCompatTextView;
        if (c0300b1.m1123l(36)) {
            this.f15802d = C5150c.m10926b(getContext(), c0300b1, 36);
        }
        if (c0300b1.m1123l(37)) {
            this.f15803e = C10347n.m19366f(c0300b1.m1119h(37, -1), null);
        }
        if (c0300b1.m1123l(35)) {
            m8914h(c0300b1.m1116e(35));
        }
        checkableImageButtonM8907a.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.d.m18682s(checkableImageButtonM8907a, 2);
        checkableImageButtonM8907a.setClickable(false);
        checkableImageButtonM8907a.setPressable(false);
        checkableImageButtonM8907a.setFocusable(false);
        if (!c0300b1.m1123l(51)) {
            if (c0300b1.m1123l(30)) {
                this.f15809k = C5150c.m10926b(getContext(), c0300b1, 30);
            }
            if (c0300b1.m1123l(31)) {
                this.f15810l = C10347n.m19366f(c0300b1.m1119h(31, -1), null);
            }
        }
        if (c0300b1.m1123l(28)) {
            m8912f(c0300b1.m1119h(28, 0));
            if (c0300b1.m1123l(25) && checkableImageButtonM8907a2.getContentDescription() != (charSequenceM1122k = c0300b1.m1122k(25))) {
                checkableImageButtonM8907a2.setContentDescription(charSequenceM1122k);
            }
            checkableImageButtonM8907a2.setCheckable(c0300b1.m1112a(24, true));
        } else if (c0300b1.m1123l(51)) {
            if (c0300b1.m1123l(52)) {
                this.f15809k = C5150c.m10926b(getContext(), c0300b1, 52);
            }
            if (c0300b1.m1123l(53)) {
                this.f15810l = C10347n.m19366f(c0300b1.m1119h(53, -1), null);
            }
            m8912f(c0300b1.m1112a(51, false) ? 1 : 0);
            CharSequence charSequenceM1122k2 = c0300b1.m1122k(49);
            if (checkableImageButtonM8907a2.getContentDescription() != charSequenceM1122k2) {
                checkableImageButtonM8907a2.setContentDescription(charSequenceM1122k2);
            }
        }
        int iM1115d = c0300b1.m1115d(27, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (iM1115d < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (iM1115d != this.f15789H) {
            this.f15789H = iM1115d;
            checkableImageButtonM8907a2.setMinimumWidth(iM1115d);
            checkableImageButtonM8907a2.setMinimumHeight(iM1115d);
            checkableImageButtonM8907a.setMinimumWidth(iM1115d);
            checkableImageButtonM8907a.setMinimumHeight(iM1115d);
        }
        if (c0300b1.m1123l(29)) {
            ImageView.ScaleType scaleTypeM14718b = C7314n.m14718b(c0300b1.m1119h(29, -1));
            this.f15790I = scaleTypeM14718b;
            checkableImageButtonM8907a2.setScaleType(scaleTypeM14718b);
            checkableImageButtonM8907a.setScaleType(scaleTypeM14718b);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        C10029b0.g.m18702f(appCompatTextView, 1);
        appCompatTextView.setTextAppearance(c0300b1.m1120i(70, 0));
        if (c0300b1.m1123l(71)) {
            appCompatTextView.setTextColor(c0300b1.m1113b(71));
        }
        CharSequence charSequenceM1122k3 = c0300b1.m1122k(69);
        this.f15792K = TextUtils.isEmpty(charSequenceM1122k3) ? null : charSequenceM1122k3;
        appCompatTextView.setText(charSequenceM1122k3);
        m8919m();
        frameLayout.addView(checkableImageButtonM8907a2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonM8907a);
        textInputLayout.f15779x0.add(bVar);
        if (textInputLayout.f15750d != null) {
            bVar.mo8905a(textInputLayout);
        }
        addOnAttachStateChangeListener(new c());
    }

    /* JADX INFO: renamed from: a */
    public final CheckableImageButton m8907a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i10);
        if (C5150c.m10929e(getContext())) {
            C10040h.m18814h((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC7313m m8908b() {
        AbstractC7313m c7305e;
        int i10 = this.f15807i;
        d dVar = this.f15806h;
        SparseArray<AbstractC7313m> sparseArray = dVar.f15814a;
        AbstractC7313m c7320t = sparseArray.get(i10);
        if (c7320t == null) {
            C3093a c3093a = dVar.f15815b;
            if (i10 == -1) {
                c7305e = new C7305e(c3093a);
            } else if (i10 != 0) {
                if (i10 == 1) {
                    c7320t = new C7320t(c3093a, dVar.f15817d);
                } else if (i10 == 2) {
                    c7305e = new C7304d(c3093a);
                } else {
                    if (i10 != 3) {
                        throw new IllegalArgumentException(C0166e.m761g("Invalid end icon mode: ", i10));
                    }
                    c7305e = new C7312l(c3093a);
                }
                sparseArray.append(i10, c7320t);
            } else {
                c7305e = new C7319s(c3093a);
            }
            c7320t = c7305e;
            sparseArray.append(i10, c7320t);
        }
        return c7320t;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m8909c() {
        return this.f15800b.getVisibility() == 0 && this.f15805g.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m8910d() {
        return this.f15801c.getVisibility() == 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m8911e(boolean z10) {
        boolean z11;
        boolean zIsActivated;
        boolean zIsChecked;
        AbstractC7313m abstractC7313mM8908b = m8908b();
        boolean zMo14715k = abstractC7313mM8908b.mo14715k();
        CheckableImageButton checkableImageButton = this.f15805g;
        boolean z12 = true;
        if (!zMo14715k || (zIsChecked = checkableImageButton.isChecked()) == abstractC7313mM8908b.mo14709l()) {
            z11 = false;
        } else {
            checkableImageButton.setChecked(!zIsChecked);
            z11 = true;
        }
        if (!(abstractC7313mM8908b instanceof C7312l) || (zIsActivated = checkableImageButton.isActivated()) == abstractC7313mM8908b.mo14708j()) {
            z12 = z11;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (!z10 && !z12) {
            return;
        }
        C7314n.m14719c(this.f15799a, checkableImageButton, this.f15809k);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public final void m8912f(int i10) {
        if (this.f15807i == i10) {
            return;
        }
        AbstractC7313m abstractC7313mM8908b = m8908b();
        InterfaceC10282d interfaceC10282d = this.f15797P;
        AccessibilityManager accessibilityManager = this.f15796O;
        if (interfaceC10282d != null && accessibilityManager != null) {
            C10281c.m19255b(accessibilityManager, interfaceC10282d);
        }
        this.f15797P = null;
        abstractC7313mM8908b.mo14702s();
        this.f15807i = i10;
        Iterator<TextInputLayout.InterfaceC3092h> it = this.f15808j.iterator();
        while (it.hasNext()) {
            it.next().m8906a();
        }
        m8913g(i10 != 0);
        AbstractC7313m abstractC7313mM8908b2 = m8908b();
        int iMo14695d = this.f15806h.f15816c;
        if (iMo14695d == 0) {
            iMo14695d = abstractC7313mM8908b2.mo14695d();
        }
        Drawable drawableM11672a = iMo14695d != 0 ? C5452a.m11672a(getContext(), iMo14695d) : null;
        CheckableImageButton checkableImageButton = this.f15805g;
        checkableImageButton.setImageDrawable(drawableM11672a);
        TextInputLayout textInputLayout = this.f15799a;
        if (drawableM11672a != null) {
            C7314n.m14717a(textInputLayout, checkableImageButton, this.f15809k, this.f15810l);
            C7314n.m14719c(textInputLayout, checkableImageButton, this.f15809k);
        }
        int iMo14694c = abstractC7313mM8908b2.mo14694c();
        CharSequence text = iMo14694c != 0 ? getResources().getText(iMo14694c) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(abstractC7313mM8908b2.mo14715k());
        if (!abstractC7313mM8908b2.mo14707i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        abstractC7313mM8908b2.mo14701r();
        InterfaceC10282d interfaceC10282dMo14706h = abstractC7313mM8908b2.mo14706h();
        this.f15797P = interfaceC10282dMo14706h;
        if (interfaceC10282dMo14706h != null && accessibilityManager != null) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            if (C10029b0.g.m18698b(this)) {
                C10281c.m19254a(accessibilityManager, this.f15797P);
            }
        }
        View.OnClickListener onClickListenerMo14697f = abstractC7313mM8908b2.mo14697f();
        View.OnLongClickListener onLongClickListener = this.f15791J;
        checkableImageButton.setOnClickListener(onClickListenerMo14697f);
        C7314n.m14720d(checkableImageButton, onLongClickListener);
        EditText editText = this.f15795N;
        if (editText != null) {
            abstractC7313mM8908b2.mo14699m(editText);
            m8915i(abstractC7313mM8908b2);
        }
        C7314n.m14717a(textInputLayout, checkableImageButton, this.f15809k, this.f15810l);
        m8911e(true);
    }

    /* JADX INFO: renamed from: g */
    public final void m8913g(boolean z10) {
        if (m8909c() != z10) {
            this.f15805g.setVisibility(z10 ? 0 : 8);
            m8916j();
            m8918l();
            this.f15799a.m8897p();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m8914h(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f15801c;
        checkableImageButton.setImageDrawable(drawable);
        m8917k();
        C7314n.m14717a(this.f15799a, checkableImageButton, this.f15802d, this.f15803e);
    }

    /* JADX INFO: renamed from: i */
    public final void m8915i(AbstractC7313m abstractC7313m) {
        if (this.f15795N == null) {
            return;
        }
        if (abstractC7313m.mo14696e() != null) {
            this.f15795N.setOnFocusChangeListener(abstractC7313m.mo14696e());
        }
        if (abstractC7313m.mo14698g() != null) {
            this.f15805g.setOnFocusChangeListener(abstractC7313m.mo14698g());
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m8916j() {
        this.f15800b.setVisibility((this.f15805g.getVisibility() != 0 || m8910d()) ? 8 : 0);
        setVisibility(m8909c() || m8910d() || ((this.f15792K == null || this.f15794M) ? '\b' : (char) 0) == 0 ? 0 : 8);
    }

    /* JADX INFO: renamed from: k */
    public final void m8917k() {
        CheckableImageButton checkableImageButton = this.f15801c;
        Drawable drawable = checkableImageButton.getDrawable();
        boolean z10 = true;
        TextInputLayout textInputLayout = this.f15799a;
        checkableImageButton.setVisibility(drawable != null && textInputLayout.f15762j.f40973q && textInputLayout.m8894m() ? 0 : 8);
        m8916j();
        m8918l();
        if (this.f15807i == 0) {
            z10 = false;
        }
        if (z10) {
            return;
        }
        textInputLayout.m8897p();
    }

    /* JADX INFO: renamed from: l */
    public final void m8918l() {
        int iM18687e;
        TextInputLayout textInputLayout = this.f15799a;
        if (textInputLayout.f15750d == null) {
            return;
        }
        if (m8909c() || m8910d()) {
            iM18687e = 0;
        } else {
            EditText editText = textInputLayout.f15750d;
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            iM18687e = C10029b0.e.m18687e(editText);
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f15750d.getPaddingTop();
        int paddingBottom = textInputLayout.f15750d.getPaddingBottom();
        WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
        C10029b0.e.m18693k(this.f15793L, dimensionPixelSize, paddingTop, iM18687e, paddingBottom);
    }

    /* JADX INFO: renamed from: m */
    public final void m8919m() {
        AppCompatTextView appCompatTextView = this.f15793L;
        int visibility = appCompatTextView.getVisibility();
        int i10 = (this.f15792K == null || this.f15794M) ? 8 : 0;
        if (visibility != i10) {
            m8908b().mo14700p(i10 == 0);
        }
        m8916j();
        appCompatTextView.setVisibility(i10);
        this.f15799a.m8897p();
    }
}
