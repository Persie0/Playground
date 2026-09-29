package com.google.android.material.datepicker;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Iterator;
import p446w2.C9805c;

/* JADX INFO: renamed from: com.google.android.material.datepicker.g */
/* JADX INFO: loaded from: classes.dex */
public final class C3005g extends RecyclerView.AbstractC1119l {

    /* JADX INFO: renamed from: a */
    public final Calendar f15162a = C3024z.m8756e(null);

    /* JADX INFO: renamed from: b */
    public final Calendar f15163b = C3024z.m8756e(null);

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MaterialCalendar f15164c;

    public C3005g(MaterialCalendar materialCalendar) {
        this.f15164c = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1119l
    /* JADX INFO: renamed from: g */
    public final void mo4283g(Canvas canvas, RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof C3000b0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            Iterator<C9805c<Long, Long>> it = this.f15164c.f15122x0.m8720D().iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
        }
    }
}
