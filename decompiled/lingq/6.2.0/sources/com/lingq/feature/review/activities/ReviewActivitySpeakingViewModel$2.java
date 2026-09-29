package com.lingq.feature.review.activities;

import com.lingq.core.datastore.C1370c;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.activities.ReviewActivitySpeakingViewModel$2", m4291f = "ReviewActivitySpeakingViewModel.kt", m4292l = {99}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewActivitySpeakingViewModel$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f32174a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2748c f32175b;

    /* JADX INFO: renamed from: com.lingq.feature.review.activities.ReviewActivitySpeakingViewModel$2$1 */
    @c32(m4290c = "com.lingq.feature.review.activities.ReviewActivitySpeakingViewModel$2$1", m4291f = "ReviewActivitySpeakingViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C27131 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f32176a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2748c f32177b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27131(C2748c c2748c, Continuation continuation) {
            super(2, continuation);
            this.f32177b = c2748c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C27131 c27131 = new C27131(this.f32177b, continuation);
            c27131.f32176a = obj;
            return c27131;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C27131 c27131 = (C27131) create((Map) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c27131.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            Boolean bool;
            Map map = (Map) this.f32176a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f32177b.f32345r;
            do {
                value = c3244l.getValue();
                ((Boolean) value).getClass();
                bool = (Boolean) map.get("Speaking");
            } while (!c3244l.m15570h(value, Boolean.valueOf(bool != null ? bool.booleanValue() : false)));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivitySpeakingViewModel$2(C2748c c2748c, Continuation continuation) {
        super(2, continuation);
        this.f32175b = c2748c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewActivitySpeakingViewModel$2(this.f32175b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewActivitySpeakingViewModel$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f32174a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2748c c2748c = this.f32175b;
            c83 c83Var = ((C1370c) c2748c.f32336i).f18552s0;
            C27131 c27131 = new C27131(c2748c, null);
            this.f32174a = 1;
            if (AbstractC3224d.m15529h(c83Var, c27131, this) == coroutineSingletons) {
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
