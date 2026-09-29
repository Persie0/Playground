package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.linguist.R;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.material.datepicker.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3001c extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public final Calendar f15155a;

    /* JADX INFO: renamed from: b */
    public final int f15156b;

    /* JADX INFO: renamed from: c */
    public final int f15157c;

    public C3001c() {
        Calendar calendarM8756e = C3024z.m8756e(null);
        this.f15155a = calendarM8756e;
        this.f15156b = calendarM8756e.getMaximum(7);
        this.f15157c = calendarM8756e.getFirstDayOfWeek();
    }

    public C3001c(int i10) {
        Calendar calendarM8756e = C3024z.m8756e(null);
        this.f15155a = calendarM8756e;
        this.f15156b = calendarM8756e.getMaximum(7);
        this.f15157c = i10;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f15156b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        int i11 = this.f15156b;
        if (i10 >= i11) {
            return null;
        }
        int i12 = i10 + this.f15157c;
        if (i12 > i11) {
            i12 -= i11;
        }
        return Integer.valueOf(i12);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i11 = i10 + this.f15157c;
        int i12 = this.f15156b;
        if (i11 > i12) {
            i11 -= i12;
        }
        Calendar calendar = this.f15155a;
        calendar.set(7, i11);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
