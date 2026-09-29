package com.lingq.core.domain.lesson;

import com.lingq.core.domain.model.lesson.LessonBookmark;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.lesson.CollectRemoteBookmarkChangesKt$collectRemoteBookmarkChanges$2", m4291f = "CollectRemoteBookmarkChanges.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectRemoteBookmarkChangesKt$collectRemoteBookmarkChanges$2 extends SuspendLambda implements zi3 {
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CollectRemoteBookmarkChangesKt$collectRemoteBookmarkChanges$2(2, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        CollectRemoteBookmarkChangesKt$collectRemoteBookmarkChanges$2 collectRemoteBookmarkChangesKt$collectRemoteBookmarkChanges$2 = (CollectRemoteBookmarkChangesKt$collectRemoteBookmarkChanges$2) create((LessonBookmark) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        collectRemoteBookmarkChangesKt$collectRemoteBookmarkChanges$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return xfa.f68157a;
    }
}
