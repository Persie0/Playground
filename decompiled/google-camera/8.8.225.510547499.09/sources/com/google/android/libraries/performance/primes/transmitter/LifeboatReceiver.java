package com.google.android.libraries.performance.primes.transmitter;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import p000.kxk;
import p000.lmg;
import p000.loe;
import p000.lof;
import p000.not;
import p000.nps;
import p000.nxf;
import p000.nxq;
import p000.nyb;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class LifeboatReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.hasExtra("MetricSnapshot") && intent.hasExtra("Transmitters")) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("MetricSnapshot");
            byteArrayExtra.getClass();
            try {
                nxq nxqVarM18123Q = nxq.m18123Q(loe.f38797c, byteArrayExtra, 0, byteArrayExtra.length, nxf.m18011a());
                nxq.m18132ae(nxqVarM18123Q);
                loe loeVar = (loe) nxqVarM18123Q;
                BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
                String[] stringArrayExtra = intent.getStringArrayExtra("Transmitters");
                stringArrayExtra.getClass();
                ArrayList arrayList = new ArrayList(stringArrayExtra.length);
                for (String str : stringArrayExtra) {
                    try {
                        Constructor<?> declaredConstructor = Class.forName(str).getDeclaredConstructor(new Class[0]);
                        declaredConstructor.setAccessible(true);
                        arrayList.add(((lof) declaredConstructor.newInstance(new Object[0])).mo4717a(context, loeVar));
                    } catch (Throwable th) {
                        Log.e("PrimesLifeboatReceiver", String.format("Unable to transmit the crash using %s.", str), th);
                    }
                }
                nps npsVarM14971Q = kxk.m14971Q(arrayList);
                pendingResultGoAsync.getClass();
                npsVarM14971Q.mo2282d(new lmg(pendingResultGoAsync, 4), not.INSTANCE);
            } catch (nyb e) {
                Log.e("PrimesLifeboatReceiver", "Unable to parse the payload of MetricSnapshot.", e);
            }
        }
    }
}
