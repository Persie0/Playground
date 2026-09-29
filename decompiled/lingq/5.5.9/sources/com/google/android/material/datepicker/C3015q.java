package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.material.datepicker.q */
/* JADX INFO: loaded from: classes.dex */
public final class C3015q<S> extends AbstractC3020v<S> {

    /* JADX INFO: renamed from: w0 */
    public int f15207w0;

    /* JADX INFO: renamed from: x0 */
    public DateSelector<S> f15208x0;

    /* JADX INFO: renamed from: y0 */
    public CalendarConstraints f15209y0;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.q$a */
    public class a extends AbstractC3019u<S> {
        public a() {
        }

        @Override // com.google.android.material.datepicker.AbstractC3019u
        /* JADX INFO: renamed from: a */
        public final void mo8746a(S s10) {
            Iterator<AbstractC3019u<S>> it = C3015q.this.f15228v0.iterator();
            while (it.hasNext()) {
                it.next().mo8746a(s10);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: H */
    public final void mo3560H(Bundle bundle) {
        super.mo3560H(bundle);
        if (bundle == null) {
            bundle = this.f6101g;
        }
        this.f15207w0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f15208x0 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f15209y0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: I */
    public final View mo3561I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(mo471m(), this.f15207w0));
        DateSelector<S> dateSelector = this.f15208x0;
        new a();
        return dateSelector.m8727f0();
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: R */
    public final void mo3569R(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f15207w0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f15208x0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f15209y0);
    }
}
