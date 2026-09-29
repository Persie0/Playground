package com.google.firebase.crashlytics.internal.concurrency;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.dr1;
import p000.ui3;
import p000.vk9;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class CrashlyticsWorkers$Companion$checkBlockingThread$1 extends FunctionReferenceImpl implements ui3 {
    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        ((dr1) this.f47704b).getClass();
        String name = Thread.currentThread().getName();
        name.getClass();
        return Boolean.valueOf(vk9.m23380c0(name, "Firebase Blocking Thread #", false));
    }
}
