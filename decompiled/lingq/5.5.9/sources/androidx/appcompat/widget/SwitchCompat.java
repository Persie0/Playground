package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.C0892f;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p024b3.C1304k;
import p058d.C4999a;
import p104f.C5452a;
import p140h.C5863a;
import p254m2.C7472a;
import p329q2.C8488a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p471x2.C10072z;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* JADX INFO: renamed from: p0 */
    public static final C0282a f1012p0 = new C0282a();

    /* JADX INFO: renamed from: q0 */
    public static final int[] f1013q0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: H */
    public int f1014H;

    /* JADX INFO: renamed from: I */
    public boolean f1015I;

    /* JADX INFO: renamed from: J */
    public CharSequence f1016J;

    /* JADX INFO: renamed from: K */
    public CharSequence f1017K;

    /* JADX INFO: renamed from: L */
    public CharSequence f1018L;

    /* JADX INFO: renamed from: M */
    public CharSequence f1019M;

    /* JADX INFO: renamed from: N */
    public boolean f1020N;

    /* JADX INFO: renamed from: O */
    public int f1021O;

    /* JADX INFO: renamed from: P */
    public final int f1022P;

    /* JADX INFO: renamed from: Q */
    public float f1023Q;

    /* JADX INFO: renamed from: R */
    public float f1024R;

    /* JADX INFO: renamed from: S */
    public final VelocityTracker f1025S;

    /* JADX INFO: renamed from: T */
    public final int f1026T;

    /* JADX INFO: renamed from: U */
    public float f1027U;

    /* JADX INFO: renamed from: V */
    public int f1028V;

    /* JADX INFO: renamed from: W */
    public int f1029W;

    /* JADX INFO: renamed from: a */
    public Drawable f1030a;

    /* JADX INFO: renamed from: a0 */
    public int f1031a0;

    /* JADX INFO: renamed from: b */
    public ColorStateList f1032b;

    /* JADX INFO: renamed from: b0 */
    public int f1033b0;

    /* JADX INFO: renamed from: c */
    public PorterDuff.Mode f1034c;

    /* JADX INFO: renamed from: c0 */
    public int f1035c0;

    /* JADX INFO: renamed from: d */
    public boolean f1036d;

    /* JADX INFO: renamed from: d0 */
    public int f1037d0;

    /* JADX INFO: renamed from: e */
    public boolean f1038e;

    /* JADX INFO: renamed from: e0 */
    public int f1039e0;

    /* JADX INFO: renamed from: f */
    public Drawable f1040f;

    /* JADX INFO: renamed from: f0 */
    public boolean f1041f0;

    /* JADX INFO: renamed from: g */
    public ColorStateList f1042g;

    /* JADX INFO: renamed from: g0 */
    public final TextPaint f1043g0;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f1044h;

    /* JADX INFO: renamed from: h0 */
    public ColorStateList f1045h0;

    /* JADX INFO: renamed from: i */
    public boolean f1046i;

    /* JADX INFO: renamed from: i0 */
    public StaticLayout f1047i0;

    /* JADX INFO: renamed from: j */
    public boolean f1048j;

    /* JADX INFO: renamed from: j0 */
    public StaticLayout f1049j0;

    /* JADX INFO: renamed from: k */
    public int f1050k;

    /* JADX INFO: renamed from: k0 */
    public C5863a f1051k0;

    /* JADX INFO: renamed from: l */
    public int f1052l;

    /* JADX INFO: renamed from: l0 */
    public ObjectAnimator f1053l0;

    /* JADX INFO: renamed from: m0 */
    public C0324k f1054m0;

    /* JADX INFO: renamed from: n0 */
    public C0284c f1055n0;

    /* JADX INFO: renamed from: o0 */
    public final Rect f1056o0;

    /* JADX INFO: renamed from: androidx.appcompat.widget.SwitchCompat$a */
    public class C0282a extends Property<SwitchCompat, Float> {
        public C0282a() {
            super(Float.class, "thumbPos");
        }

        @Override // android.util.Property
        public final Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f1027U);
        }

        @Override // android.util.Property
        public final void set(SwitchCompat switchCompat, Float f3) {
            switchCompat.setThumbPosition(f3.floatValue());
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SwitchCompat$b */
    public static class C0283b {
        /* JADX INFO: renamed from: a */
        public static void m1046a(ObjectAnimator objectAnimator, boolean z10) {
            objectAnimator.setAutoCancel(z10);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.SwitchCompat$c */
    public static class C0284c extends C0892f.f {

        /* JADX INFO: renamed from: a */
        public final WeakReference f1057a;

        public C0284c(SwitchCompat switchCompat) {
            this.f1057a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.C0892f.f
        /* JADX INFO: renamed from: a */
        public final void mo1047a() {
            SwitchCompat switchCompat = (SwitchCompat) this.f1057a.get();
            if (switchCompat != null) {
                switchCompat.m1044d();
            }
        }

        @Override // androidx.emoji2.text.C0892f.f
        /* JADX INFO: renamed from: b */
        public final void mo1048b() {
            SwitchCompat switchCompat = (SwitchCompat) this.f1057a.get();
            if (switchCompat != null) {
                switchCompat.m1044d();
            }
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i10) {
        Typeface typeface;
        int resourceId;
        super(context, attributeSet, com.linguist.R.attr.switchStyle);
        this.f1032b = null;
        this.f1034c = null;
        this.f1036d = false;
        this.f1038e = false;
        this.f1042g = null;
        this.f1044h = null;
        this.f1046i = false;
        this.f1048j = false;
        this.f1025S = VelocityTracker.obtain();
        boolean z10 = true;
        this.f1041f0 = true;
        this.f1056o0 = new Rect();
        C0349w0.m1279a(getContext(), this);
        TextPaint textPaint = new TextPaint(1);
        this.f1043g0 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = C4999a.f32609w;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, com.linguist.R.attr.switchStyle, 0);
        C0300b1 c0300b1 = new C0300b1(context, typedArrayObtainStyledAttributes);
        C10029b0.m18657m(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, com.linguist.R.attr.switchStyle);
        Drawable drawableM1116e = c0300b1.m1116e(2);
        this.f1030a = drawableM1116e;
        if (drawableM1116e != null) {
            drawableM1116e.setCallback(this);
        }
        Drawable drawableM1116e2 = c0300b1.m1116e(11);
        this.f1040f = drawableM1116e2;
        if (drawableM1116e2 != null) {
            drawableM1116e2.setCallback(this);
        }
        setTextOnInternal(c0300b1.m1122k(0));
        setTextOffInternal(c0300b1.m1122k(1));
        this.f1020N = c0300b1.m1112a(3, true);
        this.f1050k = c0300b1.m1115d(8, 0);
        this.f1052l = c0300b1.m1115d(5, 0);
        this.f1014H = c0300b1.m1115d(6, 0);
        this.f1015I = c0300b1.m1112a(4, false);
        ColorStateList colorStateListM1113b = c0300b1.m1113b(9);
        if (colorStateListM1113b != null) {
            this.f1032b = colorStateListM1113b;
            this.f1036d = true;
        }
        PorterDuff.Mode modeM1188c = C0311f0.m1188c(c0300b1.m1119h(10, -1), null);
        if (this.f1034c != modeM1188c) {
            this.f1034c = modeM1188c;
            this.f1038e = true;
        }
        if (this.f1036d || this.f1038e) {
            m1041a();
        }
        ColorStateList colorStateListM1113b2 = c0300b1.m1113b(12);
        if (colorStateListM1113b2 != null) {
            this.f1042g = colorStateListM1113b2;
            this.f1046i = true;
        }
        PorterDuff.Mode modeM1188c2 = C0311f0.m1188c(c0300b1.m1119h(13, -1), null);
        if (this.f1044h != modeM1188c2) {
            this.f1044h = modeM1188c2;
            this.f1048j = true;
        }
        if (this.f1046i || this.f1048j) {
            m1042b();
        }
        int iM1120i = c0300b1.m1120i(7, 0);
        if (iM1120i != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iM1120i, C4999a.f32610x);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes2.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(3, 0)) == 0 || (colorStateList = C7472a.m14842b(resourceId, context)) == null) ? typedArrayObtainStyledAttributes2.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.f1045h0 = colorStateList;
            } else {
                this.f1045h0 = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f3 = dimensionPixelSize;
                if (f3 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f3);
                    requestLayout();
                }
            }
            int i11 = typedArrayObtainStyledAttributes2.getInt(1, -1);
            int i12 = typedArrayObtainStyledAttributes2.getInt(2, -1);
            if (i11 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i11 != 2) {
                typeface = i11 != 3 ? null : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            if (i12 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i12) : Typeface.create(typeface, i12);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i13 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i12;
                if ((i13 & 1) == 0) {
                    z10 = false;
                }
                textPaint.setFakeBoldText(z10);
                textPaint.setTextSkewX((i13 & 2) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes2.getBoolean(14, false)) {
                this.f1051k0 = new C5863a(getContext());
            } else {
                this.f1051k0 = null;
            }
            setTextOnInternal(this.f1016J);
            setTextOffInternal(this.f1018L);
            typedArrayObtainStyledAttributes2.recycle();
        }
        new C0350x(this).m1288f(attributeSet, com.linguist.R.attr.switchStyle);
        c0300b1.m1124n();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1022P = viewConfiguration.getScaledTouchSlop();
        this.f1026T = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().m1233b(attributeSet, com.linguist.R.attr.switchStyle);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private C0324k getEmojiTextViewHelper() {
        if (this.f1054m0 == null) {
            this.f1054m0 = new C0324k(this);
        }
        return this.f1054m0;
    }

    private boolean getTargetCheckedState() {
        return this.f1027U > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((C0318h1.m1200a(this) ? 1.0f - this.f1027U : this.f1027U) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f1040f;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f1056o0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f1030a;
        Rect rectM1187b = drawable2 != null ? C0311f0.m1187b(drawable2) : C0311f0.f1176c;
        return ((((this.f1028V - this.f1031a0) - rect.left) - rect.right) - rectM1187b.left) - rectM1187b.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f1018L = charSequence;
        C0324k emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodMo15296e = emojiTextViewHelper.f1256b.f42219a.mo15296e(this.f1051k0);
        if (transformationMethodMo15296e != null) {
            charSequence = transformationMethodMo15296e.getTransformation(charSequence, this);
        }
        this.f1019M = charSequence;
        this.f1049j0 = null;
        if (this.f1020N) {
            m1045e();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f1016J = charSequence;
        C0324k emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodMo15296e = emojiTextViewHelper.f1256b.f42219a.mo15296e(this.f1051k0);
        if (transformationMethodMo15296e != null) {
            charSequence = transformationMethodMo15296e.getTransformation(charSequence, this);
        }
        this.f1017K = charSequence;
        this.f1047i0 = null;
        if (this.f1020N) {
            m1045e();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1041a() {
        Drawable drawable = this.f1030a;
        if (drawable != null) {
            if (!this.f1036d && !this.f1038e) {
                return;
            }
            Drawable drawableMutate = drawable.mutate();
            this.f1030a = drawableMutate;
            if (this.f1036d) {
                C8488a.b.m16570h(drawableMutate, this.f1032b);
            }
            if (this.f1038e) {
                C8488a.b.m16571i(this.f1030a, this.f1034c);
            }
            if (this.f1030a.isStateful()) {
                this.f1030a.setState(getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1042b() {
        Drawable drawable = this.f1040f;
        if (drawable != null) {
            if (!this.f1046i && !this.f1048j) {
                return;
            }
            Drawable drawableMutate = drawable.mutate();
            this.f1040f = drawableMutate;
            if (this.f1046i) {
                C8488a.b.m16570h(drawableMutate, this.f1042g);
            }
            if (this.f1048j) {
                C8488a.b.m16571i(this.f1040f, this.f1044h);
            }
            if (this.f1040f.isStateful()) {
                this.f1040f.setState(getDrawableState());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final StaticLayout m1043c(CharSequence charSequence) {
        TextPaint textPaint = this.f1043g0;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* JADX INFO: renamed from: d */
    public final void m1044d() {
        setTextOnInternal(this.f1016J);
        setTextOffInternal(this.f1018L);
        requestLayout();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        int i12 = this.f1033b0;
        int i13 = this.f1035c0;
        int i14 = this.f1037d0;
        int i15 = this.f1039e0;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f1030a;
        Rect rectM1187b = drawable != null ? C0311f0.m1187b(drawable) : C0311f0.f1176c;
        Drawable drawable2 = this.f1040f;
        Rect rect = this.f1056o0;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i16 = rect.left;
            thumbOffset += i16;
            if (rectM1187b != null) {
                int i17 = rectM1187b.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = rectM1187b.top;
                int i19 = rect.top;
                i10 = i18 > i19 ? (i18 - i19) + i13 : i13;
                int i20 = rectM1187b.right;
                int i21 = rect.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = rectM1187b.bottom;
                int i23 = rect.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                }
                this.f1040f.setBounds(i12, i10, i14, i11);
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f1040f.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f1030a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i24 = thumbOffset - rect.left;
            int i25 = thumbOffset + this.f1031a0 + rect.right;
            this.f1030a.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                C8488a.b.m16568f(background, i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f3, float f10) {
        super.drawableHotspotChanged(f3, f10);
        Drawable drawable = this.f1030a;
        if (drawable != null) {
            C8488a.b.m16567e(drawable, f3, f10);
        }
        Drawable drawable2 = this.f1040f;
        if (drawable2 != null) {
            C8488a.b.m16567e(drawable2, f3, f10);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1030a;
        boolean state = false;
        if (drawable != null && drawable.isStateful()) {
            state = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f1040f;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m1045e() {
        if (this.f1055n0 == null && this.f1054m0.f1256b.f42219a.mo15293b() && C0892f.m3520c()) {
            C0892f c0892fM3519a = C0892f.m3519a();
            int iM3521b = c0892fM3519a.m3521b();
            if (iM3521b == 3 || iM3521b == 0) {
                C0284c c0284c = new C0284c(this);
                this.f1055n0 = c0284c;
                c0892fM3519a.m3527i(c0284c);
            }
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!C0318h1.m1200a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f1028V;
        if (!TextUtils.isEmpty(getText())) {
            compoundPaddingLeft += this.f1014H;
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (C0318h1.m1200a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f1028V;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1014H : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C1304k.m4831f(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f1020N;
    }

    public boolean getSplitTrack() {
        return this.f1015I;
    }

    public int getSwitchMinWidth() {
        return this.f1052l;
    }

    public int getSwitchPadding() {
        return this.f1014H;
    }

    public CharSequence getTextOff() {
        return this.f1018L;
    }

    public CharSequence getTextOn() {
        return this.f1016J;
    }

    public Drawable getThumbDrawable() {
        return this.f1030a;
    }

    public final float getThumbPosition() {
        return this.f1027U;
    }

    public int getThumbTextPadding() {
        return this.f1050k;
    }

    public ColorStateList getThumbTintList() {
        return this.f1032b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1034c;
    }

    public Drawable getTrackDrawable() {
        return this.f1040f;
    }

    public ColorStateList getTrackTintList() {
        return this.f1042g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1044h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1030a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1040f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1053l0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f1053l0.end();
        this.f1053l0 = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f1013q0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f1040f;
        Rect rect = this.f1056o0;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.f1035c0;
        int i11 = this.f1039e0;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f1030a;
        if (drawable != null) {
            if (!this.f1015I || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectM1187b = C0311f0.m1187b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectM1187b.left;
                rect.right -= rectM1187b.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.f1047i0 : this.f1049j0;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f1045h0;
            TextPaint textPaint = this.f1043g0;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i12 + i13) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f1016J : this.f1018L;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(text);
            sb2.append(' ');
            sb2.append(charSequence);
            accessibilityNodeInfo.setText(sb2);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z10, i10, i11, i12, i13);
        int iMax2 = 0;
        if (this.f1030a != null) {
            Drawable drawable = this.f1040f;
            Rect rect = this.f1056o0;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectM1187b = C0311f0.m1187b(this.f1030a);
            iMax = Math.max(0, rectM1187b.left - rect.left);
            iMax2 = Math.max(0, rectM1187b.right - rect.right);
        } else {
            iMax = 0;
        }
        if (C0318h1.m1200a(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f1028V + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f1028V) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i14 = this.f1029W;
            int i15 = height2 - (i14 / 2);
            height = i14 + i15;
            paddingTop = i15;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.f1029W + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.f1029W;
        }
        this.f1033b0 = paddingLeft;
        this.f1035c0 = paddingTop;
        this.f1039e0 = height;
        this.f1037d0 = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int intrinsicWidth;
        int intrinsicHeight;
        int iMax;
        if (this.f1020N) {
            if (this.f1047i0 == null) {
                this.f1047i0 = m1043c(this.f1017K);
            }
            if (this.f1049j0 == null) {
                this.f1049j0 = m1043c(this.f1019M);
            }
        }
        Drawable drawable = this.f1030a;
        int intrinsicHeight2 = 0;
        Rect rect = this.f1056o0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f1030a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f1030a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        if (this.f1020N) {
            iMax = (this.f1050k * 2) + Math.max(this.f1047i0.getWidth(), this.f1049j0.getWidth());
        } else {
            iMax = 0;
        }
        this.f1031a0 = Math.max(iMax, intrinsicWidth);
        Drawable drawable2 = this.f1040f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f1040f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax2 = rect.left;
        int iMax3 = rect.right;
        Drawable drawable3 = this.f1030a;
        if (drawable3 != null) {
            Rect rectM1187b = C0311f0.m1187b(drawable3);
            iMax2 = Math.max(iMax2, rectM1187b.left);
            iMax3 = Math.max(iMax3, rectM1187b.right);
        }
        int iMax4 = this.f1041f0 ? Math.max(this.f1052l, (this.f1031a0 * 2) + iMax2 + iMax3) : this.f1052l;
        int iMax5 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f1028V = iMax4;
        this.f1029W = iMax5;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < iMax5) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax5);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1016J : this.f1018L;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:64:0x0103  */
    /* JADX WARN: Code duplicated, block: B:65:0x0108  */
    /* JADX WARN: Code duplicated, block: B:67:0x010c  */
    /* JADX WARN: Code duplicated, block: B:70:0x0126  */
    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean zIsChecked;
        boolean targetCheckedState;
        float xVelocity;
        float f3;
        VelocityTracker velocityTracker = this.f1025S;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.f1022P;
        boolean z11 = false;
        if (actionMasked != 0) {
            float f10 = 0.0f;
            if (actionMasked == 1) {
                if (this.f1021O == 2) {
                    this.f1021O = 0;
                    if (motionEvent.getAction() == 1 || !isEnabled()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    zIsChecked = isChecked();
                    if (z10) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) <= this.f1026T) {
                            targetCheckedState = C0318h1.m1200a(this) ? xVelocity > 0.0f : xVelocity < 0.0f;
                        } else {
                            targetCheckedState = getTargetCheckedState();
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    super.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f1021O = 0;
                velocityTracker.clear();
            } else if (actionMasked == 2) {
                int i11 = this.f1021O;
                if (i11 == 1) {
                    float x10 = motionEvent.getX();
                    float y10 = motionEvent.getY();
                    if (Math.abs(x10 - this.f1023Q) <= i10) {
                        if (Math.abs(y10 - this.f1024R) > i10) {
                        }
                    }
                    this.f1021O = 2;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.f1023Q = x10;
                    this.f1024R = y10;
                    return true;
                }
                if (i11 == 2) {
                    float x11 = motionEvent.getX();
                    int thumbScrollRange = getThumbScrollRange();
                    float f11 = x11 - this.f1023Q;
                    if (thumbScrollRange != 0) {
                        f3 = f11 / thumbScrollRange;
                    } else {
                        f3 = f11 > 0.0f ? 1.0f : -1.0f;
                    }
                    if (C0318h1.m1200a(this)) {
                        f3 = -f3;
                    }
                    float f12 = this.f1027U;
                    float f13 = f3 + f12;
                    if (f13 >= 0.0f) {
                        f10 = f13 > 1.0f ? 1.0f : f13;
                    }
                    if (f10 != f12) {
                        this.f1023Q = x11;
                        setThumbPosition(f10);
                    }
                    return true;
                }
            } else if (actionMasked == 3) {
                if (this.f1021O == 2) {
                    this.f1021O = 0;
                    if (motionEvent.getAction() == 1) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    zIsChecked = isChecked();
                    if (z10) {
                        velocityTracker.computeCurrentVelocity(1000);
                        xVelocity = velocityTracker.getXVelocity();
                        if (Math.abs(xVelocity) <= this.f1026T) {
                            targetCheckedState = getTargetCheckedState();
                        } else if (C0318h1.m1200a(this)) {
                        }
                    } else {
                        targetCheckedState = zIsChecked;
                    }
                    if (targetCheckedState != zIsChecked) {
                        playSoundEffect(0);
                    }
                    setChecked(targetCheckedState);
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                    motionEventObtain2.setAction(3);
                    super.onTouchEvent(motionEventObtain2);
                    motionEventObtain2.recycle();
                    super.onTouchEvent(motionEvent);
                    return true;
                }
                this.f1021O = 0;
                velocityTracker.clear();
            }
            return super.onTouchEvent(motionEvent);
        }
        float x12 = motionEvent.getX();
        float y11 = motionEvent.getY();
        if (isEnabled()) {
            if (this.f1030a != null) {
                int thumbOffset = getThumbOffset();
                Drawable drawable = this.f1030a;
                Rect rect = this.f1056o0;
                drawable.getPadding(rect);
                int i12 = this.f1035c0 - i10;
                int i13 = (this.f1033b0 + thumbOffset) - i10;
                int i14 = this.f1031a0 + i13 + rect.left + rect.right + i10;
                int i15 = this.f1039e0 + i10;
                if (x12 > i13 && x12 < i14 && y11 > i12 && y11 < i15) {
                    z11 = true;
                }
            }
            if (z11) {
                this.f1021O = 1;
                this.f1023Q = x12;
                this.f1024R = y11;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z10) {
        super.setAllCaps(z10);
        getEmojiTextViewHelper().m1234c(z10);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        super.setChecked(z10);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.f1016J;
                if (string == null) {
                    string = getResources().getString(com.linguist.R.string.abc_capital_on);
                }
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                new C10072z().m18662e(this, string);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.f1018L;
            if (string2 == null) {
                string2 = getResources().getString(com.linguist.R.string.abc_capital_off);
            }
            WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
            new C10072z().m18662e(this, string2);
        }
        if (getWindowToken() != null) {
            WeakHashMap<View, C10049l0> weakHashMap3 = C10029b0.f50993a;
            if (C10029b0.g.m18699c(this)) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f1012p0, zIsChecked ? 1.0f : 0.0f);
                this.f1053l0 = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(250L);
                C0283b.m1046a(this.f1053l0, true);
                this.f1053l0.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f1053l0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setThumbPosition(zIsChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C1304k.m4832g(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z10) {
        getEmojiTextViewHelper().m1235d(z10);
        setTextOnInternal(this.f1016J);
        setTextOffInternal(this.f1018L);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z10) {
        this.f1041f0 = z10;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().m1232a(inputFilterArr));
    }

    public void setShowText(boolean z10) {
        if (this.f1020N != z10) {
            this.f1020N = z10;
            requestLayout();
            if (z10) {
                m1045e();
            }
        }
    }

    public void setSplitTrack(boolean z10) {
        this.f1015I = z10;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f1052l = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f1014H = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.f1043g0;
        if (textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) {
            if (textPaint.getTypeface() != null || typeface == null) {
                return;
            }
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked() && Build.VERSION.SDK_INT >= 30) {
            Object string = this.f1018L;
            if (string == null) {
                string = getResources().getString(com.linguist.R.string.abc_capital_off);
            }
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            new C10072z().m18662e(this, string);
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        CharSequence string = this.f1016J;
        if (string == null) {
            string = getResources().getString(com.linguist.R.string.abc_capital_on);
        }
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        new C10072z().m18662e(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1030a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1030a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f3) {
        this.f1027U = f3;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(C5452a.m11672a(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.f1050k = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1032b = colorStateList;
        this.f1036d = true;
        m1041a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1034c = mode;
        this.f1038e = true;
        m1041a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1040f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1040f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(C5452a.m11672a(getContext(), i10));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1042g = colorStateList;
        this.f1046i = true;
        m1042b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1044h = mode;
        this.f1048j = true;
        m1042b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f1030a) {
            if (drawable != this.f1040f) {
                return false;
            }
        }
        return true;
    }
}
