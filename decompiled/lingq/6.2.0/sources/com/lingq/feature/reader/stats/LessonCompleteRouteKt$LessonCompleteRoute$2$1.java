package com.lingq.feature.reader.stats;

import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3572sf;
import p000.C3386nv;
import p000.c32;
import p000.ub5;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteRouteKt$LessonCompleteRoute$2$1", m4291f = "LessonCompleteRoute.kt", m4292l = {116}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteRouteKt$LessonCompleteRoute$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30514a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ub5 f30515b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2535j f30516c;

    /* JADX INFO: renamed from: com.lingq.feature.reader.stats.LessonCompleteRouteKt$LessonCompleteRoute$2$1$1 */
    @c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteRouteKt$LessonCompleteRoute$2$1$1", m4291f = "LessonCompleteRoute.kt", m4292l = {117}, m4293m = "invokeSuspend", m4294v = 2)
    final class C25191 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f30517a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2535j f30518b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25191(C2535j c2535j, Continuation continuation) {
            super(2, continuation);
            this.f30518b = c2535j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C25191(this.f30518b, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C25191) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f30517a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                this.f30517a = 1;
                if (this.f30518b.f30818b.mo4597w0(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteRouteKt$LessonCompleteRoute$2$1(ub5 ub5Var, C2535j c2535j, Continuation continuation) {
        super(2, continuation);
        this.f30515b = ub5Var;
        this.f30516c = c2535j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteRouteKt$LessonCompleteRoute$2$1(this.f30515b, this.f30516c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonCompleteRouteKt$LessonCompleteRoute$2$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30514a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            AbstractC3572sf abstractC3572sfMo256K = this.f30515b.mo256K();
            Lifecycle$State lifecycle$State = Lifecycle$State.RESUMED;
            C25191 c25191 = new C25191(this.f30516c, null);
            this.f30514a = 1;
            if (AbstractC0708b.m2509b(abstractC3572sfMo256K, lifecycle$State, c25191, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
