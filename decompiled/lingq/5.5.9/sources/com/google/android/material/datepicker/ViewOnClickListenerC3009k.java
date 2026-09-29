package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* JADX INFO: renamed from: com.google.android.material.datepicker.k */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC3009k implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3018t f15170a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MaterialCalendar f15171b;

    public ViewOnClickListenerC3009k(MaterialCalendar materialCalendar, C3018t c3018t) {
        this.f15171b = materialCalendar;
        this.f15170a = c3018t;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MaterialCalendar materialCalendar = this.f15171b;
        int iM4121R0 = ((LinearLayoutManager) materialCalendar.f15116E0.getLayoutManager()).m4121R0() + 1;
        if (iM4121R0 < materialCalendar.f15116E0.getAdapter().mo4226e()) {
            Calendar calendarM8754c = C3024z.m8754c(this.f15170a.f15221d.f15096a.f15130a);
            calendarM8754c.add(2, iM4121R0);
            materialCalendar.m8731n0(new Month(calendarM8754c));
        }
    }
}
