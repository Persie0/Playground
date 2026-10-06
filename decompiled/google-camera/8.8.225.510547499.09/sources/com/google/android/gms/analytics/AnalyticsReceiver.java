package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p000.ihk;
import p000.ith;
import p000.izv;
import p000.jah;
import p000.jar;
import p000.jav;
import p000.jis;
import p000.jmt;
import p000.jpd;
import p000.jpe;
import p000.luc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class AnalyticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    private jav f7555a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f7555a == null) {
            this.f7555a = new jav();
        }
        izv izvVarM11947c = izv.m11947c(context);
        jar jarVarM11951d = izvVarM11947c.m11951d();
        if (intent == null) {
            jarVarM11951d.m11939t("AnalyticsReceiver called with null intent");
            return;
        }
        String action = intent.getAction();
        jah jahVar = izvVarM11947c.f32730c;
        jarVarM11951d.m11937r("Local AnalyticsReceiver got", action);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            boolean zM11327B = ihk.m11327B(context);
            Intent intent2 = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            intent2.setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"));
            intent2.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            synchronized (jav.f33628a) {
                context.startService(intent2);
                if (zM11327B) {
                    try {
                        if (jav.f33629b == null) {
                            jav.f33629b = new jpe(context);
                            jpe jpeVar = jav.f33629b;
                            synchronized (jpeVar.f34534b) {
                                jpeVar.f34539g = false;
                            }
                        }
                        jpe jpeVar2 = jav.f33629b;
                        jpeVar2.f34545m.incrementAndGet();
                        String str = jpeVar2.f34543k;
                        jpd jpdVar = jpe.f34531p;
                        long jMin = Math.min(1000L, Math.max(Math.min(Long.MAX_VALUE, jpe.f34530a), 1L));
                        synchronized (jpeVar2.f34534b) {
                            if (!jpeVar2.m13443b()) {
                                jpd jpdVar2 = jpe.f34531p;
                                jpd jpdVar3 = jpe.f34531p;
                                jpeVar2.f34541i = jmt.f34376a;
                                jpeVar2.f34535c.acquire();
                                jis jisVar = jpeVar2.f34547o;
                                SystemClock.elapsedRealtime();
                            }
                            jpeVar2.f34536d++;
                            jpeVar2.f34540h++;
                            jpeVar2.m13444c();
                            luc lucVar = (luc) jpeVar2.f34544l.get(null);
                            if (lucVar == null) {
                                lucVar = new luc();
                                jpeVar2.f34544l.put(null, lucVar);
                            }
                            jpd jpdVar4 = jpe.f34531p;
                            String str2 = jpeVar2.f34542j;
                            lucVar.f39211a++;
                            jis jisVar2 = jpeVar2.f34547o;
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            long j = Long.MAX_VALUE - jElapsedRealtime > jMin ? jElapsedRealtime + jMin : Long.MAX_VALUE;
                            if (j > jpeVar2.f34538f) {
                                jpeVar2.f34538f = j;
                                Future future = jpeVar2.f34537e;
                                if (future != null) {
                                    future.cancel(false);
                                }
                                jpeVar2.f34537e = jpeVar2.f34546n.schedule(new ith(jpeVar2, 17), jMin, TimeUnit.MILLISECONDS);
                            }
                        }
                    } catch (SecurityException e) {
                        jarVarM11951d.m11939t("Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.");
                    }
                }
            }
        }
    }
}
