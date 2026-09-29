package com.google.firebase.crashlytics.internal.concurrency;

import android.os.Looper;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.dr1;
import p000.ui3;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class CrashlyticsWorkers$Companion$checkNotMainThread$1 extends FunctionReferenceImpl implements ui3 {
    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        ((dr1) this.f47704b).getClass();
        return Boolean.valueOf(!Looper.getMainLooper().isCurrentThread());
    }
}
