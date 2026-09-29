package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.linguist.R;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import p446w2.C9805c;

/* JADX INFO: renamed from: com.google.android.material.datepicker.r */
/* JADX INFO: loaded from: classes.dex */
public final class C3016r extends BaseAdapter {

    /* JADX INFO: renamed from: g */
    public static final int f15211g = C3024z.m8756e(null).getMaximum(4);

    /* JADX INFO: renamed from: h */
    public static final int f15212h = (C3024z.m8756e(null).getMaximum(7) + C3024z.m8756e(null).getMaximum(5)) - 1;

    /* JADX INFO: renamed from: a */
    public final Month f15213a;

    /* JADX INFO: renamed from: b */
    public final DateSelector<?> f15214b;

    /* JADX INFO: renamed from: c */
    public Collection<Long> f15215c;

    /* JADX INFO: renamed from: d */
    public C2999b f15216d;

    /* JADX INFO: renamed from: e */
    public final CalendarConstraints f15217e;

    /* JADX INFO: renamed from: f */
    public final DayViewDecorator f15218f;

    public C3016r(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.f15213a = month;
        this.f15214b = dateSelector;
        this.f15217e = calendarConstraints;
        this.f15218f = dayViewDecorator;
        this.f15215c = dateSelector.m8724d0();
    }

    /* JADX INFO: renamed from: b */
    public final int m8748b() {
        int firstDayOfWeek = this.f15217e.f15100e;
        Month month = this.f15213a;
        Calendar calendar = month.f15130a;
        int i10 = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i11 = i10 - firstDayOfWeek;
        if (i11 < 0) {
            i11 += month.f15133d;
        }
        return i11;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i10) {
        if (i10 >= m8748b()) {
            int iM8748b = m8748b();
            Month month = this.f15213a;
            if (i10 <= (iM8748b + month.f15134e) - 1) {
                int iM8748b2 = (i10 - m8748b()) + 1;
                Calendar calendarM8754c = C3024z.m8754c(month.f15130a);
                calendarM8754c.set(5, iM8748b2);
                return Long.valueOf(calendarM8754c.getTimeInMillis());
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m8750d(TextView textView, long j10, int i10) {
        C2997a c2997a;
        boolean z10;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean z11 = C3024z.m8755d().getTimeInMillis() == j10;
        DateSelector<?> dateSelector = this.f15214b;
        Iterator<C9805c<Long, Long>> it = dateSelector.m8720D().iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
        Iterator<C9805c<Long, Long>> it2 = dateSelector.m8720D().iterator();
        while (it2.hasNext()) {
            it2.next().getClass();
        }
        Calendar calendarM8755d = C3024z.m8755d();
        Calendar calendarM8756e = C3024z.m8756e(null);
        calendarM8756e.setTimeInMillis(j10);
        String str = calendarM8755d.get(1) == calendarM8756e.get(1) ? C3024z.m8753b("MMMEd", Locale.getDefault()).format(new Date(j10)) : C3024z.m8753b("yMMMEd", Locale.getDefault()).format(new Date(j10));
        if (z11) {
            str = String.format(context.getString(R.string.mtrl_picker_today_description), str);
        }
        textView.setContentDescription(str);
        if (this.f15217e.f15098c.mo8719Y(j10)) {
            textView.setEnabled(true);
            Iterator<Long> it3 = dateSelector.m8724d0().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z10 = false;
                    break;
                } else if (C3024z.m8752a(j10) == C3024z.m8752a(it3.next().longValue())) {
                    z10 = true;
                    break;
                }
            }
            textView.setSelected(z10);
            if (z10) {
                c2997a = this.f15216d.f15146b;
            } else {
                c2997a = C3024z.m8755d().getTimeInMillis() == j10 ? this.f15216d.f15147c : this.f15216d.f15145a;
            }
        } else {
            textView.setEnabled(false);
            c2997a = this.f15216d.f15151g;
        }
        if (this.f15218f == null || i10 == -1) {
            c2997a.m8739b(textView);
            return;
        }
        int i11 = this.f15213a.f15132c;
        c2997a.m8739b(textView);
        textView.setCompoundDrawables(null, null, null, null);
        textView.setContentDescription(str);
    }

    /* JADX INFO: renamed from: e */
    public final void m8751e(MaterialCalendarGridView materialCalendarGridView, long j10) {
        Month monthM8736l = Month.m8736l(j10);
        Month month = this.f15213a;
        if (monthM8736l.equals(month)) {
            Calendar calendarM8754c = C3024z.m8754c(month.f15130a);
            calendarM8754c.setTimeInMillis(j10);
            int i10 = calendarM8754c.get(5);
            m8750d((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.getAdapter().m8748b() + (i10 - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j10, i10);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f15212h;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10 / this.f15213a.f15133d;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0083  */
    /* JADX WARN: Code duplicated, block: B:19:0x0085  */
    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        int i11;
        Long item;
        Context context = viewGroup.getContext();
        if (this.f15216d == null) {
            this.f15216d = new C2999b(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iM8748b = i10 - m8748b();
        if (iM8748b >= 0) {
            Month month = this.f15213a;
            if (iM8748b < month.f15134e) {
                i11 = iM8748b + 1;
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i11)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
            item = getItem(i10);
            if (item == null) {
                m8750d(textView, item.longValue(), i11);
            }
            return textView;
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        i11 = -1;
        item = getItem(i10);
        if (item == null) {
            m8750d(textView, item.longValue(), i11);
        }
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
