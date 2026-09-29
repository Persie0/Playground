package com.google.android.material.checkbox;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.google.android.material.R$attr;
import com.google.android.material.R$drawable;
import com.google.android.material.R$id;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000.AbstractC3122is;
import p000.AbstractC3393o1;
import p000.C3083hp;
import p000.C3340mm;
import p000.C3377nm;
import p000.C3418om;
import p000.C3465pm;
import p000.C3652ul;
import p000.bna;
import p000.dy9;
import p000.f88;
import p000.gka;
import p000.omd;
import p000.pb1;
import p000.qs5;
import p000.sq5;
import p000.wq1;
import p000.xwc;
import p000.zr5;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialCheckBox extends C3083hp {

    /* JADX INFO: renamed from: T */
    public static final int f12826T = R$style.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* JADX INFO: renamed from: U */
    public static final int[] f12827U = {R$attr.state_indeterminate};

    /* JADX INFO: renamed from: V */
    public static final int[] f12828V;

    /* JADX INFO: renamed from: W */
    public static final int[][] f12829W;

    /* JADX INFO: renamed from: a0 */
    public static final int f12830a0;

    /* JADX INFO: renamed from: H */
    public Drawable f12831H;

    /* JADX INFO: renamed from: I */
    public boolean f12832I;

    /* JADX INFO: renamed from: J */
    public ColorStateList f12833J;

    /* JADX INFO: renamed from: K */
    public ColorStateList f12834K;

    /* JADX INFO: renamed from: L */
    public PorterDuff.Mode f12835L;

    /* JADX INFO: renamed from: M */
    public int f12836M;

    /* JADX INFO: renamed from: N */
    public int[] f12837N;

    /* JADX INFO: renamed from: O */
    public boolean f12838O;

    /* JADX INFO: renamed from: P */
    public CharSequence f12839P;

    /* JADX INFO: renamed from: Q */
    public CompoundButton.OnCheckedChangeListener f12840Q;

    /* JADX INFO: renamed from: R */
    public final C3465pm f12841R;

    /* JADX INFO: renamed from: S */
    public final zr5 f12842S;

    /* JADX INFO: renamed from: e */
    public final LinkedHashSet f12843e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashSet f12844f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f12845g;

    /* JADX INFO: renamed from: h */
    public boolean f12846h;

    /* JADX INFO: renamed from: i */
    public boolean f12847i;

    /* JADX INFO: renamed from: j */
    public boolean f12848j;

    /* JADX INFO: renamed from: k */
    public CharSequence f12849k;

    /* JADX INFO: renamed from: l */
    public Drawable f12850l;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1052a();

        /* JADX INFO: renamed from: a */
        public int f12851a;

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" CheckedState=");
            int i = this.f12851a;
            if (i != 1) {
                str = i != 2 ? "unchecked" : "indeterminate";
            } else {
                str = "checked";
            }
            return AbstractC3393o1.m17738m(sb, str, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Integer.valueOf(this.f12851a));
        }
    }

    static {
        int i = R$attr.state_error;
        f12828V = new int[]{i};
        f12829W = new int[][]{new int[]{R.attr.state_enabled, i}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        f12830a0 = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i) {
        int i2 = f12826T;
        super(qs5.m20141b(context, attributeSet, i, i2), attributeSet, i);
        this.f12843e = new LinkedHashSet();
        this.f12844f = new LinkedHashSet();
        Context context2 = getContext();
        int i3 = R$drawable.mtrl_checkbox_button_checked_unchecked;
        C3465pm c3465pm = new C3465pm(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = f88.f38630a;
        Drawable drawable = resources.getDrawable(i3, theme);
        c3465pm.f41098a = drawable;
        drawable.setCallback(c3465pm.f56438f);
        new C3418om(c3465pm.f41098a.getConstantState());
        this.f12841R = c3465pm;
        this.f12842S = new zr5(this);
        Context context3 = getContext();
        this.f12850l = getButtonDrawable();
        this.f12833J = getSuperButtonTintList();
        setSupportButtonTintList(null);
        sq5 sq5VarM10752e = dy9.m10752e(context3, attributeSet, R$styleable.MaterialCheckBox, i, i2, new int[0]);
        TypedArray typedArray = (TypedArray) sq5VarM10752e.f61249c;
        this.f12831H = sq5VarM10752e.m21568j(R$styleable.MaterialCheckBox_buttonIcon);
        if (this.f12850l != null) {
            if (xwc.m24749V(context3.getTheme(), R$attr.isMaterial3Theme, false)) {
                int resourceId = typedArray.getResourceId(R$styleable.MaterialCheckBox_android_button, 0);
                int resourceId2 = typedArray.getResourceId(R$styleable.MaterialCheckBox_buttonCompat, 0);
                if (resourceId == f12830a0 && resourceId2 == 0) {
                    super.setButtonDrawable((Drawable) null);
                    this.f12850l = bna.m3932U(context3, R$drawable.mtrl_checkbox_button);
                    this.f12832I = true;
                    if (this.f12831H == null) {
                        this.f12831H = bna.m3932U(context3, R$drawable.mtrl_checkbox_button_icon);
                    }
                }
            }
        }
        this.f12834K = pb1.m19053w(context3, sq5VarM10752e, R$styleable.MaterialCheckBox_buttonIconTint);
        this.f12835L = gka.m12724c(typedArray.getInt(R$styleable.MaterialCheckBox_buttonIconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f12846h = typedArray.getBoolean(R$styleable.MaterialCheckBox_useMaterialThemeColors, false);
        this.f12847i = typedArray.getBoolean(R$styleable.MaterialCheckBox_centerIfNoTextEnabled, true);
        this.f12848j = typedArray.getBoolean(R$styleable.MaterialCheckBox_errorShown, false);
        this.f12849k = typedArray.getText(R$styleable.MaterialCheckBox_errorAccessibilityLabel);
        if (typedArray.hasValue(R$styleable.MaterialCheckBox_checkedState)) {
            setCheckedState(typedArray.getInt(R$styleable.MaterialCheckBox_checkedState, 0));
        }
        if (typedArray.hasValue(R$styleable.MaterialCheckBox_rippleColor)) {
            setRippleColor(pb1.m19053w(context3, sq5VarM10752e, R$styleable.MaterialCheckBox_rippleColor));
        }
        sq5VarM10752e.m21582y();
        m6098a();
    }

    private String getButtonStateDescription() {
        int i = this.f12836M;
        if (i == 1) {
            return getResources().getString(R$string.mtrl_checkbox_state_description_checked);
        }
        return i == 0 ? getResources().getString(R$string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R$string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f12845g == null) {
            int iM18142c0 = omd.m18142c0(getContext(), xwc.m24752Y(this, androidx.appcompat.R$attr.colorControlActivated));
            int iM18142c1 = omd.m18142c0(getContext(), xwc.m24752Y(this, androidx.appcompat.R$attr.colorError));
            int iM18142c2 = omd.m18142c0(getContext(), xwc.m24752Y(this, R$attr.colorSurface));
            int iM18142c3 = omd.m18142c0(getContext(), xwc.m24752Y(this, R$attr.colorOnSurface));
            this.f12845g = new ColorStateList(f12829W, new int[]{omd.m18130T(iM18142c2, 1.0f, iM18142c1), omd.m18130T(iM18142c2, 1.0f, iM18142c0), omd.m18130T(iM18142c2, 0.54f, iM18142c3), omd.m18130T(iM18142c2, 0.38f, iM18142c3), omd.m18130T(iM18142c2, 0.38f, iM18142c3)});
        }
        return this.f12845g;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f12833J;
        if (colorStateList != null) {
            return colorStateList;
        }
        return super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private void setRippleColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        if (background instanceof RippleDrawable) {
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m6098a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C3340mm c3340mm;
        this.f12850l = AbstractC3122is.m14100n(this.f12850l, this.f12833J, getButtonTintMode());
        this.f12831H = AbstractC3122is.m14100n(this.f12831H, this.f12834K, this.f12835L);
        if (this.f12832I) {
            int i = 0;
            C3465pm c3465pm = this.f12841R;
            if (c3465pm != null) {
                C3377nm c3377nm = c3465pm.f56434b;
                Drawable drawable = c3465pm.f41098a;
                zr5 zr5Var = this.f12842S;
                if (drawable != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable;
                    if (zr5Var.f65558a == null) {
                        zr5Var.f65558a = new C3652ul(zr5Var);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(zr5Var.f65558a);
                }
                ArrayList arrayList = c3465pm.f56437e;
                if (arrayList != null && zr5Var != null) {
                    arrayList.remove(zr5Var);
                    if (c3465pm.f56437e.size() == 0 && (c3340mm = c3465pm.f56436d) != null) {
                        c3377nm.f52940b.removeListener(c3340mm);
                        c3465pm.f56436d = null;
                    }
                }
                Drawable drawable2 = c3465pm.f41098a;
                if (drawable2 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable2;
                    if (zr5Var.f65558a == null) {
                        zr5Var.f65558a = new C3652ul(zr5Var);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(zr5Var.f65558a);
                } else if (zr5Var != null) {
                    if (c3465pm.f56437e == null) {
                        c3465pm.f56437e = new ArrayList();
                    }
                    if (!c3465pm.f56437e.contains(zr5Var)) {
                        c3465pm.f56437e.add(zr5Var);
                        if (c3465pm.f56436d == null) {
                            c3465pm.f56436d = new C3340mm(c3465pm, i);
                        }
                        c3377nm.f52940b.addListener(c3465pm.f56436d);
                    }
                }
            }
            Drawable drawable3 = this.f12850l;
            if ((drawable3 instanceof AnimatedStateListDrawable) && c3465pm != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R$id.checked, R$id.unchecked, c3465pm, false);
                ((AnimatedStateListDrawable) this.f12850l).addTransition(R$id.indeterminate, R$id.unchecked, c3465pm, false);
            }
        }
        Drawable drawable4 = this.f12850l;
        if (drawable4 != null && (colorStateList2 = this.f12833J) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.f12831H;
        if (drawable5 != null && (colorStateList = this.f12834K) != null) {
            drawable5.setTintList(colorStateList);
        }
        super.setButtonDrawable(AbstractC3122is.m14097k(this.f12850l, this.f12831H, -1, -1));
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f12850l;
    }

    public Drawable getButtonIconDrawable() {
        return this.f12831H;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f12834K;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f12835L;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f12833J;
    }

    public int getCheckedState() {
        return this.f12836M;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f12849k;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f12836M == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f12846h && this.f12833J == null && this.f12834K == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f12827U);
        }
        if (this.f12848j) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f12828V);
        }
        this.f12837N = AbstractC3122is.m14106t(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.f12847i || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (getLayoutDirection() == 1 ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f12848j) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f12849k));
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
        setCheckedState(savedState.f12851a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f12851a = getCheckedState();
        return savedState;
    }

    @Override // p000.C3083hp, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(bna.m3932U(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f12831H = drawable;
        m6098a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(bna.m3932U(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f12834K == colorStateList) {
            return;
        }
        this.f12834K = colorStateList;
        m6098a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f12835L == mode) {
            return;
        }
        this.f12835L = mode;
        m6098a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f12833J == colorStateList) {
            return;
        }
        this.f12833J = colorStateList;
        m6098a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        m6098a();
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.f12847i = z;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedState(z ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f12836M != i) {
            this.f12836M = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f12839P == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f12838O) {
                return;
            }
            this.f12838O = true;
            LinkedHashSet linkedHashSet = this.f12844f;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw wq1.m24110f(it);
                }
            }
            if (this.f12836M != 2 && (onCheckedChangeListener = this.f12840Q) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f12838O = false;
        }
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f12849k = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z) {
        if (this.f12848j == z) {
            return;
        }
        this.f12848j = z;
        refreshDrawableState();
        Iterator it = this.f12843e.iterator();
        if (it.hasNext()) {
            throw wq1.m24110f(it);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f12840Q = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f12839P = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f12846h = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // p000.C3083hp, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f12850l = drawable;
        this.f12832I = false;
        m6098a();
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R$attr.checkboxStyle);
    }

    public MaterialCheckBox(Context context) {
        this(context, null);
    }
}
