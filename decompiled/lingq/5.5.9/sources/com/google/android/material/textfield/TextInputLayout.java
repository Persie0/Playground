package com.google.android.material.textfield;

import ae.C0062b;
import android.R;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
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
import android.support.v4.media.session.C0166e;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0300b1;
import androidx.appcompat.widget.C0311f0;
import androidx.appcompat.widget.C0319i;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.C3040a;
import com.google.android.material.internal.CheckableImageButton;
import dm.C5206f;
import gd.C5768g;
import gd.C5772k;
import gd.InterfaceC5764c;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import md.C7542a;
import p024b3.C1304k;
import p072dd.C5148a;
import p072dd.C5149b;
import p072dd.C5150c;
import p072dd.C5151d;
import p104f.C5452a;
import p153hc.C6031a;
import p177ic.C6308a;
import p240ld.C7306f;
import p240ld.C7312l;
import p240ld.C7314n;
import p240ld.C7315o;
import p240ld.C7316p;
import p240ld.C7318r;
import p240ld.C7321u;
import p254m2.C7472a;
import p291o7.C8002l;
import p312p2.C8169a;
import p329q2.C8488a;
import p406u4.C9419k0;
import p406u4.C9422m;
import p426v2.C9627a;
import p426v2.C9633g;
import p471x2.C10026a;
import p471x2.C10029b0;
import p471x2.C10040h;
import p471x2.C10049l0;
import p497y2.C10284f;
import p507yc.C10335b;
import p507yc.C10336c;
import p507yc.C10344k;
import p507yc.C10347n;
import p531zc.C10477a;

