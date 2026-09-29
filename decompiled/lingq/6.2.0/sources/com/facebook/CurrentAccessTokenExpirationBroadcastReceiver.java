package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p000.sy2;
import p000.w41;

/* JADX INFO: loaded from: classes2.dex */
public final class CurrentAccessTokenExpirationBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        if ("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED".equals(intent.getAction()) && sy2.f61601q.get()) {
            w41 w41VarM22270m = w41.f66361h.m22270m();
            AccessToken accessToken = (AccessToken) w41VarM22270m.f66367c;
            w41VarM22270m.m23712F(accessToken, accessToken);
        }
    }
}
