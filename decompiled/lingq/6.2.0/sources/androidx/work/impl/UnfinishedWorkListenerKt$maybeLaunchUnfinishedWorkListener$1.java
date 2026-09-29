package androidx.work.impl;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.bj3;
import p000.c32;
import p000.oj5;
import p000.tfa;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1", m4291f = "UnfinishedWorkListener.kt", m4292l = {59}, m4293m = "invokeSuspend")
final class UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public int f7173a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Throwable f7174b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ long f7175c;

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1 unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1 = new UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1(4, (Continuation) obj4);
        unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1.f7174b = (Throwable) obj2;
        unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1.f7175c = jLongValue;
        return unfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f7173a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            Throwable th = this.f7174b;
            long j = this.f7175c;
            oj5.m18040f().m18044e(tfa.f62235a, "Cannot check for unfinished work", th);
            long jMin = Math.min(j * 30000, tfa.f62236b);
            this.f7173a = 1;
            if (AbstractC3208a.m15437d(jMin, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return Boolean.TRUE;
    }
}
