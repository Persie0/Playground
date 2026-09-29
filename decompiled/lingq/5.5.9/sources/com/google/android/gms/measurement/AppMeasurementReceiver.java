package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import cc.C1798d4;
import cc.C1860k3;
import cc.C1897o4;
import cc.InterfaceC1789c4;
import p390t3.AbstractC9193a;

/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementReceiver extends AbstractC9193a implements InterfaceC1789c4 {

    /* JADX INFO: renamed from: c */
    public C1798d4 f14597c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f14597c == null) {
            this.f14597c = new C1798d4(this);
        }
        C1798d4 c1798d4 = this.f14597c;
        c1798d4.getClass();
        C1860k3 c1860k3 = C1897o4.m5777s(context, null, null).f10086i;
        C1897o4.m5776k(c1860k3);
        if (intent == null) {
            c1860k3.f9945i.m5623a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        c1860k3.f9938I.m5624b(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                c1860k3.f9945i.m5623a("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        c1860k3.f9938I.m5623a("Starting wakeful intent.");
        ((AppMeasurementReceiver) c1798d4.f9757a).getClass();
        SparseArray<PowerManager.WakeLock> sparseArray = AbstractC9193a.f47732a;
        synchronized (sparseArray) {
            int i10 = AbstractC9193a.f47733b;
            int i11 = i10 + 1;
            AbstractC9193a.f47733b = i11;
            if (i11 <= 0) {
                AbstractC9193a.f47733b = 1;
            }
            className.putExtra("androidx.contentpager.content.wakelockid", i10);
            ComponentName componentNameStartService = context.startService(className);
            if (componentNameStartService == null) {
                return;
            }
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
            wakeLockNewWakeLock.setReferenceCounted(false);
            wakeLockNewWakeLock.acquire(60000L);
            sparseArray.put(i10, wakeLockNewWakeLock);
        }
    }
}
