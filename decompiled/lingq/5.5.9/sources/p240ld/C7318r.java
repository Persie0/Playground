package p240ld;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.C0301c;
import androidx.appcompat.widget.C0327l0;
import androidx.appcompat.widget.C0332o;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Locale;
import java.util.WeakHashMap;
import md.C7542a;
import p072dd.C5150c;
import p153hc.C6031a;
import p312p2.C8169a;
import p329q2.C8488a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p507yc.C10344k;

/* JADX INFO: renamed from: ld.r */
/* JADX INFO: loaded from: classes.dex */
public final class C7318r extends C0301c {

    /* JADX INFO: renamed from: e */
    public final C0327l0 f40990e;

    /* JADX INFO: renamed from: f */
    public final AccessibilityManager f40991f;

    /* JADX INFO: renamed from: g */
    public final Rect f40992g;

    /* JADX INFO: renamed from: h */
    public final int f40993h;

    /* JADX INFO: renamed from: i */
    public final float f40994i;

    /* JADX INFO: renamed from: j */
    public int f40995j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f40996k;

    /* JADX INFO: renamed from: ld.r$a */
    public class a<T> extends ArrayAdapter<String> {

        /* JADX INFO: renamed from: a */
        public ColorStateList f40997a;

        /* JADX INFO: renamed from: b */
        public ColorStateList f40998b;

        public a(Context context, int i10, String[] strArr) {
            super(context, i10, strArr);
            m14732b();
        }

        /* JADX INFO: renamed from: b */
        public final void m14732b() {
            ColorStateList colorStateList;
            C7318r c7318r = C7318r.this;
            ColorStateList colorStateList2 = c7318r.f40996k;
            ColorStateList colorStateList3 = null;
            if (colorStateList2 != null) {
                int[] iArr = {R.attr.state_pressed};
                colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
            } else {
                colorStateList = null;
            }
            this.f40998b = colorStateList;
            if (c7318r.f40995j != 0) {
                if (c7318r.f40996k != null) {
                    int[] iArr2 = {R.attr.state_hovered, -16842919};
                    int[] iArr3 = {R.attr.state_selected, -16842919};
                    colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{C8169a.m16215g(c7318r.f40996k.getColorForState(iArr3, 0), c7318r.f40995j), C8169a.m16215g(c7318r.f40996k.getColorForState(iArr2, 0), c7318r.f40995j), c7318r.f40995j});
                }
            }
            this.f40997a = colorStateList3;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i10, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i10, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                C7318r c7318r = C7318r.this;
                Drawable rippleDrawable = null;
                if (c7318r.getText().toString().contentEquals(textView.getText())) {
                    if (c7318r.f40995j != 0) {
                        ColorDrawable colorDrawable = new ColorDrawable(c7318r.f40995j);
                        if (this.f40998b != null) {
                            C8488a.b.m16570h(colorDrawable, this.f40997a);
                            rippleDrawable = new RippleDrawable(this.f40998b, colorDrawable, null);
                        } else {
                            rippleDrawable = colorDrawable;
                        }
                    }
                }
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                C10029b0.d.m18680q(textView, rippleDrawable);
            }
            return view2;
        }
    }

    public C7318r(Context context, AttributeSet attributeSet) {
        super(C7542a.m15048a(context, attributeSet, com.linguist.R.attr.autoCompleteTextViewStyle, 0), attributeSet, 0);
        this.f40992g = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM19357d = C10344k.m19357d(context2, attributeSet, C6031a.f35667q, com.linguist.R.attr.autoCompleteTextViewStyle, com.linguist.R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayM19357d.hasValue(0) && typedArrayM19357d.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f40993h = typedArrayM19357d.getResourceId(2, com.linguist.R.layout.mtrl_auto_complete_simple_item);
        this.f40994i = typedArrayM19357d.getDimensionPixelOffset(1, com.linguist.R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        this.f40995j = typedArrayM19357d.getColor(3, 0);
        this.f40996k = C5150c.m10925a(context2, typedArrayM19357d, 4);
        this.f40991f = (AccessibilityManager) context2.getSystemService("accessibility");
        C0327l0 c0327l0 = new C0327l0(context2, null, com.linguist.R.attr.listPopupWindowStyle, 0);
        this.f40990e = c0327l0;
        c0327l0.f1275T = true;
        C0332o c0332o = c0327l0.f1276U;
        c0332o.setFocusable(true);
        c0327l0.f1265J = this;
        c0332o.setInputMethodMode(2);
        c0327l0.mo1009p(getAdapter());
        c0327l0.f1266K = new C7317q(this);
        if (typedArrayM19357d.hasValue(5)) {
            setSimpleItems(typedArrayM19357d.getResourceId(5, 0));
        }
        typedArrayM19357d.recycle();
    }

    /* JADX INFO: renamed from: a */
    public static void m14730a(C7318r c7318r, Object obj) {
        c7318r.setText(c7318r.convertSelectionToString(obj), false);
    }

    /* JADX INFO: renamed from: b */
    public final TextInputLayout m14731b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        AccessibilityManager accessibilityManager = this.f40991f;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.f40990e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutM14731b = m14731b();
        return (textInputLayoutM14731b == null || !textInputLayoutM14731b.f15745a0) ? super.getHint() : textInputLayoutM14731b.getHint();
    }

    public float getPopupElevation() {
        return this.f40994i;
    }

    public int getSimpleItemSelectedColor() {
        return this.f40995j;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f40996k;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutM14731b = m14731b();
        if (textInputLayoutM14731b != null && textInputLayoutM14731b.f15745a0 && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40990e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutM14731b = m14731b();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutM14731b != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C0327l0 c0327l0 = this.f40990e;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !c0327l0.mo893a() ? -1 : c0327l0.f1279c.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutM14731b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable drawableM1238h = c0327l0.m1238h();
                if (drawableM1238h != null) {
                    Rect rect = this.f40992g;
                    drawableM1238h.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutM14731b.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        AccessibilityManager accessibilityManager = this.f40991f;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        super.onWindowFocusChanged(z10);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t10) {
        super.setAdapter(t10);
        this.f40990e.mo1009p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C0327l0 c0327l0 = this.f40990e;
        if (c0327l0 != null) {
            c0327l0.m1239k(drawable);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f40990e.f1267L = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i10) {
        super.setRawInputType(i10);
        TextInputLayout textInputLayoutM14731b = m14731b();
        if (textInputLayoutM14731b != null) {
            textInputLayoutM14731b.m8899r();
        }
    }

    public void setSimpleItemSelectedColor(int i10) {
        this.f40995j = i10;
        if (getAdapter() instanceof a) {
            ((a) getAdapter()).m14732b();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f40996k = colorStateList;
        if (getAdapter() instanceof a) {
            ((a) getAdapter()).m14732b();
        }
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new a(getContext(), this.f40993h, strArr));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.f40991f;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.f40990e.mo894b();
        } else {
            super.showDropDown();
        }
    }
}
