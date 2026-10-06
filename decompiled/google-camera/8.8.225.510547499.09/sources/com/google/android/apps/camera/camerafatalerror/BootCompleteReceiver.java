package com.google.android.apps.camera.camerafatalerror;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p000.aoo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class BootCompleteReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        aoo.m1773c(context).edit().putBoolean("pref_key_reboot_completed", true).apply();
    }
}
