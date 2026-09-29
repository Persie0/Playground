package com.lingq.feature.reader.video;

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
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$textState$2", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderVideoComposeViewModel$textState$2 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ AudioUnderlineMode f31312a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f31313b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ReaderVideoComposeViewModel$textState$2 readerVideoComposeViewModel$textState$2 = new ReaderVideoComposeViewModel$textState$2(3, (Continuation) obj3);
        readerVideoComposeViewModel$textState$2.f31312a = (AudioUnderlineMode) obj;
        readerVideoComposeViewModel$textState$2.f31313b = zBooleanValue;
        return readerVideoComposeViewModel$textState$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AudioUnderlineMode audioUnderlineMode = this.f31312a;
        boolean z = this.f31313b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new Pair(audioUnderlineMode, Boolean.valueOf(z));
    }
}
