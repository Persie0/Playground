package com.lingq.feature.lessoninfo;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.e83;
import p000.m83;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.lessoninfo.LessonInfoViewModel$observeLessonPreview$1", m4291f = "LessonInfoViewModel.kt", m4292l = {327}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonInfoViewModel$observeLessonPreview$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f26375a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2132c f26376b;

    /* JADX INFO: renamed from: com.lingq.feature.lessoninfo.LessonInfoViewModel$observeLessonPreview$1$1 */
    @c32(m4290c = "com.lingq.feature.lessoninfo.LessonInfoViewModel$observeLessonPreview$1$1", m4291f = "LessonInfoViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21271 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2132c f26377a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21271(C2132c c2132c, Continuation continuation) {
            super(2, continuation);
            this.f26377a = c2132c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C21271(this.f26377a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C21271 c21271 = (C21271) create((e83) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c21271.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f26377a.f26434y;
            Boolean bool = Boolean.TRUE;
            c3244l.getClass();
            c3244l.m15572j(null, bool);
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.lessoninfo.LessonInfoViewModel$observeLessonPreview$1$2 */
    @c32(m4290c = "com.lingq.feature.lessoninfo.LessonInfoViewModel$observeLessonPreview$1$2", m4291f = "LessonInfoViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21282 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f26378a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2132c f26379b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21282(C2132c c2132c, Continuation continuation) {
            super(2, continuation);
            this.f26379b = c2132c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C21282 c21282 = new C21282(this.f26379b, continuation);
            c21282.f26378a = obj;
            return c21282;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C21282 c21282 = (C21282) create((String) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c21282.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            String str = (String) this.f26378a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2132c c2132c = this.f26379b;
            C3244l c3244l = c2132c.f26434y;
            Boolean bool = Boolean.FALSE;
            c3244l.getClass();
            c3244l.m15572j(null, bool);
            C3244l c3244l2 = c2132c.f26433x;
            if (str == null) {
                str = "";
            }
            c3244l2.getClass();
            c3244l2.m15572j(null, str);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonInfoViewModel$observeLessonPreview$1(C2132c c2132c, Continuation continuation) {
        super(1, continuation);
        this.f26376b = c2132c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LessonInfoViewModel$observeLessonPreview$1(this.f26376b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((LessonInfoViewModel$observeLessonPreview$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26375a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2132c c2132c = this.f26376b;
            m83 m83Var = new m83(c2132c.f26414e.m7987a(c2132c.f26429t.f66282a, c2132c.f26411b.mo4589b2()), new C21271(c2132c, null));
            C21282 c21282 = new C21282(c2132c, null);
            this.f26375a = 1;
            if (AbstractC3224d.m15529h(m83Var, c21282, this) == coroutineSingletons) {
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
