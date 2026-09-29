package com.google.android.material.checkbox;

import ae.C0062b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.C0300b1;
import com.linguist.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import md.C7542a;
import p003a2.C0009a;
import p024b3.C1296c;
import p024b3.C1297d;
import p072dd.C5149b;
import p072dd.C5150c;
import p104f.C5452a;
import p153hc.C6031a;
import p286o2.C7906f;
import p329q2.C8488a;
import p428v4.AbstractC9640c;
import p428v4.C9639b;
import p428v4.C9641d;
import p428v4.C9642e;
import p507yc.C10344k;
import p507yc.C10347n;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialCheckBox extends AppCompatCheckBox {

    /* JADX INFO: renamed from: T */
    public static final int[] f14984T = {R.attr.state_indeterminate};

    /* JADX INFO: renamed from: U */
    public static final int[] f14985U = {R.attr.state_error};

    /* JADX INFO: renamed from: V */
    public static final int[][] f14986V = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: W */
    @SuppressLint({"DiscouragedApi"})
    public static final int f14987W = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* JADX INFO: renamed from: H */
    public Drawable f14988H;

    /* JADX INFO: renamed from: I */
    public boolean f14989I;

    /* JADX INFO: renamed from: J */
    public ColorStateList f14990J;

    /* JADX INFO: renamed from: K */
    public ColorStateList f14991K;

    /* JADX INFO: renamed from: L */
    public PorterDuff.Mode f14992L;

    /* JADX INFO: renamed from: M */
    public int f14993M;

    /* JADX INFO: renamed from: N */
    public int[] f14994N;

    /* JADX INFO: renamed from: O */
    public boolean f14995O;

    /* JADX INFO: renamed from: P */
    public CharSequence f14996P;

    /* JADX INFO: renamed from: Q */
    public CompoundButton.OnCheckedChangeListener f14997Q;

    /* JADX INFO: renamed from: R */
    public final C9641d f14998R;

    /* JADX INFO: renamed from: S */
    public final C2983a f14999S;

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet<InterfaceC2985c> f15000e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashSet<InterfaceC2984b> f15001f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f15002g;

    /* JADX INFO: renamed from: h */
    public boolean f15003h;

    /* JADX INFO: renamed from: i */
    public boolean f15004i;

    /* JADX INFO: renamed from: j */
    public boolean f15005j;

    /* JADX INFO: renamed from: k */
    public CharSequence f15006k;

    /* JADX INFO: renamed from: l */
    public Drawable f15007l;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2982a();

        /* JADX INFO: renamed from: a */
        public int f15008a;

        /* JADX INFO: renamed from: com.google.android.material.checkbox.MaterialCheckBox$SavedState$a */
        public class C2982a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f15008a = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder("MaterialCheckBox.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" CheckedState=");
            int i10 = this.f15008a;
            if (i10 != 1) {
                str = i10 != 2 ? "unchecked" : "indeterminate";
            } else {
                str = "checked";
            }
            return C0009a.m23l(sb2, str, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Integer.valueOf(this.f15008a));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.checkbox.MaterialCheckBox$a */
    public class C2983a extends AbstractC9640c {
        public C2983a() {
        }

        @Override // p428v4.AbstractC9640c
        /* JADX INFO: renamed from: a */
        public final void mo4937a(Drawable drawable) {
            ColorStateList colorStateList = MaterialCheckBox.this.f14990J;
            if (colorStateList != null) {
                C8488a.b.m16570h(drawable, colorStateList);
            }
        }

        @Override // p428v4.AbstractC9640c
        /* JADX INFO: renamed from: b */
        public final void mo8668b(Drawable drawable) {
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.f14990J;
            if (colorStateList != null) {
                C8488a.b.m16569g(drawable, colorStateList.getColorForState(materialCheckBox.f14994N, colorStateList.getDefaultColor()));
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.checkbox.MaterialCheckBox$b */
    public interface InterfaceC2984b {
        /* JADX INFO: renamed from: a */
        void m8669a();
    }

    /* JADX INFO: renamed from: com.google.android.material.checkbox.MaterialCheckBox$c */
    public interface InterfaceC2985c {
        /* JADX INFO: renamed from: a */
        void m8670a();
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        super(C7542a.m15048a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f15000e = new LinkedHashSet<>();
        this.f15001f = new LinkedHashSet<>();
        Context context2 = getContext();
        C9641d c9641d = new C9641d(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal<TypedValue> threadLocal = C7906f.f43056a;
        Drawable drawableM15676a = C7906f.a.m15676a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        c9641d.f49354a = drawableM15676a;
        drawableM15676a.setCallback(c9641d.f49346f);
        new C9641d.c(c9641d.f49354a.getConstantState());
        this.f14998R = c9641d;
        this.f14999S = new C2983a();
        Context context3 = getContext();
        this.f15007l = C1297d.m4808a(this);
        this.f14990J = getSuperButtonTintList();
        setSupportButtonTintList(null);
        C0300b1 c0300b1M19358e = C10344k.m19358e(context3, attributeSet, C6031a.f35673w, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        this.f14988H = c0300b1M19358e.m1116e(2);
        if (this.f15007l != null && C5149b.m10923b(context3, R.attr.isMaterial3Theme, false)) {
            if (c0300b1M19358e.m1120i(0, 0) == f14987W && c0300b1M19358e.m1120i(1, 0) == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f15007l = C5452a.m11672a(context3, R.drawable.mtrl_checkbox_button);
                this.f14989I = true;
                if (this.f14988H == null) {
                    this.f14988H = C5452a.m11672a(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f14991K = C5150c.m10926b(context3, c0300b1M19358e, 3);
        this.f14992L = C10347n.m19366f(c0300b1M19358e.m1119h(4, -1), PorterDuff.Mode.SRC_IN);
        this.f15003h = c0300b1M19358e.m1112a(10, false);
        this.f15004i = c0300b1M19358e.m1112a(6, true);
        this.f15005j = c0300b1M19358e.m1112a(9, false);
        this.f15006k = c0300b1M19358e.m1122k(8);
        if (c0300b1M19358e.m1123l(7)) {
            setCheckedState(c0300b1M19358e.m1119h(7, 0));
        }
        c0300b1M19358e.m1124n();
        m8667b();
    }

    private String getButtonStateDescription() {
        int i10 = this.f14993M;
        if (i10 == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        return i10 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f15002g == null) {
            int iM340d1 = C0062b.m340d1(this, R.attr.colorControlActivated);
            int iM340d2 = C0062b.m340d1(this, R.attr.colorError);
            int iM340d3 = C0062b.m340d1(this, R.attr.colorSurface);
            int iM340d4 = C0062b.m340d1(this, R.attr.colorOnSurface);
            this.f15002g = new ColorStateList(f14986V, new int[]{C0062b.m250B1(1.0f, iM340d3, iM340d2), C0062b.m250B1(1.0f, iM340d3, iM340d1), C0062b.m250B1(0.54f, iM340d3, iM340d4), C0062b.m250B1(0.38f, iM340d3, iM340d4), C0062b.m250B1(0.38f, iM340d3, iM340d4)});
        }
        return this.f15002g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f14990J;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    /* JADX INFO: renamed from: b */
    public final void m8667b() {
        int intrinsicHeight;
        int intrinsicWidth;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C9642e c9642e;
        Drawable drawableMutate = this.f15007l;
        ColorStateList colorStateList3 = this.f14990J;
        PorterDuff.Mode modeM4805b = C1296c.m4805b(this);
        if (drawableMutate == null) {
            drawableMutate = null;
        } else if (colorStateList3 != null) {
            drawableMutate = drawableMutate.mutate();
            if (modeM4805b != null) {
                C8488a.b.m16571i(drawableMutate, modeM4805b);
            }
        }
        this.f15007l = drawableMutate;
        Drawable drawableMutate2 = this.f14988H;
        ColorStateList colorStateList4 = this.f14991K;
        PorterDuff.Mode mode = this.f14992L;
        if (drawableMutate2 == null) {
            drawableMutate2 = null;
        } else if (colorStateList4 != null) {
            drawableMutate2 = drawableMutate2.mutate();
            if (mode != null) {
                C8488a.b.m16571i(drawableMutate2, mode);
            }
        }
        this.f14988H = drawableMutate2;
        if (this.f14989I) {
            C9641d c9641d = this.f14998R;
            if (c9641d != null) {
                Drawable drawable = c9641d.f49354a;
                C2983a c2983a = this.f14999S;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (c2983a.f49341a == null) {
                        c2983a.f49341a = new C9639b(c2983a);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c2983a.f49341a);
                }
                ArrayList<AbstractC9640c> arrayList = c9641d.f49345e;
                C9641d.b bVar = c9641d.f49342b;
                if (arrayList != null && c2983a != null) {
                    arrayList.remove(c2983a);
                    if (c9641d.f49345e.size() == 0 && (c9642e = c9641d.f49344d) != null) {
                        bVar.f49349b.removeListener(c9642e);
                        c9641d.f49344d = null;
                    }
                }
                Drawable drawable2 = c9641d.f49354a;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (c2983a.f49341a == null) {
                        c2983a.f49341a = new C9639b(c2983a);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c2983a.f49341a);
                } else if (c2983a != null) {
                    if (c9641d.f49345e == null) {
                        c9641d.f49345e = new ArrayList<>();
                    }
                    if (!c9641d.f49345e.contains(c2983a)) {
                        c9641d.f49345e.add(c2983a);
                        if (c9641d.f49344d == null) {
                            c9641d.f49344d = new C9642e(c9641d);
                        }
                        bVar.f49349b.addListener(c9641d.f49344d);
                    }
                }
            }
            Drawable drawable3 = this.f15007l;
            if ((drawable3 instanceof AnimatedStateListDrawable) && c9641d != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, c9641d, false);
                ((AnimatedStateListDrawable) this.f15007l).addTransition(R.id.indeterminate, R.id.unchecked, c9641d, false);
            }
        }
        Drawable drawable4 = this.f15007l;
        if (drawable4 != null && (colorStateList2 = this.f14990J) != null) {
            C8488a.b.m16570h(drawable4, colorStateList2);
        }
        Drawable drawable5 = this.f14988H;
        if (drawable5 != null && (colorStateList = this.f14991K) != null) {
            C8488a.b.m16570h(drawable5, colorStateList);
        }
        Drawable drawable6 = this.f15007l;
        Drawable drawable7 = this.f14988H;
        if (drawable6 == null) {
            drawable6 = drawable7;
        } else if (drawable7 != null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable6, drawable7});
            if (drawable7.getIntrinsicWidth() == -1 || drawable7.getIntrinsicHeight() == -1) {
                int intrinsicWidth2 = drawable6.getIntrinsicWidth();
                intrinsicHeight = drawable6.getIntrinsicHeight();
                intrinsicWidth = intrinsicWidth2;
            } else if (drawable7.getIntrinsicWidth() > drawable6.getIntrinsicWidth() || drawable7.getIntrinsicHeight() > drawable6.getIntrinsicHeight()) {
                float intrinsicWidth3 = drawable7.getIntrinsicWidth() / drawable7.getIntrinsicHeight();
                if (intrinsicWidth3 >= drawable6.getIntrinsicWidth() / drawable6.getIntrinsicHeight()) {
                    intrinsicWidth = drawable6.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth / intrinsicWidth3);
                } else {
                    intrinsicHeight = drawable6.getIntrinsicHeight();
                    intrinsicWidth = (int) (intrinsicWidth3 * intrinsicHeight);
                }
            } else {
                intrinsicWidth = drawable7.getIntrinsicWidth();
                intrinsicHeight = drawable7.getIntrinsicHeight();
            }
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable6 = layerDrawable;
        }
        super.setButtonDrawable(drawable6);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f15007l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f14988H;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f14991K;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f14992L;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f14990J;
    }

    public int getCheckedState() {
        return this.f14993M;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f15006k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f14993M == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f15003h && this.f14990J == null && this.f14991K == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrCopyOf;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f14984T);
        }
        if (this.f15005j) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f14985U);
        }
        for (int i11 = 0; i11 < iArrOnCreateDrawableState.length; i11++) {
            int i12 = iArrOnCreateDrawableState[i11];
            if (i12 == 16842912) {
                iArrCopyOf = iArrOnCreateDrawableState;
            } else if (i12 == 0) {
                iArrCopyOf = (int[]) iArrOnCreateDrawableState.clone();
                iArrCopyOf[i11] = 16842912;
            }
            this.f14994N = iArrCopyOf;
            return iArrOnCreateDrawableState;
        }
        iArrCopyOf = Arrays.copyOf(iArrOnCreateDrawableState, iArrOnCreateDrawableState.length + 1);
        iArrCopyOf[iArrOnCreateDrawableState.length] = 16842912;
        this.f14994N = iArrCopyOf;
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawableM4808a;
        if (!this.f15004i || !TextUtils.isEmpty(getText()) || (drawableM4808a = C1297d.m4808a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableM4808a.getIntrinsicWidth()) / 2) * (C10347n.m19365e(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableM4808a.getBounds();
            C8488a.b.m16568f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f15005j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f15006k));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.f15008a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f15008a = getCheckedState();
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(C5452a.m11672a(getContext(), i10));
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f15007l = drawable;
        this.f14989I = false;
        m8667b();
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f14988H = drawable;
        m8667b();
    }

    public void setButtonIconDrawableResource(int i10) {
        setButtonIconDrawable(C5452a.m11672a(getContext(), i10));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f14991K == colorStateList) {
            return;
        }
        this.f14991K = colorStateList;
        m8667b();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f14992L == mode) {
            return;
        }
        this.f14992L = mode;
        m8667b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f14990J == colorStateList) {
            return;
        }
        this.f14990J = colorStateList;
        m8667b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        m8667b();
    }

    public void setCenterIfNoTextEnabled(boolean z10) {
        this.f15004i = z10;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedState(z10 ? 1 : 0);
    }

    public void setCheckedState(int i10) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f14993M != i10) {
            this.f14993M = i10;
            super.setChecked(i10 == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f14996P == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f14995O) {
                return;
            }
            this.f14995O = true;
            LinkedHashSet<InterfaceC2984b> linkedHashSet = this.f15001f;
            if (linkedHashSet != null) {
                Iterator<InterfaceC2984b> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().m8669a();
                }
            }
            if (this.f14993M != 2 && (onCheckedChangeListener = this.f14997Q) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f14995O = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f15006k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i10) {
        setErrorAccessibilityLabel(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setErrorShown(boolean z10) {
        if (this.f15005j == z10) {
            return;
        }
        this.f15005j = z10;
        refreshDrawableState();
        Iterator<InterfaceC2985c> it = this.f15000e.iterator();
        while (it.hasNext()) {
            it.next().m8670a();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f14997Q = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f14996P = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f15003h = z10;
        if (z10) {
            C1296c.m4806c(this, getMaterialThemeColorsTintList());
        } else {
            C1296c.m4806c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }
}
