package com.clevertap.android.sdk.inapp;

import android.R;
import android.app.Dialog;
import android.content.Context;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC2208a0 extends Dialog {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2240z f11168a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC2208a0(C2240z c2240z, Context context) {
        super(context, R.style.Theme.Black.NoTitleBar.Fullscreen);
        this.f11168a = c2240z;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        C2240z c2240z = this.f11168a;
        if (c2240z.f11242D0) {
            c2240z.m6536B0();
        }
        super.onBackPressed();
    }
}
