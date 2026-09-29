package p000;

import android.app.Dialog;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public class sg0 extends C0820bq {
    @Override // p000.be2
    /* JADX INFO: renamed from: c0 */
    public final void mo3657c0() {
        Dialog dialog = this.f8417H0;
        if (dialog instanceof rg0) {
            boolean z = ((rg0) dialog).m20655i().f12693J;
        }
        m3659e0(false, false);
    }

    @Override // p000.C0820bq, p000.be2
    /* JADX INFO: renamed from: h0 */
    public Dialog mo3662h0(Bundle bundle) {
        return new rg0(mo2107i(), mo3661g0());
    }
}
