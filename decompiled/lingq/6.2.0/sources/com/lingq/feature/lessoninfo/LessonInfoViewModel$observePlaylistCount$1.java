package com.lingq.feature.lessoninfo;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.lessoninfo.LessonInfoViewModel$observePlaylistCount$1", m4291f = "LessonInfoViewModel.kt", m4292l = {340}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonInfoViewModel$observePlaylistCount$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f26380a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2132c f26381b;

    /* JADX INFO: renamed from: com.lingq.feature.lessoninfo.LessonInfoViewModel$observePlaylistCount$1$1 */
    @c32(m4290c = "com.lingq.feature.lessoninfo.LessonInfoViewModel$observePlaylistCount$1$1", m4291f = "LessonInfoViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21291 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ int f26382a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2132c f26383b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21291(C2132c c2132c, Continuation continuation) {
            super(2, continuation);
            this.f26383b = c2132c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C21291 c21291 = new C21291(this.f26383b, continuation);
            c21291.f26382a = ((Number) obj).intValue();
            return c21291;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C21291 c21291 = (C21291) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c21291.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.f26382a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f26383b.f26435z;
            Integer num = new Integer(i);
            c3244l.getClass();
            c3244l.m15572j(null, num);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonInfoViewModel$observePlaylistCount$1(C2132c c2132c, Continuation continuation) {
        super(1, continuation);
        this.f26381b = c2132c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LessonInfoViewModel$observePlaylistCount$1(this.f26381b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((LessonInfoViewModel$observePlaylistCount$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26380a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2132c c2132c = this.f26381b;
            c83 c83VarM23347w = c2132c.f26415f.m23347w(c2132c.f26429t.f66282a, c2132c.f26411b.mo4589b2());
            C21291 c21291 = new C21291(c2132c, null);
            this.f26380a = 1;
            if (AbstractC3224d.m15529h(c83VarM23347w, c21291, this) == coroutineSingletons) {
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
