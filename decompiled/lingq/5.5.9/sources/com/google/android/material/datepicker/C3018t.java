package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.recyclerview.widget.RecyclerView;
import com.linguist.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.WeakHashMap;
import p471x2.C10027a0;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: com.google.android.material.datepicker.t */
/* JADX INFO: loaded from: classes.dex */
public final class C3018t extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: d */
    public final CalendarConstraints f15221d;

    /* JADX INFO: renamed from: e */
    public final DateSelector<?> f15222e;

    /* JADX INFO: renamed from: f */
    public final DayViewDecorator f15223f;

    /* JADX INFO: renamed from: g */
    public final MaterialCalendar.InterfaceC2995d f15224g;

    /* JADX INFO: renamed from: h */
    public final int f15225h;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.t$a */
    public static class a extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: u */
        public final TextView f15226u;

        /* JADX INFO: renamed from: v */
        public final MaterialCalendarGridView f15227v;

        public a(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.f15226u = textView;
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            new C10027a0().m18662e(textView, Boolean.TRUE);
            this.f15227v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (z10) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public C3018t(ContextThemeWrapper contextThemeWrapper, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, MaterialCalendar.C2994c c2994c) {
        Calendar calendar = calendarConstraints.f15096a.f15130a;
        Month month = calendarConstraints.f15099d;
        if (calendar.compareTo(month.f15130a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (month.f15130a.compareTo(calendarConstraints.f15097b.f15130a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        int i10 = C3016r.f15211g;
        int i11 = MaterialCalendar.f15111J0;
        this.f15225h = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i10) + (C3011m.m8741v0(contextThemeWrapper) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f15221d = calendarConstraints;
        this.f15222e = dateSelector;
        this.f15223f = dayViewDecorator;
        this.f15224g = c2994c;
        if (this.f7040a.m4258a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f7041b = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e */
    public final int mo4226e() {
        return this.f15221d.f15102g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: f */
    public final long mo4227f(int i10) {
        Calendar calendarM8754c = C3024z.m8754c(this.f15221d.f15096a.f15130a);
        calendarM8754c.add(2, i10);
        return new Month(calendarM8754c).f15130a.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        a aVar = (a) abstractC1109b0;
        CalendarConstraints calendarConstraints = this.f15221d;
        Calendar calendarM8754c = C3024z.m8754c(calendarConstraints.f15096a.f15130a);
        calendarM8754c.add(2, i10);
        Month month = new Month(calendarM8754c);
        aVar.f15226u.setText(month.m8737q());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar.f15227v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() != null && month.equals(materialCalendarGridView.getAdapter().f15213a)) {
            materialCalendarGridView.invalidate();
            C3016r c3016rM8733a = materialCalendarGridView.getAdapter();
            Iterator<Long> it = c3016rM8733a.f15215c.iterator();
            while (it.hasNext()) {
                c3016rM8733a.m8751e(materialCalendarGridView, it.next().longValue());
            }
            DateSelector<?> dateSelector = c3016rM8733a.f15214b;
            if (dateSelector != null) {
                Iterator<Long> it2 = dateSelector.m8724d0().iterator();
                while (it2.hasNext()) {
                    c3016rM8733a.m8751e(materialCalendarGridView, it2.next().longValue());
                }
                c3016rM8733a.f15215c = dateSelector.m8724d0();
            }
            materialCalendarGridView.setOnItemClickListener(new C3017s(this, materialCalendarGridView));
        }
        C3016r c3016r = new C3016r(month, this.f15222e, calendarConstraints, this.f15223f);
        materialCalendarGridView.setNumColumns(month.f15133d);
        materialCalendarGridView.setAdapter((ListAdapter) c3016r);
        materialCalendarGridView.setOnItemClickListener(new C3017s(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        LinearLayout linearLayout = (LinearLayout) C0204c.m849h(recyclerView, R.layout.mtrl_calendar_month_labeled, recyclerView, false);
        if (!C3011m.m8741v0(recyclerView.getContext())) {
            return new a(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.C1121n(-1, this.f15225h));
        return new a(linearLayout, true);
    }
}
