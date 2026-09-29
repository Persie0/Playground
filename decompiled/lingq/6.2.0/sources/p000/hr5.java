package p000;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$style;
import com.google.android.material.R$dimen;
import com.google.android.material.R$layout;
import com.google.android.material.R$styleable;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class hr5 extends C2972ep {

    /* JADX INFO: renamed from: H */
    public ColorStateList f42829H;

    /* JADX INFO: renamed from: e */
    public final dg5 f42830e;

    /* JADX INFO: renamed from: f */
    public final AccessibilityManager f42831f;

    /* JADX INFO: renamed from: g */
    public final int[] f42832g;

    /* JADX INFO: renamed from: h */
    public final Rect f42833h;

    /* JADX INFO: renamed from: i */
    public final int f42834i;

    /* JADX INFO: renamed from: j */
    public final float f42835j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f42836k;

    /* JADX INFO: renamed from: l */
    public int f42837l;

    /* JADX WARN: Illegal instructions before constructor call */
    public hr5(Context context, AttributeSet attributeSet) {
        int i = R$attr.autoCompleteTextViewStyle;
        super(qs5.m20141b(context, attributeSet, i, 0), attributeSet, i);
        this.f42832g = new int[]{R.attr.state_selected};
        this.f42833h = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM10751d = dy9.m10751d(context2, attributeSet, R$styleable.MaterialAutoCompleteTextView, i, R$style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayM10751d.hasValue(R$styleable.MaterialAutoCompleteTextView_android_inputType) && typedArrayM10751d.getInt(R$styleable.MaterialAutoCompleteTextView_android_inputType, 0) == 0) {
            setKeyListener(null);
        }
        this.f42834i = typedArrayM10751d.getResourceId(R$styleable.MaterialAutoCompleteTextView_simpleItemLayout, R$layout.mtrl_auto_complete_simple_item);
        this.f42835j = typedArrayM10751d.getDimensionPixelOffset(R$styleable.MaterialAutoCompleteTextView_android_popupElevation, R$dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayM10751d.hasValue(R$styleable.MaterialAutoCompleteTextView_dropDownBackgroundTint)) {
            this.f42836k = ColorStateList.valueOf(typedArrayM10751d.getColor(R$styleable.MaterialAutoCompleteTextView_dropDownBackgroundTint, 0));
        }
        this.f42837l = typedArrayM10751d.getColor(R$styleable.MaterialAutoCompleteTextView_simpleItemSelectedColor, 0);
        this.f42829H = pb1.m19054x(context2, typedArrayM10751d, R$styleable.MaterialAutoCompleteTextView_simpleItemSelectedRippleColor);
        this.f42831f = (AccessibilityManager) context2.getSystemService("accessibility");
        dg5 dg5Var = new dg5(context2, null, R$attr.listPopupWindowStyle, 0);
        this.f42830e = dg5Var;
        dg5Var.f35606T = true;
        C3120iq c3120iq = dg5Var.f35607U;
        c3120iq.setFocusable(true);
        dg5Var.f35596J = this;
        c3120iq.setInputMethodMode(2);
        dg5Var.mo10366p(getAdapter());
        dg5Var.f35597K = new C3657uq(this, 1);
        if (typedArrayM10751d.hasValue(R$styleable.MaterialAutoCompleteTextView_simpleItems)) {
            setSimpleItems(typedArrayM10751d.getResourceId(R$styleable.MaterialAutoCompleteTextView_simpleItems, 0));
        }
        typedArrayM10751d.recycle();
    }

    /* JADX INFO: renamed from: b */
    public final TextInputLayout m13439b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m13440c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f42831f;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (m13440c()) {
            this.f42830e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f42836k;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutM13439b = m13439b();
        return (textInputLayoutM13439b == null || !textInputLayoutM13439b.f13285d0) ? super.getHint() : textInputLayoutM13439b.getHint();
    }

    public float getPopupElevation() {
        return this.f42835j;
    }

    public int getSimpleItemSelectedColor() {
        return this.f42837l;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f42829H;
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean isPopupShowing() {
        dg5 dg5Var = this.f42830e;
        if (dg5Var == null || !dg5Var.f35607U.isShowing()) {
            return super.isPopupShowing();
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutM13439b = m13439b();
        if (textInputLayoutM13439b != null && textInputLayoutM13439b.f13285d0 && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f42830e.dismiss();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isPopupShowing()) {
            return super.onKeyDown(i, keyEvent);
        }
        boolean z = i == 66 || i == 23;
        boolean z2 = i == 62;
        if (getKeyListener() == null ? !(z || z2) : !(z && getMaxLines() == 1)) {
            return super.onKeyDown(i, keyEvent);
        }
        TextInputLayout textInputLayoutM13439b = m13439b();
        if (textInputLayoutM13439b != null) {
            textInputLayoutM13439b.getEndIconView().performClick();
        }
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutM13439b = m13439b();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutM13439b != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                dg5 dg5Var = this.f42830e;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !dg5Var.f35607U.isShowing() ? -1 : dg5Var.f35610c.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutM13439b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = dg5Var.f35607U.getBackground();
                if (background != null) {
                    Rect rect = this.f42833h;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutM13439b.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (m13440c()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f42830e.mo10366p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        dg5 dg5Var = this.f42830e;
        if (dg5Var != null) {
            dg5Var.m10362i(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f42836k = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof fs5) {
            ((fs5) dropDownBackground).m12076t(this.f42836k);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f42830e.f35598L = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout textInputLayoutM13439b = m13439b();
        if (textInputLayoutM13439b != null) {
            textInputLayoutM13439b.m6237u();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f42837l = i;
        if (getAdapter() instanceof gr5) {
            ((gr5) getAdapter()).m12850a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f42829H = colorStateList;
        if (getAdapter() instanceof gr5) {
            ((gr5) getAdapter()).m12850a();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new gr5(this, getContext(), this.f42834i, strArr));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (m13440c()) {
            this.f42830e.mo10360f();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }
}
