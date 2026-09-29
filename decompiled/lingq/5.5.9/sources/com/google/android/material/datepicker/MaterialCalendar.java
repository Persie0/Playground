package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.C1143b0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.linguist.R;
import java.util.Calendar;
import java.util.GregorianCalendar;
import p471x2.C10026a;
import p471x2.C10029b0;
import p497y2.C10284f;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialCalendar<S> extends AbstractC3020v<S> {

    /* JADX INFO: renamed from: J0 */
    public static final /* synthetic */ int f15111J0 = 0;

    /* JADX INFO: renamed from: A0 */
    public Month f15112A0;

    /* JADX INFO: renamed from: B0 */
    public CalendarSelector f15113B0;

    /* JADX INFO: renamed from: C0 */
    public C2999b f15114C0;

    /* JADX INFO: renamed from: D0 */
    public RecyclerView f15115D0;

    /* JADX INFO: renamed from: E0 */
    public RecyclerView f15116E0;

    /* JADX INFO: renamed from: F0 */
    public View f15117F0;

    /* JADX INFO: renamed from: G0 */
    public View f15118G0;

    /* JADX INFO: renamed from: H0 */
    public View f15119H0;

    /* JADX INFO: renamed from: I0 */
    public View f15120I0;

    /* JADX INFO: renamed from: w0 */
    public int f15121w0;

    /* JADX INFO: renamed from: x0 */
    public DateSelector<S> f15122x0;

    /* JADX INFO: renamed from: y0 */
    public CalendarConstraints f15123y0;

    /* JADX INFO: renamed from: z0 */
    public DayViewDecorator f15124z0;

    public enum CalendarSelector {
        DAY,
        YEAR
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.MaterialCalendar$a */
    public class C2992a extends C10026a {
        @Override // p471x2.C10026a
        /* JADX INFO: renamed from: d */
        public final void mo2999d(View view, C10284f c10284f) {
            this.f50989a.onInitializeAccessibilityNodeInfo(view, c10284f.f51739a);
            c10284f.m19265j(null);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.MaterialCalendar$b */
    public class C2993b extends C3022x {

        /* JADX INFO: renamed from: E */
        public final /* synthetic */ int f15125E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2993b(int i10, int i11) {
            super(i10);
            this.f15125E = i11;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        /* JADX INFO: renamed from: H0 */
        public final void mo4111H0(RecyclerView.C1131x c1131x, int[] iArr) {
            int i10 = this.f15125E;
            MaterialCalendar materialCalendar = MaterialCalendar.this;
            if (i10 == 0) {
                iArr[0] = materialCalendar.f15116E0.getWidth();
                iArr[1] = materialCalendar.f15116E0.getWidth();
            } else {
                iArr[0] = materialCalendar.f15116E0.getHeight();
                iArr[1] = materialCalendar.f15116E0.getHeight();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.MaterialCalendar$c */
    public class C2994c implements InterfaceC2995d {
        public C2994c() {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.MaterialCalendar$d */
    public interface InterfaceC2995d {
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: H */
    public final void mo3560H(Bundle bundle) {
        super.mo3560H(bundle);
        if (bundle == null) {
            bundle = this.f6101g;
        }
        this.f15121w0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f15122x0 = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f15123y0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f15124z0 = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f15112A0 = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public final View mo3561I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(mo471m(), this.f15121w0);
        this.f15114C0 = new C2999b(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month month = this.f15123y0.f15096a;
        if (C3011m.m8741v0(contextThemeWrapper)) {
            i10 = R.layout.mtrl_calendar_vertical;
            i11 = 1;
        } else {
            i10 = R.layout.mtrl_calendar_horizontal;
            i11 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i10, viewGroup, false);
        Resources resources = m3578a0().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i12 = C3016r.f15211g;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i12 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i12) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(R.id.mtrl_calendar_days_of_week);
        C10029b0.m18658n(gridView, new C2992a());
        int i13 = this.f15123y0.f15100e;
        gridView.setAdapter((ListAdapter) (i13 > 0 ? new C3001c(i13) : new C3001c()));
        gridView.setNumColumns(month.f15133d);
        gridView.setEnabled(false);
        this.f15116E0 = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_months);
        mo471m();
        this.f15116E0.setLayoutManager(new C2993b(i11, i11));
        this.f15116E0.setTag("MONTHS_VIEW_GROUP_TAG");
        C3018t c3018t = new C3018t(contextThemeWrapper, this.f15122x0, this.f15123y0, this.f15124z0, new C2994c());
        this.f15116E0.setAdapter(c3018t);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f15115D0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f15115D0.setLayoutManager(new GridLayoutManager(integer));
            this.f15115D0.setAdapter(new C3000b0(this));
            this.f15115D0.m4199g(new C3005g(this));
        }
        if (viewInflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            C10029b0.m18658n(materialButton, new C3006h(this));
            View viewFindViewById = viewInflate.findViewById(R.id.month_navigation_previous);
            this.f15117F0 = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(R.id.month_navigation_next);
            this.f15118G0 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f15119H0 = viewInflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.f15120I0 = viewInflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            m8732o0(CalendarSelector.DAY);
            materialButton.setText(this.f15112A0.m8737q());
            this.f15116E0.m4203i(new C3007i(this, c3018t, materialButton));
            materialButton.setOnClickListener(new ViewOnClickListenerC3008j(this));
            this.f15118G0.setOnClickListener(new ViewOnClickListenerC3009k(this, c3018t));
            this.f15117F0.setOnClickListener(new ViewOnClickListenerC3002d(this, c3018t));
        }
        if (!C3011m.m8741v0(contextThemeWrapper)) {
            new C1143b0().m4486a(this.f15116E0);
        }
        RecyclerView recyclerView2 = this.f15116E0;
        Month month2 = this.f15112A0;
        Month month3 = c3018t.f15221d.f15096a;
        if (!(month3.f15130a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        recyclerView2.m4200g0((month2.f15131b - month3.f15131b) + ((month2.f15132c - month3.f15132c) * 12));
        C10029b0.m18658n(this.f15116E0, new C3004f());
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: R */
    public final void mo3569R(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f15121w0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f15122x0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f15123y0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f15124z0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f15112A0);
    }

    @Override // com.google.android.material.datepicker.AbstractC3020v
    /* JADX INFO: renamed from: m0 */
    public final boolean mo8730m0(C3011m.d dVar) {
        return super.mo8730m0(dVar);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: n0 */
    public final void m8731n0(Month month) {
        Month month2 = ((C3018t) this.f15116E0.getAdapter()).f15221d.f15096a;
        Calendar calendar = month2.f15130a;
        if (!(calendar instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        int i10 = month.f15132c;
        int i11 = month2.f15132c;
        int i12 = month.f15131b;
        int i13 = month2.f15131b;
        int i14 = (i12 - i13) + ((i10 - i11) * 12);
        Month month3 = this.f15112A0;
        if (!(calendar instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        int i15 = i14 - ((month3.f15131b - i13) + ((month3.f15132c - i11) * 12));
        boolean z10 = Math.abs(i15) > 3;
        boolean z11 = i15 > 0;
        this.f15112A0 = month;
        if (z10 && z11) {
            this.f15116E0.m4200g0(i14 - 3);
            this.f15116E0.post(new RunnableC3003e(this, i14));
        } else if (!z10) {
            this.f15116E0.post(new RunnableC3003e(this, i14));
        } else {
            this.f15116E0.m4200g0(i14 + 3);
            this.f15116E0.post(new RunnableC3003e(this, i14));
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m8732o0(CalendarSelector calendarSelector) {
        this.f15113B0 = calendarSelector;
        if (calendarSelector != CalendarSelector.YEAR) {
            if (calendarSelector == CalendarSelector.DAY) {
                this.f15119H0.setVisibility(8);
                this.f15120I0.setVisibility(0);
                this.f15117F0.setVisibility(0);
                this.f15118G0.setVisibility(0);
                m8731n0(this.f15112A0);
            }
            return;
        }
        this.f15115D0.getLayoutManager().mo4153u0(this.f15112A0.f15132c - ((C3000b0) this.f15115D0.getAdapter()).f15153d.f15123y0.f15096a.f15132c);
        this.f15119H0.setVisibility(0);
        this.f15120I0.setVisibility(8);
        this.f15117F0.setVisibility(8);
        this.f15118G0.setVisibility(8);
    }
}
