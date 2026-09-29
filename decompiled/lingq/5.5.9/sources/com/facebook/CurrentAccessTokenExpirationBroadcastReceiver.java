package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dm.C5207g;
import kotlin.Metadata;
import p291o7.C7995e;
import p291o7.C8004n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/facebook/CurrentAccessTokenExpirationBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "facebook-core_release"}, m13366k = 1, m13367mv = {1, 5, 1})
public final class CurrentAccessTokenExpirationBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C5207g.m11111f(context, "context");
        C5207g.m11111f(intent, "intent");
        if (C5207g.m11106a("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED", intent.getAction()) && C8004n.m15878h()) {
            C7995e c7995eM15863a = C7995e.f43517f.m15863a();
            AccessToken accessToken = c7995eM15863a.f43521c;
            c7995eM15863a.m15861b(accessToken, accessToken);
        }
    }
}
