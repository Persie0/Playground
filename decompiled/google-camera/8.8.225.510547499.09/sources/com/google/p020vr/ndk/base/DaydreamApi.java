package com.google.p020vr.ndk.base;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import android.util.Log;
import com.google.p020vr.vrcore.base.api.VrCoreUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p000.kha;
import p000.lll;
import p000.lmg;
import p000.mnp;
import p000.ofo;
import p000.oga;
import p000.ogb;
import p000.ogc;
import p000.ogd;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class DaydreamApi implements AutoCloseable {

    /* JADX INFO: renamed from: g */
    private static volatile Boolean f8448g = null;

    /* JADX INFO: renamed from: a */
    public final Context f8449a;

    /* JADX INFO: renamed from: c */
    public int f8451c;

    /* JADX INFO: renamed from: e */
    public ogd f8453e;

    /* JADX INFO: renamed from: f */
    public ogb f8454f;

    /* JADX INFO: renamed from: h */
    private boolean f8455h;

    /* JADX INFO: renamed from: b */
    public final ArrayList f8450b = new ArrayList();

    /* JADX INFO: renamed from: i */
    private final AtomicInteger f8456i = new AtomicInteger();

    /* JADX INFO: renamed from: d */
    public final ServiceConnection f8452d = new mnp(this, 2);

    protected DaydreamApi(Context context) {
        this.f8449a = context;
    }

    /* JADX INFO: renamed from: b */
    private final void m5187b(Intent intent) {
        List<ResolveInfo> listQueryIntentActivities = this.f8449a.getPackageManager().queryIntentActivities(intent, 0);
        if (listQueryIntentActivities == null || listQueryIntentActivities.isEmpty()) {
            throw new ActivityNotFoundException("No activity is available to handle intent: ".concat(intent.toString()));
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m5188c() {
        if (this.f8455h) {
            throw new IllegalStateException("DaydreamApi object is closed and can no longer be used.");
        }
    }

    public static DaydreamApi create(Context context) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("DaydreamApi must only be used from the main thread.");
        }
        if (!context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return null;
        }
        DaydreamApi daydreamApi = new DaydreamApi(context);
        try {
            int vrCoreClientApiVersion = VrCoreUtils.getVrCoreClientApiVersion(daydreamApi.f8449a);
            daydreamApi.f8451c = vrCoreClientApiVersion;
            if (vrCoreClientApiVersion < 8) {
                Log.e("DaydreamApi", "VrCore out of date, current version: " + vrCoreClientApiVersion + ", required version: 8");
            } else {
                Intent intent = new Intent("com.google.vr.vrcore.BIND_SDK_SERVICE");
                intent.setPackage("com.google.vr.vrcore");
                if ((daydreamApi.f8449a.getApplicationContext() != null ? daydreamApi.f8449a.getApplicationContext() : daydreamApi.f8449a).bindService(intent, daydreamApi.f8452d, 1)) {
                    return daydreamApi;
                }
                Log.e("DaydreamApi", "Unable to bind to VrCoreSdkService");
            }
        } catch (oga e) {
            Log.e("DaydreamApi", "VrCore not available: ".concat(e.toString()));
        }
        Log.w("DaydreamApi", "Failed to initialize DaydreamApi object.");
        return null;
    }

    public static Intent createVrIntent(ComponentName componentName) {
        Intent intent = new Intent();
        intent.setComponent(componentName);
        setupVrIntent(intent);
        return intent;
    }

    /* JADX INFO: renamed from: d */
    private final void m5189d(PendingIntent pendingIntent, ComponentName componentName) {
        m5190a(new kha(this, pendingIntent, componentName, 13));
    }

    public static Intent setupVrIntent(Intent intent) {
        intent.addCategory("com.google.intent.category.DAYDREAM");
        intent.addFlags(335609856);
        return intent;
    }

    /* JADX INFO: renamed from: a */
    protected final void m5190a(Runnable runnable) {
        if (this.f8453e != null) {
            runnable.run();
        } else {
            this.f8450b.add(runnable);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        if (this.f8455h) {
            return;
        }
        this.f8455h = true;
        m5190a(new lmg(this, 20));
    }

    public void exitFromVr(Activity activity, int i, Intent intent) {
        m5188c();
        if (intent == null) {
            intent = new Intent();
        }
        PendingIntent pendingIntentCreatePendingResult = activity.createPendingResult(i, intent, 1073741824);
        m5190a(new kha(this, new ofo(pendingIntentCreatePendingResult, 2), pendingIntentCreatePendingResult, 14));
    }

    public void launchInVr(PendingIntent pendingIntent) {
        m5188c();
        m5189d(pendingIntent, null);
    }

    public void launchInVrForResult(Activity activity, PendingIntent pendingIntent, int i) {
        m5188c();
        m5190a(new lll(this, new ogc(activity, pendingIntent, i), 10));
    }

    public void launchVrHomescreen() {
        m5188c();
        m5190a(new ofo(this, 1));
    }

    public void launchInVr(ComponentName componentName) {
        m5188c();
        if (componentName == null) {
            throw new IllegalArgumentException("Null argument 'componentName' passed to launchInVr");
        }
        Intent intentCreateVrIntent = createVrIntent(componentName);
        m5187b(intentCreateVrIntent);
        m5189d(PendingIntent.getActivity(this.f8449a, 0, intentCreateVrIntent, 1073741824), intentCreateVrIntent.getComponent());
    }

    public void launchInVr(Intent intent) {
        m5188c();
        if (intent == null) {
            throw new IllegalArgumentException("Null argument 'intent' passed to launchInVr");
        }
        m5187b(intent);
        m5189d(PendingIntent.getActivity(this.f8449a, this.f8456i.incrementAndGet(), intent, 1207959552), intent.getComponent());
    }
}
