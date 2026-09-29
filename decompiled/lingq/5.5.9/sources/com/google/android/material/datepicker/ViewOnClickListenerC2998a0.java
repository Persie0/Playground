package com.google.android.material.datepicker;

import android.view.View;
import java.util.Calendar;

/* JADX INFO: renamed from: com.google.android.material.datepicker.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC2998a0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15143a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3000b0 f15144b;

    public ViewOnClickListenerC2998a0(C3000b0 c3000b0, int i10) {
        this.f15144b = c3000b0;
        this.f15143a = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C3000b0 c3000b0 = this.f15144b;
        Month monthM8735a = Month.m8735a(this.f15143a, c3000b0.f15153d.f15112A0.f15131b);
        MaterialCalendar<?> materialCalendar = c3000b0.f15153d;
        CalendarConstraints calendarConstraints = materialCalendar.f15123y0;
        Month month = calendarConstraints.f15096a;
        Calendar calendar = month.f15130a;
        Calendar calendar2 = monthM8735a.f15130a;
        if (calendar2.compareTo(calendar) < 0) {
            monthM8735a = month;
        } else {
            Month month2 = calendarConstraints.f15097b;
            if (calendar2.compareTo(month2.f15130a) > 0) {
                monthM8735a = month2;
            }
        }
        materialCalendar.m8731n0(monthM8735a);
        materialCalendar.m8732o0(MaterialCalendar.CalendarSelector.DAY);
    }
}
