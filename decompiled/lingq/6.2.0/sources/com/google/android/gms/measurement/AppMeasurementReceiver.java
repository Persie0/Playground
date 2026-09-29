package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import p000.g2b;
import p000.kjc;
import p000.nha;
import p000.xcc;

/* JADX INFO: loaded from: classes2.dex */
public final class AppMeasurementReceiver extends g2b {

    /* JADX INFO: renamed from: c */
    public nha f12309c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f12309c == null) {
            this.f12309c = new nha(this);
        }
        nha nhaVar = this.f12309c;
        nhaVar.getClass();
        xcc xccVar = kjc.m15281r(context, null, null, null).f47438f;
        kjc.m15280l(xccVar);
        if (intent == null) {
            xccVar.f68083i.m17923a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        xccVar.f68076I.m17924b(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                xccVar.f68083i.m17923a("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        xccVar.f68076I.m17923a("Starting wakeful intent.");
        ((AppMeasurementReceiver) nhaVar.f52742a).getClass();
        SparseArray sparseArray = g2b.f40084a;
        synchronized (sparseArray) {
            try {
                int i = g2b.f40085b;
                int i2 = i + 1;
                g2b.f40085b = i2;
                if (i2 <= 0) {
                    g2b.f40085b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i);
                ComponentName componentNameStartService = context.startService(className);
                if (componentNameStartService == null) {
                    return;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(60000L);
                sparseArray.put(i, wakeLockNewWakeLock);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
