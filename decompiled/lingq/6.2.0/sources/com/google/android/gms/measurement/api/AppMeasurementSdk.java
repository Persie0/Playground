package com.google.android.gms.measurement.api;

import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import p000.InterfaceC3434os;
import p000.dxb;
import p000.kzb;
import p000.ptb;
import p000.v3c;
import p000.w2c;
import p000.xxb;
import p000.yyb;

/* JADX INFO: loaded from: classes.dex */
public class AppMeasurementSdk {

    /* JADX INFO: renamed from: a */
    public final v3c f12311a;

    public AppMeasurementSdk(v3c v3cVar) {
        this.f12311a = v3cVar;
    }

    public static AppMeasurementSdk getInstance(Context context) {
        return v3c.m23084e(context, null).f64807b;
    }

    /* JADX INFO: renamed from: a */
    public final void m5845a(InterfaceC3434os interfaceC3434os) {
        v3c v3cVar = this.f12311a;
        ArrayList arrayList = v3cVar.f64808c;
        synchronized (arrayList) {
            for (int i = 0; i < arrayList.size(); i++) {
                try {
                    if (interfaceC3434os.equals(((Pair) arrayList.get(i)).first)) {
                        Log.w("FA", "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            w2c w2cVar = new w2c(interfaceC3434os);
            arrayList.add(new Pair(interfaceC3434os, w2cVar));
            if (v3cVar.f64811f != null) {
                try {
                    v3cVar.f64811f.registerOnMeasurementEventListener(w2cVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w("FA", "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            v3cVar.m23087c(new xxb(v3cVar, w2cVar));
        }
    }

    public void beginAdUnitExposure(String str) {
        v3c v3cVar = this.f12311a;
        v3cVar.m23087c(new yyb(v3cVar, str, 0));
    }

    public void endAdUnitExposure(String str) {
        v3c v3cVar = this.f12311a;
        v3cVar.m23087c(new yyb(v3cVar, str, 1));
    }

    public long generateEventId() {
        return this.f12311a.m23090g();
    }

    public String getAppInstanceId() {
        ptb ptbVar = new ptb();
        v3c v3cVar = this.f12311a;
        v3cVar.m23087c(new kzb(v3cVar, ptbVar, 1));
        return (String) ptb.m19477H(ptbVar.m19478G(50L), String.class);
    }

    public String getGmpAppId() {
        ptb ptbVar = new ptb();
        v3c v3cVar = this.f12311a;
        v3cVar.m23087c(new kzb(v3cVar, ptbVar, 0));
        return (String) ptb.m19477H(ptbVar.m19478G(500L), String.class);
    }

    public void logEvent(String str, String str2, Bundle bundle) {
        v3c v3cVar = this.f12311a;
        v3cVar.m23087c(new dxb(v3cVar, str, str2, bundle, true));
    }
}
