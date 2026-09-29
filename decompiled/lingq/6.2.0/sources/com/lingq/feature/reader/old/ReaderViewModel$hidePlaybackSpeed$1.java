package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.lesson.Lesson;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$hidePlaybackSpeed$1", m4291f = "ReaderViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$hidePlaybackSpeed$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f28973a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Lesson f28974b;

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ReaderViewModel$hidePlaybackSpeed$1 readerViewModel$hidePlaybackSpeed$1 = new ReaderViewModel$hidePlaybackSpeed$1(3, (Continuation) obj3);
        readerViewModel$hidePlaybackSpeed$1.f28973a = zBooleanValue;
        readerViewModel$hidePlaybackSpeed$1.f28974b = (Lesson) obj2;
        return readerViewModel$hidePlaybackSpeed$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z = this.f28973a;
        Lesson lesson = this.f28974b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return Boolean.valueOf(z && lesson.f19147f == null && lesson.f19162u != null);
    }
}
