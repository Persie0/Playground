package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.C1154a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000.lda;
import p000.oxc;
import p000.q43;
import p000.qxb;
import p000.uk9;
import p000.v3c;
import p000.x43;
import p000.yvb;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: b */
    public static volatile FirebaseAnalytics f13629b;

    /* JADX INFO: renamed from: a */
    public final v3c f13630a;

    public FirebaseAnalytics(v3c v3cVar) {
        lda.m16130p(v3cVar);
        this.f13630a = v3cVar;
    }

    public static FirebaseAnalytics getInstance(Context context) {
        if (f13629b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f13629b == null) {
                        f13629b = new FirebaseAnalytics(v3c.m23084e(context, null));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13629b;
    }

    public static oxc getScionFrontendApiImplementation(Context context, Bundle bundle) {
        v3c v3cVarM23084e = v3c.m23084e(context, bundle);
        if (v3cVarM23084e == null) {
            return null;
        }
        return new yvb(v3cVarM23084e);
    }

    public String getFirebaseInstanceId() {
        try {
            Object obj = C1154a.f13703m;
            return (String) Tasks.await(((C1154a) q43.m19641c().m19645b(x43.class)).m6697c(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            uk9.m22779n(e);
            return null;
        } catch (ExecutionException e2) {
            uk9.m22779n(e2.getCause());
            return null;
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        zzdd zzddVarM5439r = zzdd.m5439r(activity);
        v3c v3cVar = this.f13630a;
        v3cVar.getClass();
        v3cVar.m23087c(new qxb(v3cVar, zzddVarM5439r, str, str2));
    }
}
