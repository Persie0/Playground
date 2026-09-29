package com.google.android.material.button;

import ae.C0062b;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.C0307e;
import androidx.customview.view.AbsSavedState;
import gd.C5772k;
import gd.InterfaceC5776o;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import md.C7542a;
import nc.C7738a;
import p024b3.C1304k;
import p072dd.C5150c;
import p093ed.C5397a;
import p104f.C5452a;
import p153hc.C6031a;
import p254m2.C7472a;
import p329q2.C8488a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p507yc.C10344k;
import p507yc.C10347n;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends C0307e implements Checkable, InterfaceC5776o {

    /* JADX INFO: renamed from: M */
    public static final int[] f14904M = {R.attr.state_checkable};

    /* JADX INFO: renamed from: N */
    public static final int[] f14905N = {R.attr.state_checked};

    /* JADX INFO: renamed from: H */
    public int f14906H;

    /* JADX INFO: renamed from: I */
    public int f14907I;

    /* JADX INFO: renamed from: J */
    public boolean f14908J;

    /* JADX INFO: renamed from: K */
    public boolean f14909K;

    /* JADX INFO: renamed from: L */
    public int f14910L;

    /* JADX INFO: renamed from: d */
    public final C7738a f14911d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet<InterfaceC2968a> f14912e;

    /* JADX INFO: renamed from: f */
    public InterfaceC2969b f14913f;

    /* JADX INFO: renamed from: g */
    public PorterDuff.Mode f14914g;

    /* JADX INFO: renamed from: h */
    public ColorStateList f14915h;

    /* JADX INFO: renamed from: i */
    public Drawable f14916i;

    /* JADX INFO: renamed from: j */
    public String f14917j;

    /* JADX INFO: renamed from: k */
    public int f14918k;

    /* JADX INFO: renamed from: l */
    public int f14919l;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2967a();

        /* JADX INFO: renamed from: c */
        public boolean f14920c;

        /* JADX INFO: renamed from: com.google.android.material.button.MaterialButton$SavedState$a */
        public class C2967a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            boolean z10 = true;
            if (parcel.readInt() != 1) {
                z10 = false;
            }
            this.f14920c = z10;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f5635a, i10);
            parcel.writeInt(this.f14920c ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButton$a */
    public interface InterfaceC2968a {
        /* JADX INFO: renamed from: a */
        void m8633a();
    }

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButton$b */
    public interface InterfaceC2969b {
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(C7542a.m15048a(context, attributeSet, com.linguist.R.attr.materialButtonStyle, com.linguist.R.style.Widget_MaterialComponents_Button), attributeSet, com.linguist.R.attr.materialButtonStyle);
        this.f14912e = new LinkedHashSet<>();
        boolean z10 = false;
        this.f14908J = false;
        this.f14909K = false;
        Context context2 = getContext();
        TypedArray typedArrayM19357d = C10344k.m19357d(context2, attributeSet, C6031a.f35668r, com.linguist.R.attr.materialButtonStyle, com.linguist.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f14907I = typedArrayM19357d.getDimensionPixelSize(12, 0);
        this.f14914g = C10347n.m19366f(typedArrayM19357d.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.f14915h = C5150c.m10925a(getContext(), typedArrayM19357d, 14);
        this.f14916i = C5150c.m10928d(getContext(), typedArrayM19357d, 10);
        this.f14910L = typedArrayM19357d.getInteger(11, 1);
        this.f14918k = typedArrayM19357d.getDimensionPixelSize(13, 0);
        C7738a c7738a = new C7738a(this, new C5772k(C5772k.m12150b(context2, attributeSet, com.linguist.R.attr.materialButtonStyle, com.linguist.R.style.Widget_MaterialComponents_Button)));
        this.f14911d = c7738a;
        c7738a.f42341c = typedArrayM19357d.getDimensionPixelOffset(1, 0);
        c7738a.f42342d = typedArrayM19357d.getDimensionPixelOffset(2, 0);
        c7738a.f42343e = typedArrayM19357d.getDimensionPixelOffset(3, 0);
        c7738a.f42344f = typedArrayM19357d.getDimensionPixelOffset(4, 0);
        if (typedArrayM19357d.hasValue(8)) {
            int dimensionPixelSize = typedArrayM19357d.getDimensionPixelSize(8, -1);
            c7738a.f42345g = dimensionPixelSize;
            c7738a.m15329c(c7738a.f42340b.m12153e(dimensionPixelSize));
            c7738a.f42354p = true;
        }
        c7738a.f42346h = typedArrayM19357d.getDimensionPixelSize(20, 0);
        c7738a.f42347i = C10347n.m19366f(typedArrayM19357d.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        c7738a.f42348j = C5150c.m10925a(getContext(), typedArrayM19357d, 6);
        c7738a.f42349k = C5150c.m10925a(getContext(), typedArrayM19357d, 19);
        c7738a.f42350l = C5150c.m10925a(getContext(), typedArrayM19357d, 16);
        c7738a.f42355q = typedArrayM19357d.getBoolean(5, false);
        c7738a.f42358t = typedArrayM19357d.getDimensionPixelSize(9, 0);
        c7738a.f42356r = typedArrayM19357d.getBoolean(21, true);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        int iM18688f = C10029b0.e.m18688f(this);
        int paddingTop = getPaddingTop();
        int iM18687e = C10029b0.e.m18687e(this);
        int paddingBottom = getPaddingBottom();
        if (typedArrayM19357d.hasValue(0)) {
            c7738a.f42353o = true;
            setSupportBackgroundTintList(c7738a.f42348j);
            setSupportBackgroundTintMode(c7738a.f42347i);
        } else {
            c7738a.m15331e();
        }
        C10029b0.e.m18693k(this, iM18688f + c7738a.f42341c, paddingTop + c7738a.f42343e, iM18687e + c7738a.f42342d, paddingBottom + c7738a.f42344f);
        typedArrayM19357d.recycle();
        setCompoundDrawablePadding(this.f14907I);
        m8631c(this.f14916i != null ? true : z10);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < lineCount; i10++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil(fMax);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8629a() {
        C7738a c7738a = this.f14911d;
        return (c7738a == null || c7738a.f42353o) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public final void m8630b() {
        int i10 = this.f14910L;
        boolean z10 = false;
        if (i10 == 1 || i10 == 2) {
            C1304k.b.m4840e(this, this.f14916i, null, null, null);
            return;
        }
        if (i10 == 3 || i10 == 4) {
            C1304k.b.m4840e(this, null, null, this.f14916i, null);
            return;
        }
        if (i10 == 16 || i10 == 32) {
            z10 = true;
        }
        if (z10) {
            C1304k.b.m4840e(this, null, this.f14916i, null, null);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m8631c(boolean z10) {
        Drawable drawable = this.f14916i;
        boolean z11 = true;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f14916i = drawableMutate;
            C8488a.b.m16570h(drawableMutate, this.f14915h);
            PorterDuff.Mode mode = this.f14914g;
            if (mode != null) {
                C8488a.b.m16571i(this.f14916i, mode);
            }
            int intrinsicWidth = this.f14918k;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f14916i.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f14918k;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f14916i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f14916i;
            int i10 = this.f14919l;
            int i11 = this.f14906H;
            drawable2.setBounds(i10, i11, intrinsicWidth + i10, intrinsicHeight + i11);
            this.f14916i.setVisible(true, z10);
        }
        if (z10) {
            m8630b();
            return;
        }
        Drawable[] drawableArrM4836a = C1304k.b.m4836a(this);
        Drawable drawable3 = drawableArrM4836a[0];
        Drawable drawable4 = drawableArrM4836a[1];
        Drawable drawable5 = drawableArrM4836a[2];
        int i12 = this.f14910L;
        if (!(i12 == 1 || i12 == 2) || drawable3 == this.f14916i) {
            if (!(i12 == 3 || i12 == 4) || drawable5 == this.f14916i) {
                if (!(i12 == 16 || i12 == 32) || drawable4 == this.f14916i) {
                    z11 = false;
                }
            }
        }
        if (z11) {
            m8630b();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m8632d(int i10, int i11) {
        if (this.f14916i == null || getLayout() == null) {
            return;
        }
        int i12 = this.f14910L;
        boolean z10 = true;
        if (!(i12 == 1 || i12 == 2)) {
            if (!(i12 == 3 || i12 == 4)) {
                if (i12 != 16 && i12 != 32) {
                    z10 = false;
                }
                if (z10) {
                    this.f14919l = 0;
                    if (i12 == 16) {
                        this.f14906H = 0;
                        m8631c(false);
                        return;
                    }
                    int intrinsicHeight = this.f14918k;
                    if (intrinsicHeight == 0) {
                        intrinsicHeight = this.f14916i.getIntrinsicHeight();
                    }
                    int iMax = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f14907I) - getPaddingBottom()) / 2);
                    if (this.f14906H != iMax) {
                        this.f14906H = iMax;
                        m8631c(false);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        this.f14906H = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i13 = this.f14910L;
        if (i13 != 1 && i13 != 3 && (i13 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL)) {
            if (i13 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE) {
                int intrinsicWidth = this.f14918k;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.f14916i.getIntrinsicWidth();
                }
                int textLayoutWidth = i10 - getTextLayoutWidth();
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                int iM18687e = (((textLayoutWidth - C10029b0.e.m18687e(this)) - intrinsicWidth) - this.f14907I) - C10029b0.e.m18688f(this);
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    iM18687e /= 2;
                }
                boolean z11 = C10029b0.e.m18686d(this) == 1;
                if (this.f14910L != 4) {
                    z10 = false;
                }
                if (z11 != z10) {
                    iM18687e = -iM18687e;
                }
                if (this.f14919l != iM18687e) {
                    this.f14919l = iM18687e;
                    m8631c(false);
                    return;
                }
                return;
            }
        }
        this.f14919l = 0;
        m8631c(false);
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.f14917j)) {
            return this.f14917j;
        }
        C7738a c7738a = this.f14911d;
        return (c7738a != null && c7738a.f42355q ? CompoundButton.class : Button.class).getName();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m8629a()) {
            return this.f14911d.f42345g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f14916i;
    }

    public int getIconGravity() {
        return this.f14910L;
    }

    public int getIconPadding() {
        return this.f14907I;
    }

    public int getIconSize() {
        return this.f14918k;
    }

    public ColorStateList getIconTint() {
        return this.f14915h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f14914g;
    }

    public int getInsetBottom() {
        return this.f14911d.f42344f;
    }

    public int getInsetTop() {
        return this.f14911d.f42343e;
    }

    public ColorStateList getRippleColor() {
        if (m8629a()) {
            return this.f14911d.f42350l;
        }
        return null;
    }

    public C5772k getShapeAppearanceModel() {
        if (m8629a()) {
            return this.f14911d.f42340b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m8629a()) {
            return this.f14911d.f42349k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m8629a()) {
            return this.f14911d.f42346h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.C0307e
    public ColorStateList getSupportBackgroundTintList() {
        return m8629a() ? this.f14911d.f42348j : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.C0307e
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m8629a() ? this.f14911d.f42347i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f14908J;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m8629a()) {
            C0062b.m338c2(this, this.f14911d.m15328b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        C7738a c7738a = this.f14911d;
        if (c7738a != null && c7738a.f42355q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f14904M);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f14905N);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.C0307e, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.C0307e, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        C7738a c7738a = this.f14911d;
        accessibilityNodeInfo.setCheckable(c7738a != null && c7738a.f42355q);
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.C0307e, android.widget.TextView, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        m8632d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f5635a);
        setChecked(savedState.f14920c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f14920c = this.f14908J;
        return savedState;
    }

    @Override // androidx.appcompat.widget.C0307e, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        m8632d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f14911d.f42356r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f14916i != null) {
            if (this.f14916i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f14917j = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (!m8629a()) {
            super.setBackgroundColor(i10);
            return;
        }
        C7738a c7738a = this.f14911d;
        if (c7738a.m15328b(false) != null) {
            c7738a.m15328b(false).setTint(i10);
        }
    }

    @Override // androidx.appcompat.widget.C0307e, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m8629a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        C7738a c7738a = this.f14911d;
        c7738a.f42353o = true;
        ColorStateList colorStateList = c7738a.f42348j;
        MaterialButton materialButton = c7738a.f42339a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(c7738a.f42347i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.C0307e, android.view.View
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? C5452a.m11672a(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (m8629a()) {
            this.f14911d.f42355q = z10;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        C7738a c7738a = this.f14911d;
        if ((c7738a != null && c7738a.f42355q) && isEnabled() && this.f14908J != z10) {
            this.f14908J = z10;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z11 = this.f14908J;
                if (!materialButtonToggleGroup.f14927f) {
                    materialButtonToggleGroup.m8635b(getId(), z11);
                }
            }
            if (this.f14909K) {
                return;
            }
            this.f14909K = true;
            Iterator<InterfaceC2968a> it = this.f14912e.iterator();
            while (it.hasNext()) {
                it.next().m8633a();
            }
            this.f14909K = false;
        }
    }

    public void setCornerRadius(int i10) {
        if (m8629a()) {
            C7738a c7738a = this.f14911d;
            if (c7738a.f42354p && c7738a.f42345g == i10) {
                return;
            }
            c7738a.f42345g = i10;
            c7738a.f42354p = true;
            c7738a.m15329c(c7738a.f42340b.m12153e(i10));
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (m8629a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        if (m8629a()) {
            this.f14911d.m15328b(false).m12140l(f3);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f14916i != drawable) {
            this.f14916i = drawable;
            m8631c(true);
            m8632d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f14910L != i10) {
            this.f14910L = i10;
            m8632d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f14907I != i10) {
            this.f14907I = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? C5452a.m11672a(getContext(), i10) : null);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f14918k != i10) {
            this.f14918k = i10;
            m8631c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f14915h != colorStateList) {
            this.f14915h = colorStateList;
            m8631c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f14914g != mode) {
            this.f14914g = mode;
            m8631c(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(C7472a.m14842b(i10, getContext()));
    }

    public void setInsetBottom(int i10) {
        C7738a c7738a = this.f14911d;
        c7738a.m15330d(c7738a.f42343e, i10);
    }

    public void setInsetTop(int i10) {
        C7738a c7738a = this.f14911d;
        c7738a.m15330d(i10, c7738a.f42344f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC2969b interfaceC2969b) {
        this.f14913f = interfaceC2969b;
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        InterfaceC2969b interfaceC2969b = this.f14913f;
        if (interfaceC2969b != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z10);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m8629a()) {
            C7738a c7738a = this.f14911d;
            if (c7738a.f42350l != colorStateList) {
                c7738a.f42350l = colorStateList;
                MaterialButton materialButton = c7738a.f42339a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(C5397a.m11561c(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i10) {
        if (m8629a()) {
            setRippleColor(C7472a.m14842b(i10, getContext()));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // gd.InterfaceC5776o
    public void setShapeAppearanceModel(C5772k c5772k) {
        if (!m8629a()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f14911d.m15329c(c5772k);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (m8629a()) {
            C7738a c7738a = this.f14911d;
            c7738a.f42352n = z10;
            c7738a.m15332f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m8629a()) {
            C7738a c7738a = this.f14911d;
            if (c7738a.f42349k != colorStateList) {
                c7738a.f42349k = colorStateList;
                c7738a.m15332f();
            }
        }
    }

    public void setStrokeColorResource(int i10) {
        if (m8629a()) {
            setStrokeColor(C7472a.m14842b(i10, getContext()));
        }
    }

    public void setStrokeWidth(int i10) {
        if (m8629a()) {
            C7738a c7738a = this.f14911d;
            if (c7738a.f42346h != i10) {
                c7738a.f42346h = i10;
                c7738a.m15332f();
            }
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (m8629a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // androidx.appcompat.widget.C0307e
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m8629a()) {
            C7738a c7738a = this.f14911d;
            if (c7738a.f42348j != colorStateList) {
                c7738a.f42348j = colorStateList;
                if (c7738a.m15328b(false) != null) {
                    C8488a.b.m16570h(c7738a.m15328b(false), c7738a.f42348j);
                }
            }
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.C0307e
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m8629a()) {
            C7738a c7738a = this.f14911d;
            if (c7738a.f42347i != mode) {
                c7738a.f42347i = mode;
                if (c7738a.m15328b(false) != null && c7738a.f42347i != null) {
                    C8488a.b.m16571i(c7738a.m15328b(false), c7738a.f42347i);
                }
            }
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        m8632d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.f14911d.f42356r = z10;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f14908J);
    }
}
