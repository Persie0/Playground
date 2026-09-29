package com.lingq.feature.lessoninfo;

import com.lingq.core.data.repository.C1302r;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.InterfaceC3055gy;
import p000.c32;
import p000.c83;
import p000.vi3;
import p000.xd7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.lessoninfo.LessonInfoViewModel$observeAudioFetchState$1", m4291f = "LessonInfoViewModel.kt", m4292l = {378}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonInfoViewModel$observeAudioFetchState$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f26353a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2132c f26354b;

    /* JADX INFO: renamed from: com.lingq.feature.lessoninfo.LessonInfoViewModel$observeAudioFetchState$1$1 */
    @c32(m4290c = "com.lingq.feature.lessoninfo.LessonInfoViewModel$observeAudioFetchState$1$1", m4291f = "LessonInfoViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21211 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f26355a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2132c f26356b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21211(C2132c c2132c, Continuation continuation) {
            super(2, continuation);
            this.f26356b = c2132c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C21211 c21211 = new C21211(this.f26356b, continuation);
            c21211.f26355a = obj;
            return c21211;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C21211 c21211 = (C21211) create((InterfaceC3055gy) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c21211.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC3055gy interfaceC3055gy = (InterfaceC3055gy) this.f26355a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f26356b.f26409C.m15571i(interfaceC3055gy);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonInfoViewModel$observeAudioFetchState$1(C2132c c2132c, Continuation continuation) {
        super(1, continuation);
        this.f26354b = c2132c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LessonInfoViewModel$observeAudioFetchState$1(this.f26354b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((LessonInfoViewModel$observeAudioFetchState$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26353a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2132c c2132c = this.f26354b;
            xd7 xd7Var = c2132c.f26427r;
            C1302r c1302r = (C1302r) xd7Var;
            c83 c83VarM7358r = c1302r.m7358r(c2132c.f26429t.f66282a, c2132c.f26411b.mo4589b2());
            C21211 c21211 = new C21211(c2132c, null);
            this.f26353a = 1;
            if (AbstractC3224d.m15529h(c83VarM7358r, c21211, this) == coroutineSingletons) {
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
