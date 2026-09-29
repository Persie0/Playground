package com.google.firebase.analytics;

import ae.C0065e;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import be.C1378a;
import cc.InterfaceC1943t5;
import com.google.android.gms.internal.measurement.C2626d1;
import com.google.android.gms.internal.measurement.C2870v1;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.C3219a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p073df.InterfaceC5162d;
import p176ib.C6272i;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* JADX INFO: renamed from: b */
    public static volatile FirebaseAnalytics f16184b;

    /* JADX INFO: renamed from: a */
    public final C2870v1 f16185a;

    public FirebaseAnalytics(C2870v1 c2870v1) {
        C6272i.m12915i(c2870v1);
        this.f16185a = c2870v1;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f16184b == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f16184b == null) {
                    f16184b = new FirebaseAnalytics(C2870v1.m8298c(context, null));
                }
            }
        }
        return f16184b;
    }

    @Keep
    public static InterfaceC1943t5 getScionFrontendApiImplementation(Context context, Bundle bundle) {
        C2870v1 c2870v1M8298c = C2870v1.m8298c(context, bundle);
        if (c2870v1M8298c == null) {
            return null;
        }
        return new C1378a(c2870v1M8298c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj = C3219a.f16252m;
            C0065e c0065eM434b = C0065e.m434b();
            c0065eM434b.m437a();
            return (String) Tasks.await(((C3219a) c0065eM434b.f174d.mo11748a(InterfaceC5162d.class)).getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        C2870v1 c2870v1 = this.f16185a;
        c2870v1.getClass();
        c2870v1.m8300b(new C2626d1(c2870v1, activity, str, str2));
    }
}
