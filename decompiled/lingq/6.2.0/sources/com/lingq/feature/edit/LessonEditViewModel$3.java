package com.lingq.feature.edit;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.ada;
import p000.c32;
import p000.eh9;
import p000.un1;
import p000.ux5;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.edit.LessonEditViewModel$3", m4291f = "LessonEditViewModel.kt", m4292l = {404}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonEditViewModel$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25867a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2077c f25868b;

    /* JADX INFO: renamed from: com.lingq.feature.edit.LessonEditViewModel$3$1 */
    @c32(m4290c = "com.lingq.feature.edit.LessonEditViewModel$3$1", m4291f = "LessonEditViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20731 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f25869a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2077c f25870b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20731(C2077c c2077c, Continuation continuation) {
            super(2, continuation);
            this.f25870b = c2077c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C20731 c20731 = new C20731(this.f25870b, continuation);
            c20731.f25869a = obj;
            return c20731;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20731 c20731 = (C20731) create((ada) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20731.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            ada adaVar = (ada) this.f25869a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ux5.m22977D(adaVar.f523b, this.f25870b.f25949s, null);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonEditViewModel$3(C2077c c2077c, Continuation continuation) {
        super(2, continuation);
        this.f25868b = c2077c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonEditViewModel$3(this.f25868b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonEditViewModel$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25867a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2077c c2077c = this.f25868b;
            eh9 eh9VarMo8494u = c2077c.f25941k.mo8494u();
            C20731 c20731 = new C20731(c2077c, null);
            eh9VarMo8494u.getClass();
            this.f25867a = 1;
            if (AbstractC3224d.m15529h(eh9VarMo8494u, c20731, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17633t("SharedFlow never completes, this call should never return.");
        return null;
    }
}
