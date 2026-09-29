package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$integer;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import com.google.android.material.button.MaterialButton;
import p000.a3d;
import p000.a6a;
import p000.dta;
import p000.ea0;
import p000.g87;
import p000.gv5;
import p000.ho2;
import p000.nv3;
import p000.og0;
import p000.q28;
import p000.r27;
import p000.tr5;
import p000.ur5;
import p000.vr5;
import p000.web;
import p000.y22;

/* JADX INFO: loaded from: classes2.dex */
public final class MaterialCalendar<S> extends g87 {

    /* JADX INFO: renamed from: A0 */
    public CalendarSelector f12882A0;

    /* JADX INFO: renamed from: B0 */
    public gv5 f12883B0;

    /* JADX INFO: renamed from: C0 */
    public RecyclerView f12884C0;

    /* JADX INFO: renamed from: D0 */
    public RecyclerView f12885D0;

    /* JADX INFO: renamed from: E0 */
    public View f12886E0;

    /* JADX INFO: renamed from: F0 */
    public View f12887F0;

    /* JADX INFO: renamed from: G0 */
    public View f12888G0;

    /* JADX INFO: renamed from: H0 */
    public View f12889H0;

    /* JADX INFO: renamed from: I0 */
    public MaterialButton f12890I0;

    /* JADX INFO: renamed from: J0 */
    public AccessibilityManager f12891J0;

    /* JADX INFO: renamed from: K0 */
    public r27 f12892K0;

    /* JADX INFO: renamed from: L0 */
    public boolean f12893L0;

    /* JADX INFO: renamed from: x0 */
    public int f12894x0;

    /* JADX INFO: renamed from: y0 */
    public CalendarConstraints f12895y0;

    /* JADX INFO: renamed from: z0 */
    public Month f12896z0;

