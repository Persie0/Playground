package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;

/* JADX INFO: renamed from: com.google.android.material.datepicker.i */
/* JADX INFO: loaded from: classes.dex */
public final class C3007i extends RecyclerView.AbstractC1125r {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3018t f15166a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MaterialButton f15167b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MaterialCalendar f15168c;

    public C3007i(MaterialCalendar materialCalendar, C3018t c3018t, MaterialButton materialButton) {
        this.f15168c = materialCalendar;
        this.f15166a = c3018t;
        this.f15167b = materialButton;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1125r
    /* JADX INFO: renamed from: a */
    public final void mo4339a(int i10, RecyclerView recyclerView) {
        if (i10 == 0) {
            recyclerView.announceForAccessibility(this.f15167b.getText());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1125r
    /* JADX INFO: renamed from: b */
    public final void mo4340b(RecyclerView recyclerView, int i10, int i11) {
        MaterialCalendar materialCalendar = this.f15168c;
        int iM4121R0 = i10 < 0 ? ((LinearLayoutManager) materialCalendar.f15116E0.getLayoutManager()).m4121R0() : ((LinearLayoutManager) materialCalendar.f15116E0.getLayoutManager()).m4122S0();
        C3018t c3018t = this.f15166a;
        Calendar calendarM8754c = C3024z.m8754c(c3018t.f15221d.f15096a.f15130a);
        calendarM8754c.add(2, iM4121R0);
        materialCalendar.f15112A0 = new Month(calendarM8754c);
        Calendar calendarM8754c2 = C3024z.m8754c(c3018t.f15221d.f15096a.f15130a);
        calendarM8754c2.add(2, iM4121R0);
        this.f15167b.setText(new Month(calendarM8754c2).m8737q());
    }
}
