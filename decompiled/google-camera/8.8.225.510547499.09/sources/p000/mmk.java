package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mmk extends C0265ii {

    /* JADX INFO: renamed from: a */
    public final C0794lg f41045a;

    /* JADX INFO: renamed from: b */
    public final int f41046b;

    /* JADX INFO: renamed from: c */
    public final ColorStateList f41047c;

    /* JADX INFO: renamed from: d */
    private final AccessibilityManager f41048d;

    /* JADX INFO: renamed from: e */
    private final Rect f41049e;

    /* JADX INFO: renamed from: f */
    private final int f41050f;

    public mmk(Context context, AttributeSet attributeSet) {
        super(mmp.m16632a(context, attributeSet, C0100R.attr.autoCompleteTextViewStyle, 0), attributeSet, C0100R.attr.autoCompleteTextViewStyle);
        this.f41049e = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayM16438a = mjb.m16438a(context2, attributeSet, mml.f41051a, C0100R.attr.autoCompleteTextViewStyle, C0100R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayM16438a.hasValue(0) && typedArrayM16438a.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        int resourceId = typedArrayM16438a.getResourceId(2, C0100R.layout.mtrl_auto_complete_simple_item);
        this.f41050f = resourceId;
        typedArrayM16438a.getDimensionPixelOffset(1, C0100R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        this.f41046b = typedArrayM16438a.getColor(3, 0);
        this.f41047c = mkv.m16540d(context2, typedArrayM16438a, 4);
        this.f41048d = (AccessibilityManager) context2.getSystemService("accessibility");
        C0794lg c0794lg = new C0794lg(context2, null, C0100R.attr.listPopupWindowStyle);
        this.f41045a = c0794lg;
        c0794lg.m15311y();
        c0794lg.f38183l = this;
        c0794lg.m15310x();
        c0794lg.mo12909e(getAdapter());
        c0794lg.f38184m = new lrt(this, 2);
        if (typedArrayM16438a.hasValue(5)) {
            setAdapter(new mmj(this, getContext(), resourceId, getResources().getStringArray(typedArrayM16438a.getResourceId(5, 0))));
        }
        typedArrayM16438a.recycle();
    }

    /* JADX INFO: renamed from: b */
    private final mmm m16626b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof mmm) {
                return (mmm) parent;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private final boolean m16627c() {
        AccessibilityManager accessibilityManager = this.f41048d;
        return accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled();
    }

    /* JADX INFO: renamed from: a */
    public final void m16628a(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (m16627c()) {
            this.f41045a.mo9626k();
        } else {
            super.dismissDropDown();
        }
    }

    @Override // android.widget.TextView
    public final CharSequence getHint() {
        if (m16626b() == null) {
            return super.getHint();
        }
        throw null;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m16626b() != null) {
            throw null;
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f41045a.mo9626k();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            mmm mmmVarM16626b = m16626b();
            int i3 = 0;
            if (adapter == null || mmmVarM16626b == null) {
                setMeasuredDimension(Math.min(Math.max(measuredWidth, 0), View.MeasureSpec.getSize(i)), getMeasuredHeight());
                return;
            }
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
            int iMin = Math.min(adapter.getCount(), Math.max(0, this.f41045a.m15303o()) + 15);
            int iMax = Math.max(0, iMin - 15);
            View view = null;
            int iMax2 = 0;
            while (iMax < iMin) {
                int itemViewType = adapter.getItemViewType(iMax);
                int i4 = itemViewType != i3 ? itemViewType : i3;
                if (itemViewType != i3) {
                    view = null;
                }
                view = adapter.getView(iMax, view, mmmVarM16626b);
                if (view.getLayoutParams() == null) {
                    view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                }
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                iMax2 = Math.max(iMax2, view.getMeasuredWidth());
                iMax++;
                i3 = i4;
            }
            Drawable drawableM15299c = this.f41045a.m15299c();
            if (drawableM15299c == null) {
                throw null;
            }
            drawableM15299c.getPadding(this.f41049e);
            int i5 = this.f41049e.left;
            int i6 = this.f41049e.right;
            throw null;
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (m16627c()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
        this.f41045a.mo12909e(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C0794lg c0794lg = this.f41045a;
        if (c0794lg != null) {
            c0794lg.m15300f(drawable);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f41045a.f38185n = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public final void setRawInputType(int i) {
        super.setRawInputType(i);
        if (m16626b() != null) {
            throw null;
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (m16627c()) {
            this.f41045a.mo9634s();
        } else {
            super.showDropDown();
        }
    }
}
