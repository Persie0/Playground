package com.google.android.material.datepicker;

import android.view.View;

/* JADX INFO: renamed from: com.google.android.material.datepicker.j */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC3008j implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MaterialCalendar f15169a;

    public ViewOnClickListenerC3008j(MaterialCalendar materialCalendar) {
        this.f15169a = materialCalendar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialCalendar materialCalendar = this.f15169a;
        MaterialCalendar.CalendarSelector calendarSelector = materialCalendar.f15113B0;
        MaterialCalendar.CalendarSelector calendarSelector2 = MaterialCalendar.CalendarSelector.YEAR;
        if (calendarSelector == calendarSelector2) {
            materialCalendar.m8732o0(MaterialCalendar.CalendarSelector.DAY);
        } else if (calendarSelector == MaterialCalendar.CalendarSelector.DAY) {
            materialCalendar.m8732o0(calendarSelector2);
        }
    }
}
