package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.R$layout;
import java.util.Calendar;
import p000.fma;
import p000.gv5;

/* JADX INFO: renamed from: com.google.android.material.datepicker.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C1060h extends BaseAdapter {

    /* JADX INFO: renamed from: d */
    public static final int f12935d = fma.m11945c(null).getMaximum(4);

    /* JADX INFO: renamed from: e */
    public static final int f12936e = (fma.m11945c(null).getMaximum(7) + fma.m11945c(null).getMaximum(5)) - 1;

    /* JADX INFO: renamed from: a */
    public final Month f12937a;

    /* JADX INFO: renamed from: b */
    public gv5 f12938b;

    /* JADX INFO: renamed from: c */
    public final CalendarConstraints f12939c;

    public C1060h(Month month, CalendarConstraints calendarConstraints) {
        this.f12937a = month;
        this.f12939c = calendarConstraints;
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final int m6127a(int i) {
        do {
            i++;
            if (i > m6132f()) {
                return -1;
            }
        } while (!m6131e(i));
        return i;
    }

    /* JADX INFO: renamed from: b */
    public final int m6128b(int i) {
        do {
            i--;
            if (i < m6129c()) {
                return -1;
            }
        } while (!m6131e(i));
        return i;
    }

    /* JADX INFO: renamed from: c */
    public final int m6129c() {
        int firstDayOfWeek = this.f12939c.f12878e;
        Month month = this.f12937a;
        Calendar calendar = month.f12899a;
        int i = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i2 = i - firstDayOfWeek;
        return i2 < 0 ? i2 + month.f12902d : i2;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < m6129c() || i > m6132f()) {
            return null;
        }
        int iM6129c = (i - m6129c()) + 1;
        Calendar calendarM11943a = fma.m11943a(this.f12937a.f12899a);
        calendarM11943a.set(5, iM6129c);
        return Long.valueOf(calendarM11943a.getTimeInMillis());
    }

    /* JADX INFO: renamed from: e */
    public final boolean m6131e(int i) {
        Long item = getItem(i);
        if (item != null) {
            return item.longValue() >= ((DateValidatorPointForward) this.f12939c.f12876c).f12881a;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final int m6132f() {
        return (m6129c() + this.f12937a.f12903e) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f12936e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.f12937a.f12902d;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005e  */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.f12938b == null) {
            this.f12938b = new gv5(context, 11);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.mtrl_calendar_day, viewGroup, false);
        }
        int iM6129c = i - m6129c();
        if (iM6129c >= 0) {
            Month month = this.f12937a;
            if (iM6129c >= month.f12903e) {
                textView.setVisibility(8);
                textView.setEnabled(false);
            } else {
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(iM6129c + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
        }
        if (getItem(i) == null || textView == null) {
            return textView;
        }
        textView.getContext();
        fma.m11944b().getTimeInMillis();
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