    public enum CalendarSelector {
        DAY,
        YEAR
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m6107d0(MaterialCalendar materialCalendar, boolean z) {
        Month month;
        if (materialCalendar.f12893L0) {
            return false;
        }
        if (materialCalendar.f12885D0.getScrollState() != 0) {
            return true;
        }
        C1061i c1061i = (C1061i) materialCalendar.f12885D0.getAdapter();
        if (c1061i == null || (month = materialCalendar.f12896z0) == null) {
            return false;
        }
        int iM6138l = c1061i.m6138l(month) + (z ? 1 : -1);
        if (iM6138l < 0 || iM6138l >= c1061i.f12940d.f12880g) {
            return false;
        }
        c1061i.f12945i = z ? 2 : 1;
        materialCalendar.m6109e0(c1061i.m6137k(iM6138l));
        return true;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(mo2107i(), this.f12894x0);
        this.f12883B0 = new gv5((Context) contextThemeWrapper, 11);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        this.f12891J0 = (AccessibilityManager) m2090R().getSystemService("accessibility");
        Month month = this.f12895y0.f12874a;
        boolean zM6125n0 = C1058f.m6125n0(contextThemeWrapper, R.attr.windowFullscreen);
        this.f12893L0 = zM6125n0;
        int i3 = 0;
        int i4 = 1;
        if (zM6125n0) {
            i = R$layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = R$layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = m2090R().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R$dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.mtrl_calendar_days_of_week_height);
        int i5 = C1060h.f12935d;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_month_vertical_padding) * (i5 - 1)) + (resources.getDimensionPixelSize(R$dimen.mtrl_calendar_day_height) * i5) + resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(R$id.mtrl_calendar_days_of_week);
        dta.m10640k(gridView, new ur5(i3));
        int i6 = this.f12895y0.f12878e;
        gridView.setAdapter((ListAdapter) (i6 > 0 ? new y22(i6) : new y22()));
        gridView.setNumColumns(month.f12902d);
        gridView.setEnabled(false);
        this.f12885D0 = (RecyclerView) viewInflate.findViewById(R$id.mtrl_calendar_months);
        this.f12885D0.setLayoutManager(new vr5(this, i2, i2));
        this.f12885D0.setTag("MONTHS_VIEW_GROUP_TAG");
        C1061i c1061i = new C1061i(contextThemeWrapper, this.f12895y0, new C1055c(this), new web(this));
        this.f12885D0.setAdapter(c1061i);
        int integer = contextThemeWrapper.getResources().getInteger(R$integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R$id.mtrl_calendar_year_selector_frame);
        this.f12884C0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f12884C0.setLayoutManager(new GridLayoutManager(integer));
            this.f12884C0.setAdapter(new C1062j(this));
            this.f12884C0.m2741i(new nv3(this));
        }
        if (!this.f12893L0) {
            r27 r27Var = new r27();
            this.f12892K0 = r27Var;
            r27Var.m20255b(this.f12885D0);
        }
        if (viewInflate.findViewById(R$id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(R$id.month_navigation_fragment_toggle);
            this.f12890I0 = materialButton;
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            dta.m10640k(this.f12890I0, new og0(this, 5));
            View viewFindViewById = viewInflate.findViewById(R$id.month_navigation_previous);
            this.f12886E0 = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            a6a.m135a(this.f12886E0, m2111m(R$string.mtrl_picker_prev_month_tooltip));
            View viewFindViewById2 = viewInflate.findViewById(R$id.month_navigation_next);
            this.f12887F0 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            a6a.m135a(this.f12887F0, m2111m(R$string.mtrl_picker_next_month_tooltip));
            this.f12888G0 = viewInflate.findViewById(R$id.mtrl_calendar_year_selector_frame);
            this.f12889H0 = viewInflate.findViewById(R$id.mtrl_calendar_day_selector_frame);
            m6110f0(CalendarSelector.DAY);
            this.f12890I0.setText(this.f12896z0.m6120c());
            this.f12885D0.m2743j(new C1056d(this, c1061i));
            this.f12890I0.setOnClickListener(new ViewOnClickListenerC1057e(this));
            this.f12887F0.setOnClickListener(new tr5(this, c1061i, i3));
            this.f12886E0.setOnClickListener(new tr5(this, c1061i, i4));
            m6113i0(c1061i.m6138l(this.f12896z0));
        }
        this.f12885D0.m2742i0(c1061i.m6138l(this.f12896z0));
        dta.m10640k(this.f12885D0, new ur5(i4));
        m6111g0(viewInflate);
        return viewInflate;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: I */
    public final void mo2082I(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f12894x0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f12895y0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f12896z0);
    }

    @Override // p000.g87
    /* JADX INFO: renamed from: c0 */
    public final void mo6108c0(a3d a3dVar) {
        this.f40389w0.add(a3dVar);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m6109e0(Month month) {
        C1061i c1061i = (C1061i) this.f12885D0.getAdapter();
        int iM6138l = c1061i.m6138l(month);
        AccessibilityManager accessibilityManager = this.f12891J0;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            int iM6138l2 = iM6138l - c1061i.m6138l(this.f12896z0);
            boolean z = Math.abs(iM6138l2) > 3;
            boolean z2 = iM6138l2 > 0;
            this.f12896z0 = month;
            int i = 2;
            if (z && z2) {
                this.f12885D0.m2742i0(iM6138l - 3);
                this.f12885D0.post(new ea0(this, iM6138l, i));
            } else {
                RecyclerView recyclerView = this.f12885D0;
                if (z) {
                    recyclerView.m2742i0(iM6138l + 3);
                    this.f12885D0.post(new ea0(this, iM6138l, i));
                } else {
                    recyclerView.post(new ea0(this, iM6138l, i));
                }
            }
        } else {
            this.f12896z0 = month;
            this.f12885D0.m2742i0(iM6138l);
        }
        m6112h0();
        m6113i0(iM6138l);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m6110f0(CalendarSelector calendarSelector) {
        this.f12882A0 = calendarSelector;
        if (calendarSelector == CalendarSelector.YEAR) {
            this.f12884C0.getLayoutManager().mo2697w0(this.f12896z0.f12901c - ((C1062j) this.f12884C0.getAdapter()).f12946d.f12895y0.f12874a.f12901c);
            this.f12888G0.setVisibility(0);
            this.f12889H0.setVisibility(8);
            this.f12886E0.setVisibility(8);
            this.f12887F0.setVisibility(8);
            return;
        }
        if (calendarSelector == CalendarSelector.DAY) {
            this.f12888G0.setVisibility(8);
            this.f12889H0.setVisibility(0);
            this.f12886E0.setVisibility(0);
            this.f12887F0.setVisibility(0);
            m6109e0(this.f12896z0);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m6111g0(View view) {
        if (view == null) {
            return;
        }
        CalendarSelector calendarSelector = this.f12882A0;
        if (calendarSelector == CalendarSelector.YEAR) {
            dta.m10641l(view, m2111m(R$string.mtrl_picker_pane_title_year_view));
        } else if (calendarSelector == CalendarSelector.DAY) {
            dta.m10641l(view, m2111m(R$string.mtrl_picker_pane_title_calendar_view));
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m6112h0() {
        Month month;
        C1061i c1061i = (C1061i) this.f12885D0.getAdapter();
        if (c1061i != null) {
            q28 q28Var = c1061i.f55486a;
            if (this.f12893L0 || (month = this.f12896z0) == null || month.equals(c1061i.f12944h)) {
                return;
            }
            int iM6138l = c1061i.m6138l(c1061i.f12944h);
            c1061i.f12944h = month;
            int iM6138l2 = c1061i.m6138l(month);
            q28Var.m19620d(iM6138l, 1);
            q28Var.m19620d(iM6138l2, 1);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m6113i0(int i) {
        View view = this.f12887F0;
        if (view != null) {
            view.setEnabled(i + 1 < this.f12885D0.getAdapter().mo6133a());
        }
        View view2 = this.f12886E0;
        if (view2 != null) {
            view2.setEnabled(i - 1 >= 0);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: z */
    public final void mo2124z(Bundle bundle) {
        super.mo2124z(bundle);
        if (bundle == null) {
            bundle = this.f5695f;
        }
        this.f12894x0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            ho2.m13383c();
            return;
        }
        this.f12895y0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
            this.f12896z0 = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
        } else {
            ho2.m13383c();
        }
    }
}
