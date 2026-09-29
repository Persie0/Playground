package com.lingq.feature.reader.preferences;

import com.lingq.core.domain.store.AudioUnderlineMode;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.preferences.ReaderPreferencesStateHolder$state$2", m4291f = "ReaderPreferencesStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPreferencesStateHolder$state$2 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f29830a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ AudioUnderlineMode f29831b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ReaderPreferencesStateHolder$state$2 readerPreferencesStateHolder$state$2 = new ReaderPreferencesStateHolder$state$2(3, (Continuation) obj3);
        readerPreferencesStateHolder$state$2.f29830a = zBooleanValue;
        readerPreferencesStateHolder$state$2.f29831b = (AudioUnderlineMode) obj2;
        return readerPreferencesStateHolder$state$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.f29830a;
        AudioUnderlineMode audioUnderlineMode = this.f29831b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new Pair(Boolean.valueOf(z), audioUnderlineMode);
    }
}