/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {

    /* JADX INFO: renamed from: T0 */
    public static final int[][] f15708T0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* JADX INFO: renamed from: A0 */
    public Drawable f15709A0;

    /* JADX INFO: renamed from: B0 */
    public ColorStateList f15710B0;

    /* JADX INFO: renamed from: C0 */
    public ColorStateList f15711C0;

    /* JADX INFO: renamed from: D0 */
    public int f15712D0;

    /* JADX INFO: renamed from: E0 */
    public int f15713E0;

    /* JADX INFO: renamed from: F0 */
    public int f15714F0;

    /* JADX INFO: renamed from: G0 */
    public ColorStateList f15715G0;

    /* JADX INFO: renamed from: H */
    public boolean f15716H;

    /* JADX INFO: renamed from: H0 */
    public int f15717H0;

    /* JADX INFO: renamed from: I */
    public InterfaceC3090f f15718I;

    /* JADX INFO: renamed from: I0 */
    public int f15719I0;

    /* JADX INFO: renamed from: J */
    public AppCompatTextView f15720J;

    /* JADX INFO: renamed from: J0 */
    public int f15721J0;

    /* JADX INFO: renamed from: K */
    public int f15722K;

    /* JADX INFO: renamed from: K0 */
    public int f15723K0;

    /* JADX INFO: renamed from: L */
    public int f15724L;

    /* JADX INFO: renamed from: L0 */
    public int f15725L0;

    /* JADX INFO: renamed from: M */
    public CharSequence f15726M;

    /* JADX INFO: renamed from: M0 */
    public boolean f15727M0;

    /* JADX INFO: renamed from: N */
    public boolean f15728N;

    /* JADX INFO: renamed from: N0 */
    public final C3040a f15729N0;

    /* JADX INFO: renamed from: O */
    public AppCompatTextView f15730O;

    /* JADX INFO: renamed from: O0 */
    public boolean f15731O0;

    /* JADX INFO: renamed from: P */
    public ColorStateList f15732P;

    /* JADX INFO: renamed from: P0 */
    public boolean f15733P0;

    /* JADX INFO: renamed from: Q */
    public int f15734Q;

    /* JADX INFO: renamed from: Q0 */
    public ValueAnimator f15735Q0;

    /* JADX INFO: renamed from: R */
    public C9422m f15736R;

    /* JADX INFO: renamed from: R0 */
    public boolean f15737R0;

    /* JADX INFO: renamed from: S */
    public C9422m f15738S;

    /* JADX INFO: renamed from: S0 */
    public boolean f15739S0;

    /* JADX INFO: renamed from: T */
    public ColorStateList f15740T;

    /* JADX INFO: renamed from: U */
    public ColorStateList f15741U;

    /* JADX INFO: renamed from: V */
    public boolean f15742V;

    /* JADX INFO: renamed from: W */
    public CharSequence f15743W;

    /* JADX INFO: renamed from: a */
    public final FrameLayout f15744a;

    /* JADX INFO: renamed from: a0 */
    public boolean f15745a0;

    /* JADX INFO: renamed from: b */
    public final C7321u f15746b;

    /* JADX INFO: renamed from: b0 */
    public C5768g f15747b0;

    /* JADX INFO: renamed from: c */
    public final C3093a f15748c;

    /* JADX INFO: renamed from: c0 */
    public C5768g f15749c0;

    /* JADX INFO: renamed from: d */
    public EditText f15750d;

    /* JADX INFO: renamed from: d0 */
    public StateListDrawable f15751d0;

    /* JADX INFO: renamed from: e */
    public CharSequence f15752e;

    /* JADX INFO: renamed from: e0 */
    public boolean f15753e0;

    /* JADX INFO: renamed from: f */
    public int f15754f;

    /* JADX INFO: renamed from: f0 */
    public C5768g f15755f0;

    /* JADX INFO: renamed from: g */
    public int f15756g;

    /* JADX INFO: renamed from: g0 */
    public C5768g f15757g0;

    /* JADX INFO: renamed from: h */
    public int f15758h;

    /* JADX INFO: renamed from: h0 */
    public C5772k f15759h0;

    /* JADX INFO: renamed from: i */
    public int f15760i;

    /* JADX INFO: renamed from: i0 */
    public boolean f15761i0;

    /* JADX INFO: renamed from: j */
    public final C7315o f15762j;

    /* JADX INFO: renamed from: j0 */
    public final int f15763j0;

    /* JADX INFO: renamed from: k */
    public boolean f15764k;

    /* JADX INFO: renamed from: k0 */
    public int f15765k0;

    /* JADX INFO: renamed from: l */
    public int f15766l;

    /* JADX INFO: renamed from: l0 */
    public int f15767l0;

    /* JADX INFO: renamed from: m0 */
    public int f15768m0;

    /* JADX INFO: renamed from: n0 */
    public int f15769n0;

    /* JADX INFO: renamed from: o0 */
    public int f15770o0;

    /* JADX INFO: renamed from: p0 */
    public int f15771p0;

    /* JADX INFO: renamed from: q0 */
    public int f15772q0;

    /* JADX INFO: renamed from: r0 */
    public final Rect f15773r0;

    /* JADX INFO: renamed from: s0 */
    public final Rect f15774s0;

    /* JADX INFO: renamed from: t0 */
    public final RectF f15775t0;

    /* JADX INFO: renamed from: u0 */
    public Typeface f15776u0;

    /* JADX INFO: renamed from: v0 */
    public ColorDrawable f15777v0;

    /* JADX INFO: renamed from: w0 */
    public int f15778w0;

    /* JADX INFO: renamed from: x0 */
    public final LinkedHashSet<InterfaceC3091g> f15779x0;

    /* JADX INFO: renamed from: y0 */
    public ColorDrawable f15780y0;

    /* JADX INFO: renamed from: z0 */
    public int f15781z0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3084a();

        /* JADX INFO: renamed from: c */
        public CharSequence f15782c;

        /* JADX INFO: renamed from: d */
        public boolean f15783d;

        /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$SavedState$a */
        public class C3084a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f15782c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f15783d = parcel.readInt() != 1 ? false : true;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f15782c) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f5635a, i10);
            TextUtils.writeToParcel(this.f15782c, parcel, i10);
            parcel.writeInt(this.f15783d ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$a */
    public class C3085a implements TextWatcher {
        public C3085a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.m8901t(!textInputLayout.f15739S0, false);
            if (textInputLayout.f15764k) {
                textInputLayout.m8895n(editable);
            }
            if (textInputLayout.f15728N) {
                textInputLayout.m8902u(editable);
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$b */
    public class RunnableC3086b implements Runnable {
        public RunnableC3086b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            CheckableImageButton checkableImageButton = TextInputLayout.this.f15748c.f15805g;
            checkableImageButton.performClick();
            checkableImageButton.jumpDrawablesToCurrentState();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$c */
    public class RunnableC3087c implements Runnable {
        public RunnableC3087c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            TextInputLayout.this.f15750d.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$d */
    public class C3088d implements ValueAnimator.AnimatorUpdateListener {
        public C3088d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f15729N0.m8805k(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$e */
    public static class C3089e extends C10026a {

        /* JADX INFO: renamed from: d */
        public final TextInputLayout f15788d;

        public C3089e(TextInputLayout textInputLayout) {
            this.f15788d = textInputLayout;
        }

        @Override // p471x2.C10026a
        /* JADX INFO: renamed from: d */
        public final void mo2999d(View view, C10284f c10284f) {
            View.AccessibilityDelegate accessibilityDelegate = this.f50989a;
            AccessibilityNodeInfo accessibilityNodeInfo = c10284f.f51739a;
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            TextInputLayout textInputLayout = this.f15788d;
            EditText editText = textInputLayout.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = textInputLayout.getHint();
            CharSequence error = textInputLayout.getError();
            CharSequence placeholderText = textInputLayout.getPlaceholderText();
            int counterMaxLength = textInputLayout.getCounterMaxLength();
            CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
            boolean z10 = !TextUtils.isEmpty(text);
            boolean z11 = !TextUtils.isEmpty(hint);
            boolean z12 = !textInputLayout.f15727M0;
            boolean z13 = !TextUtils.isEmpty(error);
            boolean z14 = z13 || !TextUtils.isEmpty(counterOverflowDescription);
            String string = z11 ? hint.toString() : "";
            C7321u c7321u = textInputLayout.f15746b;
            AppCompatTextView appCompatTextView = c7321u.f41004b;
            if (appCompatTextView.getVisibility() == 0) {
                accessibilityNodeInfo.setLabelFor(appCompatTextView);
                accessibilityNodeInfo.setTraversalAfter(appCompatTextView);
            } else {
                accessibilityNodeInfo.setTraversalAfter(c7321u.f41006d);
            }
            if (z10) {
                c10284f.m19270o(text);
            } else if (!TextUtils.isEmpty(string)) {
                c10284f.m19270o(string);
                if (z12 && placeholderText != null) {
                    c10284f.m19270o(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                c10284f.m19270o(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                accessibilityNodeInfo.setHintText(string);
                accessibilityNodeInfo.setShowingHintText(true ^ z10);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
            if (z14) {
                if (!z13) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfo.setError(error);
            }
            AppCompatTextView appCompatTextView2 = textInputLayout.f15762j.f40981y;
            if (appCompatTextView2 != null) {
                accessibilityNodeInfo.setLabelFor(appCompatTextView2);
            }
            textInputLayout.f15748c.m8908b().mo14710n(c10284f);
        }

        @Override // p471x2.C10026a
        /* JADX INFO: renamed from: e */
        public final void mo4451e(View view, AccessibilityEvent accessibilityEvent) {
            super.mo4451e(view, accessibilityEvent);
            this.f15788d.f15748c.m8908b().mo14711o(accessibilityEvent);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$f */
    public interface InterfaceC3090f {
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$g */
    public interface InterfaceC3091g {
        /* JADX INFO: renamed from: a */
        void mo8905a(TextInputLayout textInputLayout);
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.TextInputLayout$h */
    public interface InterfaceC3092h {
        /* JADX INFO: renamed from: a */
        void m8906a();
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(C7542a.m15048a(context, attributeSet, com.linguist.R.attr.textInputStyle, com.linguist.R.style.Widget_Design_TextInputLayout), attributeSet, com.linguist.R.attr.textInputStyle);
        this.f15754f = -1;
        this.f15756g = -1;
        this.f15758h = -1;
        this.f15760i = -1;
        this.f15762j = new C7315o(this);
        this.f15718I = new C8002l(19);
        this.f15773r0 = new Rect();
        this.f15774s0 = new Rect();
        this.f15775t0 = new RectF();
        this.f15779x0 = new LinkedHashSet<>();
        C3040a c3040a = new C3040a(this);
        this.f15729N0 = c3040a;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f15744a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = C6308a.f36523a;
        c3040a.f15374Q = linearInterpolator;
        c3040a.m8802h(false);
        c3040a.f15373P = linearInterpolator;
        c3040a.m8802h(false);
        if (c3040a.f15396g != 8388659) {
            c3040a.f15396g = 8388659;
            c3040a.m8802h(false);
        }
        C0300b1 c0300b1M19358e = C10344k.m19358e(context2, attributeSet, C6031a.f35648Q, com.linguist.R.attr.textInputStyle, com.linguist.R.style.Widget_Design_TextInputLayout, 22, 20, 38, 43, 47);
        C7321u c7321u = new C7321u(this, c0300b1M19358e);
        this.f15746b = c7321u;
        this.f15742V = c0300b1M19358e.m1112a(46, true);
        setHint(c0300b1M19358e.m1122k(4));
        this.f15733P0 = c0300b1M19358e.m1112a(45, true);
        this.f15731O0 = c0300b1M19358e.m1112a(40, true);
        if (c0300b1M19358e.m1123l(6)) {
            setMinEms(c0300b1M19358e.m1119h(6, -1));
        } else if (c0300b1M19358e.m1123l(3)) {
            setMinWidth(c0300b1M19358e.m1115d(3, -1));
        }
        if (c0300b1M19358e.m1123l(5)) {
            setMaxEms(c0300b1M19358e.m1119h(5, -1));
        } else if (c0300b1M19358e.m1123l(2)) {
            setMaxWidth(c0300b1M19358e.m1115d(2, -1));
        }
        this.f15759h0 = new C5772k(C5772k.m12150b(context2, attributeSet, com.linguist.R.attr.textInputStyle, com.linguist.R.style.Widget_Design_TextInputLayout));
        this.f15763j0 = context2.getResources().getDimensionPixelOffset(com.linguist.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f15767l0 = c0300b1M19358e.m1114c(9, 0);
        this.f15769n0 = c0300b1M19358e.m1115d(16, context2.getResources().getDimensionPixelSize(com.linguist.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f15770o0 = c0300b1M19358e.m1115d(17, context2.getResources().getDimensionPixelSize(com.linguist.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f15768m0 = this.f15769n0;
        TypedArray typedArray = c0300b1M19358e.f1134b;
        float dimension = typedArray.getDimension(13, -1.0f);
        float dimension2 = typedArray.getDimension(12, -1.0f);
        float dimension3 = typedArray.getDimension(10, -1.0f);
        float dimension4 = typedArray.getDimension(11, -1.0f);
        C5772k c5772k = this.f15759h0;
        c5772k.getClass();
        C5772k.a aVar = new C5772k.a(c5772k);
        if (dimension >= 0.0f) {
            aVar.m12159f(dimension);
        }
        if (dimension2 >= 0.0f) {
            aVar.m12160g(dimension2);
        }
        if (dimension3 >= 0.0f) {
            aVar.m12158e(dimension3);
        }
        if (dimension4 >= 0.0f) {
            aVar.m12157d(dimension4);
        }
        this.f15759h0 = new C5772k(aVar);
        ColorStateList colorStateListM10926b = C5150c.m10926b(context2, c0300b1M19358e, 7);
        if (colorStateListM10926b != null) {
            int defaultColor = colorStateListM10926b.getDefaultColor();
            this.f15717H0 = defaultColor;
            this.f15772q0 = defaultColor;
            if (colorStateListM10926b.isStateful()) {
                this.f15719I0 = colorStateListM10926b.getColorForState(new int[]{-16842910}, -1);
                this.f15721J0 = colorStateListM10926b.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f15723K0 = colorStateListM10926b.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f15721J0 = this.f15717H0;
                ColorStateList colorStateListM14842b = C7472a.m14842b(com.linguist.R.color.mtrl_filled_background_color, context2);
                this.f15719I0 = colorStateListM14842b.getColorForState(new int[]{-16842910}, -1);
                this.f15723K0 = colorStateListM14842b.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f15772q0 = 0;
            this.f15717H0 = 0;
            this.f15719I0 = 0;
            this.f15721J0 = 0;
            this.f15723K0 = 0;
        }
        if (c0300b1M19358e.m1123l(1)) {
            ColorStateList colorStateListM1113b = c0300b1M19358e.m1113b(1);
            this.f15711C0 = colorStateListM1113b;
            this.f15710B0 = colorStateListM1113b;
        }
        ColorStateList colorStateListM10926b2 = C5150c.m10926b(context2, c0300b1M19358e, 14);
        this.f15714F0 = typedArray.getColor(14, 0);
        Object obj = C7472a.f41322a;
        this.f15712D0 = C7472a.d.m14851a(context2, com.linguist.R.color.mtrl_textinput_default_box_stroke_color);
        this.f15725L0 = C7472a.d.m14851a(context2, com.linguist.R.color.mtrl_textinput_disabled_color);
        this.f15713E0 = C7472a.d.m14851a(context2, com.linguist.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListM10926b2 != null) {
            setBoxStrokeColorStateList(colorStateListM10926b2);
        }
        if (c0300b1M19358e.m1123l(15)) {
            setBoxStrokeErrorColor(C5150c.m10926b(context2, c0300b1M19358e, 15));
        }
        if (c0300b1M19358e.m1120i(47, -1) != -1) {
            setHintTextAppearance(c0300b1M19358e.m1120i(47, 0));
        }
        int iM1120i = c0300b1M19358e.m1120i(38, 0);
        CharSequence charSequenceM1122k = c0300b1M19358e.m1122k(33);
        int iM1119h = c0300b1M19358e.m1119h(32, 1);
        boolean zM1112a = c0300b1M19358e.m1112a(34, false);
        int iM1120i2 = c0300b1M19358e.m1120i(43, 0);
        boolean zM1112a2 = c0300b1M19358e.m1112a(42, false);
        CharSequence charSequenceM1122k2 = c0300b1M19358e.m1122k(41);
        int iM1120i3 = c0300b1M19358e.m1120i(55, 0);
        CharSequence charSequenceM1122k3 = c0300b1M19358e.m1122k(54);
        boolean zM1112a3 = c0300b1M19358e.m1112a(18, false);
        setCounterMaxLength(c0300b1M19358e.m1119h(19, -1));
        this.f15724L = c0300b1M19358e.m1120i(22, 0);
        this.f15722K = c0300b1M19358e.m1120i(20, 0);
        setBoxBackgroundMode(c0300b1M19358e.m1119h(8, 0));
        setErrorContentDescription(charSequenceM1122k);
        setErrorAccessibilityLiveRegion(iM1119h);
        setCounterOverflowTextAppearance(this.f15722K);
        setHelperTextTextAppearance(iM1120i2);
        setErrorTextAppearance(iM1120i);
        setCounterTextAppearance(this.f15724L);
        setPlaceholderText(charSequenceM1122k3);
        setPlaceholderTextAppearance(iM1120i3);
        if (c0300b1M19358e.m1123l(39)) {
            setErrorTextColor(c0300b1M19358e.m1113b(39));
        }
        if (c0300b1M19358e.m1123l(44)) {
            setHelperTextColor(c0300b1M19358e.m1113b(44));
        }
        if (c0300b1M19358e.m1123l(48)) {
            setHintTextColor(c0300b1M19358e.m1113b(48));
        }
        if (c0300b1M19358e.m1123l(23)) {
            setCounterTextColor(c0300b1M19358e.m1113b(23));
        }
        if (c0300b1M19358e.m1123l(21)) {
            setCounterOverflowTextColor(c0300b1M19358e.m1113b(21));
        }
        if (c0300b1M19358e.m1123l(56)) {
            setPlaceholderTextColor(c0300b1M19358e.m1113b(56));
        }
        C3093a c3093a = new C3093a(this, c0300b1M19358e);
        this.f15748c = c3093a;
        boolean zM1112a4 = c0300b1M19358e.m1112a(0, true);
        c0300b1M19358e.m1124n();
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.d.m18682s(this, 2);
        C10029b0.l.m18754l(this, 1);
        frameLayout.addView(c7321u);
        frameLayout.addView(c3093a);
        addView(frameLayout);
        setEnabled(zM1112a4);
        setHelperTextEnabled(zM1112a2);
        setErrorEnabled(zM1112a);
        setCounterEnabled(zM1112a3);
        setHelperText(charSequenceM1122k2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f15750d;
        if (editText instanceof AutoCompleteTextView) {
            if (!(editText.getInputType() != 0)) {
                int iM340d1 = C0062b.m340d1(this.f15750d, com.linguist.R.attr.colorControlHighlight);
                int i10 = this.f15765k0;
                int[][] iArr = f15708T0;
                if (i10 != 2) {
                    if (i10 != 1) {
                        return null;
                    }
                    C5768g c5768g = this.f15747b0;
                    int i11 = this.f15772q0;
                    return new RippleDrawable(new ColorStateList(iArr, new int[]{C0062b.m250B1(0.1f, iM340d1, i11), i11}), c5768g, c5768g);
                }
                Context context = getContext();
                C5768g c5768g2 = this.f15747b0;
                int iM337c1 = C0062b.m337c1(context, com.linguist.R.attr.colorSurface, "TextInputLayout");
                C5768g c5768g3 = new C5768g(c5768g2.f34857a.f34870a);
                int iM250B1 = C0062b.m250B1(0.1f, iM340d1, iM337c1);
                c5768g3.m12141m(new ColorStateList(iArr, new int[]{iM250B1, 0}));
                c5768g3.setTint(iM337c1);
                ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iM250B1, iM337c1});
                C5768g c5768g4 = new C5768g(c5768g2.f34857a.f34870a);
                c5768g4.setTint(-1);
                return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c5768g3, c5768g4), c5768g2});
            }
        }
        return this.f15747b0;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f15751d0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f15751d0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f15751d0.addState(new int[0], m8888f(false));
        }
        return this.f15751d0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f15749c0 == null) {
            this.f15749c0 = m8888f(true);
        }
        return this.f15749c0;
    }

    /* JADX INFO: renamed from: k */
    public static void m8882k(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                m8882k((ViewGroup) childAt, z10);
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private void setEditText(EditText editText) {
        if (this.f15750d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f15750d = editText;
        int i10 = this.f15754f;
        if (i10 != -1) {
            setMinEms(i10);
        } else {
            setMinWidth(this.f15758h);
        }
        int i11 = this.f15756g;
        if (i11 != -1) {
            setMaxEms(i11);
        } else {
            setMaxWidth(this.f15760i);
        }
        this.f15753e0 = false;
        m8891i();
        setTextInputAccessibilityDelegate(new C3089e(this));
        Typeface typeface = this.f15750d.getTypeface();
        C3040a c3040a = this.f15729N0;
        c3040a.m8807m(typeface);
        float textSize = this.f15750d.getTextSize();
        if (c3040a.f15397h != textSize) {
            c3040a.f15397h = textSize;
            c3040a.m8802h(false);
        }
        float letterSpacing = this.f15750d.getLetterSpacing();
        if (c3040a.f15380W != letterSpacing) {
            c3040a.f15380W = letterSpacing;
            c3040a.m8802h(false);
        }
        int gravity = this.f15750d.getGravity();
        int i12 = (gravity & (-113)) | 48;
        if (c3040a.f15396g != i12) {
            c3040a.f15396g = i12;
            c3040a.m8802h(false);
        }
        if (c3040a.f15394f != gravity) {
            c3040a.f15394f = gravity;
            c3040a.m8802h(false);
        }
        this.f15750d.addTextChangedListener(new C3085a());
        if (this.f15710B0 == null) {
            this.f15710B0 = this.f15750d.getHintTextColors();
        }
        if (this.f15742V) {
            if (TextUtils.isEmpty(this.f15743W)) {
                CharSequence hint = this.f15750d.getHint();
                this.f15752e = hint;
                setHint(hint);
                this.f15750d.setHint((CharSequence) null);
            }
            this.f15745a0 = true;
        }
        if (this.f15720J != null) {
            m8895n(this.f15750d.getText());
        }
        m8898q();
        this.f15762j.m14722b();
        this.f15746b.bringToFront();
        C3093a c3093a = this.f15748c;
        c3093a.bringToFront();
        Iterator<InterfaceC3091g> it = this.f15779x0.iterator();
        while (it.hasNext()) {
            it.next().mo8905a(this);
        }
        c3093a.m8918l();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m8901t(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f15743W)) {
            this.f15743W = charSequence;
            C3040a c3040a = this.f15729N0;
            if (charSequence == null || !TextUtils.equals(c3040a.f15358A, charSequence)) {
                c3040a.f15358A = charSequence;
                c3040a.f15359B = null;
                Bitmap bitmap = c3040a.f15362E;
                if (bitmap != null) {
                    bitmap.recycle();
                    c3040a.f15362E = null;
                }
                c3040a.m8802h(false);
            }
            if (!this.f15727M0) {
                m8892j();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.f15728N == z10) {
            return;
        }
        if (z10) {
            AppCompatTextView appCompatTextView = this.f15730O;
            if (appCompatTextView != null) {
                this.f15744a.addView(appCompatTextView);
                this.f15730O.setVisibility(0);
            }
            this.f15728N = z10;
        }
        AppCompatTextView appCompatTextView2 = this.f15730O;
        if (appCompatTextView2 != null) {
            appCompatTextView2.setVisibility(8);
        }
        this.f15730O = null;
        this.f15728N = z10;
    }

    /* JADX INFO: renamed from: a */
    public final void m8883a(float f3) {
        C3040a c3040a = this.f15729N0;
        if (c3040a.f15386b == f3) {
            return;
        }
        if (this.f15735Q0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f15735Q0 = valueAnimator;
            valueAnimator.setInterpolator(C10477a.m19429d(getContext(), com.linguist.R.attr.motionEasingEmphasizedInterpolator, C6308a.f36524b));
            this.f15735Q0.setDuration(C10477a.m19428c(com.linguist.R.attr.motionDurationMedium4, getContext(), 167));
            this.f15735Q0.addUpdateListener(new C3088d());
        }
        this.f15735Q0.setFloatValues(c3040a.f15386b, f3);
        this.f15735Q0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f15744a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        m8900s();
        setEditText((EditText) view);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    /* JADX INFO: renamed from: b */
    public final void m8884b() {
        boolean z10;
        C5768g c5768g = this.f15747b0;
        if (c5768g == null) {
            return;
        }
        C5772k c5772k = c5768g.f34857a.f34870a;
        C5772k c5772k2 = this.f15759h0;
        if (c5772k != c5772k2) {
            c5768g.setShapeAppearanceModel(c5772k2);
        }
        boolean z11 = false;
        if (this.f15765k0 != 2) {
            z10 = false;
        } else {
            if (this.f15768m0 > -1 && this.f15771p0 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (z10) {
            C5768g c5768g2 = this.f15747b0;
            float f3 = this.f15768m0;
            int i10 = this.f15771p0;
            c5768g2.f34857a.f34880k = f3;
            c5768g2.invalidateSelf();
            c5768g2.m12145q(ColorStateList.valueOf(i10));
        }
        int iM16215g = this.f15772q0;
        if (this.f15765k0 == 1) {
            iM16215g = C8169a.m16215g(this.f15772q0, C0062b.m334b1(com.linguist.R.attr.colorSurface, getContext(), 0));
        }
        this.f15772q0 = iM16215g;
        this.f15747b0.m12141m(ColorStateList.valueOf(iM16215g));
        C5768g c5768g3 = this.f15755f0;
        if (c5768g3 != null && this.f15757g0 != null) {
            if (this.f15768m0 > -1 && this.f15771p0 != 0) {
                z11 = true;
            }
            if (z11) {
                c5768g3.m12141m(this.f15750d.isFocused() ? ColorStateList.valueOf(this.f15712D0) : ColorStateList.valueOf(this.f15771p0));
                this.f15757g0.m12141m(ColorStateList.valueOf(this.f15771p0));
            }
            invalidate();
        }
        m8899r();
    }

    /* JADX INFO: renamed from: c */
    public final int m8885c() {
        float fM8799d;
        if (!this.f15742V) {
            return 0;
        }
        int i10 = this.f15765k0;
        C3040a c3040a = this.f15729N0;
        if (i10 == 0) {
            fM8799d = c3040a.m8799d();
        } else {
            if (i10 != 2) {
                return 0;
            }
            fM8799d = c3040a.m8799d() / 2.0f;
        }
        return (int) fM8799d;
    }

    /* JADX INFO: renamed from: d */
    public final C9422m m8886d() {
        C9422m c9422m = new C9422m();
        c9422m.f48293c = C10477a.m19428c(com.linguist.R.attr.motionDurationShort2, getContext(), 87);
        c9422m.f48294d = C10477a.m19429d(getContext(), com.linguist.R.attr.motionEasingLinearInterpolator, C6308a.f36523a);
        return c9422m;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f15750d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f15752e != null) {
            boolean z10 = this.f15745a0;
            this.f15745a0 = false;
            CharSequence hint = editText.getHint();
            this.f15750d.setHint(this.f15752e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                this.f15750d.setHint(hint);
                this.f15745a0 = z10;
                return;
            } catch (Throwable th2) {
                this.f15750d.setHint(hint);
                this.f15745a0 = z10;
                throw th2;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        FrameLayout frameLayout = this.f15744a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i11 = 0; i11 < frameLayout.getChildCount(); i11++) {
            View childAt = frameLayout.getChildAt(i11);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i10);
            if (childAt == this.f15750d) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f15739S0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f15739S0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C5768g c5768g;
        super.draw(canvas);
        boolean z10 = this.f15742V;
        C3040a c3040a = this.f15729N0;
        if (z10) {
            c3040a.getClass();
            int iSave = canvas.save();
            if (c3040a.f15359B != null) {
                RectF rectF = c3040a.f15392e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = c3040a.f15371N;
                    textPaint.setTextSize(c3040a.f15364G);
                    float f3 = c3040a.f15405p;
                    float f10 = c3040a.f15406q;
                    float f11 = c3040a.f15363F;
                    if (f11 != 1.0f) {
                        canvas.scale(f11, f11, f3, f10);
                    }
                    if (c3040a.f15391d0 > 1 && !c3040a.f15360C) {
                        float lineStart = c3040a.f15405p - c3040a.f15382Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f10);
                        float f12 = alpha;
                        textPaint.setAlpha((int) (c3040a.f15387b0 * f12));
                        int i10 = Build.VERSION.SDK_INT;
                        if (i10 >= 31) {
                            textPaint.setShadowLayer(c3040a.f15365H, c3040a.f15366I, c3040a.f15367J, C0062b.m413x0(c3040a.f15368K, textPaint.getAlpha()));
                        }
                        c3040a.f15382Y.draw(canvas);
                        textPaint.setAlpha((int) (c3040a.f15385a0 * f12));
                        if (i10 >= 31) {
                            textPaint.setShadowLayer(c3040a.f15365H, c3040a.f15366I, c3040a.f15367J, C0062b.m413x0(c3040a.f15368K, textPaint.getAlpha()));
                        }
                        int lineBaseline = c3040a.f15382Y.getLineBaseline(0);
                        CharSequence charSequence = c3040a.f15389c0;
                        float f13 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f13, textPaint);
                        if (i10 >= 31) {
                            textPaint.setShadowLayer(c3040a.f15365H, c3040a.f15366I, c3040a.f15367J, c3040a.f15368K);
                        }
                        String strTrim = c3040a.f15389c0.toString().trim();
                        if (strTrim.endsWith("…")) {
                            strTrim = strTrim.substring(0, strTrim.length() - 1);
                        }
                        String str = strTrim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(c3040a.f15382Y.getLineEnd(0), str.length()), 0.0f, f13, (Paint) textPaint);
                    } else {
                        canvas.translate(f3, f10);
                        c3040a.f15382Y.draw(canvas);
                    }
                    canvas.restoreToCount(iSave);
                }
            }
        }
        if (this.f15757g0 == null || (c5768g = this.f15755f0) == null) {
            return;
        }
        c5768g.draw(canvas);
        if (this.f15750d.isFocused()) {
            Rect bounds = this.f15757g0.getBounds();
            Rect bounds2 = this.f15755f0.getBounds();
            float f14 = c3040a.f15386b;
            int iCenterX = bounds2.centerX();
            bounds.left = C6308a.m12937b(f14, iCenterX, bounds2.left);
            bounds.right = C6308a.m12937b(f14, iCenterX, bounds2.right);
            this.f15757g0.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f15737R0) {
            return;
        }
        this.f15737R0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C3040a c3040a = this.f15729N0;
        if (c3040a != null) {
            c3040a.f15369L = drawableState;
            ColorStateList colorStateList = c3040a.f15400k;
            if (colorStateList == null || !colorStateList.isStateful()) {
                ColorStateList colorStateList2 = c3040a.f15399j;
                if (colorStateList2 == null || !colorStateList2.isStateful()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
            } else {
                z11 = true;
            }
            if (z11) {
                c3040a.m8802h(false);
                z12 = true;
            } else {
                z12 = false;
            }
            z10 = z12 | false;
        } else {
            z10 = false;
        }
        if (this.f15750d != null) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            m8901t(C10029b0.g.m18699c(this) && isEnabled(), false);
        }
        m8898q();
        m8904w();
        if (z10) {
            invalidate();
        }
        this.f15737R0 = false;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m8887e() {
        return this.f15742V && !TextUtils.isEmpty(this.f15743W) && (this.f15747b0 instanceof C7306f);
    }

    /* JADX INFO: renamed from: f */
    public final C5768g m8888f(boolean z10) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.linguist.R.dimen.mtrl_shape_corner_size_small_component);
        float f3 = z10 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f15750d;
        float popupElevation = editText instanceof C7318r ? ((C7318r) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.linguist.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.linguist.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C5772k.a aVar = new C5772k.a();
        aVar.m12159f(f3);
        aVar.m12160g(f3);
        aVar.m12157d(dimensionPixelOffset);
        aVar.m12158e(dimensionPixelOffset);
        C5772k c5772k = new C5772k(aVar);
        Context context = getContext();
        Paint paint = C5768g.f34846R;
        int iM337c1 = C0062b.m337c1(context, com.linguist.R.attr.colorSurface, C5768g.class.getSimpleName());
        C5768g c5768g = new C5768g();
        c5768g.m12138j(context);
        c5768g.m12141m(ColorStateList.valueOf(iM337c1));
        c5768g.m12140l(popupElevation);
        c5768g.setShapeAppearanceModel(c5772k);
        C5768g.b bVar = c5768g.f34857a;
        if (bVar.f34877h == null) {
            bVar.f34877h = new Rect();
        }
        c5768g.f34857a.f34877h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        c5768g.invalidateSelf();
        return c5768g;
    }

    /* JADX INFO: renamed from: g */
    public final int m8889g(int i10, boolean z10) {
        int compoundPaddingLeft = this.f15750d.getCompoundPaddingLeft() + i10;
        if (getPrefixText() != null && !z10) {
            compoundPaddingLeft = (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f15750d;
        if (editText == null) {
            return super.getBaseline();
        }
        return m8885c() + getPaddingTop() + editText.getBaseline();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C5768g getBoxBackground() {
        int i10 = this.f15765k0;
        if (i10 == 1 || i10 == 2) {
            return this.f15747b0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f15772q0;
    }

    public int getBoxBackgroundMode() {
        return this.f15765k0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f15767l0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zM19365e = C10347n.m19365e(this);
        RectF rectF = this.f15775t0;
        return zM19365e ? this.f15759h0.f34902h.mo12127a(rectF) : this.f15759h0.f34901g.mo12127a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zM19365e = C10347n.m19365e(this);
        RectF rectF = this.f15775t0;
        return zM19365e ? this.f15759h0.f34901g.mo12127a(rectF) : this.f15759h0.f34902h.mo12127a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zM19365e = C10347n.m19365e(this);
        RectF rectF = this.f15775t0;
        return zM19365e ? this.f15759h0.f34899e.mo12127a(rectF) : this.f15759h0.f34900f.mo12127a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zM19365e = C10347n.m19365e(this);
        RectF rectF = this.f15775t0;
        return zM19365e ? this.f15759h0.f34900f.mo12127a(rectF) : this.f15759h0.f34899e.mo12127a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f15714F0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f15715G0;
    }

    public int getBoxStrokeWidth() {
        return this.f15769n0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f15770o0;
    }

    public int getCounterMaxLength() {
        return this.f15766l;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.f15764k && this.f15716H && (appCompatTextView = this.f15720J) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f15741U;
    }

    public ColorStateList getCounterTextColor() {
        return this.f15740T;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f15710B0;
    }

    public EditText getEditText() {
        return this.f15750d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f15748c.f15805g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f15748c.f15805g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f15748c.f15789H;
    }

    public int getEndIconMode() {
        return this.f15748c.f15807i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f15748c.f15790I;
    }

    public CheckableImageButton getEndIconView() {
        return this.f15748c.f15805g;
    }

    public CharSequence getError() {
        C7315o c7315o = this.f15762j;
        if (c7315o.f40973q) {
            return c7315o.f40972p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f15762j.f40976t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f15762j.f40975s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.f15762j.f40974r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f15748c.f15801c.getDrawable();
    }

    public CharSequence getHelperText() {
        C7315o c7315o = this.f15762j;
        if (c7315o.f40980x) {
            return c7315o.f40979w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.f15762j.f40981y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f15742V) {
            return this.f15743W;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f15729N0.m8799d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C3040a c3040a = this.f15729N0;
        return c3040a.m8800e(c3040a.f15400k);
    }

    public ColorStateList getHintTextColor() {
        return this.f15711C0;
    }

    public InterfaceC3090f getLengthCounter() {
        return this.f15718I;
    }

    public int getMaxEms() {
        return this.f15756g;
    }

    public int getMaxWidth() {
        return this.f15760i;
    }

    public int getMinEms() {
        return this.f15754f;
    }

    public int getMinWidth() {
        return this.f15758h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f15748c.f15805g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f15748c.f15805g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f15728N) {
            return this.f15726M;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f15734Q;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f15732P;
    }

    public CharSequence getPrefixText() {
        return this.f15746b.f41005c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f15746b.f41004b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f15746b.f41004b;
    }

    public C5772k getShapeAppearanceModel() {
        return this.f15759h0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f15746b.f41006d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f15746b.f41006d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f15746b.f41009g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f15746b.f41010h;
    }

    public CharSequence getSuffixText() {
        return this.f15748c.f15792K;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f15748c.f15793L.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f15748c.f15793L;
    }

    public Typeface getTypeface() {
        return this.f15776u0;
    }

    /* JADX INFO: renamed from: h */
    public final int m8890h(int i10, boolean z10) {
        int compoundPaddingRight = i10 - this.f15750d.getCompoundPaddingRight();
        if (getPrefixText() != null && z10) {
            compoundPaddingRight += getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight();
        }
        return compoundPaddingRight;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i */
    public final void m8891i() {
        int i10 = this.f15765k0;
        if (i10 == 0) {
            this.f15747b0 = null;
            this.f15755f0 = null;
            this.f15757g0 = null;
        } else if (i10 == 1) {
            this.f15747b0 = new C5768g(this.f15759h0);
            this.f15755f0 = new C5768g();
            this.f15757g0 = new C5768g();
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(C0166e.m768o(new StringBuilder(), this.f15765k0, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.f15742V || (this.f15747b0 instanceof C7306f)) {
                this.f15747b0 = new C5768g(this.f15759h0);
            } else {
                C5772k c5772k = this.f15759h0;
                int i11 = C7306f.f40927T;
                if (c5772k == null) {
                    c5772k = new C5772k();
                }
                this.f15747b0 = new C7306f.b(new C7306f.a(c5772k, new RectF()));
            }
            this.f15755f0 = null;
            this.f15757g0 = null;
        }
        m8899r();
        m8904w();
        if (this.f15765k0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f15767l0 = getResources().getDimensionPixelSize(com.linguist.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (C5150c.m10929e(getContext())) {
                this.f15767l0 = getResources().getDimensionPixelSize(com.linguist.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f15750d != null && this.f15765k0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f15750d;
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                C10029b0.e.m18693k(editText, C10029b0.e.m18688f(editText), getResources().getDimensionPixelSize(com.linguist.R.dimen.material_filled_edittext_font_2_0_padding_top), C10029b0.e.m18687e(this.f15750d), getResources().getDimensionPixelSize(com.linguist.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (C5150c.m10929e(getContext())) {
                EditText editText2 = this.f15750d;
                WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
                C10029b0.e.m18693k(editText2, C10029b0.e.m18688f(editText2), getResources().getDimensionPixelSize(com.linguist.R.dimen.material_filled_edittext_font_1_3_padding_top), C10029b0.e.m18687e(this.f15750d), getResources().getDimensionPixelSize(com.linguist.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f15765k0 != 0) {
            m8900s();
        }
        EditText editText3 = this.f15750d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i12 = this.f15765k0;
                if (i12 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i12 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f6  */
    /* JADX INFO: renamed from: j */
    public final void m8892j() {
        float f3;
        float f10;
        float f11;
        RectF rectF;
        float f12;
        int i10;
        int i11;
        if (m8887e()) {
            int width = this.f15750d.getWidth();
            int gravity = this.f15750d.getGravity();
            C3040a c3040a = this.f15729N0;
            boolean zM8797b = c3040a.m8797b(c3040a.f15358A);
            c3040a.f15360C = zM8797b;
            Rect rect = c3040a.f15390d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zM8797b) {
                        i11 = rect.left;
                        f11 = i11;
                    } else {
                        f3 = rect.right;
                        f10 = c3040a.f15383Z;
                    }
                } else if (zM8797b) {
                    f3 = rect.right;
                    f10 = c3040a.f15383Z;
                } else {
                    i11 = rect.left;
                    f11 = i11;
                }
                float fMax = Math.max(f11, rect.left);
                rectF = this.f15775t0;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f12 = (width / 2.0f) + (c3040a.f15383Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c3040a.f15360C) {
                        f12 = c3040a.f15383Z + fMax;
                    } else {
                        i10 = rect.right;
                        f12 = i10;
                    }
                } else if (c3040a.f15360C) {
                    i10 = rect.right;
                    f12 = i10;
                } else {
                    f12 = c3040a.f15383Z + fMax;
                }
                rectF.right = Math.min(f12, rect.right);
                rectF.bottom = c3040a.m8799d() + rect.top;
                if (rectF.width() > 0.0f) {
                    if (rectF.height() <= 0.0f) {
                        return;
                    }
                    float f13 = rectF.left;
                    float f14 = this.f15763j0;
                    rectF.left = f13 - f14;
                    rectF.right += f14;
                    rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f15768m0);
                    C7306f c7306f = (C7306f) this.f15747b0;
                    c7306f.getClass();
                    c7306f.m14705u(rectF.left, rectF.top, rectF.right, rectF.bottom);
                }
            }
            f3 = width / 2.0f;
            f10 = c3040a.f15383Z / 2.0f;
            f11 = f3 - f10;
            float fMax2 = Math.max(f11, rect.left);
            rectF = this.f15775t0;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f12 = (width / 2.0f) + (c3040a.f15383Z / 2.0f);
            rectF.right = Math.min(f12, rect.right);
            rectF.bottom = c3040a.m8799d() + rect.top;
            if (rectF.width() > 0.0f) {
                if (rectF.height() <= 0.0f) {
                    return;
                }
                float f15 = rectF.left;
                float f16 = this.f15763j0;
                rectF.left = f15 - f16;
                rectF.right += f16;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f15768m0);
                C7306f c7306f2 = (C7306f) this.f15747b0;
                c7306f2.getClass();
                c7306f2.m14705u(rectF.left, rectF.top, rectF.right, rectF.bottom);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m8893l(TextView textView, int i10) {
        boolean z10 = true;
        try {
            textView.setTextAppearance(i10);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z10 = false;
            }
        } catch (Exception unused) {
        }
        if (z10) {
            textView.setTextAppearance(com.linguist.R.style.TextAppearance_AppCompat_Caption);
            Context context = getContext();
            Object obj = C7472a.f41322a;
            textView.setTextColor(C7472a.d.m14851a(context, com.linguist.R.color.design_error));
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m8894m() {
        C7315o c7315o = this.f15762j;
        return (c7315o.f40971o != 1 || c7315o.f40974r == null || TextUtils.isEmpty(c7315o.f40972p)) ? false : true;
    }

    /* JADX INFO: renamed from: n */
    public final void m8895n(Editable editable) {
        ((C8002l) this.f15718I).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z10 = this.f15716H;
        int i10 = this.f15766l;
        String string = null;
        if (i10 == -1) {
            this.f15720J.setText(String.valueOf(length));
            this.f15720J.setContentDescription(null);
            this.f15716H = false;
        } else {
            this.f15716H = length > i10;
            this.f15720J.setContentDescription(getContext().getString(this.f15716H ? com.linguist.R.string.character_counter_overflowed_content_description : com.linguist.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f15766l)));
            if (z10 != this.f15716H) {
                m8896o();
            }
            String str = C9627a.f49305d;
            Locale locale = Locale.getDefault();
            int i11 = C9633g.f49328a;
            C9627a c9627a = C9633g.a.m18109a(locale) == 1 ? C9627a.f49308g : C9627a.f49307f;
            AppCompatTextView appCompatTextView = this.f15720J;
            String string2 = getContext().getString(com.linguist.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f15766l));
            if (string2 == null) {
                c9627a.getClass();
            } else {
                string = c9627a.m18097c(string2, c9627a.f49311c).toString();
            }
            appCompatTextView.setText(string);
        }
        if (this.f15750d != null && z10 != this.f15716H) {
            m8901t(false, false);
            m8904w();
            m8898q();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m8896o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.f15720J;
        if (appCompatTextView != null) {
            m8893l(appCompatTextView, this.f15716H ? this.f15722K : this.f15724L);
            if (!this.f15716H && (colorStateList2 = this.f15740T) != null) {
                this.f15720J.setTextColor(colorStateList2);
            }
            if (!this.f15716H || (colorStateList = this.f15741U) == null) {
                return;
            }
            this.f15720J.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f15729N0.m8801g(configuration);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.f15750d;
        if (editText != null) {
            ThreadLocal<Matrix> threadLocal = C10336c.f52023a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f15773r0;
            rect.set(0, 0, width, height);
            C10336c.m19350b(this, editText, rect);
            C5768g c5768g = this.f15755f0;
            if (c5768g != null) {
                int i14 = rect.bottom;
                c5768g.setBounds(rect.left, i14 - this.f15769n0, rect.right, i14);
            }
            C5768g c5768g2 = this.f15757g0;
            if (c5768g2 != null) {
                int i15 = rect.bottom;
                c5768g2.setBounds(rect.left, i15 - this.f15770o0, rect.right, i15);
            }
            if (this.f15742V) {
                float textSize = this.f15750d.getTextSize();
                C3040a c3040a = this.f15729N0;
                if (c3040a.f15397h != textSize) {
                    c3040a.f15397h = textSize;
                    c3040a.m8802h(false);
                }
                int gravity = this.f15750d.getGravity();
                int i16 = (gravity & (-113)) | 48;
                if (c3040a.f15396g != i16) {
                    c3040a.f15396g = i16;
                    c3040a.m8802h(false);
                }
                if (c3040a.f15394f != gravity) {
                    c3040a.f15394f = gravity;
                    c3040a.m8802h(false);
                }
                if (this.f15750d == null) {
                    throw new IllegalStateException();
                }
                boolean zM19365e = C10347n.m19365e(this);
                int i17 = rect.bottom;
                Rect rect2 = this.f15774s0;
                rect2.bottom = i17;
                int i18 = this.f15765k0;
                if (i18 == 1) {
                    rect2.left = m8889g(rect.left, zM19365e);
                    rect2.top = rect.top + this.f15767l0;
                    rect2.right = m8890h(rect.right, zM19365e);
                } else if (i18 != 2) {
                    rect2.left = m8889g(rect.left, zM19365e);
                    rect2.top = getPaddingTop();
                    rect2.right = m8890h(rect.right, zM19365e);
                } else {
                    rect2.left = this.f15750d.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - m8885c();
                    rect2.right = rect.right - this.f15750d.getPaddingRight();
                }
                int i19 = rect2.left;
                int i20 = rect2.top;
                int i21 = rect2.right;
                int i22 = rect2.bottom;
                Rect rect3 = c3040a.f15390d;
                if (!(rect3.left == i19 && rect3.top == i20 && rect3.right == i21 && rect3.bottom == i22)) {
                    rect3.set(i19, i20, i21, i22);
                    c3040a.f15370M = true;
                }
                if (this.f15750d == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = c3040a.f15372O;
                textPaint.setTextSize(c3040a.f15397h);
                textPaint.setTypeface(c3040a.f15410u);
                textPaint.setLetterSpacing(c3040a.f15380W);
                float f3 = -textPaint.ascent();
                rect2.left = this.f15750d.getCompoundPaddingLeft() + rect.left;
                rect2.top = this.f15765k0 == 1 && this.f15750d.getMinLines() <= 1 ? (int) (rect.centerY() - (f3 / 2.0f)) : rect.top + this.f15750d.getCompoundPaddingTop();
                rect2.right = rect.right - this.f15750d.getCompoundPaddingRight();
                int compoundPaddingBottom = this.f15765k0 == 1 && this.f15750d.getMinLines() <= 1 ? (int) (rect2.top + f3) : rect.bottom - this.f15750d.getCompoundPaddingBottom();
                rect2.bottom = compoundPaddingBottom;
                int i23 = rect2.left;
                int i24 = rect2.top;
                int i25 = rect2.right;
                Rect rect4 = c3040a.f15388c;
                if (!(rect4.left == i23 && rect4.top == i24 && rect4.right == i25 && rect4.bottom == compoundPaddingBottom)) {
                    rect4.set(i23, i24, i25, compoundPaddingBottom);
                    c3040a.f15370M = true;
                }
                c3040a.m8802h(false);
                if (m8887e() && !this.f15727M0) {
                    m8892j();
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        EditText editText;
        int iMax;
        super.onMeasure(i10, i11);
        EditText editText2 = this.f15750d;
        C3093a c3093a = this.f15748c;
        if (editText2 != null && this.f15750d.getMeasuredHeight() < (iMax = Math.max(c3093a.getMeasuredHeight(), this.f15746b.getMeasuredHeight()))) {
            this.f15750d.setMinimumHeight(iMax);
            z10 = true;
        } else {
            z10 = false;
        }
        boolean zM8897p = m8897p();
        if (z10 || zM8897p) {
            this.f15750d.post(new RunnableC3087c());
        }
        if (this.f15730O != null && (editText = this.f15750d) != null) {
            this.f15730O.setGravity(editText.getGravity());
            this.f15730O.setPadding(this.f15750d.getCompoundPaddingLeft(), this.f15750d.getCompoundPaddingTop(), this.f15750d.getCompoundPaddingRight(), this.f15750d.getCompoundPaddingBottom());
        }
        c3093a.m8918l();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f5635a);
        setError(savedState.f15782c);
        if (savedState.f15783d) {
            post(new RunnableC3086b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        if (z10 != this.f15761i0) {
            InterfaceC5764c interfaceC5764c = this.f15759h0.f34899e;
            RectF rectF = this.f15775t0;
            float fMo12127a = interfaceC5764c.mo12127a(rectF);
            float fMo12127a2 = this.f15759h0.f34900f.mo12127a(rectF);
            float fMo12127a3 = this.f15759h0.f34902h.mo12127a(rectF);
            float fMo12127a4 = this.f15759h0.f34901g.mo12127a(rectF);
            C5772k c5772k = this.f15759h0;
            C5206f c5206f = c5772k.f34895a;
            C5772k.a aVar = new C5772k.a();
            C5206f c5206f2 = c5772k.f34896b;
            aVar.f34907a = c5206f2;
            float fM12154b = C5772k.a.m12154b(c5206f2);
            if (fM12154b != -1.0f) {
                aVar.m12159f(fM12154b);
            }
            aVar.f34908b = c5206f;
            float fM12154b2 = C5772k.a.m12154b(c5206f);
            if (fM12154b2 != -1.0f) {
                aVar.m12160g(fM12154b2);
            }
            C5206f c5206f3 = c5772k.f34897c;
            aVar.f34910d = c5206f3;
            float fM12154b3 = C5772k.a.m12154b(c5206f3);
            if (fM12154b3 != -1.0f) {
                aVar.m12157d(fM12154b3);
            }
            C5206f c5206f4 = c5772k.f34898d;
            aVar.f34909c = c5206f4;
            float fM12154b4 = C5772k.a.m12154b(c5206f4);
            if (fM12154b4 != -1.0f) {
                aVar.m12158e(fM12154b4);
            }
            aVar.m12159f(fMo12127a2);
            aVar.m12160g(fMo12127a);
            aVar.m12157d(fMo12127a4);
            aVar.m12158e(fMo12127a3);
            C5772k c5772k2 = new C5772k(aVar);
            this.f15761i0 = z10;
            setShapeAppearanceModel(c5772k2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (m8894m()) {
            savedState.f15782c = getError();
        }
        C3093a c3093a = this.f15748c;
        boolean z10 = true;
        if (!(c3093a.f15807i != 0) || !c3093a.f15805g.isChecked()) {
            z10 = false;
        }
        savedState.f15783d = z10;
        return savedState;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c5  */
    /* JADX INFO: renamed from: p */
    public final boolean m8897p() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f15750d == null) {
            return false;
        }
        Drawable startIconDrawable = getStartIconDrawable();
        boolean z13 = true;
        C7321u c7321u = this.f15746b;
        if (startIconDrawable == null && (getPrefixText() == null || getPrefixTextView().getVisibility() != 0)) {
            z10 = false;
        } else if (c7321u.getMeasuredWidth() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        CheckableImageButton checkableImageButton = null;
        if (z10) {
            int measuredWidth = c7321u.getMeasuredWidth() - this.f15750d.getPaddingLeft();
            if (this.f15777v0 == null || this.f15778w0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f15777v0 = colorDrawable;
                this.f15778w0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrM4836a = C1304k.b.m4836a(this.f15750d);
            Drawable drawable = drawableArrM4836a[0];
            ColorDrawable colorDrawable2 = this.f15777v0;
            if (drawable != colorDrawable2) {
                C1304k.b.m4840e(this.f15750d, colorDrawable2, drawableArrM4836a[1], drawableArrM4836a[2], drawableArrM4836a[3]);
                z11 = true;
            } else {
                z11 = false;
            }
        } else if (this.f15777v0 != null) {
            Drawable[] drawableArrM4836a2 = C1304k.b.m4836a(this.f15750d);
            C1304k.b.m4840e(this.f15750d, null, drawableArrM4836a2[1], drawableArrM4836a2[2], drawableArrM4836a2[3]);
            this.f15777v0 = null;
            z11 = true;
        } else {
            z11 = false;
        }
        C3093a c3093a = this.f15748c;
        if (!c3093a.m8910d()) {
            if ((c3093a.f15807i != 0) && c3093a.m8909c()) {
                if (c3093a.getMeasuredWidth() > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            } else if (c3093a.f15792K == null) {
                z12 = false;
            } else if (c3093a.getMeasuredWidth() > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
        } else if (c3093a.getMeasuredWidth() > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12) {
            if (this.f15780y0 != null) {
                Drawable[] drawableArrM4836a3 = C1304k.b.m4836a(this.f15750d);
                if (drawableArrM4836a3[2] == this.f15780y0) {
                    C1304k.b.m4840e(this.f15750d, drawableArrM4836a3[0], drawableArrM4836a3[1], this.f15709A0, drawableArrM4836a3[3]);
                } else {
                    z13 = z11;
                }
                this.f15780y0 = null;
            }
            return z11;
        }
        int measuredWidth2 = c3093a.f15793L.getMeasuredWidth() - this.f15750d.getPaddingRight();
        if (c3093a.m8910d()) {
            checkableImageButton = c3093a.f15801c;
        } else {
            if ((c3093a.f15807i != 0) && c3093a.m8909c()) {
                checkableImageButton = c3093a.f15805g;
            }
        }
        if (checkableImageButton != null) {
            measuredWidth2 = C10040h.m18809c((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth() + measuredWidth2;
        }
        Drawable[] drawableArrM4836a4 = C1304k.b.m4836a(this.f15750d);
        ColorDrawable colorDrawable3 = this.f15780y0;
        if (colorDrawable3 == null || this.f15781z0 == measuredWidth2) {
            if (colorDrawable3 == null) {
                ColorDrawable colorDrawable4 = new ColorDrawable();
                this.f15780y0 = colorDrawable4;
                this.f15781z0 = measuredWidth2;
                colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable2 = drawableArrM4836a4[2];
            ColorDrawable colorDrawable5 = this.f15780y0;
            if (drawable2 != colorDrawable5) {
                this.f15709A0 = drawable2;
                C1304k.b.m4840e(this.f15750d, drawableArrM4836a4[0], drawableArrM4836a4[1], colorDrawable5, drawableArrM4836a4[3]);
            } else {
                z13 = z11;
            }
        } else {
            this.f15781z0 = measuredWidth2;
            colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
            C1304k.b.m4840e(this.f15750d, drawableArrM4836a4[0], drawableArrM4836a4[1], this.f15780y0, drawableArrM4836a4[3]);
        }
        z11 = z13;
        return z11;
    }

    /* JADX INFO: renamed from: q */
    public final void m8898q() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.f15750d;
        if (editText != null) {
            if (this.f15765k0 != 0 || (background = editText.getBackground()) == null) {
                return;
            }
            int[] iArr = C0311f0.f1174a;
            Drawable drawableMutate = background.mutate();
            if (m8894m()) {
                drawableMutate.setColorFilter(C0319i.m1202c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
            } else if (this.f15716H && (appCompatTextView = this.f15720J) != null) {
                drawableMutate.setColorFilter(C0319i.m1202c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            } else {
                drawableMutate.clearColorFilter();
                this.f15750d.refreshDrawableState();
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m8899r() {
        EditText editText = this.f15750d;
        if (editText != null && this.f15747b0 != null && (this.f15753e0 || editText.getBackground() == null)) {
            if (this.f15765k0 == 0) {
                return;
            }
            EditText editText2 = this.f15750d;
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.d.m18680q(editText2, editTextBoxBackground);
            this.f15753e0 = true;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m8900s() {
        if (this.f15765k0 != 1) {
            FrameLayout frameLayout = this.f15744a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iM8885c = m8885c();
            if (iM8885c != layoutParams.topMargin) {
                layoutParams.topMargin = iM8885c;
                frameLayout.requestLayout();
            }
        }
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f15772q0 != i10) {
            this.f15772q0 = i10;
            this.f15717H0 = i10;
            this.f15721J0 = i10;
            this.f15723K0 = i10;
            m8884b();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        Context context = getContext();
        Object obj = C7472a.f41322a;
        setBoxBackgroundColor(C7472a.d.m14851a(context, i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f15717H0 = defaultColor;
        this.f15772q0 = defaultColor;
        this.f15719I0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f15721J0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f15723K0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m8884b();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.f15765k0) {
            return;
        }
        this.f15765k0 = i10;
        if (this.f15750d != null) {
            m8891i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.f15767l0 = i10;
    }

    public void setBoxCornerFamily(int i10) {
        C5772k c5772k = this.f15759h0;
        c5772k.getClass();
        C5772k.a aVar = new C5772k.a(c5772k);
        InterfaceC5764c interfaceC5764c = this.f15759h0.f34899e;
        C5206f c5206fM257D0 = C0062b.m257D0(i10);
        aVar.f34907a = c5206fM257D0;
        float fM12154b = C5772k.a.m12154b(c5206fM257D0);
        if (fM12154b != -1.0f) {
            aVar.m12159f(fM12154b);
        }
        aVar.f34911e = interfaceC5764c;
        InterfaceC5764c interfaceC5764c2 = this.f15759h0.f34900f;
        C5206f c5206fM257D1 = C0062b.m257D0(i10);
        aVar.f34908b = c5206fM257D1;
        float fM12154b2 = C5772k.a.m12154b(c5206fM257D1);
        if (fM12154b2 != -1.0f) {
            aVar.m12160g(fM12154b2);
        }
        aVar.f34912f = interfaceC5764c2;
        InterfaceC5764c interfaceC5764c3 = this.f15759h0.f34902h;
        C5206f c5206fM257D2 = C0062b.m257D0(i10);
        aVar.f34910d = c5206fM257D2;
        float fM12154b3 = C5772k.a.m12154b(c5206fM257D2);
        if (fM12154b3 != -1.0f) {
            aVar.m12157d(fM12154b3);
        }
        aVar.f34914h = interfaceC5764c3;
        InterfaceC5764c interfaceC5764c4 = this.f15759h0.f34901g;
        C5206f c5206fM257D3 = C0062b.m257D0(i10);
        aVar.f34909c = c5206fM257D3;
        float fM12154b4 = C5772k.a.m12154b(c5206fM257D3);
        if (fM12154b4 != -1.0f) {
            aVar.m12158e(fM12154b4);
        }
        aVar.f34913g = interfaceC5764c4;
        this.f15759h0 = new C5772k(aVar);
        m8884b();
    }

    public void setBoxStrokeColor(int i10) {
        if (this.f15714F0 != i10) {
            this.f15714F0 = i10;
            m8904w();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f15712D0 = colorStateList.getDefaultColor();
            this.f15725L0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f15713E0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f15714F0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f15714F0 != colorStateList.getDefaultColor()) {
            this.f15714F0 = colorStateList.getDefaultColor();
        }
        m8904w();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f15715G0 != colorStateList) {
            this.f15715G0 = colorStateList;
            m8904w();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f15769n0 = i10;
        m8904w();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.f15770o0 = i10;
        m8904w();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.f15764k != z10) {
            C7315o c7315o = this.f15762j;
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
                this.f15720J = appCompatTextView;
                appCompatTextView.setId(com.linguist.R.id.textinput_counter);
                Typeface typeface = this.f15776u0;
                if (typeface != null) {
                    this.f15720J.setTypeface(typeface);
                }
                this.f15720J.setMaxLines(1);
                c7315o.m14721a(this.f15720J, 2);
                C10040h.m18814h((ViewGroup.MarginLayoutParams) this.f15720J.getLayoutParams(), getResources().getDimensionPixelOffset(com.linguist.R.dimen.mtrl_textinput_counter_margin_start));
                m8896o();
                if (this.f15720J != null) {
                    EditText editText = this.f15750d;
                    m8895n(editText != null ? editText.getText() : null);
                }
                this.f15764k = z10;
            } else {
                c7315o.m14727g(this.f15720J, 2);
                this.f15720J = null;
            }
            this.f15764k = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.f15766l != i10) {
            if (i10 > 0) {
                this.f15766l = i10;
            } else {
                this.f15766l = -1;
            }
            if (this.f15764k && this.f15720J != null) {
                EditText editText = this.f15750d;
                m8895n(editText == null ? null : editText.getText());
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.f15722K != i10) {
            this.f15722K = i10;
            m8896o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f15741U != colorStateList) {
            this.f15741U = colorStateList;
            m8896o();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.f15724L != i10) {
            this.f15724L = i10;
            m8896o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f15740T != colorStateList) {
            this.f15740T = colorStateList;
            m8896o();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f15710B0 = colorStateList;
        this.f15711C0 = colorStateList;
        if (this.f15750d != null) {
            m8901t(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        m8882k(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.f15748c.f15805g.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.f15748c.f15805g.setCheckable(z10);
    }

    public void setEndIconContentDescription(int i10) {
        C3093a c3093a = this.f15748c;
        CharSequence text = i10 != 0 ? c3093a.getResources().getText(i10) : null;
        CheckableImageButton checkableImageButton = c3093a.f15805g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f15748c.f15805g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i10) {
        C3093a c3093a = this.f15748c;
        Drawable drawableM11672a = i10 != 0 ? C5452a.m11672a(c3093a.getContext(), i10) : null;
        CheckableImageButton checkableImageButton = c3093a.f15805g;
        checkableImageButton.setImageDrawable(drawableM11672a);
        if (drawableM11672a != null) {
            ColorStateList colorStateList = c3093a.f15809k;
            PorterDuff.Mode mode = c3093a.f15810l;
            TextInputLayout textInputLayout = c3093a.f15799a;
            C7314n.m14717a(textInputLayout, checkableImageButton, colorStateList, mode);
            C7314n.m14719c(textInputLayout, checkableImageButton, c3093a.f15809k);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        C3093a c3093a = this.f15748c;
        CheckableImageButton checkableImageButton = c3093a.f15805g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = c3093a.f15809k;
            PorterDuff.Mode mode = c3093a.f15810l;
            TextInputLayout textInputLayout = c3093a.f15799a;
            C7314n.m14717a(textInputLayout, checkableImageButton, colorStateList, mode);
            C7314n.m14719c(textInputLayout, checkableImageButton, c3093a.f15809k);
        }
    }

    public void setEndIconMinSize(int i10) {
        C3093a c3093a = this.f15748c;
        if (i10 < 0) {
            c3093a.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i10 != c3093a.f15789H) {
            c3093a.f15789H = i10;
            CheckableImageButton checkableImageButton = c3093a.f15805g;
            checkableImageButton.setMinimumWidth(i10);
            checkableImageButton.setMinimumHeight(i10);
            CheckableImageButton checkableImageButton2 = c3093a.f15801c;
            checkableImageButton2.setMinimumWidth(i10);
            checkableImageButton2.setMinimumHeight(i10);
        }
    }

    public void setEndIconMode(int i10) {
        this.f15748c.m8912f(i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        C3093a c3093a = this.f15748c;
        View.OnLongClickListener onLongClickListener = c3093a.f15791J;
        CheckableImageButton checkableImageButton = c3093a.f15805g;
        checkableImageButton.setOnClickListener(onClickListener);
        C7314n.m14720d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C3093a c3093a = this.f15748c;
        c3093a.f15791J = onLongClickListener;
        CheckableImageButton checkableImageButton = c3093a.f15805g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        C7314n.m14720d(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        C3093a c3093a = this.f15748c;
        c3093a.f15790I = scaleType;
        c3093a.f15805g.setScaleType(scaleType);
        c3093a.f15801c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        C3093a c3093a = this.f15748c;
        if (c3093a.f15809k != colorStateList) {
            c3093a.f15809k = colorStateList;
            C7314n.m14717a(c3093a.f15799a, c3093a.f15805g, colorStateList, c3093a.f15810l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        C3093a c3093a = this.f15748c;
        if (c3093a.f15810l != mode) {
            c3093a.f15810l = mode;
            C7314n.m14717a(c3093a.f15799a, c3093a.f15805g, c3093a.f15809k, mode);
        }
    }

    public void setEndIconVisible(boolean z10) {
        this.f15748c.m8913g(z10);
    }

    public void setError(CharSequence charSequence) {
        C7315o c7315o = this.f15762j;
        if (!c7315o.f40973q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            c7315o.m14726f();
            return;
        }
        c7315o.m14723c();
        c7315o.f40972p = charSequence;
        c7315o.f40974r.setText(charSequence);
        int i10 = c7315o.f40970n;
        if (i10 != 1) {
            c7315o.f40971o = 1;
        }
        c7315o.m14729i(i10, c7315o.f40971o, c7315o.m14728h(c7315o.f40974r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        C7315o c7315o = this.f15762j;
        c7315o.f40976t = i10;
        AppCompatTextView appCompatTextView = c7315o.f40974r;
        if (appCompatTextView != null) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.g.m18702f(appCompatTextView, i10);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C7315o c7315o = this.f15762j;
        c7315o.f40975s = charSequence;
        AppCompatTextView appCompatTextView = c7315o.f40974r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z10) {
        C7315o c7315o = this.f15762j;
        if (c7315o.f40973q == z10) {
            return;
        }
        c7315o.m14723c();
        TextInputLayout textInputLayout = c7315o.f40964h;
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(c7315o.f40963g, null);
            c7315o.f40974r = appCompatTextView;
            appCompatTextView.setId(com.linguist.R.id.textinput_error);
            c7315o.f40974r.setTextAlignment(5);
            Typeface typeface = c7315o.f40956B;
            if (typeface != null) {
                c7315o.f40974r.setTypeface(typeface);
            }
            int i10 = c7315o.f40977u;
            c7315o.f40977u = i10;
            AppCompatTextView appCompatTextView2 = c7315o.f40974r;
            if (appCompatTextView2 != null) {
                textInputLayout.m8893l(appCompatTextView2, i10);
            }
            ColorStateList colorStateList = c7315o.f40978v;
            c7315o.f40978v = colorStateList;
            AppCompatTextView appCompatTextView3 = c7315o.f40974r;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = c7315o.f40975s;
            c7315o.f40975s = charSequence;
            AppCompatTextView appCompatTextView4 = c7315o.f40974r;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i11 = c7315o.f40976t;
            c7315o.f40976t = i11;
            AppCompatTextView appCompatTextView5 = c7315o.f40974r;
            if (appCompatTextView5 != null) {
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                C10029b0.g.m18702f(appCompatTextView5, i11);
            }
            c7315o.f40974r.setVisibility(4);
            c7315o.m14721a(c7315o.f40974r, 0);
        } else {
            c7315o.m14726f();
            c7315o.m14727g(c7315o.f40974r, 0);
            c7315o.f40974r = null;
            textInputLayout.m8898q();
            textInputLayout.m8904w();
        }
        c7315o.f40973q = z10;
    }

    public void setErrorIconDrawable(int i10) {
        C3093a c3093a = this.f15748c;
        c3093a.m8914h(i10 != 0 ? C5452a.m11672a(c3093a.getContext(), i10) : null);
        C7314n.m14719c(c3093a.f15799a, c3093a.f15801c, c3093a.f15802d);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f15748c.m8914h(drawable);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        C3093a c3093a = this.f15748c;
        CheckableImageButton checkableImageButton = c3093a.f15801c;
        View.OnLongClickListener onLongClickListener = c3093a.f15804f;
        checkableImageButton.setOnClickListener(onClickListener);
        C7314n.m14720d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C3093a c3093a = this.f15748c;
        c3093a.f15804f = onLongClickListener;
        CheckableImageButton checkableImageButton = c3093a.f15801c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        C7314n.m14720d(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        C3093a c3093a = this.f15748c;
        if (c3093a.f15802d != colorStateList) {
            c3093a.f15802d = colorStateList;
            C7314n.m14717a(c3093a.f15799a, c3093a.f15801c, colorStateList, c3093a.f15803e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        C3093a c3093a = this.f15748c;
        if (c3093a.f15803e != mode) {
            c3093a.f15803e = mode;
            C7314n.m14717a(c3093a.f15799a, c3093a.f15801c, c3093a.f15802d, mode);
        }
    }

    public void setErrorTextAppearance(int i10) {
        C7315o c7315o = this.f15762j;
        c7315o.f40977u = i10;
        AppCompatTextView appCompatTextView = c7315o.f40974r;
        if (appCompatTextView != null) {
            c7315o.f40964h.m8893l(appCompatTextView, i10);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C7315o c7315o = this.f15762j;
        c7315o.f40978v = colorStateList;
        AppCompatTextView appCompatTextView = c7315o.f40974r;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.f15731O0 != z10) {
            this.f15731O0 = z10;
            m8901t(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        C7315o c7315o = this.f15762j;
        if (zIsEmpty) {
            if (c7315o.f40980x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!c7315o.f40980x) {
            setHelperTextEnabled(true);
        }
        c7315o.m14723c();
        c7315o.f40979w = charSequence;
        c7315o.f40981y.setText(charSequence);
        int i10 = c7315o.f40970n;
        if (i10 != 2) {
            c7315o.f40971o = 2;
        }
        c7315o.m14729i(i10, c7315o.f40971o, c7315o.m14728h(c7315o.f40981y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C7315o c7315o = this.f15762j;
        c7315o.f40955A = colorStateList;
        AppCompatTextView appCompatTextView = c7315o.f40981y;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z10) {
        C7315o c7315o = this.f15762j;
        if (c7315o.f40980x == z10) {
            return;
        }
        c7315o.m14723c();
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(c7315o.f40963g, null);
            c7315o.f40981y = appCompatTextView;
            appCompatTextView.setId(com.linguist.R.id.textinput_helper_text);
            c7315o.f40981y.setTextAlignment(5);
            Typeface typeface = c7315o.f40956B;
            if (typeface != null) {
                c7315o.f40981y.setTypeface(typeface);
            }
            c7315o.f40981y.setVisibility(4);
            AppCompatTextView appCompatTextView2 = c7315o.f40981y;
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.g.m18702f(appCompatTextView2, 1);
            int i10 = c7315o.f40982z;
            c7315o.f40982z = i10;
            AppCompatTextView appCompatTextView3 = c7315o.f40981y;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTextAppearance(i10);
            }
            ColorStateList colorStateList = c7315o.f40955A;
            c7315o.f40955A = colorStateList;
            AppCompatTextView appCompatTextView4 = c7315o.f40981y;
            if (appCompatTextView4 != null && colorStateList != null) {
                appCompatTextView4.setTextColor(colorStateList);
            }
            c7315o.m14721a(c7315o.f40981y, 1);
            c7315o.f40981y.setAccessibilityDelegate(new C7316p(c7315o));
        } else {
            c7315o.m14723c();
            int i11 = c7315o.f40970n;
            if (i11 == 2) {
                c7315o.f40971o = 0;
            }
            c7315o.m14729i(i11, c7315o.f40971o, c7315o.m14728h(c7315o.f40981y, ""));
            c7315o.m14727g(c7315o.f40981y, 1);
            c7315o.f40981y = null;
            TextInputLayout textInputLayout = c7315o.f40964h;
            textInputLayout.m8898q();
            textInputLayout.m8904w();
        }
        c7315o.f40980x = z10;
    }

    public void setHelperTextTextAppearance(int i10) {
        C7315o c7315o = this.f15762j;
        c7315o.f40982z = i10;
        AppCompatTextView appCompatTextView = c7315o.f40981y;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i10);
        }
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f15742V) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.f15733P0 = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.f15742V) {
            this.f15742V = z10;
            if (z10) {
                CharSequence hint = this.f15750d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f15743W)) {
                        setHint(hint);
                    }
                    this.f15750d.setHint((CharSequence) null);
                }
                this.f15745a0 = true;
            } else {
                this.f15745a0 = false;
                if (!TextUtils.isEmpty(this.f15743W) && TextUtils.isEmpty(this.f15750d.getHint())) {
                    this.f15750d.setHint(this.f15743W);
                }
                setHintInternal(null);
            }
            if (this.f15750d != null) {
                m8900s();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        C3040a c3040a = this.f15729N0;
        View view = c3040a.f15384a;
        C5151d c5151d = new C5151d(view.getContext(), i10);
        ColorStateList colorStateList = c5151d.f33136j;
        if (colorStateList != null) {
            c3040a.f15400k = colorStateList;
        }
        float f3 = c5151d.f33137k;
        if (f3 != 0.0f) {
            c3040a.f15398i = f3;
        }
        ColorStateList colorStateList2 = c5151d.f33127a;
        if (colorStateList2 != null) {
            c3040a.f15378U = colorStateList2;
        }
        c3040a.f15376S = c5151d.f33131e;
        c3040a.f15377T = c5151d.f33132f;
        c3040a.f15375R = c5151d.f33133g;
        c3040a.f15379V = c5151d.f33135i;
        C5148a c5148a = c3040a.f15414y;
        if (c5148a != null) {
            c5148a.f33126c = true;
        }
        C10335b c10335b = new C10335b(c3040a);
        c5151d.m10930a();
        c3040a.f15414y = new C5148a(c10335b, c5151d.f33140n);
        c5151d.m10932c(view.getContext(), c3040a.f15414y);
        c3040a.m8802h(false);
        this.f15711C0 = c3040a.f15400k;
        if (this.f15750d != null) {
            m8901t(false, false);
            m8900s();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f15711C0 != colorStateList) {
            if (this.f15710B0 == null) {
                C3040a c3040a = this.f15729N0;
                if (c3040a.f15400k != colorStateList) {
                    c3040a.f15400k = colorStateList;
                    c3040a.m8802h(false);
                }
            }
            this.f15711C0 = colorStateList;
            if (this.f15750d != null) {
                m8901t(false, false);
            }
        }
    }

    public void setLengthCounter(InterfaceC3090f interfaceC3090f) {
        this.f15718I = interfaceC3090f;
    }

    public void setMaxEms(int i10) {
        this.f15756g = i10;
        EditText editText = this.f15750d;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(int i10) {
        this.f15760i = i10;
        EditText editText = this.f15750d;
        if (editText != null && i10 != -1) {
            editText.setMaxWidth(i10);
        }
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f15754f = i10;
        EditText editText = this.f15750d;
        if (editText != null && i10 != -1) {
            editText.setMinEms(i10);
        }
    }

    public void setMinWidth(int i10) {
        this.f15758h = i10;
        EditText editText = this.f15750d;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        C3093a c3093a = this.f15748c;
        c3093a.f15805g.setContentDescription(i10 != 0 ? c3093a.getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f15748c.f15805g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        C3093a c3093a = this.f15748c;
        c3093a.f15805g.setImageDrawable(i10 != 0 ? C5452a.m11672a(c3093a.getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f15748c.f15805g.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        C3093a c3093a = this.f15748c;
        if (z10 && c3093a.f15807i != 1) {
            c3093a.m8912f(1);
        } else if (z10) {
            c3093a.getClass();
        } else {
            c3093a.m8912f(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        C3093a c3093a = this.f15748c;
        c3093a.f15809k = colorStateList;
        C7314n.m14717a(c3093a.f15799a, c3093a.f15805g, colorStateList, c3093a.f15810l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        C3093a c3093a = this.f15748c;
        c3093a.f15810l = mode;
        C7314n.m14717a(c3093a.f15799a, c3093a.f15805g, c3093a.f15809k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        Editable text = null;
        if (this.f15730O == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
            this.f15730O = appCompatTextView;
            appCompatTextView.setId(com.linguist.R.id.textinput_placeholder);
            AppCompatTextView appCompatTextView2 = this.f15730O;
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C10029b0.d.m18682s(appCompatTextView2, 2);
            C9422m c9422mM8886d = m8886d();
            this.f15736R = c9422mM8886d;
            c9422mM8886d.f48292b = 67L;
            this.f15738S = m8886d();
            setPlaceholderTextAppearance(this.f15734Q);
            setPlaceholderTextColor(this.f15732P);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f15728N) {
                setPlaceholderTextEnabled(true);
            }
            this.f15726M = charSequence;
        }
        EditText editText = this.f15750d;
        if (editText != null) {
            text = editText.getText();
        }
        m8902u(text);
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.f15734Q = i10;
        AppCompatTextView appCompatTextView = this.f15730O;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f15732P != colorStateList) {
            this.f15732P = colorStateList;
            AppCompatTextView appCompatTextView = this.f15730O;
            if (appCompatTextView != null && colorStateList != null) {
                appCompatTextView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        C7321u c7321u = this.f15746b;
        c7321u.getClass();
        c7321u.f41005c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c7321u.f41004b.setText(charSequence);
        c7321u.m14736d();
    }

    public void setPrefixTextAppearance(int i10) {
        this.f15746b.f41004b.setTextAppearance(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f15746b.f41004b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(C5772k c5772k) {
        C5768g c5768g = this.f15747b0;
        if (c5768g != null && c5768g.f34857a.f34870a != c5772k) {
            this.f15759h0 = c5772k;
            m8884b();
        }
    }

    public void setStartIconCheckable(boolean z10) {
        this.f15746b.f41006d.setCheckable(z10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f15746b.f41006d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? C5452a.m11672a(getContext(), i10) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f15746b.m14733a(drawable);
    }

    public void setStartIconMinSize(int i10) {
        C7321u c7321u = this.f15746b;
        if (i10 < 0) {
            c7321u.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i10 != c7321u.f41009g) {
            c7321u.f41009g = i10;
            CheckableImageButton checkableImageButton = c7321u.f41006d;
            checkableImageButton.setMinimumWidth(i10);
            checkableImageButton.setMinimumHeight(i10);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        C7321u c7321u = this.f15746b;
        View.OnLongClickListener onLongClickListener = c7321u.f41011i;
        CheckableImageButton checkableImageButton = c7321u.f41006d;
        checkableImageButton.setOnClickListener(onClickListener);
        C7314n.m14720d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C7321u c7321u = this.f15746b;
        c7321u.f41011i = onLongClickListener;
        CheckableImageButton checkableImageButton = c7321u.f41006d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        C7314n.m14720d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        C7321u c7321u = this.f15746b;
        c7321u.f41010h = scaleType;
        c7321u.f41006d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        C7321u c7321u = this.f15746b;
        if (c7321u.f41007e != colorStateList) {
            c7321u.f41007e = colorStateList;
            C7314n.m14717a(c7321u.f41003a, c7321u.f41006d, colorStateList, c7321u.f41008f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        C7321u c7321u = this.f15746b;
        if (c7321u.f41008f != mode) {
            c7321u.f41008f = mode;
            C7314n.m14717a(c7321u.f41003a, c7321u.f41006d, c7321u.f41007e, mode);
        }
    }

    public void setStartIconVisible(boolean z10) {
        this.f15746b.m14734b(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        C3093a c3093a = this.f15748c;
        c3093a.getClass();
        c3093a.f15792K = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c3093a.f15793L.setText(charSequence);
        c3093a.m8919m();
    }

    public void setSuffixTextAppearance(int i10) {
        this.f15748c.f15793L.setTextAppearance(i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f15748c.f15793L.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C3089e c3089e) {
        EditText editText = this.f15750d;
        if (editText != null) {
            C10029b0.m18658n(editText, c3089e);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f15776u0) {
            this.f15776u0 = typeface;
            this.f15729N0.m8807m(typeface);
            C7315o c7315o = this.f15762j;
            if (typeface != c7315o.f40956B) {
                c7315o.f40956B = typeface;
                AppCompatTextView appCompatTextView = c7315o.f40974r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = c7315o.f40981y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.f15720J;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m8901t(boolean z10, boolean z11) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f15750d;
        boolean z12 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f15750d;
        boolean z13 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f15710B0;
        C3040a c3040a = this.f15729N0;
        if (colorStateList2 != null) {
            c3040a.m8803i(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f15710B0;
            c3040a.m8803i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f15725L0) : this.f15725L0));
        } else if (m8894m()) {
            AppCompatTextView appCompatTextView2 = this.f15762j.f40974r;
            c3040a.m8803i(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.f15716H && (appCompatTextView = this.f15720J) != null) {
            c3040a.m8803i(appCompatTextView.getTextColors());
        } else if (z13 && (colorStateList = this.f15711C0) != null && c3040a.f15400k != colorStateList) {
            c3040a.f15400k = colorStateList;
            c3040a.m8802h(false);
        }
        C3093a c3093a = this.f15748c;
        C7321u c7321u = this.f15746b;
        if (z12 || !this.f15731O0 || (isEnabled() && z13)) {
            if (z11 || this.f15727M0) {
                ValueAnimator valueAnimator = this.f15735Q0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f15735Q0.cancel();
                }
                if (z10 && this.f15733P0) {
                    m8883a(1.0f);
                } else {
                    c3040a.m8805k(1.0f);
                }
                this.f15727M0 = false;
                if (m8887e()) {
                    m8892j();
                }
                EditText editText3 = this.f15750d;
                m8902u(editText3 != null ? editText3.getText() : null);
                c7321u.f41012j = false;
                c7321u.m14736d();
                c3093a.f15794M = false;
                c3093a.m8919m();
                return;
            }
            return;
        }
        if (z11 || !this.f15727M0) {
            ValueAnimator valueAnimator2 = this.f15735Q0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f15735Q0.cancel();
            }
            if (z10 && this.f15733P0) {
                m8883a(0.0f);
            } else {
                c3040a.m8805k(0.0f);
            }
            if (m8887e() && (!((C7306f) this.f15747b0).f40928S.f40929v.isEmpty()) && m8887e()) {
                ((C7306f) this.f15747b0).m14705u(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f15727M0 = true;
            AppCompatTextView appCompatTextView3 = this.f15730O;
            if (appCompatTextView3 != null && this.f15728N) {
                appCompatTextView3.setText((CharSequence) null);
                C9419k0.m17819a(this.f15744a, this.f15738S);
                this.f15730O.setVisibility(4);
            }
            c7321u.f41012j = true;
            c7321u.m14736d();
            c3093a.f15794M = true;
            c3093a.m8919m();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m8902u(Editable editable) {
        ((C8002l) this.f15718I).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f15744a;
        if (length != 0 || this.f15727M0) {
            AppCompatTextView appCompatTextView = this.f15730O;
            if (appCompatTextView == null || !this.f15728N) {
                return;
            }
            appCompatTextView.setText((CharSequence) null);
            C9419k0.m17819a(frameLayout, this.f15738S);
            this.f15730O.setVisibility(4);
            return;
        }
        if (this.f15730O == null || !this.f15728N || TextUtils.isEmpty(this.f15726M)) {
            return;
        }
        this.f15730O.setText(this.f15726M);
        C9419k0.m17819a(frameLayout, this.f15736R);
        this.f15730O.setVisibility(0);
        this.f15730O.bringToFront();
        announceForAccessibility(this.f15726M);
    }

    /* JADX INFO: renamed from: v */
    public final void m8903v(boolean z10, boolean z11) {
        int defaultColor = this.f15715G0.getDefaultColor();
        int colorForState = this.f15715G0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f15715G0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z10) {
            this.f15771p0 = colorForState2;
        } else if (z11) {
            this.f15771p0 = colorForState;
        } else {
            this.f15771p0 = defaultColor;
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:82:0x0104  */
    /* JADX INFO: renamed from: w */
    public final void m8904w() {
        AppCompatTextView appCompatTextView;
        ColorStateList colorStateListValueOf;
        EditText editText;
        EditText editText2;
        if (this.f15747b0 == null || this.f15765k0 == 0) {
            return;
        }
        boolean z10 = false;
        boolean z11 = isFocused() || ((editText2 = this.f15750d) != null && editText2.hasFocus());
        boolean z12 = isHovered() || ((editText = this.f15750d) != null && editText.isHovered());
        if (m8894m() || (this.f15720J != null && this.f15716H)) {
            z10 = true;
        }
        if (!isEnabled()) {
            this.f15771p0 = this.f15725L0;
        } else if (m8894m()) {
            if (this.f15715G0 != null) {
                m8903v(z11, z12);
            } else {
                this.f15771p0 = getErrorCurrentTextColors();
            }
        } else if (!this.f15716H || (appCompatTextView = this.f15720J) == null) {
            if (z11) {
                this.f15771p0 = this.f15714F0;
            } else if (z12) {
                this.f15771p0 = this.f15713E0;
            } else {
                this.f15771p0 = this.f15712D0;
            }
        } else if (this.f15715G0 != null) {
            m8903v(z11, z12);
        } else {
            this.f15771p0 = appCompatTextView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Context context = getContext();
            TypedValue typedValueM10922a = C5149b.m10922a(com.linguist.R.attr.colorControlActivated, context);
            if (typedValueM10922a != null) {
                int i10 = typedValueM10922a.resourceId;
                if (i10 != 0) {
                    colorStateListValueOf = C7472a.m14842b(i10, context);
                } else {
                    int i11 = typedValueM10922a.data;
                    if (i11 != 0) {
                        colorStateListValueOf = ColorStateList.valueOf(i11);
                    } else {
                        colorStateListValueOf = null;
                    }
                }
            } else {
                colorStateListValueOf = null;
            }
            EditText editText3 = this.f15750d;
            if (editText3 != null && editText3.getTextCursorDrawable() != null) {
                if (colorStateListValueOf != null) {
                    Drawable textCursorDrawable = this.f15750d.getTextCursorDrawable();
                    if (z10) {
                        ColorStateList colorStateListValueOf2 = this.f15715G0;
                        if (colorStateListValueOf2 == null) {
                            colorStateListValueOf2 = ColorStateList.valueOf(this.f15771p0);
                        }
                        colorStateListValueOf = colorStateListValueOf2;
                    }
                    C8488a.b.m16570h(textCursorDrawable, colorStateListValueOf);
                }
            }
        }
        C3093a c3093a = this.f15748c;
        c3093a.m8917k();
        CheckableImageButton checkableImageButton = c3093a.f15801c;
        ColorStateList colorStateList = c3093a.f15802d;
        TextInputLayout textInputLayout = c3093a.f15799a;
        C7314n.m14719c(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = c3093a.f15809k;
        CheckableImageButton checkableImageButton2 = c3093a.f15805g;
        C7314n.m14719c(textInputLayout, checkableImageButton2, colorStateList2);
        if (c3093a.m8908b() instanceof C7312l) {
            if (!textInputLayout.m8894m() || checkableImageButton2.getDrawable() == null) {
                C7314n.m14717a(textInputLayout, checkableImageButton2, c3093a.f15809k, c3093a.f15810l);
            } else {
                Drawable drawableMutate = checkableImageButton2.getDrawable().mutate();
                C8488a.b.m16569g(drawableMutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(drawableMutate);
            }
        }
        C7321u c7321u = this.f15746b;
        C7314n.m14719c(c7321u.f41003a, c7321u.f41006d, c7321u.f41007e);
        if (this.f15765k0 == 2) {
            int i12 = this.f15768m0;
            if (z11 && isEnabled()) {
                this.f15768m0 = this.f15770o0;
            } else {
                this.f15768m0 = this.f15769n0;
            }
            if (this.f15768m0 != i12 && m8887e() && !this.f15727M0) {
                if (m8887e()) {
                    ((C7306f) this.f15747b0).m14705u(0.0f, 0.0f, 0.0f, 0.0f);
                }
                m8892j();
            }
        }
        if (this.f15765k0 == 1) {
            if (!isEnabled()) {
                this.f15772q0 = this.f15719I0;
            } else if (z12 && !z11) {
                this.f15772q0 = this.f15723K0;
            } else if (z11) {
                this.f15772q0 = this.f15721J0;
            } else {
                this.f15772q0 = this.f15717H0;
            }
        }
        m8884b();
    }
}
