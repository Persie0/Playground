package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* JADX INFO: renamed from: com.google.android.material.datepicker.d */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC3002d implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3018t f15158a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MaterialCalendar f15159b;

    public ViewOnClickListenerC3002d(MaterialCalendar materialCalendar, C3018t c3018t) {
        this.f15159b = materialCalendar;
        this.f15158a = c3018t;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialCalendar materialCalendar = this.f15159b;
        int iM4122S0 = ((LinearLayoutManager) materialCalendar.f15116E0.getLayoutManager()).m4122S0() - 1;
        if (iM4122S0 >= 0) {
            Calendar calendarM8754c = C3024z.m8754c(this.f15158a.f15221d.f15096a.f15130a);
            calendarM8754c.add(2, iM4122S0);
            materialCalendar.m8731n0(new Month(calendarM8754c));
        }
    }
}
