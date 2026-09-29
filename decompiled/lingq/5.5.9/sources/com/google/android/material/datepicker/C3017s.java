package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.material.datepicker.s */
/* JADX INFO: loaded from: classes.dex */
public final class C3017s implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MaterialCalendarGridView f15219a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3018t f15220b;

    public C3017s(C3018t c3018t, MaterialCalendarGridView materialCalendarGridView) {
        this.f15220b = c3018t;
        this.f15219a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        MaterialCalendarGridView materialCalendarGridView = this.f15219a;
        C3016r adapter = materialCalendarGridView.getAdapter();
        if (i10 >= adapter.m8748b() && i10 <= (adapter.m8748b() + adapter.f15213a.f15134e) + (-1)) {
            MaterialCalendar.InterfaceC2995d interfaceC2995d = this.f15220b.f15224g;
            long jLongValue = materialCalendarGridView.getAdapter().getItem(i10).longValue();
            MaterialCalendar materialCalendar = MaterialCalendar.this;
            if (materialCalendar.f15123y0.f15098c.mo8719Y(jLongValue)) {
                materialCalendar.f15122x0.m8728t();
                Iterator it = materialCalendar.f15228v0.iterator();
                while (it.hasNext()) {
                    ((AbstractC3019u) it.next()).mo8746a(materialCalendar.f15122x0.m8725e0());
                }
                materialCalendar.f15116E0.getAdapter().f7040a.m4259b();
                RecyclerView recyclerView = materialCalendar.f15115D0;
                if (recyclerView != null) {
                    recyclerView.getAdapter().f7040a.m4259b();
                }
            }
        }
    }
}
