package p000;

import android.app.Dialog;
import android.os.Bundle;

/* JADX INFO: renamed from: bq */
/* JADX INFO: loaded from: classes2.dex */
public class C0820bq extends be2 {
    @Override // p000.be2
    /* JADX INFO: renamed from: h0 */
    public Dialog mo3662h0(Bundle bundle) {
        return new DialogC0782aq(mo2107i(), mo3661g0());
    }

    @Override // p000.be2
    /* JADX INFO: renamed from: j0 */
    public final void mo3664j0(Dialog dialog, int i) {
        if (!(dialog instanceof DialogC0782aq)) {
            super.mo3664j0(dialog, i);
            return;
        }
        DialogC0782aq dialogC0782aq = (DialogC0782aq) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        dialogC0782aq.m2975f().mo16970g(1);
    }
}
