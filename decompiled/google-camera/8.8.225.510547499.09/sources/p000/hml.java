package p000;

import android.R;
import android.content.Context;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hml implements gfd {

    /* JADX INFO: renamed from: a */
    public final Context f28329a;

    /* JADX INFO: renamed from: b */
    public final mrm f28330b;

    /* JADX INFO: renamed from: c */
    public final dhv f28331c;

    /* JADX INFO: renamed from: d */
    private final hah f28332d;

    public hml(Context context, hah hahVar, mrm mrmVar, dhv dhvVar) {
        this.f28329a = context;
        this.f28332d = hahVar;
        this.f28330b = mrmVar;
        this.f28331c = dhvVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m10460a() {
        boolean zBooleanValue = ((Boolean) this.f28332d.mo10031c(gzy.f27010V)).booleanValue();
        if (zBooleanValue) {
            mhs mhsVar = new mhs(this.f28329a, C0100R.style.Theme_Camera_MaterialAlertDialog);
            mhsVar.m16392t(this.f28329a.getString(C0100R.string.turn_off_lsm_dialog_title));
            mhsVar.m16385m(this.f28329a.getString(C0100R.string.turn_off_lsm_dialog_message));
            mhsVar.m16390r(this.f28329a.getString(C0100R.string.view_in_settings_button), new cdo(this, 15));
            mhsVar.m16387o(this.f28329a.getString(R.string.cancel), null);
            mhsVar.m7257c();
        }
        return zBooleanValue;
    }

    @Override // p000.gfd
    /* JADX INFO: renamed from: u */
    public final boolean mo5833u(gev gevVar, gfc gfcVar, boolean z) {
        return !z && m10460a();
    }
}
