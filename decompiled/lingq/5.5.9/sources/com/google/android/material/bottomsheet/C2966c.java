package com.google.android.material.bottomsheet;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import p080e.C5283o;

/* JADX INFO: renamed from: com.google.android.material.bottomsheet.c */
/* JADX INFO: loaded from: classes.dex */
public class C2966c extends C5283o {
    public C2966c() {
    }

    @SuppressLint({"ValidFragment"})
    public C2966c(int i10) {
        super(i10);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l
    /* JADX INFO: renamed from: m0 */
    public final void mo3766m0() {
        Dialog dialog = this.f6328G0;
        if (dialog instanceof DialogC2965b) {
            DialogC2965b dialogC2965b = (DialogC2965b) dialog;
            if (dialogC2965b.f14892f == null) {
                dialogC2965b.m8625f();
            }
            boolean z10 = dialogC2965b.f14892f.f14826I;
        }
        m3767n0(false, false);
    }

    @Override // p080e.C5283o, androidx.fragment.app.DialogInterfaceOnCancelListenerC0962l
    /* JADX INFO: renamed from: p0 */
    public final Dialog mo3769p0(Bundle bundle) {
        return new DialogC2965b(mo471m(), mo3768o0());
    }
}
