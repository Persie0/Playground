package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.google.android.material.R$attr;
import com.google.android.material.R$id;
import com.google.android.material.focus.FocusRingDrawable;
import p000.RunnableC3781y2;
import p000.dta;
import p000.fma;
import p000.gv5;
import p000.r39;
import p000.uk9;
import p000.ur5;
import p000.vqb;
import p000.web;
import p000.xwc;

/* JADX INFO: loaded from: classes2.dex */
public final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: a */
    public final boolean f12897a;

    /* JADX INFO: renamed from: b */
    public web f12898b;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        fma.m11945c(null);
        if (C1058f.m6125n0(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(R$id.cancel_button);
            setNextFocusRightId(R$id.confirm_button);
        }
        this.f12897a = C1058f.m6125n0(getContext(), R$attr.nestedScrollable);
        dta.m10640k(this, new ur5(2));
    }

    /* JADX INFO: renamed from: a */
    public static void m6114a(MaterialCalendarGridView materialCalendarGridView) {
        C1060h c1060h = (C1060h) super.getAdapter();
        Drawable selector = materialCalendarGridView.getSelector();
        if (selector instanceof FocusRingDrawable) {
            return;
        }
        Context context = materialCalendarGridView.getContext();
        ColorDrawable colorDrawable = FocusRingDrawable.f12977K;
        if (xwc.m24749V(context.getTheme(), R$attr.focusRingsEnabled, false)) {
            selector = new FocusRingDrawable(context, selector);
        }
        if (selector instanceof FocusRingDrawable) {
            FocusRingDrawable focusRingDrawable = (FocusRingDrawable) selector;
            gv5 gv5Var = c1060h.f12938b;
            if (gv5Var != null) {
                focusRingDrawable.f12983J.f36918t = (r39) ((vqb) gv5Var.f41392b).f65802b;
            }
            materialCalendarGridView.setDrawSelectorOnTop(true);
            materialCalendarGridView.setSelector(focusRingDrawable);
        }
    }

    /* JADX INFO: renamed from: b */
    public final C1060h m6115b() {
        return (C1060h) super.getAdapter();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m6116c(int i, boolean z) {
        web webVar;
        web webVar2;
        int iM6127a = z ? ((C1060h) super.getAdapter()).m6127a(i) : ((C1060h) super.getAdapter()).m6128b(i);
        if (iM6127a != -1) {
            setSelection(iM6127a);
            return true;
        }
        if (!z && (webVar2 = this.f12898b) != null) {
            return MaterialCalendar.m6107d0((MaterialCalendar) webVar2.f66742a, false);
        }
        if (!z || (webVar = this.f12898b) == null) {
            return true;
        }
        return MaterialCalendar.m6107d0((MaterialCalendar) webVar.f66742a, true);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m6117d(int i) {
        C1060h c1060h = (C1060h) super.getAdapter();
        if (!c1060h.m6131e(i)) {
            long itemId = c1060h.getItemId(i);
            int i2 = 1;
            while (true) {
                if (i2 >= c1060h.f12937a.f12902d) {
                    i = -1;
                    break;
                }
                int i3 = i + i2;
                if ((i3 < C1060h.f12936e && c1060h.getItemId(i3) == itemId && c1060h.m6131e(i3)) || ((i3 = i - i2) >= 0 && c1060h.getItemId(i3) == itemId && c1060h.m6131e(i3))) {
                    i = i3;
                    break;
                }
                i2++;
            }
        }
        if (i == -1) {
            return false;
        }
        setSelection(i);
        return true;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (C1060h) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((C1060h) super.getAdapter()).notifyDataSetChanged();
        post(new RunnableC3781y2(this, 28));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C1060h c1060h = (C1060h) super.getAdapter();
        c1060h.getClass();
        int iMax = Math.max(c1060h.m6129c(), getFirstVisiblePosition());
        int iMin = Math.min(c1060h.m6132f(), getLastVisiblePosition());
        c1060h.getItem(iMax);
        c1060h.getItem(iMin);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int iM6128b;
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33 || i == 1) {
            C1060h c1060h = (C1060h) super.getAdapter();
            iM6128b = c1060h.m6128b(c1060h.m6132f() + 1);
        } else if (i == 130 || i == 2) {
            C1060h c1060h2 = (C1060h) super.getAdapter();
            iM6128b = c1060h2.m6127a(c1060h2.m6129c() - 1);
        } else {
            iM6128b = -1;
        }
        if (iM6128b != -1) {
            setSelection(iM6128b);
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1) {
            return super.onKeyDown(i, keyEvent);
        }
        boolean z = getLayoutDirection() == 1;
        if (i == 21) {
            return m6116c(selectedItemPosition, z);
        }
        if (i == 22) {
            return m6116c(selectedItemPosition, !z);
        }
        if (i == 61) {
            int iM6128b = keyEvent.isShiftPressed() ? ((C1060h) super.getAdapter()).m6128b(selectedItemPosition) : ((C1060h) super.getAdapter()).m6127a(selectedItemPosition);
            if (iM6128b == -1) {
                return false;
            }
            setSelection(iM6128b);
            return true;
        }
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        C1060h c1060h = (C1060h) super.getAdapter();
        int selectedItemPosition2 = getSelectedItemPosition();
        if (selectedItemPosition2 == -1 || c1060h.m6131e(selectedItemPosition2)) {
            return true;
        }
        C1060h c1060h2 = (C1060h) super.getAdapter();
        if (!m6117d(selectedItemPosition2)) {
            if (19 != i) {
                if (i == 20) {
                    int numColumns = getNumColumns();
                    while (true) {
                        numColumns += selectedItemPosition2;
                        if (numColumns > c1060h2.m6132f()) {
                            break;
                        }
                        if (!m6117d(numColumns)) {
                            selectedItemPosition2 = getNumColumns();
                        }
                    }
                }
                return false;
            }
            int numColumns2 = getNumColumns();
            while (true) {
                selectedItemPosition2 -= numColumns2;
                if (selectedItemPosition2 < c1060h2.m6129c()) {
                    return false;
                }
                if (m6117d(selectedItemPosition2)) {
                    break;
                }
                numColumns2 = getNumColumns();
            }
        }
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.f12897a) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof C1060h) {
            super.setAdapter(listAdapter);
        } else {
            uk9.m22783r("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), C1060h.class.getCanonicalName()});
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        C1060h c1060h = (C1060h) super.getAdapter();
        super.setSelection(Math.max(i, c1060h.m6127a(c1060h.m6129c() - 1)));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (C1060h) super.getAdapter();
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }
}
