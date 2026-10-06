package com.google.android.apps.camera.keepalive;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p000.emv;
import p000.env;
import p000.gtd;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class KeepAliveBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public gtd f6757a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ((env) ((emv) context.getApplicationContext()).mo4193e(env.class)).mo7580h(this);
        if (this.f6757a.m9750p()) {
            intent.getAction();
            gtd.m9734o(context);
        }
    }
}
