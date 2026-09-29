package com.lingq.core.settings.reader;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.v7b;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.reader.ReaderSettingsProvider$observeWordsPreferences$2$1", m4291f = "ReaderSettingsProvider.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderSettingsProvider$observeWordsPreferences$2$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ v7b f23066a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f23067b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ReaderSettingsProvider$observeWordsPreferences$2$1 readerSettingsProvider$observeWordsPreferences$2$1 = new ReaderSettingsProvider$observeWordsPreferences$2$1(3, (Continuation) obj3);
        readerSettingsProvider$observeWordsPreferences$2$1.f23066a = (v7b) obj;
        readerSettingsProvider$observeWordsPreferences$2$1.f23067b = zBooleanValue;
        return readerSettingsProvider$observeWordsPreferences$2$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        v7b v7bVar = this.f23066a;
        boolean z = this.f23067b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new v7b(v7bVar.f64992a, v7bVar.f64993b, v7bVar.f64994c, v7bVar.f64995d, v7bVar.f64996e, z);
    }
}
