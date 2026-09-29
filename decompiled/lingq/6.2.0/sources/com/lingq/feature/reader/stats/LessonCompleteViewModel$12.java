package com.lingq.feature.reader.stats;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.C3540rl;
import p000.c32;
import p000.ph4;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$12", m4291f = "LessonCompleteViewModel.kt", m4292l = {875}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteViewModel$12 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30539a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2535j f30540b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.stats.LessonCompleteViewModel$12$3 */
    @c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$12$3", m4291f = "LessonCompleteViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C25213 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ boolean f30541a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2535j f30542b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25213(C2535j c2535j, Continuation continuation) {
            super(2, continuation);
            this.f30542b = c2535j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C25213 c25213 = new C25213(this.f30542b, continuation);
            c25213.f30541a = ((Boolean) obj).booleanValue();
            return c25213;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            C25213 c25213 = (C25213) create(bool, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c25213.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            boolean z = this.f30541a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f30542b.f30806P;
            do {
                value = c3244l.getValue();
                ((Boolean) value).getClass();
            } while (!c3244l.m15570h(value, Boolean.valueOf(z)));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$12(C2535j c2535j, Continuation continuation) {
        super(2, continuation);
        this.f30540b = c2535j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteViewModel$12(this.f30540b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonCompleteViewModel$12) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30539a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2535j c2535j = this.f30540b;
            ph4 ph4Var = new ph4(new C3540rl(new ph4(new C3540rl(c2535j.f30805O, 5), 2), 5), 3);
            C25213 c25213 = new C25213(c2535j, null);
            this.f30539a = 1;
            if (AbstractC3224d.m15529h(ph4Var, c25213, this) == coroutineSingletons) {
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
