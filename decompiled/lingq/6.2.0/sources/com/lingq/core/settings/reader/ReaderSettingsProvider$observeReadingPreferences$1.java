package com.lingq.core.settings.reader;

import com.lingq.core.domain.store.AudioUnderlineMode;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.dj3;
import p000.w08;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.reader.ReaderSettingsProvider$observeReadingPreferences$1", m4291f = "ReaderSettingsProvider.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderSettingsProvider$observeReadingPreferences$1 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f23038a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f23039b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f23040c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ boolean f23041d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ AudioUnderlineMode f23042e;

    public ReaderSettingsProvider$observeReadingPreferences$1(Continuation continuation) {
        super(6, continuation);
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue4 = ((Boolean) obj4).booleanValue();
        ReaderSettingsProvider$observeReadingPreferences$1 readerSettingsProvider$observeReadingPreferences$1 = new ReaderSettingsProvider$observeReadingPreferences$1((Continuation) obj6);
        readerSettingsProvider$observeReadingPreferences$1.f23038a = zBooleanValue;
        readerSettingsProvider$observeReadingPreferences$1.f23039b = zBooleanValue2;
        readerSettingsProvider$observeReadingPreferences$1.f23040c = zBooleanValue3;
        readerSettingsProvider$observeReadingPreferences$1.f23041d = zBooleanValue4;
        readerSettingsProvider$observeReadingPreferences$1.f23042e = (AudioUnderlineMode) obj5;
        return readerSettingsProvider$observeReadingPreferences$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.f23038a;
        boolean z2 = this.f23039b;
        boolean z3 = this.f23040c;
        boolean z4 = this.f23041d;
        AudioUnderlineMode audioUnderlineMode = this.f23042e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new w08(z, z2, z3, z4, audioUnderlineMode);
    }
}
