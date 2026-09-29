package com.lingq.core.settings.reader;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.gx8;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.reader.ReaderSettingsProvider$observeSentenceModePreferences$1", m4291f = "ReaderSettingsProvider.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderSettingsProvider$observeSentenceModePreferences$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f23043a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f23044b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        ReaderSettingsProvider$observeSentenceModePreferences$1 readerSettingsProvider$observeSentenceModePreferences$1 = new ReaderSettingsProvider$observeSentenceModePreferences$1(3, (Continuation) obj3);
        readerSettingsProvider$observeSentenceModePreferences$1.f23043a = zBooleanValue;
        readerSettingsProvider$observeSentenceModePreferences$1.f23044b = zBooleanValue2;
        return readerSettingsProvider$observeSentenceModePreferences$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.f23043a;
        boolean z2 = this.f23044b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new gx8(z, z2);
    }
}
