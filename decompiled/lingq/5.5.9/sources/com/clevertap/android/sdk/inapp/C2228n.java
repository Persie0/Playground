package com.clevertap.android.sdk.inapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.linguist.R;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.n */
/* JADX INFO: loaded from: classes.dex */
public class C2228n extends AbstractViewOnTouchListenerC2224j {
    @Override // com.clevertap.android.sdk.inapp.AbstractViewOnTouchListenerC2224j
    /* JADX INFO: renamed from: s0 */
    public final ViewGroup mo6530s0(View view) {
        return (ViewGroup) view.findViewById(R.id.inapp_html_footer_frame_layout);
    }

    @Override // com.clevertap.android.sdk.inapp.AbstractViewOnTouchListenerC2224j
    /* JADX INFO: renamed from: t0 */
    public final View mo6531t0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.inapp_html_footer, viewGroup, false);
    }
}
