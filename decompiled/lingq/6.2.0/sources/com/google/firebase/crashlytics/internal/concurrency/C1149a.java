package com.google.firebase.crashlytics.internal.concurrency;

import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import p000.cr1;
import p000.dr1;

/* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.concurrency.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1149a {

    /* JADX INFO: renamed from: d */
    public static final dr1 f13667d = new dr1();

    /* JADX INFO: renamed from: a */
    public final cr1 f13668a;

    /* JADX INFO: renamed from: b */
    public final cr1 f13669b;

    /* JADX INFO: renamed from: c */
    public final cr1 f13670c;

    public C1149a(ExecutorService executorService, ExecutorService executorService2) {
        executorService.getClass();
        executorService2.getClass();
        this.f13668a = new cr1(executorService);
        this.f13669b = new cr1(executorService);
        Tasks.m5975c(null);
        this.f13670c = new cr1(executorService2);
    }

    /* JADX INFO: renamed from: a */
    public static final void m6679a() {
        if (((Boolean) new CrashlyticsWorkers$Companion$checkBackgroundThread$1(0, f13667d, dr1.class, "isBackgroundThread", "isBackgroundThread()Z", 0).mo0a()).booleanValue()) {
            return;
        }
        String str = "Must be called on a background thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m6680b() {
        if (((Boolean) new CrashlyticsWorkers$Companion$checkBlockingThread$1(0, f13667d, dr1.class, "isBlockingThread", "isBlockingThread()Z", 0).mo0a()).booleanValue()) {
            return;
        }
        String str = "Must be called on a blocking thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m6681c() {
        if (((Boolean) new CrashlyticsWorkers$Companion$checkNotMainThread$1(0, f13667d, dr1.class, "isNotMainThread", "isNotMainThread()Z", 0).mo0a()).booleanValue()) {
            return;
        }
        String str = "Must not be called on a main thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }
}
