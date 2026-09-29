package com.lingq.feature.reader.preferences;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.dj3;
import p000.ly7;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.preferences.ReaderPreferencesStateHolder$state$1", m4291f = "ReaderPreferencesStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPreferencesStateHolder$state$1 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f29825a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ float f29826b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ float f29827c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean f29828d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ boolean f29829e;

    public ReaderPreferencesStateHolder$state$1(Continuation continuation) {
        super(6, continuation);
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        float fFloatValue = ((Number) obj2).floatValue();
        float fFloatValue2 = ((Number) obj3).floatValue();
        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj5).booleanValue();
        ReaderPreferencesStateHolder$state$1 readerPreferencesStateHolder$state$1 = new ReaderPreferencesStateHolder$state$1((Continuation) obj6);
        readerPreferencesStateHolder$state$1.f29825a = zBooleanValue;
        readerPreferencesStateHolder$state$1.f29826b = fFloatValue;
        readerPreferencesStateHolder$state$1.f29827c = fFloatValue2;
        readerPreferencesStateHolder$state$1.f29828d = zBooleanValue2;
        readerPreferencesStateHolder$state$1.f29829e = zBooleanValue3;
        return readerPreferencesStateHolder$state$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.f29825a;
        float f = this.f29826b;
        float f2 = this.f29827c;
        boolean z2 = this.f29828d;
        boolean z3 = this.f29829e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new ly7(z, f, f2, z2, z3, null, 224);
    }
}
