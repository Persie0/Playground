package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.linguist.R;
import java.util.Calendar;
import java.util.Iterator;
import p446w2.C9805c;
import p471x2.C10029b0;

/* JADX INFO: loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* JADX INFO: renamed from: a */
    public final Calendar f15128a;

    /* JADX INFO: renamed from: b */
    public final boolean f15129b;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f15128a = C3024z.m8756e(null);
        if (C3011m.m8741v0(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f15129b = C3011m.m8742w0(R.attr.nestedScrollable, getContext());
        C10029b0.m18658n(this, new C3010l());
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3016r getAdapter() {
        return (C3016r) super.getAdapter();
    }

    /* JADX INFO: renamed from: b */
    public final View m8734b(int i10) {
        return getChildAt(i10 - getFirstVisiblePosition());
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C3016r adapter = getAdapter();
        DateSelector<?> dateSelector = adapter.f15214b;
        C2999b c2999b = adapter.f15216d;
        int iMax = Math.max(adapter.m8748b(), getFirstVisiblePosition());
        int iMin = Math.min((adapter.m8748b() + adapter.f15213a.f15134e) - 1, getLastVisiblePosition());
        adapter.getItem(iMax);
        adapter.getItem(iMin);
        Iterator<C9805c<Long, Long>> it = dateSelector.m8720D().iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (!z10) {
            super.onFocusChanged(false, i10, rect);
            return;
        }
        if (i10 == 33) {
            C3016r adapter = getAdapter();
            setSelection((adapter.m8748b() + adapter.f15213a.f15134e) - 1);
        } else if (i10 == 130) {
            setSelection(getAdapter().m8748b());
        } else {
            super.onFocusChanged(true, i10, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!super.onKeyDown(i10, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().m8748b()) {
            return true;
        }
        if (19 != i10) {
            return false;
        }
        setSelection(getAdapter().m8748b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (!this.f15129b) {
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof C3016r)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C3016r.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i10) {
        if (i10 < getAdapter().m8748b()) {
            super.setSelection(getAdapter().m8748b());
        } else {
            super.setSelection(i10);
        }
    }
}
