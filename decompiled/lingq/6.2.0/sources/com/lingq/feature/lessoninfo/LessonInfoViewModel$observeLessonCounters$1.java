package com.lingq.feature.lessoninfo;

import com.lingq.core.domain.model.library.LibraryItemCounter;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.lessoninfo.LessonInfoViewModel$observeLessonCounters$1", m4291f = "LessonInfoViewModel.kt", m4292l = {314}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonInfoViewModel$observeLessonCounters$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f26367a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2132c f26368b;

    /* JADX INFO: renamed from: com.lingq.feature.lessoninfo.LessonInfoViewModel$observeLessonCounters$1$1 */
    @c32(m4290c = "com.lingq.feature.lessoninfo.LessonInfoViewModel$observeLessonCounters$1$1", m4291f = "LessonInfoViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21251 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f26369a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2132c f26370b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21251(C2132c c2132c, Continuation continuation) {
            super(2, continuation);
            this.f26370b = c2132c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C21251 c21251 = new C21251(this.f26370b, continuation);
            c21251.f26369a = obj;
            return c21251;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C21251 c21251 = (C21251) create((LibraryItemCounter) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c21251.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            LibraryItemCounter libraryItemCounter = (LibraryItemCounter) this.f26369a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f26370b.f26431v.m15571i(libraryItemCounter);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonInfoViewModel$observeLessonCounters$1(C2132c c2132c, Continuation continuation) {
        super(1, continuation);
        this.f26368b = c2132c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LessonInfoViewModel$observeLessonCounters$1(this.f26368b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((LessonInfoViewModel$observeLessonCounters$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26367a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2132c c2132c = this.f26368b;
            c83 c83VarM7992a = c2132c.f26416g.m7992a(c2132c.f26429t.f66282a, c2132c.f26411b.mo4589b2());
            C21251 c21251 = new C21251(c2132c, null);
            this.f26367a = 1;
            if (AbstractC3224d.m15529h(c83VarM7992a, c21251, this) == coroutineSingletons) {
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
