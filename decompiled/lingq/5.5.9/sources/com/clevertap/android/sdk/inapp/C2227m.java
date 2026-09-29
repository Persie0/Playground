package com.clevertap.android.sdk.inapp;

import android.widget.RelativeLayout;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.m */
/* JADX INFO: loaded from: classes.dex */
public class C2227m extends AbstractC2217f {
    @Override // com.clevertap.android.sdk.inapp.AbstractC2217f
    /* JADX INFO: renamed from: A0 */
    public final RelativeLayout.LayoutParams mo6527A0() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(11, this.f11198D0.getId());
        layoutParams.addRule(10, this.f11198D0.getId());
        int iM6517r0 = m6517r0(40) / 4;
        layoutParams.setMargins(0, iM6517r0, iM6517r0, 0);
        return layoutParams;
    }
}
