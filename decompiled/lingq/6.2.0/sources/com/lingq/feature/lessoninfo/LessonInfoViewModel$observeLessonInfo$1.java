package com.lingq.feature.lessoninfo;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.domain.model.library.LessonInfo;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.lda;
import p000.ux5;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.lessoninfo.LessonInfoViewModel$observeLessonInfo$1", m4291f = "LessonInfoViewModel.kt", m4292l = {299}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonInfoViewModel$observeLessonInfo$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f26371a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2132c f26372b;

    /* JADX INFO: renamed from: com.lingq.feature.lessoninfo.LessonInfoViewModel$observeLessonInfo$1$1 */
    @c32(m4290c = "com.lingq.feature.lessoninfo.LessonInfoViewModel$observeLessonInfo$1$1", m4291f = "LessonInfoViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21261 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f26373a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2132c f26374b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21261(C2132c c2132c, Continuation continuation) {
            super(2, continuation);
            this.f26374b = c2132c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C21261 c21261 = new C21261(this.f26374b, continuation);
            c21261.f26373a = obj;
            return c21261;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C21261 c21261 = (C21261) create((LessonInfo) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c21261.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            LessonInfo lessonInfo = (LessonInfo) this.f26373a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2132c c2132c = this.f26374b;
            c2132c.f26430u.m15571i(lessonInfo);
            if (lessonInfo != null) {
                int i = lessonInfo.f19372h;
                AbstractC1263a.m7047b(lda.m16103C(c2132c), c2132c.f26428s, ux5.m22988k(i, "course_"), new LessonInfoViewModel$observeCourse$1(c2132c, i, null));
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonInfoViewModel$observeLessonInfo$1(C2132c c2132c, Continuation continuation) {
        super(1, continuation);
        this.f26372b = c2132c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LessonInfoViewModel$observeLessonInfo$1(this.f26372b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((LessonInfoViewModel$observeLessonInfo$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26371a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2132c c2132c = this.f26372b;
            c83 c83VarM7994a = c2132c.f26413d.m7994a(c2132c.f26429t.f66282a, c2132c.f26411b.mo4589b2());
            C21261 c21261 = new C21261(c2132c, null);
            this.f26371a = 1;
            if (AbstractC3224d.m15529h(c83VarM7994a, c21261, this) == coroutineSingletons) {
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
