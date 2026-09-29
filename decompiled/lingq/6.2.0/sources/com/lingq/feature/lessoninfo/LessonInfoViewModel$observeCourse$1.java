package com.lingq.feature.lessoninfo;

import com.lingq.core.domain.model.library.LibraryItem;
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
@c32(m4290c = "com.lingq.feature.lessoninfo.LessonInfoViewModel$observeCourse$1", m4291f = "LessonInfoViewModel.kt", m4292l = {366}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonInfoViewModel$observeCourse$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f26357a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2132c f26358b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f26359c;

    /* JADX INFO: renamed from: com.lingq.feature.lessoninfo.LessonInfoViewModel$observeCourse$1$1 */
    @c32(m4290c = "com.lingq.feature.lessoninfo.LessonInfoViewModel$observeCourse$1$1", m4291f = "LessonInfoViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21221 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f26360a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2132c f26361b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21221(C2132c c2132c, Continuation continuation) {
            super(2, continuation);
            this.f26361b = c2132c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C21221 c21221 = new C21221(this.f26361b, continuation);
            c21221.f26360a = obj;
            return c21221;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C21221 c21221 = (C21221) create((LibraryItem) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c21221.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            LibraryItem libraryItem = (LibraryItem) this.f26360a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f26361b.f26432w.m15571i(libraryItem);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonInfoViewModel$observeCourse$1(C2132c c2132c, int i, Continuation continuation) {
        super(1, continuation);
        this.f26358b = c2132c;
        this.f26359c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LessonInfoViewModel$observeCourse$1(this.f26358b, this.f26359c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((LessonInfoViewModel$observeCourse$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26357a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2132c c2132c = this.f26358b;
            c83 c83VarM8004a = c2132c.f26420k.m8004a(this.f26359c, c2132c.f26411b.mo4589b2());
            C21221 c21221 = new C21221(c2132c, null);
            this.f26357a = 1;
            if (AbstractC3224d.m15529h(c83VarM8004a, c21221, this) == coroutineSingletons) {
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
