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
@c32(m4290c = "com.lingq.feature.library.preview.LessonPreviewFragment$onViewCreated$3$3", m4291f = "LessonPreviewFragment.kt", m4292l = {247}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonPreviewFragment$onViewCreated$3$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26725a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonPreviewFragment f26726b;

    /* JADX INFO: renamed from: com.lingq.feature.library.preview.LessonPreviewFragment$onViewCreated$3$3$1 */
    @c32(m4290c = "com.lingq.feature.library.preview.LessonPreviewFragment$onViewCreated$3$3$1", m4291f = "LessonPreviewFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21501 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ boolean f26727a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LessonPreviewFragment f26728b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21501(LessonPreviewFragment lessonPreviewFragment, Continuation continuation) {
            super(2, continuation);
            this.f26728b = lessonPreviewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C21501 c21501 = new C21501(this.f26728b, continuation);
            c21501.f26727a = ((Boolean) obj).booleanValue();
            return c21501;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            C21501 c21501 = (C21501) create(bool, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c21501.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z = this.f26727a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            LessonPreviewFragment lessonPreviewFragment = this.f26728b;
            if (z) {
                bh4[] bh4VarArr = LessonPreviewFragment.f26702G0;
                lessonPreviewFragment.m9082h0().f68093a.setEnabled(false);
                lessonPreviewFragment.m9082h0().f68096d.m6163e();
            } else {
                bh4[] bh4VarArr2 = LessonPreviewFragment.f26702G0;
                lessonPreviewFragment.m9082h0().f68093a.setEnabled(true);
                lessonPreviewFragment.m9082h0().f68096d.m6161b();
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPreviewFragment$onViewCreated$3$3(LessonPreviewFragment lessonPreviewFragment, Continuation continuation) {
        super(2, continuation);
        this.f26726b = lessonPreviewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonPreviewFragment$onViewCreated$3$3(this.f26726b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonPreviewFragment$onViewCreated$3$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26725a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = LessonPreviewFragment.f26702G0;
            LessonPreviewFragment lessonPreviewFragment = this.f26726b;
            c18 c18Var = lessonPreviewFragment.m9083i0().f26774k;
            C21501 c21501 = new C21501(lessonPreviewFragment, null);
            c18Var.getClass();
            this.f26725a = 1;
            if (AbstractC3224d.m15529h(c18Var, c21501, this) == coroutineSingletons) {
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
