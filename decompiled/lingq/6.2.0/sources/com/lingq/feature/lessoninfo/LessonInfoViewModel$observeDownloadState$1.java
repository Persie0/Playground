package com.lingq.feature.lessoninfo;

import com.lingq.core.domain.lesson.C1380b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.l83;
import p000.ux5;
import p000.vi3;
import p000.w05;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.lessoninfo.LessonInfoViewModel$observeDownloadState$1", m4291f = "LessonInfoViewModel.kt", m4292l = {351, 353}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonInfoViewModel$observeDownloadState$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f26362a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2132c f26363b;

    /* JADX INFO: renamed from: com.lingq.feature.lessoninfo.LessonInfoViewModel$observeDownloadState$1$1 */
    @c32(m4290c = "com.lingq.feature.lessoninfo.LessonInfoViewModel$observeDownloadState$1$1", m4291f = "LessonInfoViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21231 extends SuspendLambda implements aj3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2132c f26364a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21231(C2132c c2132c, Continuation continuation) {
            super(3, continuation);
            this.f26364a = c2132c;
        }

        @Override // p000.aj3
        public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
            C21231 c21231 = new C21231(this.f26364a, (Continuation) obj3);
            xfa xfaVar = xfa.f68157a;
            c21231.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f26364a.f26407A;
            Boolean bool = Boolean.FALSE;
            c3244l.getClass();
            c3244l.m15572j(null, bool);
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.lessoninfo.LessonInfoViewModel$observeDownloadState$1$2 */
    @c32(m4290c = "com.lingq.feature.lessoninfo.LessonInfoViewModel$observeDownloadState$1$2", m4291f = "LessonInfoViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21242 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f26365a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2132c f26366b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21242(C2132c c2132c, Continuation continuation) {
            super(2, continuation);
            this.f26366b = c2132c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C21242 c21242 = new C21242(this.f26366b, continuation);
            c21242.f26365a = obj;
            return c21242;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C21242 c21242 = (C21242) create((w05) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c21242.invokeSuspend(xfaVar);
            return xfaVar;
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0023  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean z;
            w05 w05Var = (w05) this.f26365a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2132c c2132c = this.f26366b;
            C3244l c3244l = c2132c.f26407A;
            if (w05Var.f66170a && w05Var.f66171b) {
                if (c2132c.f26412c.mo8231E0(c2132c.f26429t.f66282a)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            ux5.m22977D(z, c3244l, null);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonInfoViewModel$observeDownloadState$1(C2132c c2132c, Continuation continuation) {
        super(1, continuation);
        this.f26363b = c2132c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LessonInfoViewModel$observeDownloadState$1(this.f26363b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((LessonInfoViewModel$observeDownloadState$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
    
        if (kotlinx.coroutines.flow.AbstractC3224d.m15529h(r6, r8, r7) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26362a;
        C2132c c2132c = this.f26363b;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj);
        C1380b c1380b = c2132c.f26417h;
        String strMo4589b2 = c2132c.f26411b.mo4589b2();
        int i2 = c2132c.f26429t.f66282a;
        this.f26362a = 1;
        obj = c1380b.m7989c(i2, strMo4589b2, this);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
        l83 l83Var = new l83((c83) obj, new C21231(c2132c, null), 1);
        C21242 c21242 = new C21242(c2132c, null);
        this.f26362a = 2;
    }
}
