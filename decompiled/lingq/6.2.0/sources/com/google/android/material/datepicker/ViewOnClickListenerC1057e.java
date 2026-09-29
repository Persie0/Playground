package com.google.android.material.datepicker;

import android.view.View;

/* JADX INFO: renamed from: com.google.android.material.datepicker.e */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnClickListenerC1057e implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MaterialCalendar f12910a;

    public ViewOnClickListenerC1057e(MaterialCalendar materialCalendar) {
        this.f12910a = materialCalendar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialCalendar materialCalendar = this.f12910a;
        MaterialCalendar.CalendarSelector calendarSelector = materialCalendar.f12882A0;
        MaterialCalendar.CalendarSelector calendarSelector2 = MaterialCalendar.CalendarSelector.YEAR;
        if (calendarSelector == calendarSelector2) {
            materialCalendar.m6110f0(MaterialCalendar.CalendarSelector.DAY);
        } else if (calendarSelector == MaterialCalendar.CalendarSelector.DAY) {
            materialCalendar.m6110f0(calendarSelector2);
        }
        materialCalendar.m6111g0(materialCalendar.f5692d0);
    }
}
