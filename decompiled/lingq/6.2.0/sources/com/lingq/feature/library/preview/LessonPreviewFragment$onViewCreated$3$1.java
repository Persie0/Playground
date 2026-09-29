package com.lingq.feature.library.preview;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c18;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.library.preview.LessonPreviewFragment$onViewCreated$3$1", m4291f = "LessonPreviewFragment.kt", m4292l = {247}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonPreviewFragment$onViewCreated$3$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26717a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonPreviewFragment f26718b;

    /* JADX INFO: renamed from: com.lingq.feature.library.preview.LessonPreviewFragment$onViewCreated$3$1$1 */
    @c32(m4290c = "com.lingq.feature.library.preview.LessonPreviewFragment$onViewCreated$3$1$1", m4291f = "LessonPreviewFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21481 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ boolean f26719a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LessonPreviewFragment f26720b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21481(LessonPreviewFragment lessonPreviewFragment, Continuation continuation) {
            super(2, continuation);
            this.f26720b = lessonPreviewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C21481 c21481 = new C21481(this.f26720b, continuation);
            c21481.f26719a = ((Boolean) obj).booleanValue();
            return c21481;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            C21481 c21481 = (C21481) create(bool, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c21481.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z = this.f26719a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            LessonPreviewFragment lessonPreviewFragment = this.f26720b;
            if (z) {
                bh4[] bh4VarArr = LessonPreviewFragment.f26702G0;
                lessonPreviewFragment.m9082h0().f68096d.m6163e();
            } else {
                bh4[] bh4VarArr2 = LessonPreviewFragment.f26702G0;
                lessonPreviewFragment.m9082h0().f68096d.m6161b();
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPreviewFragment$onViewCreated$3$1(LessonPreviewFragment lessonPreviewFragment, Continuation continuation) {
        super(2, continuation);
        this.f26718b = lessonPreviewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonPreviewFragment$onViewCreated$3$1(this.f26718b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonPreviewFragment$onViewCreated$3$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26717a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = LessonPreviewFragment.f26702G0;
            LessonPreviewFragment lessonPreviewFragment = this.f26718b;
            c18 c18Var = lessonPreviewFragment.m9083i0().f26772i;
            C21481 c21481 = new C21481(lessonPreviewFragment, null);
            c18Var.getClass();
            this.f26717a = 1;
            if (AbstractC3224d.m15529h(c18Var, c21481, this) == coroutineSingletons) {
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
