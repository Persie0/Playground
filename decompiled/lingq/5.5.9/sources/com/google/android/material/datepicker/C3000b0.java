package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.recyclerview.widget.RecyclerView;
import com.linguist.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.material.datepicker.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3000b0 extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: d */
    public final MaterialCalendar<?> f15153d;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.b0$a */
    public static class a extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: u */
        public final TextView f15154u;

        public a(TextView textView) {
            super(textView);
            this.f15154u = textView;
        }
    }

    public C3000b0(MaterialCalendar<?> materialCalendar) {
        this.f15153d = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e */
    public final int mo4226e() {
        return this.f15153d.f15123y0.f15101f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        MaterialCalendar<?> materialCalendar = this.f15153d;
        int i11 = materialCalendar.f15123y0.f15096a.f15132c + i10;
        String str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i11));
        TextView textView = ((a) abstractC1109b0).f15154u;
        textView.setText(str);
        Context context = textView.getContext();
        textView.setContentDescription(C3024z.m8755d().get(1) == i11 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i11)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i11)));
        C2999b c2999b = materialCalendar.f15114C0;
        Calendar calendarM8755d = C3024z.m8755d();
        C2997a c2997a = calendarM8755d.get(1) == i11 ? c2999b.f15150f : c2999b.f15148d;
        Iterator<Long> it = materialCalendar.f15122x0.m8724d0().iterator();
        while (true) {
            while (true) {
                if (!it.hasNext()) {
                    c2997a.m8739b(textView);
                    textView.setOnClickListener(new ViewOnClickListenerC2998a0(this, i11));
                    return;
                } else {
                    calendarM8755d.setTimeInMillis(it.next().longValue());
                    if (calendarM8755d.get(1) == i11) {
                        c2997a = c2999b.f15149e;
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        return new a((TextView) C0204c.m849h(recyclerView, R.layout.mtrl_calendar_year, recyclerView, false));
    }
}
