package com.lingq.core.domain.lesson;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import p000.aj3;
import p000.c83;
import p000.d51;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.domain.lesson.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1379a {
    /* JADX INFO: renamed from: a */
    public static Object m7986a(c83 c83Var, aj3 aj3Var, Continuation continuation) {
        Object objCollect = c83Var.collect(new d51(new Ref$BooleanRef(), new CollectRemoteBookmarkChangesKt$collectRemoteBookmarkChanges$2(2, null), aj3Var, 0), (SuspendLambda) continuation);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfa.f68157a;
    }
}
