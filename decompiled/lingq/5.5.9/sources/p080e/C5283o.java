package p080e;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l;

/* JADX INFO: renamed from: e.o */
/* JADX INFO: loaded from: classes.dex */
public class C5283o extends DialogInterfaceOnCancelListenerC0962l {
    public C5283o() {
    }

    public C5283o(int i10) {
        super(i10);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l
    /* JADX INFO: renamed from: p0 */
    public Dialog mo3769p0(Bundle bundle) {
        return new DialogC5282n(mo471m(), mo3768o0());
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l
    /* JADX INFO: renamed from: r0 */
    public final void mo3771r0(Dialog dialog, int i10) {
        if (!(dialog instanceof DialogC5282n)) {
            super.mo3771r0(dialog, i10);
            return;
        }
        DialogC5282n dialogC5282n = (DialogC5282n) dialog;
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        dialogC5282n.m11394d().mo11344t(1);
    }
}
