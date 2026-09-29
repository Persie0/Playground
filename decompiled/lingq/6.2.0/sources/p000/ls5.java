package p000;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.datepicker.CalendarConstraints;

/* JADX INFO: loaded from: classes2.dex */
public final class ls5<S> extends g87 {

    /* JADX INFO: renamed from: x0 */
    public int f50075x0;

    /* JADX INFO: renamed from: y0 */
    public CalendarConstraints f50076y0;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: A */
    public final View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(mo2107i(), this.f50075x0));
        throw null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: I */
    public final void mo2082I(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f50075x0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f50076y0);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0635c
    /* JADX INFO: renamed from: z */
    public final void mo2124z(Bundle bundle) {
        super.mo2124z(bundle);
        if (bundle == null) {
            bundle = this.f5695f;
        }
        this.f50075x0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") == null) {
            this.f50076y0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        } else {
            ho2.m13383c();
        }
    }
}
